package com.spring.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(value="com.spring.batch")
public class BatchApp {
//	implements AsyncConfigurer  {


	public static void main(String[] args) {
		
		SpringApplication.run(BatchApp.class, args);

	}
	
//	@Bean
//	public SchedulerFactoryBean schedulerFactory(ApplicationContext applicationContext, 
//		DataSource dataSource, Executor taskExecutor) {
//		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
//		schedulerFactoryBean.setDataSource(dataSource);
//	//	schedulerFactoryBean.setConfigLocation(properties.getConfigLocation());
//		schedulerFactoryBean.setTaskExecutor(taskExecutor);
//		schedulerFactoryBean.setJobFactory(new AutowireCapableBeanJobFactory(applicationContext.getAutowireCapableBeanFactory()));
//		schedulerFactoryBean.setApplicationContextSchedulerContextKey("applicationContext");
//		return schedulerFactoryBean;
//	}
//	
//
//	@Override
//	@Bean(name = "taskExecutor")
//	public Executor getAsyncExecutor() {
//		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//		executor.setCorePoolSize(5);
//		executor.setMaxPoolSize(6);
//		executor.setQueueCapacity(100);
//		executor.setThreadNamePrefix("email-");
//		return executor;
//	}
//
//	@Override
//	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//		return new SimpleAsyncUncaughtExceptionHandler();
//	}
//	
//	
//	
//	@Bean
//	public DataSource setDataSource() {
//		
//		
//		retur;
//		
//	}

}
