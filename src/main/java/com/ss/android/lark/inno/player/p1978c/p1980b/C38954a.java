package com.ss.android.lark.inno.player.p1978c.p1980b;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.network.model.LivePlaybackInfoData;
import com.ss.android.lark.inno.player.core.AbstractC39003d;
import com.ss.android.lark.inno.player.core.C39007h;
import com.ss.android.lark.inno.player.core.C39008i;
import com.ss.android.lark.inno.player.p1978c.p1988c.C38992a;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import java.util.Map;

/* renamed from: com.ss.android.lark.inno.player.c.b.a */
public class C38954a extends AbstractC39003d {
    /* renamed from: c */
    public void mo142585c() {
        this.f100192d.mo142737m();
    }

    /* renamed from: d */
    public C38992a mo142586d() {
        return this.f100189a.mo142699k();
    }

    /* renamed from: e */
    private void m153690e() {
        this.f100189a = C39007h.m153965a(this.f100190b, this.f100192d);
    }

    /* renamed from: f */
    private void m153691f() {
        for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
            this.f100192d.mo142722a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: g */
    private void m153692g() {
        for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
            this.f100192d.mo142722a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void mo142583a(LivePlaybackInfoData livePlaybackInfoData) {
        this.f100189a.mo142702a(C38992a.m153888a(livePlaybackInfoData));
    }

    /* renamed from: a */
    public void mo142584a(String str) {
        this.f100192d.mo142721a(str);
        m153691f();
        this.f100192d.mo142724b();
    }

    public C38954a(Context context) {
        super(context);
        this.f100192d = C39008i.m153967a(context);
        m153692g();
        this.f100190b = new FrameLayout(context);
        this.f100192d.mo142718a(this.f100190b);
        this.f100192d.mo142723a(true);
        m153690e();
    }
}
