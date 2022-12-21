package com.example.testswagger.cont;

import domain.DemoResponse;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Reader", description = "For reading operations")
public class ReadController {

    @GetMapping("/check")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiResponse(responseCode = "202", description = "Random description")
    public String show() {
        return "show me";
    }

    @GetMapping("/print/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Print output", description = "This method only prints out the input")
    public String getInput(@Parameter(name = "name") @PathVariable String id) {
        return "show me:" + id;
    }


    @GetMapping("/return")
    @Operation(summary = "Return Object", description = "This method only prints out the input")
    public DemoResponse getResponse() {
        return new DemoResponse("test", 12);
    }


    @GetMapping("/hide")
    @ResponseStatus(HttpStatus.OK)
    @Hidden
    public String showHideOutput() {
        return "dont show doc output";
    }
}
