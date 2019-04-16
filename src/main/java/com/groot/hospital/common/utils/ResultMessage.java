package com.groot.hospital.common.utils;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.ArrayList;
import java.util.List;

public class ResultMessage {
    public boolean success;
    public int code;
    public List rows=new ArrayList();
    public long total=0;
    public long count;

    public long currentPage;
    public String message="异常未注释";
    public Object data;

    public static ResultMessage failure(){
        ResultMessage resultMessage=new ResultMessage();
        resultMessage.success=false;
        return resultMessage;
    }
    public static ResultMessage success(){
        ResultMessage resultMessage=new ResultMessage();
        resultMessage.success=true;
        return resultMessage;
    }

    public ResultMessage setPage(Page page){
        rows=page.getRecords();
        total=page.getTotal();
        return this;
    }

    public ResultMessage setPage(int page, List list){
        rows=list;
        total=page;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public ResultMessage setCode(int code) {
        this.code = code;
        return this;
    }

    public List getRows() {
        return rows;
    }

    public ResultMessage setRows(List rows) {
        this.rows = rows;
        return this;
    }

    public long getTotal() {
        return total;
    }

    public ResultMessage setTotal(long total) {
        this.total = total;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResultMessage setData(Object data) {
        this.data = data;
        return this;
    }

    public long getCount() {
        return count;
    }

    public ResultMessage setCount(long count) {
        this.count = count;
        return this;
    }
    public long getCurrentPage() {
        return currentPage;
    }

    public ResultMessage setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
        return this;
    }

}
