package cn.ddw.goodsServiceImpl.controller;

import cn.ddw.apiService.goodsService.entity.Arrays;
import cn.ddw.apiService.goodsService.entity.Commodity;
import cn.ddw.apiService.goodsService.entity.Type;
import cn.ddw.apiService.goodsService.serivce.CommodityService;
import cn.ddw.apiService.goodsService.serivce.GoodsTypesService;
import cn.ddw.goodsServiceImpl.service.ArraysService;
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
public class CommodityImp implements CommodityService, GoodsTypesService {

    @Autowired
    private GoodService goodService;

    @Autowired
    private GoodsTypeService goodsTypeService;

    @Autowired
    private ArraysService arraysService;

    @Override
    @RequestMapping("/getCom/{uid}")
    public Commodity getCommodityById(@PathVariable("uid") Integer Id) {
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
        return goodService.getCommodityType(t_id);
    }

    @Override
    @RequestMapping("/type")
    public Type getGoodsType() {
        return goodsTypeService.getGoodsType();
    }

    @RequestMapping("/Evl/{e_id}")
    public List<Arrays> getArraysByid(@PathVariable("e_id")Integer e_id){
        return arraysService.getArryById(e_id);
    }
}
