package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Settings;
import com.dev.delta.repositories.SettingsRepository;
/**
 * SettingsService
 * @author Admin
 *
 */
@Service
public class SettingsService {
	
	/**
	 * SettingsRepository
	 */
	@Autowired
	SettingsRepository settingsRepository;

	/**
	 * saveOrUpdate
	 * @param settings
	 * @return
	 */
	public Settings saveOrUpdate(Settings settings) {
		return settingsRepository.save(settings);
	}

	/**
	 * findAll
	 * @return
	 */
	public Iterable<Settings> findAll() {
		return settingsRepository.findAll();
	}

	/**
	 * findById
	 * @param id
	 * @return
	 */
	public Settings findById(Long id) {
		return settingsRepository.findById(id).orElseThrow();
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		Settings settings = findById(id);
		settingsRepository.delete(settings);
	}
	
	/**
	 * changeLang
	 * @param lang
	 * @return
	 */
	public boolean changeLang(String lang)
	{
		settingsRepository.updateSettingsByLang(lang);
		return true;
	}
}
