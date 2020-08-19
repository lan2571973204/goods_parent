package com.czxy.controller;

import com.czxy.CategoryService;
import com.czxy.GoodsService;
import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 兰锦扬 on 2020/08/12.
 */
@RestController
@RequestMapping("/good2s")
public class TestGoodsController {

    @Resource
    private CategoryService categoryService;

    /**
     * 查询所有种类
     */
    @GetMapping("/selectAllCategory")
    public List<Category> selectAllCategory(){
        //返回数据
        return categoryService.selectAll();
    }

    @Resource
    private GoodsService goodsService;

    /**
     * 查询所有产品
     */
    @GetMapping("/selectAllGoods")
    public List<Goods> selectAllGoods(){
        //查询
        List<Goods> goods = goodsService.selectAllGoods();
        //返回数据
        return goods;
    }
}
