package com.bytedance.ee.bear.sheet.inputbar.at.paste;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.sheet.inputbar.at.p545a.C11190a;
import com.bytedance.ee.bear.sheet.inputbar.at.paste.MentionTitleResult;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.MentionSegment;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.paste.a */
public class C11210a implements Function<MentionTitleResult, C11190a> {

    /* renamed from: a */
    private final Context f30142a;

    /* renamed from: b */
    private final BearUrl f30143b;

    /* renamed from: c */
    private TextView f30144c;

    /* renamed from: a */
    private MentionSegment m46609a(C4517a aVar) {
        MentionSegment mentionSegment = new MentionSegment();
        mentionSegment.setText(aVar.f13217f);
        mentionSegment.setLink(aVar.f13216e);
        if (aVar.f13224m > 0) {
            mentionSegment.setIcon(new MentionSegment.SuiteIcon(aVar.f13223l, aVar.f13224m, aVar.f13222k));
        }
        mentionSegment.setToken(aVar.f13215d);
        mentionSegment.setMentionType(aVar.f13214c);
        return mentionSegment;
    }

    /* renamed from: a */
    public C11190a apply(MentionTitleResult mentionTitleResult) {
        if (this.f30143b == null || mentionTitleResult.data == null) {
            return new C11190a();
        }
        MentionTitleResult.MentionData mentionData = (MentionTitleResult.MentionData) mentionTitleResult.data;
        int b = C10599b.m43903b(C8275a.m34055d(this.f30143b.f17446a));
        String str = this.f30143b.f17447b;
        String str2 = mentionData.title;
        if (TextUtils.isEmpty(str2)) {
            str2 = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31517c(this.f30142a, mentionData.type);
        }
        C4517a a = new C4517a.C4518a().mo17391a(0).mo17395b(str2.length()).mo17398c(b).mo17392a(str).mo17396b(mentionData.url).mo17399c(str2).mo17403e(mentionData.icon_type).mo17407h(mentionData.icon_key).mo17406g(mentionData.icon_fsunit).mo17394a();
        MentionSegment a2 = m46609a(a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        HashMap hashMap = new HashMap();
        hashMap.put(a, a2);
        return new C11190a(str2, new C4517a[]{a}, new C7838i[0], arrayList, hashMap);
    }

    public C11210a(TextView textView, BearUrl bearUrl) {
        this.f30142a = textView.getContext();
        this.f30144c = textView;
        this.f30143b = bearUrl;
    }
}
