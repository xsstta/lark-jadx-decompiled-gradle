package com.ss.android.lark.todo.impl.features.detail.viewmodel.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit;", "", "stringId", "", "toastType", "string", "", "(IILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "setString", "(Ljava/lang/String;)V", "getStringId", "()I", "setStringId", "(I)V", "getToastType", "setToastType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.a.a */
public final class TodoToastUnit {

    /* renamed from: a */
    public static final Companion f140135a = new Companion(null);

    /* renamed from: b */
    private int f140136b;

    /* renamed from: c */
    private int f140137c;

    /* renamed from: d */
    private String f140138d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoToastUnit)) {
            return false;
        }
        TodoToastUnit aVar = (TodoToastUnit) obj;
        return this.f140136b == aVar.f140136b && this.f140137c == aVar.f140137c && Intrinsics.areEqual(this.f140138d, aVar.f140138d);
    }

    public int hashCode() {
        int i = ((this.f140136b * 31) + this.f140137c) * 31;
        String str = this.f140138d;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TodoToastUnit(stringId=" + this.f140136b + ", toastType=" + this.f140137c + ", string=" + this.f140138d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit$Companion;", "", "()V", "FAIL_TOAST", "", "LOADING_TOAST", "PROMPT_TOAST", "SUCCESS_TOAST", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo192767a() {
        return this.f140136b;
    }

    /* renamed from: b */
    public final int mo192768b() {
        return this.f140137c;
    }

    /* renamed from: c */
    public final String mo192769c() {
        return this.f140138d;
    }

    public TodoToastUnit(int i, int i2, String str) {
        this.f140136b = i;
        this.f140137c = i2;
        this.f140138d = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TodoToastUnit(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str);
    }
}
