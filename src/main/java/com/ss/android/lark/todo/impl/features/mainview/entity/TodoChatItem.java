package com.ss.android.lark.todo.impl.features.mainview.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoChatItem;", "", "isChatItemShow", "", "chatMsgStr", "", "chatId", "chatIsThread", "position", "", "(ZLjava/lang/String;Ljava/lang/String;ZI)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getChatIsThread", "()Z", "setChatIsThread", "(Z)V", "getChatMsgStr", "setChatMsgStr", "setChatItemShow", "getPosition", "()I", "setPosition", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.a */
public final class TodoChatItem {

    /* renamed from: a */
    private boolean f140329a;

    /* renamed from: b */
    private String f140330b;

    /* renamed from: c */
    private String f140331c;

    /* renamed from: d */
    private boolean f140332d;

    /* renamed from: e */
    private int f140333e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoChatItem)) {
            return false;
        }
        TodoChatItem aVar = (TodoChatItem) obj;
        return this.f140329a == aVar.f140329a && Intrinsics.areEqual(this.f140330b, aVar.f140330b) && Intrinsics.areEqual(this.f140331c, aVar.f140331c) && this.f140332d == aVar.f140332d && this.f140333e == aVar.f140333e;
    }

    public int hashCode() {
        boolean z = this.f140329a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f140330b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f140331c;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        int i7 = (hashCode + i6) * 31;
        boolean z2 = this.f140332d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((i7 + i) * 31) + this.f140333e;
    }

    public String toString() {
        return "TodoChatItem(isChatItemShow=" + this.f140329a + ", chatMsgStr=" + this.f140330b + ", chatId=" + this.f140331c + ", chatIsThread=" + this.f140332d + ", position=" + this.f140333e + ")";
    }

    /* renamed from: a */
    public final boolean mo193198a() {
        return this.f140329a;
    }

    /* renamed from: b */
    public final String mo193199b() {
        return this.f140330b;
    }

    /* renamed from: c */
    public final String mo193200c() {
        return this.f140331c;
    }

    /* renamed from: d */
    public final boolean mo193201d() {
        return this.f140332d;
    }

    /* renamed from: e */
    public final int mo193202e() {
        return this.f140333e;
    }

    public TodoChatItem(boolean z, String str, String str2, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "chatMsgStr");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        this.f140329a = z;
        this.f140330b = str;
        this.f140331c = str2;
        this.f140332d = z2;
        this.f140333e = i;
    }
}
