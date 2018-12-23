/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.UfFlow;


/**
 * 流程定义表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfFlowRecord extends UpdatableRecordImpl<UfFlowRecord> implements Record9<ULong, Timestamp, Timestamp, ULong, ULong, String, String, String, String> {

    private static final long serialVersionUID = 1235257752;

    /**
     * Setter for <code>SMETA_APP.uf_flow.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.creator</code>. 工作流创建人
     */
    public void setCreator(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.creator</code>. 工作流创建人
     */
    public ULong getCreator() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.last_operator</code>. 最后修改人
     */
    public void setLastOperator(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.last_operator</code>. 最后修改人
     */
    public ULong getLastOperator() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.code</code>. 工作流编码
     */
    public void setCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.code</code>. 工作流编码
     */
    public String getCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.title</code>. 工作流标题
     */
    public void setTitle(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.title</code>. 工作流标题
     */
    public String getTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.comment</code>. 描述
     */
    public void setComment(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.comment</code>. 描述
     */
    public String getComment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow.type</code>. tenant;opBackstage
     */
    public void setType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow.type</code>. tenant;opBackstage
     */
    public String getType() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, Timestamp, Timestamp, ULong, ULong, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, Timestamp, Timestamp, ULong, ULong, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfFlow.UF_FLOW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfFlow.UF_FLOW.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfFlow.UF_FLOW.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return UfFlow.UF_FLOW.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return UfFlow.UF_FLOW.LAST_OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfFlow.UF_FLOW.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfFlow.UF_FLOW.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfFlow.UF_FLOW.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UfFlow.UF_FLOW.TYPE;
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
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getLastOperator();
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getType();
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
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getLastOperator();
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value4(ULong value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value5(ULong value) {
        setLastOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value6(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value7(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value8(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord value9(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowRecord values(ULong value1, Timestamp value2, Timestamp value3, ULong value4, ULong value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfFlowRecord
     */
    public UfFlowRecord() {
        super(UfFlow.UF_FLOW);
    }

    /**
     * Create a detached, initialised UfFlowRecord
     */
    public UfFlowRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, ULong creator, ULong lastOperator, String code, String title, String comment, String type) {
        super(UfFlow.UF_FLOW);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, creator);
        set(4, lastOperator);
        set(5, code);
        set(6, title);
        set(7, comment);
        set(8, type);
    }
}
