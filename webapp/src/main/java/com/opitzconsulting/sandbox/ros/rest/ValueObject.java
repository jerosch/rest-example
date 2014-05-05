package com.opitzconsulting.sandbox.ros.rest;

import java.util.Date;
import java.util.List;

public class ValueObject {

    private long id;

    private String foo;

    private int bar;

    private Date when;

    private List<String> list;

    public ValueObject(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
                "id=" + id +
                ", foo='" + foo + '\'' +
                ", bar=" + bar +
                ", when=" + when +
                ", list=" + list +
                '}';
    }

}
