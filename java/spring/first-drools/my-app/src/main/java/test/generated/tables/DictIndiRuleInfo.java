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
import test.generated.tables.records.DictIndiRuleInfoRecord;


/**
 * 数据字典对应指标规则信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictIndiRuleInfo extends TableImpl<DictIndiRuleInfoRecord> {

    private static final long serialVersionUID = 427930649;

    /**
     * The reference instance of <code>SMETA_APP.dict_indi_rule_info</code>
     */
    public static final DictIndiRuleInfo DICT_INDI_RULE_INFO = new DictIndiRuleInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictIndiRuleInfoRecord> getRecordType() {
        return DictIndiRuleInfoRecord.class;
    }

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.id</code>. 主键
     */
    public final TableField<DictIndiRuleInfoRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.event_code</code>. 指标事件code
     */
    public final TableField<DictIndiRuleInfoRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "指标事件code");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.event_column_code</code>. 用于计算指标的事件属性code，暂时只有实时指标才有
     */
    public final TableField<DictIndiRuleInfoRecord, String> EVENT_COLUMN_CODE = createField("event_column_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "用于计算指标的事件属性code，暂时只有实时指标才有");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.indi_code</code>. 指标code
     */
    public final TableField<DictIndiRuleInfoRecord, String> INDI_CODE = createField("indi_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "指标code");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.indi_name</code>. 指标名称
     */
    public final TableField<DictIndiRuleInfoRecord, String> INDI_NAME = createField("indi_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "指标名称");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.indi_owner</code>. 指标负责人
     */
    public final TableField<DictIndiRuleInfoRecord, String> INDI_OWNER = createField("indi_owner", org.jooq.impl.SQLDataType.VARCHAR(128), this, "指标负责人");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.indi_type</code>. 指标类型
     */
    public final TableField<DictIndiRuleInfoRecord, String> INDI_TYPE = createField("indi_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "指标类型");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.rule_id</code>. 规则ID
     */
    public final TableField<DictIndiRuleInfoRecord, Long> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.BIGINT, this, "规则ID");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.rule_title</code>. 规则名称
     */
    public final TableField<DictIndiRuleInfoRecord, String> RULE_TITLE = createField("rule_title", org.jooq.impl.SQLDataType.VARCHAR(128), this, "规则名称");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.rule_owner</code>. 规则业务联系人
     */
    public final TableField<DictIndiRuleInfoRecord, String> RULE_OWNER = createField("rule_owner", org.jooq.impl.SQLDataType.VARCHAR(64), this, "规则业务联系人");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.rule_event_code</code>. 规则对应事件code
     */
    public final TableField<DictIndiRuleInfoRecord, String> RULE_EVENT_CODE = createField("rule_event_code", org.jooq.impl.SQLDataType.VARCHAR(128), this, "规则对应事件code");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.gmt_create</code>. 创建时间
     */
    public final TableField<DictIndiRuleInfoRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.gmt_modified</code>. 修改时间
     */
    public final TableField<DictIndiRuleInfoRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改时间");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.indi_level</code>. 指标业务等级：P1，P2，P3，P4
     */
    public final TableField<DictIndiRuleInfoRecord, String> INDI_LEVEL = createField("indi_level", org.jooq.impl.SQLDataType.VARCHAR(32), this, "指标业务等级：P1，P2，P3，P4");

    /**
     * The column <code>SMETA_APP.dict_indi_rule_info.rule_level</code>. 规则业务等级
     */
    public final TableField<DictIndiRuleInfoRecord, String> RULE_LEVEL = createField("rule_level", org.jooq.impl.SQLDataType.VARCHAR(32), this, "规则业务等级");

    /**
     * Create a <code>SMETA_APP.dict_indi_rule_info</code> table reference
     */
    public DictIndiRuleInfo() {
        this(DSL.name("dict_indi_rule_info"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_indi_rule_info</code> table reference
     */
    public DictIndiRuleInfo(String alias) {
        this(DSL.name(alias), DICT_INDI_RULE_INFO);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_indi_rule_info</code> table reference
     */
    public DictIndiRuleInfo(Name alias) {
        this(alias, DICT_INDI_RULE_INFO);
    }

    private DictIndiRuleInfo(Name alias, Table<DictIndiRuleInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictIndiRuleInfo(Name alias, Table<DictIndiRuleInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "数据字典对应指标规则信息表");
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
        return Arrays.<Index>asList(Indexes.DICT_INDI_RULE_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictIndiRuleInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_DICT_INDI_RULE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictIndiRuleInfoRecord> getPrimaryKey() {
        return Keys.KEY_DICT_INDI_RULE_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictIndiRuleInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<DictIndiRuleInfoRecord>>asList(Keys.KEY_DICT_INDI_RULE_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndiRuleInfo as(String alias) {
        return new DictIndiRuleInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndiRuleInfo as(Name alias) {
        return new DictIndiRuleInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictIndiRuleInfo rename(String name) {
        return new DictIndiRuleInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictIndiRuleInfo rename(Name name) {
        return new DictIndiRuleInfo(name, null);
    }
}