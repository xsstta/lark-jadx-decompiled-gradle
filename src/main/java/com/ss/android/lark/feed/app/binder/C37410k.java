package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.entity.NoticeHeaderPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37996h;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1847a.C37271h;
import com.ss.android.lark.feed.statistics.device.MuteDeviceHitPoint;

/* renamed from: com.ss.android.lark.feed.app.binder.k */
public class C37410k implements AbstractC37406i<NoticeHeaderPreview, C37413a, AbstractC37628k> {

    /* renamed from: a */
    public Context f95979a;

    /* renamed from: b */
    public AbstractC37628k f95980b;

    /* renamed from: com.ss.android.lark.feed.app.binder.k$a */
    public static class C37413a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        UDNotice f95984a;

        /* renamed from: b */
        View f95985b;

        /* renamed from: c */
        TextView f95986c;

        /* renamed from: d */
        TextView f95987d;

        /* renamed from: e */
        View f95988e;

        public C37413a(View view) {
            super(view);
            this.f95984a = (UDNotice) view.findViewById(R.id.warn_tip);
            this.f95985b = view.findViewById(R.id.tip_holder);
            this.f95986c = (TextView) view.findViewById(R.id.tv_delayed);
            this.f95987d = (TextView) view.findViewById(R.id.multi_device_tip);
            this.f95988e = view.findViewById(R.id.divide_delayed);
        }
    }

    /* renamed from: a */
    private void m147233a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m147234a(C37413a aVar, final NoticeHeaderPreview noticeHeaderPreview) {
        aVar.f95987d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.binder.C37410k.View$OnClickListenerC374111 */

            public void onClick(View view) {
                if (!C37271h.m146782a()) {
                    if (noticeHeaderPreview.getDeviceStatus() == 2) {
                        MuteDeviceHitPoint.f97734a.mo139412a(false);
                    } else if (noticeHeaderPreview.getDeviceStatus() == 1) {
                        MuteDeviceHitPoint.f97734a.mo139412a(true);
                    }
                    C37268c.m146766b().mo139180a(C37410k.this.f95979a);
                }
            }
        });
        aVar.f95986c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.binder.C37410k.View$OnClickListenerC374122 */

            public void onClick(View view) {
                if (!C37271h.m146782a() && C37410k.this.f95980b.mo138037d() != null) {
                    C37410k.this.f95980b.mo138037d().mo138949a();
                }
            }
        });
    }

    /* renamed from: b */
    public C37413a mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        this.f95979a = viewGroup.getContext();
        return new C37413a(bVar.mo137128a(C37996h.class, viewGroup.getContext()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0145  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137226a(com.ss.android.lark.feed.app.binder.C37410k.C37413a r17, com.ss.android.lark.feed.app.entity.NoticeHeaderPreview r18, com.ss.android.lark.feed.app.AbstractC37628k r19, int r20) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.binder.C37410k.mo137226a(com.ss.android.lark.feed.app.binder.k$a, com.ss.android.lark.feed.app.entity.NoticeHeaderPreview, com.ss.android.lark.feed.app.k, int):void");
    }
}
