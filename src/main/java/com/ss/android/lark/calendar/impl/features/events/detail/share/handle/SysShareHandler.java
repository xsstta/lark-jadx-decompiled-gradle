package com.ss.android.lark.calendar.impl.features.events.detail.share.handle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.ThirdShareUtils;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.thirdshare.base.C55680a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J0\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/SysShareHandler;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/BaseShareHandler;", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;)V", "shareImage", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareText", "title", "", "content", "targetUrl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.handle.g */
public final class SysShareHandler extends BaseShareHandler {
    public SysShareHandler() {
        this(null, 1, null);
    }

    public SysShareHandler(InnerShareDependency aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler
    /* renamed from: a */
    public void mo113988a(Context context, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        ThirdShareUtils.f79505a.mo113955a(context, bitmap, ShareType.SYS);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SysShareHandler(InnerShareDependency aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler
    /* renamed from: a */
    public void mo113989a(Context context, String str, String str2, String str3, String str4) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(str3, "targetUrl");
        Intrinsics.checkParameterIsNotNull(str4, "shareText");
        if (str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            UDToast.Builder aVar = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_SubscribeCalendar_OperationFailed).mo91655j().show();
            return;
        }
        C55680a.m215713a(str4);
    }
}
