package cn.f8888138.Mapper;

import cn.f8888138.view.TbBlogger;
import cn.f8888138.view.TbBloggerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBloggerMapper {
    int countByExample(TbBloggerExample example);

    int deleteByExample(TbBloggerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlogger record);

    int insertSelective(TbBlogger record);

    List<TbBlogger> selectByExampleWithBLOBs(TbBloggerExample example);

    List<TbBlogger> selectByExample(TbBloggerExample example);

    TbBlogger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlogger record, @Param("example") TbBloggerExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBlogger record, @Param("example") TbBloggerExample example);

    int updateByExample(@Param("record") TbBlogger record, @Param("example") TbBloggerExample example);

    int updateByPrimaryKeySelective(TbBlogger record);

    int updateByPrimaryKeyWithBLOBs(TbBlogger record);

    int updateByPrimaryKey(TbBlogger record);
}