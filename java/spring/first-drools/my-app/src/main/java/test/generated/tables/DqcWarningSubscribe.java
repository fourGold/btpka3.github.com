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
import test.generated.tables.records.DqcWarningSubscribeRecord;


/**
 * dqc报警订阅表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DqcWarningSubscribe extends TableImpl<DqcWarningSubscribeRecord> {

    private static final long serialVersionUID = 589549496;

    /**
     * The reference instance of <code>SMETA_APP.dqc_warning_subscribe</code>
     */
    public static final DqcWarningSubscribe DQC_WARNING_SUBSCRIBE = new DqcWarningSubscribe();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DqcWarningSubscribeRecord> getRecordType() {
        return DqcWarningSubscribeRecord.class;
    }

    /**
     * The column <code>SMETA_APP.dqc_warning_subscribe.id</code>. 主键
     */
    public final TableField<DqcWarningSubscribeRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dqc_warning_subscribe.gmt_create</code>. 创建时间
     */
    public final TableField<DqcWarningSubscribeRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.dqc_warning_subscribe.gmt_modified</code>. 修改时间
     */
    public final TableField<DqcWarningSubscribeRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.dqc_warning_subscribe.event_code</code>. 事件code
     */
    public final TableField<DqcWarningSubscribeRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "事件code");

    /**
     * The column <code>SMETA_APP.dqc_warning_subscribe.employee</code>. 员工花名
     */
    public final TableField<DqcWarningSubscribeRecord, String> EMPLOYEE = createField("employee", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "员工花名");

    /**
     * The column <code>SMETA_APP.dqc_warning_subscribe.email</code>. 员工邮箱
     */
    public final TableField<DqcWarningSubscribeRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(256), this, "员工邮箱");

    /**
     * Create a <code>SMETA_APP.dqc_warning_subscribe</code> table reference
     */
    public DqcWarningSubscribe() {
        this(DSL.name("dqc_warning_subscribe"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dqc_warning_subscribe</code> table reference
     */
    public DqcWarningSubscribe(String alias) {
        this(DSL.name(alias), DQC_WARNING_SUBSCRIBE);
    }

    /**
     * Create an aliased <code>SMETA_APP.dqc_warning_subscribe</code> table reference
     */
    public DqcWarningSubscribe(Name alias) {
        this(alias, DQC_WARNING_SUBSCRIBE);
    }

    private DqcWarningSubscribe(Name alias, Table<DqcWarningSubscribeRecord> aliased) {
        this(alias, aliased, null);
    }

    private DqcWarningSubscribe(Name alias, Table<DqcWarningSubscribeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "dqc报警订阅表");
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
        return Arrays.<Index>asList(Indexes.DQC_WARNING_SUBSCRIBE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DqcWarningSubscribeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_DQC_WARNING_SUBSCRIBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DqcWarningSubscribeRecord> getPrimaryKey() {
        return Keys.KEY_DQC_WARNING_SUBSCRIBE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DqcWarningSubscribeRecord>> getKeys() {
        return Arrays.<UniqueKey<DqcWarningSubscribeRecord>>asList(Keys.KEY_DQC_WARNING_SUBSCRIBE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DqcWarningSubscribe as(String alias) {
        return new DqcWarningSubscribe(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DqcWarningSubscribe as(Name alias) {
        return new DqcWarningSubscribe(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DqcWarningSubscribe rename(String name) {
        return new DqcWarningSubscribe(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DqcWarningSubscribe rename(Name name) {
        return new DqcWarningSubscribe(name, null);
    }
}
