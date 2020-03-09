package com.example.hellospring.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SmsCoupon implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.type
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.platform
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer platform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.amount
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.per_limit
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer perLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.min_point
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private BigDecimal minPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.start_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.end_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.use_type
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer useType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.note
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.publish_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer publishCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.use_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer useCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.receive_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer receiveCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.enable_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Date enableTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.code
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.member_level
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer memberLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_coupon
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.id
     *
     * @return the value of sms_coupon.id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.id
     *
     * @param id the value for sms_coupon.id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.type
     *
     * @return the value of sms_coupon.type
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.type
     *
     * @param type the value for sms_coupon.type
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.name
     *
     * @return the value of sms_coupon.name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.name
     *
     * @param name the value for sms_coupon.name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.platform
     *
     * @return the value of sms_coupon.platform
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.platform
     *
     * @param platform the value for sms_coupon.platform
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.count
     *
     * @return the value of sms_coupon.count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.count
     *
     * @param count the value for sms_coupon.count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.amount
     *
     * @return the value of sms_coupon.amount
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.amount
     *
     * @param amount the value for sms_coupon.amount
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.per_limit
     *
     * @return the value of sms_coupon.per_limit
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getPerLimit() {
        return perLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.per_limit
     *
     * @param perLimit the value for sms_coupon.per_limit
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.min_point
     *
     * @return the value of sms_coupon.min_point
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public BigDecimal getMinPoint() {
        return minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.min_point
     *
     * @param minPoint the value for sms_coupon.min_point
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.start_time
     *
     * @return the value of sms_coupon.start_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.start_time
     *
     * @param startTime the value for sms_coupon.start_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.end_time
     *
     * @return the value of sms_coupon.end_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.end_time
     *
     * @param endTime the value for sms_coupon.end_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.use_type
     *
     * @return the value of sms_coupon.use_type
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getUseType() {
        return useType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.use_type
     *
     * @param useType the value for sms_coupon.use_type
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.note
     *
     * @return the value of sms_coupon.note
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.note
     *
     * @param note the value for sms_coupon.note
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.publish_count
     *
     * @return the value of sms_coupon.publish_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getPublishCount() {
        return publishCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.publish_count
     *
     * @param publishCount the value for sms_coupon.publish_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.use_count
     *
     * @return the value of sms_coupon.use_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.use_count
     *
     * @param useCount the value for sms_coupon.use_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.receive_count
     *
     * @return the value of sms_coupon.receive_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getReceiveCount() {
        return receiveCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.receive_count
     *
     * @param receiveCount the value for sms_coupon.receive_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.enable_time
     *
     * @return the value of sms_coupon.enable_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Date getEnableTime() {
        return enableTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.enable_time
     *
     * @param enableTime the value for sms_coupon.enable_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.code
     *
     * @return the value of sms_coupon.code
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.code
     *
     * @param code the value for sms_coupon.code
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.member_level
     *
     * @return the value of sms_coupon.member_level
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getMemberLevel() {
        return memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.member_level
     *
     * @param memberLevel the value for sms_coupon.member_level
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", platform=").append(platform);
        sb.append(", count=").append(count);
        sb.append(", amount=").append(amount);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", note=").append(note);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", enableTime=").append(enableTime);
        sb.append(", code=").append(code);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}