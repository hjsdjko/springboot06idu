package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuqutongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuqutongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuqutongzhiView;


/**
 * 录取通知
 *
 * @author 
 * @email 
 * @date 2022-03-12 20:42:35
 */
public interface LuqutongzhiService extends IService<LuqutongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuqutongzhiVO> selectListVO(Wrapper<LuqutongzhiEntity> wrapper);
   	
   	LuqutongzhiVO selectVO(@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);
   	
   	List<LuqutongzhiView> selectListView(Wrapper<LuqutongzhiEntity> wrapper);
   	
   	LuqutongzhiView selectView(@Param("ew") Wrapper<LuqutongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuqutongzhiEntity> wrapper);
   	

}

