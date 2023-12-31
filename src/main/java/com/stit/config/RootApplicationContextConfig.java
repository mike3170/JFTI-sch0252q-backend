package com.stit.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
//@ComponentScan("com.stit")
public class RootApplicationContextConfig {

   @Bean
   public DataSource dataSource() {
     HikariConfig hikariConfig = new HikariConfig();
    hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");//--ORACLE DRIVER
    //hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
    //hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");//--MySQL DRIVER
  
    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@jftierp.mold-tw.com.tw:1521/jftierpdb");//--吉立登客戶端的資料 :dashboard用 打包用
//    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.60:1521:jftidb");//--吉立登客戶端的資料 :dashboard用 打包用

    
    //------------------------------------------DEMO自動控制客戶端
    //hikariConfig.setUsername("ERPmysql");
    //hikariConfig.setPassword("hiti27865409");
    
    //hikariConfig.setUsername("USERCONNECT");
    //hikariConfig.setPassword("hiti27865409");
    
    //------------------------------------------本地MYSQL:ScrewModmatDEMO用
    //hikariConfig.setUsername("root");
    //hikariConfig.setPassword("3y59L20201209");
    //hikariConfig.setPassword("123456");
    
    //------------------------------------------吉立登:本作為測試圖表dashboard用
//    hikariConfig.setUsername("jlderp");
//    hikariConfig.setPassword("jlderp");
    
    //------------------------------------------吉立登:本作為測試圖表dashboard用
    hikariConfig.setUsername("jftierp");
    hikariConfig.setPassword("jftierp");
    
    //------------------------------------------全良:本作為測試圖表dashboard用
    //hikariConfig.setUsername("cl");
    //hikariConfig.setPassword("cl");
    
    //------------------------------------------全雄:本作為測試圖表
//    hikariConfig.setUsername("chferp");
//    hikariConfig.setPassword("chferp");
    
    //------------------------------------------CPC:取(冠誠) CPCDB 公司端的資料 :ScrewModmat用
    //hikariConfig.setUsername("cpcerp");
    //hikariConfig.setPassword("cpcerp");
    
    //------------------------------------------陳老師上課用範例
    //hikariConfig.setUsername("chuerp");
    //hikariConfig.setPassword("chuerp");
    
    //這一段的作用?
    hikariConfig.setMaximumPoolSize(5);
    hikariConfig.setConnectionTestQuery("SELECT 1 from dual");
    hikariConfig.setPoolName("springHikariCP");

    HikariDataSource dataSource = new HikariDataSource(hikariConfig);
    return dataSource;
   }
  
   @Bean 
	 public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
      return new NamedParameterJdbcTemplate(dataSource());
   }

   @Bean 
	 public JdbcTemplate getJdbcTemplate() {
      return new JdbcTemplate(dataSource());
   }

}
