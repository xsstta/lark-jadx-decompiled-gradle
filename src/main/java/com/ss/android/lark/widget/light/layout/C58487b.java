package com.ss.android.lark.widget.light.layout;

import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;

/* renamed from: com.ss.android.lark.widget.light.layout.b */
public class C58487b implements AbstractC58486a {

    /* renamed from: a */
    private static HandlerC58488a f144202a;

    /* renamed from: a */
    public static HandlerThread m226883a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    private HandlerC58488a m226884a() {
        if (f144202a == null) {
            HandlerThread a = m226883a("GlyphWarmer");
            a.start();
            f144202a = new HandlerC58488a(a.getLooper());
        }
        return f144202a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.light.layout.b$a */
    public static class HandlerC58488a extends Handler {

        /* renamed from: a */
        private final Picture f144203a = new Picture();

        HandlerC58488a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Layout layout = (Layout) message.obj;
            try {
                layout.draw(this.f144203a.beginRecording(C58489c.m226886a(layout), C58489c.m226887b(layout)));
                this.f144203a.endRecording();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.lark.widget.light.layout.AbstractC58486a
    /* renamed from: a */
    public void mo198163a(Layout layout) {
        HandlerC58488a a = m226884a();
        a.sendMessage(a.obtainMessage(1, layout));
    }
}
