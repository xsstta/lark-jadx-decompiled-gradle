package com.ss.android.lark.calendar.impl.features.calendarview;

import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.f */
public class C30804f {

    /* renamed from: a */
    private CalendarTabView f77472a;

    /* renamed from: b */
    private float f77473b;

    /* renamed from: c */
    private int f77474c = 1;

    /* renamed from: d */
    private float f77475d;

    /* renamed from: e */
    private boolean f77476e;

    /* renamed from: f */
    private int f77477f = 1;

    /* renamed from: g */
    private boolean f77478g;

    public C30804f() {
        View a = C30022a.f74882a.mainModuleDependency().mo108277a();
        if (a instanceof CalendarTabView) {
            Log.m165389i("CalendarTabScrollProgress", C32673y.m125378d("is CalendarTabView"));
            this.f77472a = (CalendarTabView) a;
            return;
        }
        Log.m165383e("CalendarTabScrollProgress", C32673y.m125378d("Err is not CalendarTabView"));
    }

    /* renamed from: a */
    public void mo111605a(int i) {
        this.f77474c = i;
    }

    /* renamed from: a */
    public void mo111607a(boolean z) {
        CalendarTabView calendarTabView = this.f77472a;
        if (calendarTabView != null) {
            calendarTabView.setUpDownArrow(z);
        }
    }

    /* renamed from: b */
    public void mo111608b(float f) {
        CalendarTabView calendarTabView = this.f77472a;
        if (calendarTabView != null) {
            calendarTabView.mo110678a(f);
        }
    }

    /* renamed from: b */
    public void mo111609b(int i) {
        CalendarTabView calendarTabView = this.f77472a;
        if (calendarTabView != null) {
            calendarTabView.mo110681a(BitmapDescriptorFactory.HUE_RED, i, true);
        }
    }

    /* renamed from: c */
    public void mo111610c(float f) {
        CalendarTabView calendarTabView = this.f77472a;
        if (calendarTabView != null && !calendarTabView.getIsMoveTodayAnimating()) {
            this.f77472a.mo110684b(f);
        }
    }

    /* renamed from: a */
    public void mo111604a(float f) {
        CalendarTabView calendarTabView = this.f77472a;
        if (calendarTabView != null && !calendarTabView.getIsMoveTodayAnimating()) {
            float currentProgress = this.f77472a.getCurrentProgress();
            this.f77475d = currentProgress;
            float f2 = currentProgress + f;
            this.f77475d = f2;
            this.f77472a.mo110684b(f2);
        }
    }

    /* renamed from: a */
    public void mo111606a(int i, float f) {
        CalendarTabView calendarTabView = this.f77472a;
        if (calendarTabView != null) {
            this.f77475d = calendarTabView.getCurrentProgress();
            this.f77476e = this.f77472a.getIsMoveTodayAnimating();
        }
        if (!this.f77476e) {
            if (i == 0) {
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 == 0 && this.f77477f == 0) {
                    this.f77475d = (float) Math.round(this.f77475d - (this.f77473b * ((float) this.f77474c)));
                    this.f77473b = BitmapDescriptorFactory.HUE_RED;
                    this.f77477f = 1;
                    this.f77478g = true;
                }
                if (i2 > 0) {
                    if (this.f77473b == BitmapDescriptorFactory.HUE_RED) {
                        this.f77473b = 1.0f;
                    }
                    this.f77475d += (f - this.f77473b) * ((float) this.f77474c);
                    this.f77473b = f;
                    this.f77477f = 0;
                    this.f77478g = false;
                }
            } else if (i == 1) {
                int i3 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i3 == 0) {
                    if (this.f77477f != 1) {
                        this.f77475d = (float) Math.round(this.f77475d);
                        this.f77473b = BitmapDescriptorFactory.HUE_RED;
                        this.f77477f = 1;
                        this.f77478g = true;
                    }
                } else if (i3 > 0) {
                    this.f77475d += (f - this.f77473b) * ((float) this.f77474c);
                    this.f77473b = f;
                    this.f77477f = 2;
                    this.f77478g = false;
                }
            } else if (i == 2 && this.f77477f == 2) {
                this.f77475d = (float) Math.round(this.f77475d + ((1.0f - this.f77473b) * ((float) this.f77474c)));
                this.f77473b = BitmapDescriptorFactory.HUE_RED;
                this.f77477f = 1;
                this.f77478g = true;
            }
            CalendarTabView calendarTabView2 = this.f77472a;
            if (calendarTabView2 == null) {
                return;
            }
            if (this.f77478g) {
                calendarTabView2.mo110681a(this.f77475d, 20, false);
            } else {
                calendarTabView2.mo110684b(this.f77475d);
            }
        }
    }
}
