package com.yoandypv.hazelcast.cache;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    public Config hazelCastConfig() {

        Config config = new Config();
        config.setInstanceName("hazelcast-cache");
        config.setProperty("hazelcast.rest.enabled", "true");

        MapConfig allUsersCache = new MapConfig();

        allUsersCache.setTimeToLiveSeconds(10);
        allUsersCache.setEvictionPolicy(EvictionPolicy.LFU);
        config.getMapConfigs().put("map",allUsersCache);


        return config;
    }
}
