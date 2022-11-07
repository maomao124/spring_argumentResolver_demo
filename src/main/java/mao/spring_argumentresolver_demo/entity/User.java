package mao.spring_argumentresolver_demo.entity;

/**
 * Project name(项目名称)：spring_argumentResolver_demo
 * Package(包名): mao.spring_argumentresolver_demo.entity
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/7
 * Time(创建时间)： 21:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class User
{

    private Long id;
    private String username;

    /**
     * Instantiates a new User.
     */
    public User()
    {

    }

    /**
     * Instantiates a new User.
     *
     * @param id       the id
     * @param username the username
     */
    public User(Long id, String username)
    {
        this.id = id;
        this.username = username;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    @Override
    public String toString()
    {
        String sb = "User{" + "id=" + id +
                ", username='" + username + '\'' +
                '}';
        return sb;
    }
}
