package com.ss.android.lark.mm.module.mention;

import android.text.Spanned;
import android.widget.TextView;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;

/* renamed from: com.ss.android.lark.mm.module.mention.e */
public class C46489e {
    /* renamed from: a */
    public static Spanned m183852a(String str) {
        try {
            C46485b bVar = new C46485b();
            return bVar.mo163358a("<body>" + str + "</body>");
        } catch (Exception e) {
            C45855f.m181666e("MmMentionTagUtils", "[toMentionSpan] exception: " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m183855a(String str, TextView textView) {
        C45859k.m181685a(new Runnable(m183852a(str), textView, str) {
            /* class com.ss.android.lark.mm.module.mention.$$Lambda$e$Q1qYkpDEKKxOBFcW7D3JAzADps */
            public final /* synthetic */ Spanned f$0;
            public final /* synthetic */ TextView f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C46489e.m183853a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public static void m183854a(TextView textView, String str) {
        C45899c.m181859a().getThreadDepend().mo144599a(new Runnable(str, textView) {
            /* class com.ss.android.lark.mm.module.mention.$$Lambda$e$n4bAWHF3TyIAGs22RroZpASj2h8 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ TextView f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C46489e.m183855a(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m183853a(Spanned spanned, TextView textView, String str) {
        if (spanned != null) {
            textView.setMovementMethod(C46487c.m183850a());
            textView.setText(spanned);
            return;
        }
        textView.setText(str);
    }
}
