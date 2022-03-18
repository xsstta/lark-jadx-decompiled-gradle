package com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.C27693a;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.bannerview.AbstractC28132a;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.a */
public class C28073a extends AbstractC28132a<C27693a> {

    /* renamed from: b */
    private int f70270b;

    /* renamed from: c */
    private boolean f70271c;

    @Override // com.ss.android.appcenter.common.bannerview.AbstractC28132a
    /* renamed from: a */
    public int mo99937a(int i) {
        return R.layout.workplace_template_component_feed_swiper_item;
    }

    /* renamed from: a */
    public void mo99938a(int i, boolean z) {
        this.f70270b = i;
        this.f70271c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m102614a(Context context, C27693a aVar, int i, View view) {
        C27548m.m100547m().mo98222f().mo98206c(context, aVar.f69183c);
        C27710b.m101281c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo99940a(C28112d dVar, C27693a aVar, int i, int i2) {
        float f;
        int i3;
        int i4;
        TextView textView = (TextView) dVar.mo100072a(R.id.feed_title);
        TextView textView2 = (TextView) dVar.mo100072a(R.id.feed_desc);
        C27688a.m101213a(aVar.f69181a, (LKUIRoundedImageView2) dVar.mo100072a(R.id.feed_image));
        View a = dVar.mo100072a(R.id.content_wrapper);
        if (mo100153b() > 1) {
            f = 69.0f;
        } else {
            f = 80.0f;
        }
        C28209p.m103299a(a, C28209p.m103291a(f));
        textView.setTextSize(0, (float) this.f70270b);
        if (!TextUtils.isEmpty(aVar.f69184d)) {
            textView2.setVisibility(0);
            textView2.setText(aVar.f69184d);
            textView.setMaxLines(1);
            textView.setLineSpacing((float) C28209p.m103291a((float) BitmapDescriptorFactory.HUE_RED), 1.0f);
        } else {
            textView2.setVisibility(8);
            textView.setMaxLines(2);
            textView.setLineSpacing((float) C28209p.m103291a(4.0f), 1.0f);
        }
        if (!TextUtils.isEmpty(aVar.f69182b)) {
            textView.setVisibility(0);
            textView.setText(aVar.f69182b);
        } else {
            textView.setVisibility(8);
        }
        Context context = dVar.itemView.getContext();
        if (this.f70271c) {
            i3 = C28209p.m103293a(context, 16.0f);
            i4 = C28209p.m103293a(context, 16.0f);
        } else {
            i4 = 0;
            i3 = 0;
        }
        C28209p.m103301a(textView, i3, 0, i4, 0);
        C28209p.m103301a(textView2, i3, C28209p.m103291a(3.0f), i4, 0);
        int i5 = i + 1;
        if (!TextUtils.isEmpty(aVar.f69183c)) {
            dVar.itemView.setOnClickListener(new View.OnClickListener(context, aVar, i5) {
                /* class com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.$$Lambda$a$75_DugBgP_iPzL9sw9PoZwkBEBs */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ C27693a f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C28073a.m102614a(this.f$0, this.f$1, this.f$2, view);
                }
            });
        } else {
            dVar.itemView.setOnClickListener(null);
        }
        C27710b.m101288d(i5);
    }
}
