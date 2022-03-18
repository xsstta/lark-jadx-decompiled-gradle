package com.bytedance.apm.config;

import com.bytedance.apm.core.AbstractC2909c;
import com.bytedance.apm6.C3144a;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.AbstractC20705b;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import org.json.JSONObject;

public class SlardarConfigManagerImpl implements IConfigManager {
    private C2897h mSlardarConfigFetcher = new C2897h();

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void fetchConfig() {
        this.mSlardarConfigFetcher.mo12511a();
    }

    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.mo12521d();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.mo12519c();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public String queryConfig() {
        return this.mSlardarConfigFetcher.mo12523e();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerResponseConfigListener(AbstractC20705b bVar) {
        C3144a.m13091a(bVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterResponseConfigListener(AbstractC20705b bVar) {
        C3144a.m13093b(bVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject getConfigJSON(String str) {
        return this.mSlardarConfigFetcher.mo12524e(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getLogTypeSwitch(String str) {
        return this.mSlardarConfigFetcher.mo12515a(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getMetricTypeSwitch(String str) {
        return this.mSlardarConfigFetcher.mo12518b(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getServiceSwitch(String str) {
        return this.mSlardarConfigFetcher.mo12520c(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getSwitch(String str) {
        return this.mSlardarConfigFetcher.mo12522d(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerConfigListener(AbstractC20704a aVar) {
        this.mSlardarConfigFetcher.mo12513a(aVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterConfigListener(AbstractC20704a aVar) {
        this.mSlardarConfigFetcher.mo12516b(aVar);
    }

    public void forceUpdateFromRemote(AbstractC2909c cVar, List<String> list) {
        this.mSlardarConfigFetcher.mo12512a(cVar, list);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public int getConfigInt(String str, int i) {
        return this.mSlardarConfigFetcher.mo12510a(str, i);
    }

    public void initParams(boolean z, AbstractC2909c cVar, List<String> list) {
        this.mSlardarConfigFetcher.mo12514a(z, cVar, list);
    }
}
