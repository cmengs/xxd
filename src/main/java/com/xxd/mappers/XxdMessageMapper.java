package com.xxd.mappers;

import com.xxd.models.XxdMessage;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_message
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_message
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_message (id, title, ",
        "time, content, type, ",
        "is_read, uid)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, #{type,jdbcType=SMALLINT}, ",
        "#{isRead,jdbcType=SMALLINT}, #{uid,jdbcType=INTEGER})"
    })
    int insert(XxdMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_message
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdMessageSqlProvider.class, method="insertSelective")
    int insertSelective(XxdMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_message
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, title, time, content, type, is_read, uid",
        "from xxd_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_read", property="isRead", jdbcType=JdbcType.SMALLINT),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER)
    })
    XxdMessage selectByPrimaryKey(Integer id);
    
    @Select({
        "select",
        "id, title, time, content, type, is_read, uid",
        "from xxd_message"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_read", property="isRead", jdbcType=JdbcType.SMALLINT),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER)
    })
    ArrayList<XxdMessage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_message
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_message
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_message",
        "set title = #{title,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=SMALLINT},",
          "is_read = #{isRead,jdbcType=SMALLINT},",
          "uid = #{uid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdMessage record);
}