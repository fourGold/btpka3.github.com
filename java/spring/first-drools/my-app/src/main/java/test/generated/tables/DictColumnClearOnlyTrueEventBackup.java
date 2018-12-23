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
import test.generated.tables.records.DictColumnClearOnlyTrueEventBackupRecord;


/**
 * 数据字典可清除属性信息统计_备份表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictColumnClearOnlyTrueEventBackup extends TableImpl<DictColumnClearOnlyTrueEventBackupRecord> {

    private static final long serialVersionUID = 1262330545;

    /**
     * The reference instance of <code>SMETA_APP.dict_column_clear_only_true_event_backup</code>
     */
    public static final DictColumnClearOnlyTrueEventBackup DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP = new DictColumnClearOnlyTrueEventBackup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictColumnClearOnlyTrueEventBackupRecord> getRecordType() {
        return DictColumnClearOnlyTrueEventBackupRecord.class;
    }

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.id</code>. 主键
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.gmt_create</code>. 创建时间
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.gmt_modified</code>. 修改时间
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改时间");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.dict_code</code>. 属性代码
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> DICT_CODE = createField("dict_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "属性代码");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.dict_name</code>. 属性名称
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> DICT_NAME = createField("dict_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "属性名称");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.dict_operator</code>. 操作人
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> DICT_OPERATOR = createField("dict_operator", org.jooq.impl.SQLDataType.VARCHAR(32), this, "操作人");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.dict_status</code>. 状态
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> DICT_STATUS = createField("dict_status", org.jooq.impl.SQLDataType.VARCHAR(32), this, "状态");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.tag_code</code>. 标志位代码:0-无任何下游；1-下游：有且只有事件；2-下游：有且只有指标
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> TAG_CODE = createField("tag_code", org.jooq.impl.SQLDataType.VARCHAR(32), this, "标志位代码:0-无任何下游；1-下游：有且只有事件；2-下游：有且只有指标");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.tag_name</code>. 标志位名称
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> TAG_NAME = createField("tag_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "标志位名称");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.blood_code</code>. 血缘代码
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> BLOOD_CODE = createField("blood_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "血缘代码");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.blood_name</code>. 血缘名称
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> BLOOD_NAME = createField("blood_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "血缘名称");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.blood_operator</code>. 下游操作人
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> BLOOD_OPERATOR = createField("blood_operator", org.jooq.impl.SQLDataType.VARCHAR(128), this, "下游操作人");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.event_code</code>. 事件编码
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "事件编码");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.event_name</code>. 事件名称
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "事件名称");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.dict_cost</code>. 属性加工成本
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> DICT_COST = createField("dict_cost", org.jooq.impl.SQLDataType.VARCHAR(128), this, "属性加工成本");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.reserve</code>. 备用字段
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> RESERVE = createField("reserve", org.jooq.impl.SQLDataType.VARCHAR(128), this, "备用字段");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.tenant_code</code>. 租户
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(32), this, "租户");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.clear_rank</code>. 清除排序
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, ULong> CLEAR_RANK = createField("clear_rank", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "清除排序");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.clear_batch</code>. 清除批次
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> CLEAR_BATCH = createField("clear_batch", org.jooq.impl.SQLDataType.VARCHAR(32), this, "清除批次");

    /**
     * The column <code>SMETA_APP.dict_column_clear_only_true_event_backup.clear_date</code>. 清除日期
     */
    public final TableField<DictColumnClearOnlyTrueEventBackupRecord, String> CLEAR_DATE = createField("clear_date", org.jooq.impl.SQLDataType.VARCHAR(32), this, "清除日期");

    /**
     * Create a <code>SMETA_APP.dict_column_clear_only_true_event_backup</code> table reference
     */
    public DictColumnClearOnlyTrueEventBackup() {
        this(DSL.name("dict_column_clear_only_true_event_backup"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_column_clear_only_true_event_backup</code> table reference
     */
    public DictColumnClearOnlyTrueEventBackup(String alias) {
        this(DSL.name(alias), DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_column_clear_only_true_event_backup</code> table reference
     */
    public DictColumnClearOnlyTrueEventBackup(Name alias) {
        this(alias, DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP);
    }

    private DictColumnClearOnlyTrueEventBackup(Name alias, Table<DictColumnClearOnlyTrueEventBackupRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictColumnClearOnlyTrueEventBackup(Name alias, Table<DictColumnClearOnlyTrueEventBackupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "数据字典可清除属性信息统计_备份表");
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
        return Arrays.<Index>asList(Indexes.DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictColumnClearOnlyTrueEventBackupRecord, ULong> getIdentity() {
        return Keys.IDENTITY_DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictColumnClearOnlyTrueEventBackupRecord> getPrimaryKey() {
        return Keys.KEY_DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictColumnClearOnlyTrueEventBackupRecord>> getKeys() {
        return Arrays.<UniqueKey<DictColumnClearOnlyTrueEventBackupRecord>>asList(Keys.KEY_DICT_COLUMN_CLEAR_ONLY_TRUE_EVENT_BACKUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnClearOnlyTrueEventBackup as(String alias) {
        return new DictColumnClearOnlyTrueEventBackup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnClearOnlyTrueEventBackup as(Name alias) {
        return new DictColumnClearOnlyTrueEventBackup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictColumnClearOnlyTrueEventBackup rename(String name) {
        return new DictColumnClearOnlyTrueEventBackup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictColumnClearOnlyTrueEventBackup rename(Name name) {
        return new DictColumnClearOnlyTrueEventBackup(name, null);
    }
}
