package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u00017BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003Je\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u00104\u001a\u000205H\u0016J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001a\"\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "", "id", "", "isSelected", "", "chatterAvatarKey", "chatterName", BottomDialog.f17198f, "isDeactivate", "time", "", "sharingType", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData$SharingType;", "sharingTarget", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingTarget;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData$SharingType;Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingTarget;)V", "getChatterAvatarKey", "()Ljava/lang/String;", "setChatterAvatarKey", "(Ljava/lang/String;)V", "getChatterId", "setChatterId", "getChatterName", "setChatterName", "getId", "()Z", "setDeactivate", "(Z)V", "setSelected", "getSharingTarget", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingTarget;", "getSharingType", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData$SharingType;", "setSharingType", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData$SharingType;)V", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "SharingType", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SharingHistoryViewData {

    /* renamed from: a */
    private final String f89844a;

    /* renamed from: b */
    private boolean f89845b;

    /* renamed from: c */
    private String f89846c;

    /* renamed from: d */
    private String f89847d;

    /* renamed from: e */
    private String f89848e;

    /* renamed from: f */
    private boolean f89849f;

    /* renamed from: g */
    private long f89850g;

    /* renamed from: h */
    private SharingType f89851h;

    /* renamed from: i */
    private final SharingTarget f89852i;

    public String toString() {
        return "SharingHistoryViewData(id=" + this.f89844a + ", isSelected=" + this.f89845b + ", chatterAvatarKey=" + this.f89846c + ", chatterName=" + this.f89847d + ", chatterId=" + this.f89848e + ", isDeactivate=" + this.f89849f + ", time=" + this.f89850g + ", sharingType=" + this.f89851h + ", sharingTarget=" + this.f89852i + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData$SharingType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "forNumber", "getNumber", "valueOf", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SAVE_QR", "SHARED_INVITATION", "SHARED_LINK", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SharingType {
        UNKNOWN(0),
        SAVE_QR(1),
        SHARED_INVITATION(2),
        SHARED_LINK(3);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public final int getValue() {
            return this.value;
        }

        public final SharingType valueOf(int i) {
            return forNumber(i);
        }

        public final SharingType forNumber(int i) {
            if (i == 1) {
                return SAVE_QR;
            }
            if (i == 2) {
                return SHARED_INVITATION;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return SHARED_LINK;
        }

        private SharingType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public final String mo128403a() {
        return this.f89844a;
    }

    /* renamed from: c */
    public final String mo128407c() {
        return this.f89846c;
    }

    /* renamed from: d */
    public final String mo128408d() {
        return this.f89847d;
    }

    /* renamed from: e */
    public final String mo128409e() {
        return this.f89848e;
    }

    /* renamed from: f */
    public final boolean mo128411f() {
        return this.f89849f;
    }

    /* renamed from: g */
    public final long mo128412g() {
        return this.f89850g;
    }

    /* renamed from: h */
    public final SharingType mo128413h() {
        return this.f89851h;
    }

    /* renamed from: i */
    public final SharingTarget mo128415i() {
        return this.f89852i;
    }

    /* renamed from: b */
    public final boolean mo128406b() {
        return this.f89845b;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((((((((((this.f89844a.hashCode() * 31) + String.valueOf(this.f89845b).hashCode()) * 31) + this.f89846c.hashCode()) * 31) + this.f89847d.hashCode()) * 31) + this.f89848e.hashCode()) * 31) + String.valueOf(this.f89849f).hashCode()) * 31) + String.valueOf(this.f89850g).hashCode()) * 31) + this.f89851h.hashCode()) * 31;
        SharingTarget mVar = this.f89852i;
        if (mVar != null) {
            i = mVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: b */
    public final void mo128405b(boolean z) {
        this.f89849f = z;
    }

    /* renamed from: a */
    public final void mo128404a(boolean z) {
        this.f89845b = z;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            SharingHistoryViewData sharingHistoryViewData = (SharingHistoryViewData) obj;
            if (!(!Intrinsics.areEqual(this.f89844a, sharingHistoryViewData.f89844a)) && this.f89845b == sharingHistoryViewData.f89845b && !(!Intrinsics.areEqual(this.f89846c, sharingHistoryViewData.f89846c)) && !(!Intrinsics.areEqual(this.f89847d, sharingHistoryViewData.f89847d)) && !(!Intrinsics.areEqual(this.f89848e, sharingHistoryViewData.f89848e)) && this.f89849f == sharingHistoryViewData.f89849f && this.f89850g == sharingHistoryViewData.f89850g && this.f89851h == sharingHistoryViewData.f89851h && !(!Intrinsics.areEqual(this.f89852i, sharingHistoryViewData.f89852i))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryViewData");
    }

    public SharingHistoryViewData(String str, boolean z, String str2, String str3, String str4, boolean z2, long j, SharingType sharingType, SharingTarget mVar) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "chatterAvatarKey");
        Intrinsics.checkParameterIsNotNull(str3, "chatterName");
        Intrinsics.checkParameterIsNotNull(str4, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(sharingType, "sharingType");
        this.f89844a = str;
        this.f89845b = z;
        this.f89846c = str2;
        this.f89847d = str3;
        this.f89848e = str4;
        this.f89849f = z2;
        this.f89850g = j;
        this.f89851h = sharingType;
        this.f89852i = mVar;
    }
}
