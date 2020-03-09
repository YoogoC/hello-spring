package com.example.hellospring.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsProductFullReduction implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_full_reduction.id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_full_reduction.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_full_reduction.full_price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private BigDecimal fullPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_full_reduction.reduce_price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private BigDecimal reducePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_full_reduction.id
     *
     * @return the value of pms_product_full_reduction.id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_full_reduction.id
     *
     * @param id the value for pms_product_full_reduction.id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_full_reduction.product_id
     *
     * @return the value of pms_product_full_reduction.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_full_reduction.product_id
     *
     * @param productId the value for pms_product_full_reduction.product_id
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_full_reduction.full_price
     *
     * @return the value of pms_product_full_reduction.full_price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_full_reduction.full_price
     *
     * @param fullPrice the value for pms_product_full_reduction.full_price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_full_reduction.reduce_price
     *
     * @return the value of pms_product_full_reduction.reduce_price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_full_reduction.reduce_price
     *
     * @param reducePrice the value for pms_product_full_reduction.reduce_price
     *
     * @mbg.generated Mon Mar 09 23:30:12 CST 2020
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
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
        sb.append(", fullPrice=").append(fullPrice);
        sb.append(", reducePrice=").append(reducePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}