package com.tt.miniapp.p3293h;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.h.d */
public class DialogC66199d extends Dialog {

    /* renamed from: a */
    private Handler f167098a;

    /* renamed from: b */
    private C66201a f167099b;

    /* renamed from: a */
    private void m259178a() {
        this.f167099b = new C66201a(this);
        this.f167098a = new Handler(this.f167099b);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.h.d$a */
    public static final class C66201a implements Handler.Callback {

        /* renamed from: a */
        private WeakReference<DialogInterface> f167100a;

        /* renamed from: b */
        private WeakReference<DialogInterface.OnCancelListener> f167101b;

        /* renamed from: c */
        private WeakReference<DialogInterface.OnDismissListener> f167102c;

        private C66201a(DialogInterface dialogInterface) {
            this.f167100a = new WeakReference<>(dialogInterface);
        }

        /* renamed from: a */
        public void mo231540a(DialogInterface.OnCancelListener onCancelListener) {
            if (onCancelListener == null) {
                this.f167101b = null;
            } else {
                this.f167101b = new WeakReference<>(onCancelListener);
            }
        }

        /* renamed from: a */
        public void mo231541a(DialogInterface.OnDismissListener onDismissListener) {
            if (onDismissListener == null) {
                this.f167102c = null;
            } else {
                this.f167102c = new WeakReference<>(onDismissListener);
            }
        }

        public boolean handleMessage(Message message) {
            DialogInterface.OnDismissListener onDismissListener;
            DialogInterface.OnCancelListener onCancelListener;
            int i = message.what;
            if (i == 67) {
                WeakReference<DialogInterface.OnDismissListener> weakReference = this.f167102c;
                if (!(weakReference == null || (onDismissListener = weakReference.get()) == null)) {
                    onDismissListener.onDismiss(this.f167100a.get());
                    AppBrandLogger.m52828d("NoLeakDialog", "NoLeak: onDismiss");
                }
                return true;
            } else if (i != 68) {
                return false;
            } else {
                WeakReference<DialogInterface.OnCancelListener> weakReference2 = this.f167101b;
                if (!(weakReference2 == null || (onCancelListener = weakReference2.get()) == null)) {
                    onCancelListener.onCancel(this.f167100a.get());
                    AppBrandLogger.m52828d("NoLeakDialog", "NoLeak: onCancel");
                }
                return true;
            }
        }
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        C66201a aVar;
        Handler handler = this.f167098a;
        if (handler == null || (aVar = this.f167099b) == null) {
            super.setOnCancelListener(onCancelListener);
        } else if (onCancelListener != null) {
            Message obtain = Message.obtain(handler, 68);
            this.f167099b.mo231540a(onCancelListener);
            setCancelMessage(obtain);
        } else {
            aVar.mo231540a((DialogInterface.OnCancelListener) null);
            setCancelMessage(null);
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        C66201a aVar;
        if (this.f167098a == null || (aVar = this.f167099b) == null) {
            super.setOnDismissListener(onDismissListener);
        } else if (onDismissListener != null) {
            aVar.mo231541a(onDismissListener);
            setDismissMessage(Message.obtain(this.f167098a, 67));
        } else {
            aVar.mo231541a((DialogInterface.OnDismissListener) null);
            setDismissMessage(null);
        }
    }

    public DialogC66199d(Context context, int i) {
        super(context, i);
        m259178a();
    }
}
