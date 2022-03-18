package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.shadow.text.k */
public class HandlerThreadC26724k extends HandlerThread {

    /* renamed from: a */
    private volatile Handler f66158a;

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.k$a */
    public static class C26726a {

        /* renamed from: a */
        public static HandlerThreadC26724k f66159a = new HandlerThreadC26724k();
    }

    /* renamed from: a */
    public static HandlerThreadC26724k m96863a() {
        return C26726a.f66159a;
    }

    private HandlerThreadC26724k() {
        super("TextLayoutWarmer", 10);
        start();
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.f66158a = new HandlerC26727b(Looper.myLooper());
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.k$b */
    private static final class HandlerC26727b extends Handler {

        /* renamed from: a */
        private final Picture f66160a;

        private HandlerC26727b(Looper looper) {
            super(looper);
            Picture picture;
            try {
                picture = new Picture();
            } catch (RuntimeException unused) {
                picture = null;
            }
            this.f66160a = picture;
        }

        public void handleMessage(Message message) {
            Layout layout;
            if (this.f66160a != null) {
                try {
                    if (message.what == 0 && (layout = (Layout) ((WeakReference) message.obj).get()) != null) {
                        layout.draw(this.f66160a.beginRecording(layout.getWidth(), layout.getHeight()));
                        this.f66160a.endRecording();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo94900a(Layout layout) {
        if (this.f66158a != null) {
            this.f66158a.obtainMessage(0, new WeakReference(layout)).sendToTarget();
        }
    }
}
