package com.ss.android.lark.calendar.impl.features.events.detail.share.handle;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0010H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/BaseShareHandler;", "", "innerDependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;)V", "getInnerDependency", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "setInnerDependency", "shareImage", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareText", "title", "", "content", "targetUrl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.handle.a */
public class BaseShareHandler {

    /* renamed from: a */
    private InnerShareDependency f79543a;

    public BaseShareHandler() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public void mo113988a(Context context, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
    }

    /* renamed from: a */
    public void mo113989a(Context context, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "targetUrl");
        Intrinsics.checkParameterIsNotNull(str4, "shareText");
    }

    /* renamed from: a */
    public final InnerShareDependency mo113987a() {
        return this.f79543a;
    }

    public BaseShareHandler(InnerShareDependency aVar) {
        this.f79543a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseShareHandler(InnerShareDependency aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
