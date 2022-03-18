package com.ss.android.vc.entity;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.vc.entity.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/ss/android/vc/entity/VCParticipantAbbrInfo;", "", UpdateKey.STATUS, "Lcom/ss/android/vc/entity/Status;", "user", "Lcom/ss/android/vc/entity/ByteviewUser;", "deviceType", "Lcom/ss/android/vc/entity/Participant$DeviceType;", "tenantId", "", "isGuest", "", "(Lcom/ss/android/vc/entity/Status;Lcom/ss/android/vc/entity/ByteviewUser;Lcom/ss/android/vc/entity/Participant$DeviceType;Ljava/lang/String;Z)V", "getDeviceType", "()Lcom/ss/android/vc/entity/Participant$DeviceType;", "()Z", "getStatus", "()Lcom/ss/android/vc/entity/Status;", "getTenantId", "()Ljava/lang/String;", "getUser", "()Lcom/ss/android/vc/entity/ByteviewUser;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.t */
public final class VCParticipantAbbrInfo {

    /* renamed from: a */
    private final Status f152796a;

    /* renamed from: b */
    private final ByteviewUser f152797b;

    /* renamed from: c */
    private final Participant.DeviceType f152798c;

    /* renamed from: d */
    private final String f152799d;

    /* renamed from: e */
    private final boolean f152800e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCParticipantAbbrInfo)) {
            return false;
        }
        VCParticipantAbbrInfo tVar = (VCParticipantAbbrInfo) obj;
        return Intrinsics.areEqual(this.f152796a, tVar.f152796a) && Intrinsics.areEqual(this.f152797b, tVar.f152797b) && Intrinsics.areEqual(this.f152798c, tVar.f152798c) && Intrinsics.areEqual(this.f152799d, tVar.f152799d) && this.f152800e == tVar.f152800e;
    }

    public int hashCode() {
        Status status = this.f152796a;
        int i = 0;
        int hashCode = (status != null ? status.hashCode() : 0) * 31;
        ByteviewUser byteviewUser = this.f152797b;
        int hashCode2 = (hashCode + (byteviewUser != null ? byteviewUser.hashCode() : 0)) * 31;
        Participant.DeviceType deviceType = this.f152798c;
        int hashCode3 = (hashCode2 + (deviceType != null ? deviceType.hashCode() : 0)) * 31;
        String str = this.f152799d;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f152800e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "VCParticipantAbbrInfo(status=" + this.f152796a + ", user=" + this.f152797b + ", deviceType=" + this.f152798c + ", tenantId=" + this.f152799d + ", isGuest=" + this.f152800e + ")";
    }

    /* renamed from: a */
    public final Status mo210169a() {
        return this.f152796a;
    }

    /* renamed from: b */
    public final ByteviewUser mo210170b() {
        return this.f152797b;
    }

    /* renamed from: c */
    public final Participant.DeviceType mo210171c() {
        return this.f152798c;
    }

    /* renamed from: d */
    public final boolean mo210172d() {
        return this.f152800e;
    }

    public VCParticipantAbbrInfo(Status status, ByteviewUser byteviewUser, Participant.DeviceType deviceType, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(byteviewUser, "user");
        Intrinsics.checkParameterIsNotNull(deviceType, "deviceType");
        Intrinsics.checkParameterIsNotNull(str, "tenantId");
        this.f152796a = status;
        this.f152797b = byteviewUser;
        this.f152798c = deviceType;
        this.f152799d = str;
        this.f152800e = z;
    }
}
