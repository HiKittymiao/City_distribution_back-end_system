package org.example.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author mcy
 * @since 2022-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("web_address")
@ApiModel(value="Address对象", description="")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增定位id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "发送者用户名")
    @TableField("s_name")
    private String sName;

    @ApiModelProperty(value = "发送者电话号码")
    @TableField("s_phone")
    private String sPhone;

    @ApiModelProperty(value = "发送者地址")
    @TableField("s_address")
    private String sAddress;

    @ApiModelProperty(value = "发送者经度地址")
    @TableField("s_longitude")
    private Double sLongitude;

    @ApiModelProperty(value = "发送者维度地址")
    @TableField("s_latitude")
    private Double sLatitude;

    @ApiModelProperty(value = "需要送达的接受用户名字")
    @TableField("r_name")
    private String rName;

    @ApiModelProperty(value = "接收者电话号码")
    @TableField("r_phone")
    private String rPhone;

    @ApiModelProperty(value = "接收者目的地址")
    @TableField("r_address")
    private String rAddress;

    @ApiModelProperty(value = "接收者目的地经度")
    @TableField("r_longitude")
    private Double rLongitude;

    @ApiModelProperty(value = "接收者目的地纬度")
    @TableField("r_latitude")
    private Double rLatitude;

    @ApiModelProperty(value = "0为正常使用1为已删除")
    @TableField("del_flag")
    private Integer delFlag;


}