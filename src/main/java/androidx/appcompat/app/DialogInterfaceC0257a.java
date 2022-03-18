package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.app.a */
public class DialogInterfaceC0257a extends DialogC0259b implements DialogInterface {

    /* renamed from: a */
    final AlertController f698a = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0258a {

        /* renamed from: a */
        private final AlertController.C0225a f699a;

        /* renamed from: b */
        private final int f700b;

        /* renamed from: a */
        public C0258a mo925a(boolean z) {
            this.f699a.f576r = z;
            return this;
        }

        /* renamed from: a */
        public Context mo916a() {
            return this.f699a.f559a;
        }

        /* renamed from: c */
        public DialogInterfaceC0257a mo930c() {
            DialogInterfaceC0257a b = mo929b();
            b.show();
            return b;
        }

        /* renamed from: b */
        public DialogInterfaceC0257a mo929b() {
            DialogInterfaceC0257a aVar = new DialogInterfaceC0257a(this.f699a.f559a, this.f700b);
            this.f699a.mo748a(aVar.f698a);
            aVar.setCancelable(this.f699a.f576r);
            if (this.f699a.f576r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f699a.f577s);
            aVar.setOnDismissListener(this.f699a.f578t);
            if (this.f699a.f579u != null) {
                aVar.setOnKeyListener(this.f699a.f579u);
            }
            return aVar;
        }

        /* renamed from: b */
        public C0258a mo927b(CharSequence charSequence) {
            this.f699a.f566h = charSequence;
            return this;
        }

        public C0258a(Context context) {
            this(context, DialogInterfaceC0257a.m895a(context, 0));
        }

        /* renamed from: a */
        public C0258a mo917a(DialogInterface.OnCancelListener onCancelListener) {
            this.f699a.f577s = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public C0258a mo926b(View view) {
            this.f699a.f584z = view;
            this.f699a.f583y = 0;
            this.f699a.f547E = false;
            return this;
        }

        /* renamed from: a */
        public C0258a mo918a(DialogInterface.OnKeyListener onKeyListener) {
            this.f699a.f579u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0258a mo919a(Drawable drawable) {
            this.f699a.f562d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0258a mo920a(View view) {
            this.f699a.f565g = view;
            return this;
        }

        /* renamed from: a */
        public C0258a mo923a(CharSequence charSequence) {
            this.f699a.f564f = charSequence;
            return this;
        }

        public C0258a(Context context, int i) {
            this.f699a = new AlertController.C0225a(new ContextThemeWrapper(context, DialogInterfaceC0257a.m895a(context, i)));
            this.f700b = i;
        }

        /* renamed from: b */
        public C0258a mo928b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f699a.f570l = charSequence;
            this.f699a.f572n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0258a mo922a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f699a.f581w = listAdapter;
            this.f699a.f582x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0258a mo924a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f699a.f567i = charSequence;
            this.f699a.f569k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0258a mo921a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.f699a.f581w = listAdapter;
            this.f699a.f582x = onClickListener;
            this.f699a.f551I = i;
            this.f699a.f550H = true;
            return this;
        }
    }

    /* renamed from: a */
    public ListView mo909a() {
        return this.f698a.mo733b();
    }

    /* renamed from: a */
    public Button mo908a(int i) {
        return this.f698a.mo740d(i);
    }

    /* renamed from: b */
    public void mo911b(View view) {
        this.f698a.mo739c(view);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0259b
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f698a.mo726a();
    }

    @Override // androidx.appcompat.app.DialogC0259b, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f698a.mo731a(charSequence);
    }

    /* renamed from: a */
    public void mo910a(View view) {
        this.f698a.mo735b(view);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f698a.mo732a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f698a.mo737b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected DialogInterfaceC0257a(Context context, int i) {
        super(context, m895a(context, i));
    }

    /* renamed from: a */
    static int m895a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }
}
