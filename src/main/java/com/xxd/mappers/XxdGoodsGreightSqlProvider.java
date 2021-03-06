package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdGoodsGreight;

public class XxdGoodsGreightSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_greight
     *
     * @mbggenerated
     */
    public String insertSelective(XxdGoodsGreight record) {
        BEGIN();
        INSERT_INTO("xxd_goods_greight");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getArea() != null) {
            VALUES("area", "#{area,jdbcType=VARCHAR}");
        }
        
        if (record.getAreaType() != null) {
            VALUES("area_type", "#{areaType,jdbcType=SMALLINT}");
        }
        
        if (record.getValuationType() != null) {
            VALUES("valuation_type", "#{valuationType,jdbcType=SMALLINT}");
        }
        
        if (record.getBasicValuationPrice() != null) {
            VALUES("basic_valuation_price", "#{basicValuationPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getBasicValuationArea() != null) {
            VALUES("basic_valuation_area", "#{basicValuationArea,jdbcType=SMALLINT}");
        }
        
        if (record.getOverBasicValuationPrice() != null) {
            VALUES("over_basic_valuation_price", "#{overBasicValuationPrice,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_greight
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdGoodsGreight record) {
        BEGIN();
        UPDATE("xxd_goods_greight");
        
        if (record.getGoodsId() != null) {
            SET("goods_id = #{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getArea() != null) {
            SET("area = #{area,jdbcType=VARCHAR}");
        }
        
        if (record.getAreaType() != null) {
            SET("area_type = #{areaType,jdbcType=SMALLINT}");
        }
        
        if (record.getValuationType() != null) {
            SET("valuation_type = #{valuationType,jdbcType=SMALLINT}");
        }
        
        if (record.getBasicValuationPrice() != null) {
            SET("basic_valuation_price = #{basicValuationPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getBasicValuationArea() != null) {
            SET("basic_valuation_area = #{basicValuationArea,jdbcType=SMALLINT}");
        }
        
        if (record.getOverBasicValuationPrice() != null) {
            SET("over_basic_valuation_price = #{overBasicValuationPrice,jdbcType=DECIMAL}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}