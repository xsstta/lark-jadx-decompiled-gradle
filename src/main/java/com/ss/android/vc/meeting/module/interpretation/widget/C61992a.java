package com.ss.android.vc.meeting.module.interpretation.widget;

import android.content.Context;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25648u;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.vc.entity.LanguageType;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.a */
public class C61992a extends C25639g<C61992a> {

    /* renamed from: a */
    public LanguageType f155753a;

    /* renamed from: i */
    public LanguageType f155754i;

    /* renamed from: j */
    public String f155755j;

    /* renamed from: k */
    public Boolean f155756k;

    /* renamed from: l */
    public Context f155757l;

    /* renamed from: m */
    private final C61993a f155758m;

    @Override // com.larksuite.component.ui.dialog.C25639g
    /* renamed from: d */
    public ILKUIGlobalDialog mo89244d() {
        this.f155756k = true;
        C25648u uVar = new C25648u(this);
        uVar.mo89295a(this.f155757l);
        return uVar;
    }

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.a$a */
    public static class C61993a extends UDBaseDialogBuilder<C61993a> {

        /* renamed from: a */
        public LanguageType f155759a;

        /* renamed from: b */
        public LanguageType f155760b;

        /* renamed from: c */
        public String f155761c;

        /* renamed from: d */
        public Boolean f155762d;

        /* renamed from: e */
        public Context f155763e;

        /* renamed from: a */
        public C61993a mo214597a(LanguageType languageType) {
            this.f155759a = languageType;
            return this;
        }

        /* renamed from: b */
        public C61993a mo214599b(LanguageType languageType) {
            this.f155760b = languageType;
            return this;
        }

        /* renamed from: a */
        public C61993a mo214598a(String str) {
            this.f155761c = str;
            return this;
        }

        public C61993a(Context context) {
            super(context);
            this.f155763e = context;
            controller(new LKVCInterpretationConfirmDialogController(context));
            style(R.style.VcLarkUIDialog);
            marginInDp(36);
        }
    }

    /* renamed from: a */
    public C61992a mo214594a(LanguageType languageType) {
        this.f155753a = languageType;
        this.f155758m.mo214597a(languageType);
        return this;
    }

    /* renamed from: b */
    public C61992a mo214596b(LanguageType languageType) {
        this.f155754i = languageType;
        this.f155758m.mo214599b(languageType);
        return this;
    }

    /* renamed from: a */
    public C61992a mo214595a(String str) {
        this.f155755j = str;
        this.f155758m.mo214598a(str);
        return this;
    }

    public C61992a(Context context) {
        super(context);
        this.f155757l = context;
        C61993a aVar = new C61993a(context);
        this.f155758m = aVar;
        mo89231a(aVar);
        mo89232a(new LKVCInterpretationConfirmDialogController(context));
        mo89265x(R.style.VcLarkUIDialog);
        mo89261t(36);
        this.f62586f = true;
    }
}
