package ml.mlazic.infinityeyes.controllers;

import ml.mlazic.infinityeyes.services.CountingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * CountingController.java
 * Purpose: Routes API calls.
 *
 * @author Marko Lazic
 * @version 1.0 4/19/18
 */
@RestController
public class CountingController {

    @Autowired
    private CountingService countingService;

    @PostMapping("/counter")
    public ResponseEntity<String> count(@RequestBody String text) {
        String countNumber = Integer.toString(countingService.count(text));
        return new ResponseEntity<String>(countNumber, HttpStatus.MULTI_STATUS.OK);
    }

    @RequestMapping("/counter")
    public String retrieveCount(@RequestParam(name = "text", required = false, defaultValue = "") String text) {
        return Integer.toString(countingService.count(text));
    }
}
