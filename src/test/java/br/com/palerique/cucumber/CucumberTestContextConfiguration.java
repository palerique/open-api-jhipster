package br.com.palerique.cucumber;

import br.com.palerique.OpenApiJhipsterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = OpenApiJhipsterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
