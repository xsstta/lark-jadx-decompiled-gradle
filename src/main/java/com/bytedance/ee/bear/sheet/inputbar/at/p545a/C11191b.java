package com.bytedance.ee.bear.sheet.inputbar.at.p545a;

import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.HyperLinkSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.MentionSegment;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.a.b */
public class C11191b implements Function<List<BaseSegment>, C11190a> {
    /* renamed from: a */
    public C11190a apply(List<BaseSegment> list) throws Exception {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BaseSegment baseSegment : list) {
            int length = sb.length();
            String text = baseSegment.getText();
            if (text == null) {
                text = "";
            }
            sb.append(text);
            int length2 = text.length() + length;
            if (baseSegment instanceof MentionSegment) {
                C4517a a = m46503a((MentionSegment) baseSegment, length, length2);
                arrayList.add(a);
                hashMap.put(a, baseSegment);
            } else if (baseSegment instanceof HyperLinkSegment) {
                C7838i a2 = m46504a((HyperLinkSegment) baseSegment, length, length2);
                arrayList2.add(a2);
                hashMap.put(a2, baseSegment);
            }
        }
        return new C11190a(sb.toString(), (C4517a[]) arrayList.toArray(new C4517a[arrayList.size()]), (C7838i[]) arrayList2.toArray(new C7838i[arrayList2.size()]), list, hashMap);
    }

    /* renamed from: a */
    private C7838i m46504a(HyperLinkSegment hyperLinkSegment, int i, int i2) {
        return new C7838i(i, i2, hyperLinkSegment.getText());
    }

    /* renamed from: a */
    private C4517a m46503a(MentionSegment mentionSegment, int i, int i2) {
        MentionSegment.SuiteIcon icon = mentionSegment.getIcon();
        C4517a.C4518a c = new C4517a.C4518a().mo17391a(i).mo17395b(i2).mo17398c(mentionSegment.getMentionType()).mo17392a(mentionSegment.getToken()).mo17396b(mentionSegment.getLink()).mo17399c(mentionSegment.getText()).mo17402d(mentionSegment.getName()).mo17404e(mentionSegment.getEn_name()).mo17400c(mentionSegment.isIs_external());
        if (icon != null) {
            c.mo17403e(icon.getType()).mo17407h(icon.getKey()).mo17406g(icon.getFsUnit());
        }
        return c.mo17394a();
    }
}
