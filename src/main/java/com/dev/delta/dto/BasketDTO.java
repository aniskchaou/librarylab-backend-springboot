package com.dev.delta.dto;

import com.dev.delta.entities.Basket;
import com.dev.delta.entities.Vendor;
import com.dev.delta.repositories.BasketRepository;
import com.dev.delta.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class BasketDTO implements DTO {

    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private VendorRepository vendorRepository;

    private static final String[] INTERNAL_NOTES = {
            "Internal note for basket 1.",
            "Review items for accuracy.",
            "Verify vendor details.",
            "Check for item availability.",
            "Ensure correct delivery address."
    };

    private static final String[] VENDOR_NOTES = {
            "Please confirm delivery date.",
            "Vendor contact number is required.",
            "Additional items may be included.",
            "Discounts applied as per agreement.",
            "Confirm receipt of payment."
    };

    @Override
    public void populate() {
        List<Vendor> vendors = vendorRepository.findAll();

        if (vendors.isEmpty()) {
            throw new RuntimeException("No vendors found to associate with baskets.");
        }

        for (int i = 1; i <= 15; i++) {
            Basket basket = new Basket();
            basket.setBasketName("Basket " + i);
            basket.setBillingPlace("Billing Place " + i);
            basket.setDeliveryPlace("Delivery Place " + i);
            basket.setVendor(randomVendor(vendors));
            basket.setInternalNote(randomElement(INTERNAL_NOTES));
            basket.setVendorNote(randomElement(VENDOR_NOTES));
            basket.setCreateItemsWhen(generateRandomDate());

            basketRepository.save(basket);
        }
    }

    private Vendor randomVendor(List<Vendor> vendors) {
        Random random = new Random();
        return vendors.get(random.nextInt(vendors.size()));
    }

    private Date generateRandomDate() {
        Random random = new Random();
        long currentTime = System.currentTimeMillis();
        long randomTime = currentTime - (long) (random.nextDouble() * 1000000000L); // Random date in the past 30 days
        return new Date(randomTime);
    }

    private String randomElement(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}

