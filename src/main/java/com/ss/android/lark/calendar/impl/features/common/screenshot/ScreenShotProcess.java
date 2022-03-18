package com.ss.android.lark.calendar.impl.features.common.screenshot;

import android.app.Activity;
import com.ss.android.lark.calendar.impl.features.common.p1498d.C31129b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/screenshot/ScreenShotProcess;", "", "activity", "Landroid/app/Activity;", "takeScreenshotObserver", "Lcom/ss/android/lark/calendar/impl/features/common/screenshot/CaptureScreenHelper$ITakeScreenshotObserver;", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/features/common/screenshot/CaptureScreenHelper$ITakeScreenshotObserver;)V", "TAG", "", "getActivity", "()Landroid/app/Activity;", "mCaptureScreenHelper", "Lcom/ss/android/lark/calendar/impl/features/common/screenshot/CaptureScreenHelper;", "registerOnUserCaptureScreen", "", "registerScreenShot", "unRegisterScreenshot", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.d.c */
public final class ScreenShotProcess {

    /* renamed from: a */
    private final String f78630a = "DetailScreenShotPresenter";

    /* renamed from: b */
    private C31129b f78631b;

    /* renamed from: c */
    private final Activity f78632c;

    /* renamed from: d */
    private final C31129b.AbstractC31130a f78633d;

    /* renamed from: c */
    private final void m116203c() {
        try {
            C31129b bVar = new C31129b(this.f78633d, this.f78632c);
            this.f78631b = bVar;
            if (bVar != null) {
                bVar.mo112735a();
            }
        } catch (Exception unused) {
            Log.m165389i(this.f78630a, "registerTakeScreenshotObserver error");
        }
    }

    /* renamed from: a */
    public final void mo112738a() {
        if (new C51331a(this.f78632c).mo176921a("android.permission.READ_EXTERNAL_STORAGE")) {
            m116203c();
        }
    }

    /* renamed from: b */
    public final void mo112739b() {
        C31129b bVar = this.f78631b;
        if (bVar != null) {
            if (bVar != null) {
                try {
                    bVar.mo112736b();
                } catch (Exception unused) {
                    Log.m165389i(this.f78630a, "unRegisterScreenshot error");
                }
            }
            this.f78631b = null;
        }
    }

    public ScreenShotProcess(Activity activity, C31129b.AbstractC31130a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "takeScreenshotObserver");
        this.f78632c = activity;
        this.f78633d = aVar;
    }
}
