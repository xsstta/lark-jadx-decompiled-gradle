package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import android.content.Context;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInEntrance;", "", "()V", "startMeetingRoomSignInActivity", "", "context", "Landroid/content/Context;", "token", "", "url", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.b */
public final class MeetingRoomSignInEntrance {

    /* renamed from: a */
    public static final MeetingRoomSignInEntrance f82199a = new MeetingRoomSignInEntrance();

    private MeetingRoomSignInEntrance() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122430a(Context context, String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C30022a.f74882a.appRouter().mo108210a(MeetingRoomSignInActivity.class).mo108153a("mtroom_token", str).mo108153a("mtroom_url", str2).mo108156b(context);
        }
    }
}
