package com.jsyjy.tcms.mapper;

import com.jsyjy.tcms.pojo.Tandc;
import com.jsyjy.tcms.pojo.TandcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TandcMapper {
    int countByExample(TandcExample example);

    int deleteByExample(TandcExample example);

    int insert(Tandc record);

    int insertSelective(Tandc record);

    List<Tandc> selectByExample(TandcExample example);

    int updateByExampleSelective(@Param("record") Tandc record, @Param("example") TandcExample example);

    int updateByExample(@Param("record") Tandc record, @Param("example") TandcExample example);
}