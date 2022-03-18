package com.ss.android.lark.search.redesign.filter.typeselect;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectData;", "", "id", "", "(I)V", "getId", "()I", "isSelected", "", "()Z", "setSelected", "(Z)V", "wording", "", "getWording", "()Ljava/lang/String;", "setWording", "(Ljava/lang/String;)V", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.filter.typeselect.b */
public final class TypeSelectData {

    /* renamed from: a */
    private String f132730a = "";

    /* renamed from: b */
    private boolean f132731b;

    /* renamed from: c */
    private final int f132732c;

    /* renamed from: a */
    public final String mo183393a() {
        return this.f132730a;
    }

    /* renamed from: b */
    public final boolean mo183396b() {
        return this.f132731b;
    }

    /* renamed from: c */
    public final int mo183397c() {
        return this.f132732c;
    }

    /* renamed from: a */
    public final void mo183394a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f132730a = str;
    }

    public TypeSelectData(int i) {
        this.f132732c = i;
    }

    /* renamed from: a */
    public final void mo183395a(boolean z) {
        this.f132731b = z;
    }
}
