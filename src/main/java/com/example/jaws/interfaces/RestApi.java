package com.example.jaws.interfaces;

import com.example.jaws.application.Jaws;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
  private Jaws jaws;

  @Autowired
  public RestApi(Jaws jaws) {
    this.jaws = jaws;
  }

  @GetMapping("/api/echo")
  @ResponseBody
  public String echo(@RequestParam("word") String word) {
    return String.format("%s, %s, %s ...", word, word, word);
  }
}
