package com.ss.android.lark.mm.module.mention;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.mention.C46483a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle;
import com.ss.android.lark.mm.widget.texthighlightbg.MmAnnotationSpan;
import java.util.Vector;
import org.xml.sax.Attributes;

/* renamed from: com.ss.android.lark.mm.module.mention.b */
public class C46485b {

    /* renamed from: a */
    public int f117042a;

    /* renamed from: b */
    public int f117043b;

    /* renamed from: c */
    public String f117044c = "";

    /* renamed from: d */
    private String f117045d = "";

    /* renamed from: e */
    private Vector<String> f117046e = new Vector<>();

    /* renamed from: f */
    private int f117047f = 0;

    /* renamed from: a */
    public Spanned mo163358a(String str) throws NumberFormatException {
        return C46483a.m183845a(str, new C46483a.AbstractC46484a() {
            /* class com.ss.android.lark.mm.module.mention.C46485b.C464861 */

            @Override // com.ss.android.lark.mm.module.mention.C46483a.AbstractC46484a
            /* renamed from: a */
            public boolean mo163357a(boolean z, String str, Editable editable, Attributes attributes) {
                if (str.equals("at")) {
                    boolean z2 = true;
                    if (z) {
                        C46485b.this.f117042a = editable.length();
                        String a = C46483a.m183846a(attributes, "token");
                        C46485b.this.f117044c = a.replace("\\\"", "");
                        if (TextUtils.isEmpty(C46485b.this.f117044c) || !C46485b.this.f117044c.equals(C45899c.m181859a().getLoginDepend().mo144647a())) {
                            z2 = false;
                        }
                        if (z2) {
                            editable.insert(C46485b.this.f117042a, " ");
                        }
                    } else {
                        if (TextUtils.isEmpty(C46485b.this.f117044c) || !C46485b.this.f117044c.equals(C45899c.m181859a().getLoginDepend().mo144647a())) {
                            z2 = false;
                        }
                        if (z2) {
                            editable.insert(editable.length(), " ");
                        }
                        C46485b.this.f117043b = editable.length();
                        if (!TextUtils.isEmpty(C46485b.this.f117044c)) {
                            if (!TextUtils.isEmpty(C46485b.this.f117044c) && C46485b.this.f117044c.equals(C45899c.m181859a().getLoginDepend().mo144647a())) {
                                editable.setSpan(new MmAnnotationSpan("highlightSpan", HighlightStyle.MENTION.getValue() + ""), C46485b.this.f117042a, C46485b.this.f117043b, 33);
                            }
                            editable.setSpan(new C46488d().mo163360a(C46485b.this.f117044c), C46485b.this.f117042a, C46485b.this.f117043b, 33);
                        }
                        C45855f.m181663b("MmHtmlTagFormatter", "startIndex: " + C46485b.this.f117042a + ", stopIndex: " + C46485b.this.f117043b + ", output: " + ((Object) editable));
                        C46485b.this.f117042a = 0;
                        C46485b.this.f117043b = 0;
                        C46485b.this.f117044c = "";
                    }
                }
                return false;
            }
        });
    }
}
