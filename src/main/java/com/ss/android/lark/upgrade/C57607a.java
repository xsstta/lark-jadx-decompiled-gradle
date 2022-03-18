package com.ss.android.lark.upgrade;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ay;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.upgrade.impl.C57642b;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.setting.about.AboutLauncher;
import com.ss.android.lark.upgrade.setting.about.p2899a.C57668a;
import com.ss.android.lark.upgrade.setting.p2898a.C57664a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.upgrade.a */
public class C57607a {

    /* renamed from: a */
    private static volatile AbstractC57608a f141978a;

    /* renamed from: a */
    public static AbstractC57608a m223662a() {
        return f141978a;
    }

    /* renamed from: c */
    public void mo195608c() {
        C57642b.m223804a().mo195733e();
    }

    /* renamed from: b */
    public void mo195606b() {
        C57642b.m223804a().mo195713a((IGetDataCallback<Boolean>) null);
    }

    /* renamed from: d */
    public boolean mo195609d() {
        return C57642b.m223804a().mo195731c();
    }

    /* renamed from: e */
    public boolean mo195610e() {
        return C57642b.m223804a().mo195732d();
    }

    public C57607a(AbstractC57608a aVar) {
        f141978a = aVar;
    }

    /* renamed from: a */
    public void mo195602a(Context context) {
        AboutLauncher.f142147a.mo195791a(context);
    }

    /* renamed from: b */
    public void mo195607b(az azVar) {
        C57642b.m223804a().mo195727b(azVar);
    }

    /* renamed from: a */
    public void mo195604a(az azVar) {
        C57642b.m223804a().mo195714a(azVar);
    }

    /* renamed from: b */
    public List<AbstractC54125a> mo195605b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C57668a(context));
        arrayList.add(new C57664a(context));
        return arrayList;
    }

    /* renamed from: a */
    public void mo195603a(Context context, ay ayVar) {
        C57642b.m223804a().mo195712a(context, ayVar);
    }
}
