package com.ss.android.lark.app.taskv2.preload;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.preload.moment.AbstractC52236a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IdleStateManager implements AbstractC52236a {

    /* renamed from: d */
    private static final Object f72767d = new Object();

    /* renamed from: a */
    public int f72768a;

    /* renamed from: b */
    public int f72769b;

    /* renamed from: c */
    public float f72770c;

    /* renamed from: e */
    private C48246q.AbstractC48247a f72771e = new C48246q.AbstractC48247a() {
        /* class com.ss.android.lark.app.taskv2.preload.IdleStateManager.C290391 */

        @Override // com.ss.android.lark.monitor.C48246q.AbstractC48247a
        /* renamed from: a */
        public void mo103071a(float f) {
            Log.m165389i("IdleStateManager", "CPU percent = " + f);
            synchronized (this) {
                if (f < IdleStateManager.this.f72770c) {
                    IdleStateManager.this.f72768a++;
                } else {
                    IdleStateManager.this.f72768a = 0;
                }
            }
            if (IdleStateManager.this.f72768a >= IdleStateManager.this.f72769b) {
                IdleStateManager.this.mo103070b();
            }
        }
    };

    /* renamed from: f */
    private Map<AbstractC52236a.AbstractC52237a, Object> f72772f = new ConcurrentHashMap();

    private static class IdlePreloadConfigParser implements AbstractC41160a {
        private IdlePreloadConfigParser() {
        }

        /* renamed from: a */
        public LoadConfig mo103073b(String str) {
            LoadConfig loadConfig = new LoadConfig(3, 30.0f);
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str);
                    Integer integer = parseObject.getInteger("idle_count");
                    Float f = parseObject.getFloat("idle_rate");
                    if (integer == null) {
                        integer = 3;
                    }
                    if (f == null) {
                        f = Float.valueOf(30.0f);
                    }
                    loadConfig.mo103075a(f.floatValue());
                    loadConfig.mo103076a(integer.intValue());
                } catch (Exception e) {
                    Log.m165383e("IdleStateManager", "parse idle preload config fail :" + e.getMessage());
                }
            }
            return loadConfig;
        }
    }

    public static class LoadConfig extends C41152a {

        /* renamed from: a */
        private int f72774a;

        /* renamed from: b */
        private float f72775b;

        /* renamed from: a */
        public int mo103074a() {
            return this.f72774a;
        }

        /* renamed from: b */
        public float mo103077b() {
            return this.f72775b;
        }

        /* renamed from: a */
        public void mo103075a(float f) {
            this.f72775b = f;
        }

        /* renamed from: a */
        public void mo103076a(int i) {
            this.f72774a = i;
        }

        public LoadConfig(int i, float f) {
            this.f72774a = i;
            this.f72775b = f;
        }
    }

    /* renamed from: b */
    public void mo103070b() {
        for (AbstractC52236a.AbstractC52237a aVar : this.f72772f.keySet()) {
            if (aVar != null) {
                aVar.mo178813a();
            }
        }
    }

    @Override // com.ss.android.lark.preload.moment.AbstractC52236a
    /* renamed from: a */
    public void mo103068a() {
        LoadConfig loadConfig = (LoadConfig) ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig("idle_preload_config", new IdlePreloadConfigParser());
        this.f72769b = loadConfig.mo103074a();
        this.f72770c = loadConfig.mo103077b();
        C48246q.m190373a(this.f72771e);
    }

    @Override // com.ss.android.lark.preload.moment.AbstractC52236a
    /* renamed from: a */
    public void mo103069a(AbstractC52236a.AbstractC52237a aVar) {
        this.f72772f.put(aVar, f72767d);
    }
}
