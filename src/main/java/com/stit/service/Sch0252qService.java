package com.stit.service;

import com.stit.model.ViewSch0250q;
import com.stit.model.ViewSch0251qDetail;
import com.stit.model.TempSch0250q;
import com.stit.model.TempSch0252q;
import com.stit.model.ViewSch0251qCst;
import com.stit.model.ViewSch0251qScNo;
import com.stit.model.ViewSch0251qCstRefeNo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author jay
 */
@Service
public class Sch0252qService {

    @Autowired
    private JdbcTemplate jdbc;

    public List<ViewSch0251qDetail> findViewSch0251qDetail(String scNoB, String scNoE,
            String cstRefeNoB, String cstRefeNoE,
            String ordCstNoB, String ordCstNoE,
            String dlvDateB, String dlvDateE,
            String endCode, String jobNoB, String jobNoE,
            String pdcNoB, String pdcNoE) {
        String sql = "SELECT brn_id, sc_no, item_no, pdc_no, pdc_spec,"
                + " TO_CHAR(dlv_date, 'YYYY/MM/DD') dlv_date, TO_CHAR(job_dlv_date, 'YYYY/MM/DD') job_dlv_date,"
                + " order_qty, job_no, pdc_type, self_out, dlvd_qty, not_dlvd_qty,"
                + " end_code, ord_cst_no, ord_cst_abbr, self_out_name, pdc_type_name,"
                + " end_code_name, cst_refe_no, confirm_status"
                + " FROM V_SCH0251Q_D"
                + " WHERE sc_no BETWEEN NVL(?, sc_no) AND NVL(?, sc_no)"
                + " AND NVL(cst_refe_no, CHR(1)) BETWEEN NVL(?, NVL(cst_refe_no, CHR(1))) AND NVL(?, NVL(cst_refe_no, CHR(1)))"
                + " AND ord_cst_no BETWEEN NVL(?, ord_cst_no) AND NVL(?, ord_cst_no)"
                + " AND TO_CHAR(dlv_date, 'YYYYMMDD') BETWEEN NVL(?, TO_CHAR(dlv_date, 'YYYYMMDD')) AND NVL(?, TO_CHAR(dlv_date, 'YYYYMMDD'))"
                + " AND end_code = DECODE(?, 'A', end_code, ?) "
                + " AND job_no BETWEEN NVL(?, job_no) AND NVL(?, job_no)"
                + " AND pdc_no BETWEEN NVL(?, pdc_no) AND NVL(?, pdc_no)"
                + " ORDER BY sc_no, item_no";

        Object[] params = {scNoB.equals("null")? null:scNoB,
                           scNoE.equals("null")? null:scNoE,
                           cstRefeNoB.equals("null")? null:cstRefeNoB,
                           cstRefeNoE.equals("null")? null:cstRefeNoE,
                           ordCstNoB.equals("null")? null:ordCstNoB,
                           ordCstNoE.equals("null")? null:ordCstNoE,
                           dlvDateB.equals("null")? null:dlvDateB,
                           dlvDateE.equals("null")? null:dlvDateE,
                           endCode.equals("null")? null:endCode,
                           endCode.equals("null")? null:endCode,
                           jobNoB.equals("null")? null:jobNoB,
                           jobNoE.equals("null")? null:jobNoE,
                           pdcNoB.equals("null")? null:pdcNoB,
                           pdcNoE.equals("null")? null:pdcNoE};

        List<ViewSch0251qDetail> ViewSch0251qDetailList = jdbc.query(sql, params, new RowMapper<ViewSch0251qDetail>() {
            @Override
            public ViewSch0251qDetail mapRow(ResultSet rs, int rowNum) throws SQLException {

                ViewSch0251qDetail Sch0251q = new ViewSch0251qDetail();
                Sch0251q.setBrnId(rs.getString("brn_id"));
                Sch0251q.setScNo(rs.getString("sc_no"));
                Sch0251q.setItemNo(rs.getString("item_no"));
                Sch0251q.setPdcNo(rs.getString("pdc_no"));
                Sch0251q.setPdcSpec(rs.getString("pdc_spec"));
                Sch0251q.setDlvDate(rs.getString("dlv_date"));
                Sch0251q.setJobDlvDate(rs.getString("job_dlv_date"));
                Sch0251q.setOrderQty(rs.getString("order_qty"));
                Sch0251q.setJobNo(rs.getString("job_no"));
                Sch0251q.setPdcType(rs.getString("pdc_type"));
                Sch0251q.setPdcTypeName(rs.getString("pdc_type_name"));
                Sch0251q.setSelfOut(rs.getString("self_out"));
                Sch0251q.setSelfOutName(rs.getString("self_out_name"));
                Sch0251q.setDlvdQty(rs.getString("dlvd_qty"));
                Sch0251q.setNotDlvdQty(rs.getString("not_dlvd_qty"));
                Sch0251q.setEndCode(rs.getString("end_code"));
                Sch0251q.setEndCodeName(rs.getString("end_code_name"));
                Sch0251q.setOrdCstNo(rs.getString("ord_cst_no"));
                Sch0251q.setOrdCstAbbr(rs.getString("ord_cst_abbr"));
                Sch0251q.setCstRefeNo(rs.getString("cst_refe_no"));
                Sch0251q.setConfirmStatus(rs.getString("confirm_status"));

                return Sch0251q;
            }
        });
        return ViewSch0251qDetailList;
    }

    public List<ViewSch0250q> findViewSch0250Q(String scNo, String itemNo) {
        String sql = "SELECT * FROM V_SCH0250Q WHERE sc_no = ? AND item_no = ? ORDER BY mtl_job_no";

        Object[] params = {scNo, itemNo};

        List<ViewSch0250q> viewSch0250qList = jdbc.query(sql, params, new RowMapper<ViewSch0250q>() {
            @Override
            public ViewSch0250q mapRow(ResultSet rs, int rowNum) throws SQLException {

                ViewSch0250q Sch0250q = new ViewSch0250q();
                Sch0250q.setMtlJobNo(rs.getString("mtl_job_no"));
                Sch0250q.setReqQty(rs.getString("req_qty"));
                Sch0250q.setPdcNo(rs.getString("pdc_no"));
                Sch0250q.setScNo(rs.getString("sc_no"));
                Sch0250q.setItemNo(rs.getString("item_no"));
                Sch0250q.setPdcSpec(rs.getString("pdc_spec"));

                return Sch0250q;
            }
        });
        return viewSch0250qList;
    }

    public List<TempSch0250q> findTempSch0250q(String sessionId, String mtlJobNo) {
        String sql = "SELECT * FROM T_SCH0250Q WHERE session_id = ? AND mtl_job_no = ? ORDER BY seq_no";

        Object[] params = {sessionId, mtlJobNo};

        List<TempSch0250q> tempSch0250qList = jdbc.query(sql, params, new RowMapper<TempSch0250q>() {
            @Override
            public TempSch0250q mapRow(ResultSet rs, int rowNum) throws SQLException {

                TempSch0250q TempSch0250q = new TempSch0250q();
                TempSch0250q.setSessionId(rs.getString("session_id"));
                TempSch0250q.setMtlJobNo(rs.getString("mtl_job_no"));
                TempSch0250q.setProcNo(rs.getString("proc_no"));
                TempSch0250q.setProcName(rs.getString("proc_name"));
                TempSch0250q.setPrevProcNo(rs.getString("prev_proc_no"));
                TempSch0250q.setSeqNo(rs.getString("seq_no"));
                TempSch0250q.setRequQty(rs.getString("requ_qty"));
                TempSch0250q.setMakeQty(rs.getString("make_qty"));
                TempSch0250q.setNotMakeQty(rs.getString("not_make_qty"));

                return TempSch0250q;
            }
        });
        return tempSch0250qList;
    }
    
    public List<TempSch0252q> findTempSch0252q(String sessionId, String mtlJobNo, String porcNo) {
        String sql = "SELECT session_id, kind, kind_name, wrk_date,"
                + " ven_no, ven_abbr, proc_no, mtl_job_no, wrk_qty,"
                + " prev_proc_no, remark, crea_date"
                + " FROM T_SCH0252Q WHERE session_id = ? AND mtl_job_no = ?"
                + " AND proc_no = ? ORDER BY wrk_date, crea_date, kind";

        Object[] params = {sessionId, mtlJobNo, porcNo};

        List<TempSch0252q> tempSch0252qList = jdbc.query(sql, params, new RowMapper<TempSch0252q>() {
            @Override
            public TempSch0252q mapRow(ResultSet rs, int rowNum) throws SQLException {

                TempSch0252q TempSch0252q = new TempSch0252q();
                TempSch0252q.setSessionId(rs.getString("session_id"));
                TempSch0252q.setKind(rs.getString("kind"));
                TempSch0252q.setKindName(rs.getString("kind_name"));
                TempSch0252q.setWrkDate(rs.getString("wrk_date"));
                TempSch0252q.setVenNo(rs.getString("ven_no"));
                TempSch0252q.setVenAbbr(rs.getString("ven_abbr"));
                TempSch0252q.setProcNo(rs.getString("proc_no"));
                TempSch0252q.setMtlJobNo(rs.getString("mtl_job_no"));
                TempSch0252q.setWrkQty(rs.getString("wrk_qty"));
                TempSch0252q.setPrevProcNo(rs.getString("prev_proc_no"));
                TempSch0252q.setRemark(rs.getString("remark"));
                TempSch0252q.setCreaDate(rs.getString("crea_date"));

                return TempSch0252q;
            }
        });
        return tempSch0252qList;
    }

    public int deleteTempSch0250q(String Sess_id) {
		String sql = "delete t_sch0250q where session_id = ?"; 
                Object[] params = {Sess_id};
		int count = jdbc.update(sql,params);
		return count;
    }
    
    public int callSpInsTsch0250q(String sessId, String brnId, String mtlJobNo) {
        String sql = "call SP_INS_T_SCH0250Q(?, ?, ?)";
        
        Object[] params = {sessId, brnId, mtlJobNo};
        int count = jdbc.update(sql, params);
        return count;
    }
    
    public int deleteTempSch0252q(String Sess_id) {
		String sql = "delete t_sch0252q where session_id = ?"; 
                Object[] params = {Sess_id};
		int count = jdbc.update(sql,params);
		return count;
    }
    
    public int callSpInsTsch0252q(String sessId, String brnId, String mtlJobNo, String procNo, String prevProcNo) {
        String sql = "call SP_INS_T_SCH0252Q(?, ?, ?, ?, ?)";
        
        Object[] params = {sessId, brnId, mtlJobNo, procNo, prevProcNo};
        int count = jdbc.update(sql, params);
        return count;
    }
    
    public List<ViewSch0251qCst> findViewSch0251qCst() {
        String sql = "SELECT DISTINCT ord_cst_no, ord_cst_abbr FROM v_sch0251q_d ORDER BY ord_cst_no";

        List<ViewSch0251qCst> viewSch0251qCstList = jdbc.query(sql, new RowMapper<ViewSch0251qCst>() {
            @Override
            public ViewSch0251qCst mapRow(ResultSet rs, int rowNum) throws SQLException {

                ViewSch0251qCst ViewSch0251qCst = new ViewSch0251qCst();
                ViewSch0251qCst.setOrdCstNo(rs.getString("ord_cst_no"));
                ViewSch0251qCst.setOrdCstAbbr(rs.getString("ord_cst_abbr"));

                return ViewSch0251qCst;
            }
        });
        return viewSch0251qCstList;
    }
    
    public List<ViewSch0251qScNo> findViewSch0251qScNo() {
        String sql = "SELECT DISTINCT sc_no, pdc_no, pdc_spec FROM v_sch0251q_d ORDER BY sc_no";
        
        List<ViewSch0251qScNo> viewSch0251qScNoList = jdbc.query(sql, new RowMapper<ViewSch0251qScNo>() {
            @Override
            public ViewSch0251qScNo mapRow(ResultSet rs, int rowNum) throws SQLException {

                ViewSch0251qScNo ViewSch0251qScNo = new ViewSch0251qScNo();
                ViewSch0251qScNo.setScNo(rs.getString("sc_no"));
                ViewSch0251qScNo.setPdcNo(rs.getString("pdc_no"));
                ViewSch0251qScNo.setPdcSpec(rs.getString("pdc_spec"));

                return ViewSch0251qScNo;
            }
        });
        return viewSch0251qScNoList;
    }
    
    public List<ViewSch0251qCstRefeNo> findViewSch0251qCstRefeNo() {
        String sql = "SELECT DISTINCT cst_refe_no FROM v_sch0251q_d WHERE cst_refe_no IS NOT NULL ORDER BY cst_refe_no";

        List<ViewSch0251qCstRefeNo> viewSch0251qCstRefeNoList = jdbc.query(sql, new RowMapper<ViewSch0251qCstRefeNo>() {
            @Override
            public ViewSch0251qCstRefeNo mapRow(ResultSet rs, int rowNum) throws SQLException {

                ViewSch0251qCstRefeNo ViewSch0251qCstRefeNo = new ViewSch0251qCstRefeNo();
                ViewSch0251qCstRefeNo.setCstRefeNo(rs.getString("cst_refe_no"));

                return ViewSch0251qCstRefeNo;
            }
        });
        return viewSch0251qCstRefeNoList;
    }
    
    public byte[] findJobImg(String ordCstNo, String scNo, String itemNo) {
        String str = ordCstNo + "-" + scNo + "-" + itemNo;
        String sql = "SELECT file_body " +
                     "  FROM bas_file_collect" +
                     " WHERE table_name = 'SSL_CST_PICT'" +
                     "   AND doc_no = 'B-" + str + "'" +
                     "   AND item_no = (SELECT MIN(item_no)" + 
                     "                    FROM bas_file_collect" +
                     "                   WHERE table_name = 'SSL_CST_PICT'" +
                     "                     AND doc_no = 'B-" + str + "'" + ")";
        byte[] imgBody = jdbc.queryForObject(sql, byte[].class);

        return imgBody;
    }
}
