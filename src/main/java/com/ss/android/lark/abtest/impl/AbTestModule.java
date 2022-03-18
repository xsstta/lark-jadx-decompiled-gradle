package com.ss.android.lark.abtest.impl;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.applog.network.AbstractC3450b;
import com.bytedance.dataplatform.AbstractC3992e;
import com.bytedance.dataplatform.AbstractC3993f;
import com.bytedance.dataplatform.AbstractC3994g;
import com.bytedance.dataplatform.AbstractC3995h;
import com.bytedance.dataplatform.C3987b;
import com.bytedance.dataplatform.C3989c;
import com.bytedance.dataplatform.ExperimentEntity;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.abtest.api.listener.AbTestModuleDependency;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.applogbridge.listener.IDeviceIdListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.p2397a.C48758b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57859q;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ClaymoreImpl(IABTestService.class)
public class AbTestModule implements IABTestService {
    private final Map<Class, AbstractC28490a> experiments = new HashMap();
    private final Set<String> experimentsKeys = new HashSet();
    private volatile boolean isInit;
    private boolean isRegisterExperiments;

    public static AbTestModuleDependency getDependency() {
        return (AbTestModuleDependency) ApiUtils.getApi(AbTestModuleDependency.class);
    }

    @Override // com.ss.android.lark.abtest.api.IABTestService
    public Set<String> getAllAbTestKeys() {
        if (!this.isRegisterExperiments) {
            getDependency().registerExperiments();
            this.isRegisterExperiments = true;
        }
        return this.experimentsKeys;
    }

    public <T> T getAbTestValue(AbstractC28490a<T> aVar) {
        return (T) getAbTestValue((AbstractC28490a) aVar, true);
    }

    private void init(Application application) {
        if (!this.isInit) {
            synchronized (this) {
                if (!this.isInit) {
                    initReal(application);
                }
            }
        }
    }

    private Set<ExperimentEntity> convertLarkABTestToExperimentEntity(List<AbstractC28490a> list) {
        HashSet hashSet = new HashSet();
        for (AbstractC28490a aVar : list) {
            C28491b larkExperimentInfo = aVar.getLarkExperimentInfo();
            hashSet.add(new ExperimentEntity(larkExperimentInfo.mo101352a(), ((ParameterizedType) aVar.getClass().getGenericSuperclass()).getActualTypeArguments()[0], aVar.getDefault(), larkExperimentInfo.mo101353b(), new String[0]));
        }
        return hashSet;
    }

    private void initReal(final Application application) {
        if (!getDependency().isAbTestEnable()) {
            Log.m165389i("AbTestModule", "AbTest is disable.");
            this.isInit = true;
            return;
        }
        if (getDependency().isDebug()) {
            C3989c.m16624a(true);
        }
        Log.m165389i("AbTestModule", "AbTest start init.");
        C3987b.m16619a(true);
        C3987b.m16618a(application, "https://" + getDependency().getAbTestHost() + "/common", true, new AbstractC3995h() {
            /* class com.ss.android.lark.abtest.impl.AbTestModule.C284921 */

            @Override // com.bytedance.dataplatform.AbstractC3995h
            /* renamed from: a */
            public <T> T mo15699a(String str, Type type, T t) {
                return (T) AbTestModule.getDependency().getAbSettings(str, (Class) type, t);
            }
        }, new AbstractC3994g() {
            /* class com.ss.android.lark.abtest.impl.AbTestModule.C284932 */

            @Override // com.bytedance.dataplatform.AbstractC3994g
            /* renamed from: a */
            public <T> T mo15698a(String str, Type type) {
                return (T) C48758b.m192084a(str, (Class) type);
            }
        }, new AbstractC3992e() {
            /* class com.ss.android.lark.abtest.impl.AbTestModule.C284943 */

            @Override // com.bytedance.dataplatform.AbstractC3992e
            /* renamed from: a */
            public void mo15696a(String str) {
                AppLogProxy.setAbSdkVersion(str);
            }
        }, new AbstractC3993f() {
            /* class com.ss.android.lark.abtest.impl.AbTestModule.C284954 */

            @Override // com.bytedance.dataplatform.AbstractC3993f
            /* renamed from: a */
            public String mo15697a(String str) {
                try {
                    AbstractC3450b netConfig = AppLogProxy.getNetConfig();
                    if (netConfig == null) {
                        return null;
                    }
                    String userId = AbTestModule.getDependency().getUserId();
                    if (!TextUtils.isEmpty(userId)) {
                        AppLogProxy.setCustomNetParams("uid", userId);
                        AppLogProxy.setCustomNetParams("uid_type", "0");
                        AppLogProxy.setCustomNetParams("uuid", C57859q.m224565a(userId));
                        AppLogProxy.setCustomNetParams("tenant_tag", String.valueOf(AbTestModule.getDependency().getTenantTag()));
                    }
                    return netConfig.mo13885a(aq.m95058a(AppLogProxy.addNetCommonParams(application, str, true), "build_serial"), null);
                } catch (Exception e) {
                    Log.m165383e("AbTestModule", e.toString());
                    return null;
                }
            }
        });
        AppLogProxy.addDeviceIdListener(new IDeviceIdListener() {
            /* class com.ss.android.lark.abtest.impl.AbTestModule.C284965 */

            @Override // com.ss.android.lark.applogbridge.listener.IDeviceIdListener
            /* renamed from: a */
            public void mo101371a(String str, String str2, String str3) {
                C3987b.m16617a();
            }

            @Override // com.ss.android.lark.applogbridge.listener.IDeviceIdListener
            /* renamed from: a */
            public void mo101372a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
                C3987b.m16617a();
            }
        });
        AppLogProxy.setUidChangedListener(new Runnable() {
            /* class com.ss.android.lark.abtest.impl.AbTestModule.RunnableC284976 */

            public void run() {
                C3987b.m16617a();
            }
        });
        this.isInit = true;
    }

    @Override // com.ss.android.lark.abtest.api.IABTestService
    public <T> T getAbTestValue(Class<? extends AbstractC28490a> cls, boolean z) {
        if (cls != null) {
            AbstractC28490a aVar = this.experiments.get(cls);
            if (aVar != null) {
                return (T) getAbTestValue(aVar, z);
            }
            Log.m165389i("AbTestModule", "AbTest of <" + cls.getName() + "> not register.");
            T t = null;
            try {
                t = (T) ((AbstractC28490a) cls.newInstance()).getDefault();
                Log.m165389i("AbTestModule", "AbTest of <" + cls.getName() + "> return the default value -> " + ((Object) t));
                return t;
            } catch (Exception e) {
                Log.m165386e("AbTestModule", e);
                return t;
            }
        } else {
            throw new IllegalArgumentException("config class require nonnull.");
        }
    }

    @Override // com.ss.android.lark.abtest.api.IABTestService
    public void registerExperiments(String str, List<AbstractC28490a> list) {
        init(getDependency().getApp());
        if (getDependency().isDebug()) {
            try {
                C3989c.m16623a(str, convertLarkABTestToExperimentEntity(list));
            } catch (Exception e) {
                Log.m165384e("AbTestModule", "panel init exception", e);
            }
        }
        for (AbstractC28490a aVar : list) {
            if (aVar == null) {
                Log.m165397w("AbTestModule", "AbTest of config is null.");
            } else {
                C28491b larkExperimentInfo = aVar.getLarkExperimentInfo();
                if (larkExperimentInfo != null) {
                    this.experiments.put(aVar.getClass(), aVar);
                    this.experimentsKeys.add(larkExperimentInfo.mo101352a());
                } else {
                    throw new IllegalArgumentException("AbTest of <" + aVar.getClass().getName() + ">'s info require nonnull.");
                }
            }
        }
    }

    private <T> T getAbTestValue(AbstractC28490a<T> aVar, boolean z) {
        init(getDependency().getApp());
        if (!getDependency().isAbTestEnable()) {
            Log.m165397w("AbTestModule", "AbTest is disable.");
            return aVar.getDefault();
        } else if (!aVar.isEnable()) {
            Log.m165397w("AbTestModule", "AbTest of <" + aVar.getClass().getName() + "> is disable.");
            return aVar.getDefault();
        } else {
            C28491b larkExperimentInfo = aVar.getLarkExperimentInfo();
            try {
                T t = (T) C3987b.m16615a(larkExperimentInfo.mo101352a(), ((ParameterizedType) aVar.getClass().getGenericSuperclass()).getActualTypeArguments()[0], aVar.getDefault(), aVar.isSticky(), z);
                if (t == null) {
                    return aVar.getDefault();
                }
                Log.m165389i("AbTestModule", "AbTest of <" + aVar.getClass().getName() + ">'s value is <" + ((Object) t) + ">.");
                return t;
            } catch (Throwable th) {
                Log.m165383e("AbTestModule", "AbTest error: " + th.toString());
                return aVar.getDefault();
            }
        }
    }
}
