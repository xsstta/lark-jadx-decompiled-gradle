package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003JG\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/ChatFreeBusyFavor;", "", "chatId", "", "orderedFavorChatterIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "selectedFavorChatterIds", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getOrderedFavorChatterIds", "()Ljava/util/ArrayList;", "setOrderedFavorChatterIds", "(Ljava/util/ArrayList;)V", "getSelectedFavorChatterIds", "setSelectedFavorChatterIds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.d */
public final class ChatFreeBusyFavor {

    /* renamed from: a */
    private String f83594a;

    /* renamed from: b */
    private ArrayList<String> f83595b;

    /* renamed from: c */
    private ArrayList<String> f83596c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatFreeBusyFavor)) {
            return false;
        }
        ChatFreeBusyFavor dVar = (ChatFreeBusyFavor) obj;
        return Intrinsics.areEqual(this.f83594a, dVar.f83594a) && Intrinsics.areEqual(this.f83595b, dVar.f83595b) && Intrinsics.areEqual(this.f83596c, dVar.f83596c);
    }

    public int hashCode() {
        String str = this.f83594a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<String> arrayList = this.f83595b;
        int hashCode2 = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<String> arrayList2 = this.f83596c;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ChatFreeBusyFavor(chatId=" + this.f83594a + ", orderedFavorChatterIds=" + this.f83595b + ", selectedFavorChatterIds=" + this.f83596c + ")";
    }

    /* renamed from: a */
    public final String mo120072a() {
        return this.f83594a;
    }

    /* renamed from: b */
    public final ArrayList<String> mo120073b() {
        return this.f83595b;
    }

    /* renamed from: c */
    public final ArrayList<String> mo120074c() {
        return this.f83596c;
    }

    public ChatFreeBusyFavor(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(arrayList, "orderedFavorChatterIds");
        Intrinsics.checkParameterIsNotNull(arrayList2, "selectedFavorChatterIds");
        this.f83594a = str;
        this.f83595b = arrayList;
        this.f83596c = arrayList2;
    }
}
