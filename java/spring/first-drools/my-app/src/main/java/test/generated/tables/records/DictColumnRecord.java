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

import test.generated.tables.DictColumn;


/**
 * 数据字典属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictColumnRecord extends UpdatableRecordImpl<DictColumnRecord> implements Record11<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Byte, String> {

    private static final long serialVersionUID = 1246337014;

    /**
     * Setter for <code>SMETA_APP.dict_column.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.cn_name</code>. 属性中文名称
     */
    public void setCnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.cn_name</code>. 属性中文名称
     */
    public String getCnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.en_name</code>. 属性英文名称
     */
    public void setEnName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.en_name</code>. 属性英文名称
     */
    public String getEnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.code</code>. 属性code
     */
    public void setCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.code</code>. 属性code
     */
    public String getCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.type</code>. 属性种类
     */
    public void setType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.type</code>. 属性种类
     */
    public String getType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.operator_id</code>. 操作者工号
     */
    public void setOperatorId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.operator_id</code>. 操作者工号
     */
    public String getOperatorId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.operator</code>. 操作者
     */
    public void setOperator(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.operator</code>. 操作者
     */
    public String getOperator() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.status</code>. 属性审核状态 0  删除  1 有效 2 草稿 3 审核中
     */
    public void setStatus(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.status</code>. 属性审核状态 0  删除  1 有效 2 草稿 3 审核中
     */
    public Byte getStatus() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.dict_column.tenant_code</code>. 租户code
     */
    public void setTenantCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_column.tenant_code</code>. 租户code
     */
    public String getTenantCode() {
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
    public Row11<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Byte, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Byte, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return DictColumn.DICT_COLUMN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DictColumn.DICT_COLUMN.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DictColumn.DICT_COLUMN.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DictColumn.DICT_COLUMN.CN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DictColumn.DICT_COLUMN.EN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DictColumn.DICT_COLUMN.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DictColumn.DICT_COLUMN.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DictColumn.DICT_COLUMN.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DictColumn.DICT_COLUMN.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return DictColumn.DICT_COLUMN.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DictColumn.DICT_COLUMN.TENANT_CODE;
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
        return getCnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getType();
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
    public Byte component10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTenantCode();
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
        return getCnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getType();
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
    public Byte value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value4(String value) {
        setCnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value5(String value) {
        setEnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value6(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value7(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value8(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value9(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value10(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord value11(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, Byte value10, String value11) {
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
     * Create a detached DictColumnRecord
     */
    public DictColumnRecord() {
        super(DictColumn.DICT_COLUMN);
    }

    /**
     * Create a detached, initialised DictColumnRecord
     */
    public DictColumnRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String cnName, String enName, String code, String type, String operatorId, String operator, Byte status, String tenantCode) {
        super(DictColumn.DICT_COLUMN);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, cnName);
        set(4, enName);
        set(5, code);
        set(6, type);
        set(7, operatorId);
        set(8, operator);
        set(9, status);
        set(10, tenantCode);
    }
}
