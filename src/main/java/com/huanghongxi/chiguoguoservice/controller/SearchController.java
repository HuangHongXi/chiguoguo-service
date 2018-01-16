package com.huanghongxi.chiguoguoservice.controller;

import com.huanghongxi.chiguoguoservice.entity.SearchLog;
import com.huanghongxi.chiguoguoservice.service.SearchService;
import com.huanghongxi.chiguoguoservice.system.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping
    public Response addSearchLog(String searchKey) {

        int result = searchService.addSearch(searchKey);
        return result > 0 ? new Response().success() : new Response().failure();
    }

    @GetMapping("hot")
    public Response getHotSearch() {
        List<SearchLog> result = searchService.getHotSearch();
        return new Response<>().success(result);
    }
}
