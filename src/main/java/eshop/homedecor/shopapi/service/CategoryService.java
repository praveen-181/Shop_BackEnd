package eshop.homedecor.shopapi.service;

import java.util.List;

import eshop.homedecor.shopapi.entity.ProductCategory;

/**
 * Created By Praveen
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
