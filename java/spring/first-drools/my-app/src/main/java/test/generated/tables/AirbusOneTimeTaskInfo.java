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
import test.generated.tables.records.AirbusOneTimeTaskInfoRecord;


/**
 * 一次性任务配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusOneTimeTaskInfo extends TableImpl<AirbusOneTimeTaskInfoRecord> {

    private static final long serialVersionUID = -204070669;

    /**
     * The reference instance of <code>SMETA_APP.airbus_one_time_task_info</code>
     */
    public static final AirbusOneTimeTaskInfo AIRBUS_ONE_TIME_TASK_INFO = new AirbusOneTimeTaskInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirbusOneTimeTaskInfoRecord> getRecordType() {
        return AirbusOneTimeTaskInfoRecord.class;
    }

    /**
     * The column <code>SMETA_APP.airbus_one_time_task_info.id</code>. 主键
     */
    public final TableField<AirbusOneTimeTaskInfoRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.airbus_one_time_task_info.gmt_create</code>. 创建时间
     */
    public final TableField<AirbusOneTimeTaskInfoRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.airbus_one_time_task_info.gmt_modified</code>. 修改时间
     */
    public final TableField<AirbusOneTimeTaskInfoRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.airbus_one_time_task_info.real_column</code>. 源数据表的列名
     */
    public final TableField<AirbusOneTimeTaskInfoRecord, String> REAL_COLUMN = createField("real_column", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "源数据表的列名");

    /**
     * The column <code>SMETA_APP.airbus_one_time_task_info.one_time_column</code>. 一次性事件的属性名
     */
    public final TableField<AirbusOneTimeTaskInfoRecord, String> ONE_TIME_COLUMN = createField("one_time_column", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "一次性事件的属性名");

    /**
     * The column <code>SMETA_APP.airbus_one_time_task_info.uf_rule_id</code>. 规则id
     */
    public final TableField<AirbusOneTimeTaskInfoRecord, Long> UF_RULE_ID = createField("uf_rule_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "规则id");

    /**
     * Create a <code>SMETA_APP.airbus_one_time_task_info</code> table reference
     */
    public AirbusOneTimeTaskInfo() {
        this(DSL.name("airbus_one_time_task_info"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_one_time_task_info</code> table reference
     */
    public AirbusOneTimeTaskInfo(String alias) {
        this(DSL.name(alias), AIRBUS_ONE_TIME_TASK_INFO);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_one_time_task_info</code> table reference
     */
    public AirbusOneTimeTaskInfo(Name alias) {
        this(alias, AIRBUS_ONE_TIME_TASK_INFO);
    }

    private AirbusOneTimeTaskInfo(Name alias, Table<AirbusOneTimeTaskInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private AirbusOneTimeTaskInfo(Name alias, Table<AirbusOneTimeTaskInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "一次性任务配置表");
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
        return Arrays.<Index>asList(Indexes.AIRBUS_ONE_TIME_TASK_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AirbusOneTimeTaskInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_AIRBUS_ONE_TIME_TASK_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AirbusOneTimeTaskInfoRecord> getPrimaryKey() {
        return Keys.KEY_AIRBUS_ONE_TIME_TASK_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AirbusOneTimeTaskInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<AirbusOneTimeTaskInfoRecord>>asList(Keys.KEY_AIRBUS_ONE_TIME_TASK_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOneTimeTaskInfo as(String alias) {
        return new AirbusOneTimeTaskInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOneTimeTaskInfo as(Name alias) {
        return new AirbusOneTimeTaskInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusOneTimeTaskInfo rename(String name) {
        return new AirbusOneTimeTaskInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusOneTimeTaskInfo rename(Name name) {
        return new AirbusOneTimeTaskInfo(name, null);
    }
}
