package com.ss.android.vc.meeting.utils;

import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/meeting/utils/VideoSortInfo;", "", "uid", "", "isCameraOn", "", "rtcAudioVolumeInfo", "Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;", "(Ljava/lang/String;ZLcom/ss/android/vc/irtc/RtcAudioVolumeInfo;)V", "()Z", "getRtcAudioVolumeInfo", "()Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;", "getUid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.p */
public final class VideoSortInfo {

    /* renamed from: a */
    private final String f160488a;

    /* renamed from: b */
    private final boolean f160489b;

    /* renamed from: c */
    private final RtcAudioVolumeInfo f160490c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSortInfo)) {
            return false;
        }
        VideoSortInfo pVar = (VideoSortInfo) obj;
        return Intrinsics.areEqual(this.f160488a, pVar.f160488a) && this.f160489b == pVar.f160489b && Intrinsics.areEqual(this.f160490c, pVar.f160490c);
    }

    public int hashCode() {
        String str = this.f160488a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f160489b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        RtcAudioVolumeInfo rtcAudioVolumeInfo = this.f160490c;
        if (rtcAudioVolumeInfo != null) {
            i = rtcAudioVolumeInfo.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "VideoSortInfo(uid=" + this.f160488a + ", isCameraOn=" + this.f160489b + ", rtcAudioVolumeInfo=" + this.f160490c + ")";
    }

    /* renamed from: a */
    public final String mo219680a() {
        return this.f160488a;
    }

    /* renamed from: b */
    public final RtcAudioVolumeInfo mo219681b() {
        return this.f160490c;
    }

    public VideoSortInfo(String str, boolean z, RtcAudioVolumeInfo rtcAudioVolumeInfo) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(rtcAudioVolumeInfo, "rtcAudioVolumeInfo");
        this.f160488a = str;
        this.f160489b = z;
        this.f160490c = rtcAudioVolumeInfo;
    }
}
