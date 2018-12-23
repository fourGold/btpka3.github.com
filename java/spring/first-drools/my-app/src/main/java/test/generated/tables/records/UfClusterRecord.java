/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.UfCluster;


/**
 * MTee3集群表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfClusterRecord extends UpdatableRecordImpl<UfClusterRecord> implements Record11<ULong, Timestamp, Timestamp, String, String, String, String, String, ULong, String, String> {

    private static final long serialVersionUID = -1155812233;

    /**
     * Setter for <code>SMETA_APP.uf_cluster.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.cluster_name</code>. 构建akka集群的标识
     */
    public void setClusterName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.cluster_name</code>. 构建akka集群的标识
     */
    public String getClusterName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.event_type</code>. 事件类型:同步、异步、混合
     */
    public void setEventType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.event_type</code>. 事件类型:同步、异步、混合
     */
    public String getEventType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.node_groups</code>. 节点分组列表
     */
    public void setNodeGroups(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.node_groups</code>. 节点分组列表
     */
    public String getNodeGroups() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.tenant_codes</code>. 租户code列表
     */
    public void setTenantCodes(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.tenant_codes</code>. 租户code列表
     */
    public String getTenantCodes() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.armory_group</code>. armory所在分组，当指定运行机器时需指定分组名
     */
    public void setArmoryGroup(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.armory_group</code>. armory所在分组，当指定运行机器时需指定分组名
     */
    public String getArmoryGroup() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.last_operator</code>. 最近的操作人
     */
    public void setLastOperator(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.last_operator</code>. 最近的操作人
     */
    public ULong getLastOperator() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.cluster_title</code>. 集群名称
     */
    public void setClusterTitle(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.cluster_title</code>. 集群名称
     */
    public String getClusterTitle() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster.specified_nodes</code>. 指定机器列表
     */
    public void setSpecifiedNodes(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster.specified_nodes</code>. 指定机器列表
     */
    public String getSpecifiedNodes() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, Timestamp, Timestamp, String, String, String, String, String, ULong, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, Timestamp, Timestamp, String, String, String, String, String, ULong, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfCluster.UF_CLUSTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfCluster.UF_CLUSTER.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfCluster.UF_CLUSTER.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfCluster.UF_CLUSTER.CLUSTER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfCluster.UF_CLUSTER.EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfCluster.UF_CLUSTER.NODE_GROUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfCluster.UF_CLUSTER.TENANT_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfCluster.UF_CLUSTER.ARMORY_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return UfCluster.UF_CLUSTER.LAST_OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UfCluster.UF_CLUSTER.CLUSTER_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UfCluster.UF_CLUSTER.SPECIFIED_NODES;
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
        return getClusterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNodeGroups();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTenantCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getArmoryGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getClusterTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSpecifiedNodes();
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
        return getClusterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNodeGroups();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTenantCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getArmoryGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getClusterTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSpecifiedNodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value4(String value) {
        setClusterName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value5(String value) {
        setEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value6(String value) {
        setNodeGroups(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value7(String value) {
        setTenantCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value8(String value) {
        setArmoryGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value9(ULong value) {
        setLastOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value10(String value) {
        setClusterTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord value11(String value) {
        setSpecifiedNodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, ULong value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfClusterRecord
     */
    public UfClusterRecord() {
        super(UfCluster.UF_CLUSTER);
    }

    /**
     * Create a detached, initialised UfClusterRecord
     */
    public UfClusterRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String clusterName, String eventType, String nodeGroups, String tenantCodes, String armoryGroup, ULong lastOperator, String clusterTitle, String specifiedNodes) {
        super(UfCluster.UF_CLUSTER);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, clusterName);
        set(4, eventType);
        set(5, nodeGroups);
        set(6, tenantCodes);
        set(7, armoryGroup);
        set(8, lastOperator);
        set(9, clusterTitle);
        set(10, specifiedNodes);
    }
}
