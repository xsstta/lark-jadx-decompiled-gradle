package com.ss.android.lark.inno.player.widget;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: com.ss.android.lark.inno.player.widget.d */
public class C39088d {

    /* renamed from: a */
    public View f100360a;

    /* renamed from: b */
    private Handler f100361b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private Runnable f100362c = new Runnable() {
        /* class com.ss.android.lark.inno.player.widget.C39088d.RunnableC390891 */

        public void run() {
            if (C39088d.this.f100360a != null) {
                C39088d.this.f100360a.setVisibility(4);
            }
        }
    };

    /* renamed from: d */
    private Runnable f100363d = new Runnable() {
        /* class com.ss.android.lark.inno.player.widget.C39088d.RunnableC390902 */

        public void run() {
            if (C39088d.this.f100360a != null) {
                C39088d.this.f100360a.setVisibility(8);
            }
        }
    };

    /* renamed from: c */
    public void mo142964c() {
        this.f100361b.removeCallbacks(this.f100363d);
    }

    /* renamed from: a */
    public void mo142958a() {
        this.f100361b.removeCallbacks(this.f100362c);
        this.f100360a.setVisibility(4);
    }

    /* renamed from: b */
    public void mo142961b() {
        this.f100361b.removeCallbacks(this.f100363d);
        this.f100360a.setVisibility(8);
    }

    /* renamed from: a */
    public void mo142959a(boolean z) {
        mo142960a(z, 3000);
    }

    public C39088d(View view) {
        this.f100360a = view;
    }

    /* renamed from: b */
    public void mo142962b(boolean z) {
        if (this.f100360a.getVisibility() == 0) {
            mo142958a();
        } else {
            mo142959a(z);
        }
    }

    /* renamed from: a */
    public void mo142960a(boolean z, long j) {
        this.f100361b.removeCallbacks(this.f100362c);
        this.f100360a.setVisibility(0);
        this.f100360a.requestLayout();
        if (z) {
            this.f100361b.postDelayed(this.f100362c, j);
        }
    }

    /* renamed from: b */
    public void mo142963b(boolean z, long j) {
        this.f100361b.removeCallbacks(this.f100363d);
        this.f100360a.setVisibility(0);
        this.f100360a.requestLayout();
        if (z) {
            this.f100361b.postDelayed(this.f100363d, j);
        }
    }
}
