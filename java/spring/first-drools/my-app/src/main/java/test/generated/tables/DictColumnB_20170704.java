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
import test.generated.tables.records.DictColumnB_20170704Record;


/**
 * 数据字典属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictColumnB_20170704 extends TableImpl<DictColumnB_20170704Record> {

    private static final long serialVersionUID = -1210321276;

    /**
     * The reference instance of <code>SMETA_APP.dict_column_b_20170704</code>
     */
    public static final DictColumnB_20170704 DICT_COLUMN_B_20170704 = new DictColumnB_20170704();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictColumnB_20170704Record> getRecordType() {
        return DictColumnB_20170704Record.class;
    }

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.id</code>. 主键
     */
    public final TableField<DictColumnB_20170704Record, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.gmt_create</code>. 创建时间
     */
    public final TableField<DictColumnB_20170704Record, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.gmt_modified</code>. 修改时间
     */
    public final TableField<DictColumnB_20170704Record, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.cn_name</code>. 属性中文名称
     */
    public final TableField<DictColumnB_20170704Record, String> CN_NAME = createField("cn_name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "属性中文名称");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.en_name</code>. 属性英文名称
     */
    public final TableField<DictColumnB_20170704Record, String> EN_NAME = createField("en_name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "属性英文名称");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.code</code>. 属性code
     */
    public final TableField<DictColumnB_20170704Record, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "属性code");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.type</code>. 属性种类
     */
    public final TableField<DictColumnB_20170704Record, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "属性种类");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.operator_id</code>. 操作者工号
     */
    public final TableField<DictColumnB_20170704Record, String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "操作者工号");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.operator</code>. 操作者
     */
    public final TableField<DictColumnB_20170704Record, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "操作者");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.status</code>. 属性审核状态 0  删除  1 有效 2 草稿 3 审核中
     */
    public final TableField<DictColumnB_20170704Record, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "属性审核状态 0  删除  1 有效 2 草稿 3 审核中");

    /**
     * The column <code>SMETA_APP.dict_column_b_20170704.tenant_code</code>. 租户code
     */
    public final TableField<DictColumnB_20170704Record, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("ali_taobao", org.jooq.impl.SQLDataType.VARCHAR)), this, "租户code");

    /**
     * Create a <code>SMETA_APP.dict_column_b_20170704</code> table reference
     */
    public DictColumnB_20170704() {
        this(DSL.name("dict_column_b_20170704"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_column_b_20170704</code> table reference
     */
    public DictColumnB_20170704(String alias) {
        this(DSL.name(alias), DICT_COLUMN_B_20170704);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_column_b_20170704</code> table reference
     */
    public DictColumnB_20170704(Name alias) {
        this(alias, DICT_COLUMN_B_20170704);
    }

    private DictColumnB_20170704(Name alias, Table<DictColumnB_20170704Record> aliased) {
        this(alias, aliased, null);
    }

    private DictColumnB_20170704(Name alias, Table<DictColumnB_20170704Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "数据字典属性表");
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
        return Arrays.<Index>asList(Indexes.DICT_COLUMN_B_20170704_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictColumnB_20170704Record, ULong> getIdentity() {
        return Keys.IDENTITY_DICT_COLUMN_B_20170704;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictColumnB_20170704Record> getPrimaryKey() {
        return Keys.KEY_DICT_COLUMN_B_20170704_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictColumnB_20170704Record>> getKeys() {
        return Arrays.<UniqueKey<DictColumnB_20170704Record>>asList(Keys.KEY_DICT_COLUMN_B_20170704_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnB_20170704 as(String alias) {
        return new DictColumnB_20170704(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnB_20170704 as(Name alias) {
        return new DictColumnB_20170704(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictColumnB_20170704 rename(String name) {
        return new DictColumnB_20170704(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictColumnB_20170704 rename(Name name) {
        return new DictColumnB_20170704(name, null);
    }
}
