package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;

/* renamed from: com.larksuite.component.ui.dialog.g */
public class C25639g<T extends C25639g> {

    /* renamed from: c */
    public static final SparseIntArray f62581c;

    /* renamed from: a */
    private CharSequence f62582a;

    /* renamed from: b */
    public Context f62583b;

    /* renamed from: d */
    protected boolean f62584d;

    /* renamed from: e */
    protected boolean f62585e = true;

    /* renamed from: f */
    protected boolean f62586f = true;

    /* renamed from: g */
    protected boolean f62587g = true;

    /* renamed from: h */
    protected int f62588h;

    /* renamed from: i */
    private int f62589i;

    /* renamed from: j */
    private UDBaseDialogBuilder f62590j;

    /* renamed from: k */
    private UDDialogController f62591k;

    /* renamed from: com.larksuite.component.ui.dialog.g$b */
    public static abstract class AbstractC25641b<T extends DialogC25637f> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo89273a(T t) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo89274b(T t) {
        }
    }

    /* renamed from: e */
    public T mo89211e(int i) {
        return this;
    }

    /* renamed from: a */
    public void mo89232a(UDDialogController uDDialogController) {
        this.f62591k = uDDialogController;
    }

    /* renamed from: c */
    public DialogC25637f mo89239c() {
        DialogC25637f b = mo89233b();
        b.show();
        return b;
    }

    /* renamed from: d */
    public ILKUIGlobalDialog mo89244d() {
        LKUIGlobalDialog iVar = new LKUIGlobalDialog(this);
        iVar.mo89275a(this.f62583b);
        return iVar;
    }

    /* renamed from: b */
    public DialogC25637f mo89233b() {
        DialogC25637f fVar;
        if (this.f62588h == 0) {
            fVar = new DialogC25637f(this.f62583b);
        } else {
            fVar = new DialogC25637f(this.f62583b, this.f62588h);
        }
        this.f62591k.apply(this.f62590j, fVar);
        return fVar;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f62581c = sparseIntArray;
        sparseIntArray.put(R.id.lkui_dialog_title_tv, R.id.ud_dialog_title_tv);
        sparseIntArray.put(R.id.lkui_dialog_content_message_tv, R.id.ud_dialog_content_message_tv);
        sparseIntArray.put(R.id.lkui_dialog_list_rv, R.id.ud_action_panel_list_rv);
        sparseIntArray.put(R.id.lkui_dialog_btn_left, R.id.ud_dialog_btn_secondary);
        sparseIntArray.put(R.id.lkui_dialog_btn_right, R.id.ud_dialog_btn_primary);
        sparseIntArray.put(R.id.lkui_dialog_btn_center, R.id.ud_dialog_btn_primary);
        sparseIntArray.put(R.id.lkui_dialog_content_item_tv, R.id.ud_dialog_content_item_tv);
        sparseIntArray.put(R.id.lkui_dialog_btn_cancel, R.id.ud_dialog_btn_cancel);
    }

    /* renamed from: com.larksuite.component.ui.dialog.g$a */
    public static class C25640a {

        /* renamed from: a */
        int f62592a;

        /* renamed from: b */
        int f62593b;

        /* renamed from: c */
        CharSequence f62594c;

        /* renamed from: d */
        int f62595d;

        /* renamed from: e */
        int f62596e;

        /* renamed from: f */
        int f62597f;

        /* renamed from: g */
        int f62598g;

        /* renamed from: h */
        int f62599h;

        /* renamed from: i */
        DialogInterface.OnClickListener f62600i;

        /* renamed from: a */
        public C25640a mo89266a(int i) {
            this.f62592a = i;
            return this;
        }

        /* renamed from: b */
        public C25640a mo89269b(int i) {
            this.f62593b = i;
            return this;
        }

        /* renamed from: c */
        public C25640a mo89270c(int i) {
            this.f62595d = i;
            return this;
        }

        /* renamed from: d */
        public C25640a mo89271d(int i) {
            this.f62596e = i;
            return this;
        }

        /* renamed from: e */
        public C25640a mo89272e(int i) {
            this.f62597f = i;
            return this;
        }

        /* renamed from: a */
        public C25640a mo89267a(DialogInterface.OnClickListener onClickListener) {
            this.f62600i = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C25640a mo89268a(CharSequence charSequence) {
            this.f62594c = charSequence;
            return this;
        }
    }

    /* renamed from: a */
    public void mo89231a(UDBaseDialogBuilder uDBaseDialogBuilder) {
        this.f62590j = uDBaseDialogBuilder;
    }

    /* renamed from: f */
    public static int m91766f(int i) {
        return f62581c.get(i);
    }

    /* renamed from: a */
    public T mo89222a(float f) {
        this.f62590j.width(f);
        return this;
    }

    /* renamed from: d */
    public T mo89246d(boolean z) {
        this.f62590j.cancelable(z);
        return this;
    }

    /* renamed from: e */
    public T mo89247e(boolean z) {
        this.f62590j.cancelOnTouchOutside(z);
        return this;
    }

    /* renamed from: h */
    public T mo89249h(int i) {
        this.f62590j.titleSize(i);
        return this;
    }

    /* renamed from: i */
    public T mo89250i(int i) {
        this.f62590j.titleColor(i);
        return this;
    }

    /* renamed from: j */
    public T mo89251j(int i) {
        this.f62590j.titleLineCount(i);
        return this;
    }

    /* renamed from: k */
    public T mo89252k(int i) {
        this.f62590j.titleGravity(i);
        return this;
    }

    /* renamed from: l */
    public T mo89253l(int i) {
        this.f62590j.messageGravity(i);
        return this;
    }

    /* renamed from: m */
    public T mo89254m(int i) {
        this.f62590j.message(i);
        return this;
    }

    /* renamed from: n */
    public T mo89255n(int i) {
        this.f62590j.messageTextSize(i);
        return this;
    }

    /* renamed from: o */
    public T mo89256o(int i) {
        this.f62590j.messageTextColor(i);
        return this;
    }

    /* renamed from: s */
    public T mo89260s(int i) {
        this.f62590j.rootLayoutRes(i);
        return this;
    }

    /* renamed from: t */
    public T mo89261t(int i) {
        this.f62590j.marginInDp(i);
        return this;
    }

    /* renamed from: u */
    public T mo89262u(int i) {
        this.f62590j.translationOnY(i);
        return this;
    }

    /* renamed from: v */
    public T mo89263v(int i) {
        this.f62590j.backgroundColor(i);
        return this;
    }

    /* renamed from: w */
    public T mo89264w(int i) {
        this.f62590j.backgroundResource(i);
        return this;
    }

    /* renamed from: x */
    public T mo89265x(int i) {
        this.f62590j.style(i);
        this.f62588h = i;
        return this;
    }

    /* renamed from: b */
    public T mo89236b(View view) {
        this.f62590j.contentLayout(view);
        this.f62586f = false;
        return this;
    }

    /* renamed from: c */
    public T mo89240c(float f) {
        this.f62590j.maxHeight(f);
        return this;
    }

    /* renamed from: g */
    public T mo89248g(int i) {
        this.f62590j.title(i);
        this.f62582a = this.f62583b.getString(i);
        return this;
    }

    /* renamed from: q */
    public T mo89258q(int i) {
        this.f62590j.contentLayoutRes(i);
        this.f62586f = false;
        return this;
    }

    /* renamed from: r */
    public T mo89259r(int i) {
        this.f62590j.footerLayoutRes(i);
        this.f62587g = false;
        return this;
    }

    public C25639g(Context context) {
        this.f62583b = context;
        mo89231a(new UDDialogBuilder(context));
        mo89232a(new LKUIDialogControllerCompat(this.f62583b));
    }

    /* renamed from: c */
    public T mo89241c(View view) {
        this.f62590j.footerLayout(view);
        this.f62587g = false;
        return this;
    }

    /* renamed from: d */
    public T mo89245d(float f) {
        this.f62584d = true;
        this.f62590j.maskAlpha(f);
        return this;
    }

    /* renamed from: p */
    public T mo89257p(int i) {
        this.f62590j.gravity(i);
        if (i == 80 && this.f62589i == 0 && DialogC25637f.m91763a()) {
            this.f62590j.animStyle(R.style.LKUI_BottomDialogAnimForDesktop);
        }
        return this;
    }

    /* renamed from: b */
    public T mo89234b(float f) {
        this.f62590j.height(f);
        if (f == 1.0f) {
            this.f62590j.height(-1.0f);
            if (this.f62588h == 0) {
                this.f62588h = 2131886506;
            }
        }
        return this;
    }

    /* renamed from: c */
    public T mo89242c(CharSequence charSequence) {
        UDBaseDialogBuilder uDBaseDialogBuilder = this.f62590j;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        uDBaseDialogBuilder.message(charSequence);
        return this;
    }

    /* renamed from: a */
    public T mo89226a(DialogInterface.OnCancelListener onCancelListener) {
        this.f62590j.onCancelListener(onCancelListener);
        return this;
    }

    /* renamed from: b */
    public T mo89237b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f62590j.title("");
            this.f62582a = "";
        } else {
            this.f62590j.title(charSequence);
            this.f62582a = charSequence;
        }
        return this;
    }

    /* renamed from: c */
    public T mo89243c(boolean z) {
        this.f62590j.autoDismiss(z);
        return this;
    }

    /* renamed from: a */
    public T mo89227a(DialogInterface.OnDismissListener onDismissListener) {
        this.f62590j.onDismissListener(onDismissListener);
        return this;
    }

    /* renamed from: b */
    public T mo89238b(boolean z) {
        this.f62590j.titleBold(z);
        return this;
    }

    /* renamed from: a */
    public T mo89228a(View view) {
        this.f62590j.headerLayout(view);
        this.f62585e = false;
        return this;
    }

    /* renamed from: a */
    public T mo89229a(C25640a aVar) {
        UDBaseDialogBuilder.ActionBuilder aVar2 = new UDBaseDialogBuilder.ActionBuilder();
        aVar2.mo90702a(f62581c.get(aVar.f62592a, aVar.f62592a));
        aVar2.mo90706b(aVar.f62593b);
        aVar2.mo90704a(aVar.f62594c);
        aVar2.mo90707c(aVar.f62595d);
        aVar2.mo90710d(aVar.f62596e);
        aVar2.mo90712e(aVar.f62597f);
        aVar2.mo90714f(aVar.f62598g);
        aVar2.mo90716g(aVar.f62599h);
        aVar2.mo90703a(aVar.f62600i);
        this.f62590j.addActionButton(aVar2);
        return this;
    }

    /* renamed from: a */
    public T mo89230a(AbstractC25641b bVar) {
        if (bVar == null) {
            this.f62590j.lifecycleCallback(null);
        } else {
            this.f62590j.lifecycleCallback(new LifecycleCallbackWrapper(bVar));
        }
        return this;
    }

    /* renamed from: a */
    public T mo89224a(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.f62584d = true;
        this.f62590j.addActionButton(f62581c.get(i, i), i2, onClickListener);
        return this;
    }

    /* renamed from: a */
    public T mo89225a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f62584d = true;
        this.f62590j.addActionButton(f62581c.get(i, i), charSequence, onClickListener);
        return this;
    }

    /* renamed from: b */
    public T mo89235b(int i, int i2, int i3, int i4) {
        this.f62590j.messagePadding(i, i2, i3, i4);
        return this;
    }

    /* renamed from: a */
    public T mo89223a(int i, int i2, int i3, int i4) {
        this.f62590j.titlePadding(i, i2, i3, i4);
        return this;
    }
}
