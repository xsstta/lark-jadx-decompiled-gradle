package com.ss.android.vc.entity.livestream;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/entity/livestream/LiveVote;", "", "()V", "isVoting", "", "()Z", "setVoting", "(Z)V", "reason", "Lcom/ss/android/vc/entity/livestream/LiveVote$Reason;", "getReason", "()Lcom/ss/android/vc/entity/livestream/LiveVote$Reason;", "setReason", "(Lcom/ss/android/vc/entity/livestream/LiveVote$Reason;)V", "sponsorId", "", "getSponsorId", "()Ljava/lang/String;", "setSponsorId", "(Ljava/lang/String;)V", "voteId", "getVoteId", "setVoteId", "toString", "Reason", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LiveVote {

    /* renamed from: a */
    private String f152508a;

    /* renamed from: b */
    private boolean f152509b;

    /* renamed from: c */
    private Reason f152510c = Reason.UNKNOWN;

    /* renamed from: d */
    private String f152511d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/entity/livestream/LiveVote$Reason;", "", "Lcom/ss/android/vc/entity/EnumInterface;", "value", "", "(Ljava/lang/String;II)V", "getNumber", "valueOf", "v", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CANCEL", "REFUSED", "ACCEPT", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Reason {
        UNKNOWN(0),
        CANCEL(1),
        REFUSED(2),
        ACCEPT(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/livestream/LiveVote$Reason$Companion;", "", "()V", "forNumber", "Lcom/ss/android/vc/entity/livestream/LiveVote$Reason;", "v", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.entity.livestream.LiveVote$Reason$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Reason mo209928a(int i) {
                if (i == 0) {
                    return Reason.UNKNOWN;
                }
                if (i == 1) {
                    return Reason.CANCEL;
                }
                if (i == 2) {
                    return Reason.REFUSED;
                }
                if (i != 3) {
                    return Reason.UNKNOWN;
                }
                return Reason.ACCEPT;
            }
        }

        public int getNumber() {
            return this.value;
        }

        public final Reason valueOf(int i) {
            return Companion.mo209928a(i);
        }

        private Reason(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public final String mo209917a() {
        return this.f152508a;
    }

    /* renamed from: c */
    public final Reason mo209923c() {
        return this.f152510c;
    }

    /* renamed from: d */
    public final String mo209924d() {
        return this.f152511d;
    }

    /* renamed from: b */
    public final boolean mo209922b() {
        return this.f152509b;
    }

    public String toString() {
        return "voteId=" + this.f152508a + ", isVoting=" + this.f152509b + ", reason=" + this.f152510c + ", sponsorId=" + this.f152511d;
    }

    /* renamed from: b */
    public final void mo209921b(String str) {
        this.f152511d = str;
    }

    /* renamed from: a */
    public final void mo209918a(Reason reason) {
        Intrinsics.checkParameterIsNotNull(reason, "<set-?>");
        this.f152510c = reason;
    }

    /* renamed from: a */
    public final void mo209919a(String str) {
        this.f152508a = str;
    }

    /* renamed from: a */
    public final void mo209920a(boolean z) {
        this.f152509b = z;
    }
}
