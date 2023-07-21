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
    
    //hikariConfig.setJdbcUrl("jdbc:mysql://60.248.247.197:1262/mysqlerp?serverTimezone=UTC");//--DEMO�۰ʱ���Ȥ��
    //hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/mysqlerp?serverTimezone=UTC");//--DEMO�۰ʱ���Ȥ��
    //hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/t_database?serverTimezone=UTC");//--���aMYSQL:ScrewModmatDEMO��
    
    //hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/Stit_Database?serverTimezone=UTC");//--���aMYSQL:ScrewModmatDEMO��
    
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.50:1526:chfdb");//--����:���@�����չϪ�
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.50:1526:cpcdb");//--CPC:��(�a��) CPCDB ���q�ݪ���� :ScrewModmat��
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.50:1526:chudb");//--���Ѯv�W�ҥνd��
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1522:scorpio");//--���Ѯvprivate
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.50:1526:D11U");//--��}���q�ݪ���� :dashboard��
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@220.134.223.125:1521:chferpdb");//--�����Ȥ�ݪ���� :dashboard�� �}�o��
    //hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.6:1521:chferpdb");//--�����Ȥ�ݪ���� :dashboard�� ���]��
    
//    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@211.75.151.31:1521:jlderpdb");//--�N�ߵn�Ȥ�ݪ���� :dashboard�� �}�o��
//    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@jlderp.jldfasteners.com.tw:1521:jlderpdb");//--�N�ߵn�Ȥ�ݪ���� :dashboard�� ���]��

//    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@jftierp.mold-tw.com.tw:1521/jftierpdb");//--�N�ߵn�Ȥ�ݪ���� :dashboard�� ���]��
    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.60:1521:jftidb");//--�N�ߵn�Ȥ�ݪ���� :dashboard�� ���]��

    
    //------------------------------------------DEMO�۰ʱ���Ȥ��
    //hikariConfig.setUsername("ERPmysql");
    //hikariConfig.setPassword("hiti27865409");
    
    //hikariConfig.setUsername("USERCONNECT");
    //hikariConfig.setPassword("hiti27865409");
    
    //------------------------------------------���aMYSQL:ScrewModmatDEMO��
    //hikariConfig.setUsername("root");
    //hikariConfig.setPassword("3y59L20201209");
    //hikariConfig.setPassword("123456");
    
    //------------------------------------------�N�ߵn:���@�����չϪ�dashboard��
//    hikariConfig.setUsername("jlderp");
//    hikariConfig.setPassword("jlderp");
    
    //------------------------------------------�N�ߵn:���@�����չϪ�dashboard��
    hikariConfig.setUsername("jftierp");
    hikariConfig.setPassword("jftierp");
    
    //------------------------------------------���}:���@�����չϪ�dashboard��
    //hikariConfig.setUsername("cl");
    //hikariConfig.setPassword("cl");
    
    //------------------------------------------����:���@�����չϪ�
//    hikariConfig.setUsername("chferp");
//    hikariConfig.setPassword("chferp");
    
    //------------------------------------------CPC:��(�a��) CPCDB ���q�ݪ���� :ScrewModmat��
    //hikariConfig.setUsername("cpcerp");
    //hikariConfig.setPassword("cpcerp");
    
    //------------------------------------------���Ѯv�W�ҥνd��
    //hikariConfig.setUsername("chuerp");
    //hikariConfig.setPassword("chuerp");
    
    //�o�@�q���@��?
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
