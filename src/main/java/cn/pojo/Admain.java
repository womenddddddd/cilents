package cn.pojo;

public class Admain {
    /**
     * 管理员编号
     */
    private int a_id;
    /**
     * 管理员姓名
     */
    private String a_name;
    /**
     * 管理员密码
     */
    private String a_pwd;
    /**
     * 管理员权限
     */
    private int a_mark;

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_pwd() {
        return a_pwd;
    }

    public void setA_pwd(String a_pwd) {
        this.a_pwd = a_pwd;
    }

    public int getA_mark() {
        return a_mark;
    }

    public void setA_mark(int a_mark) {
        this.a_mark = a_mark;
    }
}
