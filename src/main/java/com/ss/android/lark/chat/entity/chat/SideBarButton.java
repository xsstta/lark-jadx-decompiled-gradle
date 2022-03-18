package com.ss.android.lark.chat.entity.chat;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/SideBarButton;", "Ljava/io/Serializable;", "labelName", "", "iconKey", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconKey", "()Ljava/lang/String;", "getLabelName", "getUrl", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SideBarButton implements Serializable {
    private final String iconKey;
    private final String labelName;
    private final String url;

    public SideBarButton() {
        this(null, null, null, 7, null);
    }

    public final String getIconKey() {
        return this.iconKey;
    }

    public final String getLabelName() {
        return this.labelName;
    }

    public final String getUrl() {
        return this.url;
    }

    public SideBarButton(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "labelName");
        Intrinsics.checkParameterIsNotNull(str2, "iconKey");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        this.labelName = str;
        this.iconKey = str2;
        this.url = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SideBarButton(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
