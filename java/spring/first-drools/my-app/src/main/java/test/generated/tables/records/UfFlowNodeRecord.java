/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;

import test.generated.tables.UfFlowNode;


/**
 * 流程节点表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfFlowNodeRecord extends UpdatableRecordImpl<UfFlowNodeRecord> implements Record15<ULong, Timestamp, Timestamp, String, UInteger, UInteger, UInteger, String, UInteger, String, String, String, ULong, String, ULong> {

    private static final long serialVersionUID = -64014614;

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.title</code>. 节点名称
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.title</code>. 节点名称
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.type</code>. 节点类型（1 自动节点、2手工节点）
     */
    public void setType(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.type</code>. 节点类型（1 自动节点、2手工节点）
     */
    public UInteger getType() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.node_order</code>. 节点序号
     */
    public void setNodeOrder(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.node_order</code>. 节点序号
     */
    public UInteger getNodeOrder() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.callback_type</code>. 回调类型（1 hsf、2 http）
     */
    public void setCallbackType(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.callback_type</code>. 回调类型（1 hsf、2 http）
     */
    public UInteger getCallbackType() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.callback_json</code>. 回调json
     */
    public void setCallbackJson(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.callback_json</code>. 回调json
     */
    public String getCallbackJson() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.approver_type</code>. 审批人类型（1 groovy，2 指定第N级主管为审批人）
     */
    public void setApproverType(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.approver_type</code>. 审批人类型（1 groovy，2 指定第N级主管为审批人）
     */
    public UInteger getApproverType() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.approver_json</code>. 审批人json
     */
    public void setApproverJson(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.approver_json</code>. 审批人json
     */
    public String getApproverJson() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.flow_code</code>. 流程编码
     */
    public void setFlowCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.flow_code</code>. 流程编码
     */
    public String getFlowCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.tenant_code</code>. 租户编码
     */
    public void setTenantCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.tenant_code</code>. 租户编码
     */
    public String getTenantCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.last_operator</code>. 最近修改人
     */
    public void setLastOperator(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.last_operator</code>. 最近修改人
     */
    public ULong getLastOperator() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.comment</code>. 节点备注
     */
    public void setComment(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.comment</code>. 节点备注
     */
    public String getComment() {
        return (String) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.uf_flow_node.creator</code>. 创建者
     */
    public void setCreator(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_flow_node.creator</code>. 创建者
     */
    public ULong getCreator() {
        return (ULong) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<ULong, Timestamp, Timestamp, String, UInteger, UInteger, UInteger, String, UInteger, String, String, String, ULong, String, ULong> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<ULong, Timestamp, Timestamp, String, UInteger, UInteger, UInteger, String, UInteger, String, String, String, ULong, String, ULong> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfFlowNode.UF_FLOW_NODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfFlowNode.UF_FLOW_NODE.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfFlowNode.UF_FLOW_NODE.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfFlowNode.UF_FLOW_NODE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return UfFlowNode.UF_FLOW_NODE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return UfFlowNode.UF_FLOW_NODE.NODE_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return UfFlowNode.UF_FLOW_NODE.CALLBACK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfFlowNode.UF_FLOW_NODE.CALLBACK_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field9() {
        return UfFlowNode.UF_FLOW_NODE.APPROVER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UfFlowNode.UF_FLOW_NODE.APPROVER_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UfFlowNode.UF_FLOW_NODE.FLOW_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UfFlowNode.UF_FLOW_NODE.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return UfFlowNode.UF_FLOW_NODE.LAST_OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return UfFlowNode.UF_FLOW_NODE.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field15() {
        return UfFlowNode.UF_FLOW_NODE.CREATOR;
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component6() {
        return getNodeOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component7() {
        return getCallbackType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCallbackJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component9() {
        return getApproverType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getApproverJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getFlowCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component13() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component15() {
        return getCreator();
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getNodeOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value7() {
        return getCallbackType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCallbackJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value9() {
        return getApproverType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getApproverJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getFlowCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value15() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value5(UInteger value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value6(UInteger value) {
        setNodeOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value7(UInteger value) {
        setCallbackType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value8(String value) {
        setCallbackJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value9(UInteger value) {
        setApproverType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value10(String value) {
        setApproverJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value11(String value) {
        setFlowCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value12(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value13(ULong value) {
        setLastOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value14(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord value15(ULong value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfFlowNodeRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, UInteger value5, UInteger value6, UInteger value7, String value8, UInteger value9, String value10, String value11, String value12, ULong value13, String value14, ULong value15) {
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
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfFlowNodeRecord
     */
    public UfFlowNodeRecord() {
        super(UfFlowNode.UF_FLOW_NODE);
    }

    /**
     * Create a detached, initialised UfFlowNodeRecord
     */
    public UfFlowNodeRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String title, UInteger type, UInteger nodeOrder, UInteger callbackType, String callbackJson, UInteger approverType, String approverJson, String flowCode, String tenantCode, ULong lastOperator, String comment, ULong creator) {
        super(UfFlowNode.UF_FLOW_NODE);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, title);
        set(4, type);
        set(5, nodeOrder);
        set(6, callbackType);
        set(7, callbackJson);
        set(8, approverType);
        set(9, approverJson);
        set(10, flowCode);
        set(11, tenantCode);
        set(12, lastOperator);
        set(13, comment);
        set(14, creator);
    }
}
