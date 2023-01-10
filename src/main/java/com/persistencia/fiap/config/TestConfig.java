package com.persistencia.fiap.config;

import java.util.Arrays;

import com.persistencia.fiap.entities.Unity;
import com.persistencia.fiap.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public void run(String... args) throws Exception {

		Unity s1 = new Unity(null, "Unidade Paulista", "Rua Leopoldo Miguez, 327 - Cambuci, São Paulo | SP - Cep: 01518-020", "2ª a 6ª, das 09 às 20h.", "(11) 95464-5514", "barbeariaFiapPaulista@gmail.com");
		Unity s2 = new Unity(null, "Unidade Oz", "Av. Pref. Dr. Hirant Sanazar, 625 - Osasco | SP Cep: 06030-095", "2ª a 6ª, das 08 às 14h.", "(11) 95554-5454", "barbeariaFiapOz@gmail.com");
		Unity s3 = new Unity(null, "Unidade Alphaville", "Estrada da Aldeinha, 525 - Alphaville - Barueri | SP - Cep: 06465-100", "2ª a 6ª, das 08 às 18h.", "(11) 94654-5468", "barbeariaFiapAlpha@gmail.com");

		serviceRepository.saveAll(Arrays.asList(s1, s2, s3));

	}
}
