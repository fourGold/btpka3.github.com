/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import test.generated.Indexes;
import test.generated.Keys;
import test.generated.SmetaApp;
import test.generated.tables.records.CalcIndicatorAccRecordTableRecord;


/**
 * 关联表信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcIndicatorAccRecordTable extends TableImpl<CalcIndicatorAccRecordTableRecord> {

    private static final long serialVersionUID = -1442683371;

    /**
     * The reference instance of <code>SMETA_APP.calc_indicator_acc_record_table</code>
     */
    public static final CalcIndicatorAccRecordTable CALC_INDICATOR_ACC_RECORD_TABLE = new CalcIndicatorAccRecordTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CalcIndicatorAccRecordTableRecord> getRecordType() {
        return CalcIndicatorAccRecordTableRecord.class;
    }

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.id</code>. 主键
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.gmt_create</code>. 创建时间
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.gmt_modified</code>. 修改时间
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.table_name</code>. 数据表名
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "数据表名");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.event_name</code>. 事件名称
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "事件名称");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.event_code</code>. 事件Code
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(64), this, "事件Code");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.is_main_table</code>. 0：关联表，1：主表
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, Integer> IS_MAIN_TABLE = createField("is_main_table", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0：关联表，1：主表");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.record_id</code>. 取数信息ID
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, Integer> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "取数信息ID");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.condition_limit</code>. 筛选数据比例
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, Integer> CONDITION_LIMIT = createField("condition_limit", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("100", org.jooq.impl.SQLDataType.INTEGER)), this, "筛选数据比例");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_table.condition_sql</code>. 筛选数据条件
     */
    public final TableField<CalcIndicatorAccRecordTableRecord, String> CONDITION_SQL = createField("condition_sql", org.jooq.impl.SQLDataType.VARCHAR(512), this, "筛选数据条件");

    /**
     * Create a <code>SMETA_APP.calc_indicator_acc_record_table</code> table reference
     */
    public CalcIndicatorAccRecordTable() {
        this(DSL.name("calc_indicator_acc_record_table"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.calc_indicator_acc_record_table</code> table reference
     */
    public CalcIndicatorAccRecordTable(String alias) {
        this(DSL.name(alias), CALC_INDICATOR_ACC_RECORD_TABLE);
    }

    /**
     * Create an aliased <code>SMETA_APP.calc_indicator_acc_record_table</code> table reference
     */
    public CalcIndicatorAccRecordTable(Name alias) {
        this(alias, CALC_INDICATOR_ACC_RECORD_TABLE);
    }

    private CalcIndicatorAccRecordTable(Name alias, Table<CalcIndicatorAccRecordTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private CalcIndicatorAccRecordTable(Name alias, Table<CalcIndicatorAccRecordTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "关联表信息");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return SmetaApp.SMETA_APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CALC_INDICATOR_ACC_RECORD_TABLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CalcIndicatorAccRecordTableRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CALC_INDICATOR_ACC_RECORD_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CalcIndicatorAccRecordTableRecord> getPrimaryKey() {
        return Keys.KEY_CALC_INDICATOR_ACC_RECORD_TABLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CalcIndicatorAccRecordTableRecord>> getKeys() {
        return Arrays.<UniqueKey<CalcIndicatorAccRecordTableRecord>>asList(Keys.KEY_CALC_INDICATOR_ACC_RECORD_TABLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorAccRecordTable as(String alias) {
        return new CalcIndicatorAccRecordTable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorAccRecordTable as(Name alias) {
        return new CalcIndicatorAccRecordTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CalcIndicatorAccRecordTable rename(String name) {
        return new CalcIndicatorAccRecordTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CalcIndicatorAccRecordTable rename(Name name) {
        return new CalcIndicatorAccRecordTable(name, null);
    }
}
