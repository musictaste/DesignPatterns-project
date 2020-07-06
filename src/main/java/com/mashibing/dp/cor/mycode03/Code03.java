package com.mashibing.dp.cor.mycode03;

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
public class Code03 {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>,欢迎大家访问www.baidu.com，大家都是996");

        FilterChain fc  = new FilterChain();
        /*fc.add(new HtmlFilter());
        fc.add(new SentitiveFiler());*/

        //链式编程
        fc.add(new HtmlFilter())
                .add(new SentitiveFiler());

        FilterChain fc2 = new FilterChain();
        fc2.add(new FaceFiler()).add(new URLFiler());

        //直接将第二个责任链，加入第一个责任链
        fc.add(fc2);

        fc.doFilter(msg);

        System.out.println(msg);

    }

}

class Msg{
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

//采用过滤器
interface Filter{
    void doFilter(Msg msg);
}

//定义不同的过滤器
class HtmlFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s=s.replace("<","[");
        s=s.replace(">","]");
        msg.setMsg(s);
    }
}

class SentitiveFiler implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s=s.replaceAll("996","995");
        msg.setMsg(s);
    }
}

class FaceFiler implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s=s.replace(":)","^V^");
        msg.setMsg(s);
    }
}

class URLFiler implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s=s.replace("www.baidu.com","http://www.baidu.com");
        msg.setMsg(s);
    }
}

//责任链类，也实现Filter接口
class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    //链式编程
    //return this;把当前对象返回
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Msg msg){
        for(Filter f:filters){
            f.doFilter(msg);
        }
    }
}