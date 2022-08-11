package cn.pojo;

public class Client {
    /**
     * 客户编号
     */
    private int c_id;
    /**
     * 客户账号
     */
    private String client_name;
    /**
     *客户密码
     */
    private String client_pwd;
    /**
     * 客户性别
     */
    private String client_sex;
    /**
     * 客户身份证
     */
    private String client_idcard;
    /**
     *客户电话
     */
    private String client_phone;
    /**
     * 客户地址
     */
    private String client_address;
    /**
     * 客户预算价格
     */
    private String client_budget;
    /**
     * 客户要去
     */
    private String client_requirement;
    /**
     * 客户购房时间
     */
    private int client_time;
    /**
     * 销售员编号
     */
    private int Employee_id;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_pwd() {
        return client_pwd;
    }

    public void setClient_pwd(String client_pwd) {
        this.client_pwd = client_pwd;
    }

    public String getClient_sex() {
        return client_sex;
    }

    public void setClient_sex(String client_sex) {
        this.client_sex = client_sex;
    }

    public String getClient_idcard() {
        return client_idcard;
    }

    public void setClient_idcard(String client_idcard) {
        this.client_idcard = client_idcard;
    }

    public String getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(String client_phone) {
        this.client_phone = client_phone;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public String getClient_budget() {
        return client_budget;
    }

    public void setClient_budget(String client_budget) {
        this.client_budget = client_budget;
    }

    public String getClient_requirement() {
        return client_requirement;
    }

    public void setClient_requirement(String client_requirement) {
        this.client_requirement = client_requirement;
    }

    public int getClient_time() {
        return client_time;
    }

    public void setClient_time(int client_time) {
        this.client_time = client_time;
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }
}
