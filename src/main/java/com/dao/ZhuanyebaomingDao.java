package com.dao;

import com.entity.ZhuanyebaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyebaomingVO;
import com.entity.view.ZhuanyebaomingView;


/**
 * 专业报名
 * 
 * @author 
 * @email 
 * @date 2022-03-12 20:42:35
 */
public interface ZhuanyebaomingDao extends BaseMapper<ZhuanyebaomingEntity> {
	
	List<ZhuanyebaomingVO> selectListVO(@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);
	
	ZhuanyebaomingVO selectVO(@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);
	
	List<ZhuanyebaomingView> selectListView(@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);

	List<ZhuanyebaomingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);
	
	ZhuanyebaomingView selectView(@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);
	

}
