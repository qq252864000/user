package com.authority.common;

import com.authority.exception.UserException;
import com.authority.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 05:32
 * @Description: 全局异常处理
 */
@Slf4j
public class SpringExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse rResponse, Object o, Exception e) {
        String url = request.getRequestURI();
        ModelAndView mv = null;
        String error = "System error";

        if (url.endsWith(".json")) {
            if (e instanceof UserException) {
                ResultVO resultVO = ResultVO.fail(e.getMessage());
                mv = new ModelAndView("jsonView",resultVO.toMap());
            } else {
                log.error("[.json全局异常处理] e={}",e);
                ResultVO resultVO = ResultVO.fail(e.getMessage());
                mv = new ModelAndView("exception",resultVO.toMap());
            }
        } else if (url.endsWith(".page")){
            log.error("[.json全局异常处理] e={}",e);
            ResultVO resultVO = ResultVO.fail(e.getMessage());
            mv = new ModelAndView("exception",resultVO.toMap());
        } else{
            log.error("[.json全局异常处理] e={}",e);
            ResultVO resultVO = ResultVO.fail(e.getMessage());
            mv = new ModelAndView("jsonView",resultVO.toMap());
        }
        return mv;
    }
}
