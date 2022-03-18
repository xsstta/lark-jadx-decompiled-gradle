package com.ss.android.lark.mail.impl.threadaction;

import android.util.Pair;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class ThreadActionConfigurator {
    private static HashMap<Class, Processor> processorMap = new HashMap<>();

    public static final void init() {
        Log.m165389i("T_A_Configurator", "init");
        try {
            Field[] fields = Class.forName(ThreadActionConfigurator.class.getPackage().getName() + '.' + "ConfigList").getFields();
            for (Field field : fields) {
                if (field != null) {
                    Object obj = field.get(null);
                    if (obj instanceof Pair) {
                        initConfig((Pair) obj);
                    }
                }
            }
        } catch (Exception e) {
            Log.m165384e("T_A_Configurator", "init", e);
        }
        Log.m165379d("T_A_Configurator", "init Done");
    }

    public static Processor of(Class cls) {
        return processorMap.get(cls);
    }

    private static final void initConfig(Pair<String, String> pair) {
        try {
            processorMap.put(Class.forName((String) pair.first), (Processor) Class.forName((String) pair.second).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception e) {
            Log.m165384e("T_A_Configurator", "initConfig: " + ((String) pair.first), e);
        }
    }

    public static abstract class Processor {
        protected ThreadActionConfig defaultConfig;
        protected HashMap<String, ThreadActionConfig> originalConfigMap = new HashMap<>(16);

        /* access modifiers changed from: protected */
        public abstract ThreadActionConfig process(ThreadActionConfig threadActionConfig, String str, Object... objArr);

        public final void init(Map<String, ThreadActionConfig> map, ThreadActionConfig threadActionConfig) {
            this.originalConfigMap.putAll(map);
            this.defaultConfig = threadActionConfig;
        }

        public final ThreadActionConfig process(String str, Object... objArr) {
            return process(this.originalConfigMap.get(str), str, objArr);
        }
    }
}
