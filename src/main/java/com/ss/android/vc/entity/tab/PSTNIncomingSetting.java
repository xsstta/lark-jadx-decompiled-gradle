package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.PSTNPhone;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0003J@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/entity/tab/PSTNIncomingSetting;", "", "pstnEnable", "", "pstnIncomingCallCountryDefaultList", "", "", "pstnIncomingCallPhoneList", "Lcom/ss/android/vc/entity/PSTNPhone;", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "getPstnEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPstnIncomingCallCountryDefaultList", "()Ljava/util/List;", "getPstnIncomingCallPhoneList", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/ss/android/vc/entity/tab/PSTNIncomingSetting;", "equals", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.b */
public final class PSTNIncomingSetting {

    /* renamed from: a */
    private final Boolean f152805a;

    /* renamed from: b */
    private final List<String> f152806b;

    /* renamed from: c */
    private final List<PSTNPhone> f152807c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PSTNIncomingSetting)) {
            return false;
        }
        PSTNIncomingSetting bVar = (PSTNIncomingSetting) obj;
        return Intrinsics.areEqual(this.f152805a, bVar.f152805a) && Intrinsics.areEqual(this.f152806b, bVar.f152806b) && Intrinsics.areEqual(this.f152807c, bVar.f152807c);
    }

    public int hashCode() {
        Boolean bool = this.f152805a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<String> list = this.f152806b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<PSTNPhone> list2 = this.f152807c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PSTNIncomingSetting(pstnEnable=" + this.f152805a + ", pstnIncomingCallCountryDefaultList=" + this.f152806b + ", pstnIncomingCallPhoneList=" + this.f152807c + ")";
    }

    /* renamed from: a */
    public final Boolean mo210409a() {
        return this.f152805a;
    }

    /* renamed from: b */
    public final List<String> mo210410b() {
        return this.f152806b;
    }

    /* renamed from: c */
    public final List<PSTNPhone> mo210411c() {
        return this.f152807c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.vc.entity.PSTNPhone> */
    /* JADX WARN: Multi-variable type inference failed */
    public PSTNIncomingSetting(Boolean bool, List<String> list, List<? extends PSTNPhone> list2) {
        this.f152805a = bool;
        this.f152806b = list;
        this.f152807c = list2;
    }
}
