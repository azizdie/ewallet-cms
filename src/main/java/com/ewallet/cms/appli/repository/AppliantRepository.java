package com.ewallet.cms.appli.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.ewallet.cms.appli.bean.Appliant;

public interface AppliantRepository extends CrudRepository<Appliant, BigInteger> {

}
