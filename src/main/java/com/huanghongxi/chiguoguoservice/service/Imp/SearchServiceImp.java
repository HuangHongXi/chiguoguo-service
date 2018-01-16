package com.huanghongxi.chiguoguoservice.service.Imp;

import com.huanghongxi.chiguoguoservice.dao.SearchDao;
import com.huanghongxi.chiguoguoservice.entity.SearchLog;
import com.huanghongxi.chiguoguoservice.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SearchServiceImp implements SearchService {

    @Resource
    private SearchDao searchDao;

    @Override
    public int addSearch(String searchKey) {
        return searchDao.addSearch(searchKey);
    }

    @Override
    public List<SearchLog> getHotSearch() {
        Date now = new Date();
        Date threeDayAgo = new Date(now.getTime() - (long) 3 * 24 * 60 * 60 * 1000);

        return searchDao.getHotSearch(threeDayAgo,now) ;
    }
}
