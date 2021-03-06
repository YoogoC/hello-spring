package com.example.hellospring.dao;

import com.example.hellospring.model.CmsHelpCategory;
import com.example.hellospring.model.CmsHelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    long countByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int deleteByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int insert(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int insertSelective(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    CmsHelpCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByExample(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKeySelective(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    int updateByPrimaryKey(CmsHelpCategory record);
}