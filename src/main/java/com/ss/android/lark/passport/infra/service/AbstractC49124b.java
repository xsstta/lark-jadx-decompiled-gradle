package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;

/* renamed from: com.ss.android.lark.passport.infra.service.b */
public interface AbstractC49124b {
    void cleanEnvAndDid(UniContext uniContext, AbstractC49352d<String> dVar);

    boolean isNeedCrossEnv(User user, String str);

    void recoverEnvAndDid(HostEnvBean hostEnvBean, String str, String str2, UniContext uniContext);

    void updateEnvAndDid(String str, String str2, UniContext uniContext, AbstractC49352d<String> dVar);
}
