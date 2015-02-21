package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by John on 2/21/2015.
 */
@Component("offersDao")
public class OffersDAO {

    private JdbcTemplate jdbc;

    @Autowired
    public void setDatSource(DataSource jdbc) {
        this.jdbc = new JdbcTemplate(jdbc);
    }

    public List<Offer> getOffers() {
        return jdbc.query("select * from offers", new org.springframework.jdbc.core.RowMapper<Offer>() {
            @Override
            public Offer mapRow(ResultSet resultSet, int i) throws SQLException {
                Offer offer = new Offer();
                offer.setId(resultSet.getInt("id"));
                offer.setName(resultSet.getString("name"));
                offer.setEmail(resultSet.getString("email"));
                offer.setText(resultSet.getString("text"));
                return offer;
            }
        });
    }

}
