/**
 * @auther: dark
 * @date: 2018/7/12
 * @desc:
 **/
public class UserServiceImpl implements UserService {
    public String getName(String name) {
        System.out.println("hello " + name);
        return name;
    }
}
