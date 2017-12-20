package com.golaxy.converter.entity.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by yangzongze on 2017/12/1.
 *
 * http/websocket响应
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseResult {

    private Integer code;

    private String msg;
    /** websocket交互唯一标示 **/
    private String uid;
    /** 队列长度 **/
    private Integer waitqueue;
    /** 文章名字 **/
    private String article_name;
    /** 上传进度：0-100 **/
    private Integer progress;
    /** 上传速度：100KB/s **/
    private String speed;
    /** 图片列表 **/
    List<ConverterResult> imgList;
    /** md列表 **/
    List<ConverterResult> mdList;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getWaitqueue() {
        return waitqueue;
    }

    public void setWaitqueue(Integer waitqueue) {
        this.waitqueue = waitqueue;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public List<ConverterResult> getImgList() {
        return imgList;
    }

    public void setImgList(List<ConverterResult> imgList) {
        this.imgList = imgList;
    }

    public List<ConverterResult> getMdList() {
        return mdList;
    }

    public void setMdList(List<ConverterResult> mdList) {
        this.mdList = mdList;
    }
}
