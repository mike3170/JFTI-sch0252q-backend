
package com.stit.model;

import java.io.Serializable;

/**
 *
 * @author jay
 */
public class ViewSch0250q implements Serializable {
    private String  mtlJobNo;//mtl_job_no
    private String  reqQty;//req_qty
    private String  pdcNo;//pdc_no
    private String  scNo;//sc_no
    private String  itemNo;//item_no
    private String  pdcSpec;//pdc_spec

    /**
     * @return the mtlJobNo
     */
    public String getMtlJobNo() {
        return mtlJobNo;
    }

    /**
     * @param mtlJobNo the mtlJobNo to set
     */
    public void setMtlJobNo(String mtlJobNo) {
        this.mtlJobNo = mtlJobNo;
    }

    /**
     * @return the reqQty
     */
    public String getReqQty() {
        return reqQty;
    }

    /**
     * @param reqQty the reqQty to set
     */
    public void setReqQty(String reqQty) {
        this.reqQty = reqQty;
    }

    /**
     * @return the pdcNo
     */
    public String getPdcNo() {
        return pdcNo;
    }

    /**
     * @param pdcNo the pdcNo to set
     */
    public void setPdcNo(String pdcNo) {
        this.pdcNo = pdcNo;
    }

    /**
     * @return the scNo
     */
    public String getScNo() {
        return scNo;
    }

    /**
     * @param scNo the scNo to set
     */
    public void setScNo(String scNo) {
        this.scNo = scNo;
    }

    /**
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * @param itemNo the itemNo to set
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * @return the pdcSpec
     */
    public String getPdcSpec() {
        return pdcSpec;
    }

    /**
     * @param pdcSpec the pdcSpec to set
     */
    public void setPdcSpec(String pdcSpec) {
        this.pdcSpec = pdcSpec;
    }
    
}
