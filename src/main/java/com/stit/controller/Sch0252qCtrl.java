package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.model.ViewSch0250q;
import com.stit.model.ViewSch0251qDetail;
import com.stit.model.TempSch0250q;
import com.stit.model.TempSch0252q;
import com.stit.model.ViewSch0251qCst;
import com.stit.model.ViewSch0251qScNo;
import com.stit.model.ViewSch0251qCstRefeNo;
import com.stit.service.Sch0252qService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;//Form新增
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;//Form新增
import org.springframework.web.bind.annotation.PutMapping;//Form新增
import org.springframework.web.bind.annotation.PatchMapping;//Form新增//Form新增//Form新增//Form新增
import org.springframework.web.bind.annotation.RequestBody;//Form新增
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jay
 */
@RestController
@RequestMapping("/api/SCH0252Q")

public class Sch0252qCtrl {

    @Autowired
    private Sch0252qService Sch0252qService;

    @GetMapping("findViewSch0251qDetail/{scNoB}/{scNoE}/{cstRefeNoB}/{cstRefeNoE}/"
            + "{ordCstNoB}/{ordCstNoE}/"
            + "{dlvDateB}/{dlvDateE}/"
            + "{endCode}/{jobNoB}/{jobNoE}/{pdcNoB}/{pdcNoE}")//output json
    public ApiResponse findViewSch0251qDetail(@PathVariable String scNoB, @PathVariable String scNoE,
            @PathVariable String cstRefeNoB, @PathVariable String cstRefeNoE,
            @PathVariable String ordCstNoB, @PathVariable String ordCstNoE,
            @PathVariable String dlvDateB, @PathVariable String dlvDateE,
            @PathVariable String endCode,
            @PathVariable String jobNoB, @PathVariable String jobNoE,
            @PathVariable String pdcNoB, @PathVariable String pdcNoE) {
        try {
            List<ViewSch0251qDetail> ViewSch0251qDetailList = Sch0252qService.findViewSch0251qDetail(scNoB, scNoE, cstRefeNoB, cstRefeNoE, ordCstNoB, ordCstNoE, dlvDateB, dlvDateE, endCode, jobNoB, jobNoE, pdcNoB, pdcNoE);
            return ApiResponse.ok(ViewSch0251qDetailList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findViewSch0250q/" + "{scNo}/" + "{itemNo}")//output json
    public ApiResponse findViewSch0250Q(@PathVariable String scNo, @PathVariable String itemNo) {
        try {
            List<ViewSch0250q> viewSch0250qList = Sch0252qService.findViewSch0250Q(scNo, itemNo);
            return ApiResponse.ok(viewSch0250qList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findTempSch0250q/" + "{sessionId}/" + "{mtlJobNo}")//output json
    public ApiResponse findTempSch0250q(@PathVariable String sessionId, @PathVariable String mtlJobNo) {
        try {
            List<TempSch0250q> tempSch0250qList = Sch0252qService.findTempSch0250q(sessionId, mtlJobNo);
            return ApiResponse.ok(tempSch0250qList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findTempSch0252q/" + "{sessionId}/" + "{mtlJobNo}/" + "{procNo}")//output json
    public ApiResponse findTempSch0252q(@PathVariable String sessionId, @PathVariable String mtlJobNo, @PathVariable String procNo) {
        try {
            List<TempSch0252q> tempSch0252qList = Sch0252qService.findTempSch0252q(sessionId, mtlJobNo, procNo);
            return ApiResponse.ok(tempSch0252qList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @DeleteMapping("deleteTempSch0250q/" + "{SessId}")
    public ApiResponse deleteTempSch0250q(@PathVariable String SessId) {
        try {
            int rows = this.Sch0252qService.deleteTempSch0250q(SessId);
            return ApiResponse.ok(rows);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("callSpInsTsch0250q/{sessId}/{brnId}/{mtlJobNo}")//output json
    public ApiResponse callSpInsTsch0250q(@PathVariable String sessId,
            @PathVariable String brnId,
            @PathVariable String mtlJobNo) {
        try {
            int rows = Sch0252qService.callSpInsTsch0250q(sessId, brnId, mtlJobNo);
            return ApiResponse.ok(rows);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @DeleteMapping("deleteTempSch0252q/" + "{SessId}")
    public ApiResponse deleteTempSch0252q(@PathVariable String SessId) {
        try {
            int rows = this.Sch0252qService.deleteTempSch0252q(SessId);
            return ApiResponse.ok(rows);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("callSpInsTsch0252q/{sessId}/{brnId}/{mtlJobNo}/{procNo}/" + "{prevProcNo}")//output json
    public ApiResponse callSpInsTsch0250q(@PathVariable String sessId,
            @PathVariable String brnId,
            @PathVariable String mtlJobNo,
            @PathVariable String procNo,
            @PathVariable String prevProcNo) {
        try {
            int rows = Sch0252qService.callSpInsTsch0252q(sessId, brnId, mtlJobNo, procNo, prevProcNo);
            return ApiResponse.ok(rows);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findViewSch0251qCst")//output json
    public ApiResponse findViewSch0251qCst() {
        try {
            List<ViewSch0251qCst> viewSch0251qCstList = Sch0252qService.findViewSch0251qCst();
            return ApiResponse.ok(viewSch0251qCstList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findViewSch0251qScNo")//output json
    public ApiResponse findViewSch0251qScNo() {
        try {
            List<ViewSch0251qScNo> viewSch0251qScNoList = Sch0252qService.findViewSch0251qScNo();
            return ApiResponse.ok(viewSch0251qScNoList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findViewSch0251qCstRefeNo")//output json
    public ApiResponse findViewSch0251qCstRefeNo() {
        try {
            List<ViewSch0251qCstRefeNo> viewSch0251qCstRefeNoList = Sch0252qService.findViewSch0251qCstRefeNo();
            return ApiResponse.ok(viewSch0251qCstRefeNoList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }    
    
    @GetMapping(value = "getjobimg/{ordCstNo}/{scNo}/{itemNo}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getJobImg(@PathVariable String ordCstNo, @PathVariable String scNo, @PathVariable String itemNo) {
            byte[] imgBody = Sch0252qService.findJobImg(ordCstNo, scNo, itemNo);
            return imgBody;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse exceptionCollect (Exception ex) {
        System.out.println("ex:" + ex);
       return ApiResponse.error("error:" + ex);
    }        
}
