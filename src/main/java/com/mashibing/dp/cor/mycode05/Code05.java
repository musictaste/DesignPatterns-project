package com.mashibing.dp.cor.mycode05;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Code01
 * 问题：
 *   论坛中发表文章
 *   后台要经过信息处理才可以发表或进入数据库
 * @Author 李淼
 * @Date 2020/6/20
 * @Version V1.0
 **/
public class Code05 {

    public static void main(String[] args) {
        FilterChain fc  = new FilterChain();

        //链式编程
        fc.add(new HtmlFilter())
                .add(new SentitiveFiler());
        System.out.println("");

    }

}

class Request{
    String str;
}

class Response{
    String str;
}

//采用过滤器
interface Filter{
    boolean doFilter(Request request,Response response);
}

//定义不同的过滤器
class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request request,Response response) {
        return false;
    }
}

class SentitiveFiler implements Filter {
    @Override
    public boolean doFilter(Request request,Response response) {
        return false;
    }
}

//责任链类，也实现Filter接口
class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    //链式编程
    //return this;把当前对象返回
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request,Response response){
        return false;
    }
}