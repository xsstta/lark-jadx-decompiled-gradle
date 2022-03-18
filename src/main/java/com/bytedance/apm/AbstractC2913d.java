package com.bytedance.apm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.apm.api.AbstractC20698c;
import com.bytedance.services.apm.api.AbstractC20702g;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.d */
public abstract class AbstractC2913d implements C3047b.AbstractC3052b, AbstractC20698c, AbstractC20702g, AbstractC20704a {
    private volatile JSONObject mAllowLogType;
    private volatile JSONObject mAllowService;
    private JSONObject mConfigData;
    private boolean mConfigReady;
    private boolean mIsFront;
    private volatile JSONObject mMetricType;

    public String getTag() {
        return "base";
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g
    public void init(Context context) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g
    public abstract boolean isOnlyMainProcess();

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
        this.mConfigReady = true;
    }

    @Override // com.bytedance.apm.p153n.C3047b.AbstractC3052b
    public void onTimeEvent(long j) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g
    public void start() {
    }

    public void stop() {
    }

    public void destroy() {
        ensureUnregisterForSafety();
    }

    public boolean isConfigReady() {
        return this.mConfigReady;
    }

    /* access modifiers changed from: protected */
    public boolean isFront() {
        return this.mIsFront;
    }

    /* access modifiers changed from: protected */
    public final void registerTimerTask() {
        C3047b.m12756a().mo12883a(this);
    }

    /* access modifiers changed from: protected */
    public final void unregisterTimerTask() {
        C3047b.m12756a().mo12889b(this);
    }

    private void ensureUnregisterForSafety() {
        unregisterAppLifeCycle();
        unregisterConfigService();
        unregisterTimerTask();
    }

    /* access modifiers changed from: protected */
    public final boolean registerAppLifeCycle() {
        IActivityLifeManager iActivityLifeManager = (IActivityLifeManager) C20216d.m73783a(IActivityLifeManager.class);
        if (iActivityLifeManager == null) {
            return false;
        }
        iActivityLifeManager.register(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean registerConfigService() {
        IConfigManager iConfigManager = (IConfigManager) C20216d.m73783a(IConfigManager.class);
        if (iConfigManager == null) {
            return false;
        }
        iConfigManager.registerConfigListener(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean unregisterAppLifeCycle() {
        IActivityLifeManager iActivityLifeManager = (IActivityLifeManager) C20216d.m73783a(IActivityLifeManager.class);
        if (iActivityLifeManager == null) {
            return false;
        }
        iActivityLifeManager.unregister(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean unregisterConfigService() {
        IConfigManager iConfigManager = (IConfigManager) C20216d.m73783a(IConfigManager.class);
        if (iConfigManager == null) {
            return false;
        }
        iConfigManager.unregisterConfigListener(this);
        return true;
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        this.mIsFront = false;
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        this.mIsFront = true;
    }

    public boolean getConfigBool(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.mConfigData) == null) {
            return false;
        }
        return jSONObject.optBoolean(str);
    }

    public JSONObject getConfigJSON(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.mConfigData) == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    public boolean getLogTypeSwitch(String str) {
        if (this.mAllowLogType == null || TextUtils.isEmpty(str) || this.mAllowLogType.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public boolean getMetricTypeSwitch(String str) {
        if (this.mMetricType == null || TextUtils.isEmpty(str) || this.mMetricType.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public boolean getServiceSwitch(String str) {
        if (this.mAllowService == null || TextUtils.isEmpty(str) || this.mAllowService.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    public int getConfigInt(String str, int i) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.mConfigData) == null) {
            return i;
        }
        return jSONObject.optInt(str, i);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        this.mConfigData = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject != null) {
            this.mAllowLogType = optJSONObject.optJSONObject("allow_log_type");
            this.mMetricType = optJSONObject.optJSONObject("allow_metric_type");
            this.mAllowService = optJSONObject.optJSONObject("allow_service_name");
        }
    }
}
