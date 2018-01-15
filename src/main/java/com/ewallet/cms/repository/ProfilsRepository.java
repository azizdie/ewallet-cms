package com.ewallet.cms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ewallet.cms.beans.Profils;

public interface ProfilsRepository extends CrudRepository<Profils, String>{

	List<Profils> findByAdministrateursId(String administrateursId);
}
