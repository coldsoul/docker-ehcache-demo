package demo.config;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

	@Bean
	public HazelcastInstance hazelcastInstance(Config mainConfig) {
		return Hazelcast.newHazelcastInstance(mainConfig);
	}
}
