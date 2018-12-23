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
import test.generated.tables.records.UfDetailTemplateRecord;


/**
 * 审批详情模板表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfDetailTemplate extends TableImpl<UfDetailTemplateRecord> {

    private static final long serialVersionUID = 1757301984;

    /**
     * The reference instance of <code>SMETA_APP.uf_detail_template</code>
     */
    public static final UfDetailTemplate UF_DETAIL_TEMPLATE = new UfDetailTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfDetailTemplateRecord> getRecordType() {
        return UfDetailTemplateRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_detail_template.id</code>. 主键
     */
    public final TableField<UfDetailTemplateRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_detail_template.gmt_create</code>. 创建时间
     */
    public final TableField<UfDetailTemplateRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_detail_template.gmt_modified</code>. 修改时间
     */
    public final TableField<UfDetailTemplateRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_detail_template.last_operator</code>. 最近修改人
     */
    public final TableField<UfDetailTemplateRecord, ULong> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "最近修改人");

    /**
     * The column <code>SMETA_APP.uf_detail_template.flow_code</code>. 流程编码
     */
    public final TableField<UfDetailTemplateRecord, String> FLOW_CODE = createField("flow_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "流程编码");

    /**
     * The column <code>SMETA_APP.uf_detail_template.vm_content</code>. web端的vm脚本
     */
    public final TableField<UfDetailTemplateRecord, String> VM_CONTENT = createField("vm_content", org.jooq.impl.SQLDataType.VARCHAR(10000).nullable(false), this, "web端的vm脚本");

    /**
     * The column <code>SMETA_APP.uf_detail_template.msg_method</code>. 通知方式（1内外 2钉钉 3邮件）
     */
    public final TableField<UfDetailTemplateRecord, String> MSG_METHOD = createField("msg_method", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "通知方式（1内外 2钉钉 3邮件）");

    /**
     * The column <code>SMETA_APP.uf_detail_template.msg_content</code>. 消息内容
     */
    public final TableField<UfDetailTemplateRecord, String> MSG_CONTENT = createField("msg_content", org.jooq.impl.SQLDataType.VARCHAR(300), this, "消息内容");

    /**
     * The column <code>SMETA_APP.uf_detail_template.app_vm_content</code>. 无线端的vm脚本
     */
    public final TableField<UfDetailTemplateRecord, String> APP_VM_CONTENT = createField("app_vm_content", org.jooq.impl.SQLDataType.VARCHAR(10000), this, "无线端的vm脚本");

    /**
     * Create a <code>SMETA_APP.uf_detail_template</code> table reference
     */
    public UfDetailTemplate() {
        this(DSL.name("uf_detail_template"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_detail_template</code> table reference
     */
    public UfDetailTemplate(String alias) {
        this(DSL.name(alias), UF_DETAIL_TEMPLATE);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_detail_template</code> table reference
     */
    public UfDetailTemplate(Name alias) {
        this(alias, UF_DETAIL_TEMPLATE);
    }

    private UfDetailTemplate(Name alias, Table<UfDetailTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfDetailTemplate(Name alias, Table<UfDetailTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "审批详情模板表");
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
        return Arrays.<Index>asList(Indexes.UF_DETAIL_TEMPLATE_PRIMARY, Indexes.UF_DETAIL_TEMPLATE_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfDetailTemplateRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_DETAIL_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfDetailTemplateRecord> getPrimaryKey() {
        return Keys.KEY_UF_DETAIL_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfDetailTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<UfDetailTemplateRecord>>asList(Keys.KEY_UF_DETAIL_TEMPLATE_PRIMARY, Keys.KEY_UF_DETAIL_TEMPLATE_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfDetailTemplate as(String alias) {
        return new UfDetailTemplate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfDetailTemplate as(Name alias) {
        return new UfDetailTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfDetailTemplate rename(String name) {
        return new UfDetailTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfDetailTemplate rename(Name name) {
        return new UfDetailTemplate(name, null);
    }
}
