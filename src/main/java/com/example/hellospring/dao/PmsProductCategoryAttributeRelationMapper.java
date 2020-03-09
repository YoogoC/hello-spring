package com.example.hellospring.dao;

import com.example.hellospring.model.PmsProductCategoryAttributeRelation;
import com.example.hellospring.model.PmsProductCategoryAttributeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryAttributeRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    long countByExample(PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int deleteByExample(PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int insert(PmsProductCategoryAttributeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int insertSelective(PmsProductCategoryAttributeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    List<PmsProductCategoryAttributeRelation> selectByExample(PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByExampleSelective(@Param("record") PmsProductCategoryAttributeRelation record, @Param("example") PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByExample(@Param("record") PmsProductCategoryAttributeRelation record, @Param("example") PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);
}