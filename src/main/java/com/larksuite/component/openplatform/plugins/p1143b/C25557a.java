package com.larksuite.component.openplatform.plugins.p1143b;

import android.text.TextUtils;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.larksuite.component.openplatform.plugins.config.C25573b;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.component.openplatform.plugins.p1142a.C25552a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.plugins.b.a */
public class C25557a implements AbstractC25556c {

    /* renamed from: a */
    private List<LKPluginConfig> f62185a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    private boolean m91238a(AbstractC25904o oVar) {
        if (oVar == null) {
            Log.m165383e("OPPluginProviderImpl", "plugin manager is null");
            return true;
        } else if (!this.f62185a.isEmpty()) {
            return false;
        } else {
            Log.m165389i("OPPluginProviderImpl", "no add plugin config, pluginConfigs is empty!");
            return true;
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c
    /* renamed from: a */
    public void mo88698a(LKPluginConfig lKPluginConfig) {
        if (lKPluginConfig == null || lKPluginConfig.configInvalid()) {
            Log.m165383e("OPPluginProviderImpl", "invalid params!");
        } else {
            this.f62185a.add(lKPluginConfig);
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c
    /* renamed from: a */
    public AbstractC25937e mo88696a(C25552a aVar) {
        if (m91238a(aVar.f62177a)) {
            return null;
        }
        Log.m165389i("OPPluginProviderImpl", "scope:" + aVar.f62180d);
        ArrayList arrayList = new ArrayList();
        for (LKPluginConfig lKPluginConfig : this.f62185a) {
            if ((aVar.f62180d == null || aVar.f62180d == lKPluginConfig.mScope) && (aVar.f62179c == null || aVar.f62179c == lKPluginConfig.mPluginEnv)) {
                Log.m165379d("OPPluginProviderImpl", "load config:" + lKPluginConfig.toString());
                arrayList.add(lKPluginConfig);
            }
        }
        return new C25573b(arrayList, aVar.f62177a, aVar.f62178b);
    }

    @Override // com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c
    /* renamed from: a */
    public List<LKPluginConfig> mo88697a(PluginEnv pluginEnv) {
        ArrayList arrayList = new ArrayList();
        for (LKPluginConfig lKPluginConfig : this.f62185a) {
            if (lKPluginConfig != null && pluginEnv == lKPluginConfig.mPluginEnv) {
                if (TextUtils.isEmpty(lKPluginConfig.mPluginClassName)) {
                    if (lKPluginConfig.mLkPlugin == null) {
                        Log.m165383e("OPPluginProviderImpl", "config invalid, pls check");
                    } else {
                        lKPluginConfig.mPluginClassName = lKPluginConfig.mLkPlugin.getClass().getName();
                    }
                }
                arrayList.add(lKPluginConfig);
            }
        }
        return arrayList;
    }
}
