package api.pravas.controller;

import api.pravas.handlers.TripHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripResource {

    private static final Logger logger = LoggerFactory.getLogger(TripResource.class);

    @GetMapping("/hello")
    public String HelloWorld(@RequestParam String name){
        return "Hello world " + name;
    }

    @PostMapping("/postHello")
    public ResponseEntity postHello(@RequestBody TripHandler tripHandler){
        logger.info("post Hello {} ", tripHandler.getUserDetails().size());
        return ResponseEntity.ok(tripHandler);

    }
}
