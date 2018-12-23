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

import test.generated.Indexes;
import test.generated.Keys;
import test.generated.SmetaApp;
import test.generated.tables.records.IndicatorSnapshotRecord;


/**
 * 指标快照
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndicatorSnapshot extends TableImpl<IndicatorSnapshotRecord> {

    private static final long serialVersionUID = -1188416249;

    /**
     * The reference instance of <code>SMETA_APP.indicator_snapshot</code>
     */
    public static final IndicatorSnapshot INDICATOR_SNAPSHOT = new IndicatorSnapshot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndicatorSnapshotRecord> getRecordType() {
        return IndicatorSnapshotRecord.class;
    }

    /**
     * The column <code>SMETA_APP.indicator_snapshot.id</code>. 主键
     */
    public final TableField<IndicatorSnapshotRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.gmt_create</code>. 创建时间
     */
    public final TableField<IndicatorSnapshotRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.gmt_modified</code>. 修改时间
     */
    public final TableField<IndicatorSnapshotRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.opt_type</code>. 操作类型（新增、修改，删除，上线，下线）（ADD，MODIFY，DELETE，ONLINE，OFFLINE）
     */
    public final TableField<IndicatorSnapshotRecord, String> OPT_TYPE = createField("opt_type", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "操作类型（新增、修改，删除，上线，下线）（ADD，MODIFY，DELETE，ONLINE，OFFLINE）");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.workspace_code</code>. 操作信息
     */
    public final TableField<IndicatorSnapshotRecord, String> WORKSPACE_CODE = createField("workspace_code", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "操作信息");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.indicator_code</code>. 指标编码
     */
    public final TableField<IndicatorSnapshotRecord, String> INDICATOR_CODE = createField("indicator_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "指标编码");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.indicator_name</code>. 指标名称
     */
    public final TableField<IndicatorSnapshotRecord, String> INDICATOR_NAME = createField("indicator_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "指标名称");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.algorithm</code>. 计算逻辑
     */
    public final TableField<IndicatorSnapshotRecord, String> ALGORITHM = createField("algorithm", org.jooq.impl.SQLDataType.CLOB, this, "计算逻辑");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.operator</code>. 操作人
     */
    public final TableField<IndicatorSnapshotRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "操作人");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.indicator_do</code>. 指标序列化对象
     */
    public final TableField<IndicatorSnapshotRecord, byte[]> INDICATOR_DO = createField("indicator_do", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "指标序列化对象");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.approval</code>. 审批人
     */
    public final TableField<IndicatorSnapshotRecord, String> APPROVAL = createField("approval", org.jooq.impl.SQLDataType.VARCHAR(64), this, "审批人");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.status</code>. 审批状态（初始化，审批中，审批通过，审批不通过）（init，pending，agree，refuse）
     */
    public final TableField<IndicatorSnapshotRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "审批状态（初始化，审批中，审批通过，审批不通过）（init，pending，agree，refuse）");

    /**
     * The column <code>SMETA_APP.indicator_snapshot.reason</code>. 审批理由
     */
    public final TableField<IndicatorSnapshotRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(128), this, "审批理由");

    /**
     * Create a <code>SMETA_APP.indicator_snapshot</code> table reference
     */
    public IndicatorSnapshot() {
        this(DSL.name("indicator_snapshot"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.indicator_snapshot</code> table reference
     */
    public IndicatorSnapshot(String alias) {
        this(DSL.name(alias), INDICATOR_SNAPSHOT);
    }

    /**
     * Create an aliased <code>SMETA_APP.indicator_snapshot</code> table reference
     */
    public IndicatorSnapshot(Name alias) {
        this(alias, INDICATOR_SNAPSHOT);
    }

    private IndicatorSnapshot(Name alias, Table<IndicatorSnapshotRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndicatorSnapshot(Name alias, Table<IndicatorSnapshotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "指标快照");
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
        return Arrays.<Index>asList(Indexes.INDICATOR_SNAPSHOT_IDX_INDEX_INDICATOR_CODE, Indexes.INDICATOR_SNAPSHOT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IndicatorSnapshotRecord, Long> getIdentity() {
        return Keys.IDENTITY_INDICATOR_SNAPSHOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndicatorSnapshotRecord> getPrimaryKey() {
        return Keys.KEY_INDICATOR_SNAPSHOT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndicatorSnapshotRecord>> getKeys() {
        return Arrays.<UniqueKey<IndicatorSnapshotRecord>>asList(Keys.KEY_INDICATOR_SNAPSHOT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorSnapshot as(String alias) {
        return new IndicatorSnapshot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorSnapshot as(Name alias) {
        return new IndicatorSnapshot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndicatorSnapshot rename(String name) {
        return new IndicatorSnapshot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndicatorSnapshot rename(Name name) {
        return new IndicatorSnapshot(name, null);
    }
}
