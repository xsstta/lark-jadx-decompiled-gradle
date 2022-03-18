package com.ss.android.lark.calendar.impl.features.events.detail.share.handle;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/CreateImageShareHandler;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/BaseShareHandler;", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;)V", "shareText", "", "context", "Landroid/content/Context;", "title", "", "content", "targetUrl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.handle.c */
public final class CreateImageShareHandler extends BaseShareHandler {
    public CreateImageShareHandler() {
        this(null, 1, null);
    }

    public CreateImageShareHandler(InnerShareDependency aVar) {
        super(aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateImageShareHandler(InnerShareDependency aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler
    /* renamed from: a */
    public void mo113989a(Context context, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "targetUrl");
        Intrinsics.checkParameterIsNotNull(str4, "shareText");
        InnerShareDependency a = mo113987a();
        if (a != null) {
            a.mo113880f();
        }
    }
}
