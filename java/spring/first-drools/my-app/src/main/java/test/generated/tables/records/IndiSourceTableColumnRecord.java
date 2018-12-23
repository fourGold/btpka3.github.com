/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.IndiSourceTableColumn;


/**
 * 源表字段
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndiSourceTableColumnRecord extends UpdatableRecordImpl<IndiSourceTableColumnRecord> implements Record8<ULong, Timestamp, Timestamp, String, String, String, String, Integer> {

    private static final long serialVersionUID = -643139835;

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.source_table_name</code>. 源表表名
     */
    public void setSourceTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.source_table_name</code>. 源表表名
     */
    public String getSourceTableName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.column_name</code>. 字段名称
     */
    public void setColumnName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.column_name</code>. 字段名称
     */
    public String getColumnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.column_type</code>. 字段类型
     */
    public void setColumnType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.column_type</code>. 字段类型
     */
    public String getColumnType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.column_comment</code>. 字段描述
     */
    public void setColumnComment(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.column_comment</code>. 字段描述
     */
    public String getColumnComment() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.indi_source_table_column.column_flag</code>. 0非指标、1指标、2主键
     */
    public void setColumnFlag(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_source_table_column.column_flag</code>. 0非指标、1指标、2主键
     */
    public Integer getColumnFlag() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Timestamp, Timestamp, String, String, String, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Timestamp, Timestamp, String, String, String, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.SOURCE_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.COLUMN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.COLUMN_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN.COLUMN_FLAG;
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
        return getSourceTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getColumnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getColumnComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getColumnFlag();
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
        return getSourceTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getColumnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getColumnComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getColumnFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value4(String value) {
        setSourceTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value5(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value6(String value) {
        setColumnType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value7(String value) {
        setColumnComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord value8(Integer value) {
        setColumnFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumnRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndiSourceTableColumnRecord
     */
    public IndiSourceTableColumnRecord() {
        super(IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN);
    }

    /**
     * Create a detached, initialised IndiSourceTableColumnRecord
     */
    public IndiSourceTableColumnRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String sourceTableName, String columnName, String columnType, String columnComment, Integer columnFlag) {
        super(IndiSourceTableColumn.INDI_SOURCE_TABLE_COLUMN);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, sourceTableName);
        set(4, columnName);
        set(5, columnType);
        set(6, columnComment);
        set(7, columnFlag);
    }
}
