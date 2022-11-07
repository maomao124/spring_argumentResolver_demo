package mao.spring_argumentresolver_demo.resolver;

import mao.spring_argumentresolver_demo.CurrentUser;
import mao.spring_argumentresolver_demo.entity.User;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Project name(项目名称)：spring_argumentResolver_demo
 * Package(包名): mao.spring_argumentresolver_demo.resolver
 * Class(类名): CurrentUserMethodArgumentResolver
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/7
 * Time(创建时间)： 21:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver
{
    @Override
    public boolean supportsParameter(MethodParameter parameter)
    {
        //如果Controller的方法参数类型为User同时还加入了CurrentUser注解，则返回true
        if (parameter.getParameterType().equals(User.class) &&
                parameter.hasParameterAnnotation(CurrentUser.class))
        {
            return true;
        }
        return false;
    }

    //当supportsParameter方法返回true时执行此方法
    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) throws Exception
    {
        //此处直接模拟了一个User对象，实际项目中可能需要从请求头中获取登录用户的令牌然后进行解析，
        //最终封装成User对象返回即可，这样在Controller的方法形参就可以直接引用到User对象了
        User user = new User(1L, "张三");
        return user;
    }
}
