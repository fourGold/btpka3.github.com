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
import test.generated.tables.records.EventHourMonitorRecord;


/**
 * 事件小时监控表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventHourMonitor extends TableImpl<EventHourMonitorRecord> {

    private static final long serialVersionUID = 2001081542;

    /**
     * The reference instance of <code>SMETA_APP.event_hour_monitor</code>
     */
    public static final EventHourMonitor EVENT_HOUR_MONITOR = new EventHourMonitor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventHourMonitorRecord> getRecordType() {
        return EventHourMonitorRecord.class;
    }

    /**
     * The column <code>SMETA_APP.event_hour_monitor.id</code>. 主键
     */
    public final TableField<EventHourMonitorRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.gmt_create</code>. 创建时间
     */
    public final TableField<EventHourMonitorRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.gmt_modified</code>. 修改时间
     */
    public final TableField<EventHourMonitorRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.event_code</code>. 事件编码
     */
    public final TableField<EventHourMonitorRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "事件编码");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.biz_date</code>. 业务时间：格式2016070110
     */
    public final TableField<EventHourMonitorRecord, String> BIZ_DATE = createField("biz_date", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "业务时间：格式2016070110");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.mtee_dispatch_cnt</code>. mtee分发量
     */
    public final TableField<EventHourMonitorRecord, Double> MTEE_DISPATCH_CNT = createField("mtee_dispatch_cnt", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000", org.jooq.impl.SQLDataType.DOUBLE)), this, "mtee分发量");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.pisa_dispatch_cnt</code>. pisa分发量
     */
    public final TableField<EventHourMonitorRecord, Integer> PISA_DISPATCH_CNT = createField("pisa_dispatch_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "pisa分发量");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.sevent_deal_cnt</code>. sevent处理量
     */
    public final TableField<EventHourMonitorRecord, Integer> SEVENT_DEAL_CNT = createField("sevent_deal_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "sevent处理量");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.datahub_write_cnt</code>. datahub写入量
     */
    public final TableField<EventHourMonitorRecord, Integer> DATAHUB_WRITE_CNT = createField("datahub_write_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "datahub写入量");

    /**
     * The column <code>SMETA_APP.event_hour_monitor.hbase_write_cnt</code>. hbase写入量
     */
    public final TableField<EventHourMonitorRecord, Integer> HBASE_WRITE_CNT = createField("hbase_write_cnt", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hbase写入量");

    /**
     * Create a <code>SMETA_APP.event_hour_monitor</code> table reference
     */
    public EventHourMonitor() {
        this(DSL.name("event_hour_monitor"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.event_hour_monitor</code> table reference
     */
    public EventHourMonitor(String alias) {
        this(DSL.name(alias), EVENT_HOUR_MONITOR);
    }

    /**
     * Create an aliased <code>SMETA_APP.event_hour_monitor</code> table reference
     */
    public EventHourMonitor(Name alias) {
        this(alias, EVENT_HOUR_MONITOR);
    }

    private EventHourMonitor(Name alias, Table<EventHourMonitorRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventHourMonitor(Name alias, Table<EventHourMonitorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "事件小时监控表");
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
        return Arrays.<Index>asList(Indexes.EVENT_HOUR_MONITOR_IDX_EVENT_CODE_BIZ_DATE, Indexes.EVENT_HOUR_MONITOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EventHourMonitorRecord, ULong> getIdentity() {
        return Keys.IDENTITY_EVENT_HOUR_MONITOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EventHourMonitorRecord> getPrimaryKey() {
        return Keys.KEY_EVENT_HOUR_MONITOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventHourMonitorRecord>> getKeys() {
        return Arrays.<UniqueKey<EventHourMonitorRecord>>asList(Keys.KEY_EVENT_HOUR_MONITOR_PRIMARY, Keys.KEY_EVENT_HOUR_MONITOR_IDX_EVENT_CODE_BIZ_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventHourMonitor as(String alias) {
        return new EventHourMonitor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventHourMonitor as(Name alias) {
        return new EventHourMonitor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventHourMonitor rename(String name) {
        return new EventHourMonitor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventHourMonitor rename(Name name) {
        return new EventHourMonitor(name, null);
    }
}