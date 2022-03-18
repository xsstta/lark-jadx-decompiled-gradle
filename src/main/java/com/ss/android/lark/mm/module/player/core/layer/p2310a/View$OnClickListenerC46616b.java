package com.ss.android.lark.mm.module.player.core.layer.p2310a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.layer.common.MmVideoLayerCommonViewHolder;
import com.ss.android.lark.mm.module.player.core.layer.p2310a.AbstractC46617c;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.a.b */
public class View$OnClickListenerC46616b extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    public ImageView f117315a;

    /* renamed from: b */
    private String f117316b;

    /* renamed from: c */
    private ImageView f117317c;

    /* renamed from: d */
    private MmVideoLayerCommonViewHolder f117318d;

    /* renamed from: e */
    private AbstractC46617c.AbstractC46618a f117319e;

    /* renamed from: b */
    public void mo163798b() {
        setVisibility(4);
    }

    /* renamed from: a */
    public void mo163792a() {
        if (!TextUtils.isEmpty(this.f117316b)) {
            C45853e.m181660b(this.f117317c, this.f117316b);
        }
        setVisibility(0);
    }

    /* renamed from: c */
    private void m184416c() {
        inflate(getContext(), R.layout.mm_fore_play_layer_layout, this);
        this.f117317c = (ImageView) findViewById(R.id.cover_video);
        ImageView imageView = (ImageView) findViewById(R.id.play_btn);
        this.f117315a = imageView;
        imageView.setOnClickListener(this);
    }

    public View$OnClickListenerC46616b(Context context) {
        super(context);
        m184416c();
    }

    /* renamed from: a */
    public void mo163793a(float f) {
        MmVideoLayerCommonViewHolder aVar = this.f117318d;
        if (aVar != null) {
            aVar.mo163806a(f);
        }
    }

    /* renamed from: b */
    public void mo163799b(boolean z) {
        MmVideoLayerCommonViewHolder aVar = this.f117318d;
        if (aVar != null) {
            aVar.mo163814c(z);
        }
    }

    public void setCallback(AbstractC46617c.AbstractC46618a aVar) {
        this.f117319e = aVar;
        if (this.f117318d == null) {
            MmVideoLayerCommonViewHolder aVar2 = new MmVideoLayerCommonViewHolder(this, aVar.mo163788f(), aVar.mo163789g());
            this.f117318d = aVar2;
            aVar2.mo163810a(false);
        }
    }

    /* renamed from: a */
    public void mo163795a(Bundle bundle) {
        this.f117316b = bundle.getString("video_cover_url", "");
        mo163794a(bundle.getLong("video_last_play_pos", 0), bundle.getLong("video_duration", 0));
        C45853e.m181660b(this.f117317c, this.f117316b);
    }

    /* renamed from: a */
    public void mo163796a(HightlightTimeLine hightlightTimeLine) {
        MmVideoLayerCommonViewHolder aVar = this.f117318d;
        if (aVar != null) {
            aVar.mo163809a(hightlightTimeLine);
        }
    }

    public void onClick(View view) {
        if (view == this.f117315a && this.f117319e != null) {
            C47083e.m186423a(getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("video_play").mo165417b("player").mo165421c());
            C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_play").mo165423e("none").mo165424f("player").mo165421c());
            if (!NetworkUtils.isNetworkAvailable(getContext())) {
                C45858j.m181678a(C45851c.m181646a(), getResources().getString(R.string.MMWeb_G_FailedToLoad));
                return;
            }
            this.f117319e.mo163787e();
            mo163798b();
        }
    }

    /* renamed from: a */
    public void mo163797a(boolean z) {
        MmVideoLayerCommonViewHolder aVar = this.f117318d;
        if (aVar != null) {
            aVar.mo163812b(z);
        }
    }

    /* renamed from: a */
    public void mo163794a(long j, long j2) {
        MmVideoLayerCommonViewHolder aVar = this.f117318d;
        if (aVar != null) {
            aVar.mo163808a(j, j2);
            this.f117318d.mo163807a(j2);
        }
    }
}
