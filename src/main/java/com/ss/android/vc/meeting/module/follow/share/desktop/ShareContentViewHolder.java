package com.ss.android.vc.meeting.module.follow.share.desktop;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.IShareContentDialog;
import com.ss.android.vc.meeting.module.follow.share.NewShareFilePupop;
import com.ss.android.vc.meeting.module.p3151p.C62623f;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event.C63772u;

public class ShareContentViewHolder {

    /* renamed from: a */
    public Activity f155183a;

    /* renamed from: b */
    public IShareContentDialog f155184b;

    /* renamed from: c */
    protected View f155185c;

    /* renamed from: d */
    protected C61303k f155186d;

    /* renamed from: e */
    public C61828a f155187e;

    /* renamed from: f */
    protected C62623f f155188f;

    /* renamed from: g */
    protected IconFontView f155189g;

    /* renamed from: h */
    public C61832d f155190h;

    /* renamed from: i */
    protected LinearLayout f155191i;

    /* renamed from: j */
    protected View f155192j;

    /* renamed from: k */
    protected View f155193k;

    /* renamed from: l */
    protected NewShareFilePupop f155194l;

    /* renamed from: m */
    protected ConstraintLayout f155195m;

    public enum SharePanelSource {
        FROM_OUT_TAB,
        FROM_IN_MEETING_VIEW
    }

    /* renamed from: a */
    public void mo214174a() {
        if (this.f155186d.aa().mo216274b()) {
            mo214175b();
        }
    }

    /* renamed from: b */
    public void mo214175b() {
        mo214177d();
        if (this.f155186d.aj().mo216415e()) {
            mo214181h();
        }
        mo214178e();
        mo214176c();
    }

    /* renamed from: e */
    public void mo214178e() {
        C61832d dVar = new C61832d(SharePanelSource.FROM_IN_MEETING_VIEW, null, this.f155186d, this.f155183a, this.f155184b, this.f155185c);
        this.f155190h = dVar;
        dVar.mo214191b();
    }

    /* renamed from: f */
    public void mo214179f() {
        C61832d dVar = this.f155190h;
        if (dVar != null) {
            dVar.mo214188a(this.f155191i, this.f155193k);
        }
        this.f155185c.setBackgroundColor(C60773o.m236126d(R.color.bg_body));
    }

    /* renamed from: g */
    public void mo214180g() {
        C61832d dVar = this.f155190h;
        if (dVar != null) {
            dVar.mo214187a(this.f155191i);
        }
        this.f155185c.setBackgroundColor(C60773o.m236126d(R.color.bg_float_base));
    }

    /* renamed from: i */
    public void mo214182i() {
        C62623f fVar = this.f155188f;
        if (fVar != null) {
            fVar.mo216446a();
            this.f155188f = null;
        }
        NewShareFilePupop fVar2 = this.f155194l;
        if (fVar2 != null && fVar2.mo219704l()) {
            this.f155194l.mo211398c();
            this.f155194l = null;
        }
    }

    /* renamed from: c */
    public void mo214176c() {
        this.f155189g = (IconFontView) this.f155185c.findViewById(R.id.go_back);
        if (DesktopUtil.m144307b()) {
            this.f155189g.setText(R.string.iconfont_icon_close);
        }
        this.f155189g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$ShareContentViewHolder$2T1KQqbvv2UJS2b7cH7wT2RB1ZY */

            public final void onClick(View view) {
                ShareContentViewHolder.lambda$2T1KQqbvv2UJS2b7cH7wT2RB1ZY(ShareContentViewHolder.this, view);
            }
        });
    }

    /* renamed from: h */
    public void mo214181h() {
        this.f155188f = new C62623f(this.f155186d, this.f155184b, this.f155185c, SharePanelSource.FROM_IN_MEETING_VIEW, null);
        this.f155191i = (LinearLayout) this.f155185c.findViewById(R.id.share_screen_and_new_file_container);
        this.f155193k = this.f155185c.findViewById(R.id.share_content_appbar_layout);
    }

    /* renamed from: d */
    public void mo214177d() {
        this.f155192j = this.f155185c.findViewById(R.id.container_search);
        this.f155195m = (ConstraintLayout) this.f155185c.findViewById(R.id.search_bar_highlight);
        C61828a aVar = new C61828a();
        this.f155187e = aVar;
        aVar.f155196a.setVisibility(0);
        this.f155187e.f155196a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$ShareContentViewHolder$CklYiOMYhoUzvLFqtwG3y8XBYE */

            public final void onClick(View view) {
                ShareContentViewHolder.m271262lambda$CklYiOMYhoUzvLFqtwG3y8XBYE(ShareContentViewHolder.this, view);
            }
        });
        if (this.f155186d.ab().mo213893s()) {
            this.f155187e.f155197b.setVisibility(0);
            this.f155187e.f155197b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.follow.share.desktop.$$Lambda$ShareContentViewHolder$hX62uXMA4dHT5rWnaGtyZN1cQ6g */

                public final void onClick(View view) {
                    ShareContentViewHolder.lambda$hX62uXMA4dHT5rWnaGtyZN1cQ6g(ShareContentViewHolder.this, view);
                }
            });
            return;
        }
        this.f155187e.f155197b.setVisibility(8);
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder$a */
    public class C61828a {

        /* renamed from: a */
        public View f155196a;

        /* renamed from: b */
        public View f155197b;

        /* renamed from: a */
        public void mo214183a(boolean z) {
            View view = this.f155196a;
            if (view != null) {
                view.setEnabled(z);
            }
            View view2 = this.f155197b;
            if (view2 != null) {
                view2.setEnabled(z);
            }
        }

        public C61828a() {
            ShareContentViewHolder.this = r3;
            this.f155196a = r3.f155185c.findViewById(R.id.share_doc_files);
            this.f155197b = r3.f155185c.findViewById(R.id.share_content_new_doc);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m241535c(View view) {
        this.f155184b.dismiss();
        this.f155190h.mo214195d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m241533a(View view) {
        C61303k kVar = this.f155186d;
        if (kVar != null && kVar.f153550c != null) {
            NewShareFilePupop fVar = (NewShareFilePupop) new NewShareFilePupop(this.f155183a, this.f155187e.f155197b, this.f155186d, SharePanelSource.FROM_IN_MEETING_VIEW, null, this.f155184b).mo219699g();
            this.f155194l = fVar;
            fVar.mo211397b();
            C63772u.m250374a(this.f155186d.mo212056e());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m241534b(View view) {
        C61303k kVar = this.f155186d;
        if (kVar != null && kVar.f153550c != null) {
            VideoChat e = this.f155186d.mo212056e();
            if (this.f155186d.f153550c == VideoChat.Type.CALL) {
                C63763l.m250308c(e);
            } else if (this.f155186d.f153550c == VideoChat.Type.MEET) {
                C63742at.m250106m(e);
            }
        }
    }

    /* renamed from: a */
    public View mo214173a(C61303k kVar, Context context, IShareContentDialog bVar) {
        this.f155183a = C60773o.m236124b(context);
        this.f155184b = bVar;
        this.f155186d = kVar;
        if (kVar.mo212105W().mo212828g().mo213892r()) {
            this.f155185c = LayoutInflater.from(this.f155183a).inflate(R.layout.dialog_share_content2, (ViewGroup) null);
        } else {
            this.f155185c = LayoutInflater.from(this.f155183a).inflate(R.layout.dialog_share_content, (ViewGroup) null);
        }
        mo214174a();
        return this.f155185c;
    }
}
