package com.po;

/**
 * @Author wuhl
 * @Date 2019/12/1 22:35
 */

public class po {
    //select *  from department; d_id d_department d_name
    public Integer d_id;
    public String d_department;
    public String d_name;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_department() {
        return d_department;
    }

    public void setD_department(String d_department) {
        this.d_department = d_department;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    @Override
    public String toString() {
        return "id:="+this.d_id+
                "deparment:="+this.d_department+
                "d_name:="+this.getD_name();
    }
}
