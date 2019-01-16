/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.CalcIndicatorRecommend;


/**
 * 特征推荐计算任务
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcIndicatorRecommendRecord extends UpdatableRecordImpl<CalcIndicatorRecommendRecord> implements Record17<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String> {

    private static final long serialVersionUID = 106451205;

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.created_by</code>. 创建人
     */
    public void setCreatedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.created_by</code>. 创建人
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.updated_by</code>. 修改人
     */
    public void setUpdatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.updated_by</code>. 修改人
     */
    public String getUpdatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.sample_table</code>. 样本表
     */
    public void setSampleTable(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.sample_table</code>. 样本表
     */
    public String getSampleTable() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.sample_key</code>. 样本关联字段
     */
    public void setSampleKey(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.sample_key</code>. 样本关联字段
     */
    public String getSampleKey() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_start_time</code>. 计算开始时间
     */
    public void setCalcStartTime(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_start_time</code>. 计算开始时间
     */
    public String getCalcStartTime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_end_time</code>. 计算结束时间
     */
    public void setCalcEndTime(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_end_time</code>. 计算结束时间
     */
    public String getCalcEndTime() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.link_name</code>. 风险/链路等名称，多个用逗号分隔
     */
    public void setLinkName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.link_name</code>. 风险/链路等名称，多个用逗号分隔
     */
    public String getLinkName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.result_table</code>. 特征推荐结果表
     */
    public void setResultTable(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.result_table</code>. 特征推荐结果表
     */
    public String getResultTable() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_sql</code>. 计算任务脚本
     */
    public void setCalcSql(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_sql</code>. 计算任务脚本
     */
    public String getCalcSql() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_node_id</code>. 计算任务节点ID
     */
    public void setCalcNodeId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_node_id</code>. 计算任务节点ID
     */
    public String getCalcNodeId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_task_id</code>. 任务实例ID
     */
    public void setCalcTaskId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_task_id</code>. 任务实例ID
     */
    public String getCalcTaskId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_status</code>. 计算任务状态： 1: "未运行",2: "等待时间", 3: "等待资源",4: "运行中",5: "运行失败",6: "运行成功"
     */
    public void setCalcStatus(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_status</code>. 计算任务状态： 1: "未运行",2: "等待时间", 3: "等待资源",4: "运行中",5: "运行失败",6: "运行成功"
     */
    public Integer getCalcStatus() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.link_code</code>. (废弃)链路code
     */
    public void setLinkCode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.link_code</code>. (废弃)链路code
     */
    public String getLinkCode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_recommend.calc_code</code>. 计算编码
     */
    public void setCalcCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_recommend.calc_code</code>. 计算编码
     */
    public String getCalcCode() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.SAMPLE_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.SAMPLE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.LINK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.RESULT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_SQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_NODE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_TASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.LINK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND.CALC_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSampleTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSampleKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCalcStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCalcEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLinkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCalcSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCalcNodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCalcTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getCalcStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getLinkCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCalcCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSampleTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSampleKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCalcStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCalcEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLinkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCalcSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCalcNodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCalcTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getCalcStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getLinkCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCalcCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value5(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value6(String value) {
        setSampleTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value7(String value) {
        setSampleKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value8(String value) {
        setCalcStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value9(String value) {
        setCalcEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value10(String value) {
        setLinkName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value11(String value) {
        setResultTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value12(String value) {
        setCalcSql(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value13(String value) {
        setCalcNodeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value14(String value) {
        setCalcTaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value15(Integer value) {
        setCalcStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value16(String value) {
        setLinkCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord value17(String value) {
        setCalcCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorRecommendRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Integer value15, String value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CalcIndicatorRecommendRecord
     */
    public CalcIndicatorRecommendRecord() {
        super(CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND);
    }

    /**
     * Create a detached, initialised CalcIndicatorRecommendRecord
     */
    public CalcIndicatorRecommendRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String createdBy, String updatedBy, String sampleTable, String sampleKey, String calcStartTime, String calcEndTime, String linkName, String resultTable, String calcSql, String calcNodeId, String calcTaskId, Integer calcStatus, String linkCode, String calcCode) {
        super(CalcIndicatorRecommend.CALC_INDICATOR_RECOMMEND);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, createdBy);
        set(4, updatedBy);
        set(5, sampleTable);
        set(6, sampleKey);
        set(7, calcStartTime);
        set(8, calcEndTime);
        set(9, linkName);
        set(10, resultTable);
        set(11, calcSql);
        set(12, calcNodeId);
        set(13, calcTaskId);
        set(14, calcStatus);
        set(15, linkCode);
        set(16, calcCode);
    }
}