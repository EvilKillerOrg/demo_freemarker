package com.ek.demo.test1;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import freemarker.template.Configuration;
import freemarker.template.Template;
/**
 * 基本操作 if指令,list指令,include指令
 */
public class Test1 {

  public static void main(String[] args) throws Exception {

    /* 创建Freemarker配置实例 */
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
    cfg.setDirectoryForTemplateLoading(new File("templates")); // 加载模板路径
   
    /* 加载模板文件 */
    Template t1 = cfg.getTemplate("a.ftl");

    /* 创建数据模型(是一种树状数据模型,类似XML,只有一个根节点) */
    Map<String, Object> root = new HashMap<String, Object>();
    root.put("user", "老二"); // 字符串
    root.put("num", new Random().nextInt(100)); // 数字
    List<Address> list = new ArrayList<Address>();
    list.add(new Address("美国", "西雅图"));
    list.add(new Address("法国", "巴黎"));
    list.add(new Address("中国", "西安"));
    root.put("adds", list); // 集合


    /* 显示生产的数据 */
    Writer out = new OutputStreamWriter(System.out);
    t1.process(root, out);
    
    out.flush();
    out.close();
  }

}
