package com.bytedance.ee.bear.bitable.card.view.cell.text;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bitable.card.view.cell.text.MentionTitleResult;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.text.d */
public class C4688d implements Function<MentionTitleResult, C7827a> {

    /* renamed from: a */
    private Context f13826a;

    /* renamed from: b */
    private BearUrl f13827b;

    /* renamed from: a */
    public C7827a apply(MentionTitleResult mentionTitleResult) {
        if (this.f13827b == null || mentionTitleResult == null || mentionTitleResult.data == null) {
            return new C7827a();
        }
        MentionTitleResult.MentionData mentionData = (MentionTitleResult.MentionData) mentionTitleResult.data;
        int b = C10599b.m43903b(C8275a.m34055d(this.f13827b.f17446a));
        String str = this.f13827b.f17447b;
        String str2 = mentionData.title;
        if (TextUtils.isEmpty(str2)) {
            str2 = m19430a(this.f13826a, mentionData.type);
        }
        return new C7827a(str2, new C4517a[]{new C4517a.C4518a().mo17391a(0).mo17395b(str2.length()).mo17398c(b).mo17392a(str).mo17396b(mentionData.url).mo17399c(str2).mo17403e(mentionData.icon_type).mo17407h(mentionData.icon_key).mo17406g(mentionData.icon_fsunit).mo17394a()}, new C7838i[0]);
    }

    public C4688d(Context context, BearUrl bearUrl) {
        this.f13826a = context;
        this.f13827b = bearUrl;
    }

    /* renamed from: a */
    public static String m19430a(Context context, int i) {
        if (context == null) {
            C13479a.m54764b("MentionTitleFunction", "context is null");
            return "";
        } else if (i == C8275a.f22371d.mo32555b()) {
            return context.getResources().getString(R.string.Doc_Contract_UntitledDocument);
        } else {
            if (i == C8275a.f22372e.mo32555b()) {
                return context.getResources().getString(R.string.Doc_Contract_UntitledSheet);
            }
            if (i == C8275a.f22373f.mo32555b()) {
                return context.getResources().getString(R.string.Doc_Contract_UntitledBitable);
            }
            if (i == C8275a.f22374g.mo32555b()) {
                return context.getResources().getString(R.string.Doc_Contract_UntitledMindnote);
            }
            if (i == C8275a.f22375h.mo32555b()) {
                return context.getResources().getString(R.string.Doc_Contract_UntitledFile);
            }
            if (i == C8275a.f22376i.mo32555b()) {
                return context.getResources().getString(R.string.Doc_Contract_UntitledSlide);
            }
            return context.getResources().getString(R.string.Doc_Contract_UntitledDocument);
        }
    }
}
