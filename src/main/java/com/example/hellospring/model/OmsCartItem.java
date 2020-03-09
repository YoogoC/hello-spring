package com.example.hellospring.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsCartItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_sku_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long productSkuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.member_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.quantity
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.sp1
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String sp1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.sp2
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String sp2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.sp3
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String sp3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_pic
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_name
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_sub_title
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productSubTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_sku_code
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productSkuCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.member_nickname
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String memberNickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.create_date
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.modify_date
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.delete_status
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_category_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long productCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_brand
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productBrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_sn
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_cart_item.product_attr
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private String productAttr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_cart_item
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.id
     *
     * @return the value of oms_cart_item.id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.id
     *
     * @param id the value for oms_cart_item.id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_id
     *
     * @return the value of oms_cart_item.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_id
     *
     * @param productId the value for oms_cart_item.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_sku_id
     *
     * @return the value of oms_cart_item.product_sku_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getProductSkuId() {
        return productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_sku_id
     *
     * @param productSkuId the value for oms_cart_item.product_sku_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.member_id
     *
     * @return the value of oms_cart_item.member_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.member_id
     *
     * @param memberId the value for oms_cart_item.member_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.quantity
     *
     * @return the value of oms_cart_item.quantity
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.quantity
     *
     * @param quantity the value for oms_cart_item.quantity
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.price
     *
     * @return the value of oms_cart_item.price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.price
     *
     * @param price the value for oms_cart_item.price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.sp1
     *
     * @return the value of oms_cart_item.sp1
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.sp1
     *
     * @param sp1 the value for oms_cart_item.sp1
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.sp2
     *
     * @return the value of oms_cart_item.sp2
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.sp2
     *
     * @param sp2 the value for oms_cart_item.sp2
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.sp3
     *
     * @return the value of oms_cart_item.sp3
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.sp3
     *
     * @param sp3 the value for oms_cart_item.sp3
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_pic
     *
     * @return the value of oms_cart_item.product_pic
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_pic
     *
     * @param productPic the value for oms_cart_item.product_pic
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_name
     *
     * @return the value of oms_cart_item.product_name
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_name
     *
     * @param productName the value for oms_cart_item.product_name
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_sub_title
     *
     * @return the value of oms_cart_item.product_sub_title
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductSubTitle() {
        return productSubTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_sub_title
     *
     * @param productSubTitle the value for oms_cart_item.product_sub_title
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_sku_code
     *
     * @return the value of oms_cart_item.product_sku_code
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_sku_code
     *
     * @param productSkuCode the value for oms_cart_item.product_sku_code
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.member_nickname
     *
     * @return the value of oms_cart_item.member_nickname
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getMemberNickname() {
        return memberNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.member_nickname
     *
     * @param memberNickname the value for oms_cart_item.member_nickname
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.create_date
     *
     * @return the value of oms_cart_item.create_date
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.create_date
     *
     * @param createDate the value for oms_cart_item.create_date
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.modify_date
     *
     * @return the value of oms_cart_item.modify_date
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.modify_date
     *
     * @param modifyDate the value for oms_cart_item.modify_date
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.delete_status
     *
     * @return the value of oms_cart_item.delete_status
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.delete_status
     *
     * @param deleteStatus the value for oms_cart_item.delete_status
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_category_id
     *
     * @return the value of oms_cart_item.product_category_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_category_id
     *
     * @param productCategoryId the value for oms_cart_item.product_category_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_brand
     *
     * @return the value of oms_cart_item.product_brand
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_brand
     *
     * @param productBrand the value for oms_cart_item.product_brand
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_sn
     *
     * @return the value of oms_cart_item.product_sn
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_sn
     *
     * @param productSn the value for oms_cart_item.product_sn
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_cart_item.product_attr
     *
     * @return the value of oms_cart_item.product_attr
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_cart_item.product_attr
     *
     * @param productAttr the value for oms_cart_item.product_attr
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productSkuId=").append(productSkuId);
        sb.append(", memberId=").append(memberId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", sp1=").append(sp1);
        sb.append(", sp2=").append(sp2);
        sb.append(", sp3=").append(sp3);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productSubTitle=").append(productSubTitle);
        sb.append(", productSkuCode=").append(productSkuCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productSn=").append(productSn);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}