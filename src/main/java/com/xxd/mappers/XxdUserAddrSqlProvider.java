package com.xxd.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xxd.models.XxdUserAddr;

public class XxdUserAddrSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_user_addr
     *
     * @mbggenerated
     */
    public String insertSelective(XxdUserAddr record) {
        BEGIN();
        INSERT_INTO("xxd_user_addr");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            VALUES("telephone", "#{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddr() != null) {
            VALUES("addr", "#{addr,jdbcType=VARCHAR}");
        }
        
        if (record.getAddrDetails() != null) {
            VALUES("addr_details", "#{addrDetails,jdbcType=VARCHAR}");
        }
        
        if (record.getTags() != null) {
            VALUES("tags", "#{tags,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getIsFirst() != null) {
            VALUES("is_first", "#{isFirst,jdbcType=SMALLINT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_user_addr
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdUserAddr record) {
        BEGIN();
        UPDATE("xxd_user_addr");
        
        if (record.getPhone() != null) {
            SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            SET("telephone = #{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddr() != null) {
            SET("addr = #{addr,jdbcType=VARCHAR}");
        }
        
        if (record.getAddrDetails() != null) {
            SET("addr_details = #{addrDetails,jdbcType=VARCHAR}");
        }
        
        if (record.getTags() != null) {
            SET("tags = #{tags,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getIsFirst() != null) {
            SET("is_first = #{isFirst,jdbcType=SMALLINT}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}