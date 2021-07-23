package com.atguigu;

/**
 * @author shkstart
 * @create 2021-07-23 9:21
 */
public class Orders {
    private String oname;
    private String addres;
    //有参构造
    public Orders(String oname, String addres) {
        this.oname = oname;
        this.addres = addres;
    }
    public void ordersTest(){
        System.out.println(oname+addres);
    }

}
