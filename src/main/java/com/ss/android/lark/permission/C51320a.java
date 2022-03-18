package com.ss.android.lark.permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;

/* renamed from: com.ss.android.lark.permission.a */
public class C51320a {

    /* renamed from: a */
    private AlertDialog f127804a;

    /* renamed from: a */
    public void mo176894a() {
        this.f127804a.show();
    }

    /* renamed from: com.ss.android.lark.permission.a$a */
    public static class C51322a {

        /* renamed from: a */
        private Object f127809a;

        /* renamed from: b */
        private Context f127810b;

        /* renamed from: c */
        private String f127811c;

        /* renamed from: d */
        private String f127812d;

        /* renamed from: e */
        private String f127813e;

        /* renamed from: f */
        private String f127814f;

        /* renamed from: g */
        private DialogInterface.OnClickListener f127815g;

        /* renamed from: h */
        private int f127816h = -1;

        /* renamed from: a */
        public C51320a mo176900a() {
            return new C51320a(this.f127809a, this.f127810b, this.f127811c, this.f127812d, this.f127813e, this.f127814f, this.f127815g, this.f127816h);
        }

        /* renamed from: a */
        public C51322a mo176897a(int i) {
            this.f127816h = i;
            return this;
        }

        /* renamed from: b */
        public C51322a mo176901b(String str) {
            this.f127813e = str;
            return this;
        }

        /* renamed from: a */
        public C51322a mo176898a(String str) {
            this.f127812d = str;
            return this;
        }

        public C51322a(Activity activity, String str) {
            this.f127809a = activity;
            this.f127810b = activity;
            this.f127811c = str;
        }

        /* renamed from: a */
        public C51322a mo176899a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f127814f = str;
            this.f127815g = onClickListener;
            return this;
        }
    }

    /* renamed from: a */
    public void mo176895a(Object obj, Intent intent, int i) {
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, i);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, i);
        } else if (obj instanceof android.app.Fragment) {
            ((android.app.Fragment) obj).startActivityForResult(intent, i);
        }
    }

    private C51320a(final Object obj, final Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, final int i) {
        String str5;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(str);
        builder.setTitle(str2);
        if (TextUtils.isEmpty(str3)) {
            str5 = context.getString(17039370);
        } else {
            str5 = str3;
        }
        str4 = TextUtils.isEmpty(str3) ? context.getString(17039360) : str4;
        i = i <= 0 ? 16061 : i;
        builder.setPositiveButton(str5, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.permission.C51320a.DialogInterface$OnClickListenerC513211 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                C51320a.this.mo176895a(obj, intent, i);
            }
        });
        builder.setNegativeButton(str4, onClickListener);
        this.f127804a = builder.create();
    }
}
