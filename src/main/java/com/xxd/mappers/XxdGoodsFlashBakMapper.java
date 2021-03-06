package com.xxd.mappers;

import com.xxd.models.XxdGoodsFlash;
import com.xxd.models.XxdGoodsFlashBak;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdGoodsFlashBakMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_flash_bak
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_goods_flash_bak",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_flash_bak
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_goods_flash_bak (id, goods_id, sta, start_time, end_time, time, flash_title, flash_picture)",
        "values (#{id,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{sta,jdbcType=SMALLINT}, #{startTime,jdbcType=VARCHAR}, ",
        "#{endTime,jdbcType=VARCHAR}, #{time,jdbcType=VARCHAR}, #{flashTitle,jdbcType=VARCHAR}, ",
        "#{flashPicture,jdbcType=VARCHAR})"
    })
    int insert(XxdGoodsFlashBak record);
    
    @Insert({
        "insert into xxd_goods_flash_bak (id, goods_id, sta, start_time, end_time, time, flash_title, flash_picture)",
        "values (#{id,jdbcType=INTEGER}, #{goodsId,jdbcType=INTEGER}, ",
        "#{sta,jdbcType=SMALLINT}, #{startTime,jdbcType=VARCHAR}, ",
        "#{endTime,jdbcType=VARCHAR}, #{time,jdbcType=VARCHAR}, #{flashTitle,jdbcType=VARCHAR}, ",
        "#{flashPicture,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insertGoodsFlash(XxdGoodsFlash record);
    
    @Insert({
        "insert into",
        "xxd_goods_flash_bak(id, goods_id, sta, start_time, end_time, time, flash_title, flash_picture)",
        "select id, goods_id, sta, start_time, end_time, time, flash_title, flash_picture",
        "from xxd_goods_flash",
        "where end_time = #{end_time,jdbcType=VARCHAR}"
    })
    int insertFromOverFlash(String end_time);
    
    @Delete({
        "delete from xxd_goods_flash",
        "where end_time = #{end_time,jdbcType=VARCHAR}"
    })
    int deleteFromOverFlash(String end_time);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_flash_bak
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdGoodsFlashBakSqlProvider.class, method="insertSelective")
    int insertSelective(XxdGoodsFlashBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_flash_bak
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, goods_id, sta, start_time, end_time, time, flash_title, flash_picture",
        "from xxd_goods_flash_bak",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="flash_title", property="flashTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="flash_picture", property="flashPicture", jdbcType=JdbcType.VARCHAR)
    })
    XxdGoodsFlashBak selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_flash_bak
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdGoodsFlashBakSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdGoodsFlashBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_flash_bak
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_goods_flash_bak",
        "set goods_id = #{goodsId,jdbcType=INTEGER},",
          "sta = #{sta,jdbcType=SMALLINT},",
          "start_time = #{startTime,jdbcType=VARCHAR},",
          "end_time = #{endTime,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=VARCHAR},",
          "flash_title = #{flashTitle,jdbcType=VARCHAR},",
          "flash_picture = #{flashPicture,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdGoodsFlashBak record);
}