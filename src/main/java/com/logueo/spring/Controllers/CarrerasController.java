package com.logueo.spring.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carrera")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CarrerasController {
}
