package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.VideoChatH323Setting;
import com.ss.android.vc.entity.VideoChatSIPSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/entity/tab/AccessInfos;", "", "pstnIncomingSetting", "Lcom/ss/android/vc/entity/tab/PSTNIncomingSetting;", "sipSetting", "Lcom/ss/android/vc/entity/VideoChatSIPSetting;", "h323Setting", "Lcom/ss/android/vc/entity/VideoChatH323Setting;", "(Lcom/ss/android/vc/entity/tab/PSTNIncomingSetting;Lcom/ss/android/vc/entity/VideoChatSIPSetting;Lcom/ss/android/vc/entity/VideoChatH323Setting;)V", "getH323Setting", "()Lcom/ss/android/vc/entity/VideoChatH323Setting;", "getPstnIncomingSetting", "()Lcom/ss/android/vc/entity/tab/PSTNIncomingSetting;", "getSipSetting", "()Lcom/ss/android/vc/entity/VideoChatSIPSetting;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.a */
public final class AccessInfos {

    /* renamed from: a */
    private final PSTNIncomingSetting f152802a;

    /* renamed from: b */
    private final VideoChatSIPSetting f152803b;

    /* renamed from: c */
    private final VideoChatH323Setting f152804c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessInfos)) {
            return false;
        }
        AccessInfos aVar = (AccessInfos) obj;
        return Intrinsics.areEqual(this.f152802a, aVar.f152802a) && Intrinsics.areEqual(this.f152803b, aVar.f152803b) && Intrinsics.areEqual(this.f152804c, aVar.f152804c);
    }

    public int hashCode() {
        PSTNIncomingSetting bVar = this.f152802a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        VideoChatSIPSetting videoChatSIPSetting = this.f152803b;
        int hashCode2 = (hashCode + (videoChatSIPSetting != null ? videoChatSIPSetting.hashCode() : 0)) * 31;
        VideoChatH323Setting videoChatH323Setting = this.f152804c;
        if (videoChatH323Setting != null) {
            i = videoChatH323Setting.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AccessInfos(pstnIncomingSetting=" + this.f152802a + ", sipSetting=" + this.f152803b + ", h323Setting=" + this.f152804c + ")";
    }

    /* renamed from: a */
    public final PSTNIncomingSetting mo210403a() {
        return this.f152802a;
    }

    /* renamed from: b */
    public final VideoChatSIPSetting mo210404b() {
        return this.f152803b;
    }

    /* renamed from: c */
    public final VideoChatH323Setting mo210405c() {
        return this.f152804c;
    }

    public AccessInfos(PSTNIncomingSetting bVar, VideoChatSIPSetting videoChatSIPSetting, VideoChatH323Setting videoChatH323Setting) {
        this.f152802a = bVar;
        this.f152803b = videoChatSIPSetting;
        this.f152804c = videoChatH323Setting;
    }
}
