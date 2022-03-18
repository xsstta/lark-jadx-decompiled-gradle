package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import android.text.TextUtils;
import com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.a */
public abstract class AbstractC25946a implements AbstractC25957a {

    /* renamed from: a */
    public static String f64257a = "FieldChecker";

    /* renamed from: b */
    protected Field f64258b;

    /* renamed from: c */
    protected Object f64259c;

    /* renamed from: d */
    protected AbstractC25960a f64260d;

    /* renamed from: e */
    private String f64261e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo92288a();

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: b */
    public String mo92290b() {
        return this.f64261e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo92289a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f64261e = mo92288a();
        }
        Log.m165397w(f64257a, this.f64261e);
    }

    public AbstractC25946a(Field field, Object obj, AbstractC25960a aVar) {
        this.f64258b = field;
        this.f64259c = obj;
        this.f64260d = aVar;
    }
}
