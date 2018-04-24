package com.ewallet.cms.appli.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.ewallet.cms.appli.bean.Application;

public interface ApplicationRepository extends CrudRepository<Application, BigInteger> {

}
