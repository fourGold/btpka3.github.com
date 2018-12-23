/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.IndiTagRelation;


/**
 * 标签父子关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndiTagRelationRecord extends UpdatableRecordImpl<IndiTagRelationRecord> implements Record5<ULong, Timestamp, Timestamp, String, String> {

    private static final long serialVersionUID = -639473001;

    /**
     * Setter for <code>SMETA_APP.indi_tag_relation.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag_relation.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag_relation.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag_relation.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag_relation.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag_relation.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag_relation.tag_parent</code>. 父标签
     */
    public void setTagParent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag_relation.tag_parent</code>. 父标签
     */
    public String getTagParent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag_relation.tag_child</code>. 子标签
     */
    public void setTagChild(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag_relation.tag_child</code>. 子标签
     */
    public String getTagChild() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, Timestamp, Timestamp, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, Timestamp, Timestamp, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return IndiTagRelation.INDI_TAG_RELATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return IndiTagRelation.INDI_TAG_RELATION.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return IndiTagRelation.INDI_TAG_RELATION.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return IndiTagRelation.INDI_TAG_RELATION.TAG_PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IndiTagRelation.INDI_TAG_RELATION.TAG_CHILD;
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
        return getTagParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTagChild();
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
        return getTagParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTagChild();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelationRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelationRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelationRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelationRecord value4(String value) {
        setTagParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelationRecord value5(String value) {
        setTagChild(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelationRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndiTagRelationRecord
     */
    public IndiTagRelationRecord() {
        super(IndiTagRelation.INDI_TAG_RELATION);
    }

    /**
     * Create a detached, initialised IndiTagRelationRecord
     */
    public IndiTagRelationRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String tagParent, String tagChild) {
        super(IndiTagRelation.INDI_TAG_RELATION);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, tagParent);
        set(4, tagChild);
    }
}
