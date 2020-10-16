package com.reservation.mapper;

import com.reservation.bean.Classification;
import com.reservation.bean.ClassificationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ClassificationMapper {
    long countByExample(ClassificationExample example);

    int deleteByExample(ClassificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classification record);

    int insertSelective(Classification record);

    List<Classification> selectByExampleWithRowbounds(ClassificationExample example, RowBounds rowBounds);

    List<Classification> selectByExample(ClassificationExample example);

    Classification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}