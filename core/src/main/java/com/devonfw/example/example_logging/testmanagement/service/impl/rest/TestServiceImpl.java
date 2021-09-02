package com.devonfw.example.example_logging.testmanagement.service.impl.rest;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.devonfw.example.example_logging.testmanagement.service.api.rest.TestRestService;

@Named("TestRestService")
public class TestServiceImpl implements TestRestService {

  private static final Logger LOG = LoggerFactory.getLogger(TestServiceImpl.class);

  @Override
  public String sayHello() {

    LOG.info("In sayHello Method...");
    return "Hello World";
  }

}
