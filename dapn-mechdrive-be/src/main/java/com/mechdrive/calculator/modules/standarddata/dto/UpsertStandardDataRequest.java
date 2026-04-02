package com.mechdrive.calculator.modules.standarddata.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.Map;

public class UpsertStandardDataRequest {

    @NotBlank(message = "code is required")
    private String code;

    @NotBlank(message = "name is required")
    private String name;

    private Map<String, Object> metadata;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
