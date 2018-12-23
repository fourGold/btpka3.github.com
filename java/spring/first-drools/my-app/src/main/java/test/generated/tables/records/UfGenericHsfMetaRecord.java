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

import test.generated.tables.UfGenericHsfMeta;


/**
 * hsf泛化服务列表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfGenericHsfMetaRecord extends UpdatableRecordImpl<UfGenericHsfMetaRecord> implements Record12<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Integer, Byte, String> {

    private static final long serialVersionUID = -406119388;

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.tenant_code</code>. 租户id
     */
    public void setTenantCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.tenant_code</code>. 租户id
     */
    public String getTenantCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.service_name</code>. 服务名
     */
    public void setServiceName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.service_name</code>. 服务名
     */
    public String getServiceName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.interface_class</code>. 接口类
     */
    public void setInterfaceClass(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.interface_class</code>. 接口类
     */
    public String getInterfaceClass() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.method_list</code>. 方法列表
     */
    public void setMethodList(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.method_list</code>. 方法列表
     */
    public String getMethodList() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.service_group</code>. 服务分组
     */
    public void setServiceGroup(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.service_group</code>. 服务分组
     */
    public String getServiceGroup() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.timeout</code>. 超时时间
     */
    public void setTimeout(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.timeout</code>. 超时时间
     */
    public Integer getTimeout() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.status</code>. 状态
     */
    public void setStatus(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.status</code>. 状态
     */
    public Byte getStatus() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.uf_generic_hsf_meta.version</code>. 版本
     */
    public void setVersion(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_generic_hsf_meta.version</code>. 版本
     */
    public String getVersion() {
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
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Integer, Byte, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Integer, Byte, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.SERVICE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.INTERFACE_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.METHOD_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.SERVICE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.TIMEOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UfGenericHsfMeta.UF_GENERIC_HSF_META.VERSION;
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
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getServiceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInterfaceClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMethodList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getServiceGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getVersion();
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
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getServiceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInterfaceClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMethodList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getServiceGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value4(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value5(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value6(String value) {
        setServiceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value7(String value) {
        setInterfaceClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value8(String value) {
        setMethodList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value9(String value) {
        setServiceGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value10(Integer value) {
        setTimeout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value11(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord value12(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfGenericHsfMetaRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, Integer value10, Byte value11, String value12) {
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
     * Create a detached UfGenericHsfMetaRecord
     */
    public UfGenericHsfMetaRecord() {
        super(UfGenericHsfMeta.UF_GENERIC_HSF_META);
    }

    /**
     * Create a detached, initialised UfGenericHsfMetaRecord
     */
    public UfGenericHsfMetaRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String operator, String tenantCode, String serviceName, String interfaceClass, String methodList, String serviceGroup, Integer timeout, Byte status, String version) {
        super(UfGenericHsfMeta.UF_GENERIC_HSF_META);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, operator);
        set(4, tenantCode);
        set(5, serviceName);
        set(6, interfaceClass);
        set(7, methodList);
        set(8, serviceGroup);
        set(9, timeout);
        set(10, status);
        set(11, version);
    }
}
