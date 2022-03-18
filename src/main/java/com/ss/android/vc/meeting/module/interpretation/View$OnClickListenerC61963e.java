package com.ss.android.vc.meeting.module.interpretation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.C60940j;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61386f;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.interpretation.C61969f;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event2.MeetingInterpretationEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.e */
public class View$OnClickListenerC61963e implements View.OnClickListener, AbsListView.OnScrollListener, C61386f.AbstractC61387a, C61388g.AbstractC61393a {

    /* renamed from: a */
    public C61303k f155620a;

    /* renamed from: b */
    public C61969f f155621b;

    /* renamed from: c */
    public AbstractC61222a f155622c;

    /* renamed from: d */
    public View f155623d;

    /* renamed from: e */
    public View f155624e;

    /* renamed from: f */
    public View f155625f;

    /* renamed from: g */
    public ViewGroup f155626g;

    /* renamed from: h */
    public List<C60940j> f155627h = new ArrayList();

    /* renamed from: i */
    public List<C60940j> f155628i = new ArrayList();

    /* renamed from: j */
    public Boolean f155629j;

    /* renamed from: k */
    public Boolean f155630k;

    /* renamed from: l */
    public Boolean f155631l = false;

    /* renamed from: m */
    public C61957c f155632m;

    /* renamed from: n */
    private Activity f155633n;

    /* renamed from: o */
    private AbstractC61222a f155634o;

    /* renamed from: p */
    private ListView f155635p;

    /* renamed from: q */
    private RelativeLayout f155636q;

    /* renamed from: r */
    private IconFontView f155637r;

    /* renamed from: s */
    private IconFontView f155638s;

    /* renamed from: t */
    private TextView f155639t;

    /* renamed from: u */
    private List<LanguageType> f155640u = new ArrayList(Arrays.asList(null, null));

    /* renamed from: v */
    private List<C60940j> f155641v = new ArrayList();

    @Override // com.ss.android.vc.meeting.model.C61386f.AbstractC61387a
    /* renamed from: a */
    public void mo212586a() {
    }

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
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    /* renamed from: e */
    private void m242089e() {
        this.f155620a.mo212091I().mo212494b().mo212593a(this);
        C619641 r0 = new C61969f.AbstractC61975c() {
            /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e.C619641 */

            @Override // com.ss.android.vc.meeting.module.interpretation.C61969f.AbstractC61975c
            /* renamed from: a */
            public void mo214526a(List<C60940j> list) {
                if (View$OnClickListenerC61963e.this.f155629j.booleanValue() && !View$OnClickListenerC61963e.this.f155631l.booleanValue()) {
                    View$OnClickListenerC61963e.this.f155630k = true;
                    View$OnClickListenerC61963e.this.f155632m.f155607a = list;
                }
                View$OnClickListenerC61963e.this.f155627h = list;
                View$OnClickListenerC61963e.this.mo214518a(list);
            }
        };
        C61969f f = m242090f();
        this.f155621b = f;
        f.mo214536a(r0);
    }

    /* renamed from: f */
    private C61969f m242090f() {
        if (this.f155621b == null) {
            this.f155621b = new C61969f(this.f155633n, this.f155620a, this.f155634o, this.f155629j, this.f155640u);
        }
        return this.f155621b;
    }

    /* renamed from: h */
    private void m242092h() {
        this.f155627h.clear();
        ArrayList arrayList = new ArrayList(this.f155620a.mo212091I().mo212494b().mo212612q());
        this.f155627h = arrayList;
        this.f155632m.mo214505c(arrayList);
        C61969f f = m242090f();
        this.f155621b = f;
        f.mo214537a(this.f155627h);
        this.f155628i = m242087c(this.f155627h);
    }

    /* renamed from: i */
    private void m242093i() {
        List<C60940j> d = mo214522d();
        this.f155628i = d;
        if (d.size() < 10) {
            this.f155627h.add(0, new C60940j(null, null, false));
            C61969f f = m242090f();
            this.f155621b = f;
            f.mo214537a(this.f155627h);
            return;
        }
        C60738ac.m236037c((int) R.string.View_G_InterpretersCapacityReached);
    }

    /* renamed from: d */
    public List<C60940j> mo214522d() {
        this.f155628i.clear();
        List<C60940j> list = this.f155627h;
        if (list != null && !list.isEmpty()) {
            for (C60940j jVar : this.f155627h) {
                if (!jVar.f152503c) {
                    this.f155628i.add(jVar);
                }
            }
        }
        return this.f155628i;
    }

    /* renamed from: c */
    public View mo214521c() {
        View inflate = LayoutInflater.from(this.f155633n).inflate(R.layout.dialog_interpretation_setting, (ViewGroup) null);
        this.f155635p = (ListView) inflate.findViewById(R.id.interpreter_list);
        this.f155636q = (RelativeLayout) inflate.findViewById(R.id.interpreter_add_bar);
        this.f155637r = (IconFontView) inflate.findViewById(R.id.close_title);
        this.f155638s = (IconFontView) inflate.findViewById(R.id.close_title_arrow);
        this.f155623d = inflate.findViewById(R.id.start_interpretation);
        this.f155624e = inflate.findViewById(R.id.stop_interpretation);
        this.f155625f = inflate.findViewById(R.id.interpretation_save_changes);
        this.f155626g = (ViewGroup) inflate.findViewById(R.id.interpretation_operation_container);
        this.f155639t = (TextView) inflate.findViewById(R.id.title);
        m242091g();
        mo214518a(this.f155627h);
        m242089e();
        return inflate;
    }

    /* renamed from: g */
    private void m242091g() {
        this.f155636q.setOnClickListener(this);
        this.f155637r.setOnClickListener(this);
        this.f155638s.setOnClickListener(this);
        C61969f fVar = new C61969f(this.f155633n, this.f155620a, this.f155634o, this.f155629j, this.f155640u);
        this.f155621b = fVar;
        this.f155635p.setAdapter((ListAdapter) fVar);
        this.f155635p.setOnScrollListener(this);
        this.f155621b.mo214535a(new C61969f.AbstractC61974b() {
            /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e.C619685 */

            @Override // com.ss.android.vc.meeting.module.interpretation.C61969f.AbstractC61974b
            /* renamed from: a */
            public void mo214530a(int i) {
                View$OnClickListenerC61963e eVar = View$OnClickListenerC61963e.this;
                eVar.f155628i = eVar.mo214522d();
                if (View$OnClickListenerC61963e.this.f155629j.booleanValue() && !View$OnClickListenerC61963e.this.f155631l.booleanValue()) {
                    if (View$OnClickListenerC61963e.this.f155628i.size() != 0) {
                        View$OnClickListenerC61963e.this.f155628i.remove(i);
                    }
                    View$OnClickListenerC61963e.this.f155621b.mo214537a(View$OnClickListenerC61963e.this.f155628i);
                } else if (View$OnClickListenerC61963e.this.f155628i.size() != 0) {
                    if (View$OnClickListenerC61963e.this.f155628i.get(i) != null && View$OnClickListenerC61963e.this.f155628i.get(i).f152501a == null) {
                        View$OnClickListenerC61963e.this.f155627h.remove(i);
                    } else if (!(View$OnClickListenerC61963e.this.f155628i.get(i) == null || View$OnClickListenerC61963e.this.f155628i.get(i).f152501a == null || View$OnClickListenerC61963e.this.f155628i.get(i).f152502b == null || i >= View$OnClickListenerC61963e.this.f155627h.size())) {
                        View$OnClickListenerC61963e.this.f155627h.get(i).f152503c = true;
                    }
                    View$OnClickListenerC61963e.this.f155621b.mo214537a(View$OnClickListenerC61963e.this.f155627h);
                }
            }
        });
        if (this.f155629j.booleanValue()) {
            this.f155627h.clear();
            ArrayList arrayList = new ArrayList(this.f155620a.mo212091I().mo212494b().mo212612q());
            this.f155627h = arrayList;
            if (arrayList.size() == 0) {
                this.f155631l = false;
                this.f155627h.add(0, new C60940j(null, null, false));
            } else {
                this.f155631l = true;
                this.f155632m.mo214505c(this.f155627h);
            }
            C61969f f = m242090f();
            this.f155621b = f;
            f.mo214537a(this.f155627h);
            this.f155628i = m242087c(this.f155627h);
            return;
        }
        m242092h();
    }

    /* renamed from: b */
    public void mo214520b() {
        this.f155627h.clear();
        this.f155634o.dismiss();
        this.f155620a.mo212105W().mo212845x().mo214444b(m242090f());
        this.f155620a.mo212091I().mo212494b().mo212597b(this);
        this.f155620a.mo212105W().mo212845x().mo214443b((Participant) null);
        this.f155620a.mo212105W().mo212845x().mo214438a(null, false);
        this.f155620a.mo212105W().mo212845x().mo214440a((C61957c) null);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public void bD_() {
        if (this.f155630k.booleanValue()) {
            m242092h();
            return;
        }
        this.f155641v.clear();
        ArrayList arrayList = new ArrayList(this.f155620a.mo212091I().mo212494b().mo212612q());
        this.f155641v = arrayList;
        this.f155632m.mo214505c(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < this.f155641v.size(); i++) {
            arrayList2.add(ParticipantUtil.m248726b(this.f155641v.get(i).f152501a));
        }
        for (int i2 = 0; i2 < this.f155627h.size(); i2++) {
            arrayList3.add(ParticipantUtil.m248726b(this.f155627h.get(i2).f152501a));
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < this.f155627h.size(); i3++) {
            if (!(arrayList2.contains(ParticipantUtil.m248726b(this.f155627h.get(i3).f152501a)) || this.f155627h.get(i3).f152502b == null || this.f155627h.get(i3).f152502b.confirmStatus == InterpreterSetting.ConfirmStatus.RESERVE)) {
                arrayList4.add(Integer.valueOf(i3));
            }
        }
        List<C60940j> arrayList5 = new ArrayList<>();
        for (int i4 = 0; i4 < this.f155627h.size(); i4++) {
            if (!arrayList4.contains(Integer.valueOf(i4))) {
                arrayList5.add(this.f155627h.get(i4));
            }
        }
        for (int i5 = 0; i5 < this.f155641v.size(); i5++) {
            if (!arrayList3.contains(ParticipantUtil.m248726b(this.f155641v.get(i5).f152501a)) && !this.f155641v.get(i5).f152503c) {
                arrayList5.add(0, this.f155641v.get(i5));
            }
        }
        C61969f f = m242090f();
        this.f155621b = f;
        f.mo214537a(arrayList5);
        this.f155628i = m242087c(arrayList5);
    }

    /* renamed from: d */
    private boolean m242088d(List<C60940j> list) {
        List<C60940j> c = m242087c(list);
        this.f155628i = c;
        if (c.size() == 0 || !this.f155632m.mo214504b(this.f155628i)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private List<C60940j> m242087c(List<C60940j> list) {
        this.f155628i.clear();
        if (list != null && !list.isEmpty()) {
            for (C60940j jVar : list) {
                if (!jVar.f152503c) {
                    this.f155628i.add(jVar);
                }
            }
        }
        return this.f155628i;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.close_title || view.getId() == R.id.close_title_arrow) {
            mo214520b();
        }
        if (view.getId() == R.id.interpreter_add_bar) {
            m242093i();
        }
    }

    /* renamed from: b */
    public List<C60940j> mo214519b(List<C60940j> list) {
        List<C60940j> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f152503c) {
                arrayList2.add(list.get(i));
            } else if (!list.get(i).f152503c) {
                arrayList.add(list.get(i));
            }
        }
        if (arrayList2.isEmpty()) {
            return list;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (m242086a((C60940j) arrayList2.get(i2), arrayList)) {
                arrayList3.add(arrayList2.get(i2));
                if (arrayList2.isEmpty()) {
                    return arrayList;
                }
            }
        }
        arrayList2.removeAll(arrayList3);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public void mo214517a(AbstractC61222a aVar) {
        this.f155622c = aVar;
    }

    /* renamed from: a */
    public void mo214518a(final List<C60940j> list) {
        Boolean bool;
        if (this.f155629j.booleanValue()) {
            if (this.f155631l.booleanValue()) {
                this.f155630k = Boolean.valueOf(this.f155632m.mo214502a(list));
            }
            this.f155623d.setVisibility(0);
            this.f155626g.setVisibility(8);
            this.f155639t.setText(UIHelper.mustacheFormat((int) R.string.View_G_Interpretation));
            this.f155637r.setVisibility(0);
            this.f155638s.setVisibility(8);
            if (!m242088d(list)) {
                this.f155623d.setEnabled(false);
                return;
            }
            this.f155623d.setEnabled(true);
            this.f155623d.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e.View$OnClickListenerC619652 */

                public void onClick(View view) {
                    C60700b.m235851b("InterpretationManageViewHolder", "[onClick]", "[startInterpretation]");
                    C63742at.m250078b(View$OnClickListenerC61963e.this.f155620a.mo212056e(), "start_interpretation");
                    VcBizService.sendManageRequest(View$OnClickListenerC61963e.this.f155620a.mo212055d(), HostManageRequest.Action.SET_INTERPRETATION_ACTION, true, View$OnClickListenerC61963e.this.mo214519b(list));
                    View$OnClickListenerC61963e.this.mo214520b();
                    MeetingInterpretationEvent.m249814a(View$OnClickListenerC61963e.this.f155620a, "start_interpretation");
                }
            });
            return;
        }
        this.f155630k = Boolean.valueOf(this.f155632m.mo214502a(list));
        this.f155623d.setVisibility(8);
        this.f155626g.setVisibility(0);
        this.f155639t.setText(UIHelper.mustacheFormat((int) R.string.View_G_ManageInterpreters));
        this.f155637r.setVisibility(8);
        this.f155638s.setVisibility(0);
        if (!m242088d(list) || (bool = this.f155630k) == null || bool.booleanValue()) {
            this.f155625f.setEnabled(false);
        } else {
            this.f155625f.setEnabled(true);
            this.f155625f.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e.View$OnClickListenerC619663 */

                public void onClick(View view) {
                    C60700b.m235851b("InterpretationManageViewHolder", "[onClick2]", "[saveChanges]");
                    VcBizService.sendManageRequest(View$OnClickListenerC61963e.this.f155620a.mo212055d(), HostManageRequest.Action.SET_INTERPRETATION_ACTION, true, View$OnClickListenerC61963e.this.mo214519b(list));
                    View$OnClickListenerC61963e.this.mo214520b();
                    if (View$OnClickListenerC61963e.this.f155622c != null) {
                        View$OnClickListenerC61963e.this.f155622c.dismiss();
                    }
                }
            });
        }
        this.f155624e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61963e.View$OnClickListenerC619674 */

            public void onClick(View view) {
                C60700b.m235851b("InterpretationManageViewHolder", "[onClick3]", "[stopInterpretation]");
                VcBizService.sendManageRequest(View$OnClickListenerC61963e.this.f155620a.mo212055d(), HostManageRequest.Action.SET_INTERPRETATION_ACTION, false, View$OnClickListenerC61963e.this.mo214519b(list));
                View$OnClickListenerC61963e.this.mo214520b();
            }
        });
    }

    /* renamed from: a */
    private boolean m242086a(C60940j jVar, List<C60940j> list) {
        if (!(jVar == null || jVar.f152501a == null)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).f152501a != null && ParticipantUtil.m248711a(list.get(i).f152501a, jVar.f152501a)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212620a(Participant participant, Participant participant2) {
        if (participant2 != null && !participant2.is_host()) {
            mo214520b();
        }
    }

    public View$OnClickListenerC61963e(Activity activity, C61303k kVar, AbstractC61222a aVar, Boolean bool) {
        this.f155633n = activity;
        this.f155620a = kVar;
        this.f155634o = aVar;
        this.f155629j = bool;
        this.f155632m = new C61957c();
        this.f155620a.mo212105W().mo212845x().mo214440a(this.f155632m);
    }
}
