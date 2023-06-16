package com.oxcentra.menumaster.services;

import com.oxcentra.menumaster.model.SubCategories;
import com.oxcentra.menumaster.model.SubCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SubCategoryService {
    List<SubCategory> getSubCategoriesByCategoryId(Integer id);

    Optional<SubCategory> getSubCategoryById(Integer id);

    Boolean addSubCategory(SubCategories subCategories);

    Boolean updateSubCategory(SubCategories subCategories);

    Boolean deleteSubCategory(Integer id);
}
