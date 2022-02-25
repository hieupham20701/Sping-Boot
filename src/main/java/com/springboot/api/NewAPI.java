package com.springboot.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.NewDTO;

@RestController// = @Controller + @ResponBody
public class NewAPI {
	  @PostMapping("/new") //@RequestMapping + Method
	  
      public NewDTO createNew(@RequestBody NewDTO model) {

              return model;

      }

	  @PutMapping
	  public NewDTO updateNew(@RequestBody NewDTO model) {
		  return model;
	  }
}

