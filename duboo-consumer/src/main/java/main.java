import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: dark
 * @date: 2018/7/12
 * @desc:
 **/
public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        String s = userService.getName("dubbo world");
        System.out.println(s);
    }
}
