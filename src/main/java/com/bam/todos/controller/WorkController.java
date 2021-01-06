package com.bam.todos.controller;

import com.bam.todos.mapper.WorkMapper;
import com.bam.todos.model.JResult;
import com.bam.todos.model.Work;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.catalina.util.ServerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping(value = "/work")
public class WorkController {
    @Autowired
    private WorkMapper workMapper;

    private QueryWrapper queryWrapper;

    /**
     * 获取工作
     */
    @RequestMapping(value={"/doing", "/active", "/completed", "/all"})
    public List<Work> getWorks(HttpServletRequest req) throws IOException {
        List<Work> works = new ArrayList<>();

        //获取uri路径
        String[] uris = req.getServletPath().split("/");
        String uri = uris[uris.length-1];

        //确定工作项目状态码
        short status = -1;
        if (uri.equals("active")){
            status = 0;
        } else if(uri.equals("doing")) {
            status = 1;
        } else if(uri.equals("completed")) {
            status = 2;
        }

        queryWrapper = new QueryWrapper<Work>();
        if(status > -1){
            queryWrapper.eq("status", status);
        }
        works = workMapper.selectList(queryWrapper);

        return works;
    }

    /**
     * 添加新工作
     * @param work
     * @return
     */
    @PostMapping
    public JResult addWork(@RequestBody Work work) throws Exception{
        workMapper.insert(work);

        JResult res = new JResult();
        res.setCode(1);
        res.setMsg("OK");
        return res;
    }

    /**
     * 更改id指定的工作
     * @param work
     * @return
     */
    @PutMapping
    public JResult delWork(@RequestBody Work work) throws Exception{
        workMapper.updateById(work);

        JResult res = new JResult();
        res.setCode(1);
        res.setMsg("OK");
        return res;
    }

    /**
     * 删除id指定的工作
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public JResult delWork(@PathVariable("id") int id){
        workMapper.deleteById(id);

        JResult res = new JResult();
        res.setCode(1);
        res.setMsg("OK");
        return res;
    }

}
