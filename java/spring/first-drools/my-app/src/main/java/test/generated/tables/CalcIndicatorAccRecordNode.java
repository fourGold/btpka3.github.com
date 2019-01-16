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
import test.generated.tables.records.CalcIndicatorAccRecordNodeRecord;


/**
 * 特征周期计算任务节点表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcIndicatorAccRecordNode extends TableImpl<CalcIndicatorAccRecordNodeRecord> {

    private static final long serialVersionUID = 1442749520;

    /**
     * The reference instance of <code>SMETA_APP.calc_indicator_acc_record_node</code>
     */
    public static final CalcIndicatorAccRecordNode CALC_INDICATOR_ACC_RECORD_NODE = new CalcIndicatorAccRecordNode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CalcIndicatorAccRecordNodeRecord> getRecordType() {
        return CalcIndicatorAccRecordNodeRecord.class;
    }

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.id</code>. 主键
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.gmt_create</code>. 创建时间
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.gmt_modified</code>. 修改时间
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.record_id</code>. acc_record关联ID
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, ULong> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "acc_record关联ID");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.operator_id</code>. 操作人工号
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "操作人工号");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.operator</code>. 操作人
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "操作人");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.access_start_time</code>. 取数开始时间，格式：2015-12-23
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> ACCESS_START_TIME = createField("access_start_time", org.jooq.impl.SQLDataType.VARCHAR(32), this, "取数开始时间，格式：2015-12-23");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.access_end_time</code>. 取数结束时间，格式：2015-12-23
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> ACCESS_END_TIME = createField("access_end_time", org.jooq.impl.SQLDataType.VARCHAR(32), this, "取数结束时间，格式：2015-12-23");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.node_step</code>. 节点计算阶段。1：仅最终计算一个节点；11：预处理，22：指标计算，33：分批join，44：最终join
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, Integer> NODE_STEP = createField("node_step", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "节点计算阶段。1：仅最终计算一个节点；11：预处理，22：指标计算，33：分批join，44：最终join");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.resulte_table_name</code>. 各阶段结果表名
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> RESULTE_TABLE_NAME = createField("resulte_table_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "各阶段结果表名");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.ddl_node_id</code>. DDL节点ID
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> DDL_NODE_ID = createField("ddl_node_id", org.jooq.impl.SQLDataType.VARCHAR(32), this, "DDL节点ID");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.ddl_node_context</code>. DDL节点内容
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> DDL_NODE_CONTEXT = createField("ddl_node_context", org.jooq.impl.SQLDataType.CLOB, this, "DDL节点内容");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.node_id</code>. 节点ID
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> NODE_ID = createField("node_id", org.jooq.impl.SQLDataType.VARCHAR(32), this, "节点ID");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.node_context</code>. 节点内容
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> NODE_CONTEXT = createField("node_context", org.jooq.impl.SQLDataType.CLOB, this, "节点内容");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.failure_msg</code>. 节点创建失败原因
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, String> FAILURE_MSG = createField("failure_msg", org.jooq.impl.SQLDataType.CLOB, this, "节点创建失败原因");

    /**
     * The column <code>SMETA_APP.calc_indicator_acc_record_node.status</code>. 状态：1正常，2失败
     */
    public final TableField<CalcIndicatorAccRecordNodeRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "状态：1正常，2失败");

    /**
     * Create a <code>SMETA_APP.calc_indicator_acc_record_node</code> table reference
     */
    public CalcIndicatorAccRecordNode() {
        this(DSL.name("calc_indicator_acc_record_node"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.calc_indicator_acc_record_node</code> table reference
     */
    public CalcIndicatorAccRecordNode(String alias) {
        this(DSL.name(alias), CALC_INDICATOR_ACC_RECORD_NODE);
    }

    /**
     * Create an aliased <code>SMETA_APP.calc_indicator_acc_record_node</code> table reference
     */
    public CalcIndicatorAccRecordNode(Name alias) {
        this(alias, CALC_INDICATOR_ACC_RECORD_NODE);
    }

    private CalcIndicatorAccRecordNode(Name alias, Table<CalcIndicatorAccRecordNodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CalcIndicatorAccRecordNode(Name alias, Table<CalcIndicatorAccRecordNodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "特征周期计算任务节点表");
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
        return Arrays.<Index>asList(Indexes.CALC_INDICATOR_ACC_RECORD_NODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CalcIndicatorAccRecordNodeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CALC_INDICATOR_ACC_RECORD_NODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CalcIndicatorAccRecordNodeRecord> getPrimaryKey() {
        return Keys.KEY_CALC_INDICATOR_ACC_RECORD_NODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CalcIndicatorAccRecordNodeRecord>> getKeys() {
        return Arrays.<UniqueKey<CalcIndicatorAccRecordNodeRecord>>asList(Keys.KEY_CALC_INDICATOR_ACC_RECORD_NODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorAccRecordNode as(String alias) {
        return new CalcIndicatorAccRecordNode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorAccRecordNode as(Name alias) {
        return new CalcIndicatorAccRecordNode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CalcIndicatorAccRecordNode rename(String name) {
        return new CalcIndicatorAccRecordNode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CalcIndicatorAccRecordNode rename(Name name) {
        return new CalcIndicatorAccRecordNode(name, null);
    }
}