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
import test.generated.tables.records.IndiTagRelationRecord;


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
public class IndiTagRelation extends TableImpl<IndiTagRelationRecord> {

    private static final long serialVersionUID = 1476959474;

    /**
     * The reference instance of <code>SMETA_APP.indi_tag_relation</code>
     */
    public static final IndiTagRelation INDI_TAG_RELATION = new IndiTagRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndiTagRelationRecord> getRecordType() {
        return IndiTagRelationRecord.class;
    }

    /**
     * The column <code>SMETA_APP.indi_tag_relation.id</code>. 主键
     */
    public final TableField<IndiTagRelationRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.indi_tag_relation.gmt_create</code>. 创建时间
     */
    public final TableField<IndiTagRelationRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.indi_tag_relation.gmt_modified</code>. 修改时间
     */
    public final TableField<IndiTagRelationRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.indi_tag_relation.tag_parent</code>. 父标签
     */
    public final TableField<IndiTagRelationRecord, String> TAG_PARENT = createField("tag_parent", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "父标签");

    /**
     * The column <code>SMETA_APP.indi_tag_relation.tag_child</code>. 子标签
     */
    public final TableField<IndiTagRelationRecord, String> TAG_CHILD = createField("tag_child", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "子标签");

    /**
     * Create a <code>SMETA_APP.indi_tag_relation</code> table reference
     */
    public IndiTagRelation() {
        this(DSL.name("indi_tag_relation"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.indi_tag_relation</code> table reference
     */
    public IndiTagRelation(String alias) {
        this(DSL.name(alias), INDI_TAG_RELATION);
    }

    /**
     * Create an aliased <code>SMETA_APP.indi_tag_relation</code> table reference
     */
    public IndiTagRelation(Name alias) {
        this(alias, INDI_TAG_RELATION);
    }

    private IndiTagRelation(Name alias, Table<IndiTagRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndiTagRelation(Name alias, Table<IndiTagRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "标签父子关系表");
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
        return Arrays.<Index>asList(Indexes.INDI_TAG_RELATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IndiTagRelationRecord, ULong> getIdentity() {
        return Keys.IDENTITY_INDI_TAG_RELATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndiTagRelationRecord> getPrimaryKey() {
        return Keys.KEY_INDI_TAG_RELATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndiTagRelationRecord>> getKeys() {
        return Arrays.<UniqueKey<IndiTagRelationRecord>>asList(Keys.KEY_INDI_TAG_RELATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelation as(String alias) {
        return new IndiTagRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiTagRelation as(Name alias) {
        return new IndiTagRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndiTagRelation rename(String name) {
        return new IndiTagRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndiTagRelation rename(Name name) {
        return new IndiTagRelation(name, null);
    }
}