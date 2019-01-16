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
import test.generated.tables.records.DictMappingEventRecord;


/**
 * mtee 迁移事件表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictMappingEvent extends TableImpl<DictMappingEventRecord> {

    private static final long serialVersionUID = 2110265614;

    /**
     * The reference instance of <code>SMETA_APP.dict_mapping_event</code>
     */
    public static final DictMappingEvent DICT_MAPPING_EVENT = new DictMappingEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictMappingEventRecord> getRecordType() {
        return DictMappingEventRecord.class;
    }

    /**
     * The column <code>SMETA_APP.dict_mapping_event.id</code>. 主键
     */
    public final TableField<DictMappingEventRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.gmt_create</code>. 创建时间
     */
    public final TableField<DictMappingEventRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.gmt_modified</code>. 修改时间
     */
    public final TableField<DictMappingEventRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.event_name</code>. 事件名称
     */
    public final TableField<DictMappingEventRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "事件名称");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.event_code</code>. 事件编码
     */
    public final TableField<DictMappingEventRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "事件编码");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.event_type</code>. 事件类型
     */
    public final TableField<DictMappingEventRecord, String> EVENT_TYPE = createField("event_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "事件类型");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.operator_id</code>. 操作人ID
     */
    public final TableField<DictMappingEventRecord, String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "操作人ID");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.operator</code>. 操作人
     */
    public final TableField<DictMappingEventRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "操作人");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.status</code>. 状态（1：迁移审核，2：迁移中，3：已迁移
     */
    public final TableField<DictMappingEventRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "状态（1：迁移审核，2：迁移中，3：已迁移");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.comment</code>. 备注
     */
    public final TableField<DictMappingEventRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(512), this, "备注");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.creater</code>. 创建人
     */
    public final TableField<DictMappingEventRecord, String> CREATER = createField("creater", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "创建人");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.creater_id</code>. 创建人ID
     */
    public final TableField<DictMappingEventRecord, String> CREATER_ID = createField("creater_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "创建人ID");

    /**
     * The column <code>SMETA_APP.dict_mapping_event.submitter</code>. 审核提交人
     */
    public final TableField<DictMappingEventRecord, String> SUBMITTER = createField("submitter", org.jooq.impl.SQLDataType.VARCHAR(64), this, "审核提交人");

    /**
     * Create a <code>SMETA_APP.dict_mapping_event</code> table reference
     */
    public DictMappingEvent() {
        this(DSL.name("dict_mapping_event"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_mapping_event</code> table reference
     */
    public DictMappingEvent(String alias) {
        this(DSL.name(alias), DICT_MAPPING_EVENT);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_mapping_event</code> table reference
     */
    public DictMappingEvent(Name alias) {
        this(alias, DICT_MAPPING_EVENT);
    }

    private DictMappingEvent(Name alias, Table<DictMappingEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictMappingEvent(Name alias, Table<DictMappingEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "mtee 迁移事件表");
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
        return Arrays.<Index>asList(Indexes.DICT_MAPPING_EVENT_IDX_EVENT_CODE, Indexes.DICT_MAPPING_EVENT_IDX_EVENT_TYPE, Indexes.DICT_MAPPING_EVENT_PRIMARY, Indexes.DICT_MAPPING_EVENT_UNIQUE_EVENT_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictMappingEventRecord, Long> getIdentity() {
        return Keys.IDENTITY_DICT_MAPPING_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictMappingEventRecord> getPrimaryKey() {
        return Keys.KEY_DICT_MAPPING_EVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictMappingEventRecord>> getKeys() {
        return Arrays.<UniqueKey<DictMappingEventRecord>>asList(Keys.KEY_DICT_MAPPING_EVENT_PRIMARY, Keys.KEY_DICT_MAPPING_EVENT_UNIQUE_EVENT_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMappingEvent as(String alias) {
        return new DictMappingEvent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMappingEvent as(Name alias) {
        return new DictMappingEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictMappingEvent rename(String name) {
        return new DictMappingEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictMappingEvent rename(Name name) {
        return new DictMappingEvent(name, null);
    }
}