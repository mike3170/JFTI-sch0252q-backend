
package com.stit.model;

import java.io.Serializable;

/**
 *
 * @author jay
 */
public class ViewSch0251qCst implements Serializable {
    private String  ordCstNo;//ord_cst_no
    private String  ordCstAbbr;//ord_cst_abbr

    /**
     * @return the ordCstNo
     */
    public String getOrdCstNo() {
        return ordCstNo;
    }

    /**
     * @param ordCstNo the ordCstNo to set
     */
    public void setOrdCstNo(String ordCstNo) {
        this.ordCstNo = ordCstNo;
    }

    /**
     * @return the ordCstAbbr
     */
    public String getOrdCstAbbr() {
        return ordCstAbbr;
    }

    /**
     * @param ordCstAbbr the ordCstAbbr to set
     */
    public void setOrdCstAbbr(String ordCstAbbr) {
        this.ordCstAbbr = ordCstAbbr;
    }
}
