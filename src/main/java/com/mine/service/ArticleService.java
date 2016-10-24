package com.mine.service;

import com.mine.entity.Article;

/**
 * Created by Acting on 2016/10/19.
 */
public interface ArticleService {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}
