package com.ek.demo.test1;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 自定义指令(macro宏指令)主要作用是拼接内容,把宏内部的字符串展示出来,return返回值没有意义。
 * 函数 返回值才是最关键的结果,不是为了显示函数内部的字符串内容。
 * 嵌套指令 (nested)
 * 定义变量 (assign)
 * 数据类型
 * 日期格式化 
 * freemarker 处理空值
 */
public class Test2 {

  public static void main(String[] args) throws Exception {

    Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
    cfg.setDirectoryForTemplateLoading(new File("templates"));

    Template t1 = cfg.getTemplate("b.ftl");
    
    Map<String, Object> map = new HashMap<String, Object>();
    
    Writer out = new OutputStreamWriter(System.out);
    
    t1.process(map, out);
    
    out.flush();
    out.close();
  }
}