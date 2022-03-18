package com.ss.android.lark.searchcommon.view.avataritem.assigntime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/assigntime/AssignTimeModel;", "", "isVisible", "", "(Z)V", "text", "", "(Ljava/lang/String;)V", "()Z", "setVisible", "getText", "()Ljava/lang/String;", "setText", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.a.b */
public final class AssignTimeModel {

    /* renamed from: a */
    private String f133517a = "";

    /* renamed from: b */
    private boolean f133518b = true;

    /* renamed from: a */
    public final String mo184697a() {
        return this.f133517a;
    }

    /* renamed from: b */
    public final boolean mo184698b() {
        return this.f133518b;
    }

    public AssignTimeModel(boolean z) {
        this.f133518b = z;
    }

    public AssignTimeModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f133517a = str;
    }
}
