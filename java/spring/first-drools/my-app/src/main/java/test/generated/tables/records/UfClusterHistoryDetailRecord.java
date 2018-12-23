/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.UfClusterHistoryDetail;


/**
 * 每个机器的历史操作明细表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfClusterHistoryDetailRecord extends UpdatableRecordImpl<UfClusterHistoryDetailRecord> implements Record13<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, ULong> {

    private static final long serialVersionUID = 1663522207;

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.tenant_code</code>. 租户code
     */
    public void setTenantCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.tenant_code</code>. 租户code
     */
    public String getTenantCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.node_ip</code>. 机器ip
     */
    public void setNodeIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.node_ip</code>. 机器ip
     */
    public String getNodeIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.host_name</code>. 机器hostname
     */
    public void setHostName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.host_name</code>. 机器hostname
     */
    public String getHostName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.sync_type</code>. 接收类型
     */
    public void setSyncType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.sync_type</code>. 接收类型
     */
    public String getSyncType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.region_code</code>. 地区
     */
    public void setRegionCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.region_code</code>. 地区
     */
    public String getRegionCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.lab_code</code>. 机房
     */
    public void setLabCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.lab_code</code>. 机房
     */
    public String getLabCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.node_group</code>. 机器分组
     */
    public void setNodeGroup(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.node_group</code>. 机器分组
     */
    public String getNodeGroup() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.group_schema</code>. 机器schema
     */
    public void setGroupSchema(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.group_schema</code>. 机器schema
     */
    public String getGroupSchema() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.action</code>. 变更类型（增加、删除、切换、归还）
     */
    public void setAction(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.action</code>. 变更类型（增加、删除、切换、归还）
     */
    public String getAction() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_history_detail.last_operator</code>. 最近修改者
     */
    public void setLastOperator(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_history_detail.last_operator</code>. 最近修改者
     */
    public ULong getLastOperator() {
        return (ULong) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, ULong> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, ULong> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.NODE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.HOST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.SYNC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.REGION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.LAB_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.NODE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.GROUP_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL.LAST_OPERATOR;
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
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNodeIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHostName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRegionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLabCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getNodeGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getGroupSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component13() {
        return getLastOperator();
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
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNodeIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHostName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRegionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLabCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getNodeGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getGroupSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value4(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value5(String value) {
        setNodeIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value6(String value) {
        setHostName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value7(String value) {
        setSyncType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value8(String value) {
        setRegionCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value9(String value) {
        setLabCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value10(String value) {
        setNodeGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value11(String value) {
        setGroupSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value12(String value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord value13(ULong value) {
        setLastOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistoryDetailRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, ULong value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfClusterHistoryDetailRecord
     */
    public UfClusterHistoryDetailRecord() {
        super(UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL);
    }

    /**
     * Create a detached, initialised UfClusterHistoryDetailRecord
     */
    public UfClusterHistoryDetailRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String tenantCode, String nodeIp, String hostName, String syncType, String regionCode, String labCode, String nodeGroup, String groupSchema, String action, ULong lastOperator) {
        super(UfClusterHistoryDetail.UF_CLUSTER_HISTORY_DETAIL);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, tenantCode);
        set(4, nodeIp);
        set(5, hostName);
        set(6, syncType);
        set(7, regionCode);
        set(8, labCode);
        set(9, nodeGroup);
        set(10, groupSchema);
        set(11, action);
        set(12, lastOperator);
    }
}
