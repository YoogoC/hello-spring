package com.example.hellospring.dao;

import com.example.hellospring.model.PmsMemberPrice;
import com.example.hellospring.model.PmsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMemberPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    long countByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int deleteByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int insert(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int insertSelective(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    PmsMemberPrice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExample(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKeySelective(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKey(PmsMemberPrice record);
}