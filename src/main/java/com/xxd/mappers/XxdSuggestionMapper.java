package com.xxd.mappers;

import com.xxd.models.XxdFeedBack;
import com.xxd.models.XxdSuggestion;

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

public interface XxdSuggestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_suggestion
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_suggestion",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_suggestion
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_suggestion (id, time, ",
        "content, save_dir, ",
        "is_read, uid, type)",
        "values (#{id,jdbcType=INTEGER}, #{time,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{saveDir,jdbcType=VARCHAR}, ",
        "#{isRead,jdbcType=SMALLINT}, #{uid,jdbcType=INTEGER}, #{type,jdbcType=SMALLINT})"
    })
    int insert(XxdSuggestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_suggestion
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdSuggestionSqlProvider.class, method="insertSelective")
    int insertSelective(XxdSuggestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_suggestion
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, time, content, save_dir, is_read, uid, type",
        "from xxd_suggestion",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="save_dir", property="saveDir", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_read", property="isRead", jdbcType=JdbcType.SMALLINT),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT)
    })
    XxdSuggestion selectByPrimaryKey(Integer id);
    
    @Select({
        "select",
        "id, time, content, save_dir, is_read, uid, type",
        "from xxd_suggestion",
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="save_dir", property="saveDir", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_read", property="isRead", jdbcType=JdbcType.SMALLINT),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT)
    })
    ArrayList<XxdSuggestion> selectAll();
    
    
    @Select({
        "select",
        "xs.id,xs.time,xs.content,xs.save_dir,xs.is_read,xs.uid,xs.type,",
        "xu.name",
        "from xxd_suggestion xs",
        "left join xxd_user xu on xs.uid = xu.uid"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="save_dir", property="save_dir", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_read", property="is_read", jdbcType=JdbcType.SMALLINT),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT)
    })
    ArrayList<XxdFeedBack> selectAllFeedBack();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_suggestion
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdSuggestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdSuggestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_suggestion
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_suggestion",
        "set time = #{time,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "save_dir = #{saveDir,jdbcType=VARCHAR},",
          "is_read = #{isRead,jdbcType=SMALLINT},",
          "uid = #{uid,jdbcType=INTEGER},",
          "type = #{type,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdSuggestion record);
}