package com.tt.miniapp.shortcut.p3328a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.PersistableBundle;
import android.text.TextUtils;

/* renamed from: com.tt.miniapp.shortcut.a.b */
public class C66820b {

    /* renamed from: a */
    public Context f168568a;

    /* renamed from: b */
    public String f168569b;

    /* renamed from: c */
    public Intent[] f168570c;

    /* renamed from: d */
    public ComponentName f168571d;

    /* renamed from: e */
    public CharSequence f168572e;

    /* renamed from: f */
    public CharSequence f168573f;

    /* renamed from: g */
    public CharSequence f168574g;

    /* renamed from: h */
    public C66819a f168575h;

    /* renamed from: i */
    public PersistableBundle f168576i;

    private C66820b() {
    }

    /* renamed from: b */
    public CharSequence mo232748b() {
        return this.f168572e;
    }

    /* renamed from: a */
    public ShortcutInfo mo232747a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f168568a, this.f168569b).setShortLabel(this.f168572e).setIntents(this.f168570c);
        C66819a aVar = this.f168575h;
        if (aVar != null) {
            intents.setIcon(aVar.mo232744a());
        }
        if (!TextUtils.isEmpty(this.f168573f)) {
            intents.setLongLabel(this.f168573f);
        }
        if (!TextUtils.isEmpty(this.f168574g)) {
            intents.setDisabledMessage(this.f168574g);
        }
        ComponentName componentName = this.f168571d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        PersistableBundle persistableBundle = this.f168576i;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        return intents.build();
    }

    /* renamed from: com.tt.miniapp.shortcut.a.b$a */
    public static class C66822a {

        /* renamed from: a */
        private final C66820b f168577a;

        /* renamed from: a */
        public C66820b mo232754a() {
            if (TextUtils.isEmpty(this.f168577a.f168572e)) {
                throw new IllegalArgumentException("Shortcut much have a non-empty label");
            } else if (this.f168577a.f168570c != null && this.f168577a.f168570c.length != 0) {
                return this.f168577a;
            } else {
                throw new IllegalArgumentException("Shortcut much have an intent");
            }
        }

        /* renamed from: a */
        public C66822a mo232750a(PersistableBundle persistableBundle) {
            this.f168577a.f168576i = persistableBundle;
            return this;
        }

        /* renamed from: a */
        public C66822a mo232749a(Intent intent) {
            return mo232753a(new Intent[]{intent});
        }

        /* renamed from: a */
        public C66822a mo232751a(C66819a aVar) {
            this.f168577a.f168575h = aVar;
            return this;
        }

        /* renamed from: a */
        public C66822a mo232752a(CharSequence charSequence) {
            this.f168577a.f168572e = charSequence;
            return this;
        }

        /* renamed from: a */
        public C66822a mo232753a(Intent[] intentArr) {
            this.f168577a.f168570c = intentArr;
            return this;
        }

        public C66822a(Context context, String str) {
            C66820b bVar = new C66820b();
            this.f168577a = bVar;
            bVar.f168568a = context;
            bVar.f168569b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Intent mo232746a(Intent intent) {
        Intent[] intentArr = this.f168570c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f168572e.toString());
        C66819a aVar = this.f168575h;
        if (aVar != null) {
            aVar.mo232745a(intent);
        }
        return intent;
    }
}
