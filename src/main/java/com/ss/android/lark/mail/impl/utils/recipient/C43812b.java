package com.ss.android.lark.mail.impl.utils.recipient;

import android.content.Context;
import android.text.TextUtils;
import androidx.loader.content.AbstractC1195a;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchResponse;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchResult;
import com.ss.android.lark.mail.impl.entity.ContactSearchType;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.utils.recipient.b */
public class C43812b extends AbstractC1195a<RecipientResult> {

    /* renamed from: f */
    private final String f111156f;

    /* renamed from: g */
    private int f111157g;

    /* renamed from: h */
    private long f111158h = -1;

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: i */
    public void mo6116i() {
        mo6130s();
    }

    /* renamed from: C */
    private RecipientResult m173656C() {
        return new RecipientResult(true, this.f111156f, this.f111157g, new ArrayList(), false, RecipientSearchType.CONTACTS);
    }

    /* renamed from: h */
    public RecipientResult mo6101d() {
        if (this.f111157g != 0) {
            return m173656C();
        }
        C43849u.m173826a(new Runnable(m173655B()) {
            /* class com.ss.android.lark.mail.impl.utils.recipient.$$Lambda$b$WW5oTvlCLu7EdjyQ54c1wss7C6E */
            public final /* synthetic */ RecipientResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C43812b.this.m173657b((C43812b) this.f$1);
            }
        });
        return m173656C();
    }

    /* renamed from: B */
    private RecipientResult m173655B() {
        RecipientSearchType recipientSearchType;
        String str;
        MailContactSearchResponse a = C42176e.m168344a().mo152189a(this.f111156f, 0, 20, String.valueOf(this.f111158h));
        ArrayList arrayList = new ArrayList();
        if (a == null || a.results == null) {
            return new RecipientResult(false, this.f111156f, this.f111157g, new ArrayList(), false, RecipientSearchType.GROUP);
        }
        for (MailContactSearchResult mailContactSearchResult : a.results) {
            if (TextUtils.isEmpty(mailContactSearchResult.avatar_key) || mailContactSearchResult.avatar_urls.size() <= 0) {
                str = "";
            } else {
                str = mailContactSearchResult.avatar_urls.get(0);
            }
            SearchAddress.C43799a aVar = new SearchAddress.C43799a();
            aVar.mo151209a(mailContactSearchResult.title).mo151212b(mailContactSearchResult.email).mo151213c(mailContactSearchResult.lark_id).mo151215e(str);
            if (mailContactSearchResult.type != null) {
                aVar.mo156035a(ContactSearchType.fromValue(mailContactSearchResult.type.getValue()));
            }
            if (mailContactSearchResult.tenant_id != null) {
                aVar.mo151216f(mailContactSearchResult.tenant_id);
            }
            aVar.mo151217g(mailContactSearchResult.display_name);
            aVar.mo156041h(mailContactSearchResult.subtitle);
            aVar.mo156037a(mailContactSearchResult.title_hit_terms);
            aVar.mo156039b(mailContactSearchResult.email_hit_terms);
            aVar.mo156036a(mailContactSearchResult.chat_group_members_count);
            if (!TextUtils.isEmpty(aVar.f106776c) || ContactSearchType.EXTERNAL_CONTACT != aVar.f111125m) {
                aVar.mo151214d(mailContactSearchResult.avatar_key);
            }
            arrayList.add(aVar.mo151210a());
        }
        String str2 = this.f111156f;
        int size = arrayList.size();
        if (a.from_local.booleanValue()) {
            recipientSearchType = RecipientSearchType.GROUP_LOCAL;
        } else {
            recipientSearchType = RecipientSearchType.GROUP;
        }
        return new RecipientResult(true, str2, size, arrayList, false, recipientSearchType);
    }

    /* renamed from: a */
    public void mo6112b(RecipientResult cVar) {
        if (mo6125n()) {
            super.mo6112b((Object) cVar);
        }
    }

    public C43812b(Context context, String str, int i, long j) {
        super(context);
        this.f111156f = str;
        this.f111157g = i;
        if (j >= 0 || TextUtils.isEmpty(str)) {
            this.f111158h = j;
        } else {
            this.f111158h = System.currentTimeMillis();
        }
    }
}
