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
import test.generated.tables.records.AirbusAlgoScheduleRecord;


/**
 * 离线引擎算法调度表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusAlgoSchedule extends TableImpl<AirbusAlgoScheduleRecord> {

    private static final long serialVersionUID = -1148826279;

    /**
     * The reference instance of <code>SMETA_APP.airbus_algo_schedule</code>
     */
    public static final AirbusAlgoSchedule AIRBUS_ALGO_SCHEDULE = new AirbusAlgoSchedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirbusAlgoScheduleRecord> getRecordType() {
        return AirbusAlgoScheduleRecord.class;
    }

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.id</code>. 主键
     */
    public final TableField<AirbusAlgoScheduleRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.gmt_create</code>. 创建时间
     */
    public final TableField<AirbusAlgoScheduleRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.gmt_modified</code>. 修改时间
     */
    public final TableField<AirbusAlgoScheduleRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.title</code>. 标题
     */
    public final TableField<AirbusAlgoScheduleRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "标题");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.description</code>. 描述
     */
    public final TableField<AirbusAlgoScheduleRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "描述");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.contacts</code>. 联系人
     */
    public final TableField<AirbusAlgoScheduleRecord, String> CONTACTS = createField("contacts", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "联系人");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.last_operator</code>. 最后操作人
     */
    public final TableField<AirbusAlgoScheduleRecord, String> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "最后操作人");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.last_operator_id</code>. 最后操作人id
     */
    public final TableField<AirbusAlgoScheduleRecord, Long> LAST_OPERATOR_ID = createField("last_operator_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "最后操作人id");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.tenant_code</code>. 租户code
     */
    public final TableField<AirbusAlgoScheduleRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "租户code");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.algo_type</code>. 算法类型
     */
    public final TableField<AirbusAlgoScheduleRecord, Integer> ALGO_TYPE = createField("algo_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "算法类型");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.settings</code>. 调度配置
     */
    public final TableField<AirbusAlgoScheduleRecord, String> SETTINGS = createField("settings", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "调度配置");

    /**
     * The column <code>SMETA_APP.airbus_algo_schedule.draft</code>. 草稿
     */
    public final TableField<AirbusAlgoScheduleRecord, String> DRAFT = createField("draft", org.jooq.impl.SQLDataType.CLOB, this, "草稿");

    /**
     * Create a <code>SMETA_APP.airbus_algo_schedule</code> table reference
     */
    public AirbusAlgoSchedule() {
        this(DSL.name("airbus_algo_schedule"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_algo_schedule</code> table reference
     */
    public AirbusAlgoSchedule(String alias) {
        this(DSL.name(alias), AIRBUS_ALGO_SCHEDULE);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_algo_schedule</code> table reference
     */
    public AirbusAlgoSchedule(Name alias) {
        this(alias, AIRBUS_ALGO_SCHEDULE);
    }

    private AirbusAlgoSchedule(Name alias, Table<AirbusAlgoScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private AirbusAlgoSchedule(Name alias, Table<AirbusAlgoScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "离线引擎算法调度表");
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
        return Arrays.<Index>asList(Indexes.AIRBUS_ALGO_SCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AirbusAlgoScheduleRecord, ULong> getIdentity() {
        return Keys.IDENTITY_AIRBUS_ALGO_SCHEDULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AirbusAlgoScheduleRecord> getPrimaryKey() {
        return Keys.KEY_AIRBUS_ALGO_SCHEDULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AirbusAlgoScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<AirbusAlgoScheduleRecord>>asList(Keys.KEY_AIRBUS_ALGO_SCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoSchedule as(String alias) {
        return new AirbusAlgoSchedule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusAlgoSchedule as(Name alias) {
        return new AirbusAlgoSchedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusAlgoSchedule rename(String name) {
        return new AirbusAlgoSchedule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusAlgoSchedule rename(Name name) {
        return new AirbusAlgoSchedule(name, null);
    }
}
