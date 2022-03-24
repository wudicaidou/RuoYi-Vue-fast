package com.ruoyi.project.quality.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 数据治理字段结果对象 governance_audit_field
 * 
 * @author cai
 * @date 2022-03-24
 */
public class GovernanceAuditField extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 行id */
    @Excel(name = "行id")
    private String rowId;

    /** 该字段初始来源 1标信订阅 2 系统反馈 3 爬虫 */
    @Excel(name = "该字段初始来源 1标信订阅 2 系统反馈 3 爬虫")
    private Integer firstDataSource;

    /** 字段那个字段演变过来 */
    @Excel(name = "字段那个字段演变过来")
    private String parentFieldId;

    /** 字段流程id问题在修复前 该id不做变更 */
    @Excel(name = "字段流程id问题在修复前 该id不做变更")
    private String fieldProcessId;

    /** 1标信审核  2 交易中心审核 */
    @Excel(name = "1标信审核  2 交易中心审核")
    private Long progress;

    /** 治理状态 1 待审核 2存在问题 3治理结束 4关闭 */
    @Excel(name = "治理状态 1 待审核 2存在问题 3治理结束 4关闭")
    private Long firstAuditStatus;

    /** 治理状态 1 待审核 2存在问题 3治理结束 4关闭 */
    @Excel(name = "治理状态 1 待审核 2存在问题 3治理结束 4关闭")
    private Long tradeAuditStatus;

    /** 问题提交时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "问题提交时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date problermCommitTime;

    /** 问题修复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "问题修复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date problermFixTime;

    /** 问题责任方 0 无 1交易中心 2招标代理 */
    @Excel(name = "问题责任方 0 无 1交易中心 2招标代理")
    private Long problemTarget;

    /** 问题责任方名称 */
    @Excel(name = "问题责任方名称")
    private String problemTargetName;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String reviewComments;

    /** 追加模式 1新增(大数据统计过来) 2 修复（基于上一版本已解决）3未解决（基于上一版本未解决） 3 累计（ app和爬虫统计过来）4 平移 */
    @Excel(name = "追加模式 1新增(大数据统计过来) 2 修复", readConverterExp = "基=于上一版本已解决")
    private Long createModel;

    /** 0无异常 1 异常  默认1 */
    @Excel(name = "0无异常 1 异常  默认1")
    private Long problemStatus;

    /** 指的是哪个字段记录存在问题 */
    @Excel(name = "指的是哪个字段记录存在问题")
    private String fieldName;

    /** 指的是哪个字段记录存在问题 中文名称 */
    @Excel(name = "指的是哪个字段记录存在问题 中文名称")
    private String fieldNameCn;

    /** 字段值 */
    @Excel(name = "字段值")
    private String fieldValue;

    /** 格式 1,2,3 含义 1缺陷、2错误、3异常 */
    @Excel(name = "格式 1,2,3 含义 1缺陷、2错误、3异常")
    private String tagId;

    /** 一级标签：分4类，1合规性、2全面性、3完整性、4准确性 */
    @Excel(name = "一级标签：分4类，1合规性、2全面性、3完整性、4准确性")
    private String firstLevelTag;

    /** 二级标签：分5类，1数据合规性、2项目全面性、3流程完整性、4数据完整性、5数据准确性 */
    @Excel(name = "二级标签：分5类，1数据合规性、2项目全面性、3流程完整性、4数据完整性、5数据准确性")
    private String secondLevelTag;

    /** 逻辑标识：表之间业务逻辑判断时使用，由问题字段所在记录对应主键联合组成，格式：左表pid_右表pid,左表pid_右表pid */
    @Excel(name = "逻辑标识：表之间业务逻辑判断时使用，由问题字段所在记录对应主键联合组成，格式：左表pid_右表pid,左表pid_右表pid")
    private String logicId;

    /** json  [{"page":"1","fileName":"2","fileFieldValue":"2","fieleUrl":"2"}] */
    @Excel(name = "fileDesc")
    private String fileDesc;

    /** 指的是哪个字段记录存在问题 */
    @Excel(name = "指的是哪个字段记录存在问题")
    private String errMsg;

    /** 问题责任人 */
    @Excel(name = "问题责任人")
    private String responsible;

    /** 问题责任人手机号码 */
    @Excel(name = "问题责任人手机号码")
    private String responsiblePhone;

    /** 已发短信内容 */
    @Excel(name = "已发短信内容")
    private String textMsg;

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

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long problermDoFixTimes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer manualAuditStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long manualGovCounter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date manualReviewTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createUserId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String problermName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date ebidsunAuditTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date platformAuditTime;

    /** 初始审核修复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "初始审核修复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstSysFixTime;

    /** 交易中心审核系统修复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交易中心审核系统修复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tradeSysFixTime;

    /** 修复该数据引用的pid，回溯用 */
    @Excel(name = "修复该数据引用的pid，回溯用")
    private String sysFixPid;

    /** 人工审核系统修复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "人工审核系统修复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date manualSysFixTime;

    /** 修复状态 0 或者null 未修复 1已修复类 */
    @Excel(name = "修复状态 0 或者null 未修复 1已修复类")
    private Long fixed;

    /** 三级标签：分2类，1基础指标、2激励指标 */
    @Excel(name = "三级标签：分2类，1基础指标、2激励指标")
    private String thirdLevelTag;

    /** 错类型：分10类，1敏感词、2逻辑问题、3空值问题、4唯一性问题、5枚举值问题、6长度问题、7范围问题、8编码问题、9日期格式问题、10精度问题 */
    @Excel(name = "错类型：分10类，1敏感词、2逻辑问题、3空值问题、4唯一性问题、5枚举值问题、6长度问题、7范围问题、8编码问题、9日期格式问题、10精度问题")
    private String errType;

    /** 字段上链时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "字段上链时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dataUploadTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String problermRules;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ebidsunDataId;

    /** 是否为测试数据 0：否，1：是 */
    @Excel(name = "是否为测试数据 0：否，1：是")
    private Integer testData;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setRowId(String rowId) 
    {
        this.rowId = rowId;
    }

    public String getRowId() 
    {
        return rowId;
    }
    public void setFirstDataSource(Integer firstDataSource) 
    {
        this.firstDataSource = firstDataSource;
    }

    public Integer getFirstDataSource() 
    {
        return firstDataSource;
    }
    public void setParentFieldId(String parentFieldId) 
    {
        this.parentFieldId = parentFieldId;
    }

    public String getParentFieldId() 
    {
        return parentFieldId;
    }
    public void setFieldProcessId(String fieldProcessId) 
    {
        this.fieldProcessId = fieldProcessId;
    }

    public String getFieldProcessId() 
    {
        return fieldProcessId;
    }
    public void setProgress(Long progress) 
    {
        this.progress = progress;
    }

    public Long getProgress() 
    {
        return progress;
    }
    public void setFirstAuditStatus(Long firstAuditStatus) 
    {
        this.firstAuditStatus = firstAuditStatus;
    }

    public Long getFirstAuditStatus() 
    {
        return firstAuditStatus;
    }
    public void setTradeAuditStatus(Long tradeAuditStatus) 
    {
        this.tradeAuditStatus = tradeAuditStatus;
    }

    public Long getTradeAuditStatus() 
    {
        return tradeAuditStatus;
    }
    public void setProblermCommitTime(Date problermCommitTime) 
    {
        this.problermCommitTime = problermCommitTime;
    }

    public Date getProblermCommitTime() 
    {
        return problermCommitTime;
    }
    public void setProblermFixTime(Date problermFixTime) 
    {
        this.problermFixTime = problermFixTime;
    }

    public Date getProblermFixTime() 
    {
        return problermFixTime;
    }
    public void setProblemTarget(Long problemTarget) 
    {
        this.problemTarget = problemTarget;
    }

    public Long getProblemTarget() 
    {
        return problemTarget;
    }
    public void setProblemTargetName(String problemTargetName) 
    {
        this.problemTargetName = problemTargetName;
    }

    public String getProblemTargetName() 
    {
        return problemTargetName;
    }
    public void setReviewComments(String reviewComments) 
    {
        this.reviewComments = reviewComments;
    }

    public String getReviewComments() 
    {
        return reviewComments;
    }
    public void setCreateModel(Long createModel) 
    {
        this.createModel = createModel;
    }

    public Long getCreateModel() 
    {
        return createModel;
    }
    public void setProblemStatus(Long problemStatus) 
    {
        this.problemStatus = problemStatus;
    }

    public Long getProblemStatus() 
    {
        return problemStatus;
    }
    public void setFieldName(String fieldName) 
    {
        this.fieldName = fieldName;
    }

    public String getFieldName() 
    {
        return fieldName;
    }
    public void setFieldNameCn(String fieldNameCn) 
    {
        this.fieldNameCn = fieldNameCn;
    }

    public String getFieldNameCn() 
    {
        return fieldNameCn;
    }
    public void setFieldValue(String fieldValue) 
    {
        this.fieldValue = fieldValue;
    }

    public String getFieldValue() 
    {
        return fieldValue;
    }
    public void setTagId(String tagId) 
    {
        this.tagId = tagId;
    }

    public String getTagId() 
    {
        return tagId;
    }
    public void setFirstLevelTag(String firstLevelTag) 
    {
        this.firstLevelTag = firstLevelTag;
    }

    public String getFirstLevelTag() 
    {
        return firstLevelTag;
    }
    public void setSecondLevelTag(String secondLevelTag) 
    {
        this.secondLevelTag = secondLevelTag;
    }

    public String getSecondLevelTag() 
    {
        return secondLevelTag;
    }
    public void setLogicId(String logicId) 
    {
        this.logicId = logicId;
    }

    public String getLogicId() 
    {
        return logicId;
    }
    public void setFileDesc(String fileDesc) 
    {
        this.fileDesc = fileDesc;
    }

    public String getFileDesc() 
    {
        return fileDesc;
    }
    public void setErrMsg(String errMsg) 
    {
        this.errMsg = errMsg;
    }

    public String getErrMsg() 
    {
        return errMsg;
    }
    public void setResponsible(String responsible) 
    {
        this.responsible = responsible;
    }

    public String getResponsible() 
    {
        return responsible;
    }
    public void setResponsiblePhone(String responsiblePhone) 
    {
        this.responsiblePhone = responsiblePhone;
    }

    public String getResponsiblePhone() 
    {
        return responsiblePhone;
    }
    public void setTextMsg(String textMsg) 
    {
        this.textMsg = textMsg;
    }

    public String getTextMsg() 
    {
        return textMsg;
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
    public void setProblermDoFixTimes(Long problermDoFixTimes) 
    {
        this.problermDoFixTimes = problermDoFixTimes;
    }

    public Long getProblermDoFixTimes() 
    {
        return problermDoFixTimes;
    }
    public void setManualAuditStatus(Integer manualAuditStatus) 
    {
        this.manualAuditStatus = manualAuditStatus;
    }

    public Integer getManualAuditStatus() 
    {
        return manualAuditStatus;
    }
    public void setManualGovCounter(Long manualGovCounter) 
    {
        this.manualGovCounter = manualGovCounter;
    }

    public Long getManualGovCounter() 
    {
        return manualGovCounter;
    }
    public void setManualReviewTime(Date manualReviewTime) 
    {
        this.manualReviewTime = manualReviewTime;
    }

    public Date getManualReviewTime() 
    {
        return manualReviewTime;
    }
    public void setCreateUserId(String createUserId) 
    {
        this.createUserId = createUserId;
    }

    public String getCreateUserId() 
    {
        return createUserId;
    }
    public void setProblermName(String problermName) 
    {
        this.problermName = problermName;
    }

    public String getProblermName() 
    {
        return problermName;
    }
    public void setEbidsunAuditTime(Date ebidsunAuditTime) 
    {
        this.ebidsunAuditTime = ebidsunAuditTime;
    }

    public Date getEbidsunAuditTime() 
    {
        return ebidsunAuditTime;
    }
    public void setPlatformAuditTime(Date platformAuditTime) 
    {
        this.platformAuditTime = platformAuditTime;
    }

    public Date getPlatformAuditTime() 
    {
        return platformAuditTime;
    }
    public void setFirstSysFixTime(Date firstSysFixTime) 
    {
        this.firstSysFixTime = firstSysFixTime;
    }

    public Date getFirstSysFixTime() 
    {
        return firstSysFixTime;
    }
    public void setTradeSysFixTime(Date tradeSysFixTime) 
    {
        this.tradeSysFixTime = tradeSysFixTime;
    }

    public Date getTradeSysFixTime() 
    {
        return tradeSysFixTime;
    }
    public void setSysFixPid(String sysFixPid) 
    {
        this.sysFixPid = sysFixPid;
    }

    public String getSysFixPid() 
    {
        return sysFixPid;
    }
    public void setManualSysFixTime(Date manualSysFixTime) 
    {
        this.manualSysFixTime = manualSysFixTime;
    }

    public Date getManualSysFixTime() 
    {
        return manualSysFixTime;
    }
    public void setFixed(Long fixed) 
    {
        this.fixed = fixed;
    }

    public Long getFixed() 
    {
        return fixed;
    }
    public void setThirdLevelTag(String thirdLevelTag) 
    {
        this.thirdLevelTag = thirdLevelTag;
    }

    public String getThirdLevelTag() 
    {
        return thirdLevelTag;
    }
    public void setErrType(String errType) 
    {
        this.errType = errType;
    }

    public String getErrType() 
    {
        return errType;
    }
    public void setDataUploadTime(Date dataUploadTime) 
    {
        this.dataUploadTime = dataUploadTime;
    }

    public Date getDataUploadTime() 
    {
        return dataUploadTime;
    }
    public void setProblermRules(String problermRules) 
    {
        this.problermRules = problermRules;
    }

    public String getProblermRules() 
    {
        return problermRules;
    }
    public void setEbidsunDataId(String ebidsunDataId) 
    {
        this.ebidsunDataId = ebidsunDataId;
    }

    public String getEbidsunDataId() 
    {
        return ebidsunDataId;
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
            .append("id", getId())
            .append("rowId", getRowId())
            .append("firstDataSource", getFirstDataSource())
            .append("parentFieldId", getParentFieldId())
            .append("fieldProcessId", getFieldProcessId())
            .append("progress", getProgress())
            .append("firstAuditStatus", getFirstAuditStatus())
            .append("tradeAuditStatus", getTradeAuditStatus())
            .append("problermCommitTime", getProblermCommitTime())
            .append("problermFixTime", getProblermFixTime())
            .append("problemTarget", getProblemTarget())
            .append("problemTargetName", getProblemTargetName())
            .append("reviewComments", getReviewComments())
            .append("createModel", getCreateModel())
            .append("problemStatus", getProblemStatus())
            .append("fieldName", getFieldName())
            .append("fieldNameCn", getFieldNameCn())
            .append("fieldValue", getFieldValue())
            .append("tagId", getTagId())
            .append("firstLevelTag", getFirstLevelTag())
            .append("secondLevelTag", getSecondLevelTag())
            .append("logicId", getLogicId())
            .append("fileDesc", getFileDesc())
            .append("errMsg", getErrMsg())
            .append("responsible", getResponsible())
            .append("responsiblePhone", getResponsiblePhone())
            .append("textMsg", getTextMsg())
            .append("extension", getExtension())
            .append("mask", getMask())
            .append("ctime", getCtime())
            .append("mtime", getMtime())
            .append("problermDoFixTimes", getProblermDoFixTimes())
            .append("manualAuditStatus", getManualAuditStatus())
            .append("manualGovCounter", getManualGovCounter())
            .append("manualReviewTime", getManualReviewTime())
            .append("createUserId", getCreateUserId())
            .append("problermName", getProblermName())
            .append("ebidsunAuditTime", getEbidsunAuditTime())
            .append("platformAuditTime", getPlatformAuditTime())
            .append("firstSysFixTime", getFirstSysFixTime())
            .append("tradeSysFixTime", getTradeSysFixTime())
            .append("sysFixPid", getSysFixPid())
            .append("manualSysFixTime", getManualSysFixTime())
            .append("fixed", getFixed())
            .append("thirdLevelTag", getThirdLevelTag())
            .append("errType", getErrType())
            .append("dataUploadTime", getDataUploadTime())
            .append("problermRules", getProblermRules())
            .append("ebidsunDataId", getEbidsunDataId())
            .append("testData", getTestData())
            .toString();
    }
}
