package cn.f8888138.Mapper;

import cn.f8888138.view.TbBlogtype;
import cn.f8888138.view.TbBlogtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBlogtypeMapper {
    int countByExample(TbBlogtypeExample example);

    int deleteByExample(TbBlogtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlogtype record);

    int insertSelective(TbBlogtype record);

    List<TbBlogtype> selectByExample(TbBlogtypeExample example);

    TbBlogtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlogtype record, @Param("example") TbBlogtypeExample example);

    int updateByExample(@Param("record") TbBlogtype record, @Param("example") TbBlogtypeExample example);

    int updateByPrimaryKeySelective(TbBlogtype record);

    int updateByPrimaryKey(TbBlogtype record);
}