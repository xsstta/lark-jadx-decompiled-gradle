package com.ss.android.vc.meeting.module.interpretation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60940j;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61952h;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61955l;
import com.ss.android.vc.meeting.module.interpretation.widget.InterpreterSelectItem;
import com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.f */
public class C61969f extends BaseAdapter implements AbstractC61936b {

    /* renamed from: a */
    public List<C60940j> f155650a = new ArrayList();

    /* renamed from: b */
    public Activity f155651b;

    /* renamed from: c */
    public C61303k f155652c;

    /* renamed from: d */
    public Boolean f155653d;

    /* renamed from: e */
    public List<LanguageType> f155654e;

    /* renamed from: f */
    public List<List<LanguageType>> f155655f = new ArrayList();

    /* renamed from: g */
    AbstractC61975c f155656g;

    /* renamed from: h */
    AbstractC61974b f155657h;

    /* renamed from: i */
    private List<C60940j> f155658i = new ArrayList();

    /* renamed from: j */
    private AbstractC61222a f155659j;

    /* renamed from: k */
    private int f155660k;

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.f$b */
    public interface AbstractC61974b {
        /* renamed from: a */
        void mo214530a(int i);
    }

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.f$c */
    public interface AbstractC61975c {
        /* renamed from: a */
        void mo214526a(List<C60940j> list);
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214452a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214453a(LanguageType languageType) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214454a(LanguageType languageType, LanguageType languageType2) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214455a(Participant participant, Participant participant2) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214457a(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: b */
    public void mo214458b(Participant participant) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: b */
    public void mo214459b(List<LanguageType> list) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: b */
    public void mo214460b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: c */
    public void mo214462c(boolean z) {
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public int mo214531a() {
        return this.f155660k;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo214537a(List<C60940j> list) {
        this.f155658i.clear();
        this.f155650a.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).f152503c) {
                    this.f155650a.add(list.get(i));
                } else if (list.get(i).f152501a != null) {
                    this.f155658i.add(list.get(i));
                }
            }
        }
        this.f155655f.clear();
        LanguageType languageType = null;
        LanguageType languageType2 = null;
        for (int i2 = 0; i2 < this.f155650a.size(); i2++) {
            if (this.f155650a.get(i2).f152502b != null) {
                languageType = this.f155650a.get(i2).f152502b.firstLanguage;
                languageType2 = this.f155650a.get(i2).f152502b.secondLanguage;
            }
            this.f155655f.add(Arrays.asList(languageType2, languageType));
        }
        m242111b();
        notifyDataSetChanged();
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214456a(C61934a aVar) {
        mo214533a(aVar.f155551a, aVar.f155552b);
    }

    /* renamed from: a */
    public void mo214536a(AbstractC61975c cVar) {
        this.f155656g = cVar;
    }

    /* renamed from: a */
    public void mo214535a(AbstractC61974b bVar) {
        this.f155657h = bVar;
    }

    /* renamed from: c */
    private long m242112c() {
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        if (settingDependency != null) {
            return settingDependency.getSyncNtpTimeMillis();
        }
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    private void m242111b() {
        ArrayList arrayList = new ArrayList(this.f155650a);
        arrayList.addAll(this.f155658i);
        AbstractC61975c cVar = this.f155656g;
        if (cVar != null) {
            cVar.mo214526a(arrayList);
        }
    }

    public int getCount() {
        List<C60940j> list = this.f155650a;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.f155650a.size();
    }

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.f$a */
    private class C61973a {

        /* renamed from: a */
        public TextView f155668a;

        /* renamed from: b */
        public LanguageSelectItem f155669b;

        /* renamed from: c */
        public LanguageSelectItem f155670c;

        /* renamed from: d */
        public InterpreterSelectItem f155671d;

        /* renamed from: e */
        public IconFontView f155672e;

        private C61973a() {
            C61969f.this = r1;
        }
    }

    /* renamed from: a */
    public void mo214532a(int i) {
        this.f155660k = i;
    }

    /* renamed from: a */
    private ByteviewUser m242108a(C60940j jVar) {
        if (jVar == null || jVar.f152501a == null) {
            return null;
        }
        return new ByteviewUser(jVar.f152501a.getUserId(), jVar.f152501a.getDeviceId(), jVar.f152501a.getParticipantType());
    }

    /* renamed from: d */
    private ByteviewUser m242113d(Participant participant) {
        if (participant != null) {
            return new ByteviewUser(participant.getId(), participant.getDeviceId(), participant.getParticipantType());
        }
        return null;
    }

    /* renamed from: a */
    private void m242110a(ByteviewUser byteviewUser) {
        C61957c e = this.f155652c.mo212105W().mo212845x().mo214449e();
        if (byteviewUser != null && e.mo214500a(byteviewUser)) {
            C60940j jVar = this.f155650a.get(mo214531a());
            this.f155658i.add(new C60940j(jVar.f152501a, jVar.f152502b, true));
        }
    }

    /* renamed from: b */
    public C60940j getItem(int i) {
        if (this.f155650a.size() <= 0 || i >= this.f155650a.size()) {
            return null;
        }
        return this.f155650a.get(i);
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: c */
    public void mo214461c(Participant participant) {
        ByteviewUser a = m242108a(this.f155652c.mo212105W().mo212845x().mo214449e().f155608b);
        ByteviewUser d = m242113d(participant);
        if (a == null) {
            m242110a((ByteviewUser) null);
        } else if (d == null || !ParticipantUtil.m248711a(a, d)) {
            m242110a(a);
        } else {
            m242110a((ByteviewUser) null);
        }
        mo214534a(participant);
    }

    /* renamed from: a */
    public void mo214534a(Participant participant) {
        ByteviewUser d = m242113d(participant);
        List<C60940j> list = this.f155650a;
        if (list == null || list.size() <= mo214531a() || this.f155650a.get(mo214531a()) == null || this.f155650a.get(mo214531a()).f152502b == null) {
            List<C60940j> list2 = this.f155650a;
            if (list2 != null && list2.size() > mo214531a() && this.f155650a.get(mo214531a()) != null && this.f155650a.get(mo214531a()).f152502b == null) {
                InterpreterSetting interpreterSetting = new InterpreterSetting();
                interpreterSetting.interpreteSetTime = m242112c() / 1000;
                this.f155650a.get(mo214531a()).mo209911a(d);
                this.f155650a.get(mo214531a()).mo209912a(interpreterSetting);
                this.f155650a.get(mo214531a()).f152503c = false;
            }
        } else {
            this.f155650a.get(mo214531a()).mo209911a(d);
            this.f155650a.get(mo214531a()).f152502b.interpreteSetTime = m242112c() / 1000;
            this.f155650a.get(mo214531a()).f152503c = false;
        }
        m242111b();
        notifyDataSetChanged();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242109a(int i, View view) {
        AbstractC61974b bVar = this.f155657h;
        if (bVar != null) {
            bVar.mo214530a(i);
        }
    }

    /* renamed from: a */
    public void mo214533a(LanguageType languageType, boolean z) {
        List<C60940j> list = this.f155650a;
        if (list == null || list.get(mo214531a()) == null || this.f155650a.get(mo214531a()).f152502b != null) {
            List<C60940j> list2 = this.f155650a;
            if (!(list2 == null || list2.get(mo214531a()) == null || this.f155650a.get(mo214531a()).f152502b == null)) {
                if (z) {
                    this.f155650a.get(mo214531a()).f152502b.firstLanguage = languageType;
                } else {
                    this.f155650a.get(mo214531a()).f152502b.secondLanguage = languageType;
                }
                if (z) {
                    this.f155654e.set(1, languageType);
                } else {
                    this.f155654e.set(0, languageType);
                }
            }
        } else {
            if (z) {
                InterpreterSetting interpreterSetting = new InterpreterSetting();
                interpreterSetting.firstLanguage = languageType;
                this.f155650a.get(mo214531a()).mo209912a(interpreterSetting);
            } else {
                InterpreterSetting interpreterSetting2 = new InterpreterSetting();
                interpreterSetting2.secondLanguage = languageType;
                this.f155650a.get(mo214531a()).mo209912a(interpreterSetting2);
            }
            if (z) {
                this.f155654e.set(1, languageType);
            } else {
                this.f155654e.set(0, languageType);
            }
        }
        m242111b();
        notifyDataSetChanged();
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        View view2;
        C61973a aVar;
        final C60940j b = getItem(i);
        if (view == null) {
            aVar = new C61973a();
            view2 = LayoutInflater.from(this.f155651b).inflate(R.layout.dialog_interpreter_list_item, viewGroup, false);
            aVar.f155668a = (TextView) view2.findViewById(R.id.interpreter_number_text);
            aVar.f155669b = (LanguageSelectItem) view2.findViewById(R.id.item_left);
            aVar.f155670c = (LanguageSelectItem) view2.findViewById(R.id.item_right);
            aVar.f155671d = (InterpreterSelectItem) view2.findViewById(R.id.interpreter_select);
            aVar.f155672e = (IconFontView) view2.findViewById(R.id.interpreter_list_item_close);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C61973a) view.getTag();
        }
        aVar.f155668a.setText(UIHelper.mustacheFormat((int) R.string.View_G_InterpreterNumber, "number", String.valueOf(getCount() - i)));
        if (b == null || b.f152502b == null || b.f152502b.firstLanguage == null) {
            aVar.f155669b.setStyle(LanguageSelectItem.Style.NotSelected);
            aVar.f155669b.setLanguage(UIHelper.mustacheFormat((int) R.string.View_G_Language));
        } else {
            aVar.f155669b.setStyle(LanguageSelectItem.Style.Selected);
            aVar.f155669b.setLanguage(b.f152502b.firstLanguage);
        }
        if (b == null || b.f152502b == null || b.f152502b.secondLanguage == null) {
            aVar.f155670c.setStyle(LanguageSelectItem.Style.NotSelected);
            aVar.f155670c.setLanguage(UIHelper.mustacheFormat((int) R.string.View_G_Language));
        } else {
            aVar.f155670c.setStyle(LanguageSelectItem.Style.Selected);
            aVar.f155670c.setLanguage(b.f152502b.secondLanguage);
        }
        if (b.f152501a == null) {
            aVar.f155671d.setStyle(InterpreterSelectItem.Style.Empty);
        } else {
            aVar.f155671d.setStyle(InterpreterSelectItem.Style.Selected);
            aVar.f155671d.setInterpreter(b.f152501a);
        }
        aVar.f155672e.setOnClickListener(new View.OnClickListener(i) {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$f$FsQlr5sa25d_eU2wVSl0r9lm1pI */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61969f.lambda$FsQlr5sa25d_eU2wVSl0r9lm1pI(C61969f.this, this.f$1, view);
            }
        });
        aVar.f155669b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.C61969f.C619701 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (!(C61969f.this.f155655f == null || C61969f.this.f155655f.size() == 0 || i >= C61969f.this.f155655f.size())) {
                    C61969f fVar = C61969f.this;
                    fVar.f155654e = fVar.f155655f.get(i);
                }
                C61955l.m242063a(C61969f.this.f155651b, C61969f.this.f155652c, true, C61969f.this.f155653d, C61969f.this.f155654e).mo211606a();
                C61969f.this.mo214532a(i);
            }
        });
        aVar.f155670c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.C61969f.C619712 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (!(C61969f.this.f155655f == null || C61969f.this.f155655f.size() == 0 || i >= C61969f.this.f155655f.size())) {
                    C61969f fVar = C61969f.this;
                    fVar.f155654e = fVar.f155655f.get(i);
                }
                C61955l.m242063a(C61969f.this.f155651b, C61969f.this.f155652c, false, C61969f.this.f155653d, C61969f.this.f155654e).mo211606a();
                C61969f.this.mo214532a(i);
            }
        });
        aVar.f155671d.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.C61969f.C619723 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C61952h.m242038a(C61969f.this.f155651b, C61969f.this.f155652c, C61969f.this.f155653d).mo211606a();
                C61969f.this.mo214532a(i);
                C61969f.this.f155652c.mo212105W().mo212845x().mo214449e().f155608b = b;
            }
        });
        return view2;
    }

    public C61969f(Activity activity, C61303k kVar, AbstractC61222a aVar, Boolean bool, List<LanguageType> list) {
        this.f155651b = activity;
        this.f155652c = kVar;
        this.f155659j = aVar;
        this.f155653d = bool;
        this.f155654e = list;
        kVar.mo212105W().mo212845x().mo214439a(this);
    }
}
