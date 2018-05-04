package com.wuhongyu.mapper;

import com.wuhongyu.entity.Malfunction;
import com.wuhongyu.entity.MalfunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MalfunctionMapper {
    int countByExample(MalfunctionExample example);

    int deleteByExample(MalfunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Malfunction record);

    int insertSelective(Malfunction record);

    List<Malfunction> selectByExample(MalfunctionExample example);

    Malfunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Malfunction record, @Param("example") MalfunctionExample example);

    int updateByExample(@Param("record") Malfunction record, @Param("example") MalfunctionExample example);

    int updateByPrimaryKeySelective(Malfunction record);

    int updateByPrimaryKey(Malfunction record);

    List<Malfunction> selectAll(@Param("oldid")Integer oldid);

}