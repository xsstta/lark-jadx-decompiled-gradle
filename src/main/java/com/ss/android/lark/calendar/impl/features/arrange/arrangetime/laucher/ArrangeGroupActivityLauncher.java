package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeActivity;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/ArrangeGroupActivityLauncher;", "", "activity", "Landroid/app/Activity;", "chatId", "", "isFromP2P", "", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "mActivity", "mChatId", "mIsFromP2P", "gotoArrangeTimeActivity", "", "startArrangeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.a */
public final class ArrangeGroupActivityLauncher {

    /* renamed from: a */
    private final Activity f75445a;

    /* renamed from: b */
    private final String f75446b;

    /* renamed from: c */
    private final boolean f75447c;

    /* renamed from: a */
    public final void mo108972a() {
        if (!TextUtils.isEmpty(this.f75446b)) {
            m112094b();
        }
    }

    /* renamed from: b */
    private final void m112094b() {
        Bundle bundle = new Bundle();
        bundle.putInt("calendar_arrange_source", 2);
        bundle.putLong("event_start_time", new CalendarDate().getTimeInMilliSeconds() / ((long) 1000));
        bundle.putString("chat_id", this.f75446b);
        bundle.putBoolean("arrange_is_from_p2p", this.f75447c);
        C30022a.f74882a.appRouter().mo108210a(ArrangeActivity.class).mo108151a(bundle).mo108156b(this.f75445a);
    }

    public ArrangeGroupActivityLauncher(Activity activity, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f75445a = activity;
        this.f75446b = str;
        this.f75447c = z;
    }
}
