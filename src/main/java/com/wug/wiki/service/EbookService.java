package com.wug.wiki.service;

import com.wug.wiki.domain.Ebook;
import com.wug.wiki.domain.EbookExample;
import com.wug.wiki.mapper.EbookMapper;
import com.wug.wiki.req.EbookReq;
import com.wug.wiki.resp.EbookResp;
import com.wug.wiki.utils.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample=new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();// Criteria相当于where条件
        criteria.andNameLike("%"+req.getName()+"%"); // 模糊匹配
        List<Ebook> ebookList=ebookMapper.selectByExample(ebookExample);

//        // 从ebook拷贝到ebookresp里去
//        List<EbookResp> respList=new ArrayList<>();     // 新建一个list对象
//        for (Ebook ebook : ebookList) {
//            // 对Ebook列表进行迭代，然后拷贝到EbookResp这个List里去
////            EbookResp ebookResp=new EbookResp();    // 1、新建一个接收对象
////            BeanUtils.copyProperties(ebook,ebookResp);  // 2、使用Spring提供的BeanUitls.copyProperties()，参数为传递对象和接收对象
//              // 对象赋值
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class); // source是一个对象，目标是一个类
//
//            respList.add(ebookResp);    // 3、将对象传递给respList
//
//        }

        // 列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);   // 用工具类代替上面注释掉的代码

        return list;


    }
}
