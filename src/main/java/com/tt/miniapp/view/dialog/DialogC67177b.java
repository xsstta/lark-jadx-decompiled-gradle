package com.tt.miniapp.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Window;
import com.larksuite.suite.R;
import com.tt.miniapp.view.dialog.C67164a;

/* renamed from: com.tt.miniapp.view.dialog.b */
public class DialogC67177b extends Dialog implements DialogInterface {

    /* renamed from: a */
    public C67164a f169466a;

    /* renamed from: com.tt.miniapp.view.dialog.b$a */
    public static class C67178a {

        /* renamed from: a */
        private final C67164a.C67169a f169467a;

        /* renamed from: b */
        private int f169468b;

        /* renamed from: a */
        public DialogC67177b mo233573a() {
            DialogC67177b bVar = new DialogC67177b(this.f169467a.f169427a);
            this.f169467a.mo233557a(bVar.f169466a);
            bVar.setCancelable(this.f169467a.f169441o);
            if (this.f169467a.f169441o) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f169467a.f169442p);
            bVar.setOnDismissListener(this.f169467a.f169443q);
            if (this.f169467a.f169444r != null) {
                bVar.setOnKeyListener(this.f169467a.f169444r);
            }
            return bVar;
        }

        public C67178a(Context context) {
            this(context, R.style.microapp_m_DialogTheme);
        }

        /* renamed from: a */
        public C67178a mo233571a(DialogInterface.OnCancelListener onCancelListener) {
            this.f169467a.f169442p = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public C67178a mo233572a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.f169467a.f169445s = charSequenceArr;
            this.f169467a.f169447u = onClickListener;
            return this;
        }

        public C67178a(Context context, int i) {
            this.f169467a = new C67164a.C67169a(new ContextThemeWrapper(context, i));
            this.f169468b = i;
        }
    }

    protected DialogC67177b(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f169466a.mo233543a(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f169466a.mo233538a();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f169466a.mo233545a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f169466a.mo233549b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected DialogC67177b(Context context, int i) {
        super(context);
        this.f169466a = new C67164a(getContext(), this, getWindow());
    }
}
