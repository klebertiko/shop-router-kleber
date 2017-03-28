package br.com.kleber.shop.router;

import br.com.kleber.shop.router.filters.pre.PreFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ShopRouterKleberApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ShopRouterKleberApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ShopRouterKleberApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		LOGGER.info("Initializing pre filter...");
		return new PreFilter();
	}
}
