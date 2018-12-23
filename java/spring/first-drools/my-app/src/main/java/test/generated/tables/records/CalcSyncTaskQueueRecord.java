/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.CalcSyncTaskQueue;


/**
 * 离线指标 待同步处理队列
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcSyncTaskQueueRecord extends UpdatableRecordImpl<CalcSyncTaskQueueRecord> implements Record12<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Integer, String, String> {

    private static final long serialVersionUID = 2042984900;

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.task_type</code>. 添加指标addSyncIndi，删除指标delSyncIndi，删除任务delSyncTask，刷新任务refreshSyncTask
     */
    public void setTaskType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.task_type</code>. 添加指标addSyncIndi，删除指标delSyncIndi，删除任务delSyncTask，刷新任务refreshSyncTask
     */
    public String getTaskType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.indi_codes</code>. 指标编码集
     */
    public void setIndiCodes(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.indi_codes</code>. 指标编码集
     */
    public String getIndiCodes() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.store_code</code>. 存储编码：tair_cn, tair_us, tair_ru, hbase_cn_mtee_offline_indicator
     */
    public void setStoreCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.store_code</code>. 存储编码：tair_cn, tair_us, tair_ru, hbase_cn_mtee_offline_indicator
     */
    public String getStoreCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.sync_code</code>. 同步编码：a
     */
    public void setSyncCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.sync_code</code>. 同步编码：a
     */
    public String getSyncCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.operator_id</code>. 任务接口人：工号 不足6位前面补0
     */
    public void setOperatorId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.operator_id</code>. 任务接口人：工号 不足6位前面补0
     */
    public String getOperatorId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.operator</code>. 任务接口人：花名
     */
    public void setOperator(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.operator</code>. 任务接口人：花名
     */
    public String getOperator() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.status</code>. 处理状态：0未处理，1处理中，2已完成，3有异常
     */
    public void setStatus(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.status</code>. 处理状态：0未处理，1处理中，2已完成，3有异常
     */
    public Integer getStatus() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.result_log</code>. 处理日志
     */
    public void setResultLog(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.result_log</code>. 处理日志
     */
    public String getResultLog() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.calc_sync_task_queue.hbase_temp_version</code>. 同步hbase模板版本：v1，v2
     */
    public void setHbaseTempVersion(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_sync_task_queue.hbase_temp_version</code>. 同步hbase模板版本：v1，v2
     */
    public String getHbaseTempVersion() {
        return (String) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Integer, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Integer, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.TASK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.INDI_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.STORE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.SYNC_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.RESULT_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE.HBASE_TEMP_VERSION;
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
        return getTaskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIndiCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getStoreCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSyncCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getResultLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getHbaseTempVersion();
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
        return getTaskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndiCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStoreCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSyncCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getResultLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getHbaseTempVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value4(String value) {
        setTaskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value5(String value) {
        setIndiCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value6(String value) {
        setStoreCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value7(String value) {
        setSyncCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value8(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value9(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value10(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value11(String value) {
        setResultLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord value12(String value) {
        setHbaseTempVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSyncTaskQueueRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, Integer value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CalcSyncTaskQueueRecord
     */
    public CalcSyncTaskQueueRecord() {
        super(CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE);
    }

    /**
     * Create a detached, initialised CalcSyncTaskQueueRecord
     */
    public CalcSyncTaskQueueRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String taskType, String indiCodes, String storeCode, String syncCode, String operatorId, String operator, Integer status, String resultLog, String hbaseTempVersion) {
        super(CalcSyncTaskQueue.CALC_SYNC_TASK_QUEUE);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, taskType);
        set(4, indiCodes);
        set(5, storeCode);
        set(6, syncCode);
        set(7, operatorId);
        set(8, operator);
        set(9, status);
        set(10, resultLog);
        set(11, hbaseTempVersion);
    }
}
