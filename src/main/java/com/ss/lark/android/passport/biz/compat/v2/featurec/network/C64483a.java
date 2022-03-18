package com.ss.lark.android.passport.biz.compat.v2.featurec.network;

import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.ApplyCodeRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.BioAuthVerifyRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.ExternalApplyCodeRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.RealNameVerifyRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.RecoverFaceRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.SetNewPhoneRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.SetPwdRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.SetTicketRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.VerifyCodeRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.request.VerifyPwdRequest;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.RefreshTicketData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SetPwdData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.BaseRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.signinsdk.v2.featurec.network.request.SetPwdRequestFromRecoverAccount;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.featurec.network.a */
public class C64483a {

    /* renamed from: a */
    private static C64483a f162823a;

    private C64483a() {
    }

    /* renamed from: a */
    public AbstractC49347c mo223131a(String str, RsaInfo rsaInfo, UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<V2ResponseModel<VerifyPwdData>> dVar) {
        VerifyPwdRequest verifyPwdRequest = new VerifyPwdRequest(str, rsaInfo);
        verifyPwdRequest.setUniContext(uniContext);
        return verifyPwdRequest.request2(new AbstractC49342a<V2ResponseModel<VerifyPwdData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644885 */

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<VerifyPwdData> v2ResponseModel) {
                AbstractC49352d dVar = dVar;
                if (dVar != null && v2ResponseModel != null) {
                    dVar.mo145179a(v2ResponseModel);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("verifyPwd onError", networkErrorResult));
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223133a(String str, String str2, int i, RsaInfo rsaInfo, UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<BaseStepData> dVar) {
        RealNameVerifyRequest realNameVerifyRequest = new RealNameVerifyRequest(str, str2, i, rsaInfo);
        realNameVerifyRequest.setUniContext(uniContext);
        return realNameVerifyRequest.request2(new AbstractC49342a<V2ResponseModel<BaseStepData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644907 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("realNameVerify error", networkErrorResult));
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<BaseStepData> v2ResponseModel) {
                if (v2ResponseModel.code == 0) {
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a((BaseStepData) v2ResponseModel.data);
                        return;
                    }
                    return;
                }
                PassportLog passportLog = passportLog;
                passportLog.mo171471d("FeatureCService", "realNameVerify onSuccess error " + v2ResponseModel.code);
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223132a(String str, UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<BaseStepData> dVar) {
        SetNewPhoneRequest setNewPhoneRequest = new SetNewPhoneRequest(str);
        setNewPhoneRequest.setUniContext(uniContext);
        return setNewPhoneRequest.request2(new AbstractC49342a<V2ResponseModel<BaseStepData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644918 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("FeatureCService setNewPhone error", networkErrorResult));
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<BaseStepData> v2ResponseModel) {
                if (v2ResponseModel.code == 0) {
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a((BaseStepData) v2ResponseModel.data);
                        return;
                    }
                    return;
                }
                PassportLog passportLog = passportLog;
                passportLog.mo171471d("FeatureCService", "FeatureCService setNewPhone error " + v2ResponseModel.code);
            }
        });
    }

    /* renamed from: a */
    public static C64483a m253375a() {
        if (f162823a == null) {
            synchronized (C64483a.class) {
                if (f162823a == null) {
                    f162823a = new C64483a();
                }
            }
        }
        return f162823a;
    }

    /* renamed from: b */
    public AbstractC49347c mo223134b(UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<RefreshTicketData> dVar) {
        SetTicketRequest setTicketRequest = new SetTicketRequest();
        setTicketRequest.setUniContext(uniContext);
        return setTicketRequest.request2(new AbstractC49342a<V2ResponseModel<RefreshTicketData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644852 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("FeatureCService requestNewTicket error", networkErrorResult));
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<RefreshTicketData> v2ResponseModel) {
                if (v2ResponseModel.code == 0) {
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a((RefreshTicketData) v2ResponseModel.data);
                        return;
                    }
                    return;
                }
                PassportLog passportLog = passportLog;
                passportLog.mo171471d("FeatureCService", "FeatureCService requestNewTicket error " + v2ResponseModel.code);
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223128a(UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<BaseStepData> dVar) {
        RecoverFaceRequest recoverFaceRequest = new RecoverFaceRequest();
        recoverFaceRequest.setUniContext(uniContext);
        return recoverFaceRequest.request2(new AbstractC49342a<V2ResponseModel<BaseStepData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644929 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("FeatureCService recoverFace error", networkErrorResult));
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<BaseStepData> v2ResponseModel) {
                if (v2ResponseModel.code == 0) {
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a((BaseStepData) v2ResponseModel.data);
                        return;
                    }
                    return;
                }
                PassportLog passportLog = passportLog;
                passportLog.mo171471d("FeatureCService", "FeatureCService recoverFace error " + v2ResponseModel.code);
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223127a(UniContext uniContext, int i, final PassportLog passportLog, final AbstractC49352d<BaseStepData> dVar) {
        BioAuthVerifyRequest bioAuthVerifyRequest = new BioAuthVerifyRequest(i);
        bioAuthVerifyRequest.setUniContext(uniContext);
        return bioAuthVerifyRequest.request2(new AbstractC49342a<V2ResponseModel<BaseStepData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.AnonymousClass10 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("BioAuthVerifyRequest onError:", networkErrorResult));
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<BaseStepData> v2ResponseModel) {
                if (v2ResponseModel.code != 0) {
                    PassportLog passportLog = passportLog;
                    passportLog.mo171471d("FeatureCService", "BioAuthVerifyRequest onError:" + v2ResponseModel.code);
                } else if (dVar != null) {
                    passportLog.mo171465b("FeatureCService", "BioAuthVerifyRequest onSuccess");
                    dVar.mo145179a((BaseStepData) v2ResponseModel.data);
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223125a(int i, int i2, UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<V2ResponseModel<ApplyCodeData>> dVar) {
        ApplyCodeRequest applyCodeRequest = new ApplyCodeRequest(i, i2);
        applyCodeRequest.setUniContext(uniContext);
        return applyCodeRequest.request2(new AbstractC49342a<V2ResponseModel<ApplyCodeData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644841 */

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<ApplyCodeData> v2ResponseModel) {
                AbstractC49352d dVar = dVar;
                if (dVar != null && v2ResponseModel != null) {
                    dVar.mo145179a(v2ResponseModel);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("applyVerifyCode onError", networkErrorResult));
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223129a(String str, final int i, UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<V2ResponseModel<BaseStepData>> dVar) {
        VerifyCodeRequest verifyCodeRequest = new VerifyCodeRequest(str, i);
        verifyCodeRequest.setUniContext(uniContext);
        return verifyCodeRequest.request2(new AbstractC49342a<V2ResponseModel<BaseStepData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644874 */

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<BaseStepData> v2ResponseModel) {
                C49096b.m193573a(i);
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a(v2ResponseModel);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                C49096b.m193607s();
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("verifyCode onError", networkErrorResult));
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223126a(int i, int i2, String str, String str2, UniContext uniContext, final PassportLog passportLog, final AbstractC49352d<V2ResponseModel<ApplyCodeData>> dVar) {
        ExternalApplyCodeRequest externalApplyCodeRequest = new ExternalApplyCodeRequest(i, i2, str, str2);
        externalApplyCodeRequest.setUniContext(uniContext);
        return externalApplyCodeRequest.request2(new AbstractC49342a<V2ResponseModel<ApplyCodeData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644863 */

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<ApplyCodeData> v2ResponseModel) {
                AbstractC49352d dVar = dVar;
                if (dVar != null && v2ResponseModel != null) {
                    dVar.mo145179a(v2ResponseModel);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145178a(networkErrorResult);
                }
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("ExternalApplyCodeRequest Failed", networkErrorResult));
            }
        });
    }

    /* renamed from: a */
    public AbstractC49347c mo223130a(String str, RsaInfo rsaInfo, int i, UniContext uniContext, final PassportLog passportLog, boolean z, final AbstractC49352d<SetPwdData> dVar) {
        BaseRequest baseRequest;
        if (z) {
            baseRequest = new SetPwdRequestFromRecoverAccount(str, rsaInfo);
        } else {
            baseRequest = new SetPwdRequest(str, rsaInfo, i);
        }
        baseRequest.setUniContext(uniContext);
        return baseRequest.request2(new AbstractC49342a<V2ResponseModel<SetPwdData>>() {
            /* class com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a.C644896 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a
            /* renamed from: a */
            public void mo171966a(NetworkErrorResult networkErrorResult) {
                passportLog.mo171471d("FeatureCService", PassportLog.m193687a("setPwd onError", networkErrorResult));
                AbstractC49352d dVar = dVar;
                if (dVar != null && networkErrorResult != null) {
                    dVar.mo145178a(networkErrorResult);
                }
            }

            /* renamed from: a */
            public void mo171968a(V2ResponseModel<SetPwdData> v2ResponseModel) {
                passportLog.mo171465b("FeatureCService", PassportLog.m193686a("setPwd onSuccess", v2ResponseModel));
                if (dVar != null && v2ResponseModel != null && v2ResponseModel.code == 0) {
                    dVar.mo145179a((SetPwdData) v2ResponseModel.data);
                }
            }
        });
    }
}
