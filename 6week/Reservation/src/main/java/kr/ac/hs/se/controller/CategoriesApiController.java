package kr.ac.hs.se.controller;

import kr.ac.hs.se.model.Dto.CategoryDto;
import kr.ac.hs.se.model.response.ListAllResponse;
import kr.ac.hs.se.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoriesApiController {

    private final CategoriesService categoriesService;

    @GetMapping
    public ListAllResponse<CategoryDto> getCategories() {
        return categoriesService.getCategories();
    }
}
