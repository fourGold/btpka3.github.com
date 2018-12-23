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
import test.generated.tables.records.RayUserInfoRecord;


/**
 * 用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RayUserInfo extends TableImpl<RayUserInfoRecord> {

    private static final long serialVersionUID = -223260211;

    /**
     * The reference instance of <code>SMETA_APP.ray_user_info</code>
     */
    public static final RayUserInfo RAY_USER_INFO = new RayUserInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RayUserInfoRecord> getRecordType() {
        return RayUserInfoRecord.class;
    }

    /**
     * The column <code>SMETA_APP.ray_user_info.id</code>. 主键
     */
    public final TableField<RayUserInfoRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.ray_user_info.gmt_create</code>. 创建时间
     */
    public final TableField<RayUserInfoRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.ray_user_info.gmt_modified</code>. 修改时间
     */
    public final TableField<RayUserInfoRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.ray_user_info.biz_id</code>. 用户工号
     */
    public final TableField<RayUserInfoRecord, String> BIZ_ID = createField("biz_id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "用户工号");

    /**
     * The column <code>SMETA_APP.ray_user_info.odps_account</code>. odps云账号
     */
    public final TableField<RayUserInfoRecord, String> ODPS_ACCOUNT = createField("odps_account", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "odps云账号");

    /**
     * The column <code>SMETA_APP.ray_user_info.account_info</code>. 加密的云梯账号密码
     */
    public final TableField<RayUserInfoRecord, String> ACCOUNT_INFO = createField("account_info", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "加密的云梯账号密码");

    /**
     * The column <code>SMETA_APP.ray_user_info.odps_project</code>. odps默认的project
     */
    public final TableField<RayUserInfoRecord, String> ODPS_PROJECT = createField("odps_project", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "odps默认的project");

    /**
     * The column <code>SMETA_APP.ray_user_info.odps_project_name</code>. odps默认的project名
     */
    public final TableField<RayUserInfoRecord, String> ODPS_PROJECT_NAME = createField("odps_project_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "odps默认的project名");

    /**
     * The column <code>SMETA_APP.ray_user_info.nick_name</code>. 用户花名
     */
    public final TableField<RayUserInfoRecord, String> NICK_NAME = createField("nick_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "用户花名");

    /**
     * Create a <code>SMETA_APP.ray_user_info</code> table reference
     */
    public RayUserInfo() {
        this(DSL.name("ray_user_info"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.ray_user_info</code> table reference
     */
    public RayUserInfo(String alias) {
        this(DSL.name(alias), RAY_USER_INFO);
    }

    /**
     * Create an aliased <code>SMETA_APP.ray_user_info</code> table reference
     */
    public RayUserInfo(Name alias) {
        this(alias, RAY_USER_INFO);
    }

    private RayUserInfo(Name alias, Table<RayUserInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private RayUserInfo(Name alias, Table<RayUserInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户信息表");
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
        return Arrays.<Index>asList(Indexes.RAY_USER_INFO_PRIMARY, Indexes.RAY_USER_INFO_UK_BIZID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RayUserInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_RAY_USER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RayUserInfoRecord> getPrimaryKey() {
        return Keys.KEY_RAY_USER_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RayUserInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<RayUserInfoRecord>>asList(Keys.KEY_RAY_USER_INFO_PRIMARY, Keys.KEY_RAY_USER_INFO_UK_BIZID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RayUserInfo as(String alias) {
        return new RayUserInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RayUserInfo as(Name alias) {
        return new RayUserInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RayUserInfo rename(String name) {
        return new RayUserInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RayUserInfo rename(Name name) {
        return new RayUserInfo(name, null);
    }
}
