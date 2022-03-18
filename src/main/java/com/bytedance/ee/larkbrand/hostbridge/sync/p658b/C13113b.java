package com.bytedance.ee.larkbrand.hostbridge.sync.p658b;

import android.text.TextUtils;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.b.b */
public class C13113b implements AbstractC67571b {

    /* renamed from: a */
    private AbstractC41371j f34800a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_life_cycle_callback";
    }

    public C13113b(AbstractC41371j jVar) {
        this.f34800a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        m53692a(this.f34800a, crossProcessDataEntity.mo234744b("life_cycle_callback_method"), crossProcessDataEntity.mo234744b("app_id"), crossProcessDataEntity.mo234748e("life_cycle_callback_code"));
        return null;
    }

    /* renamed from: a */
    public static void m53692a(AbstractC41371j jVar, String str, String str2, int i) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -829631932:
                    if (str.equals("METHOD_ON_HIDE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -829304833:
                    if (str.equals("METHOD_ON_SHOW")) {
                        c = 1;
                        break;
                    }
                    break;
                case -27227864:
                    if (str.equals("METHOD_ON_FAILURE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 61697920:
                    if (str.equals("METHOD_ON_START")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1437394684:
                    if (str.equals("METHOD_ON_CANCEL")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1786419151:
                    if (str.equals("METHOD_ON_ENV_READY")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    jVar.mo148747e(str2);
                    return;
                case 1:
                    jVar.mo148746d(str2);
                    return;
                case 2:
                    jVar.mo148741a(str2, i);
                    return;
                case 3:
                    jVar.mo148740a(str2);
                    return;
                case 4:
                    jVar.mo148745c(str2);
                    return;
                case 5:
                    jVar.mo148744b(str2);
                    return;
                default:
                    return;
            }
        }
    }
}
