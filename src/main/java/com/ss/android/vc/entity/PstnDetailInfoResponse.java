package com.ss.android.vc.entity;

import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/vc/entity/PstnDetailInfoResponse;", "", "isPstnEnabled", "", "pstnCopyMessage", "", "defaultPhoneNumber", "adminSettings", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "h323Setting", "Lcom/ss/android/vc/entity/VideoChatH323Setting;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;Lcom/ss/android/vc/entity/VideoChatH323Setting;)V", "getAdminSettings", "()Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "getDefaultPhoneNumber", "()Ljava/lang/String;", "getH323Setting", "()Lcom/ss/android/vc/entity/VideoChatH323Setting;", "()Z", "getPstnCopyMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.h */
public final class PstnDetailInfoResponse {

    /* renamed from: a */
    private final boolean f152496a;

    /* renamed from: b */
    private final String f152497b;

    /* renamed from: c */
    private final String f152498c;

    /* renamed from: d */
    private final GetAdminSettingsResponse f152499d;

    /* renamed from: e */
    private final VideoChatH323Setting f152500e;

    public PstnDetailInfoResponse() {
        this(false, null, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PstnDetailInfoResponse)) {
            return false;
        }
        PstnDetailInfoResponse hVar = (PstnDetailInfoResponse) obj;
        return this.f152496a == hVar.f152496a && Intrinsics.areEqual(this.f152497b, hVar.f152497b) && Intrinsics.areEqual(this.f152498c, hVar.f152498c) && Intrinsics.areEqual(this.f152499d, hVar.f152499d) && Intrinsics.areEqual(this.f152500e, hVar.f152500e);
    }

    public int hashCode() {
        boolean z = this.f152496a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f152497b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f152498c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        GetAdminSettingsResponse getAdminSettingsResponse = this.f152499d;
        int hashCode3 = (hashCode2 + (getAdminSettingsResponse != null ? getAdminSettingsResponse.hashCode() : 0)) * 31;
        VideoChatH323Setting videoChatH323Setting = this.f152500e;
        if (videoChatH323Setting != null) {
            i5 = videoChatH323Setting.hashCode();
        }
        return hashCode3 + i5;
    }

    public String toString() {
        return "PstnDetailInfoResponse(isPstnEnabled=" + this.f152496a + ", pstnCopyMessage=" + this.f152497b + ", defaultPhoneNumber=" + this.f152498c + ", adminSettings=" + this.f152499d + ", h323Setting=" + this.f152500e + ")";
    }

    /* renamed from: a */
    public final boolean mo209904a() {
        return this.f152496a;
    }

    /* renamed from: b */
    public final String mo209905b() {
        return this.f152497b;
    }

    /* renamed from: c */
    public final String mo209906c() {
        return this.f152498c;
    }

    /* renamed from: d */
    public final GetAdminSettingsResponse mo209907d() {
        return this.f152499d;
    }

    public PstnDetailInfoResponse(boolean z, String str, String str2, GetAdminSettingsResponse getAdminSettingsResponse, VideoChatH323Setting videoChatH323Setting) {
        this.f152496a = z;
        this.f152497b = str;
        this.f152498c = str2;
        this.f152499d = getAdminSettingsResponse;
        this.f152500e = videoChatH323Setting;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PstnDetailInfoResponse(boolean z, String str, String str2, GetAdminSettingsResponse getAdminSettingsResponse, VideoChatH323Setting videoChatH323Setting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : getAdminSettingsResponse, (i & 16) != 0 ? null : videoChatH323Setting);
    }
}
