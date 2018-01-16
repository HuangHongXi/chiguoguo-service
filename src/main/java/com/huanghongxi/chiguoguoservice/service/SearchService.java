package com.huanghongxi.chiguoguoservice.service;

import com.huanghongxi.chiguoguoservice.entity.SearchLog;

import java.util.List;

public interface SearchService {

    int addSearch(String searchKey);

    List<SearchLog> getHotSearch();
}
