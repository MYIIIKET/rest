package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BaseController {
    @GetMapping(value="/greeting")
    public ResponseEntity<String> getAllArticles() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
}
