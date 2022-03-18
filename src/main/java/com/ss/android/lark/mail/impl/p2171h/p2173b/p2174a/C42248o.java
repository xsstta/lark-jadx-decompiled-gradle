package com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a;

/* renamed from: com.ss.android.lark.mail.impl.h.b.a.o */
public class C42248o extends AbstractC42235a {

    /* renamed from: c */
    private static String[] f107564c = {"start", "key_chain_capacity_limit", "key_chain_invalid_recipients", "key_chain_restrict_outbound", "key_chain_recipients_limited", "key_chain_uploading", "key_chain_upload_failed", "key_chain_translate_attachment", "key_chain_fetch_content", "key_chain_doc_link", "key_chain_exceed_size", "key_chain_harmful_file", "key_chain_large_file", "key_chain_title_missing", "key_chain_end", "key_finish"};

    /* renamed from: d */
    private boolean f107565d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: a */
    public String mo152338a() {
        return "SendMailDetailMonitor";
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: b */
    public String[] mo152341b() {
        return f107564c;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: c */
    public void mo152342c() {
        super.mo152342c();
        mo152339a("start");
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: e */
    public void mo152344e() {
        mo152339a("key_finish");
        super.mo152344e();
    }

    public C42248o(boolean z) {
        this.f107565d = z;
    }
}
