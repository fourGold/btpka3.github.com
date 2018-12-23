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
import test.generated.tables.records.UfRoleRecord;


/**
 * 租户角色表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfRole extends TableImpl<UfRoleRecord> {

    private static final long serialVersionUID = -1896184579;

    /**
     * The reference instance of <code>SMETA_APP.uf_role</code>
     */
    public static final UfRole UF_ROLE = new UfRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfRoleRecord> getRecordType() {
        return UfRoleRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_role.id</code>. 主键
     */
    public final TableField<UfRoleRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_role.gmt_create</code>. 创建时间
     */
    public final TableField<UfRoleRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_role.gmt_modified</code>. 修改时间
     */
    public final TableField<UfRoleRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_role.code</code>. 角色代码
     */
    public final TableField<UfRoleRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "角色代码");

    /**
     * The column <code>SMETA_APP.uf_role.title</code>. 角色名称
     */
    public final TableField<UfRoleRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "角色名称");

    /**
     * The column <code>SMETA_APP.uf_role.comment</code>. 角色说明
     */
    public final TableField<UfRoleRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(300), this, "角色说明");

    /**
     * The column <code>SMETA_APP.uf_role.tenant_code</code>. 租户code
     */
    public final TableField<UfRoleRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "租户code");

    /**
     * The column <code>SMETA_APP.uf_role.creator</code>. 创建者
     */
    public final TableField<UfRoleRecord, ULong> CREATOR = createField("creator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "创建者");

    /**
     * The column <code>SMETA_APP.uf_role.last_operator</code>. 最后修改人
     */
    public final TableField<UfRoleRecord, ULong> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "最后修改人");

    /**
     * The column <code>SMETA_APP.uf_role.type</code>. 角色类型（1通用 2私人订制）
     */
    public final TableField<UfRoleRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "角色类型（1通用 2私人订制）");

    /**
     * Create a <code>SMETA_APP.uf_role</code> table reference
     */
    public UfRole() {
        this(DSL.name("uf_role"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_role</code> table reference
     */
    public UfRole(String alias) {
        this(DSL.name(alias), UF_ROLE);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_role</code> table reference
     */
    public UfRole(Name alias) {
        this(alias, UF_ROLE);
    }

    private UfRole(Name alias, Table<UfRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfRole(Name alias, Table<UfRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "租户角色表");
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
        return Arrays.<Index>asList(Indexes.UF_ROLE_PRIMARY, Indexes.UF_ROLE_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfRoleRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfRoleRecord> getPrimaryKey() {
        return Keys.KEY_UF_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UfRoleRecord>>asList(Keys.KEY_UF_ROLE_PRIMARY, Keys.KEY_UF_ROLE_UK_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfRole as(String alias) {
        return new UfRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfRole as(Name alias) {
        return new UfRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfRole rename(String name) {
        return new UfRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfRole rename(Name name) {
        return new UfRole(name, null);
    }
}
