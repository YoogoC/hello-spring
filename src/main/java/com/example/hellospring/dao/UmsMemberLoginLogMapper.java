package com.example.hellospring.dao;

import com.example.hellospring.model.UmsMemberLoginLog;
import com.example.hellospring.model.UmsMemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    long countByExample(UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int deleteByExample(UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int insert(UmsMemberLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int insertSelective(UmsMemberLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    List<UmsMemberLoginLog> selectByExample(UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    UmsMemberLoginLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    int updateByPrimaryKey(UmsMemberLoginLog record);
}