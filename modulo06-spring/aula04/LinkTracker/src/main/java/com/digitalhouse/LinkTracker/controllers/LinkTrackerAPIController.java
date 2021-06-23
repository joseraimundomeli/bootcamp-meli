package com.digitalhouse.LinkTracker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LinkTrackerAPIController {

    @PostMapping("/link/{linkId}")
    public ResponseEntity<?> createLink(){

        return null;
    }
}
