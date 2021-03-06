package com.example.hellospring.dao;

import com.example.hellospring.model.PmsProduct;
import com.example.hellospring.model.PmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    long countByExample(PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int deleteByExample(PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int insert(PmsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int insertSelective(PmsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    List<PmsProduct> selectByExampleWithBLOBs(PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    List<PmsProduct> selectByExample(PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    PmsProduct selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExample(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(PmsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKey(PmsProduct record);
}