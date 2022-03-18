package com.ss.android.lark.mail.impl.settings.subsetting.signature.parse;

import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.message.template.AbstractC43088y;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.b */
public class C43600b extends AbstractC43599a<List<MailEntSignature>> {

    /* renamed from: a */
    private String f110629a;

    /* renamed from: b */
    private boolean f110630b;

    /* renamed from: a */
    private String m173059a() {
        if (this.f110629a == null) {
            this.f110629a = mo155602a("signature_list_item");
        }
        return this.f110629a;
    }

    public C43600b(boolean z) {
        this.f110630b = z;
    }

    /* renamed from: a */
    public String mo155606a(final List<MailEntSignature> list) {
        final int size = list.size();
        if (size == 1) {
            return mo155604a(list.get(0), size, size);
        }
        ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < size; i++) {
            FutureTask futureTask = new FutureTask(new Callable<String>() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43600b.CallableC436011 */

                /* renamed from: a */
                public String call() throws Exception {
                    return C43600b.this.mo155604a((MailEntSignature) list.get(i), i + 1, size);
                }
            });
            CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask);
            arrayList.add(futureTask);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                sb.append((String) ((FutureTask) arrayList.get(i2)).get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo155604a(final MailEntSignature mailEntSignature, final int i, final int i2) {
        StringBuilder sb = new StringBuilder();
        mo155603a(sb, m173059a(), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43600b.C436022 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43600b.this.mo155605a(str, mailEntSignature, i, i2);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo155605a(String str, MailEntSignature mailEntSignature, int i, int i2) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1471119870:
                if (str.equals("signature_id")) {
                    c = 0;
                    break;
                }
                break;
            case -1133304407:
                if (str.equals("signature_type_name")) {
                    c = 1;
                    break;
                }
                break;
            case -767502765:
                if (str.equals("signature_type_style")) {
                    c = 2;
                    break;
                }
                break;
            case -425403239:
                if (str.equals("signature_apply_style")) {
                    c = 3;
                    break;
                }
                break;
            case -346276878:
                if (str.equals("signature_content")) {
                    c = 4;
                    break;
                }
                break;
            case -275336175:
                if (str.equals("signature_title")) {
                    c = 5;
                    break;
                }
                break;
            case 963966995:
                if (str.equals("signature_force_apply")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mailEntSignature.mo151380a();
            case 1:
                return C43819s.m173684a((int) R.string.Mail_BusinessSignature_Business);
            case 2:
                if (mailEntSignature.mo151394f() != MailEntSignature.SignatureType.CORPORATE) {
                    return "hidden";
                }
                break;
            case 3:
                if (!mailEntSignature.mo151395g()) {
                    return "hidden";
                }
                break;
            case 4:
                return mailEntSignature.mo151388c();
            case 5:
                return mailEntSignature.mo151386b();
            case 6:
                if (!this.f110630b || mailEntSignature.mo151395g()) {
                    return "";
                }
                return "disabled";
        }
        return "";
    }
}
