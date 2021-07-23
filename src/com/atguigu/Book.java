package com.atguigu;

/**
 * @author sunxt
 * @create 2021-07-21 17:22
 */
public class Book {
    private String bname;
    private String bauthor;

    public String getBname() {
        return bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    //set注入设置属性
    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;

    }

    public void setBname(String bname) {
        this.bname = bname;
    }
    public void testDemo(){
        System.out.println(bname+bauthor);
    }
}
