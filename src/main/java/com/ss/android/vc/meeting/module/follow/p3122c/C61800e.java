package com.ss.android.vc.meeting.module.follow.p3122c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.follow.FollowControl;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.c.e */
public class C61800e implements C61388g.AbstractC61393a, AbstractC61801f {

    /* renamed from: a */
    private RecyclerView f155106a;

    /* renamed from: b */
    private TextView f155107b;

    /* renamed from: c */
    private TextView f155108c;

    /* renamed from: d */
    private Activity f155109d;

    /* renamed from: e */
    private C61303k f155110e;

    /* renamed from: f */
    private C61792a f155111f;

    /* renamed from: g */
    private AbstractC61222a f155112g;

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212620a(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public void bB_() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$e$WNuTq4EkIfZrgVi3IBNS9Y0oX4 */

            public final void run() {
                C61800e.this.m241436e();
            }
        });
    }

    /* renamed from: d */
    private List<Participant> m241435d() {
        C61303k kVar = this.f155110e;
        if (kVar == null) {
            return null;
        }
        List<Participant> e = ParticipantUtil.m248737e(kVar.mo212091I().mo212494b().mo212601f());
        if (!CollectionUtils.isEmpty(e)) {
            return e;
        }
        return null;
    }

    /* renamed from: c */
    private void m241434c() {
        C61303k kVar = this.f155110e;
        if (kVar != null && kVar.mo212091I() != null) {
            this.f155111f = new C61792a(this.f155109d, this.f155112g, this.f155110e);
            this.f155106a.setLayoutManager(new LinearLayoutManager(this.f155109d));
            this.f155106a.setAdapter(this.f155111f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m241436e() {
        boolean z;
        int i;
        C61792a aVar = this.f155111f;
        if (aVar != null) {
            aVar.mo214070a();
            int i2 = 0;
            if (this.f155111f.getItemCount() <= 0) {
                z = true;
            } else {
                z = false;
            }
            TextView textView = this.f155107b;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            RecyclerView recyclerView = this.f155106a;
            if (z) {
                i2 = 8;
            }
            recyclerView.setVisibility(i2);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3122c.AbstractC61801f
    /* renamed from: a */
    public void mo214076a() {
        C61792a aVar = this.f155111f;
        if (aVar != null) {
            aVar.mo214072b();
        }
        AbstractC61222a aVar2 = this.f155112g;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        ((FollowControl) this.f155110e.ab()).mo213897w();
        this.f155110e.mo212091I().mo212494b().mo212597b(this);
        C60700b.m235851b("FollowTransPresenterViewHolder", "[onTransDialogDismiss]", "onTransDialogDismiss");
    }

    /* renamed from: b */
    private void m241433b() {
        List<Participant> d = m241435d();
        if (!CollectionUtils.isEmpty(d)) {
            C60700b.m235851b("FollowTransPresenterViewHolder", "[initParticipantsAndData]", "participants= " + d.size());
            if (d.size() <= 1) {
                this.f155107b.setVisibility(0);
                this.f155106a.setVisibility(8);
                return;
            }
            this.f155107b.setVisibility(8);
            this.f155106a.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m241432a(View view) {
        mo214076a();
    }

    /* renamed from: a */
    public View mo214075a(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        this.f155109d = activity;
        this.f155110e = kVar;
        this.f155112g = aVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.follow_trans_presenter_dialog_layout_2, (ViewGroup) null);
        this.f155106a = (RecyclerView) inflate.findViewById(R.id.follow_trans_container);
        this.f155107b = (TextView) inflate.findViewById(R.id.default_text);
        this.f155108c = (TextView) inflate.findViewById(R.id.trans_title);
        if (DesktopUtil.m144307b()) {
            IconFontView iconFontView = (IconFontView) inflate.findViewById(R.id.follow_trans_icon_close);
            iconFontView.setVisibility(0);
            iconFontView.setText(R.string.iconfont_icon_close);
            iconFontView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$e$8t7mXNiAG91oNFFKNY7QRGxQW8o */

                public final void onClick(View view) {
                    C61800e.this.m241432a((C61800e) view);
                }
            });
        }
        m241434c();
        m241433b();
        ((FollowControl) this.f155110e.ab()).mo213859a(this);
        kVar.mo212091I().mo212494b().mo212593a(this);
        return inflate;
    }
}
