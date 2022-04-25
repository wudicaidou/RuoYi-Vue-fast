package com.ruoyi.project.quality.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 业务流程完整性问题修复对象 ads_gzh_compelete_process_detail_daily
 *
 * @author cai
 * @date 2022-04-25
 */
public class CompeleteProcessDetailDaily extends BaseEntity {
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
     * 业务类型
     */
    @Excel(name = "业务类型")
    private String businessName;

    /**
     * 招标项目编码
     */
    @Excel(name = "招标项目编码")
    private String tenderProjectCode;

    /**
     * 招标项目名称
     */
    @Excel(name = "招标项目名称")
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
     * 项目进展（结束表名）
     */
    @Excel(name = "项目进展", readConverterExp = "结=束表名")
    private String finishTable;

    /**
     * 项目进展（结束表英文名）
     */
    @Excel(name = "项目进展", readConverterExp = "结=束表英文名")
    private String finishTableEn;

    /**
     * 流程表名
     */
    @Excel(name = "流程表名")
    private String allTable;

    /**
     * 流程表英文名
     */
    @Excel(name = "流程表英文名")
    private String allTableEn;

    /**
     * 是否应上链
     */
    @Excel(name = "是否应上链")
    private Integer needFlag;

    /**
     * 是否上链
     */
    @Excel(name = "是否上链")
    private Integer chainFlag;

    /**
     * 修复结果
     */
    @Excel(name = "修复结果")
    private Integer repairFlag;

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
     * 成交/终止公告块信息
     */
    @Excel(name = "成交/终止公告块信息")
    private String blockInfo;

    /**
     * 成交/终止公告上链时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "成交/终止公告上链时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date uploadTime;

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

    public void setFinishTable(String finishTable) {
        this.finishTable = finishTable;
    }

    public String getFinishTable() {
        return finishTable;
    }

    public void setFinishTableEn(String finishTableEn) {
        this.finishTableEn = finishTableEn;
    }

    public String getFinishTableEn() {
        return finishTableEn;
    }

    public void setAllTable(String allTable) {
        this.allTable = allTable;
    }

    public String getAllTable() {
        return allTable;
    }

    public void setAllTableEn(String allTableEn) {
        this.allTableEn = allTableEn;
    }

    public String getAllTableEn() {
        return allTableEn;
    }

    public void setNeedFlag(Integer needFlag) {
        this.needFlag = needFlag;
    }

    public Integer getNeedFlag() {
        return needFlag;
    }

    public void setChainFlag(Integer chainFlag) {
        this.chainFlag = chainFlag;
    }

    public Integer getChainFlag() {
        return chainFlag;
    }

    public void setRepairFlag(Integer repairFlag) {
        this.repairFlag = repairFlag;
    }

    public Integer getRepairFlag() {
        return repairFlag;
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

    public void setBlockInfo(String blockInfo) {
        this.blockInfo = blockInfo;
    }

    public String getBlockInfo() {
        return blockInfo;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Date getUploadTime() {
        return uploadTime;
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
                .append("tenderProjectCode", getTenderProjectCode())
                .append("tenderProjectName", getTenderProjectName())
                .append("sectionCode", getSectionCode())
                .append("sectionName", getSectionName())
                .append("finishTable", getFinishTable())
                .append("finishTableEn", getFinishTableEn())
                .append("allTable", getAllTable())
                .append("allTableEn", getAllTableEn())
                .append("needFlag", getNeedFlag())
                .append("chainFlag", getChainFlag())
                .append("repairFlag", getRepairFlag())
                .append("dayState", getDayState())
                .append("monthState", getMonthState())
                .append("yearState", getYearState())
                .append("totalState", getTotalState())
                .append("blockInfo", getBlockInfo())
                .append("uploadTime", getUploadTime())
                .append("extention", getExtention())
                .append("mask", getMask())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .toString();
    }
}
