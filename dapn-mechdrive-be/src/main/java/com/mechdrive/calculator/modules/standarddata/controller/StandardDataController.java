package com.mechdrive.calculator.modules.standarddata.controller;

import com.mechdrive.calculator.modules.standarddata.dto.StandardDataItemResponse;
import com.mechdrive.calculator.modules.standarddata.dto.UpsertStandardDataRequest;
import com.mechdrive.calculator.modules.standarddata.dto.UpsertStandardDataResponse;
import com.mechdrive.calculator.modules.standarddata.service.StandardDataService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/standard-data")
public class StandardDataController {

    private final StandardDataService standardDataService;

    public StandardDataController(StandardDataService standardDataService) {
        this.standardDataService = standardDataService;
    }

    @GetMapping
    public List<StandardDataItemResponse> getAll() {
        return standardDataService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UpsertStandardDataResponse upsert(@Valid @RequestBody UpsertStandardDataRequest request) {
        return standardDataService.upsert(request);
    }
}
