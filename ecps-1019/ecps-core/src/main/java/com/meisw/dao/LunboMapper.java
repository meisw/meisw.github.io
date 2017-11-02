package com.meisw.dao;

import com.meisw.po.Lunbo;

public interface LunboMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lunbo record);

    int insertSelective(Lunbo record);

    Lunbo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lunbo record);

    int updateByPrimaryKey(Lunbo record);
}