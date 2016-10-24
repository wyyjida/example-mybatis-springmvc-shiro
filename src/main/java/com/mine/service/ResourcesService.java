package com.mine.service;

import com.mine.dao.ArticleMapper;
import com.mine.dao.ResourcesMapper;
import com.mine.entity.Article;
import com.mine.entity.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Acting on 2016/10/14.
 */
@Service
public class ResourcesService {

    @Autowired
    private ResourcesMapper resourcesMapper;

    public Resources selectByPrimaryKey(Integer id) {
        return this.resourcesMapper.selectByPrimaryKey(id);
    }

}
