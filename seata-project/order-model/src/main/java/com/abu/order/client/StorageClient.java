package com.abu.order.client;

import com.abu.storage.api.StorageApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("storage-model")
public interface StorageClient extends StorageApi {
}
