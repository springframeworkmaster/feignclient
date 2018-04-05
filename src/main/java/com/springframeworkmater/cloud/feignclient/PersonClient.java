package com.springframeworkmater.cloud.feignclient;

import com.springframeworkmater.cloud.feignclient.domains.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@FeignClient(name="swagger-ui",url="localhost:5555")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET, value = "api/persons")
    List<Person> findAll();
}
