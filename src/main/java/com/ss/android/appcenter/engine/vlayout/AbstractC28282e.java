package com.ss.android.appcenter.engine.vlayout;

import android.view.View;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;

/* renamed from: com.ss.android.appcenter.engine.vlayout.e */
public interface AbstractC28282e {
    /* renamed from: a */
    int mo100679a(int i, int i2, boolean z);

    /* renamed from: a */
    View mo100680a();

    /* renamed from: a */
    void mo100682a(View view);

    /* renamed from: a */
    void mo100683a(View view, int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo100684a(View view, boolean z);

    /* renamed from: a */
    void mo100685a(VirtualLayoutManager.C28259c cVar, View view);

    /* renamed from: a */
    void mo100686a(VirtualLayoutManager.C28259c cVar, View view, int i);

    /* renamed from: b */
    AbstractC28285g mo100691b();

    /* renamed from: c */
    int mo100692c();

    /* renamed from: d */
    int mo100693d();

    /* renamed from: e */
    boolean mo100694e();

    View findViewByPosition(int i);

    int getOrientation();

    int getPaddingBottom();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingTop();

    int getPosition(View view);

    boolean getReverseLayout();

    boolean isEnableMarginOverLap();

    void measureChild(View view, int i, int i2);

    void measureChildWithMargins(View view, int i, int i2);
}
