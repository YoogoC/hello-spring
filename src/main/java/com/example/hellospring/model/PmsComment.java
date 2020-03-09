package com.example.hellospring.model;

import java.io.Serializable;
import java.util.Date;

public class PmsComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.member_nick_name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String memberNickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.product_name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.star
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.member_ip
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String memberIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.create_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.show_status
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.product_attribute
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String productAttribute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.collect_couont
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer collectCouont;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.read_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer readCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.pics
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String pics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.member_icon
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String memberIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.replay_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private Integer replayCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_comment.content
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_comment
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.id
     *
     * @return the value of pms_comment.id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.id
     *
     * @param id the value for pms_comment.id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.product_id
     *
     * @return the value of pms_comment.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.product_id
     *
     * @param productId the value for pms_comment.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.member_nick_name
     *
     * @return the value of pms_comment.member_nick_name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.member_nick_name
     *
     * @param memberNickName the value for pms_comment.member_nick_name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.product_name
     *
     * @return the value of pms_comment.product_name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.product_name
     *
     * @param productName the value for pms_comment.product_name
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.star
     *
     * @return the value of pms_comment.star
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.star
     *
     * @param star the value for pms_comment.star
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.member_ip
     *
     * @return the value of pms_comment.member_ip
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.member_ip
     *
     * @param memberIp the value for pms_comment.member_ip
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.create_time
     *
     * @return the value of pms_comment.create_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.create_time
     *
     * @param createTime the value for pms_comment.create_time
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.show_status
     *
     * @return the value of pms_comment.show_status
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.show_status
     *
     * @param showStatus the value for pms_comment.show_status
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.product_attribute
     *
     * @return the value of pms_comment.product_attribute
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.product_attribute
     *
     * @param productAttribute the value for pms_comment.product_attribute
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.collect_couont
     *
     * @return the value of pms_comment.collect_couont
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getCollectCouont() {
        return collectCouont;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.collect_couont
     *
     * @param collectCouont the value for pms_comment.collect_couont
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.read_count
     *
     * @return the value of pms_comment.read_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.read_count
     *
     * @param readCount the value for pms_comment.read_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.pics
     *
     * @return the value of pms_comment.pics
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getPics() {
        return pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.pics
     *
     * @param pics the value for pms_comment.pics
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setPics(String pics) {
        this.pics = pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.member_icon
     *
     * @return the value of pms_comment.member_icon
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.member_icon
     *
     * @param memberIcon the value for pms_comment.member_icon
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.replay_count
     *
     * @return the value of pms_comment.replay_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public Integer getReplayCount() {
        return replayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.replay_count
     *
     * @param replayCount the value for pms_comment.replay_count
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_comment.content
     *
     * @return the value of pms_comment.content
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_comment.content
     *
     * @param content the value for pms_comment.content
     *
     * @mbg.generated Mon Mar 09 23:30:11 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
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
        sb.append(", productId=").append(productId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", productName=").append(productName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productAttribute=").append(productAttribute);
        sb.append(", collectCouont=").append(collectCouont);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}