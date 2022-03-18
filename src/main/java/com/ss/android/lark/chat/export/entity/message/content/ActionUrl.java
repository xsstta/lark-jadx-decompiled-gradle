package com.ss.android.lark.chat.export.entity.message.content;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/content/ActionUrl;", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageItemAction;", "localUrl", "", "commonUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getCommonUrl", "()Ljava/lang/String;", "setCommonUrl", "(Ljava/lang/String;)V", "getLocalUrl", "setLocalUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.entity.message.content.a */
public final class ActionUrl extends SystemMessageItemAction {

    /* renamed from: a */
    private String f87960a;

    /* renamed from: b */
    private String f87961b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionUrl)) {
            return false;
        }
        ActionUrl aVar = (ActionUrl) obj;
        return Intrinsics.areEqual(this.f87960a, aVar.f87960a) && Intrinsics.areEqual(this.f87961b, aVar.f87961b);
    }

    public int hashCode() {
        String str = this.f87960a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87961b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ActionUrl(localUrl=" + this.f87960a + ", commonUrl=" + this.f87961b + ")";
    }

    /* renamed from: a */
    public final String mo126112a() {
        return this.f87960a;
    }

    /* renamed from: b */
    public final String mo126113b() {
        return this.f87961b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionUrl(String str, String str2) {
        super(0);
        Intrinsics.checkParameterIsNotNull(str, "localUrl");
        Intrinsics.checkParameterIsNotNull(str2, "commonUrl");
        this.f87960a = str;
        this.f87961b = str2;
    }
}
