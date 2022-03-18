package com.ss.lark.android.passport.biz.link_handler;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.LoginApi;
import com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService;
import java.lang.reflect.Type;

@RemoteServiceImpl(service = ISwitchUserManisService.class)
public class SwitchUserManisServiceImpl implements ISwitchUserManisService {
    private final String TAG = "SwitchUserManisServiceImpl";
    public final PassportLog logger = PassportLog.f123351c.mo171474a();
    public final Context mContext;

    public SwitchUserManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.ISwitchUserManisService
    public void switchUser(String str, String str2, String str3, final ISwitchUserManisService.AbstractC65155a aVar) {
        final UniContext uniContext = UniContext.CONTEXT_SWITCH;
        if (!TextUtils.isEmpty(str3)) {
            C49216a.m194036a().mo171740a("X-Flow-Key", str3);
        } else {
            this.logger.mo171464b("n_action_x_flow_key_is_empty");
        }
        this.logger.mo171460a("n_action_accounts_app_req");
        LoginApi.m253954a(str, str2, false, (ICallback<BaseStepData>) new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.link_handler.SwitchUserManisServiceImpl.C651561 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                SwitchUserManisServiceImpl.this.logger.mo171464b("n_action_accounts_app_error");
                aVar.onError(networkErrorResult.getErrorCode(), networkErrorResult.getErrorMessage());
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                SwitchUserManisServiceImpl.this.logger.mo171460a("n_action_accounts_app_succ");
                final BaseStepData data = responseModel.getData();
                if (data.stepInfo == null) {
                    SwitchUserManisServiceImpl.this.logger.mo171471d("n_action_accounts_app_succ", "stepInfo is null");
                    data.stepInfo = new JSONObject();
                }
                C49092f.m193529a(SwitchUserManisServiceImpl.this.mContext, data, RouterScene.INVITE.value, uniContext, SwitchUserManisServiceImpl.this.logger, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.link_handler.SwitchUserManisServiceImpl.C651561.C651571 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        if (i == -106) {
                            if (aVar != null) {
                                aVar.onSuccess(new SessionResult());
                            }
                        } else if (i == -100) {
                            if (aVar != null) {
                                ISwitchUserManisService.AbstractC65155a aVar = aVar;
                                aVar.onError(-100, "SWITCH_USER_TARGET_USER_NEED_VERIFY_ERROR,nextStep:" + data.nextStep);
                            }
                        } else if (aVar != null) {
                            ISwitchUserManisService.AbstractC65155a aVar2 = aVar;
                            aVar2.onError(-101, "SWITCH_USER_ERROR,nextStep: " + data.nextStep);
                        }
                    }
                });
            }
        });
    }
}
