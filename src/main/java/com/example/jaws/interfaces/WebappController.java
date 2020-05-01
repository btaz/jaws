package com.example.jaws.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebappController {

  /**
   * /p/** is an example content path, it could e.g. be /pages/**
   * @return A string representing the initial web page
   */
  @GetMapping(value = {"/", "/p/**"})
  public String index() {
    return "index";
  }
}
