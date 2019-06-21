package cn.ddw.goodsServiceImpl.controller;

import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.apiService.goodsService.entity.Type;
import cn.ddw.apiService.goodsService.serivce.CommodityService;
import cn.ddw.goodsServiceImpl.service.GoodService;
import cn.ddw.goodsServiceImpl.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XRZ
 * @date 2019/6/20
 * @Description :
 */
@RestController
@RequestMapping("/com")
public class CommodityImp implements CommodityService,GoodsTypeService{

    @Autowired
    private GoodService goodService;

    @Autowired
    private GoodsTypeService goodsTypeService;

    @Override
    @RequestMapping("/getCom/{id}")
    public Commodity getCommodityById(@PathVariable("id") Integer Id) {
        return goodService.getCommodityById(Id);
    }

    @Override
    @RequestMapping("/get/all")
    public List<Commodity> getCommodityAll() {
        return goodService.getAll();
    }

    @Override
    @GetMapping("/goods/typeAll/{tid}")
    public List<Commodity> getCommodityType(@PathVariable("tid")Integer t_id) {
        goodService.getCommodityType(t_id).forEach(a-> System.out.println(a));
        return goodService.getCommodityType(t_id);
    }

    @Override
    @RequestMapping("/type")
    public Type getGoodsType() {
        return goodsTypeService.getGoodsType();
    }
}
