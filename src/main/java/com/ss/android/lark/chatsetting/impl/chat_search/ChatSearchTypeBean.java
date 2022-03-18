package com.ss.android.lark.chatsetting.impl.chat_search;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_search/ChatSearchTypeBean;", "", ShareHitPoint.f121869d, "", "label", "", "iconRes", "(ILjava/lang/String;I)V", "getIconRes", "()I", "getLabel", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.chat_search.c */
public final class ChatSearchTypeBean {

    /* renamed from: a */
    private final int f89134a;

    /* renamed from: b */
    private final String f89135b;

    /* renamed from: c */
    private final int f89136c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSearchTypeBean)) {
            return false;
        }
        ChatSearchTypeBean cVar = (ChatSearchTypeBean) obj;
        return this.f89134a == cVar.f89134a && Intrinsics.areEqual(this.f89135b, cVar.f89135b) && this.f89136c == cVar.f89136c;
    }

    public int hashCode() {
        int i = this.f89134a * 31;
        String str = this.f89135b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f89136c;
    }

    public String toString() {
        return "ChatSearchTypeBean(type=" + this.f89134a + ", label=" + this.f89135b + ", iconRes=" + this.f89136c + ")";
    }

    /* renamed from: a */
    public final int mo127613a() {
        return this.f89134a;
    }

    /* renamed from: b */
    public final String mo127614b() {
        return this.f89135b;
    }

    /* renamed from: c */
    public final int mo127615c() {
        return this.f89136c;
    }

    public ChatSearchTypeBean(int i, String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "label");
        this.f89134a = i;
        this.f89135b = str;
        this.f89136c = i2;
    }
}
