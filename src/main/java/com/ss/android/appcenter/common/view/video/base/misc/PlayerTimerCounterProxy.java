package com.ss.android.appcenter.common.view.video.base.misc;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.appcenter.common.util.C28184h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy;", "", "counterInterval", "", "(I)V", "MSG_CODE_COUNTER", "handler", "Landroid/os/Handler;", "isLegal", "", "onCounterUpdateListener", "Lcom/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy$OnCounterUpdateListener;", "start", "useProxy", "cancel", "", "loopNext", "proxyErrorEvent", "eventCode", "bundle", "Landroid/os/Bundle;", "proxyPlayEvent", "removeMessage", "setOnCounterUpdateListener", "setUseProxy", "Companion", "OnCounterUpdateListener", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.a.a.b */
public final class PlayerTimerCounterProxy {

    /* renamed from: f */
    public static final Companion f70806f = new Companion(null);

    /* renamed from: a */
    public final int f70807a = 1;

    /* renamed from: b */
    public boolean f70808b;

    /* renamed from: c */
    public boolean f70809c;

    /* renamed from: d */
    public boolean f70810d;

    /* renamed from: e */
    public OnCounterUpdateListener f70811e;

    /* renamed from: g */
    private final Handler f70812g = new HandlerC28230c(this, Looper.getMainLooper());

    /* renamed from: h */
    private final int f70813h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy$OnCounterUpdateListener;", "", "onTimerCounter", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a.b$b */
    public interface OnCounterUpdateListener {
        /* renamed from: a */
        void mo100511a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy$Companion;", "", "()V", "TAG", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m103395d() {
        this.f70812g.removeMessages(this.f70807a);
    }

    /* renamed from: c */
    public final void mo100519c() {
        this.f70808b = false;
        m103395d();
    }

    /* renamed from: a */
    public final void mo100513a() {
        this.f70808b = true;
        m103395d();
        this.f70812g.sendEmptyMessage(this.f70807a);
    }

    /* renamed from: b */
    public final void mo100517b() {
        m103395d();
        this.f70812g.sendEmptyMessageDelayed(this.f70807a, (long) this.f70813h);
    }

    /* renamed from: a */
    public final void mo100515a(OnCounterUpdateListener bVar) {
        this.f70811e = bVar;
    }

    public PlayerTimerCounterProxy(int i) {
        this.f70813h = i;
    }

    /* renamed from: a */
    public final void mo100516a(boolean z) {
        this.f70810d = z;
        if (!z) {
            mo100519c();
            C28184h.m103248b("TimerCounterProxy", "Timer Stopped");
            return;
        }
        mo100513a();
        C28184h.m103248b("TimerCounterProxy", "Timer Started");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/appcenter/common/view/video/base/misc/PlayerTimerCounterProxy$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.view.video.a.a.b$c */
    public static final class HandlerC28230c extends Handler {

        /* renamed from: a */
        final /* synthetic */ PlayerTimerCounterProxy f70814a;

        public void handleMessage(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            super.handleMessage(message);
            if (message.what == this.f70814a.f70807a && this.f70814a.f70810d && this.f70814a.f70808b && this.f70814a.f70809c) {
                OnCounterUpdateListener bVar = this.f70814a.f70811e;
                if (bVar != null) {
                    bVar.mo100511a();
                }
                this.f70814a.mo100517b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC28230c(PlayerTimerCounterProxy bVar, Looper looper) {
            super(looper);
            this.f70814a = bVar;
        }
    }

    /* renamed from: b */
    public final void mo100518b(int i, Bundle bundle) {
        this.f70809c = false;
        mo100519c();
    }

    /* renamed from: a */
    public final void mo100514a(int i, Bundle bundle) {
        boolean z = true;
        boolean z2 = false;
        switch (i) {
            case -99016:
            case -99009:
            case -99008:
            case -99007:
                this.f70809c = false;
                z = false;
                z2 = true;
                break;
            case -99015:
            case -99014:
            case -99011:
            case -99010:
            case -99006:
            case -99005:
            case -99001:
                this.f70809c = true;
                break;
            case -99013:
            case -99012:
            case -99004:
            case -99003:
            case -99002:
            default:
                C28184h.m103250d("TimerCounterProxy", "unknown event int proxyPlayEvent");
                z = false;
                break;
        }
        if (this.f70810d) {
            if (z) {
                mo100513a();
            }
            if (z2) {
                mo100519c();
            }
        }
    }
}
