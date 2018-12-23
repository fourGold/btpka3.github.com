/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.DictCrossTable;


/**
 * 字典和离线上云表及下游血缘血缘关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCrossTableRecord extends UpdatableRecordImpl<DictCrossTableRecord> implements Record9<ULong, Timestamp, Timestamp, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1434351422;

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.event_code</code>. 事件cdoe
     */
    public void setEventCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.event_code</code>. 事件cdoe
     */
    public String getEventCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.event_column_code</code>. 事件属性code
     */
    public void setEventColumnCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.event_column_code</code>. 事件属性code
     */
    public String getEventColumnCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.dest_project_name</code>. 下游云表应用名
     */
    public void setDestProjectName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.dest_project_name</code>. 下游云表应用名
     */
    public String getDestProjectName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.dest_table_name</code>. 下游云表表名
     */
    public void setDestTableName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.dest_table_name</code>. 下游云表表名
     */
    public String getDestTableName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.dest_column_name</code>. 下游云表字段名
     */
    public void setDestColumnName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.dest_column_name</code>. 下游云表字段名
     */
    public String getDestColumnName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_table.odps_table_name</code>. 上云表表名
     */
    public void setOdpsTableName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_table.odps_table_name</code>. 上云表表名
     */
    public String getOdpsTableName() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, Timestamp, Timestamp, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, Timestamp, Timestamp, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return DictCrossTable.DICT_CROSS_TABLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DictCrossTable.DICT_CROSS_TABLE.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DictCrossTable.DICT_CROSS_TABLE.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DictCrossTable.DICT_CROSS_TABLE.EVENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DictCrossTable.DICT_CROSS_TABLE.EVENT_COLUMN_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DictCrossTable.DICT_CROSS_TABLE.DEST_PROJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DictCrossTable.DICT_CROSS_TABLE.DEST_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DictCrossTable.DICT_CROSS_TABLE.DEST_COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DictCrossTable.DICT_CROSS_TABLE.ODPS_TABLE_NAME;
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
        return getEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEventColumnCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDestProjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDestTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDestColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOdpsTableName();
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
        return getEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEventColumnCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDestProjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDestTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDestColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOdpsTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value4(String value) {
        setEventCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value5(String value) {
        setEventColumnCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value6(String value) {
        setDestProjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value7(String value) {
        setDestTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value8(String value) {
        setDestColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord value9(String value) {
        setOdpsTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossTableRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictCrossTableRecord
     */
    public DictCrossTableRecord() {
        super(DictCrossTable.DICT_CROSS_TABLE);
    }

    /**
     * Create a detached, initialised DictCrossTableRecord
     */
    public DictCrossTableRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String eventCode, String eventColumnCode, String destProjectName, String destTableName, String destColumnName, String odpsTableName) {
        super(DictCrossTable.DICT_CROSS_TABLE);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, eventCode);
        set(4, eventColumnCode);
        set(5, destProjectName);
        set(6, destTableName);
        set(7, destColumnName);
        set(8, odpsTableName);
    }
}
