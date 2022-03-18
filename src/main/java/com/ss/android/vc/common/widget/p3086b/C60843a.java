package com.ss.android.vc.common.widget.p3086b;

import android.content.Context;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.checkboxdialog.LKUICheckBoxDialogController;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;

/* renamed from: com.ss.android.vc.common.widget.b.a */
public class C60843a extends C25639g<C60843a> {

    /* renamed from: a */
    protected CharSequence f152274a;

    /* renamed from: i */
    protected MsgWithUrlInfo f152275i;

    /* renamed from: j */
    protected Context f152276j;

    /* renamed from: k */
    protected boolean f152277k;

    /* renamed from: l */
    protected String f152278l = "";

    /* renamed from: m */
    protected int f152279m = -1;

    /* renamed from: n */
    protected int f152280n = -1;

    /* renamed from: o */
    protected int f152281o = -1;

    /* renamed from: p */
    protected int f152282p = -1;

    /* renamed from: q */
    protected int f152283q = -1;

    /* renamed from: r */
    public final C60844a f152284r;

    /* renamed from: com.ss.android.vc.common.widget.b.a$a */
    public static class C60844a extends UDBaseDialogBuilder<C60844a> {

        /* renamed from: a */
        protected CharSequence f152285a;

        /* renamed from: b */
        protected MsgWithUrlInfo f152286b;

        /* renamed from: c */
        protected Context f152287c;

        /* renamed from: d */
        protected UDCheckBox.OnCheckedChangeListener f152288d;

        /* renamed from: e */
        protected boolean f152289e;

        /* renamed from: f */
        protected LKUICheckBoxDialogController.OnCheckedListener f152290f;

        /* renamed from: g */
        protected boolean f152291g;

        /* renamed from: h */
        protected String f152292h = "";

        /* renamed from: i */
        protected int f152293i = -1;

        /* renamed from: j */
        protected int f152294j = -1;

        /* renamed from: k */
        protected int f152295k = -1;

        /* renamed from: l */
        protected int f152296l = -1;

        /* renamed from: m */
        protected int f152297m = -1;

        /* renamed from: a */
        public final C60844a mo208640a(MsgWithUrlInfo bVar) {
            this.f152286b = bVar;
            return this;
        }

        /* renamed from: a */
        public final C60844a mo208641a(CharSequence charSequence) {
            this.f152285a = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C60844a mo208642a(String str) {
            this.f152292h = str;
            return this;
        }

        /* renamed from: a */
        public final C60844a mo208643a(boolean z) {
            this.f152289e = z;
            return this;
        }

        public C60844a(Context context) {
            super(context);
            this.f152287c = context;
            controller(new LKUICheckBoxDialogController(context));
            style(R.style.VcLarkUIDialog);
            marginInDp(36);
        }
    }

    /* renamed from: a */
    public final C60843a mo208636a(MsgWithUrlInfo bVar) {
        this.f152275i = bVar;
        this.f152284r.mo208640a(bVar);
        return this;
    }

    /* renamed from: a */
    public final C60843a mo208637a(CharSequence charSequence) {
        this.f152274a = charSequence;
        this.f152284r.mo208641a(charSequence);
        return this;
    }

    /* renamed from: a */
    public final C60843a mo208638a(String str) {
        this.f152278l = str;
        this.f152284r.mo208642a(str);
        return this;
    }

    public C60843a(Context context) {
        super(context);
        this.f152276j = context;
        C60844a aVar = new C60844a(context);
        this.f152284r = aVar;
        mo89231a(aVar);
        mo89232a(new LKUICheckBoxDialogController(context));
        mo89265x(R.style.VcLarkUIDialog);
        mo89261t(36);
        this.f62586f = true;
    }

    /* renamed from: a */
    public final C60843a mo208639a(boolean z) {
        this.f152277k = z;
        this.f152284r.mo208643a(z);
        return this;
    }
}
