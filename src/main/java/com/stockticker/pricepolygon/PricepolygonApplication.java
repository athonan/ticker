package com.stockticker.pricepolygon;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

// Factory;

@SpringBootApplication
public class PricepolygonApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(PricepolygonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PricepolygonApplication.class, args);
	}



	@RestController
	public class RestSpringBootController {

		@RequestMapping("/price")
		public List<Object> price(@RequestParam String ticker1){

			String strup = ticker1.toUpperCase();

			String url ="https://api.polygon.io/v2/aggs/ticker/"+strup+"/range/1/day/2022-09-23/2022-09-23?adjusted=true&sort=asc&limit=120&apiKey=Eongy4cBSd5Oqx8TtE1_lqQeARozcSlA";
			RestTemplate restTemplate = new RestTemplate();


			Stock prices = restTemplate.getForObject(url, Stock.class);
			log.info(prices.toString());
			return Arrays.asList(prices);

		}
	}
}
