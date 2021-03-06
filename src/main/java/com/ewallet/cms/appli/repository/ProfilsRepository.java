package com.ewallet.cms.appli.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ewallet.cms.appli.bean.Profils;

public interface ProfilsRepository extends CrudRepository<Profils, String>{

	List<Profils> findByAdministrateursId(String administrateursId);
}
