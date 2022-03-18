package com.larksuite.component.openplatform.plugins.config;

import android.text.TextUtils;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.core.C25927d;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LKPluginConfig implements Serializable {
    private List<String> mEventList;
    public AbstractC25937e mLkPlugin;
    public List<LKOpenApiAccessConfig> mOpenConditions;
    public LKOpenApiBizDomain mOwner;
    public String mPluginClassName;
    public PluginEnv mPluginEnv;
    public Scope mScope;

    public List<String> getEventList() {
        return this.mEventList;
    }

    public boolean configInvalid() {
        List<String> list;
        if ((!TextUtils.isEmpty(this.mPluginClassName) || this.mLkPlugin != null) && (list = this.mEventList) != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LKPluginConfig{mLkPlugin=");
        AbstractC25937e eVar = this.mLkPlugin;
        if (eVar != null) {
            str = eVar.getClass().getName();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", mPluginClassName='");
        sb.append(this.mPluginClassName);
        sb.append('\'');
        sb.append(", mOwner=");
        sb.append(this.mOwner);
        sb.append(", mOpenConditions=");
        sb.append(this.mOpenConditions);
        sb.append(", mScope=");
        sb.append(this.mScope);
        sb.append(", mEventList=");
        sb.append(this.mEventList);
        sb.append(", mPluginEnv=");
        sb.append(this.mPluginEnv);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: com.larksuite.component.openplatform.plugins.config.LKPluginConfig$a */
    public static class C25571a {

        /* renamed from: a */
        public AbstractC25937e f62204a;

        /* renamed from: b */
        public String f62205b;

        /* renamed from: c */
        public Scope f62206c = Scope.CONTAINER;

        /* renamed from: d */
        public LKOpenApiBizDomain f62207d = LKOpenApiBizDomain.OPEN_PLATFORM;

        /* renamed from: e */
        public List<LKOpenApiAccessConfig> f62208e = new ArrayList();

        /* renamed from: f */
        public List<String> f62209f;

        /* renamed from: g */
        public PluginEnv f62210g = PluginEnv.BIZ_ENV;

        /* renamed from: a */
        public LKPluginConfig mo88749a() {
            return new LKPluginConfig(this);
        }

        /* renamed from: a */
        public C25571a mo88741a(LKOpenApiBizDomain lKOpenApiBizDomain) {
            this.f62207d = lKOpenApiBizDomain;
            return this;
        }

        /* renamed from: a */
        public C25571a mo88742a(PluginEnv pluginEnv) {
            this.f62210g = pluginEnv;
            return this;
        }

        /* renamed from: a */
        public C25571a mo88743a(Scope scope) {
            this.f62206c = scope;
            return this;
        }

        /* renamed from: a */
        public C25571a mo88744a(LKOpenApiAccessConfig lKOpenApiAccessConfig) {
            this.f62208e.add(lKOpenApiAccessConfig);
            return this;
        }

        /* renamed from: a */
        public C25571a mo88745a(AbstractC25937e eVar) {
            this.f62204a = eVar;
            C25927d dVar = new C25927d();
            AbstractC25937e eVar2 = this.f62204a;
            if (eVar2 != null) {
                eVar2.addEvents(dVar);
                this.f62209f = dVar.mo92191a();
            }
            return this;
        }

        /* renamed from: a */
        public <T extends AbstractC25937e> C25571a mo88746a(Class<T> cls) {
            this.f62205b = cls.getName();
            return this;
        }

        /* renamed from: a */
        public C25571a mo88747a(String str) {
            this.f62205b = str;
            return this;
        }

        /* renamed from: a */
        public C25571a mo88748a(List<String> list) {
            if (list == null || list.isEmpty()) {
                Log.m165397w("OPPluginConfig", "events is empty!");
                return this;
            }
            this.f62209f = list;
            return this;
        }
    }

    private LKPluginConfig(C25571a aVar) {
        this.mOwner = LKOpenApiBizDomain.OPEN_PLATFORM;
        this.mLkPlugin = aVar.f62204a;
        this.mOwner = aVar.f62207d;
        this.mOpenConditions = aVar.f62208e;
        this.mPluginClassName = aVar.f62205b;
        this.mScope = aVar.f62206c;
        this.mEventList = aVar.f62209f;
        this.mPluginEnv = aVar.f62210g;
    }
}
