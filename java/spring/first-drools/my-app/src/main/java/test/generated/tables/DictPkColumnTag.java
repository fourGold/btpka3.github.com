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
import test.generated.tables.records.DictPkColumnTagRecord;


/**
 * 事件主键属性打标表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictPkColumnTag extends TableImpl<DictPkColumnTagRecord> {

    private static final long serialVersionUID = -1907931035;

    /**
     * The reference instance of <code>SMETA_APP.dict_pk_column_tag</code>
     */
    public static final DictPkColumnTag DICT_PK_COLUMN_TAG = new DictPkColumnTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictPkColumnTagRecord> getRecordType() {
        return DictPkColumnTagRecord.class;
    }

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.id</code>. 主键
     */
    public final TableField<DictPkColumnTagRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.gmt_create</code>. 创建时间
     */
    public final TableField<DictPkColumnTagRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.gmt_modified</code>. 修改时间
     */
    public final TableField<DictPkColumnTagRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.column_code</code>. 属性code
     */
    public final TableField<DictPkColumnTagRecord, String> COLUMN_CODE = createField("column_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "属性code");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.column_tag_code</code>. 属性打标后code
     */
    public final TableField<DictPkColumnTagRecord, String> COLUMN_TAG_CODE = createField("column_tag_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "属性打标后code");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.column_tag_name</code>. 属性打标后中文名
     */
    public final TableField<DictPkColumnTagRecord, String> COLUMN_TAG_NAME = createField("column_tag_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "属性打标后中文名");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.column_ref_code</code>. 被引用的实体或指标
     */
    public final TableField<DictPkColumnTagRecord, String> COLUMN_REF_CODE = createField("column_ref_code", org.jooq.impl.SQLDataType.VARCHAR(64), this, "被引用的实体或指标");

    /**
     * The column <code>SMETA_APP.dict_pk_column_tag.ref_type</code>. 被引用类型，indi-指标，entity-实体
     */
    public final TableField<DictPkColumnTagRecord, String> REF_TYPE = createField("ref_type", org.jooq.impl.SQLDataType.VARCHAR(10), this, "被引用类型，indi-指标，entity-实体");

    /**
     * Create a <code>SMETA_APP.dict_pk_column_tag</code> table reference
     */
    public DictPkColumnTag() {
        this(DSL.name("dict_pk_column_tag"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_pk_column_tag</code> table reference
     */
    public DictPkColumnTag(String alias) {
        this(DSL.name(alias), DICT_PK_COLUMN_TAG);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_pk_column_tag</code> table reference
     */
    public DictPkColumnTag(Name alias) {
        this(alias, DICT_PK_COLUMN_TAG);
    }

    private DictPkColumnTag(Name alias, Table<DictPkColumnTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictPkColumnTag(Name alias, Table<DictPkColumnTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "事件主键属性打标表");
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
        return Arrays.<Index>asList(Indexes.DICT_PK_COLUMN_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictPkColumnTagRecord, ULong> getIdentity() {
        return Keys.IDENTITY_DICT_PK_COLUMN_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictPkColumnTagRecord> getPrimaryKey() {
        return Keys.KEY_DICT_PK_COLUMN_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictPkColumnTagRecord>> getKeys() {
        return Arrays.<UniqueKey<DictPkColumnTagRecord>>asList(Keys.KEY_DICT_PK_COLUMN_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPkColumnTag as(String alias) {
        return new DictPkColumnTag(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPkColumnTag as(Name alias) {
        return new DictPkColumnTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictPkColumnTag rename(String name) {
        return new DictPkColumnTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictPkColumnTag rename(Name name) {
        return new DictPkColumnTag(name, null);
    }
}