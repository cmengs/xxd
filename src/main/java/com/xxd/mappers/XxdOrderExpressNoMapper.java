package com.xxd.mappers;

import com.xxd.models.XxdOrderExpressNo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdOrderExpressNoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_order_express_no
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_order_express_no",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_order_express_no
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_order_express_no (id, order_id, ",
        "order_no, order_user_id, ",
        "time)",
        "values (#{id,jdbcType=INTEGER}, #{orderId,jdbcType=INTEGER}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{orderUserId,jdbcType=INTEGER}, ",
        "#{time,jdbcType=VARCHAR})"
    })
    int insert(XxdOrderExpressNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_order_express_no
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdOrderExpressNoSqlProvider.class, method="insertSelective")
    int insertSelective(XxdOrderExpressNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_order_express_no
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, order_id, order_no, order_user_id, time",
        "from xxd_order_express_no",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_user_id", property="orderUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR)
    })
    XxdOrderExpressNo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_order_express_no
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdOrderExpressNoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdOrderExpressNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_order_express_no
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_order_express_no",
        "set order_id = #{orderId,jdbcType=INTEGER},",
          "order_no = #{orderNo,jdbcType=VARCHAR},",
          "order_user_id = #{orderUserId,jdbcType=INTEGER},",
          "time = #{time,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdOrderExpressNo record);
}