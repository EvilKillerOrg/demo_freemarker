package com.ek.demo.test1;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 测试命名空间 
 */
public class Test3 {
  
  public static void main(String[] args) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
    cfg.setDirectoryForTemplateLoading(new File("templates"));
    Template t1 = cfg.getTemplate("c.ftl");
    
    Map<String, Object> map = new HashMap<String, Object>();
    
    Writer out = new OutputStreamWriter(System.out);
    
    t1.process(map, out);
    
    out.flush();
    out.close();
  }
}
