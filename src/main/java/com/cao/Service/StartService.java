package com.cao.Service;

import com.cao.Mapper.TaskMapper;
import com.cao.bean.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
@Service
public class StartService {

    @Autowired
    private TaskMapper taskMapper ;

    public Task findTaskById(Integer taskId) throws Exception{
        return taskMapper.findTaskById(taskId);
    }

    public List<Task> queryAll() throws Exception{
        return taskMapper.queryAll();
    }


}
