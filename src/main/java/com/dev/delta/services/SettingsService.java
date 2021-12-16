package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Settings;
import com.dev.delta.repositories.SettingsRepository;

@Service
public class SettingsService {
	@Autowired
	SettingsRepository settingsRepository;

	public Settings saveOrUpdate(Settings settings) {

		return settingsRepository.save(settings);
	}

	public Iterable<Settings> findAll() {
		return settingsRepository.findAll();
	}

	public Settings findById(Long id) {
		return settingsRepository.findById(id).orElseThrow();
	}

	public void delete(Long id) {
		Settings settings = findById(id);
		settingsRepository.delete(settings);
	}
}
