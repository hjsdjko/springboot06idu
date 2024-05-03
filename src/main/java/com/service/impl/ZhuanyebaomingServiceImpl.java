package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuanyebaomingDao;
import com.entity.ZhuanyebaomingEntity;
import com.service.ZhuanyebaomingService;
import com.entity.vo.ZhuanyebaomingVO;
import com.entity.view.ZhuanyebaomingView;

@Service("zhuanyebaomingService")
public class ZhuanyebaomingServiceImpl extends ServiceImpl<ZhuanyebaomingDao, ZhuanyebaomingEntity> implements ZhuanyebaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyebaomingEntity> page = this.selectPage(
                new Query<ZhuanyebaomingEntity>(params).getPage(),
                new EntityWrapper<ZhuanyebaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyebaomingEntity> wrapper) {
		  Page<ZhuanyebaomingView> page =new Query<ZhuanyebaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyebaomingVO> selectListVO(Wrapper<ZhuanyebaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyebaomingVO selectVO(Wrapper<ZhuanyebaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyebaomingView> selectListView(Wrapper<ZhuanyebaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyebaomingView selectView(Wrapper<ZhuanyebaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
