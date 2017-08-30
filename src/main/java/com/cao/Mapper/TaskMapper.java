package com.cao.Mapper;

import com.cao.bean.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
@Mapper
public interface TaskMapper{

    Task findTaskById( @Param("ids") Integer taskId);

    List<Task> queryAll();
}
