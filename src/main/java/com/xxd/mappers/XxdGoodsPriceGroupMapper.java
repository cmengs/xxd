package com.xxd.mappers;

import com.xxd.models.XxdGoodsPriceGroup;

import java.util.ArrayList;

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

public interface XxdGoodsPriceGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_goods_price_group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_goods_price_group (id, goods_group_id, ",
        "goods_price_stock, format_name, ",
        "market_price, member_price, ",
        "group_member_price, img, ",
        "price, goods_price_stock_bak)",
        "values (#{id,jdbcType=INTEGER}, #{goodsGroupId,jdbcType=INTEGER}, ",
        "#{goodsPriceStock,jdbcType=INTEGER}, #{formatName,jdbcType=VARCHAR}, ",
        "#{marketPrice,jdbcType=DECIMAL}, #{memberPrice,jdbcType=DECIMAL}, ",
        "#{groupMemberPrice,jdbcType=DECIMAL}, #{img,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=DECIMAL}, #{goodsPriceStockBak,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insert(XxdGoodsPriceGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdGoodsPriceGroupSqlProvider.class, method="insertSelective")
    int insertSelective(XxdGoodsPriceGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, goods_group_id, goods_price_stock, format_name, market_price, member_price, ",
        "group_member_price, img, price, goods_price_stock_bak",
        "from xxd_goods_price_group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_group_id", property="goodsGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_price_stock", property="goodsPriceStock", jdbcType=JdbcType.INTEGER),
        @Result(column="format_name", property="formatName", jdbcType=JdbcType.VARCHAR),
        @Result(column="market_price", property="marketPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="member_price", property="memberPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="group_member_price", property="groupMemberPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_price_stock_bak", property="goodsPriceStockBak", jdbcType=JdbcType.INTEGER)
    })
    XxdGoodsPriceGroup selectByPrimaryKey(Integer id);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, goods_group_id, goods_price_stock, format_name, market_price, member_price, ",
        "group_member_price, img, price, goods_price_stock_bak",
        "from xxd_goods_price_group",
        "where goods_group_id = #{goods_group_id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="goods_group_id", property="goodsGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_price_stock", property="goodsPriceStock", jdbcType=JdbcType.INTEGER),
        @Result(column="format_name", property="formatName", jdbcType=JdbcType.VARCHAR),
        @Result(column="market_price", property="marketPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="member_price", property="memberPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="group_member_price", property="groupMemberPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_price_stock_bak", property="goodsPriceStockBak", jdbcType=JdbcType.INTEGER)
    })
    ArrayList<XxdGoodsPriceGroup> selectByGoodsGroupId(Integer goods_group_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdGoodsPriceGroupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdGoodsPriceGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_goods_price_group
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_goods_price_group",
        "set goods_group_id = #{goodsGroupId,jdbcType=INTEGER},",
          "goods_price_stock = #{goodsPriceStock,jdbcType=INTEGER},",
          "format_name = #{formatName,jdbcType=VARCHAR},",
          "market_price = #{marketPrice,jdbcType=DECIMAL},",
          "member_price = #{memberPrice,jdbcType=DECIMAL},",
          "group_member_price = #{groupMemberPrice,jdbcType=DECIMAL},",
          "img = #{img,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=DECIMAL},",
          "goods_price_stock_bak = #{goodsPriceStockBak,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdGoodsPriceGroup record);
    
    @Update({
        "update xxd_goods_price_group",
        "set goods_price_stock = goods_price_stock + #{goodsPriceStock,jdbcType=INTEGER},",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateStockAdd(XxdGoodsPriceGroup record);
}