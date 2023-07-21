
package com.stit.model;

import java.io.Serializable;

/**
 *
 * @author jay
 */
public class ViewSch0251qScNo implements Serializable {
    private String  scNo;//sc_no
    private String  pdcNo;//pdc_no
    private String  pdcSpec;//pdc_spec

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
