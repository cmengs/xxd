package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdPicture;

public class XxdPictureSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_picture
     *
     * @mbggenerated
     */
    public String insertSelective(XxdPicture record) {
        BEGIN();
        INSERT_INTO("xxd_picture");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getSaveDir() != null) {
            VALUES("save_dir", "#{saveDir,jdbcType=VARCHAR}");
        }
        
        if (record.getPictureName() != null) {
            VALUES("picture_name", "#{pictureName,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_picture
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdPicture record) {
        BEGIN();
        UPDATE("xxd_picture");
        
        if (record.getSaveDir() != null) {
            SET("save_dir = #{saveDir,jdbcType=VARCHAR}");
        }
        
        if (record.getPictureName() != null) {
            SET("picture_name = #{pictureName,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}