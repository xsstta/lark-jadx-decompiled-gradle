package com.ss.android.vc.route.request;

import com.ss.android.vc.route.handler.EquipmentChangedHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/route/request/JoinSuccessEvent;", "", "meetingId", "", "(Ljava/lang/String;)V", "getMeetingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "post", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.i.b.b */
public final class JoinSuccessEvent {

    /* renamed from: a */
    private final String f152870a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof JoinSuccessEvent) && Intrinsics.areEqual(this.f152870a, ((JoinSuccessEvent) obj).f152870a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f152870a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "JoinSuccessEvent(meetingId=" + this.f152870a + ")";
    }

    /* renamed from: a */
    public final void mo210474a() {
        new EquipmentChangedHandler().mo210471a(this.f152870a);
    }

    public JoinSuccessEvent(String str) {
        this.f152870a = str;
    }
}
