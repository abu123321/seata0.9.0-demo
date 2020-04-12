package com.abu.storage.api;

import com.abu.storage.pojo.Storage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface StorageApi {
    @PostMapping("storage/insert")
    public void save(@RequestBody Storage storage);
}
