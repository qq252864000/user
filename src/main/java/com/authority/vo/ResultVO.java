package com.authority.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 05:49
 * @Description: 返回前端对象
 */
@Data
public class ResultVO {

    private boolean ret;

    private Integer code;

    private String msg;

    private Object data;

    public ResultVO(boolean ret) {
        this.ret = ret;
    }

    public static ResultVO success(){
        return new ResultVO(true);
    }

    public static ResultVO success(String msg){
        ResultVO resultVO = new ResultVO(true);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO(true);
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO fail(String msg) {
        ResultVO resultVO = new ResultVO(false);
        resultVO.setMsg(msg);
        resultVO.setCode(500);
        return resultVO;
    }

    public Map<String, Object> toMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("ret",ret);
        map.put("code",code);
        map.put("data",data);
        return map;
    }
}
