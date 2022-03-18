package com.ss.lark.android.passport.biz.service.impl;

import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49124b;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(AbstractC49124b.class)
public class CrossEnvServiceImpl implements AbstractC49124b {
    public static final PassportLog logger = PassportLog.f123351c.mo171474a();

    private boolean isKarPackage() {
        String buildPackageChannel = ServiceFinder.m193752g().getBuildPackageChannel(LarkContext.getApplication());
        if (!ServiceFinder.m193752g().isPrivateKABuildPackage() || TextUtils.isEmpty(buildPackageChannel) || !buildPackageChannel.contains("crc")) {
            return false;
        }
        return true;
    }

    public boolean isValidDeviceId(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49124b
    public boolean isNeedCrossEnv(User user, String str) {
        if (!isRedirectUser(user, str) || isKarPackage()) {
            return false;
        }
        return true;
    }

    private boolean isRedirectUser(User user, String str) {
        if (user != null && !TextUtils.isEmpty(user.userUnit) && !TextUtils.equals(user.userUnit, str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49124b
    public void cleanEnvAndDid(final UniContext uniContext, final AbstractC49352d<String> dVar) {
        logger.mo171465b("n_action_clean_env", "clean start");
        ServiceFinder.m193752g().onHostEnvClear(new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl.C651963 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                CrossEnvServiceImpl.this.dealError("n_action_clean_env", "clean error", networkErrorResult, dVar);
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                PassportConfigCenter.f123034a.mo171117h();
                CrossEnvServiceImpl.logger.mo171465b("n_action_clean_env", "cleanEnvAndGetDid success");
                CrossEnvServiceImpl.this.updateDeviceId(uniContext, dVar);
            }
        });
    }

    public void updateDeviceId(UniContext uniContext, final AbstractC49352d<String> dVar) {
        logger.mo171465b("n_action_get_cross_did", "start getDID");
        C49194j.m193951a(false, new AbstractC49392e() {
            /* class com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl.C651952 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
                CrossEnvServiceImpl.this.dealError("n_action_get_cross_did", str, null, dVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                if (CrossEnvServiceImpl.this.isValidDeviceId(str)) {
                    PassportLog passportLog = CrossEnvServiceImpl.logger;
                    passportLog.mo171465b("n_action_get_cross_did", "getDeviceId success, set Rust DID:" + str);
                    ((IDeviceService) ServiceFinder.m193746a(IDeviceService.class)).setDeviceId(str);
                } else {
                    PassportLog passportLog2 = CrossEnvServiceImpl.logger;
                    passportLog2.mo171468c("n_action_get_cross_did", "invalid deviceId:" + str);
                }
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a(str);
                } else {
                    CrossEnvServiceImpl.logger.mo171468c("n_action_get_cross_did", "callback is null");
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49124b
    public void updateEnvAndDid(String str, final String str2, final UniContext uniContext, final AbstractC49352d<String> dVar) {
        logger.mo171465b("n_action_update_env_start", "start updateEnvAndGetDid");
        C48998a.f123026a.mo171065a(str, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl.C651941 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                CrossEnvServiceImpl.this.dealError("n_action_update_env_fail", "updateEnv error", networkErrorResult, dVar);
            }

            /* renamed from: a */
            public void mo145179a(String str) {
                PassportConfigCenter.f123034a.mo171110a(str2);
                CrossEnvServiceImpl.logger.mo171465b("n_action_update_env_succ", "updateEnv success");
                CrossEnvServiceImpl.this.updateDeviceId(uniContext, dVar);
            }
        });
    }

    public void dealError(String str, String str2, NetworkErrorResult networkErrorResult, AbstractC49352d<String> dVar) {
        if (dVar != null) {
            if (networkErrorResult == null) {
                networkErrorResult = new NetworkErrorResult(-1, str2);
            }
            logger.mo171471d(str, PassportLog.m193687a(str2, networkErrorResult));
            dVar.mo145178a(networkErrorResult);
            return;
        }
        PassportLog passportLog = logger;
        passportLog.mo171471d(str, str2 + ",callback is null");
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49124b
    public void recoverEnvAndDid(final HostEnvBean hostEnvBean, String str, String str2, UniContext uniContext) {
        String str3;
        PassportLog passportLog = logger;
        StringBuilder sb = new StringBuilder("recoverEnvAndSetDid, hostEnvBean is:");
        if (hostEnvBean == null) {
            str3 = "";
        } else {
            str3 = hostEnvBean.userUnit;
        }
        sb.append(str3);
        sb.append(",oldDeviceId is:");
        sb.append(str);
        sb.append(",oldConfigEnv is:");
        sb.append(str2);
        passportLog.mo171465b("n_action_cross_recover_env", sb.toString());
        C48998a.f123026a.mo171063a(hostEnvBean, new AbstractC49352d<String>() {
            /* class com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl.C651974 */

            /* renamed from: a */
            public void mo145179a(String str) {
                CrossEnvServiceImpl.logger.mo171465b("n_action_cross_recover_env", "recoverEnv success");
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                CrossEnvServiceImpl.logger.mo171471d("n_action_cross_recover_env", "onError, start retry recoverEnv");
                C48998a.f123026a.mo171063a(hostEnvBean, new AbstractC49352d<String>() {
                    /* class com.ss.lark.android.passport.biz.service.impl.CrossEnvServiceImpl.C651974.C651981 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                    /* renamed from: a */
                    public void mo145178a(NetworkErrorResult networkErrorResult) {
                        CrossEnvServiceImpl.logger.mo171465b("n_action_cross_recover_env", "retry, recoverEnv error");
                    }

                    /* renamed from: a */
                    public void mo145179a(String str) {
                        CrossEnvServiceImpl.logger.mo171465b("n_action_cross_recover_env", "retry, recoverEnv success");
                    }
                });
            }
        });
        PassportConfigCenter.f123034a.mo171110a(str2);
        passportLog.mo171465b("n_action_cross_recover_env", "updateConfigEnv Finish");
        ((IDeviceService) ServiceFinder.m193746a(IDeviceService.class)).setDeviceId(str);
        passportLog.mo171465b("n_action_cross_recover_env", "setDeviceId Finish");
    }
}
