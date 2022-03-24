package com.ruoyi.project.quality.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 测试数据黑名单对象 dw_governance_project_black_list
 *
 * @author cai
 * @date 2022-03-24
 */
public class GovernanceProjectBlackList extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private String id;

    /**
     * 数据上传交易中心编码
     */
    @Excel(name = "交易中心编码(非必填)", width = 24)
    private String platformId;

    /**
     * 数据上传交易中心名称
     */
    //@Excel(name = "数据上传交易中心名称")
    private String platformName;

    /**
     * 业务类型
     */
    //@Excel(name = "业务类型")
    private Long businessType;

    /**
     * 业务类型
     */
    //@Excel(name = "业务类型")
    private String businessName;

    /**
     * catalog数据ID
     */
    //@Excel(name = "catalog数据ID")
    private String ebidsunDataId;

    /**
     * catalog表名
     */
    //@Excel(name = "catalog表名")
    private String catalogTableName;

    /**
     * 招标项目编号
     */
    @Excel(name = "项目编号(必填)", width = 30)
    private String tenderProjectCode;

    /**
     * 招标项目名称
     */
    //@Excel(name = "招标项目名称")
    private String tenderProjectName;

    /**
     * 标段编号
     */
    @Excel(name = "标段编号(必填,多个用英文逗号分隔)", width = 100)
    private String sectionCode;

    /**
     * 标段名称
     */
    //@Excel(name = "标段名称")
    private String sectionName;

    /**
     * 数据版本
     */
    //@Excel(name = "数据版本")
    private String version;

    /**
     * $column.columnComment
     */
    private String extention;

    /**
     * $column.columnComment
     */
    private Long mask;

    /**
     * $column.columnComment
     */
    private Date ctime;

    /**
     * $column.columnComment
     */
    private Date mtime;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setBusinessType(Long businessType) {
        this.businessType = businessType;
    }

    public Long getBusinessType() {
        return businessType;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setEbidsunDataId(String ebidsunDataId) {
        this.ebidsunDataId = ebidsunDataId;
    }

    public String getEbidsunDataId() {
        return ebidsunDataId;
    }

    public void setCatalogTableName(String catalogTableName) {
        this.catalogTableName = catalogTableName;
    }

    public String getCatalogTableName() {
        return catalogTableName;
    }

    public void setTenderProjectCode(String tenderProjectCode) {
        this.tenderProjectCode = tenderProjectCode;
    }

    public String getTenderProjectCode() {
        return tenderProjectCode;
    }

    public void setTenderProjectName(String tenderProjectName) {
        this.tenderProjectName = tenderProjectName;
    }

    public String getTenderProjectName() {
        return tenderProjectName;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getExtention() {
        return extention;
    }

    public void setMask(Long mask) {
        this.mask = mask;
    }

    public Long getMask() {
        return mask;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Date getMtime() {
        return mtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("platformId", getPlatformId())
                .append("platformName", getPlatformName())
                .append("businessType", getBusinessType())
                .append("businessName", getBusinessName())
                .append("ebidsunDataId", getEbidsunDataId())
                .append("catalogTableName", getCatalogTableName())
                .append("tenderProjectCode", getTenderProjectCode())
                .append("tenderProjectName", getTenderProjectName())
                .append("sectionCode", getSectionCode())
                .append("sectionName", getSectionName())
                .append("version", getVersion())
                .append("extention", getExtention())
                .append("mask", getMask())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .toString();
    }
}
