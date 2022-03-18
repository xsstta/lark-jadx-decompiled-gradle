package com.bytedance.ee.bear.sheet.inputbar.at;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p519p.C10468i;
import com.bytedance.ee.bear.sheet.inputbar.at.p545a.C11191b;
import com.bytedance.ee.bear.sheet.inputbar.at.p545a.C11192c;
import com.bytedance.ee.bear.sheet.inputbar.at.p545a.C11193d;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11201e;
import com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11203g;
import com.bytedance.ee.bear.sheet.inputbar.at.paste.C11210a;
import com.bytedance.ee.bear.sheet.inputbar.at.paste.MentionTitleResult;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.MentionSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widget.C11768b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.c */
public class C11207c extends C11768b implements AbstractC11189a, AtEditText.AbstractC11758b {

    /* renamed from: a */
    private final C11195b f30134a = new C11195b(this.f31649b, this.f30136f);

    /* renamed from: e */
    private final C11192c f30135e = new C11192c((TextView) mo30187g(), this.f30136f);

    /* renamed from: f */
    private SegmentStyle f30136f;

    /* renamed from: g */
    private final NetService f30137g = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: h */
    private Disposable f30138h;

    /* renamed from: e */
    public C11195b mo42831e() {
        return this.f30134a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18345c() {
        Disposable disposable = this.f30138h;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: d */
    public Single<List<BaseSegment>> mo42830d() {
        return Single.just(new C7835g((SpannableStringBuilder) ((AtEditText) mo30187g()).getText())).map(new C11193d());
    }

    /* renamed from: a */
    public void mo42826a(SegmentStyle segmentStyle) {
        this.f30136f = segmentStyle;
        this.f30134a.mo42786a(segmentStyle);
        this.f30135e.mo42781a(segmentStyle);
    }

    public C11207c(AtEditText atEditText) {
        super(atEditText);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.widget.C11768b
    /* renamed from: a */
    public void mo42825a(C7835g gVar) {
        super.mo42825a(gVar);
        Editable editableText = ((AtEditText) mo30187g()).getEditableText();
        int length = editableText.length();
        if (((C11195b[]) editableText.getSpans(0, length, C11195b.class)).length == 0) {
            editableText.setSpan(mo42831e(), 0, length, 18);
        }
    }

    /* renamed from: a */
    public void mo42828a(List<BaseSegment> list) {
        AbstractC68307f.m265083a((Object) list).mo238020d(new C11191b()).mo238020d(this.f30135e).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.sheet.inputbar.at.$$Lambda$AMo8OXK_i0Gz418HHypgW8TTrM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11207c.this.mo42825a((C7835g) obj);
            }
        }, $$Lambda$c$bOnQbAQubPqCtTnJT6PVh2hP0zE.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.widget.AtEditText.AbstractC11758b
    /* renamed from: a */
    public boolean mo18343a(final String str) {
        if (C6313i.m25327a().mo25392c(str)) {
            BearUrl g = C6313i.m25327a().mo25399g(str);
            NetService.C5077f fVar = new NetService.C5077f("api/meta/");
            fVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(C8275a.m34051b(g.f17446a)));
            fVar.mo20145a("token", g.f17447b);
            this.f30138h = this.f30137g.mo20118a(MentionTitleResult.class).mo20141a(fVar).mo238020d(new C11210a((TextView) mo30187g(), g)).mo238020d(new C11192c((TextView) mo30187g(), this.f30136f)).mo238001b(new Consumer<C7835g>() {
                /* class com.bytedance.ee.bear.sheet.inputbar.at.C11207c.C112081 */

                /* renamed from: a */
                public void accept(C7835g gVar) {
                    C11207c.this.mo42827a(str, gVar.f21147a);
                }
            }, new Consumer<Throwable>() {
                /* class com.bytedance.ee.bear.sheet.inputbar.at.C11207c.C112092 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C13479a.m54759a("SheetAtEditTextPresente", "onPaste，error: ", th);
                }
            });
        }
        return ((AtEditText) mo30187g()).mo44995f();
    }

    /* renamed from: a */
    public void mo42827a(String str, CharSequence charSequence) {
        Editable text = this.f31650c.getText();
        int indexOf = text.toString().indexOf(str);
        text.replace(indexOf, str.length() + indexOf, charSequence);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018 A[SYNTHETIC, Splitter:B:6:0x0018] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle m46595a(android.text.Spannable r3, int r4) {
        /*
            r2 = this;
            if (r4 <= 0) goto L_0x0015
            java.lang.Class<com.bytedance.ee.bear.sheet.inputbar.at.b.j> r0 = com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11206j.class
            java.lang.Object[] r3 = r3.getSpans(r4, r4, r0)
            com.bytedance.ee.bear.sheet.inputbar.at.b.j[] r3 = (com.bytedance.ee.bear.sheet.inputbar.at.p546b.C11206j[]) r3
            int r4 = r3.length
            r0 = 0
            if (r4 <= 0) goto L_0x0015
            r3 = r3[r0]
            com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle r3 = r3.mo42792a()
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0025
            com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle r3 = r3.clone()     // Catch:{ CloneNotSupportedException -> 0x001d }
            goto L_0x0025
        L_0x001d:
            r4 = move-exception
            java.lang.String r0 = "SheetAtEditTextPresente"
            java.lang.String r1 = "getAdjacentStyle, clone fail"
            com.bytedance.ee.log.C13479a.m54759a(r0, r1, r4)
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.inputbar.at.C11207c.m46595a(android.text.Spannable, int):com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.widget.C11768b
    /* renamed from: a */
    public C10463c mo42824a(Spannable spannable, C4517a aVar, Context context) {
        C11201e eVar = new C11201e(context, aVar.f13215d, aVar.f13214c, aVar.f13216e, aVar.f13224m, aVar.f13223l, aVar.f13222k);
        MentionSegment mentionSegment = new MentionSegment();
        mentionSegment.setText(aVar.f13217f);
        mentionSegment.setLink(aVar.f13216e);
        if (aVar.f13224m > 0) {
            mentionSegment.setIcon(new MentionSegment.SuiteIcon(aVar.f13223l, aVar.f13224m, aVar.f13222k));
        }
        mentionSegment.setToken(aVar.f13215d);
        mentionSegment.setMentionType(aVar.f13214c);
        mentionSegment.setStyle(m46595a(spannable, aVar.f13212a));
        eVar.mo42806a(mentionSegment);
        eVar.mo42807a(this.f30136f);
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.widget.C11768b
    /* renamed from: b */
    public C10468i mo42829b(Spannable spannable, C4517a aVar, Context context) {
        C11203g gVar = new C11203g(context, aVar.f13215d, null, aVar.f13218g, aVar.f13219h, aVar.f13228q);
        MentionSegment mentionSegment = new MentionSegment();
        mentionSegment.setText(aVar.f13217f);
        mentionSegment.setEn_name(aVar.f13219h);
        mentionSegment.setLink(aVar.f13216e);
        mentionSegment.setName(aVar.f13218g);
        mentionSegment.setToken(aVar.f13215d);
        mentionSegment.setStyle(m46595a(spannable, aVar.f13212a));
        mentionSegment.setIs_external(aVar.f13228q);
        gVar.mo42816a(mentionSegment);
        gVar.mo42817a(this.f30136f);
        return gVar;
    }
}
