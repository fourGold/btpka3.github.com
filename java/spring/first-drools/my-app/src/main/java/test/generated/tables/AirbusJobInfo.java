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
import test.generated.tables.records.AirbusJobInfoRecord;


/**
 * 离线引擎调度任务信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusJobInfo extends TableImpl<AirbusJobInfoRecord> {

    private static final long serialVersionUID = -942195492;

    /**
     * The reference instance of <code>SMETA_APP.airbus_job_info</code>
     */
    public static final AirbusJobInfo AIRBUS_JOB_INFO = new AirbusJobInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirbusJobInfoRecord> getRecordType() {
        return AirbusJobInfoRecord.class;
    }

    /**
     * The column <code>SMETA_APP.airbus_job_info.id</code>. 主键
     */
    public final TableField<AirbusJobInfoRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.airbus_job_info.gmt_create</code>. 创建时间
     */
    public final TableField<AirbusJobInfoRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.airbus_job_info.gmt_modified</code>. 修改时间
     */
    public final TableField<AirbusJobInfoRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.airbus_job_info.tenant_code</code>. 租户code
     */
    public final TableField<AirbusJobInfoRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "租户code");

    /**
     * The column <code>SMETA_APP.airbus_job_info.event_code</code>. 事件码
     */
    public final TableField<AirbusJobInfoRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "事件码");

    /**
     * The column <code>SMETA_APP.airbus_job_info.uf_rule_release_id</code>. release的规则id
     */
    public final TableField<AirbusJobInfoRecord, ULong> UF_RULE_RELEASE_ID = createField("uf_rule_release_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "release的规则id");

    /**
     * The column <code>SMETA_APP.airbus_job_info.uf_rule_id</code>. 规则ID
     */
    public final TableField<AirbusJobInfoRecord, ULong> UF_RULE_ID = createField("uf_rule_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "规则ID");

    /**
     * The column <code>SMETA_APP.airbus_job_info.schedule_type</code>. 1:周期任务；2:一次任务
     */
    public final TableField<AirbusJobInfoRecord, Short> SCHEDULE_TYPE = createField("schedule_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "1:周期任务；2:一次任务");

    /**
     * The column <code>SMETA_APP.airbus_job_info.node_type</code>. sql 或是 shell
     */
    public final TableField<AirbusJobInfoRecord, String> NODE_TYPE = createField("node_type", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "sql 或是 shell");

    /**
     * The column <code>SMETA_APP.airbus_job_info.engine_type</code>. 1:odps
     */
    public final TableField<AirbusJobInfoRecord, Short> ENGINE_TYPE = createField("engine_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "1:odps");

    /**
     * The column <code>SMETA_APP.airbus_job_info.rule_condition</code>. 执行体
     */
    public final TableField<AirbusJobInfoRecord, String> RULE_CONDITION = createField("rule_condition", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "执行体");

    /**
     * The column <code>SMETA_APP.airbus_job_info.sic_result_table</code>. sic返回的结果表名字
     */
    public final TableField<AirbusJobInfoRecord, String> SIC_RESULT_TABLE = createField("sic_result_table", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "sic返回的结果表名字");

    /**
     * The column <code>SMETA_APP.airbus_job_info.sic_record_id</code>. sic返回的reocrd id
     */
    public final TableField<AirbusJobInfoRecord, ULong> SIC_RECORD_ID = createField("sic_record_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "sic返回的reocrd id");

    /**
     * The column <code>SMETA_APP.airbus_job_info.sic_calc_code</code>. sic返回的calc_code
     */
    public final TableField<AirbusJobInfoRecord, String> SIC_CALC_CODE = createField("sic_calc_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "sic返回的calc_code");

    /**
     * The column <code>SMETA_APP.airbus_job_info.status</code>. job状态 1- 上线 2-下线
     */
    public final TableField<AirbusJobInfoRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "job状态 1- 上线 2-下线");

    /**
     * The column <code>SMETA_APP.airbus_job_info.operator</code>. 操作者
     */
    public final TableField<AirbusJobInfoRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(20), this, "操作者");

    /**
     * The column <code>SMETA_APP.airbus_job_info.uf_rule_set_id</code>. uf rule set id
     */
    public final TableField<AirbusJobInfoRecord, Long> UF_RULE_SET_ID = createField("uf_rule_set_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "uf rule set id");

    /**
     * The column <code>SMETA_APP.airbus_job_info.table_calc_cycle</code>. 时间表计算周期
     */
    public final TableField<AirbusJobInfoRecord, String> TABLE_CALC_CYCLE = createField("table_calc_cycle", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "时间表计算周期");

    /**
     * The column <code>SMETA_APP.airbus_job_info.source_table</code>. source table
     */
    public final TableField<AirbusJobInfoRecord, String> SOURCE_TABLE = createField("source_table", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "source table");

    /**
     * The column <code>SMETA_APP.airbus_job_info.job_submit_status</code>. job提交状态 
0- 未提交
1- 已提交
     */
    public final TableField<AirbusJobInfoRecord, Integer> JOB_SUBMIT_STATUS = createField("job_submit_status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "job提交状态 \n0- 未提交\n1- 已提交");

    /**
     * The column <code>SMETA_APP.airbus_job_info.uf_rule_set_version</code>. ruleset 的version
     */
    public final TableField<AirbusJobInfoRecord, Long> UF_RULE_SET_VERSION = createField("uf_rule_set_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "ruleset 的version");

    /**
     * The column <code>SMETA_APP.airbus_job_info.operator_id</code>. 操作者id
     */
    public final TableField<AirbusJobInfoRecord, Long> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "操作者id");

    /**
     * The column <code>SMETA_APP.airbus_job_info.valid_from_date</code>. job开始生效日期
     */
    public final TableField<AirbusJobInfoRecord, Long> VALID_FROM_DATE = createField("valid_from_date", org.jooq.impl.SQLDataType.BIGINT, this, "job开始生效日期");

    /**
     * The column <code>SMETA_APP.airbus_job_info.valid_to_date</code>. job结束日期
     */
    public final TableField<AirbusJobInfoRecord, Long> VALID_TO_DATE = createField("valid_to_date", org.jooq.impl.SQLDataType.BIGINT, this, "job结束日期");

    /**
     * The column <code>SMETA_APP.airbus_job_info.source_table_partition</code>. 源表分区字段
     */
    public final TableField<AirbusJobInfoRecord, String> SOURCE_TABLE_PARTITION = createField("source_table_partition", org.jooq.impl.SQLDataType.VARCHAR(64), this, "源表分区字段");

    /**
     * The column <code>SMETA_APP.airbus_job_info.source_table_columns</code>. 源表列，用于一次性事件
     */
    public final TableField<AirbusJobInfoRecord, String> SOURCE_TABLE_COLUMNS = createField("source_table_columns", org.jooq.impl.SQLDataType.CLOB, this, "源表列，用于一次性事件");

    /**
     * The column <code>SMETA_APP.airbus_job_info.uf_rule_content</code>. 保存对应的规则内容
     */
    public final TableField<AirbusJobInfoRecord, String> UF_RULE_CONTENT = createField("uf_rule_content", org.jooq.impl.SQLDataType.CLOB, this, "保存对应的规则内容");

    /**
     * Create a <code>SMETA_APP.airbus_job_info</code> table reference
     */
    public AirbusJobInfo() {
        this(DSL.name("airbus_job_info"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_job_info</code> table reference
     */
    public AirbusJobInfo(String alias) {
        this(DSL.name(alias), AIRBUS_JOB_INFO);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_job_info</code> table reference
     */
    public AirbusJobInfo(Name alias) {
        this(alias, AIRBUS_JOB_INFO);
    }

    private AirbusJobInfo(Name alias, Table<AirbusJobInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private AirbusJobInfo(Name alias, Table<AirbusJobInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "离线引擎调度任务信息");
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
        return Arrays.<Index>asList(Indexes.AIRBUS_JOB_INFO_IDX_SCHEDULE_TYPE, Indexes.AIRBUS_JOB_INFO_IDX_UF_RULE_ID, Indexes.AIRBUS_JOB_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AirbusJobInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_AIRBUS_JOB_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AirbusJobInfoRecord> getPrimaryKey() {
        return Keys.KEY_AIRBUS_JOB_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AirbusJobInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<AirbusJobInfoRecord>>asList(Keys.KEY_AIRBUS_JOB_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusJobInfo as(String alias) {
        return new AirbusJobInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusJobInfo as(Name alias) {
        return new AirbusJobInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusJobInfo rename(String name) {
        return new AirbusJobInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusJobInfo rename(Name name) {
        return new AirbusJobInfo(name, null);
    }
}
