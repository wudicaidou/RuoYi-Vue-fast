package com.ruoyi.project.quality.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 全面性问题关闭对象 ads_gzh_comprehensive_detail_daily
 *
 * @author cai
 * @date 2022-04-25
 */
public class ComprehensiveDetailDaily extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 交易中心编码
     */
    @Excel(name = "交易中心编码")
    private String platformId;

    /**
     * 交易中心名称
     */
    @Excel(name = "交易中心名称")
    private String platformName;

    /**
     * 业务交易中心编码
     */
    @Excel(name = "业务交易中心编码")
    private String platformCode;

    /**
     * 业务类型
     */
    @Excel(name = "业务类型")
    private Integer businessType;

    /**
     * 业务类型名称：1工程2采购
     */
    @Excel(name = "业务类型名称：1工程2采购")
    private String businessName;

    /**
     * 公告类型
     */
    @Excel(name = "公告类型")
    private Integer noticeType;

    /**
     * 公告名称
     */
    @Excel(name = "公告名称")
    private String noticeName;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date noticeTime;

    /**
     * 网站地址
     */
    @Excel(name = "网站地址")
    private String noticeUrl;

    /**
     * 公告标题
     */
    @Excel(name = "公告标题")
    private String noticeTitle;

    /**
     * 建设项目编码
     */
    @Excel(name = "建设项目编码")
    private String projectCode;

    /**
     * 建设项目名称
     */
    @Excel(name = "建设项目名称")
    private String projectName;

    /**
     * 招标项目编码
     */
    @Excel(name = "招标项目编码")
    private String tenderProjectCode;

    /**
     * 项目名称
     */
    @Excel(name = "项目名称")
    private String tenderProjectName;

    /**
     * 标段编码
     */
    @Excel(name = "标段编码")
    private String sectionCode;

    /**
     * 标段名称
     */
    @Excel(name = "标段名称")
    private String sectionName;

    /**
     * 全面性检测结果
     */
    @Excel(name = "全面性检测结果")
    private Integer compreResult;

    /**
     * 日失效数据标识:1有效0失效
     */
    @Excel(name = "日失效数据标识:1有效0失效")
    private Integer dayState;

    /**
     * 月失效数据标识:1有效0失效
     */
    @Excel(name = "月失效数据标识:1有效0失效")
    private Integer monthState;

    /**
     * 年失效数据标识:1有效0失效
     */
    @Excel(name = "年失效数据标识:1有效0失效")
    private Integer yearState;

    /**
     * 汇总失效数据标识:1有效0失效
     */
    @Excel(name = "汇总失效数据标识:1有效0失效")
    private Integer totalState;

    /**
     * 全面性修复结果
     */
    @Excel(name = "全面性修复结果")
    private Integer repairResult;

    /**
     * 招标项目上链时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "招标项目上链时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date tenderProjectUploadTime;

    /**
     * 招标项目块信息
     */
    @Excel(name = "招标项目块信息")
    private String tenderProjectBlockInfo;

    /**
     * 标段上链时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "标段上链时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date sectionUploadTime;

    /**
     * 标段块信息
     */
    @Excel(name = "标段块信息")
    private String sectionBlockInfo;

    /**
     * 建设项目上链时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "建设项目上链时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date projectUploadTime;

    /**
     * 建设项目块信息
     */
    @Excel(name = "建设项目块信息")
    private String projectBlockInfo;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String extention;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer mask;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date ctime;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
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

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
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

    public void setCompreResult(Integer compreResult) {
        this.compreResult = compreResult;
    }

    public Integer getCompreResult() {
        return compreResult;
    }

    public void setDayState(Integer dayState) {
        this.dayState = dayState;
    }

    public Integer getDayState() {
        return dayState;
    }

    public void setMonthState(Integer monthState) {
        this.monthState = monthState;
    }

    public Integer getMonthState() {
        return monthState;
    }

    public void setYearState(Integer yearState) {
        this.yearState = yearState;
    }

    public Integer getYearState() {
        return yearState;
    }

    public void setTotalState(Integer totalState) {
        this.totalState = totalState;
    }

    public Integer getTotalState() {
        return totalState;
    }

    public void setRepairResult(Integer repairResult) {
        this.repairResult = repairResult;
    }

    public Integer getRepairResult() {
        return repairResult;
    }

    public void setTenderProjectUploadTime(Date tenderProjectUploadTime) {
        this.tenderProjectUploadTime = tenderProjectUploadTime;
    }

    public Date getTenderProjectUploadTime() {
        return tenderProjectUploadTime;
    }

    public void setTenderProjectBlockInfo(String tenderProjectBlockInfo) {
        this.tenderProjectBlockInfo = tenderProjectBlockInfo;
    }

    public String getTenderProjectBlockInfo() {
        return tenderProjectBlockInfo;
    }

    public void setSectionUploadTime(Date sectionUploadTime) {
        this.sectionUploadTime = sectionUploadTime;
    }

    public Date getSectionUploadTime() {
        return sectionUploadTime;
    }

    public void setSectionBlockInfo(String sectionBlockInfo) {
        this.sectionBlockInfo = sectionBlockInfo;
    }

    public String getSectionBlockInfo() {
        return sectionBlockInfo;
    }

    public void setProjectUploadTime(Date projectUploadTime) {
        this.projectUploadTime = projectUploadTime;
    }

    public Date getProjectUploadTime() {
        return projectUploadTime;
    }

    public void setProjectBlockInfo(String projectBlockInfo) {
        this.projectBlockInfo = projectBlockInfo;
    }

    public String getProjectBlockInfo() {
        return projectBlockInfo;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getExtention() {
        return extention;
    }

    public void setMask(Integer mask) {
        this.mask = mask;
    }

    public Integer getMask() {
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
                .append("platformCode", getPlatformCode())
                .append("businessType", getBusinessType())
                .append("businessName", getBusinessName())
                .append("noticeType", getNoticeType())
                .append("noticeName", getNoticeName())
                .append("noticeTime", getNoticeTime())
                .append("noticeUrl", getNoticeUrl())
                .append("noticeTitle", getNoticeTitle())
                .append("projectCode", getProjectCode())
                .append("projectName", getProjectName())
                .append("tenderProjectCode", getTenderProjectCode())
                .append("tenderProjectName", getTenderProjectName())
                .append("sectionCode", getSectionCode())
                .append("sectionName", getSectionName())
                .append("compreResult", getCompreResult())
                .append("dayState", getDayState())
                .append("monthState", getMonthState())
                .append("yearState", getYearState())
                .append("totalState", getTotalState())
                .append("repairResult", getRepairResult())
                .append("tenderProjectUploadTime", getTenderProjectUploadTime())
                .append("tenderProjectBlockInfo", getTenderProjectBlockInfo())
                .append("sectionUploadTime", getSectionUploadTime())
                .append("sectionBlockInfo", getSectionBlockInfo())
                .append("projectUploadTime", getProjectUploadTime())
                .append("projectBlockInfo", getProjectBlockInfo())
                .append("extention", getExtention())
                .append("mask", getMask())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .toString();
    }
}
