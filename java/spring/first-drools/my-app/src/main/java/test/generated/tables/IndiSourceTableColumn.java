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
import test.generated.tables.records.IndiSourceTableColumnRecord;


/**
 * 源表字段
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndiSourceTableColumn extends TableImpl<IndiSourceTableColumnRecord> {

    private static final long serialVersionUID = 1320838395;

    /**
     * The reference instance of <code>SMETA_APP.indi_source_table_column</code>
     */
    public static final IndiSourceTableColumn INDI_SOURCE_TABLE_COLUMN = new IndiSourceTableColumn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndiSourceTableColumnRecord> getRecordType() {
        return IndiSourceTableColumnRecord.class;
    }

    /**
     * The column <code>SMETA_APP.indi_source_table_column.id</code>. 主键
     */
    public final TableField<IndiSourceTableColumnRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.gmt_create</code>. 创建时间
     */
    public final TableField<IndiSourceTableColumnRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.gmt_modified</code>. 修改时间
     */
    public final TableField<IndiSourceTableColumnRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.source_table_name</code>. 源表表名
     */
    public final TableField<IndiSourceTableColumnRecord, String> SOURCE_TABLE_NAME = createField("source_table_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "源表表名");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.column_name</code>. 字段名称
     */
    public final TableField<IndiSourceTableColumnRecord, String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "字段名称");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.column_type</code>. 字段类型
     */
    public final TableField<IndiSourceTableColumnRecord, String> COLUMN_TYPE = createField("column_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "字段类型");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.column_comment</code>. 字段描述
     */
    public final TableField<IndiSourceTableColumnRecord, String> COLUMN_COMMENT = createField("column_comment", org.jooq.impl.SQLDataType.CLOB, this, "字段描述");

    /**
     * The column <code>SMETA_APP.indi_source_table_column.column_flag</code>. 0非指标、1指标、2主键
     */
    public final TableField<IndiSourceTableColumnRecord, Integer> COLUMN_FLAG = createField("column_flag", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0非指标、1指标、2主键");

    /**
     * Create a <code>SMETA_APP.indi_source_table_column</code> table reference
     */
    public IndiSourceTableColumn() {
        this(DSL.name("indi_source_table_column"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.indi_source_table_column</code> table reference
     */
    public IndiSourceTableColumn(String alias) {
        this(DSL.name(alias), INDI_SOURCE_TABLE_COLUMN);
    }

    /**
     * Create an aliased <code>SMETA_APP.indi_source_table_column</code> table reference
     */
    public IndiSourceTableColumn(Name alias) {
        this(alias, INDI_SOURCE_TABLE_COLUMN);
    }

    private IndiSourceTableColumn(Name alias, Table<IndiSourceTableColumnRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndiSourceTableColumn(Name alias, Table<IndiSourceTableColumnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "源表字段");
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
        return Arrays.<Index>asList(Indexes.INDI_SOURCE_TABLE_COLUMN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IndiSourceTableColumnRecord, ULong> getIdentity() {
        return Keys.IDENTITY_INDI_SOURCE_TABLE_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndiSourceTableColumnRecord> getPrimaryKey() {
        return Keys.KEY_INDI_SOURCE_TABLE_COLUMN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndiSourceTableColumnRecord>> getKeys() {
        return Arrays.<UniqueKey<IndiSourceTableColumnRecord>>asList(Keys.KEY_INDI_SOURCE_TABLE_COLUMN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumn as(String alias) {
        return new IndiSourceTableColumn(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiSourceTableColumn as(Name alias) {
        return new IndiSourceTableColumn(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndiSourceTableColumn rename(String name) {
        return new IndiSourceTableColumn(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndiSourceTableColumn rename(Name name) {
        return new IndiSourceTableColumn(name, null);
    }
}
