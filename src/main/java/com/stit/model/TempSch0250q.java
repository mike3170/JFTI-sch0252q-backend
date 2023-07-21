
package com.stit.model;

import java.io.Serializable;

/**
 *
 * @author jay
 */
public class TempSch0250q implements Serializable {
    private String  sessionId;//session_id
    private String  mtlJobNo;//mtl_job_no
    private String  procNo;//proc_no
    private String  procName;//proc_name
    private String  prevProcNo;//prev_proc_no
    private String  seqNo;//seq_no
    private String  requQty;//requ_qty
    private String  makeQty;//make_qty
    private String  notMakeQty;//not_make_qty

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId the sessionId to set
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

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
     * @return the procNo
     */
    public String getProcNo() {
        return procNo;
    }

    /**
     * @param procNo the procNo to set
     */
    public void setProcNo(String procNo) {
        this.procNo = procNo;
    }

    /**
     * @return the procName
     */
    public String getProcName() {
        return procName;
    }

    /**
     * @param procName the procName to set
     */
    public void setProcName(String procName) {
        this.procName = procName;
    }

    /**
     * @return the prevProcNo
     */
    public String getPrevProcNo() {
        return prevProcNo;
    }

    /**
     * @param prevProcNo the prevProcNo to set
     */
    public void setPrevProcNo(String prevProcNo) {
        this.prevProcNo = prevProcNo;
    }

    /**
     * @return the seqNo
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo the seqNo to set
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * @return the requQty
     */
    public String getRequQty() {
        return requQty;
    }

    /**
     * @param requQty the requQty to set
     */
    public void setRequQty(String requQty) {
        this.requQty = requQty;
    }

    /**
     * @return the makeQty
     */
    public String getMakeQty() {
        return makeQty;
    }

    /**
     * @param makeQty the makeQty to set
     */
    public void setMakeQty(String makeQty) {
        this.makeQty = makeQty;
    }

    /**
     * @return the notMakeQty
     */
    public String getNotMakeQty() {
        return notMakeQty;
    }

    /**
     * @param notMakeQty the notMakeQty to set
     */
    public void setNotMakeQty(String notMakeQty) {
        this.notMakeQty = notMakeQty;
    }
    
}
