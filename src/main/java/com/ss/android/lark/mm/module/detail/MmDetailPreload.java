package com.ss.android.lark.mm.module.detail;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.MmKeywordRes;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.utils.UrlUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/MmDetailPreload;", "", "()V", "preload", "", "url", "", "requestId", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.e */
public final class MmDetailPreload {

    /* renamed from: a */
    public static final MmDetailPreload f116093a = new MmDetailPreload();

    private MmDetailPreload() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.e$a */
    public static final class RunnableC46069a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f116094a;

        /* renamed from: b */
        final /* synthetic */ String f116095b;

        /* renamed from: c */
        final /* synthetic */ String f116096c;

        RunnableC46069a(String str, String str2, String str3) {
            this.f116094a = str;
            this.f116095b = str2;
            this.f116096c = str3;
        }

        public final void run() {
            C47057a.m186238a(this.f116094a, this.f116095b, this.f116096c).mo165341b(new AbstractC47071d<MmBaseInfo.MmBaseInfoResp>() {
                /* class com.ss.android.lark.mm.module.detail.MmDetailPreload.RunnableC46069a.C460701 */

                /* renamed from: a */
                public void mo161289a(MmBaseInfo.MmBaseInfoResp mmBaseInfoResp) {
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.e$b */
    public static final class RunnableC46071b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f116097a;

        /* renamed from: b */
        final /* synthetic */ String f116098b;

        /* renamed from: c */
        final /* synthetic */ String f116099c;

        RunnableC46071b(String str, String str2, String str3) {
            this.f116097a = str;
            this.f116098b = str2;
            this.f116099c = str3;
        }

        public final void run() {
            C47057a.m186240a(this.f116097a, this.f116098b, this.f116099c, MmTranslateLangType.DEFAULT.getValue(), (IHttpLocalErrorHandler) null).mo165341b(new AbstractC47071d<MmMeetingSubtitles.MmMeetingSubtitlesResp>() {
                /* class com.ss.android.lark.mm.module.detail.MmDetailPreload.RunnableC46071b.C460721 */

                /* renamed from: a */
                public void mo161289a(MmMeetingSubtitles.MmMeetingSubtitlesResp mmMeetingSubtitlesResp) {
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.e$c */
    public static final class RunnableC46073c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f116100a;

        /* renamed from: b */
        final /* synthetic */ String f116101b;

        /* renamed from: c */
        final /* synthetic */ String f116102c;

        RunnableC46073c(String str, String str2, String str3) {
            this.f116100a = str;
            this.f116101b = str2;
            this.f116102c = str3;
        }

        public final void run() {
            C47057a.m186268b(this.f116100a, this.f116101b, MmTranslateLangType.DEFAULT.getValue(), this.f116102c).mo165341b(new AbstractC47071d<MmSummary.MmSummaryResp>() {
                /* class com.ss.android.lark.mm.module.detail.MmDetailPreload.RunnableC46073c.C460741 */

                /* renamed from: a */
                public void mo161289a(MmSummary.MmSummaryResp mmSummaryResp) {
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.e$d */
    public static final class RunnableC46075d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f116103a;

        /* renamed from: b */
        final /* synthetic */ String f116104b;

        /* renamed from: c */
        final /* synthetic */ String f116105c;

        RunnableC46075d(String str, String str2, String str3) {
            this.f116103a = str;
            this.f116104b = str2;
            this.f116105c = str3;
        }

        public final void run() {
            C47057a.m186239a(this.f116103a, this.f116104b, MmTranslateLangType.DEFAULT.getValue(), this.f116105c).mo165341b(new AbstractC47071d<MmKeywordRes.MmKeywordResp>() {
                /* class com.ss.android.lark.mm.module.detail.MmDetailPreload.RunnableC46075d.C460761 */

                /* renamed from: a */
                public void mo161289a(MmKeywordRes.MmKeywordResp mmKeywordResp) {
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo161866a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "requestId");
        String b = UrlUtil.f118671a.mo165518b(str);
        String a = UrlUtil.f118671a.mo165517a(str);
        C45857i.m181676a(new RunnableC46069a(b, a, str2));
        C45857i.m181676a(new RunnableC46071b(b, a, str2));
        if (C45865a.m181720c()) {
            C45857i.m181676a(new RunnableC46073c(b, a, str2));
        }
        C45857i.m181676a(new RunnableC46075d(b, a, str2));
    }
}
