package com.bytedance.ee.bear.bitable.card.model.jsmodel.permission;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/PermissionEntity;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "UNDO_REDO", "TABLE", "RECORD", "FIELD", "VIEW", "FILTER", "GROUP", "ROW_HEIGHT", "SORT", "TOOLBAR_FIELD", "TOOLBAR_FIND", "TOOLBAR_ADD_RECORD", "TABLE_MENU", "COMMENT", "CELL", "FORM", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum PermissionEntity {
    UNDO_REDO("UndoRedo"),
    TABLE("Table"),
    RECORD("Record"),
    FIELD("Field"),
    VIEW("View"),
    FILTER("Filter"),
    GROUP("Group"),
    ROW_HEIGHT("RowHeight"),
    SORT("Sort"),
    TOOLBAR_FIELD("ToolbarField"),
    TOOLBAR_FIND("ToolbarFind"),
    TOOLBAR_ADD_RECORD("ToolbarAddRecord"),
    TABLE_MENU("TableMenu"),
    COMMENT("Comment"),
    CELL("Cell"),
    FORM("Form");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }

    private PermissionEntity(String str) {
        this.value = str;
    }
}
