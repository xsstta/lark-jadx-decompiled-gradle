package com.bytedance.ee.bear.lark;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.bytedance.ee.bear.lark.a */
public class C7958a {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.a$a */
    public static class View$OnTouchListenerC7960a implements View.OnTouchListener {

        /* renamed from: a */
        private AbstractC7961a f21395a;

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ee.bear.lark.a$a$a */
        public interface AbstractC7961a {
            /* renamed from: a */
            void mo30871a();

            /* renamed from: b */
            void mo30872b();
        }

        public View$OnTouchListenerC7960a(AbstractC7961a aVar) {
            this.f21395a = aVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            AbstractC7961a aVar;
            int action = motionEvent.getAction();
            if (action == 0) {
                AbstractC7961a aVar2 = this.f21395a;
                if (aVar2 == null) {
                    return false;
                }
                aVar2.mo30871a();
                return false;
            } else if (action != 1 || (aVar = this.f21395a) == null) {
                return false;
            } else {
                aVar.mo30872b();
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m31810a(final ImageView imageView, final int i) {
        if (imageView != null) {
            imageView.setOnTouchListener(new View$OnTouchListenerC7960a(new View$OnTouchListenerC7960a.AbstractC7961a() {
                /* class com.bytedance.ee.bear.lark.C7958a.C79591 */

                @Override // com.bytedance.ee.bear.lark.C7958a.View$OnTouchListenerC7960a.AbstractC7961a
                /* renamed from: a */
                public void mo30871a() {
                    imageView.setColorFilter(i);
                }

                @Override // com.bytedance.ee.bear.lark.C7958a.View$OnTouchListenerC7960a.AbstractC7961a
                /* renamed from: b */
                public void mo30872b() {
                    imageView.setColorFilter((ColorFilter) null);
                }
            }));
        }
    }

    /* renamed from: a */
    public static int m31809a(float f, int i) {
        return Color.argb((int) (f * 255.0f), (16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
    }
}
