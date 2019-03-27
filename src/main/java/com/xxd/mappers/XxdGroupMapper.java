package com.xxd.mappers;

import com.xxd.models.XxdGroup;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_group (id, uid, ",
        "goods_group_id, sta, ",
        "no, nums, start_time, ",
        "end_time)",
        "values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{goodsGroupId,jdbcType=INTEGER}, #{sta,jdbcType=SMALLINT}, ",
        "#{no,jdbcType=VARCHAR}, #{nums,jdbcType=SMALLINT}, #{startTime,jdbcType=VARCHAR}, ",
        "#{endTime,jdbcType=VARCHAR})"
    })
    int insert(XxdGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdGroupSqlProvider.class, method="insertSelective")
    int insertSelective(XxdGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, uid, goods_group_id, sta, no, nums, start_time, end_time",
        "from xxd_group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_group_id", property="goodsGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="nums", property="nums", jdbcType=JdbcType.SMALLINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR)
    })
    XxdGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdGroupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_group
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_group",
        "set uid = #{uid,jdbcType=INTEGER},",
          "goods_group_id = #{goodsGroupId,jdbcType=INTEGER},",
          "sta = #{sta,jdbcType=SMALLINT},",
          "no = #{no,jdbcType=VARCHAR},",
          "nums = #{nums,jdbcType=SMALLINT},",
          "start_time = #{startTime,jdbcType=VARCHAR},",
          "end_time = #{endTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdGroup record);
    
    @Update({
        "update xxd_group set sta = 5 where end_time < now() and (sta = 1 or sta=  2 or sta = 3)"
    })
    int updateInvaildGroup();
    
    @Update({
    	"update xxd_buy_order set sta = 3",
    	"where id in (select xgi.buy_order_id from xxd_group xg inner join xxd_group_info xgi on xg.no = xgi.no where xg.end_time < now() and (xg.sta = 1 or xg.sta = 2 or xg.sta = 3))"
    })
    int updateBuyOrderSta();
}