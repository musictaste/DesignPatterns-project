package com.mashibing.dp.cor.mycode01;

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
public class Code01 {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>,欢迎大家积极留言，大家都是996");

        //不同的过滤器组合，形成链条
        List<Filter> filters = new ArrayList<>();
        filters.add(new HtmlFilter());
        filters.add(new SentitiveFiler());

        for(Filter f:filters){
            f.doFilter(msg);
        }

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