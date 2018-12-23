/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.IndicatorTag;


/**
 * indicator表 和 tag表的多对多的中间表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndicatorTagRecord extends UpdatableRecordImpl<IndicatorTagRecord> implements Record7<ULong, Timestamp, Timestamp, ULong, ULong, String, String> {

    private static final long serialVersionUID = -816655089;

    /**
     * Setter for <code>SMETA_APP.indicator_tag.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.indicator_tag.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.indicator_tag.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.indicator_tag.indicator_id</code>. 指标ID（废弃）
     */
    public void setIndicatorId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.indicator_id</code>. 指标ID（废弃）
     */
    public ULong getIndicatorId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.indicator_tag.tag_id</code>. 标签ID（废弃）
     */
    public void setTagId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.tag_id</code>. 标签ID（废弃）
     */
    public ULong getTagId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.indicator_tag.tag_code</code>. 标签code
     */
    public void setTagCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.tag_code</code>. 标签code
     */
    public String getTagCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.indicator_tag.indicator_code</code>. 指标code
     */
    public void setIndicatorCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.indicator_tag.indicator_code</code>. 指标code
     */
    public String getIndicatorCode() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, Timestamp, Timestamp, ULong, ULong, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, Timestamp, Timestamp, ULong, ULong, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return IndicatorTag.INDICATOR_TAG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return IndicatorTag.INDICATOR_TAG.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return IndicatorTag.INDICATOR_TAG.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return IndicatorTag.INDICATOR_TAG.INDICATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return IndicatorTag.INDICATOR_TAG.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return IndicatorTag.INDICATOR_TAG.TAG_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return IndicatorTag.INDICATOR_TAG.INDICATOR_CODE;
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
    public ULong component4() {
        return getIndicatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTagCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIndicatorCode();
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
    public ULong value4() {
        return getIndicatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTagCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIndicatorCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value4(ULong value) {
        setIndicatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value5(ULong value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value6(String value) {
        setTagCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord value7(String value) {
        setIndicatorCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndicatorTagRecord values(ULong value1, Timestamp value2, Timestamp value3, ULong value4, ULong value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndicatorTagRecord
     */
    public IndicatorTagRecord() {
        super(IndicatorTag.INDICATOR_TAG);
    }

    /**
     * Create a detached, initialised IndicatorTagRecord
     */
    public IndicatorTagRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, ULong indicatorId, ULong tagId, String tagCode, String indicatorCode) {
        super(IndicatorTag.INDICATOR_TAG);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, indicatorId);
        set(4, tagId);
        set(5, tagCode);
        set(6, indicatorCode);
    }
}
