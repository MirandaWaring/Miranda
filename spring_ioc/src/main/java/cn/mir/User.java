package cn.mir;

public class User {
    private Integer id;
    private String username;
    private String loadname;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", loadname='" + loadname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoadname() {
        return loadname;
    }

    public void setLoadname(String loadname) {
        this.loadname = loadname;
    }

    public User(Integer id, String username, String loadname) {
        this.id = id;
        this.username = username;
        this.loadname = loadname;
    }

    public User() {
        System.out.println("User 已加载！");
    }
}
