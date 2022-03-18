package com.ss.android.vc.meeting.model.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/model/data/MeetingTimeData;", "", "duration", "", "formatTime", "", "(JLjava/lang/String;)V", "getDuration", "()J", "setDuration", "(J)V", "getFormatTime", "()Ljava/lang/String;", "setFormatTime", "(Ljava/lang/String;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.model.a.a */
public final class MeetingTimeData {

    /* renamed from: a */
    private long f153797a;

    /* renamed from: b */
    private String f153798b;

    /* renamed from: a */
    public final String mo212432a() {
        return this.f153798b;
    }

    /* renamed from: a */
    public final void mo212433a(long j) {
        this.f153797a = j;
    }

    /* renamed from: a */
    public final void mo212434a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f153798b = str;
    }

    public MeetingTimeData(long j, String str) {
        Intrinsics.checkParameterIsNotNull(str, "formatTime");
        this.f153797a = j;
        this.f153798b = str;
    }
}
