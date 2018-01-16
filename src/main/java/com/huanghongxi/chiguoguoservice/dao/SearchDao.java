package com.huanghongxi.chiguoguoservice.dao;

import com.huanghongxi.chiguoguoservice.entity.SearchLog;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SearchDao {

    List<SearchLog> getHotSearch(@Param("beginTime") Date now,
                                 @Param("endTime") Date threeDayAgo);

    int addSearch(@Param("searchKey") String searchKey);
}
