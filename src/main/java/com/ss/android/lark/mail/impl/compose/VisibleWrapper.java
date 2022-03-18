package com.ss.android.lark.mail.impl.compose;

import android.view.View;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class VisibleWrapper {

    /* renamed from: a */
    private final View f106401a;

    /* renamed from: b */
    private int f106402b;

    /* renamed from: c */
    private int f106403c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VisibleType {
    }

    /* renamed from: a */
    private boolean m166655a() {
        if ((this.f106403c & DynamicModule.f58006b) == 256) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m166656b() {
        if (m166655a()) {
            if ((this.f106402b & 273) == 256) {
                m166654a(0);
            } else {
                m166654a(8);
            }
        } else if ((this.f106402b & 273) == 0) {
            m166654a(0);
        } else {
            m166654a(8);
        }
    }

    public VisibleWrapper(View view) {
        this.f106401a = view;
    }

    /* renamed from: a */
    private void m166654a(int i) {
        this.f106401a.setVisibility(i);
    }

    /* renamed from: b */
    public void mo150722b(boolean z) {
        mo150719a(z ? 1 : 0, 1);
    }

    /* renamed from: c */
    public void mo150723c(boolean z) {
        int i;
        if (z) {
            i = DynamicModule.f58006b;
        } else {
            i = 0;
        }
        mo150719a(i, DynamicModule.f58006b);
    }

    /* renamed from: a */
    public void mo150720a(View.OnClickListener onClickListener) {
        this.f106401a.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo150721a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 16;
        }
        mo150719a(i, 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo150719a(int i, int i2) {
        int i3 = this.f106402b;
        int i4 = (i & i2) | ((~i2) & i3);
        this.f106402b = i4;
        if ((i4 ^ i3) != 0) {
            m166656b();
        }
    }
}
