package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	
	/*@Bean
	public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() throws NoSuchAlgorithmException {
	    DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
	    System.setProperty("javax.net.ssl.keyStore", "src/main/resources/zuulCert.jks");
	    System.setProperty("javax.net.ssl.keyStorePassword", "password");
	    System.setProperty("javax.net.ssl.trustStore", "src/main/resources/zuulCert.jks");
	    System.setProperty("javax.net.ssl.trustStorePassword", "password");
	    EurekaJerseyClientBuilder builder = new EurekaJerseyClientBuilder();
	    builder.withClientName("reservation");
	    builder.withSystemSSLConfiguration();
	    builder.withMaxTotalConnections(10);
	    builder.withMaxConnectionsPerHost(10);
	    args.setEurekaJerseyClient(builder.build());
	    return args;
	}*/
		
	 @Bean
	 public RestTemplate template() throws Exception{
		 RestTemplate template = new RestTemplate();
		 return template;
	 }
	
	 @Bean
		public FilterService simpleFilter() {
			return new FilterService();
		}
	 
	@Bean
    public FilterRegistrationBean corsFilterRegistration() {
        FilterRegistrationBean registrationBean =
                new FilterRegistrationBean(new CORSFilter());
        registrationBean.setName("CORS Filter");
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
	}
	
	

}
