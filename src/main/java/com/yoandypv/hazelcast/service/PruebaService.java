package com.yoandypv.hazelcast.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@CacheConfig(cacheNames = "map")
public class PruebaService {

    @Cacheable(value = "map")
    public String getData(String key) {
        return generateUUID(key).toString();
    }

    public UUID generateUUID(String key){
        System.out.println("Generando cache para " + key);
        return UUID.randomUUID();
    }

}
