/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import test.generated.tables.IndiTag;


/**
 * 系统标签定义表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndiTagRecord extends UpdatableRecordImpl<IndiTagRecord> implements Record14<ULong, Timestamp, Timestamp, String, String, String, String, String, UByte, String, String, String, String, Long> {

    private static final long serialVersionUID = -702039341;

    /**
     * Setter for <code>SMETA_APP.indi_tag.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.name</code>. 标签名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.name</code>. 标签名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.description</code>. 标签描述
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.description</code>. 标签描述
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.code</code>. 唯一code
     */
    public void setCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.code</code>. 唯一code
     */
    public String getCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.created_by</code>. 创建者
     */
    public void setCreatedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.created_by</code>. 创建者
     */
    public String getCreatedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.updated_by</code>. 修改者
     */
    public void setUpdatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.updated_by</code>. 修改者
     */
    public String getUpdatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.is_effective</code>. 逻辑删除标记位
     */
    public void setIsEffective(UByte value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.is_effective</code>. 逻辑删除标记位
     */
    public UByte getIsEffective() {
        return (UByte) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.tag_type</code>. 标签分类
     */
    public void setTagType(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.tag_type</code>. 标签分类
     */
    public String getTagType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.self_data</code>. 自定义数据
     */
    public void setSelfData(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.self_data</code>. 自定义数据
     */
    public String getSelfData() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.group_code</code>. 标签分组代码
     */
    public void setGroupCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.group_code</code>. 标签分组代码
     */
    public String getGroupCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.workspace_code</code>. 所属工作空间
     */
    public void setWorkspaceCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.workspace_code</code>. 所属工作空间
     */
    public String getWorkspaceCode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.indi_tag.sort_column</code>. 排序字段，用来为标签排序
     */
    public void setSortColumn(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.indi_tag.sort_column</code>. 排序字段，用来为标签排序
     */
    public Long getSortColumn() {
        return (Long) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, Timestamp, Timestamp, String, String, String, String, String, UByte, String, String, String, String, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, Timestamp, Timestamp, String, String, String, String, String, UByte, String, String, String, String, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return IndiTag.INDI_TAG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return IndiTag.INDI_TAG.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return IndiTag.INDI_TAG.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return IndiTag.INDI_TAG.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IndiTag.INDI_TAG.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return IndiTag.INDI_TAG.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return IndiTag.INDI_TAG.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return IndiTag.INDI_TAG.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field9() {
        return IndiTag.INDI_TAG.IS_EFFECTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return IndiTag.INDI_TAG.TAG_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return IndiTag.INDI_TAG.SELF_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return IndiTag.INDI_TAG.GROUP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return IndiTag.INDI_TAG.WORKSPACE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return IndiTag.INDI_TAG.SORT_COLUMN;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component9() {
        return getIsEffective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTagType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSelfData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getGroupCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getWorkspaceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getSortColumn();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value9() {
        return getIsEffective();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTagType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSelfData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getGroupCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getWorkspaceCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getSortColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value6(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value7(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value8(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value9(UByte value) {
        setIsEffective(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value10(String value) {
        setTagType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value11(String value) {
        setSelfData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value12(String value) {
        setGroupCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value13(String value) {
        setWorkspaceCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord value14(Long value) {
        setSortColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, UByte value9, String value10, String value11, String value12, String value13, Long value14) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndiTagRecord
     */
    public IndiTagRecord() {
        super(IndiTag.INDI_TAG);
    }

    /**
     * Create a detached, initialised IndiTagRecord
     */
    public IndiTagRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String name, String description, String code, String createdBy, String updatedBy, UByte isEffective, String tagType, String selfData, String groupCode, String workspaceCode, Long sortColumn) {
        super(IndiTag.INDI_TAG);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, name);
        set(4, description);
        set(5, code);
        set(6, createdBy);
        set(7, updatedBy);
        set(8, isEffective);
        set(9, tagType);
        set(10, selfData);
        set(11, groupCode);
        set(12, workspaceCode);
        set(13, sortColumn);
    }
}
