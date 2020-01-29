package com.logging.logs.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.sql.*;

@Configuration
@ComponentScan
public class Logs {

    //@Bean
    public Boolean writeLog(String message, String source, String logLevel){
        Boolean written = false;

        String query = "INSERT INTO LOGS (MESSAGE,SOURCE,LOG_LEVEL) VALUES (" + message + "," + source + "," + logLevel + ")";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            if (rs.next()) {

                System.out.println(rs.getString(1));
                written = true;
            }

        } catch (SQLException ex) {

        }

        return written;
    }

}
