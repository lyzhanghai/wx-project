package com.data;

import com.domain.wx.AccessToken;
import com.domain.wx.AccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int countByExample(AccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int deleteByExample(AccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int insert(AccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int insertSelective(AccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    List<AccessToken> selectByExample(AccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    AccessToken selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int updateByExampleSelective(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int updateByExample(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int updateByPrimaryKeySelective(AccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accesstoken
     *
     * @mbggenerated Sat Mar 11 17:23:30 CST 2017
     */
    int updateByPrimaryKey(AccessToken record);
}