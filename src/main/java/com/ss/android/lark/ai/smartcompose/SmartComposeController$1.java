package com.ss.android.lark.ai.smartcompose;

import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.smartcompose.p1341a.C28580a;
import com.ss.android.lark.ai.smartcompose.p1341a.C28581b;
import com.ss.android.lark.ai.statistics.smartcompose.SmartComposeHitpoint;

/* access modifiers changed from: package-private */
public class SmartComposeController$1 extends ComposeTagSpan {

    /* renamed from: a */
    final /* synthetic */ EditText f71908a;

    /* renamed from: b */
    final /* synthetic */ C28581b f71909b;

    /* renamed from: c */
    final /* synthetic */ C28580a f71910c;

    /* renamed from: d */
    final /* synthetic */ C28585c f71911d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m104806a(EditText editText) {
        editText.setSelection(editText.getText().length());
        editText.setCursorVisible(true);
    }

    @Override // com.ss.android.lark.ai.smartcompose.p1342b.AbstractC28583a
    /* renamed from: a */
    public void mo101617a(TextView textView) {
        C28522a.m104531a().mo101553a().mo101567a("mobile_suite_ai_smart_compose", true);
        this.f71911d.mo101769c();
        this.f71908a.removeTextChangedListener(this.f71911d);
        this.f71908a.getEditableText().append((CharSequence) this.f71909b.f71919a);
        this.f71908a.addTextChangedListener(this.f71911d);
        this.f71908a.setCursorVisible(false);
        EditText editText = this.f71908a;
        editText.postDelayed(new Runnable(editText) {
            /* class com.ss.android.lark.ai.smartcompose.$$Lambda$SmartComposeController$1$jflhkPDxuOYuvx3EfQef40wwujM */
            public final /* synthetic */ EditText f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                SmartComposeController$1.lambda$jflhkPDxuOYuvx3EfQef40wwujM(this.f$0);
            }
        }, 200);
        SmartComposeHitpoint.f71690a.mo101594a(this.f71911d.f71929a, this.f71909b.f71920b, this.f71909b.f71919a.length() - 1, this.f71910c.f71916c, this.f71911d.f71932d.getValue(), this.f71910c.f71915b.intValue(), this.f71911d.f71931c.getValue(), "tab");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SmartComposeController$1(C28585c cVar, int i, EditText editText, C28581b bVar, C28580a aVar) {
        super(i);
        this.f71911d = cVar;
        this.f71908a = editText;
        this.f71909b = bVar;
        this.f71910c = aVar;
    }
}
