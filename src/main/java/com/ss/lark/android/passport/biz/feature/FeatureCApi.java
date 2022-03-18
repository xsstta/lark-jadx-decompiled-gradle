package com.ss.lark.android.passport.biz.feature;

import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40653t;
import com.ss.android.lark.passport.infra.base.network.C49085f;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.base.network.service.RequestService;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49187f;
import com.ss.android.lark.passport.infra.util.C49196k;
import com.ss.android.lark.passport.infra.util.C49199m;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.account.ResponseUser;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.idp.IdPSettingResponse;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.CheckStatusResp;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.EnterAppStep;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SwitchUserData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005z{|}~B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u0001002\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007¢\u0006\u0002\u0010=J0\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007J0\u0010B\u001a\u0002032\u0006\u0010?\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007J.\u0010C\u001a\u0002032\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040E2\u0006\u0010F\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020G0;H\u0007J(\u0010H\u001a\u0002032\u0006\u0010I\u001a\u0002002\b\u00108\u001a\u0004\u0018\u0001092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007J0\u0010J\u001a\u0002032\u0006\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020A2\b\u0010?\u001a\u0004\u0018\u00010\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007JB\u0010M\u001a\u0002032\u0006\u0010N\u001a\u0002002\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\u0006\u0010O\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020P0;H\u0007JH\u0010Q\u001a\u0002032\u0006\u0010N\u001a\u0002002\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020P0;H\u0007J$\u0010T\u001a\u0002032\u0006\u0010F\u001a\u00020A2\u0012\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0E0;H\u0007J\u001e\u0010V\u001a\u0002032\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007J4\u0010W\u001a\u0002032\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u0002002\u0006\u00108\u001a\u0002092\u0012\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0X0;H\u0007J\u001e\u0010Y\u001a\u0002032\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007J0\u0010Z\u001a\u00020[2\u0006\u0010R\u001a\u0002002\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007JJ\u0010\\\u001a\u0002032\u0006\u0010]\u001a\u00020\u00042\u0006\u0010^\u001a\u00020A2\u0006\u0010_\u001a\u00020A2\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007JB\u0010`\u001a\u00020[2\u0006\u0010R\u001a\u0002002\u0006\u0010a\u001a\u00020\u00042\b\u0010b\u001a\u0004\u0018\u00010c2\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007JR\u0010d\u001a\u0002032\u0006\u0010e\u001a\u0002002\u0006\u0010f\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u00042\u0006\u0010h\u001a\u0002002\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007JF\u0010i\u001a\u0002032\b\u0010j\u001a\u0004\u0018\u00010\u00042\b\u0010k\u001a\u0004\u0018\u00010\u00042\b\u0010l\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010m\u001a\u00020n2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020o0;H\u0007JN\u0010p\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u00042\u0006\u0010s\u001a\u00020\u00042\u0006\u0010@\u001a\u00020A2\u0006\u00108\u001a\u0002092\u0012\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0X0;H\u0007JB\u0010t\u001a\u0002032\u0006\u0010u\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\u0006\u0010O\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007J:\u0010v\u001a\u0002032\u0006\u0010w\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0007JF\u0010x\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u0010a\u001a\u0004\u0018\u00010\u00042\b\u0010b\u001a\u0004\u0018\u00010c2\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020y0;H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200XT¢\u0006\u0002\n\u0000¨\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/FeatureCApi;", "", "()V", "TAG", "", "TAG_ACTION", "TAG_APP_ID", "TAG_CHANNEL", "TAG_CODE", "TAG_CODE_TYPE", "TAG_CONTACT", "TAG_CREDENTIAL", "TAG_CREDENTIAL_ID", "TAG_CREDENTIAL_TYPE", "TAG_CRED_CONTENT", "TAG_CRED_TYPE", "TAG_FLOW_TYPE", "TAG_IDENTITY_ID", "TAG_ID_NUMBER", "TAG_ID_TOKEN", "TAG_INDUSTRY_TYPE", "TAG_IS_C", "TAG_NAME", "TAG_OPT_IN", "TAG_PROFILE", "TAG_QR_CODE", "TAG_REAL_NAME", "TAG_RSA_TOKEN", "TAG_SCENE", "TAG_SCOPE", "TAG_SESSION_KEY", "TAG_SESSION_KEYS", "TAG_SOURCE", "TAG_SOURCE_TYPE", "TAG_STAFF_SIZE", "TAG_STATE", "TAG_TARGET_SESSION_KEY", "TAG_TENANT_CODE", "TAG_TENANT_DOMAIN", "TAG_TENANT_ID", "TAG_TENANT_NAME", "TAG_TENANT_TYPE", "TAG_TOKEN", "TAG_TYPE", "TAG_USER_ID", "TAG_USER_IDS", "TAG_USER_NAME", "VALUE_CODE_TYPE_CODE", "", "VALUE_EXTERNAL_SOURCE", "applyVerifyToken", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "credential", "credentialType", "scope", "identity_id", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;)Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "authBioTicket", "flowType", "usePacketHost", "", "authBioVerify", "checkStatus", "userIdList", "", "handleToast", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/CheckStatusResp;", "checkUnregister", "scene", "chooseOptIn", "optIn", "usePackageDomain", "codeApply", "codeType", "isNeedVerifyToken", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/ApplyCodeData;", "externalApplyCode", "sourceType", "contact", "fetchUserList", "Lcom/ss/android/lark/passport/signinsdk_api/account/ResponseUser;", "getIdpUa", "loginCredential", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "prepareTenantView", "resetPwd", "", "setName", "name", "checked", "showOptIn", "setPwd", "pwd", "rsa", "Lcom/ss/android/lark/passport/infra/base/network/model/RsaInfo;", "setUserInfo", "cpType", "cpValue", "nameValue", ShareHitPoint.f121868c, "switchUser", "userId", "credentialId", "sessionKey", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/SwitchUserData;", "tenantPrepare", "industryType", "tenantName", "staffSize", "verifyCode", "code", "verifyOtp", "otpCode", "verifyPwd", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/VerifyPwdData;", "AccountCenter", "IdP", "Retrieve", "Tenant", "Upgrade", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.a */
public final class FeatureCApi {

    /* renamed from: a */
    public static final FeatureCApi f163003a = new FeatureCApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007J:\u0010\u0010\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/FeatureCApi$Tenant;", "", "()V", "TAG_QR_CODE", "", "joinTeam", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "tenantCode", "flowType", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "usePacketHost", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "joinTeamByScan", "qrCode", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.a$d */
    public static final class Tenant {

        /* renamed from: a */
        public static final Tenant f163007a = new Tenant();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/FeatureCApi$Tenant$joinTeam$builder$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.a$d$a */
        public static final class C64571a implements AbstractC49348a {
            C64571a() {
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                C40653t tVar = C40653t.f103172h;
                Intrinsics.checkExpressionValueIsNotNull(tVar, "EPMClientPassportMonitor…Y_TEAM_CODE_REQUEST_START");
                return tVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                C40653t tVar = C40653t.f103173i;
                Intrinsics.checkExpressionValueIsNotNull(tVar, "EPMClientPassportMonitor…BY_TEAM_CODE_REQUEST_SUCC");
                return tVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                C40653t tVar = C40653t.f103174j;
                Intrinsics.checkExpressionValueIsNotNull(tVar, "EPMClientPassportMonitor…BY_TEAM_CODE_REQUEST_FAIL");
                return tVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/FeatureCApi$Tenant$joinTeamByScan$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.a$d$b */
        public static final class C64572b implements AbstractC49348a {
            C64572b() {
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: a */
            public OPMonitorCode mo171971a() {
                C40653t tVar = C40653t.f103167c;
                Intrinsics.checkExpressionValueIsNotNull(tVar, "EPMClientPassportMonitor…Y_SCAN_CODE_REQUEST_START");
                return tVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: b */
            public OPMonitorCode mo171972b() {
                C40653t tVar = C40653t.f103168d;
                Intrinsics.checkExpressionValueIsNotNull(tVar, "EPMClientPassportMonitor…BY_SCAN_CODE_REQUEST_SUCC");
                return tVar;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
            /* renamed from: c */
            public OPMonitorCode mo171973c() {
                C40653t tVar = C40653t.f103169e;
                Intrinsics.checkExpressionValueIsNotNull(tVar, "EPMClientPassportMonitor…BY_SCAN_CODE_REQUEST_FAIL");
                return tVar;
            }
        }

        private Tenant() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253721a(UniContext uniContext, String str, String str2, boolean z, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(str2, "qrCode");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            CommonRequest.Builder a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/tenant/qr_code").mo171304a(new C64572b()).mo171306a("qr_code", (Object) str2);
            if (str == null) {
                str = "";
            }
            return C49199m.m193957a(a.mo171311b(str).mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253722a(String str, String str2, UniContext uniContext, boolean z, AbstractC49352d<BaseStepData> dVar) {
            Intrinsics.checkParameterIsNotNull(str, "tenantCode");
            Intrinsics.checkParameterIsNotNull(dVar, "callback");
            CommonRequest.Builder a = new CommonRequest.Builder(uniContext, z).mo171313c("team_code_join").mo171303a(HttpMethod.POST).mo171305a("/accounts/tenant/tenant_code").mo171304a(new C64571a());
            if (str2 == null) {
                str2 = "";
            }
            CommonRequest a2 = a.mo171306a("flow_type", (Object) str2).mo171306a("tenant_code", (Object) str).mo171310a();
            RequestService.f123287a.mo171365a(a2, C49187f.m193935a(dVar, BaseStepData.class));
            return a2;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253706a(boolean z, ICallback<CheckStatusResp> aVar) {
        return m253705a((List) null, z, aVar, 1, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/FeatureCApi$AccountCenter;", "", "()V", "officialEmailInit", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "tenantId", "", "usePacketHost", "", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.a$a */
    public static final class AccountCenter {

        /* renamed from: a */
        public static final AccountCenter f163004a = new AccountCenter();

        private AccountCenter() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253711a(String str, boolean z, PassportLog passportLog, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(passportLog, "logger");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            CommonRequest.Builder a = new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, z).mo171303a(HttpMethod.POST).mo171309a(true).mo171305a("/accounts/official_email/init");
            if (str == null || a.mo171306a("tenant_id", (Object) str) == null) {
                passportLog.mo171471d("FeaturecAPI", "tenantId is Null");
                Unit unit = Unit.INSTANCE;
            }
            CommonRequest a2 = a.mo171310a();
            RequestService.f123287a.mo171365a(a2, aVar);
            return a2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007JZ\u0010\u0003\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J*\u0010\u0014\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150\fH\u0007J0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007JH\u0010\u0019\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u001c"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/FeatureCApi$IdP;", "", "()V", "fetchAuthUrl", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "json", "Lcom/alibaba/fastjson/JSONObject;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "usePacketHost", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "flowType", "", "userId", "domain", "channel", "targetSessionKey", "fetchKAIdPSettings", "Lcom/ss/android/lark/passport/signinsdk_api/idp/IdPSettingResponse;", "idPDispatch", "state", "callbackAtUiThread", "sdkLogin", "idToken", "profile", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.a$b */
    public static final class IdP {

        /* renamed from: a */
        public static final IdP f163005a = new IdP();

        private IdP() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253713a(String str, UniContext uniContext, ICallback<IdPSettingResponse> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            CommonRequest.Builder a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.GET).mo171305a("/accounts/idp/settings");
            if (str != null) {
                a.mo171307a("channel", str);
            }
            return C49199m.m193957a(a.mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253712a(JSONObject jSONObject, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "json");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            CommonRequest.Builder a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.GET).mo171305a("/accounts/idp/auth_url");
            for (Map.Entry entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    Object key = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                    a.mo171307a((String) key, value.toString());
                }
            }
            return C49199m.m193957a(a.mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253716a(String str, boolean z, UniContext uniContext, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(str, "state");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            return C49199m.m193957a(new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/idp/dispatch").mo171306a("state", (Object) str).mo171312b(z).mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253714a(String str, String str2, String str3, String str4, UniContext uniContext, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            CommonRequest.Builder b = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/idp/verify_token").mo171311b(str);
            if (str2 != null) {
                b.mo171306a("channel", (Object) str2);
            }
            if (str3 != null) {
                b.mo171306a("id_token", (Object) str3);
            }
            if (str4 != null) {
                b.mo171306a("profile", (Object) str4);
            }
            return C49199m.m193957a(b.mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253715a(String str, String str2, String str3, String str4, String str5, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            CommonRequest.Builder b = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.GET).mo171305a("/accounts/idp/auth_url").mo171311b(str);
            String str6 = str3;
            boolean z6 = false;
            if (str6 == null || StringsKt.isBlank(str6)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                b.mo171307a("tenant_domain", str3);
            }
            String str7 = str4;
            if (str7 == null || StringsKt.isBlank(str7)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                b.mo171307a("channel", str4);
            }
            String str8 = str2;
            if (str8 == null || StringsKt.isBlank(str8)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                b.mo171307a("user_id", str2);
            }
            String str9 = str5;
            if (str9 == null || StringsKt.isBlank(str9)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                b.mo171307a("target_session_key", str5);
            }
            String str10 = str;
            if (str10 == null || StringsKt.isBlank(str10)) {
                z6 = true;
            }
            if (!z6) {
                b.mo171307a("flow_type", str);
            }
            return C49199m.m193957a(b.mo171310a(), aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007JR\u0010\r\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J:\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007JB\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\u001a"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/FeatureCApi$Retrieve;", "", "()V", "appealGuide", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "token", "", ShareHitPoint.f121869d, "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "realName", "idNumber", "publicKey", "rsaToken", "flowType", "usePacketHost", "", "retrieve", "action", "", "setCredential", "credential", "credentialType", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.a$c */
    public static final class Retrieve {

        /* renamed from: a */
        public static final Retrieve f163006a = new Retrieve();

        private Retrieve() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253719a(String str, String str2, UniContext uniContext, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            return C49199m.m193957a(new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/retrieve/appeal_approved_guide").mo171306a("token", (Object) str).mo171306a(ShareHitPoint.f121869d, (Object) str2).mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253717a(String str, int i, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            return C49199m.m193957a(new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171309a(true).mo171305a("/accounts/retrieve/guide_way").mo171311b(str).mo171306a("action", Integer.valueOf(i)).mo171310a(), aVar);
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253718a(String str, int i, String str2, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
            Intrinsics.checkParameterIsNotNull(str, "credential");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            return C49199m.m193957a(new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/retrieve/reset_cred").mo171311b(str2).mo171306a("cred_content", (Object) str).mo171306a("cred_type", Integer.valueOf(i)).mo171310a(), aVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253720a(String str, String str2, String str3, String str4, String str5, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
            String str6;
            String str7;
            Intrinsics.checkParameterIsNotNull(str, "realName");
            Intrinsics.checkParameterIsNotNull(str2, "idNumber");
            Intrinsics.checkParameterIsNotNull(str3, "publicKey");
            Intrinsics.checkParameterIsNotNull(str4, "rsaToken");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            try {
                Result.Companion aVar2 = Result.Companion;
                str6 = Result.m271569constructorimpl(C49160a.m193858b(str3, str));
            } catch (Throwable th) {
                Result.Companion aVar3 = Result.Companion;
                str6 = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            if (!Result.m271575isFailureimpl(str6)) {
                str = str6;
            }
            String str8 = str;
            try {
                Result.Companion aVar4 = Result.Companion;
                str7 = Result.m271569constructorimpl(C49160a.m193858b(str3, str2));
            } catch (Throwable th2) {
                Result.Companion aVar5 = Result.Companion;
                str7 = Result.m271569constructorimpl(C69097g.m265890a(th2));
            }
            if (!Result.m271575isFailureimpl(str7)) {
                str2 = str7;
            }
            String str9 = str2;
            CommonRequest.Builder b = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171309a(true).mo171305a("/accounts/retrieve/op_three").mo171311b(str5);
            Intrinsics.checkExpressionValueIsNotNull(str8, "cipherName");
            CommonRequest.Builder a = b.mo171306a("real_name", (Object) str8);
            Intrinsics.checkExpressionValueIsNotNull(str9, "cipherIDNumber");
            return C49199m.m193957a(a.mo171306a("id_number", (Object) str9).mo171306a("rsa_token", (Object) str4).mo171310a(), aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/FeatureCApi$Upgrade;", "", "()V", "upgradeToAccountRefactor", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/EnterAppStep;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.a$e */
    public static final class Upgrade {

        /* renamed from: a */
        public static final Upgrade f163008a = new Upgrade();

        private Upgrade() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final AbstractC49347c m253729a(ICallback<EnterAppStep> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            return C49199m.m193957a(new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/app/upgrade/login").mo171314c(false).mo171310a(), aVar);
        }
    }

    private FeatureCApi() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253698a(String str, String str2, RsaInfo rsaInfo, UniContext uniContext, boolean z, ICallback<VerifyPwdData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/pwd/verify").mo171311b(str).mo171309a(true).mo171313c("verify_pwd").mo171310a();
        CommonRequest aVar2 = a;
        C49085f.m193499a(aVar2, str2, rsaInfo);
        RequestService.f123287a.mo171365a(aVar2, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253702a(String str, String str2, String str3, String str4, boolean z, UniContext uniContext, ICallback<ResponseModel<BaseStepData>> aVar) {
        Intrinsics.checkParameterIsNotNull(str2, "industryType");
        Intrinsics.checkParameterIsNotNull(str3, "tenantName");
        Intrinsics.checkParameterIsNotNull(str4, "staffSize");
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("industry_type", str2);
        linkedHashMap.put("staff_size", str4);
        linkedHashMap.put("tenant_name", str3);
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171308a(linkedHashMap).mo171311b(str).mo171305a("/accounts/tenant/prepare").mo171313c("create").mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253700a(String str, String str2, UniContext uniContext, boolean z, boolean z2, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", str);
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            linkedHashMap.put("flow_type", "login");
        } else {
            linkedHashMap.put("flow_type", str2);
        }
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/code/verify").mo171309a(true).mo171308a(linkedHashMap).mo171313c("verify_code").mo171310a();
        if (z2) {
            C49196k.m193953a(a.mo171287f(), "X-Verify-Token", C49216a.m194036a().mo171739a("X-Verify-Token"));
        }
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253703a(String str, boolean z, boolean z2, String str2, UniContext uniContext, boolean z3, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z2) {
            linkedHashMap.put("opt_in", Boolean.valueOf(z));
        }
        linkedHashMap.put("name", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("flow_type", str2);
        CommonRequest a = new CommonRequest.Builder(uniContext, z3).mo171303a(HttpMethod.POST).mo171305a("/accounts/tenant/set_name").mo171308a(linkedHashMap).mo171313c("set_name").mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC49347c m253705a(List list, boolean z, ICallback aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
            Intrinsics.checkExpressionValueIsNotNull(allUserList, "ServiceFinder.userListService.allUserList");
            List<User> list2 = allUserList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            list = arrayList;
        }
        return m253704a(list, z, aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253704a(List<String> list, boolean z, ICallback<CheckStatusResp> aVar) {
        Intrinsics.checkParameterIsNotNull(list, "userIdList");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest a = new CommonRequest.Builder(UniContext.CONTEXT_SWITCH, false).mo171303a(HttpMethod.POST).mo171309a(true).mo171314c(z).mo171305a("/accounts/status/check_status").mo171306a("user_ids", list).mo171310a();
        RequestService.f123287a.mo171365a(a, new C64573f(aVar));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253701a(String str, String str2, String str3, UniContext uniContext, PassportLog passportLog, ICallback<SwitchUserData> aVar) {
        Intrinsics.checkParameterIsNotNull(passportLog, "logger");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest.Builder a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171309a(true).mo171305a("/accounts/switch_identity");
        if (str == null || a.mo171306a("user_id", (Object) str) == null) {
            passportLog.mo171471d("FeaturecAPI", "userId is Null");
            Unit unit = Unit.INSTANCE;
        }
        if (str2 == null || a.mo171306a("credential_id", (Object) str2) == null) {
            passportLog.mo171471d("FeaturecAPI", "credentialId is Null");
            Unit unit2 = Unit.INSTANCE;
        }
        if (str3 != null) {
            a.mo171306a("session_key", (Object) str3);
        }
        CommonRequest a2 = a.mo171310a();
        RequestService.f123287a.mo171365a(a2, aVar);
        return a2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253699a(String str, String str2, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "otpCode");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", str);
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            linkedHashMap.put("flow_type", "login");
        } else {
            linkedHashMap.put("flow_type", str2);
        }
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/otp/verify").mo171309a(true).mo171308a(linkedHashMap).mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253697a(String str, Integer num, String str2, String str3, UniContext uniContext, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("credential", str);
        if (num == null) {
            num = "";
        }
        linkedHashMap.put("credential_type", num);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("identity_id", str3);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("scope", str2);
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/verify_token/apply").mo171309a(true).mo171308a(linkedHashMap).mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253707a(boolean z, boolean z2, String str, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(null, z2).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/choose_opt_in").mo171306a("opt_in", Boolean.valueOf(z)).mo171311b(str).mo171310a(), aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0004H\u0001J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/FeatureCApi$checkStatus$2", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/CheckStatusResp;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.a$f */
    public static final class C64573f implements ICallback<CheckStatusResp> {

        /* renamed from: a */
        final /* synthetic */ ICallback f163009a;

        /* renamed from: b */
        private final /* synthetic */ ICallback f163010b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return this.f163010b.mo101474a();
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            this.f163010b.mo101475a(networkErrorResult);
        }

        C64573f(ICallback aVar) {
            this.f163009a = aVar;
            this.f163010b = aVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<CheckStatusResp> responseModel) {
            Map<String, Integer> map;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f163009a.mo101476a(responseModel);
            CheckStatusResp data = responseModel.getData();
            if (data == null || (map = data.userStatusMap) == null) {
                PassportLog.f123351c.mo171474a().mo171471d("FeaturecAPI", "path: /accounts/status/check_status, userStatusMap is null");
            } else {
                ServiceFinder.m193744a().updateUserStatus(map);
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC49347c m253708b(UniContext uniContext, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest.Builder aVar2 = new CommonRequest.Builder(uniContext, false);
        aVar2.mo171303a(HttpMethod.GET).mo171309a(true).mo171305a("/accounts/idp/ua");
        CommonRequest a = aVar2.mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC49347c m253710b(boolean z, ICallback<List<ResponseUser>> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, false).mo171303a(HttpMethod.POST).mo171305a("/accounts/security/user/list").mo171314c(z).mo171309a(true).mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253694a(UniContext uniContext, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest.Builder aVar2 = new CommonRequest.Builder(uniContext, true);
        aVar2.mo171303a(HttpMethod.GET).mo171305a("/accounts/register/prepare_tenant");
        CommonRequest a = aVar2.mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253691a(int i, UniContext uniContext, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.GET).mo171305a("/accounts/deprovision/check").mo171307a("scene", String.valueOf(i)).mo171307a(ShareHitPoint.f121868c, "1").mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC49347c m253709b(String str, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "flowType");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("flow_type", str);
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            linkedHashMap.put("flow_type", "bio_bind");
        }
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/bio/verify").mo171309a(true).mo171308a(linkedHashMap).mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253695a(String str, int i, UniContext uniContext, ICallback<ResponseModel<BaseStepData>> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "credential");
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("credential", str);
        linkedHashMap.put("credential_type", Integer.valueOf(i));
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171308a(linkedHashMap).mo171305a("/accounts/login/credential").mo171313c("login_type").mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253696a(String str, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "flowType");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("flow_type", str);
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            linkedHashMap.put("flow_type", "bio_bind");
        }
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/bio/ticket").mo171309a(true).mo171308a(linkedHashMap).mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253692a(int i, String str, UniContext uniContext, boolean z, boolean z2, ICallback<ApplyCodeData> aVar) {
        boolean z3;
        CommonRequest aVar2;
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code_type", Integer.valueOf(i));
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            linkedHashMap.put("flow_type", "login");
        } else {
            linkedHashMap.put("flow_type", str);
        }
        if (uniContext == null || (aVar2 = new CommonRequest.Builder(uniContext, z).mo171308a(linkedHashMap).mo171305a("/accounts/auth/code/apply").mo171303a(HttpMethod.POST).mo171313c("apply_code").mo171310a()) == null) {
            aVar2 = new CommonRequest.Builder(UniContext.CONTEXT_START_UP, z).mo171308a(linkedHashMap).mo171305a("/accounts/auth/code/apply").mo171303a(HttpMethod.POST).mo171313c("apply_code").mo171310a();
        }
        if (z2) {
            C49196k.m193953a(aVar2.mo171287f(), "X-Verify-Token", C49216a.m194036a().mo171739a("X-Verify-Token"));
        }
        RequestService.f123287a.mo171365a(aVar2, aVar);
        return aVar2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253693a(int i, String str, String str2, int i2, String str3, UniContext uniContext, boolean z, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "cpValue");
        Intrinsics.checkParameterIsNotNull(str2, "nameValue");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest a = new CommonRequest.Builder(uniContext, z).mo171303a(HttpMethod.POST).mo171306a("credential", (Object) str).mo171306a("credential_type", Integer.valueOf(i)).mo171306a("name", (Object) str2).mo171306a(ShareHitPoint.f121868c, Integer.valueOf(i2)).mo171311b(str3).mo171305a("/accounts/tenant/information").mo171310a();
        RequestService.f123287a.mo171365a(a, aVar);
        return a;
    }
}
