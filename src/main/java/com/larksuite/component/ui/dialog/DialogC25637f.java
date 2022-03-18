package com.larksuite.component.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.dialog.UDDialog;

/* renamed from: com.larksuite.component.ui.dialog.f */
public class DialogC25637f extends UDDialog {

    /* renamed from: a */
    private static boolean f62578a;

    /* renamed from: b */
    private View f62579b;

    /* renamed from: c */
    private Activity f62580c;

    /* renamed from: com.larksuite.component.ui.dialog.f$a */
    public interface AbstractC25638a {
        void onClick(DialogC25637f fVar, int i);
    }

    /* renamed from: b */
    public View mo89219b() {
        return this.f62579b;
    }

    /* renamed from: a */
    public static boolean m91763a() {
        return f62578a;
    }

    public void cancel() {
        super.cancel();
        Activity activity = this.f62580c;
        if (activity != null) {
            activity.finish();
            this.f62580c = null;
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog, androidx.appcompat.app.DialogC0259b
    public void dismiss() {
        super.dismiss();
        Activity activity = this.f62580c;
        if (activity != null) {
            activity.finish();
            this.f62580c = null;
        }
    }

    public DialogC25637f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m91762a(boolean z) {
        f62578a = z;
    }

    @Override // androidx.appcompat.app.DialogC0259b, android.app.Dialog
    public void setContentView(View view) {
        this.f62579b = view;
        super.setContentView(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89218a(Activity activity) {
        this.f62580c = activity;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialog, androidx.appcompat.app.DialogC0259b
    public void onCreate(Bundle bundle) {
        getWindow().setSoftInputMode(19);
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.DialogC0259b, android.app.Dialog
    public void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public DialogC25637f(Context context, int i) {
        super(context, i);
    }
}
