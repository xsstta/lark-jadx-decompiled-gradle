package com.ss.android.lark.tab.service.entity;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "", "chatId", "", "tabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "(JLjava/util/List;J)V", "getChatId", "()J", "getTabs", "()Ljava/util/List;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.service.entity.a */
public final class ChatTabsListResult {

    /* renamed from: a */
    private final long f136434a;

    /* renamed from: b */
    private final List<ChatTab> f136435b;

    /* renamed from: c */
    private final long f136436c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatTabsListResult)) {
            return false;
        }
        ChatTabsListResult aVar = (ChatTabsListResult) obj;
        return this.f136434a == aVar.f136434a && Intrinsics.areEqual(this.f136435b, aVar.f136435b) && this.f136436c == aVar.f136436c;
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f136434a) * 31;
        List<ChatTab> list = this.f136435b;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f136436c);
    }

    public String toString() {
        return "ChatTabsListResult(chatId=" + this.f136434a + ", tabs=" + this.f136435b + ", version=" + this.f136436c + ")";
    }

    /* renamed from: a */
    public final List<ChatTab> mo188425a() {
        return this.f136435b;
    }

    /* renamed from: b */
    public final long mo188426b() {
        return this.f136436c;
    }

    public ChatTabsListResult(long j, List<ChatTab> list, long j2) {
        Intrinsics.checkParameterIsNotNull(list, "tabs");
        this.f136434a = j;
        this.f136435b = list;
        this.f136436c = j2;
    }
}
