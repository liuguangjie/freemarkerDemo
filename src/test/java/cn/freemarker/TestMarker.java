package cn.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by free on 17-2-11.
 */
public class TestMarker {

    @Test
    public void testOut() throws  Exception{
        Map<String,Object> rootMap=new HashMap<String, Object>();
        rootMap.put("user","liujie");
        rootMap.put("date",new Date());
        Configuration configuration=new Configuration();

        Template template=configuration.getTemplate("src/main/resources/test.ftl");
        StringWriter out=new StringWriter();

        template.process(rootMap,out);

        System.out.println(out.toString());
    }
}
