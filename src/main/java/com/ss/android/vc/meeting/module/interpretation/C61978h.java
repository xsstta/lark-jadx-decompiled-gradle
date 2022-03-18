package com.ss.android.vc.meeting.module.interpretation;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.C61978h;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a;
import com.ss.android.vc.meeting.module.interpretation.widget.LanguageLabel;
import com.ss.android.vc.service.VideoChatManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.h */
public class C61978h extends BaseAdapter {

    /* renamed from: a */
    public List<LanguageType> f155693a = new ArrayList();

    /* renamed from: b */
    private C61303k f155694b;

    /* renamed from: c */
    private Activity f155695c;

    /* renamed from: d */
    private AbstractC61222a f155696d;

    /* renamed from: e */
    private Boolean f155697e;

    /* renamed from: f */
    private List<LanguageType> f155698f;

    /* renamed from: g */
    private Boolean f155699g;

    /* renamed from: h */
    private List<LanguageType> f155700h;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f155693a.size();
    }

    /* renamed from: a */
    public void mo214551a() {
        this.f155693a.clear();
        C61303k kVar = this.f155694b;
        if (!(kVar == null || kVar.mo212056e() == null || this.f155694b.mo212056e().getVideoChatSettings() == null)) {
            this.f155698f = VideoChatManager.m249444a().mo220132j().getMeetingSupportInterpretationLanguage();
        }
        List<LanguageType> list = this.f155698f;
        if (list != null && !list.isEmpty()) {
            for (LanguageType languageType : this.f155698f) {
                this.f155693a.add(languageType);
            }
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.h$a */
    public class C61980a {

        /* renamed from: a */
        public LineHeightTextView f155701a;

        /* renamed from: b */
        public LanguageLabel f155702b;

        /* renamed from: c */
        public IconFontView f155703c;

        /* renamed from: d */
        public RelativeLayout f155704d;

        private C61980a() {
        }
    }

    /* renamed from: a */
    public LanguageType getItem(int i) {
        if (this.f155693a.size() <= 0 || i >= this.f155693a.size()) {
            return null;
        }
        return this.f155693a.get(i);
    }

    /* renamed from: a */
    public void mo214552a(List<LanguageType> list) {
        this.f155693a.clear();
        if (list != null && !list.isEmpty()) {
            for (LanguageType languageType : list) {
                this.f155693a.add(languageType);
            }
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242152a(C61980a aVar, LanguageType languageType, View view) {
        if (aVar.f155703c.getVisibility() == 4) {
            aVar.f155703c.setVisibility(0);
            if (this.f155697e.booleanValue()) {
                this.f155694b.mo212105W().mo212845x().mo214438a(languageType, true);
            }
            if (!this.f155697e.booleanValue()) {
                this.f155694b.mo212105W().mo212845x().mo214438a(languageType, false);
            }
            this.f155696d.dismiss();
            return;
        }
        aVar.f155703c.setVisibility(4);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C61980a aVar;
        List<LanguageType> list;
        List<LanguageType> list2;
        if (view == null) {
            aVar = new C61980a();
            view2 = LayoutInflater.from(this.f155695c).inflate(R.layout.dialog_language_search_item, viewGroup, false);
            aVar.f155701a = (LineHeightTextView) view2.findViewById(R.id.txt_language);
            aVar.f155702b = (LanguageLabel) view2.findViewById(R.id.txt_label);
            aVar.f155703c = (IconFontView) view2.findViewById(R.id.select_view);
            aVar.f155704d = (RelativeLayout) view2.findViewById(R.id.list_item);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C61980a) view.getTag();
        }
        LanguageType languageType = this.f155693a.get(i);
        C61958a.m242072a(languageType, aVar.f155701a);
        aVar.f155702b.setLanguage(languageType.iconStr);
        if ((this.f155697e.booleanValue() || (list2 = this.f155700h) == null || list2.get(1) == null || !TextUtils.equals(this.f155700h.get(1).languageType, languageType.languageType)) && (!this.f155697e.booleanValue() || (list = this.f155700h) == null || list.get(0) == null || !TextUtils.equals(this.f155700h.get(0).languageType, languageType.languageType))) {
            aVar.f155701a.setTextColor(C60773o.m236117a(this.f155695c, R.color.text_title, 1.0f));
            aVar.f155702b.setLanguageBackgroundColor(C60773o.m236126d(R.color.icon_n3));
            aVar.f155702b.setTextColor(C60773o.m236126d(R.color.static_white));
            aVar.f155704d.setEnabled(true);
            aVar.f155704d.setOnClickListener(new View.OnClickListener(aVar, languageType) {
                /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$h$kptBoRRbowDxHGP9SRKZOL5asHY */
                public final /* synthetic */ C61978h.C61980a f$1;
                public final /* synthetic */ LanguageType f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C61978h.this.m242152a(this.f$1, this.f$2, view);
                }
            });
        } else {
            aVar.f155704d.setEnabled(false);
            aVar.f155701a.setTextColor(C60773o.m236126d(R.color.text_disable));
            aVar.f155702b.setLanguageBackgroundColor(C60773o.m236126d(R.color.icon_disable));
            aVar.f155702b.setTextColor(C60773o.m236126d(R.color.udtoken_btn_pri_text_disabled));
        }
        return view2;
    }

    public C61978h(Activity activity, C61303k kVar, AbstractC61222a aVar, Boolean bool, Boolean bool2, List<LanguageType> list) {
        this.f155695c = activity;
        this.f155694b = kVar;
        this.f155696d = aVar;
        this.f155697e = bool;
        this.f155699g = bool2;
        this.f155700h = list;
    }
}
