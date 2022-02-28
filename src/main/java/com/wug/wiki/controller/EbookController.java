package com.wug.wiki.controller;

import com.wug.wiki.domain.Ebook;
import com.wug.wiki.req.EbookReq;
import com.wug.wiki.resp.CommonResp;
import com.wug.wiki.resp.EbookResp;
import com.wug.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    // ***** 在controller层不要见到实体类，如果要用，那就新建一个副本 *****

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        // 传递电子书的名称，进行模糊查询
        // 如果要传递给函数的参数很多，这样写死了只有一个参数就明显不够，就需要专门封装一个类来处理传递进来的对应实体的各种参数
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list=ebookService.list(req);

        resp.setContent(list);

        return resp;
    }
}
