package com.bam.todos.mapper;

import com.bam.todos.model.Memo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper extends BaseMapper<Memo> {
}
