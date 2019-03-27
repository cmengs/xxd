package com.xxd.mappers;

import com.xxd.models.XxdBuyOrderDetails;
import com.xxd.models.XxdModel;

import java.math.BigDecimal;
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

public interface XxdBuyOrderDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_buy_order_details
     *
     * @mbggenerated
     */
    @Delete({
        "delete from xxd_buy_order_details",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_buy_order_details
     *
     * @mbggenerated
     */
    @Insert({
        "insert into xxd_buy_order_details (id, price, ",
        "buy_order_id, num, ",
        "goods_id, sta)",
        "values (#{id,jdbcType=INTEGER}, #{price,jdbcType=INTEGER}, ",
        "#{buyOrderId,jdbcType=INTEGER}, #{num,jdbcType=INTEGER}, ",
        "#{goodsId,jdbcType=INTEGER}, #{sta,jdbcType=SMALLINT})"
    })
    int insert(XxdBuyOrderDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_buy_order_details
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdBuyOrderDetailsSqlProvider.class, method="insertSelective")
    int insertSelective(XxdBuyOrderDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_buy_order_details
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, price, buy_order_id, num, goods_id, sta",
        "from xxd_buy_order_details",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="buy_order_id", property="buyOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT)
    })
    XxdBuyOrderDetails selectByPrimaryKey(Integer id);
    
    @Select({
        "select",
        "id, price, buy_order_id, num, goods_id, sta",
        "from xxd_buy_order_details"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="buy_order_id", property="buyOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.INTEGER),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT)
    })
    ArrayList<XxdBuyOrderDetails> selectAll();
    
    @Select({
        "select sum((xgp.leader_price - xgp.price)*xbod.num) profit from xxd_goods_price xgp,xxd_buy_order_details xbod where xbod.price = xgp.id"
    })
    BigDecimal selectBuyCarProfit();
    
    @Select({
        "select sum((xgpp.market_price - xgpp.price)*xbod.num) profit from xxd_buy_order_details xbod,xxd_goods_product_package xgpp where xgpp.id = xbod.goods_id and xbod.price is null"
    })
    BigDecimal selectUpCarProfit();
    
    @Select({
        "select",
        "xbod.id id,xgp.format_name format_name,xbod.num num,xbod.sta sta,xg.name name,xg.show_img_dir show_img_dir,",
        "xbod.prices price, xoen.order_no expressNo",
        "from (xxd_buy_order_details xbod,xxd_goods xg,xxd_goods_price xgp,xxd_user xu) left join xxd_order_express_no xoen on xoen.order_id = xbod.id",
        "where xbod.buy_order_id = #{order_id,jdbcType=INTEGER}",
        "and xbod.goods_id = xg.id",
        "and xbod.price = xgp.id",
        "and xu.uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="format_name", property="format_name", jdbcType=JdbcType.VARCHAR),
        @Result(column="prices", property="prices", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_img_dir", property="show_img_dir", jdbcType=JdbcType.VARCHAR),
        @Result(column="expressNo", property="expressNo", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<XxdBuyOrderDetails> selectAllByOrderId(XxdModel record);
    
    @Select({
        "select xbod.id id,xbod.price price,xbod.num num,xbod.goods_id goods_id,xbod.type type from",
        "(xxd_group xg  inner join xxd_group_info xgi on xg.no = xgi.no)",
        "inner join xxd_buy_order_details xbod on xgi.buy_order_id = xbod.buy_order_id",
        "where xg.end_time < now() and (xg.sta = 1 or xg.sta=  2 or xg.sta = 3)"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="goods_id", property="goods_id", jdbcType=JdbcType.INTEGER),
        @Result(column="buy_order_id", property="buyOrderId", jdbcType=JdbcType.INTEGER)
    })
    ArrayList<XxdBuyOrderDetails> selectAllInvaildOrder();
    
    @Select({
        "select",
        "xbod.id id,xbod.num num,xbod.sta sta,xgpp.name name,xgpp.show_img_dir show_img_dir,xgpp.price prices,xgpp.ownership_leader_id ownership_leader_id,xoen.order_no expressNo",
        "from (xxd_buy_order_details xbod,xxd_goods_product_package xgpp) left join xxd_order_express_no xoen on xoen.order_id = xbod.id",
        "where xbod.buy_order_id = #{order_id,jdbcType=INTEGER}",
        "and xbod.goods_id = xgpp.id"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="prices", property="prices", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="sta", property="sta", jdbcType=JdbcType.SMALLINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_img_dir", property="show_img_dir", jdbcType=JdbcType.VARCHAR),
        @Result(column="ownership_leader_id", property="ownership_leader_id", jdbcType=JdbcType.INTEGER),
        @Result(column="expressNo", property="expressNo", jdbcType=JdbcType.VARCHAR)
    })
    ArrayList<XxdBuyOrderDetails> selectAllByOrderId1(XxdModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_buy_order_details
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdBuyOrderDetailsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdBuyOrderDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xxd_buy_order_details
     *
     * @mbggenerated
     */
    @Update({
        "update xxd_buy_order_details",
        "set price = #{price,jdbcType=INTEGER},",
          "buy_order_id = #{buyOrderId,jdbcType=INTEGER},",
          "num = #{num,jdbcType=INTEGER},",
          "goods_id = #{goodsId,jdbcType=INTEGER}",
          "sta = #{sta,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdBuyOrderDetails record);
}