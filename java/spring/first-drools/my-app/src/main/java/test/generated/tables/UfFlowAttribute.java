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
import test.generated.tables.records.UfFlowAttributeRecord;


/**
 * 租户流程属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfFlowAttribute extends TableImpl<UfFlowAttributeRecord> {

    private static final long serialVersionUID = -726938213;

    /**
     * The reference instance of <code>SMETA_APP.uf_flow_attribute</code>
     */
    public static final UfFlowAttribute UF_FLOW_ATTRIBUTE = new UfFlowAttribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfFlowAttributeRecord> getRecordType() {
        return UfFlowAttributeRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.id</code>. 主键
     */
    public final TableField<UfFlowAttributeRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.gmt_create</code>. 创建时间
     */
    public final TableField<UfFlowAttributeRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.gmt_modified</code>. 修改时间
     */
    public final TableField<UfFlowAttributeRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.last_operator</code>. 最近修改人
     */
    public final TableField<UfFlowAttributeRecord, ULong> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "最近修改人");

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.tenant_code</code>. 租户code
     */
    public final TableField<UfFlowAttributeRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "租户code");

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.flow_switch</code>. 审批开关（on打开 off关闭）
     */
    public final TableField<UfFlowAttributeRecord, String> FLOW_SWITCH = createField("flow_switch", org.jooq.impl.SQLDataType.VARCHAR(28).nullable(false), this, "审批开关（on打开 off关闭）");

    /**
     * The column <code>SMETA_APP.uf_flow_attribute.flow_code</code>. 工作流code
     */
    public final TableField<UfFlowAttributeRecord, String> FLOW_CODE = createField("flow_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "工作流code");

    /**
     * Create a <code>SMETA_APP.uf_flow_attribute</code> table reference
     */
    public UfFlowAttribute() {
        this(DSL.name("uf_flow_attribute"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_flow_attribute</code> table reference
     */
    public UfFlowAttribute(String alias) {
        this(DSL.name(alias), UF_FLOW_ATTRIBUTE);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_flow_attribute</code> table reference
     */
    public UfFlowAttribute(Name alias) {
        this(alias, UF_FLOW_ATTRIBUTE);
    }

    private UfFlowAttribute(Name alias, Table<UfFlowAttributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfFlowAttribute(Name alias, Table<UfFlowAttributeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "租户流程属性表");
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
        return Arrays.<Index>asList(Indexes.UF_FLOW_ATTRIBUTE_PRIMARY, Indexes.UF_FLOW_ATTRIBUTE_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfFlowAttributeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_FLOW_ATTRIBUTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfFlowAttributeRecord> getPrimaryKey() {
        return Keys.KEY_UF_FLOW_ATTRIBUTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfFlowAttributeRecord>> getKeys() {
        return Arrays.<UniqueKey<UfFlowAttributeRecord>>asList(Keys.KEY_UF_FLOW_ATTRIBUTE_PRIMARY, Keys.KEY_UF_FLOW_ATTRIBUTE_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowAttribute as(String alias) {
        return new UfFlowAttribute(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowAttribute as(Name alias) {
        return new UfFlowAttribute(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfFlowAttribute rename(String name) {
        return new UfFlowAttribute(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfFlowAttribute rename(Name name) {
        return new UfFlowAttribute(name, null);
    }
}
