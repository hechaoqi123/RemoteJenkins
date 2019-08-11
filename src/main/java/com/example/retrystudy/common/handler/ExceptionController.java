package com.example.retrystudy.common.handler;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务器请求异常时，默认转发路径/error
 *     缺点：不能处理异常信息（不推荐）
 * @author hcq
 * @date 2019/7/19 22:25
 */
@Deprecated
@RestController
public class ExceptionController implements ErrorController {

    /**
     * 默认错误
     */
    private static final String path_default = "/error";

    @Override
    public String getErrorPath() {
        return path_default;
    }
    /**
     * JSON格式错误信息
     */
    @RequestMapping(value = path_default,  produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map error(HttpServletRequest request) {
        //RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        Map map=new HashMap();
        map.put("code","99");
        map.put("msg","请求异常");
        return map;
    }
}
