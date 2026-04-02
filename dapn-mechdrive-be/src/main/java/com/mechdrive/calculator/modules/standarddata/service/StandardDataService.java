package com.mechdrive.calculator.modules.standarddata.service;

import com.mechdrive.calculator.modules.standarddata.dto.StandardDataItemResponse;
import com.mechdrive.calculator.modules.standarddata.dto.UpsertStandardDataRequest;
import com.mechdrive.calculator.modules.standarddata.dto.UpsertStandardDataResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

@Service
public class StandardDataService {

    private final Map<String, StandardDataItemResponse> dataStore = new ConcurrentHashMap<>();

    public List<StandardDataItemResponse> getAll() {
        return new ArrayList<>(dataStore.values());
    }

    public UpsertStandardDataResponse upsert(UpsertStandardDataRequest request) {
        var item = new StandardDataItemResponse(request.getCode(), request.getName(), request.getMetadata());
        var existed = dataStore.put(request.getCode(), item) != null;

        return new UpsertStandardDataResponse(existed ? "Updated successfully" : "Created successfully", item);
    }
}
