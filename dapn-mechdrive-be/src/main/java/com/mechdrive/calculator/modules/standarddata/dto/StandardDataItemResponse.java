package com.mechdrive.calculator.modules.standarddata.dto;

import java.util.Map;

public record StandardDataItemResponse(String code, String name, Map<String, Object> metadata) {
}
