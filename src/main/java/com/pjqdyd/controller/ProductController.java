package com.pjqdyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
 * @Description:  [产品Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 商品添加页面
     * @return
     */
    @RequestMapping("/add")
    public String add(){
        return "product/add";
    }

    /**
     * 商品更新页面
     * @return
     */
    @RequestMapping("/update")
    public String update(){
        return "product/update";
    }

    /**
     * 商品查询列表页面
     * @return
     */
    @RequestMapping("/list")
    public String list(){
        return "product/list";
    }

    /**
     * 商品删除页面
     * @return
     */
    @RequestMapping("/delete")
    public String delete(){
        return "product/delete";
    }

}
