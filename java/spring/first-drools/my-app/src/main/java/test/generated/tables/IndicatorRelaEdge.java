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
import test.generated.tables.records.IndicatorRelaEdgeRecord;


/**
 * 关系特征中边的信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndicatorRelaEdge extends TableImpl<IndicatorRelaEdgeRecord> {

    private static final long serialVersionUID = -1926756305;

    /**
     * The reference instance of <code>SMETA_APP.indicator_rela_edge</code>
     */
    public static final IndicatorRelaEdge INDICATOR_RELA_EDGE = new IndicatorRelaEdge();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndicatorRelaEdgeRecord> getRecordType() {
        return IndicatorRelaEdgeRecord.class;
    }

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.id</code>. 主键
     */
    public final TableField<IndicatorRelaEdgeRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.gmt_create</code>. 创建时间
     */
    public final TableField<IndicatorRelaEdgeRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.gmt_modified</code>. 修改时间
     */
    public final TableField<IndicatorRelaEdgeRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.edge_code</code>. 关系中边的code
     */
    public final TableField<IndicatorRelaEdgeRecord, String> EDGE_CODE = createField("edge_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "关系中边的code");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.edge_name</code>. 关系中边的名称
     */
    public final TableField<IndicatorRelaEdgeRecord, String> EDGE_NAME = createField("edge_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "关系中边的名称");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.start_point_code</code>. 边起始点的code
     */
    public final TableField<IndicatorRelaEdgeRecord, String> START_POINT_CODE = createField("start_point_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "边起始点的code");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.end_point_code</code>. 边结束点的code
     */
    public final TableField<IndicatorRelaEdgeRecord, String> END_POINT_CODE = createField("end_point_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "边结束点的code");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.is_valid</code>. 是否有效，0-无效；1-有效
     */
    public final TableField<IndicatorRelaEdgeRecord, Short> IS_VALID = createField("is_valid", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "是否有效，0-无效；1-有效");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.odps_table_name</code>. 在odps上的表的名字，应用名.表名
     */
    public final TableField<IndicatorRelaEdgeRecord, String> ODPS_TABLE_NAME = createField("odps_table_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "在odps上的表的名字，应用名.表名");

    /**
     * The column <code>SMETA_APP.indicator_rela_edge.gbase_table_name</code>. gbase上的表的名字
     */
    public final TableField<IndicatorRelaEdgeRecord, String> GBASE_TABLE_NAME = createField("gbase_table_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "gbase上的表的名字");

    /**
     * Create a <code>SMETA_APP.indicator_rela_edge</code> table reference
     */
    public IndicatorRelaEdge() {
        this(DSL.name("indicator_rela_edge"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.indicator_rela_edge</code> table reference
     */
    public IndicatorRelaEdge(String alias) {
        this(DSL.name(alias), INDICATOR_RELA_EDGE);
    }

    /**
     * Create an aliased <code>SMETA_APP.indicator_rela_edge</code> table reference
     */
    public IndicatorRelaEdge(Name alias) {
        this(alias, INDICATOR_RELA_EDGE);
    }

    private IndicatorRelaEdge(Name alias, Table<IndicatorRelaEdgeRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndicatorRelaEdge(Name alias, Table<IndicatorRelaEdgeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "关系特征中边的信息");
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
        return Arrays.<Index>asList(Indexes.INDICATOR_RELA_EDGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IndicatorRelaEdgeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_INDICATOR_RELA_EDGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndicatorRelaEdgeRecord> getPrimaryKey() {
        return Keys.KEY_INDICATOR_RELA_EDGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndicatorRelaEdgeRecord>> getKeys() {
        return Arrays.<UniqueKey<IndicatorRelaEdgeRecord>>asList(Keys.KEY_INDICATOR_RELA_EDGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorRelaEdge as(String alias) {
        return new IndicatorRelaEdge(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorRelaEdge as(Name alias) {
        return new IndicatorRelaEdge(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndicatorRelaEdge rename(String name) {
        return new IndicatorRelaEdge(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndicatorRelaEdge rename(Name name) {
        return new IndicatorRelaEdge(name, null);
    }
}
