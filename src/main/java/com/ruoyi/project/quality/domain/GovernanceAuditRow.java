package com.ruoyi.project.quality.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 数据治理行结果对象 governance_aduit_row
 * 
 * @author cai
 * @date 2022-03-24
 */
public class GovernanceAuditRow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String rowId;

    /** 该行。是基于上一个版本行的处理 */
    @Excel(name = "该行。是基于上一个版本行的处理")
    private String parentRowId;

    /** 逻辑版本 数据的当前版本- 新数据过来，版本加1 */
    @Excel(name = "逻辑版本 数据的当前版本- 新数据过来，版本加1")
    private Long logicVersion;

    /** 主数据id ,格式 平台id_manId 串联一条数据的所有版本 */
    @Excel(name = "主数据id ,格式 平台id_manId 串联一条数据的所有版本")
    private String mainKeyId;

    /** 表的唯一编号(源表名称-源表主键-数据类型) 大数据表主键 */
    @Excel(name = "表的唯一编号(源表名称-源表主键-数据类型) 大数据表主键")
    private String pid;

    /** 目录链源表名称：由交易中心和表明联合组成，格式：交易中心-表名 */
    @Excel(name = "目录链源表名称：由交易中心和表明联合组成，格式：交易中心-表名")
    private String sourceTableNameTag;

    /** 目录链表名 */
    @Excel(name = "目录链表名")
    private String sourceTableName;

    /** 目录链表中文名 */
    @Excel(name = "目录链表中文名")
    private String sourceTableNameCn;

    /** 数据记录id  来自ebidsun_data_id */
    @Excel(name = "数据记录id  来自ebidsun_data_id")
    private String sourceDataId;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private String projectCode;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 招标项目编号 */
    @Excel(name = "招标项目编号")
    private String tenderProjectCode;

    /** 招标项目编号 */
    @Excel(name = "招标项目编号")
    private String tenderProjectName;

    /** 标段编号 */
    @Excel(name = "标段编号")
    private String sectionCode;

    /** 标段名称 */
    @Excel(name = "标段名称")
    private String sectionName;

    /** 业务类型:1工程，2采购 */
    @Excel(name = "业务类型:1工程，2采购")
    private Long businessType;

    /** 国家公共资源中心发布的数据规范版本，默认“v4.0” */
    @Excel(name = "国家公共资源中心发布的数据规范版本，默认“v4.0”")
    private String dataVersion;

    /** 上传主体：数据上传交易中心（地市级） */
    @Excel(name = "上传主体：数据上传交易中心", readConverterExp = "地=市级")
    private String platformId;

    /** 枚举值  1 规则引擎，2 文本校验 */
    @Excel(name = "枚举值  1 规则引擎，2 文本校验")
    private Long dataType;

    /** 该条错误数据版本,1,2,3等枚举值 */
    @Excel(name = "该条错误数据版本,1,2,3等枚举值")
    private Long version;

    /** 数据来源 1标信订阅 2系统反馈 3爬虫 */
    @Excel(name = "数据来源 1标信订阅 2系统反馈 3爬虫")
    private Long dataSource;

    /** 错误字段具体信息 */
    @Excel(name = "错误字段具体信息")
    private String errDetail;

    /** 爬虫时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "爬虫时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date crawlerTime;

    /** 服务机构名称 */
    @Excel(name = "服务机构名称")
    private String platformName;

    /** 服务机构代码 */
    @Excel(name = "服务机构代码")
    private String platformCode;

    /** 平台数据质量监督部门 */
    @Excel(name = "平台数据质量监督部门")
    private String platformDepartment;

    /** 平台数据质量监督人 */
    @Excel(name = "平台数据质量监督人")
    private String platformResponsible;

    /** 平台数据质量监督人手机号码 */
    @Excel(name = "平台数据质量监督人手机号码")
    private String platformResponsiblePhone;

    /** 数据责任机构 */
    @Excel(name = "数据责任机构")
    private String platformResponsibleUnit;

    /** 数据责任机构代码 */
    @Excel(name = "数据责任机构代码")
    private String dataResponsibleCode;

    /** 数据责任人 */
    @Excel(name = "数据责任人")
    private String dataResponsible;

    /** 数据责任人手机号码 */
    @Excel(name = "数据责任人手机号码")
    private String dataResponsiblePhone;

    /** 扩展 */
    @Excel(name = "扩展")
    private String extension;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mask;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date ctime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date mtime;

    /** 是否为最大logic_version 0：否，1：是 */
    @Excel(name = "是否为最大logic_version 0：否，1：是")
    private Integer maxLogicVersion;

    /** 是否为测试数据 0：否，1：是 */
    @Excel(name = "是否为测试数据 0：否，1：是")
    private Integer testData;

    public void setRowId(String rowId) 
    {
        this.rowId = rowId;
    }

    public String getRowId() 
    {
        return rowId;
    }
    public void setParentRowId(String parentRowId) 
    {
        this.parentRowId = parentRowId;
    }

    public String getParentRowId() 
    {
        return parentRowId;
    }
    public void setLogicVersion(Long logicVersion) 
    {
        this.logicVersion = logicVersion;
    }

    public Long getLogicVersion() 
    {
        return logicVersion;
    }
    public void setMainKeyId(String mainKeyId) 
    {
        this.mainKeyId = mainKeyId;
    }

    public String getMainKeyId() 
    {
        return mainKeyId;
    }
    public void setPid(String pid) 
    {
        this.pid = pid;
    }

    public String getPid() 
    {
        return pid;
    }
    public void setSourceTableNameTag(String sourceTableNameTag) 
    {
        this.sourceTableNameTag = sourceTableNameTag;
    }

    public String getSourceTableNameTag() 
    {
        return sourceTableNameTag;
    }
    public void setSourceTableName(String sourceTableName) 
    {
        this.sourceTableName = sourceTableName;
    }

    public String getSourceTableName() 
    {
        return sourceTableName;
    }
    public void setSourceTableNameCn(String sourceTableNameCn) 
    {
        this.sourceTableNameCn = sourceTableNameCn;
    }

    public String getSourceTableNameCn() 
    {
        return sourceTableNameCn;
    }
    public void setSourceDataId(String sourceDataId) 
    {
        this.sourceDataId = sourceDataId;
    }

    public String getSourceDataId() 
    {
        return sourceDataId;
    }
    public void setProjectCode(String projectCode) 
    {
        this.projectCode = projectCode;
    }

    public String getProjectCode() 
    {
        return projectCode;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setTenderProjectCode(String tenderProjectCode) 
    {
        this.tenderProjectCode = tenderProjectCode;
    }

    public String getTenderProjectCode() 
    {
        return tenderProjectCode;
    }
    public void setTenderProjectName(String tenderProjectName) 
    {
        this.tenderProjectName = tenderProjectName;
    }

    public String getTenderProjectName() 
    {
        return tenderProjectName;
    }
    public void setSectionCode(String sectionCode) 
    {
        this.sectionCode = sectionCode;
    }

    public String getSectionCode() 
    {
        return sectionCode;
    }
    public void setSectionName(String sectionName) 
    {
        this.sectionName = sectionName;
    }

    public String getSectionName() 
    {
        return sectionName;
    }
    public void setBusinessType(Long businessType) 
    {
        this.businessType = businessType;
    }

    public Long getBusinessType() 
    {
        return businessType;
    }
    public void setDataVersion(String dataVersion) 
    {
        this.dataVersion = dataVersion;
    }

    public String getDataVersion() 
    {
        return dataVersion;
    }
    public void setPlatformId(String platformId) 
    {
        this.platformId = platformId;
    }

    public String getPlatformId() 
    {
        return platformId;
    }
    public void setDataType(Long dataType) 
    {
        this.dataType = dataType;
    }

    public Long getDataType() 
    {
        return dataType;
    }
    public void setVersion(Long version) 
    {
        this.version = version;
    }

    public Long getVersion() 
    {
        return version;
    }
    public void setDataSource(Long dataSource) 
    {
        this.dataSource = dataSource;
    }

    public Long getDataSource() 
    {
        return dataSource;
    }
    public void setErrDetail(String errDetail) 
    {
        this.errDetail = errDetail;
    }

    public String getErrDetail() 
    {
        return errDetail;
    }
    public void setCrawlerTime(Date crawlerTime) 
    {
        this.crawlerTime = crawlerTime;
    }

    public Date getCrawlerTime() 
    {
        return crawlerTime;
    }
    public void setPlatformName(String platformName) 
    {
        this.platformName = platformName;
    }

    public String getPlatformName() 
    {
        return platformName;
    }
    public void setPlatformCode(String platformCode) 
    {
        this.platformCode = platformCode;
    }

    public String getPlatformCode() 
    {
        return platformCode;
    }
    public void setPlatformDepartment(String platformDepartment) 
    {
        this.platformDepartment = platformDepartment;
    }

    public String getPlatformDepartment() 
    {
        return platformDepartment;
    }
    public void setPlatformResponsible(String platformResponsible) 
    {
        this.platformResponsible = platformResponsible;
    }

    public String getPlatformResponsible() 
    {
        return platformResponsible;
    }
    public void setPlatformResponsiblePhone(String platformResponsiblePhone) 
    {
        this.platformResponsiblePhone = platformResponsiblePhone;
    }

    public String getPlatformResponsiblePhone() 
    {
        return platformResponsiblePhone;
    }
    public void setPlatformResponsibleUnit(String platformResponsibleUnit) 
    {
        this.platformResponsibleUnit = platformResponsibleUnit;
    }

    public String getPlatformResponsibleUnit() 
    {
        return platformResponsibleUnit;
    }
    public void setDataResponsibleCode(String dataResponsibleCode) 
    {
        this.dataResponsibleCode = dataResponsibleCode;
    }

    public String getDataResponsibleCode() 
    {
        return dataResponsibleCode;
    }
    public void setDataResponsible(String dataResponsible) 
    {
        this.dataResponsible = dataResponsible;
    }

    public String getDataResponsible() 
    {
        return dataResponsible;
    }
    public void setDataResponsiblePhone(String dataResponsiblePhone) 
    {
        this.dataResponsiblePhone = dataResponsiblePhone;
    }

    public String getDataResponsiblePhone() 
    {
        return dataResponsiblePhone;
    }
    public void setExtension(String extension) 
    {
        this.extension = extension;
    }

    public String getExtension() 
    {
        return extension;
    }
    public void setMask(Long mask) 
    {
        this.mask = mask;
    }

    public Long getMask() 
    {
        return mask;
    }
    public void setCtime(Date ctime) 
    {
        this.ctime = ctime;
    }

    public Date getCtime() 
    {
        return ctime;
    }
    public void setMtime(Date mtime) 
    {
        this.mtime = mtime;
    }

    public Date getMtime() 
    {
        return mtime;
    }
    public void setMaxLogicVersion(Integer maxLogicVersion) 
    {
        this.maxLogicVersion = maxLogicVersion;
    }

    public Integer getMaxLogicVersion() 
    {
        return maxLogicVersion;
    }
    public void setTestData(Integer testData) 
    {
        this.testData = testData;
    }

    public Integer getTestData() 
    {
        return testData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rowId", getRowId())
            .append("parentRowId", getParentRowId())
            .append("logicVersion", getLogicVersion())
            .append("mainKeyId", getMainKeyId())
            .append("pid", getPid())
            .append("sourceTableNameTag", getSourceTableNameTag())
            .append("sourceTableName", getSourceTableName())
            .append("sourceTableNameCn", getSourceTableNameCn())
            .append("sourceDataId", getSourceDataId())
            .append("projectCode", getProjectCode())
            .append("projectName", getProjectName())
            .append("tenderProjectCode", getTenderProjectCode())
            .append("tenderProjectName", getTenderProjectName())
            .append("sectionCode", getSectionCode())
            .append("sectionName", getSectionName())
            .append("businessType", getBusinessType())
            .append("dataVersion", getDataVersion())
            .append("platformId", getPlatformId())
            .append("dataType", getDataType())
            .append("version", getVersion())
            .append("dataSource", getDataSource())
            .append("errDetail", getErrDetail())
            .append("crawlerTime", getCrawlerTime())
            .append("platformName", getPlatformName())
            .append("platformCode", getPlatformCode())
            .append("platformDepartment", getPlatformDepartment())
            .append("platformResponsible", getPlatformResponsible())
            .append("platformResponsiblePhone", getPlatformResponsiblePhone())
            .append("platformResponsibleUnit", getPlatformResponsibleUnit())
            .append("dataResponsibleCode", getDataResponsibleCode())
            .append("dataResponsible", getDataResponsible())
            .append("dataResponsiblePhone", getDataResponsiblePhone())
            .append("extension", getExtension())
            .append("mask", getMask())
            .append("ctime", getCtime())
            .append("mtime", getMtime())
            .append("maxLogicVersion", getMaxLogicVersion())
            .append("testData", getTestData())
            .toString();
    }
}
