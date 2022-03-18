package com.ss.android.lark.passport.signinsdk_api.env;

import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.env.a */
public interface AbstractC49370a {

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.env.a$a */
    public interface AbstractC49371a {
        /* renamed from: a */
        void mo102728a(boolean z, AbstractC49352d<String> dVar);

        /* renamed from: a */
        boolean mo102729a();
    }

    String getBoeVaUnit();

    String getConfigEnv();

    String getDefaultConfigEnv();

    HostEnvBean getHostEnv();

    String getOppositeUnit(String str);

    String getUserUnit();

    String getVaUnit();

    boolean isBoeConfig();

    boolean isBuildinEnv();

    boolean isCnEnv();

    boolean isCnEnv(String str);

    boolean isLarkConfig();

    void onLoginEnvChange(HostEnvBean hostEnvBean, AbstractC49352d<String> dVar);

    void registerLoginEnvChangeListener(AbstractC49371a aVar);

    void saveConfigEnv(String str);

    void updateStdLark(String str);
}
