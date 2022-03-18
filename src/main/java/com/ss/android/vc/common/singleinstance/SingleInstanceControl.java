package com.ss.android.vc.common.singleinstance;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.net.service.SingleInstanceSettingsService;
import com.ss.android.vc.service.C63634c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/common/singleinstance/SingleInstanceControl;", "Lcom/ss/android/vc/common/singleinstance/AbsSingleInstanceControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "meetingActivityRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity;", "singleInstanceFg", "", "getMeetingActivity", "isMeetingPageActive", "setMeetingActivity", "", "activity", "singleInstanceOpen", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.c.b */
public final class SingleInstanceControl extends AbsSingleInstanceControl {

    /* renamed from: a */
    private final String f151861a = "SingleInstanceControl";

    /* renamed from: b */
    private WeakReference<ByteRTCMeetingActivity> f151862b;

    /* renamed from: c */
    private boolean f151863c = C63634c.m249496b("byteview.meeting.android.single_instance");

    /* renamed from: d */
    private final C61303k f151864d;

    @Override // com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl
    /* renamed from: a */
    public ByteRTCMeetingActivity mo208290a() {
        WeakReference<ByteRTCMeetingActivity> weakReference = this.f151862b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl
    /* renamed from: c */
    public boolean mo208293c() {
        if (!SingleInstanceSettingsService.INSTANCE.getSettingsOpen() || !this.f151863c) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl
    /* renamed from: b */
    public boolean mo208292b() {
        WeakReference<ByteRTCMeetingActivity> weakReference = this.f151862b;
        if (weakReference == null) {
            return false;
        }
        ByteRTCMeetingActivity byteRTCMeetingActivity = weakReference.get();
        if (byteRTCMeetingActivity != null) {
            return byteRTCMeetingActivity.mo215863x();
        }
        return false;
    }

    @Override // com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl
    /* renamed from: a */
    public void mo208291a(ByteRTCMeetingActivity byteRTCMeetingActivity) {
        Intrinsics.checkParameterIsNotNull(byteRTCMeetingActivity, "activity");
        this.f151862b = new WeakReference<>(byteRTCMeetingActivity);
    }

    public SingleInstanceControl(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f151864d = kVar;
        C60700b.m235851b("SingleInstanceControl", "[getSingleInstanceFg]", "singleInstanceFg: " + this.f151863c);
    }
}
