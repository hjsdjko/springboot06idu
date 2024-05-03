package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyebaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyebaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyebaomingView;


/**
 * 专业报名
 *
 * @author 
 * @email 
 * @date 2022-03-12 20:42:35
 */
public interface ZhuanyebaomingService extends IService<ZhuanyebaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyebaomingVO> selectListVO(Wrapper<ZhuanyebaomingEntity> wrapper);
   	
   	ZhuanyebaomingVO selectVO(@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);
   	
   	List<ZhuanyebaomingView> selectListView(Wrapper<ZhuanyebaomingEntity> wrapper);
   	
   	ZhuanyebaomingView selectView(@Param("ew") Wrapper<ZhuanyebaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyebaomingEntity> wrapper);
   	

}

