/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.AirbusAlgoScheduleJob;


/**
 * 离线引擎算法调度job
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusAlgoScheduleJobRecord extends UpdatableRecordImpl<AirbusAlgoScheduleJobRecord> implements Record18<ULong, Timestamp, Timestamp, String, String, Timestamp, Timestamp, String, String, String, String, String, String, Long, String, Integer, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 249847526;

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.status</code>. 状态
     */
    public void setStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.status</code>. 状态
     */
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.algo_sql</code>. 执行算法的sql
     */
    public void setAlgoSql(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.algo_sql</code>. 执行算法的sql
     */
    public String getAlgoSql() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.begin_time</code>. 任务开始时间
     */
    public void setBeginTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.begin_time</code>. 任务开始时间
     */
    public Timestamp getBeginTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.end_time</code>. 任务结束时间
     */
    public void setEndTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.end_time</code>. 任务结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.result_table</code>. 算法结果表
     */
    public void setResultTable(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.result_table</code>. 算法结果表
     */
    public String getResultTable() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.result_table_partition</code>. 算法结果表分区
     */
    public void setResultTablePartition(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.result_table_partition</code>. 算法结果表分区
     */
    public String getResultTablePartition() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.operator</code>. 执行人
     */
    public void setOperator(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.operator</code>. 执行人
     */
    public String getOperator() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.operator_id</code>. 执行人id
     */
    public void setOperatorId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.operator_id</code>. 执行人id
     */
    public String getOperatorId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.instance_id</code>. odps实例
     */
    public void setInstanceId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.instance_id</code>. odps实例
     */
    public String getInstanceId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.result_statistics</code>. 任务运行结果统计
     */
    public void setResultStatistics(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.result_statistics</code>. 任务运行结果统计
     */
    public String getResultStatistics() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.algo_schedule_id</code>. 算法调度的id
     */
    public void setAlgoScheduleId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.algo_schedule_id</code>. 算法调度的id
     */
    public Long getAlgoScheduleId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.algo_schedule_content</code>. job对应的算法调度内容
     */
    public void setAlgoScheduleContent(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.algo_schedule_content</code>. job对应的算法调度内容
     */
    public String getAlgoScheduleContent() {
        return (String) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.algo_type</code>. 算法类型
     */
    public void setAlgoType(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.algo_type</code>. 算法类型
     */
    public Integer getAlgoType() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.cpu_cost</code>. cpu消耗
     */
    public void setCpuCost(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.cpu_cost</code>. cpu消耗
     */
    public BigDecimal getCpuCost() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_algo_schedule_job.mem_cost</code>. memory消耗
     */
    public void setMemCost(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_algo_schedule_job.mem_cost</code>. memory消耗
     */
    public BigDecimal getMemCost() {
        return (BigDecimal) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<ULong, Timestamp, Timestamp, String, String, Timestamp, Timestamp, String, String, String, String, String, String, Long, String, Integer, BigDecimal, BigDecimal> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<ULong, Timestamp, Timestamp, String, String, Timestamp, Timestamp, String, String, String, String, String, String, Long, String, Integer, BigDecimal, BigDecimal> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.ALGO_SQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.BEGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.RESULT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.RESULT_TABLE_PARTITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.RESULT_STATISTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.ALGO_SCHEDULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.ALGO_SCHEDULE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.ALGO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.CPU_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field18() {
        return AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB.MEM_COST;
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
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAlgoSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getBeginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getResultTablePartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getResultStatistics();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getAlgoScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getAlgoScheduleContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getAlgoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component17() {
        return getCpuCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component18() {
        return getMemCost();
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
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAlgoSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getBeginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getResultTablePartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getResultStatistics();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getAlgoScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getAlgoScheduleContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getAlgoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getCpuCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value18() {
        return getMemCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value4(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value5(String value) {
        setAlgoSql(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value6(Timestamp value) {
        setBeginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value7(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value8(String value) {
        setResultTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value9(String value) {
        setResultTablePartition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value10(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value11(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value12(String value) {
        setInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value13(String value) {
        setResultStatistics(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value14(Long value) {
        setAlgoScheduleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value15(String value) {
        setAlgoScheduleContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value16(Integer value) {
        setAlgoType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value17(BigDecimal value) {
        setCpuCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord value18(BigDecimal value) {
        setMemCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoScheduleJobRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, Timestamp value6, Timestamp value7, String value8, String value9, String value10, String value11, String value12, String value13, Long value14, String value15, Integer value16, BigDecimal value17, BigDecimal value18) {
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
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AirbusAlgoScheduleJobRecord
     */
    public AirbusAlgoScheduleJobRecord() {
        super(AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB);
    }

    /**
     * Create a detached, initialised AirbusAlgoScheduleJobRecord
     */
    public AirbusAlgoScheduleJobRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String status, String algoSql, Timestamp beginTime, Timestamp endTime, String resultTable, String resultTablePartition, String operator, String operatorId, String instanceId, String resultStatistics, Long algoScheduleId, String algoScheduleContent, Integer algoType, BigDecimal cpuCost, BigDecimal memCost) {
        super(AirbusAlgoScheduleJob.AIRBUS_ALGO_SCHEDULE_JOB);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, status);
        set(4, algoSql);
        set(5, beginTime);
        set(6, endTime);
        set(7, resultTable);
        set(8, resultTablePartition);
        set(9, operator);
        set(10, operatorId);
        set(11, instanceId);
        set(12, resultStatistics);
        set(13, algoScheduleId);
        set(14, algoScheduleContent);
        set(15, algoType);
        set(16, cpuCost);
        set(17, memCost);
    }
}
