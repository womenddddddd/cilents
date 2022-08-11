package cn.pojo;

public class Communication {
    /**
     * 编号
     */
    private int id;
    /**
     * 销售员编号
     */
    private int s_id;
    /**
     * 客户编号
     */
    private int c_id;
    /**
     * 管理员姓名
     */
    private String c_name;
    /**
     * 管理员密码
     */
    private String c_pwd;
    /**
     * 交流时间
     */
    private int time;
    /**
     * 交流信息
     */
    private String information;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_pwd() {
        return c_pwd;
    }

    public void setC_pwd(String c_pwd) {
        this.c_pwd = c_pwd;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
