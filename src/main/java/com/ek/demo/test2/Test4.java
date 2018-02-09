package com.ek.demo.test2;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 测试内建函数
 */
public class Test4 {

  public static void main(String[] args) throws Exception {

    Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
    cfg.setDirectoryForTemplateLoading(new File("templates"));
    Template template = cfg.getTemplate("d.ftl");

    Map<String, Object> map = new HashMap<String, Object>();
    map.put("hhh", "<b>粗粗粗</b>");

    Writer out = new OutputStreamWriter(System.out);

    template.process(map, out);

    out.flush();
    out.close();

  }

}
