package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/ViewInfos;", "", "view", "Landroid/view/View;", "title", "", "(Landroid/view/View;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.i */
public final class ViewInfos {

    /* renamed from: a */
    private View f76675a;

    /* renamed from: b */
    private String f76676b;

    /* renamed from: a */
    public final View mo110523a() {
        return this.f76675a;
    }

    /* renamed from: b */
    public final String mo110524b() {
        return this.f76676b;
    }

    public ViewInfos(View view, String str) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f76675a = view;
        this.f76676b = str;
    }
}
