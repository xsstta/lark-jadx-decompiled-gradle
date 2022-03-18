package com.ss.android.vc.meeting.module.multi.viewpager;

import com.ss.android.vc.meeting.module.multi.InMeetingPageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/viewpager/PageHolder;", "", "pageView", "Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;", "page", "", "(Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;I)V", "getPage", "()I", "setPage", "(I)V", "getPageView", "()Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;", "setPageView", "(Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.viewpager.c */
public final class PageHolder {

    /* renamed from: a */
    private InMeetingPageView f157371a;

    /* renamed from: b */
    private int f157372b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageHolder)) {
            return false;
        }
        PageHolder cVar = (PageHolder) obj;
        return Intrinsics.areEqual(this.f157371a, cVar.f157371a) && this.f157372b == cVar.f157372b;
    }

    public int hashCode() {
        InMeetingPageView dVar = this.f157371a;
        return ((dVar != null ? dVar.hashCode() : 0) * 31) + this.f157372b;
    }

    public String toString() {
        return "PageHolder(pageView=" + this.f157371a + ", page=" + this.f157372b + ")";
    }

    /* renamed from: a */
    public final InMeetingPageView mo216231a() {
        return this.f157371a;
    }

    /* renamed from: b */
    public final int mo216233b() {
        return this.f157372b;
    }

    /* renamed from: a */
    public final void mo216232a(int i) {
        this.f157372b = i;
    }

    public PageHolder(InMeetingPageView dVar, int i) {
        Intrinsics.checkParameterIsNotNull(dVar, "pageView");
        this.f157371a = dVar;
        this.f157372b = i;
    }
}
