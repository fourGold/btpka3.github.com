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
import test.generated.tables.records.UfEventSampleDataRecord;


/**
 * 事件采样数据
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfEventSampleData extends TableImpl<UfEventSampleDataRecord> {

    private static final long serialVersionUID = -1342604031;

    /**
     * The reference instance of <code>SMETA_APP.uf_event_sample_data</code>
     */
    public static final UfEventSampleData UF_EVENT_SAMPLE_DATA = new UfEventSampleData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfEventSampleDataRecord> getRecordType() {
        return UfEventSampleDataRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.id</code>. 主键
     */
    public final TableField<UfEventSampleDataRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.gmt_create</code>. 创建时间
     */
    public final TableField<UfEventSampleDataRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.gmt_modified</code>. 修改时间
     */
    public final TableField<UfEventSampleDataRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.event_code</code>. 事件编码
     */
    public final TableField<UfEventSampleDataRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(150).nullable(false), this, "事件编码");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.ds</code>. 日期
     */
    public final TableField<UfEventSampleDataRecord, String> DS = createField("ds", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "日期");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.data</code>. 数据
     */
    public final TableField<UfEventSampleDataRecord, String> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "数据");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.host</code>. 机器
     */
    public final TableField<UfEventSampleDataRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "机器");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.receive_time</code>. 时间戳
     */
    public final TableField<UfEventSampleDataRecord, ULong> RECEIVE_TIME = createField("receive_time", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "时间戳");

    /**
     * The column <code>SMETA_APP.uf_event_sample_data.trace_id</code>. TraceId
     */
    public final TableField<UfEventSampleDataRecord, String> TRACE_ID = createField("trace_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "TraceId");

    /**
     * Create a <code>SMETA_APP.uf_event_sample_data</code> table reference
     */
    public UfEventSampleData() {
        this(DSL.name("uf_event_sample_data"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_event_sample_data</code> table reference
     */
    public UfEventSampleData(String alias) {
        this(DSL.name(alias), UF_EVENT_SAMPLE_DATA);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_event_sample_data</code> table reference
     */
    public UfEventSampleData(Name alias) {
        this(alias, UF_EVENT_SAMPLE_DATA);
    }

    private UfEventSampleData(Name alias, Table<UfEventSampleDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfEventSampleData(Name alias, Table<UfEventSampleDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "事件采样数据");
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
        return Arrays.<Index>asList(Indexes.UF_EVENT_SAMPLE_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfEventSampleDataRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_EVENT_SAMPLE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfEventSampleDataRecord> getPrimaryKey() {
        return Keys.KEY_UF_EVENT_SAMPLE_DATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfEventSampleDataRecord>> getKeys() {
        return Arrays.<UniqueKey<UfEventSampleDataRecord>>asList(Keys.KEY_UF_EVENT_SAMPLE_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfEventSampleData as(String alias) {
        return new UfEventSampleData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfEventSampleData as(Name alias) {
        return new UfEventSampleData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfEventSampleData rename(String name) {
        return new UfEventSampleData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfEventSampleData rename(Name name) {
        return new UfEventSampleData(name, null);
    }
}
