package com.tt.miniapp.view.keyboard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.tt.miniapp.view.SizeDetectFrameLayout;
import com.tt.miniapphost.util.C67590h;

public class KeyboardLayout extends SizeDetectFrameLayout {

    /* renamed from: a */
    public boolean f169494a;

    /* renamed from: b */
    public int f169495b;

    /* renamed from: c */
    public int f169496c;

    /* renamed from: d */
    public AbstractC67193a f169497d;

    /* renamed from: e */
    public Activity f169498e;

    /* renamed from: f */
    public Runnable f169499f;

    /* renamed from: com.tt.miniapp.view.keyboard.KeyboardLayout$a */
    public interface AbstractC67193a {
        /* renamed from: a */
        void mo233596a(boolean z, int i);
    }

    /* renamed from: a */
    public boolean mo233589a() {
        return this.f169494a;
    }

    public int getKeyboardHeight() {
        return this.f169495b;
    }

    public AbstractC67193a getKeyboardLayoutListener() {
        return this.f169497d;
    }

    /* renamed from: com.tt.miniapp.view.keyboard.KeyboardLayout$b */
    private class ViewTreeObserver$OnGlobalLayoutListenerC67194b implements ViewTreeObserver.OnGlobalLayoutListener {
        public void onGlobalLayout() {
            KeyboardLayout keyboardLayout = KeyboardLayout.this;
            keyboardLayout.postDelayed(keyboardLayout.f169499f, 100);
        }

        private ViewTreeObserver$OnGlobalLayoutListenerC67194b() {
        }
    }

    public void setActivity(Activity activity) {
        this.f169498e = activity;
    }

    public void setKeyboardLayoutListener(AbstractC67193a aVar) {
        this.f169497d = aVar;
    }

    public KeyboardLayout(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            this.f169495b = 0;
            this.f169496c = 0;
            this.f169494a = false;
        }
    }

    public KeyboardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f169499f = new Runnable() {
            /* class com.tt.miniapp.view.keyboard.KeyboardLayout.RunnableC671921 */

            public void run() {
                if (KeyboardLayout.this.f169498e != null) {
                    Rect rect = new Rect();
                    KeyboardLayout.this.f169498e.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int c = C67590h.m263086c(KeyboardLayout.this.getContext());
                    int i = c - rect.bottom;
                    boolean z = false;
                    if (Math.abs(i) > c / 5) {
                        z = true;
                    }
                    KeyboardLayout.this.f169495b = i;
                    KeyboardLayout.this.f169494a = z;
                    if (KeyboardLayout.this.f169497d != null && KeyboardLayout.this.f169496c != KeyboardLayout.this.f169495b) {
                        KeyboardLayout.this.f169497d.mo233596a(KeyboardLayout.this.f169494a, KeyboardLayout.this.f169495b);
                        KeyboardLayout keyboardLayout = KeyboardLayout.this;
                        keyboardLayout.f169496c = keyboardLayout.f169495b;
                    }
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC67194b());
    }
}
