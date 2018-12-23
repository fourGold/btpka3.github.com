/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.UfApplicationAsset;


/**
 * 应用接入配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfApplicationAssetRecord extends UpdatableRecordImpl<UfApplicationAssetRecord> implements Record10<ULong, Timestamp, Timestamp, String, String, String, String, ULong, ULong, Byte> {

    private static final long serialVersionUID = -1472180341;

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.app_code</code>. app的唯一标识符
     */
    public void setAppCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.app_code</code>. app的唯一标识符
     */
    public String getAppCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.url</code>. css,js,domian的值
     */
    public void setUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.url</code>. css,js,domian的值
     */
    public String getUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.type</code>. css,js,domain
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.type</code>. css,js,domain
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.env</code>. daily,pre,online
     */
    public void setEnv(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.env</code>. daily,pre,online
     */
    public String getEnv() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.last_operator</code>. 最后修改者
     */
    public void setLastOperator(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.last_operator</code>. 最后修改者
     */
    public ULong getLastOperator() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.creator</code>. 创建者
     */
    public void setCreator(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.creator</code>. 创建者
     */
    public ULong getCreator() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_application_asset.dynamic</code>. 是否动态加载
     */
    public void setDynamic(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_application_asset.dynamic</code>. 是否动态加载
     */
    public Byte getDynamic() {
        return (Byte) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, Timestamp, String, String, String, String, ULong, ULong, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, Timestamp, String, String, String, String, ULong, ULong, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.APP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.ENV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.LAST_OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return UfApplicationAsset.UF_APPLICATION_ASSET.DYNAMIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAppCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getEnv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getDynamic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAppCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEnv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getDynamic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value4(String value) {
        setAppCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value5(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value6(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value7(String value) {
        setEnv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value8(ULong value) {
        setLastOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value9(ULong value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord value10(Byte value) {
        setDynamic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfApplicationAssetRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, ULong value8, ULong value9, Byte value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfApplicationAssetRecord
     */
    public UfApplicationAssetRecord() {
        super(UfApplicationAsset.UF_APPLICATION_ASSET);
    }

    /**
     * Create a detached, initialised UfApplicationAssetRecord
     */
    public UfApplicationAssetRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String appCode, String url, String type, String env, ULong lastOperator, ULong creator, Byte dynamic) {
        super(UfApplicationAsset.UF_APPLICATION_ASSET);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, appCode);
        set(4, url);
        set(5, type);
        set(6, env);
        set(7, lastOperator);
        set(8, creator);
        set(9, dynamic);
    }
}
