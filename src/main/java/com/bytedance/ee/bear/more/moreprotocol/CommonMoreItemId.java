package com.bytedance.ee.bear.more.moreprotocol;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/CommonMoreItemId;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "RENAME", "SHORT_CUT", "STAR", "PIN", "MANUAL_CACHE", "DELETE", "ADD", "ADD_SHORT_CUT", "PERMISSION", "MAKE_COPY", "CONTACT_SERVICE", "REPORT", "SUBSCRIBE", "APPLY_EDIT_PERMISSION", "COPY_LINK", "MULTI_TASK", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum CommonMoreItemId {
    RENAME("rename"),
    SHORT_CUT("shortcut"),
    STAR("star"),
    PIN("pin"),
    MANUAL_CACHE("manual_cache"),
    DELETE("delete"),
    ADD("add"),
    ADD_SHORT_CUT("add_shortcut"),
    PERMISSION("permission"),
    MAKE_COPY("make_copy"),
    CONTACT_SERVICE("contact_service"),
    REPORT("report"),
    SUBSCRIBE("subscribe"),
    APPLY_EDIT_PERMISSION("apply_edit_permission"),
    COPY_LINK("copy_link"),
    MULTI_TASK("multi_task");
    
    private final String id;

    public final String getId() {
        return this.id;
    }

    private CommonMoreItemId(String str) {
        this.id = str;
    }
}
