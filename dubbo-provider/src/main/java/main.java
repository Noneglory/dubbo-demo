import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @auther: dark
 * @date: 2018/7/12
 * @desc:
 **/
public class main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ctx.start();
        System.in.read();
    }
}
