package org.pedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicioPedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioPedidoApplication.class, args);
	}

}
