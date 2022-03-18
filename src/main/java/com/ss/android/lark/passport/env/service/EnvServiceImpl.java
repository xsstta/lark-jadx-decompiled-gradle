package com.ss.android.lark.passport.env.service;

import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.applogbridge.util.UriConfigCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.env.p2419a.C49001c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.LarkContext;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ClaymoreImpl(AbstractC49370a.class)
public class EnvServiceImpl implements AbstractC49370a {
    private final List<AbstractC49370a.AbstractC49371a> mLoginEnvChangeListeners = new CopyOnWriteArrayList();

    public String getBoeCnUnit() {
        return "boecn";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public String getBoeVaUnit() {
        return "boeva";
    }

    public String getCnUnit() {
        return "eu_nc";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public String getVaUnit() {
        return "eu_ea";
    }

    public HostEnvBean getAPPHostEnv() {
        return C49001c.m192989d();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public HostEnvBean getHostEnv() {
        return C49001c.m192988c();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public String getUserUnit() {
        return C48998a.f123026a.mo171069d();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public boolean isBuildinEnv() {
        return C49001c.m192990e();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public String getConfigEnv() {
        return C57744a.m224104a().getString("key_passport_config_env");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public String getDefaultConfigEnv() {
        if (isCnEnv()) {
            return "feishu";
        }
        return "lark";
    }

    public boolean isCnBoeConfig() {
        return TextUtils.equals(getUserUnit(), "boecn");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public boolean isCnEnv() {
        return isCnEnv(getUserUnit());
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public boolean isLarkConfig() {
        return "lark".equals(getConfigEnv());
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public boolean isBoeConfig() {
        String userUnit = getUserUnit();
        if (TextUtils.equals(userUnit, "boecn") || TextUtils.equals(userUnit, "boeva")) {
            return true;
        }
        return false;
    }

    public void unregisterLoginEnvChangeListener(AbstractC49370a.AbstractC49371a aVar) {
        this.mLoginEnvChangeListeners.remove(aVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public void saveConfigEnv(String str) {
        C57744a.m224104a().putString("key_passport_config_env", str);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public boolean isCnEnv(String str) {
        if (TextUtils.equals(str, "eu_ea") || TextUtils.equals(str, "boeva")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public void registerLoginEnvChangeListener(AbstractC49370a.AbstractC49371a aVar) {
        if (aVar != null && !this.mLoginEnvChangeListeners.contains(aVar)) {
            Log.m165389i("EnvServiceImpl", "registerLoginEnvChangeListener: " + aVar.getClass().getSimpleName());
            this.mLoginEnvChangeListeners.add(aVar);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public void updateStdLark(String str) {
        boolean z;
        if (TextUtils.equals(str, getBoeVaUnit()) || TextUtils.equals(str, getVaUnit())) {
            z = true;
        } else {
            z = false;
        }
        C48998a.f123026a.mo171064a(Boolean.valueOf(z));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public String getOppositeUnit(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 93912099:
                if (str.equals("boecn")) {
                    c = 0;
                    break;
                }
                break;
            case 93912675:
                if (str.equals("boeva")) {
                    c = 1;
                    break;
                }
                break;
            case 96855691:
                if (str.equals("eu_ea")) {
                    c = 2;
                    break;
                }
                break;
            case 96855972:
                if (str.equals("eu_nc")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return getBoeVaUnit();
            case 1:
                return getBoeCnUnit();
            case 2:
                return getCnUnit();
            case 3:
                return getVaUnit();
            default:
                Log.m165383e("EnvServiceImpl", "unit is KA unit, No need to deal");
                return "";
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a
    public void onLoginEnvChange(HostEnvBean hostEnvBean, AbstractC49352d<String> dVar) {
        if (C26284k.m95186b(LarkContext.getApplication())) {
            if (TextUtils.equals(hostEnvBean.userUnit, getBoeVaUnit())) {
                UriConfigCreator.m107384a(true);
            } else {
                UriConfigCreator.m107384a(false);
            }
        }
        Log.m165388i("mLoginEnvChangeListeners: " + this.mLoginEnvChangeListeners.size());
        traverseListener(hostEnvBean, this.mLoginEnvChangeListeners.iterator(), dVar);
    }

    public void traverseListener(final HostEnvBean hostEnvBean, final Iterator<AbstractC49370a.AbstractC49371a> it, final AbstractC49352d<String> dVar) {
        if (it != null && it.hasNext()) {
            AbstractC49370a.AbstractC49371a next = it.next();
            boolean z = true;
            if (next.mo102729a()) {
                if (hostEnvBean == null) {
                    z = false;
                }
                next.mo102728a(z, new AbstractC49352d<String>() {
                    /* class com.ss.android.lark.passport.env.service.EnvServiceImpl.C490021 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                    /* renamed from: a */
                    public void mo145178a(NetworkErrorResult networkErrorResult) {
                        AbstractC49352d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo145178a(networkErrorResult);
                        }
                    }

                    /* renamed from: a */
                    public void mo145179a(String str) {
                        EnvServiceImpl.this.traverseListener(hostEnvBean, it, dVar);
                    }
                });
                return;
            }
            if (hostEnvBean == null) {
                z = false;
            }
            next.mo102728a(z, null);
            traverseListener(hostEnvBean, it, dVar);
        } else if (dVar != null) {
            dVar.mo145179a("final success");
        }
    }
}
