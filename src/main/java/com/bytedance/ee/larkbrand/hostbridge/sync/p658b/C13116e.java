package com.bytedance.ee.larkbrand.hostbridge.sync.p658b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.common.data.DataHolder;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.b.e */
public class C13116e implements AbstractC67571b {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_sp_op";
    }

    /* renamed from: a */
    public static SharedPreferences m53699a(Context context) {
        return context.getSharedPreferences("appbrand_file", 0);
    }

    /* renamed from: b */
    private static SharedPreferences.Editor m53701b(Context context) {
        return m53699a(context).edit();
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        boolean d = crossProcessDataEntity.mo234746d("sp_op_is_get");
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        String b = crossProcessDataEntity.mo234744b("sp_value_type");
        String b2 = crossProcessDataEntity.mo234744b("sp_key");
        String b3 = crossProcessDataEntity.mo234744b("sp_value");
        if (applicationContext != null && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
            if (d) {
                return CrossProcessDataEntity.C67574a.m263013a().mo234760a("sp_result", (Object) m53702b(applicationContext, b, b2, b3)).mo234763b();
            }
            m53700a(applicationContext, b, b2, b3);
        }
        return null;
    }

    /* renamed from: a */
    private static void m53700a(Context context, String str, String str2, String str3) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1092271849:
                if (str.equals(DataHolder.TYPE_FLOAT)) {
                    c = 0;
                    break;
                }
                break;
            case -870070237:
                if (str.equals(DataHolder.TYPE_BOOLEAN)) {
                    c = 1;
                    break;
                }
                break;
            case -675993238:
                if (str.equals(DataHolder.TYPE_INT)) {
                    c = 2;
                    break;
                }
                break;
            case 519136353:
                if (str.equals(DataHolder.TYPE_LONG)) {
                    c = 3;
                    break;
                }
                break;
            case 878975158:
                if (str.equals(DataHolder.TYPE_STRING)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m53701b(context).putFloat(str2, Float.parseFloat(str3)).apply();
                return;
            case 1:
                m53701b(context).putBoolean(str2, Boolean.parseBoolean(str3)).apply();
                return;
            case 2:
                m53701b(context).putInt(str2, Integer.parseInt(str3)).apply();
                return;
            case 3:
                m53701b(context).putLong(str2, Long.parseLong(str3)).apply();
                return;
            case 4:
                m53701b(context).putString(str2, str3).apply();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private static String m53702b(Context context, String str, String str2, String str3) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1092271849:
                if (str.equals(DataHolder.TYPE_FLOAT)) {
                    c = 0;
                    break;
                }
                break;
            case -870070237:
                if (str.equals(DataHolder.TYPE_BOOLEAN)) {
                    c = 1;
                    break;
                }
                break;
            case -675993238:
                if (str.equals(DataHolder.TYPE_INT)) {
                    c = 2;
                    break;
                }
                break;
            case 519136353:
                if (str.equals(DataHolder.TYPE_LONG)) {
                    c = 3;
                    break;
                }
                break;
            case 878975158:
                if (str.equals(DataHolder.TYPE_STRING)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return String.valueOf(m53699a(context).getFloat(str2, Float.parseFloat(str3)));
            case 1:
                return String.valueOf(m53699a(context).getBoolean(str2, Boolean.parseBoolean(str3)));
            case 2:
                return String.valueOf(m53699a(context).getInt(str2, Integer.parseInt(str3)));
            case 3:
                return String.valueOf(m53699a(context).getLong(str2, Long.parseLong(str3)));
            case 4:
                return m53699a(context).getString(str2, str3);
            default:
                return null;
        }
    }
}
