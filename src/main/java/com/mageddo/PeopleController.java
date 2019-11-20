package com.mageddo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
class PeopleController {

    @Get("/people/id-{personId}")
    String m1(int personId) {
          return "m1";
    }

    @Get("/people/{personName}")
    String m2(String personName) {
          return "m2";
    }
}