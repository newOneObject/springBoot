package com.cao.Controller;

import com.cao.Service.StartService;
import com.cao.bean.Task;
import com.cao.returnDto.ReturnDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping("/start")
public class startContrlloer {

    @Autowired
    private StartService startService;

    /**
     * 获取指定id的任务信息
     * @param id
     * @return
     */
    @GetMapping(value = "queryById/{id}")
    @ResponseBody
    public ReturnDto queryById(@PathVariable("id") Integer id){
        try {
            Task task = startService.findTaskById(id);
            if(task!=null) {
                return ReturnDto.buildSuccessReturnDto(task);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("id未找到");
        }
        return  ReturnDto.buildFailedReturnDto("获取task任务信息失败");
    }


    /**
     *获取任务列表
     * @return
     * @throws Exception
     */
    @GetMapping(value = "getList")
    @ResponseBody
    public ReturnDto getList() throws Exception {

        try {
            List<Task> tasks = startService.queryAll();
            if(tasks!=null&& tasks.size()!=0) {
                return ReturnDto.buildSuccessReturnDto(tasks);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("列表查询异常");
        }
        return  ReturnDto.buildFailedReturnDto("未获取到列表信息");
    }

}
