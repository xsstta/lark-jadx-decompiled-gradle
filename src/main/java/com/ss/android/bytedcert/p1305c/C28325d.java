package com.ss.android.bytedcert.p1305c;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0259b;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.bytedcert.c.d */
public class C28325d implements AbstractC28322b {

    /* renamed from: a */
    private DialogC28327f f71169a;

    /* renamed from: b */
    private WeakReference<Activity> f71170b;

    /* renamed from: c */
    private String f71171c;

    /* renamed from: c */
    public DialogC0259b mo100925c() {
        return this.f71169a;
    }

    @Override // com.ss.android.bytedcert.p1305c.AbstractC28322b
    /* renamed from: b */
    public void mo100922b() {
        DialogC28327f fVar;
        try {
            WeakReference<Activity> weakReference = this.f71170b;
            if (weakReference == null) {
                return;
            }
            if (weakReference.get() != null) {
                Activity activity = this.f71170b.get();
                if (activity != null && !activity.isFinishing() && (fVar = this.f71169a) != null && fVar.isShowing()) {
                    this.f71169a.dismiss();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.bytedcert.p1305c.AbstractC28322b
    /* renamed from: a */
    public void mo100921a() {
        TextView textView;
        try {
            WeakReference<Activity> weakReference = this.f71170b;
            if (weakReference == null) {
                return;
            }
            if (weakReference.get() != null) {
                Activity activity = this.f71170b.get();
                if (this.f71169a == null) {
                    this.f71169a = new DialogC28327f(activity, R.style.byted_loading_dialog_style);
                }
                this.f71169a.setCanceledOnTouchOutside(false);
                this.f71169a.setCancelable(true);
                Window window = this.f71169a.getWindow();
                if (window != null) {
                    window.setGravity(17);
                    window.setBackgroundDrawableResource(R.color.byted_transparent);
                }
                View inflate = LayoutInflater.from(activity).inflate(R.layout.byted_loading_dialog, (ViewGroup) null);
                if (!(TextUtils.isEmpty(this.f71171c) || inflate == null || (textView = (TextView) inflate.findViewById(R.id.loading_dialog_text)) == null)) {
                    textView.setText(this.f71171c);
                }
                this.f71169a.setContentView(inflate);
                this.f71169a.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C28325d m103926a(Activity activity, String str) {
        return new C28325d(activity, str);
    }

    public C28325d(Activity activity, String str) {
        if (activity != null) {
            this.f71170b = new WeakReference<>(activity);
        }
        this.f71171c = str;
    }
}
