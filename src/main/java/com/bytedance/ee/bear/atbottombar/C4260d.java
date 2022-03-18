package com.bytedance.ee.bear.atbottombar;

import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.atfinder.MentionModel;
import com.bytedance.ee.bear.bean.MentionPanelType;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.atbottombar.d */
public class C4260d {

    /* renamed from: a */
    public int f12816a;

    /* renamed from: b */
    public String f12817b;

    /* renamed from: c */
    public List<String> f12818c;

    /* renamed from: d */
    private MentionPanelType f12819d;

    /* renamed from: e */
    private AbstractC4271f f12820e;

    /* renamed from: f */
    private AbstractC4272g f12821f;

    public C4260d() {
    }

    /* renamed from: a */
    public List<String> mo16725a() {
        return this.f12818c;
    }

    /* renamed from: b */
    public AbstractC4272g mo16728b() {
        return this.f12821f;
    }

    /* renamed from: c */
    public AbstractC4271f mo16729c() {
        return this.f12820e;
    }

    /* renamed from: d */
    public MentionPanelType mo16730d() {
        return this.f12819d;
    }

    /* renamed from: a */
    public void mo16727a(AbstractC4272g gVar) {
        this.f12821f = gVar;
    }

    /* renamed from: a */
    public void mo16726a(MentionModel mentionModel) {
        mo16729c().mo16667a(mentionModel, C10599b.m43900a(mo16725a()), new AbstractC4272g() {
            /* class com.bytedance.ee.bear.atbottombar.C4260d.C42611 */

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
            /* renamed from: a */
            public void mo16696a() {
                if (C4260d.this.mo16728b() != null) {
                    C4260d.this.mo16728b().mo16696a();
                } else {
                    C13479a.m54764b("CardData", "onSearchStart(): getSearchCallback() == null");
                }
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
            /* renamed from: a */
            public void mo16697a(AtFinderResult atFinderResult) {
                if (C4260d.this.mo16728b() != null) {
                    C4260d.this.mo16728b().mo16697a(atFinderResult);
                } else {
                    C13479a.m54764b("CardData", "onSearchResult(): getSearchCallback() == null");
                }
            }
        });
    }

    public C4260d(int i, String str, List<String> list, AbstractC4271f fVar) {
        this.f12816a = i;
        this.f12817b = str;
        this.f12818c = list;
        this.f12820e = fVar;
    }

    public C4260d(int i, String str, List<String> list, MentionPanelType mentionPanelType, AbstractC4271f fVar) {
        this.f12816a = i;
        this.f12817b = str;
        this.f12818c = list;
        this.f12820e = fVar;
        this.f12819d = mentionPanelType;
    }
}
