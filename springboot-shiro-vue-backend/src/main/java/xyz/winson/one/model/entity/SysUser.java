package xyz.winson.one.model.entity;

import java.util.Date;

/**
 * @author Winson One
 * @date 2019年09月27日 19:10
 * 系统用户实体模型
 */
public class SysUser {
    /**
     * 用户ID，自增主键
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Long id;

    /**
     * 用户名，登录名称
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.username
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private String username;

    /**
     * 用户昵称
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.nickname
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private String nickname;

    /**
     * 密码
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.password
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private String password;

    /**
     * 加密盐值
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.salt
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private String salt;

    /**
     * 手机号码
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.mobile
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private String mobile;

    /**
     * 电子邮箱
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.email
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private String email;

    /**
     * 用户状态
     * 1：有效，0：禁用
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.state
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Integer state;

    /**
     * 是否已删除
     * 1：是，0否
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.is_delete
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Byte isDelete;

    /**
     * 创建人ID
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.create_user_id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Long createUserId;

    /**
     * 创建时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.create_time
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Date createTime;

    /**
     * 修改人ID
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.update_user_id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Long updateUserId;

    /**
     * 修改时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user.update_time
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.id
     *
     * @return the value of t_sys_user.id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.id
     *
     * @param id the value for t_sys_user.id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.username
     *
     * @return the value of t_sys_user.username
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.username
     *
     * @param username the value for t_sys_user.username
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.nickname
     *
     * @return the value of t_sys_user.nickname
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.nickname
     *
     * @param nickname the value for t_sys_user.nickname
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.password
     *
     * @return the value of t_sys_user.password
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.password
     *
     * @param password the value for t_sys_user.password
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.salt
     *
     * @return the value of t_sys_user.salt
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.salt
     *
     * @param salt the value for t_sys_user.salt
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.mobile
     *
     * @return the value of t_sys_user.mobile
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.mobile
     *
     * @param mobile the value for t_sys_user.mobile
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.email
     *
     * @return the value of t_sys_user.email
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.email
     *
     * @param email the value for t_sys_user.email
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.state
     *
     * @return the value of t_sys_user.state
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.state
     *
     * @param state the value for t_sys_user.state
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.is_delete
     *
     * @return the value of t_sys_user.is_delete
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.is_delete
     *
     * @param isDelete the value for t_sys_user.is_delete
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.create_user_id
     *
     * @return the value of t_sys_user.create_user_id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.create_user_id
     *
     * @param createUserId the value for t_sys_user.create_user_id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.create_time
     *
     * @return the value of t_sys_user.create_time
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.create_time
     *
     * @param createTime the value for t_sys_user.create_time
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.update_user_id
     *
     * @return the value of t_sys_user.update_user_id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.update_user_id
     *
     * @param updateUserId the value for t_sys_user.update_user_id
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user.update_time
     *
     * @return the value of t_sys_user.update_time
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user.update_time
     *
     * @param updateTime the value for t_sys_user.update_time
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}