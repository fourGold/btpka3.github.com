/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.IndiAdlEunomiaOdpsTablesDeltaFdt;


/**
 * 自动计算离线表的信息变化，由ODPS同步
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndiAdlEunomiaOdpsTablesDeltaFdtRecord extends UpdatableRecordImpl<IndiAdlEunomiaOdpsTablesDeltaFdtRecord> implements Record10<ULong, Timestamp, Timestamp, String, String, String, String, Long, Long, String> {

    private static final long serialVersionUID = -1834052141;

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.table_name</code>. 表名：项目.表名
     */
    public void setTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.table_name</code>. 表名：项目.表名
     */
    public String getTableName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.dev_owner</code>. 开发人员6位工号
     */
    public void setDevOwner(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.dev_owner</code>. 开发人员6位工号
     */
    public String getDevOwner() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.dev_owner_name</code>. 开发人员名称
     */
    public void setDevOwnerName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.dev_owner_name</code>. 开发人员名称
     */
    public String getDevOwnerName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.partition_col</code>. 分区字段
     */
    public void setPartitionCol(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.partition_col</code>. 分区字段
     */
    public String getPartitionCol() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.life_cycle</code>. 生命周期天数
     */
    public void setLifeCycle(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.life_cycle</code>. 生命周期天数
     */
    public Long getLifeCycle() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.granularity</code>. 调度粒度：1 分钟，2 小时，3 天，4 周，5 月
     */
    public void setGranularity(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.granularity</code>. 调度粒度：1 分钟，2 小时，3 天，4 周，5 月
     */
    public Long getGranularity() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.delta_tag</code>. 表增量标签：新增表，新增字段，删除表，删除字段，更改表信息\nadd_table,add_column,drop_table,delete_column,update_table
     */
    public void setDeltaTag(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_adl_eunomia_odps_tables_delta_fdt.delta_tag</code>. 表增量标签：新增表，新增字段，删除表，删除字段，更改表信息\nadd_table,add_column,drop_table,delete_column,update_table
     */
    public String getDeltaTag() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, Timestamp, String, String, String, String, Long, Long, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, Timestamp, String, String, String, String, Long, Long, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.DEV_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.DEV_OWNER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.PARTITION_COL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.LIFE_CYCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.GRANULARITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT.DELTA_TAG;
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
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDevOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDevOwnerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPartitionCol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getLifeCycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getGranularity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDeltaTag();
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
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDevOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDevOwnerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPartitionCol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getLifeCycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getGranularity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDeltaTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value4(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value5(String value) {
        setDevOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value6(String value) {
        setDevOwnerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value7(String value) {
        setPartitionCol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value8(Long value) {
        setLifeCycle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value9(Long value) {
        setGranularity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord value10(String value) {
        setDeltaTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, Long value8, Long value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndiAdlEunomiaOdpsTablesDeltaFdtRecord
     */
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord() {
        super(IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT);
    }

    /**
     * Create a detached, initialised IndiAdlEunomiaOdpsTablesDeltaFdtRecord
     */
    public IndiAdlEunomiaOdpsTablesDeltaFdtRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String tableName, String devOwner, String devOwnerName, String partitionCol, Long lifeCycle, Long granularity, String deltaTag) {
        super(IndiAdlEunomiaOdpsTablesDeltaFdt.INDI_ADL_EUNOMIA_ODPS_TABLES_DELTA_FDT);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, tableName);
        set(4, devOwner);
        set(5, devOwnerName);
        set(6, partitionCol);
        set(7, lifeCycle);
        set(8, granularity);
        set(9, deltaTag);
    }
}