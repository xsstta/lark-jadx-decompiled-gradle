package com.bytedance.ee.bear.block.jira;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bR$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraActionData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "actions", "", "Lcom/bytedance/ee/bear/block/jira/JiraActionData$ActionSheetItem;", "getActions", "()[Lcom/bytedance/ee/bear/block/jira/JiraActionData$ActionSheetItem;", "setActions", "([Lcom/bytedance/ee/bear/block/jira/JiraActionData$ActionSheetItem;)V", "[Lcom/bytedance/ee/bear/block/jira/JiraActionData$ActionSheetItem;", "blockId", "", "getBlockId", "()Ljava/lang/String;", "setBlockId", "(Ljava/lang/String;)V", "desc", "getDesc", "setDesc", "id", "getId", "setId", "title", "getTitle", "setTitle", "isEmpty", "", "ActionSheetItem", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class JiraActionData implements NonProguard {
    private ActionSheetItem[] actions;
    private String blockId;
    private String desc;
    private String id;
    private String title;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraActionData$ActionSheetItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "text", "getText", "setText", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ActionSheetItem implements NonProguard {
        private String id;
        private String text;

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    public final ActionSheetItem[] getActions() {
        return this.actions;
    }

    public final String getBlockId() {
        return this.blockId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isEmpty() {
        if (this.blockId == null && this.id == null && this.actions == null) {
            return true;
        }
        return false;
    }

    public final void setActions(ActionSheetItem[] actionSheetItemArr) {
        this.actions = actionSheetItemArr;
    }

    public final void setBlockId(String str) {
        this.blockId = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
