package com.gn.setting.configuration.database;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gn.setting.configuration.WebInitializerListener;

/**
 * @Class ContextDataBase.java
 *	@Description ContextDataBase
 * <pre>
 *
 *      수정일                  수정자                   수정내용
 * --------------  -------     ---------------------
 *  2019. 8. 8.          hgb             최초작성
 *
 * </pre>
 * @author hgb
 * @version 0.0  
 * @see
 *
 */
@Configuration 
@EnableTransactionManagement
public class ContextDataBase {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ContextDataBase.class);
	
	ContextDataBase(){
		LOGGER.info("================ ContextDataBase Load ================");
	}

	@Bean(destroyMethod="close")//destroyMethod는 어플리케이션 컨텍스트가 종료 되었을때 close() 해줌
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://test.cafe24.com:3306/test?serverTimezone=UTC&useSSL=false");
		dataSource.setUsername("test");
		dataSource.setPassword("1234567!@");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
	}

	/**
	 * <pre>
	 * 1. 개요 : 트랜잭션 등록
	 * 2. 처리내용 :
	 * </pre>
	 *	@since 2019. 8. 8.
	 * @return
	 */
	@Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }





}
