package com.mapper;

import com.mapper.pojo.Destination;
import com.mapper.pojo.Source;
import com.mapper.pojo.SourceNested;
import com.mapper.pojo.SourceNested2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MapstructMapperApplication {

	public static void main(String[] args) {

		SpringApplication.run(MapstructMapperApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			Source s=new Source();
			s.setAlone("individualSource");

			SourceNested s1=new SourceNested();
			s1.setS(1);
			s1.setSoirceNested("source-nested1");

			SourceNested2 s2=new SourceNested2();
			s2.setS2(2);
			s2.setSoirceNested2("source-nested2");

			s.setAccounts(Arrays.asList(s1));
			s.setAccounts2(Arrays.asList(s2));

			MapperService mapper=ctx.getBean(MapperService.class);
			Destination d=mapper.mapSourceTOdestination(s);

			System.out.println(d);
			System.out.println(d.getAccountsDest().get(0).getD1());
			/*String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}*/

		};
	}

}
