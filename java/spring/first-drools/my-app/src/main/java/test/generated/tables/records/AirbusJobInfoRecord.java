/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.AirbusJobInfo;


/**
 * 离线引擎调度任务信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusJobInfoRecord extends UpdatableRecordImpl<AirbusJobInfoRecord> {

    private static final long serialVersionUID = -165797687;

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.tenant_code</code>. 租户code
     */
    public void setTenantCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.tenant_code</code>. 租户code
     */
    public String getTenantCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.event_code</code>. 事件码
     */
    public void setEventCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.event_code</code>. 事件码
     */
    public String getEventCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.uf_rule_release_id</code>. release的规则id
     */
    public void setUfRuleReleaseId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.uf_rule_release_id</code>. release的规则id
     */
    public ULong getUfRuleReleaseId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.uf_rule_id</code>. 规则ID
     */
    public void setUfRuleId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.uf_rule_id</code>. 规则ID
     */
    public ULong getUfRuleId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.schedule_type</code>. 1:周期任务；2:一次任务
     */
    public void setScheduleType(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.schedule_type</code>. 1:周期任务；2:一次任务
     */
    public Short getScheduleType() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.node_type</code>. sql 或是 shell
     */
    public void setNodeType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.node_type</code>. sql 或是 shell
     */
    public String getNodeType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.engine_type</code>. 1:odps
     */
    public void setEngineType(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.engine_type</code>. 1:odps
     */
    public Short getEngineType() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.rule_condition</code>. 执行体
     */
    public void setRuleCondition(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.rule_condition</code>. 执行体
     */
    public String getRuleCondition() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.sic_result_table</code>. sic返回的结果表名字
     */
    public void setSicResultTable(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.sic_result_table</code>. sic返回的结果表名字
     */
    public String getSicResultTable() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.sic_record_id</code>. sic返回的reocrd id
     */
    public void setSicRecordId(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.sic_record_id</code>. sic返回的reocrd id
     */
    public ULong getSicRecordId() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.sic_calc_code</code>. sic返回的calc_code
     */
    public void setSicCalcCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.sic_calc_code</code>. sic返回的calc_code
     */
    public String getSicCalcCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.status</code>. job状态 1- 上线 2-下线
     */
    public void setStatus(Short value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.status</code>. job状态 1- 上线 2-下线
     */
    public Short getStatus() {
        return (Short) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.operator</code>. 操作者
     */
    public void setOperator(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.operator</code>. 操作者
     */
    public String getOperator() {
        return (String) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.uf_rule_set_id</code>. uf rule set id
     */
    public void setUfRuleSetId(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.uf_rule_set_id</code>. uf rule set id
     */
    public Long getUfRuleSetId() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.table_calc_cycle</code>. 时间表计算周期
     */
    public void setTableCalcCycle(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.table_calc_cycle</code>. 时间表计算周期
     */
    public String getTableCalcCycle() {
        return (String) get(17);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.source_table</code>. source table
     */
    public void setSourceTable(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.source_table</code>. source table
     */
    public String getSourceTable() {
        return (String) get(18);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.job_submit_status</code>. job提交状态 
0- 未提交
1- 已提交
     */
    public void setJobSubmitStatus(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.job_submit_status</code>. job提交状态 
0- 未提交
1- 已提交
     */
    public Integer getJobSubmitStatus() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.uf_rule_set_version</code>. ruleset 的version
     */
    public void setUfRuleSetVersion(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.uf_rule_set_version</code>. ruleset 的version
     */
    public Long getUfRuleSetVersion() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.operator_id</code>. 操作者id
     */
    public void setOperatorId(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.operator_id</code>. 操作者id
     */
    public Long getOperatorId() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.valid_from_date</code>. job开始生效日期
     */
    public void setValidFromDate(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.valid_from_date</code>. job开始生效日期
     */
    public Long getValidFromDate() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.valid_to_date</code>. job结束日期
     */
    public void setValidToDate(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.valid_to_date</code>. job结束日期
     */
    public Long getValidToDate() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.source_table_partition</code>. 源表分区字段
     */
    public void setSourceTablePartition(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.source_table_partition</code>. 源表分区字段
     */
    public String getSourceTablePartition() {
        return (String) get(24);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.source_table_columns</code>. 源表列，用于一次性事件
     */
    public void setSourceTableColumns(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.source_table_columns</code>. 源表列，用于一次性事件
     */
    public String getSourceTableColumns() {
        return (String) get(25);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_job_info.uf_rule_content</code>. 保存对应的规则内容
     */
    public void setUfRuleContent(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_job_info.uf_rule_content</code>. 保存对应的规则内容
     */
    public String getUfRuleContent() {
        return (String) get(26);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AirbusJobInfoRecord
     */
    public AirbusJobInfoRecord() {
        super(AirbusJobInfo.AIRBUS_JOB_INFO);
    }

    /**
     * Create a detached, initialised AirbusJobInfoRecord
     */
    public AirbusJobInfoRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String tenantCode, String eventCode, ULong ufRuleReleaseId, ULong ufRuleId, Short scheduleType, String nodeType, Short engineType, String ruleCondition, String sicResultTable, ULong sicRecordId, String sicCalcCode, Short status, String operator, Long ufRuleSetId, String tableCalcCycle, String sourceTable, Integer jobSubmitStatus, Long ufRuleSetVersion, Long operatorId, Long validFromDate, Long validToDate, String sourceTablePartition, String sourceTableColumns, String ufRuleContent) {
        super(AirbusJobInfo.AIRBUS_JOB_INFO);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, tenantCode);
        set(4, eventCode);
        set(5, ufRuleReleaseId);
        set(6, ufRuleId);
        set(7, scheduleType);
        set(8, nodeType);
        set(9, engineType);
        set(10, ruleCondition);
        set(11, sicResultTable);
        set(12, sicRecordId);
        set(13, sicCalcCode);
        set(14, status);
        set(15, operator);
        set(16, ufRuleSetId);
        set(17, tableCalcCycle);
        set(18, sourceTable);
        set(19, jobSubmitStatus);
        set(20, ufRuleSetVersion);
        set(21, operatorId);
        set(22, validFromDate);
        set(23, validToDate);
        set(24, sourceTablePartition);
        set(25, sourceTableColumns);
        set(26, ufRuleContent);
    }
}
