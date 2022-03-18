package com.ss.android.lark.mm.module.record.detail.tips;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.banner.C45981a;
import com.ss.android.lark.utils.UIHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordBanner;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "handlder", "Landroid/os/Handler;", "isLimitBannerAttached", "Ljava/util/concurrent/atomic/AtomicBoolean;", "phoneStateBanner", "Lcom/ss/android/lark/mm/module/detail/banner/MmCommonBanner;", "waringBanner", "weakNetworkStateBanner", "onPhoneStateChange", "", "isCalling", "", "onRecordAlmostReachLimit", "onShowWeakNetwork", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmRecordBanner extends FrameLayout {

    /* renamed from: a */
    public final C45981a f118100a;

    /* renamed from: b */
    private final AtomicBoolean f118101b;

    /* renamed from: c */
    private final Handler f118102c;

    /* renamed from: d */
    private final C45981a f118103d;

    /* renamed from: e */
    private final C45981a f118104e;

    public MmRecordBanner(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmRecordBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.tips.MmRecordBanner$a */
    public static final class RunnableC46911a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmRecordBanner f118105a;

        RunnableC46911a(MmRecordBanner mmRecordBanner) {
            this.f118105a = mmRecordBanner;
        }

        public final void run() {
            this.f118105a.f118100a.mo161462b();
        }
    }

    /* renamed from: a */
    public final void mo164727a() {
        if (this.f118101b.compareAndSet(false, true)) {
            this.f118103d.mo161459a(this);
        }
    }

    /* renamed from: b */
    public final void mo164729b() {
        this.f118100a.mo161459a(this);
        this.f118102c.removeCallbacksAndMessages(null);
        this.f118102c.postDelayed(new RunnableC46911a(this), 3000);
    }

    /* renamed from: a */
    public final void mo164728a(boolean z) {
        if (z) {
            this.f118104e.mo161459a(this);
        } else {
            this.f118104e.mo161462b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118101b = new AtomicBoolean(false);
        this.f118102c = new Handler(Looper.getMainLooper());
        C45981a a = new C45981a.C45984a(context, UIHelper.mustacheFormat((int) R.string.MMWeb_G_RecordingMaximumLengthInfo, "number", "4")).mo161466a(true).mo161465a(UDNotice.Type.INFO).mo161467a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmCommonBanner.Builder(c…pe.INFO)\n        .build()");
        this.f118103d = a;
        C45981a a2 = new C45981a.C45984a(context, UIHelper.mustacheFormat((int) R.string.MMWeb_G_RecordingStoppedWhenCalling)).mo161466a(false).mo161465a(UDNotice.Type.INFO).mo161467a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmCommonBanner.Builder(c…pe.INFO)\n        .build()");
        this.f118104e = a2;
        C45981a a3 = new C45981a.C45984a(context, UIHelper.mustacheFormat((int) R.string.MMWeb_G_RecordingNoInternetConnectionInfo)).mo161466a(false).mo161465a(UDNotice.Type.WARNING).mo161467a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "MmCommonBanner.Builder(c…WARNING)\n        .build()");
        this.f118100a = a3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmRecordBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
