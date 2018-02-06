package com.qwm.springmvcclearn.controller;

import com.qwm.springmvcclearn.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: wiming
 * @date: 2018-02-06 16:06:28  星期二
 * @decription: 商品列表的控制器
 */
public class ItemListController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //使用静态数据将商品信息显示在jsp页面上
        //商品列表
        List<Items> itemsList = new ArrayList<>();

        Items items1 = new Items();
        items1.setName("xx笔记本电脑");
        items1.setPrice(15600f);
        items1.setDetail("xx笔记电脑，最牛逼的电脑");
        items1.setCreatetime(new Date());

        Items items2 = new Items();
        items2.setName("yy牌香皂");
        items2.setPrice(9.9f);
        items2.setDetail("想你想入非非的香皂");
        items2.setCreatetime(new Date());

        itemsList.add(items1);
        itemsList.add(items2);

        //创建ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("itemsList",itemsList);
        //指定跳转的界面
        modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");

        return modelAndView;
    }
}
