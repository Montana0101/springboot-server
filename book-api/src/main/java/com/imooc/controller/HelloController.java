package com.imooc.controller;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.model.Stu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "测试文档1")
@RestController
public class HelloController {

    @ApiOperation(value="这是一个hello的测试录路由")
    @GetMapping("hello")
    public Object hello (){
        Stu stu = new Stu("imooc",18);
        log.info(stu.toString());
        log.warn(stu.toString());
        return GraceJSONResult.ok(stu);
    }
}
