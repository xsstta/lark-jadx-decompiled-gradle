package com.bytedance.ee.util.p709l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.OrientationEventListener;
import com.bytedance.ee.util.p709l.AbstractC13691b;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.util.l.h */
public class C13703h extends OrientationEventListener implements AbstractC13691b.AbstractC13692a {

    /* renamed from: a */
    public AbstractC13704a f35897a;

    /* renamed from: b */
    public AbstractC13691b f35898b;

    /* renamed from: c */
    private HandlerC13705b f35899c = new HandlerC13705b(this);

    /* renamed from: com.bytedance.ee.util.l.h$a */
    public interface AbstractC13704a {
        void onOrientationChanged(AbstractC13696d dVar);
    }

    /* renamed from: com.bytedance.ee.util.l.h$b */
    static class HandlerC13705b extends Handler {

        /* renamed from: a */
        private AbstractC13691b f35900a = C13700g.m55592a();

        /* renamed from: b */
        private WeakReference<C13703h> f35901b;

        /* renamed from: a */
        public void mo50672a(AbstractC13691b bVar) {
            this.f35900a = bVar;
        }

        public HandlerC13705b(C13703h hVar) {
            this.f35901b = new WeakReference<>(hVar);
        }

        public void handleMessage(Message message) {
            C13703h hVar = this.f35901b.get();
            if (hVar != null) {
                hVar.f35898b = this.f35900a;
                if (this.f35900a instanceof AbstractC13696d) {
                    hVar.f35897a.onOrientationChanged((AbstractC13696d) this.f35900a);
                }
            }
        }
    }

    public void onOrientationChanged(int i) {
        if (i == -1) {
            this.f35899c.removeMessages(1);
        }
        this.f35898b.mo50651a(this, i);
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13691b.AbstractC13692a
    /* renamed from: a */
    public void mo50652a(AbstractC13691b bVar) {
        if (this.f35899c.hasMessages(1)) {
            this.f35899c.mo50672a(bVar);
        } else {
            this.f35899c.sendEmptyMessageDelayed(1, 300);
        }
    }

    public C13703h(Context context, AbstractC13704a aVar) {
        super(context, 2);
        this.f35897a = aVar;
        this.f35898b = C13700g.m55592a();
    }
}
