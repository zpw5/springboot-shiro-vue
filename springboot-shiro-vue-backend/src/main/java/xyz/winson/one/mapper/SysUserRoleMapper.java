package xyz.winson.one.mapper;

import xyz.winson.one.model.entity.SysUserRole;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    int deleteByPrimaryKey(Long userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    int insertSelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    SysUserRole selectByPrimaryKey(Long userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Fri Sep 27 13:31:36 CST 2019
     */
    int updateByPrimaryKey(SysUserRole record);
}