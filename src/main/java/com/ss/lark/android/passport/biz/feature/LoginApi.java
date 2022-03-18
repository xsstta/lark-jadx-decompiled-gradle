package com.ss.lark.android.passport.biz.feature;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40651r;
import com.ss.android.lark.p2069j.p2070a.C40655v;
import com.ss.android.lark.passport.infra.base.network.C49085f;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.base.network.service.RequestService;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49199m;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.C49366a;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import com.ss.android.lark.utils.UIHelper;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001EB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0007J \u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0007JB\u0010\u001d\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0007J0\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007J2\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007J\u0018\u0010)\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001aH\u0007J.\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0007J,\u0010,\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007J0\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u0001012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007J:\u00102\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u0001052\u0006\u0010%\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007J4\u00106\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001aH\u0007J<\u0010<\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u00020!2\u0006\u00109\u001a\u00020:2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001aH\u0007JD\u0010?\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010(\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f2\u0006\u00109\u001a\u00020:2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001aH\u0007J0\u0010@\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u001aH\u0007J(\u0010D\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/LoginApi;", "", "()V", "KEY_AUTHZ", "", "KEY_IS_MULTI_LOGIN", "KEY_SCOPES", "KEY_TOKEN", "TAG", "TAG_APPLY_DEVICE_LOGIN_ID", "TAG_APP_ID", "TAG_FLOW_TYPE", "TAG_FROM", "TAG_LOGOUT_TIME", "TAG_LOGOUT_TOKENS", "TAG_MOBILE_RISK", "TAG_OLD_ACCESS_TOKEN", "TAG_SESSION_KEYS", "TAG_TENANT_ID", "TAG_USER_ID", "authLoginCancel", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "token", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "authLoginCheck", "authLoginConfirm", "scopeList", "", "isMultiLogin", "", "emailCreate", "tenantId", "flowType", "usePackageDomain", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "enterApp", "userId", "logout", "logoutApp", "sessions", "logoutToken", "tokens", "mobileAuth", "from", "securityScanResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SecurityScanResult;", "setPassword", "pwd", "rsaInfo", "Lcom/ss/android/lark/passport/infra/base/network/model/RsaInfo;", "ssoSdkAuthAutoCheck", "authRequestData", "Lcom/ss/android/lark/passport/signinsdk_api/entity/AuthRequestData;", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SSOConfirmStepInfo;", "ssoSdkAuthCheck", "isChallengeMode", "Lcom/ss/android/lark/passport/signinsdk_api/entity/AuthInfo;", "ssoSdkAuthConfirm", "switchUser", "oldAccessToken", "deviceLoginId", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SwitchTenantResponse;", "tenantCreate", "SSOSdkAuth", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.b */
public final class LoginApi {

    /* renamed from: a */
    public static final LoginApi f163110a = new LoginApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginCancel$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$b */
    public static final class C64639b implements AbstractC49348a {
        C64639b() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40651r rVar = C40651r.f103147i;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…OGIN_CANCLE_REQUEST_START");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40651r rVar = C40651r.f103148j;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…LOGIN_CANCLE_REQUEST_SUCC");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40651r rVar = C40651r.f103149k;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…LOGIN_CANCLE_REQUEST_FAIL");
            return rVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginCheck$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$d */
    public static final class C64643d implements AbstractC49348a {
        C64643d() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40651r rVar = C40651r.f103139a;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…_LOGIN_SCAN_REQUEST_START");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40651r rVar = C40651r.f103140b;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…R_LOGIN_SCAN_REQUEST_SUCC");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40651r rVar = C40651r.f103141c;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…R_LOGIN_SCAN_REQUEST_FAIL");
            return rVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginConfirm$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$f */
    public static final class C64645f implements AbstractC49348a {
        C64645f() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40651r rVar = C40651r.f103144f;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…GIN_CONFIRM_REQUEST_START");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40651r rVar = C40651r.f103145g;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…OGIN_CONFIRM_REQUEST_SUCC");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40651r rVar = C40651r.f103146h;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…OGIN_CONFIRM_REQUEST_FAIL");
            return rVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$logoutApp$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$h */
    public static final class C64647h implements AbstractC49348a {
        C64647h() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40655v vVar = C40655v.f103207d;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…_LOGOUT_APP_REQUEST_START");
            return vVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40655v vVar = C40655v.f103208e;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…T_LOGOUT_APP_REQUEST_SUCC");
            return vVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40655v vVar = C40655v.f103209f;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…T_LOGOUT_APP_REQUEST_FAIL");
            return vVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$logoutToken$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$i */
    public static final class C64648i implements AbstractC49348a {
        C64648i() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40655v vVar = C40655v.f103213j;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…OGOUT_TOKEN_REQUEST_START");
            return vVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40655v vVar = C40655v.f103214k;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…LOGOUT_TOKEN_REQUEST_SUCC");
            return vVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40655v vVar = C40655v.f103215l;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…LOGOUT_TOKEN_REQUEST_FAIL");
            return vVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$ssoSdkAuthAutoCheck$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$k */
    public static final class C64650k implements AbstractC49348a {
        C64650k() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40651r rVar = C40651r.f103152n;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…_LOGIN_AUTH_REQUEST_START");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40651r rVar = C40651r.f103153o;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…K_LOGIN_AUTH_REQUEST_SUCC");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40651r rVar = C40651r.f103154p;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…K_LOGIN_AUTH_REQUEST_FAIL");
            return rVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$ssoSdkAuthCheck$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$m */
    public static final class C64652m implements AbstractC49348a {
        C64652m() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            return C40651r.f103153o;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            C40651r rVar = C40651r.f103152n;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…_LOGIN_AUTH_REQUEST_START");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40651r rVar = C40651r.f103154p;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…K_LOGIN_AUTH_REQUEST_FAIL");
            return rVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$ssoSdkAuthConfirm$request$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getFailCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "getStartCode", "getSuccessCode", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$o */
    public static final class C64654o implements AbstractC49348a {
        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: a */
        public OPMonitorCode mo171971a() {
            return null;
        }

        C64654o() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: b */
        public OPMonitorCode mo171972b() {
            C40651r rVar = C40651r.f103155q;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…AUTH_CONFIRM_REQUEST_SUCC");
            return rVar;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a
        /* renamed from: c */
        public OPMonitorCode mo171973c() {
            C40651r rVar = C40651r.f103156r;
            Intrinsics.checkExpressionValueIsNotNull(rVar, "EPMClientPassportMonitor…AUTH_CONFIRM_REQUEST_FAIL");
            return rVar;
        }
    }

    private LoginApi() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253951a(String str, IGetDataCallback<BaseStepData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        CommonRequest a = new CommonRequest.Builder(WatcherUniContext.f123348l.mo171433a(), false).mo171303a(HttpMethod.POST).mo171309a(true).mo171308a(MapsKt.mutableMapOf(TuplesKt.to("token", str))).mo171305a("/accounts/qrlogin/scan").mo171304a(new C64643d()).mo171310a();
        RequestService.f123287a.mo171365a(a, new C64640c(iGetDataCallback));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253953a(String str, String str2, SecurityScanResult securityScanResult, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "from");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("from", str), TuplesKt.to("token", str2));
        if (securityScanResult != null) {
            mutableMapOf.put("mobile_risk", securityScanResult);
        }
        return C49199m.m193957a(new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, false).mo171303a(HttpMethod.POST).mo171312b(true).mo171308a(mutableMapOf).mo171305a("/accounts/login/mobile_auth").mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253954a(String str, String str2, boolean z, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest.Builder a = new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, z).mo171303a(HttpMethod.POST);
        if (str != null) {
            a.mo171306a("user_id", (Object) str);
        }
        return C49199m.m193957a(a.mo171311b(str2).mo171305a("/accounts/app").mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253955a(String str, boolean z, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/tenant/create").mo171311b(str).mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253949a(UniContext uniContext, List<String> list, IGetDataCallback<BaseStepData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        Intrinsics.checkParameterIsNotNull(list, "sessions");
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171309a(true).mo171305a("/accounts/logout/app").mo171312b(false).mo171308a(MapsKt.mutableMapOf(TuplesKt.to("app_id", Integer.valueOf(ServiceFinder.m193752g().getAppId())), TuplesKt.to("logout_time", Long.valueOf(System.currentTimeMillis())), TuplesKt.to("session_keys", list))).mo171304a(new C64647h()).mo171310a();
        C49199m.m193957a(a, new C64646g(iGetDataCallback));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253950a(UniContext uniContext, List<String> list, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        Intrinsics.checkParameterIsNotNull(list, "tokens");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171309a(false).mo171305a("/accounts/logout/token").mo171312b(false).mo171308a(MapsKt.mutableMapOf(TuplesKt.to("app_id", Integer.valueOf(ServiceFinder.m193752g().getAppId())), TuplesKt.to("logout_time", Long.valueOf(System.currentTimeMillis())), TuplesKt.to("logout_tokens", list))).mo171304a(new C64648i()).mo171310a();
        C49199m.m193957a(a, aVar);
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginCancel$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$a */
    public static final class C64638a implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163111a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        C64638a(IGetDataCallback iGetDataCallback) {
            this.f163111a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163111a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f163111a;
            if (iGetDataCallback != null) {
                BaseStepData data = responseModel.getData();
                if (data == null) {
                    Intrinsics.throwNpe();
                }
                iGetDataCallback.onSuccess(data);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginCheck$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$c */
    public static final class C64640c implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163112a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginCheck$1$onError$3$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/app/Activity;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "activity", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.b$c$a */
        public static final class C64641a implements IGetDataCallback<Activity> {

            /* renamed from: a */
            final /* synthetic */ NetworkErrorResult f163113a;

            C64641a(NetworkErrorResult networkErrorResult) {
                this.f163113a = networkErrorResult;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                PassportLog.f123351c.mo171474a().mo171471d("n_action_qrlogin_scan_request_fail", "getLastTopActivity is null");
            }

            /* renamed from: a */
            public void onSuccess(Activity activity) {
                PassportLog.f123351c.mo171474a().mo171468c("n_action_qrlogin_scan_request_fail", "getLastTopActivity is not null");
                if (activity != null) {
                    String errorMessage = this.f163113a.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = C49154ag.m193830a((Context) activity, (int) R.string.Lark_Legacy_AnalysQRFail);
                    }
                    Intrinsics.checkExpressionValueIsNotNull(errorMessage, "msg");
                    ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).title(R.string.Lark_Legacy_LarkTip)).message(errorMessage)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_IKnow, DialogInterface$OnClickListenerC64679c.f163172a)).show();
                }
            }
        }

        C64640c(IGetDataCallback iGetDataCallback) {
            this.f163112a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f163112a;
            if (iGetDataCallback != null) {
                BaseStepData data = responseModel.getData();
                if (data == null) {
                    Intrinsics.throwNpe();
                }
                iGetDataCallback.onSuccess(data);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163112a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
            if (networkErrorResult.getErrorCode() == 4402) {
                Activity topActivity = ServiceFinder.m193748c().getTopActivity();
                if (topActivity != null) {
                    if (topActivity != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        topActivity = null;
                    }
                    if (topActivity != null) {
                        String errorMessage = networkErrorResult.getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = C49154ag.m193830a((Context) topActivity, (int) R.string.Lark_Legacy_AnalysQRFail);
                        }
                        Intrinsics.checkExpressionValueIsNotNull(errorMessage, "msg");
                        if (((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(topActivity).title(R.string.Lark_Legacy_LarkTip)).message(errorMessage)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_IKnow, DialogInterface$OnClickListenerC64642b.f163114a)).show() != null) {
                            return;
                        }
                    }
                }
                PassportLog.f123351c.mo171474a().mo171468c("n_action_qrlogin_scan_request_fail", "topActivity is null");
                ServiceFinder.m193752g().getLastTopActivity(new C64641a(networkErrorResult));
                Unit unit = Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.b$c$b */
        static final class DialogInterface$OnClickListenerC64642b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC64642b f163114a = new DialogInterface$OnClickListenerC64642b();

            DialogInterface$OnClickListenerC64642b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$authLoginConfirm$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$e */
    public static final class C64644e implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163115a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        C64644e(IGetDataCallback iGetDataCallback) {
            this.f163115a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163115a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f163115a;
            if (iGetDataCallback != null) {
                BaseStepData data = responseModel.getData();
                if (data == null) {
                    Intrinsics.throwNpe();
                }
                iGetDataCallback.onSuccess(data);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$logoutApp$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$g */
    public static final class C64646g implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163116a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        C64646g(IGetDataCallback iGetDataCallback) {
            this.f163116a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163116a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f163116a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(responseModel.getData());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$ssoSdkAuthAutoCheck$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$j */
    public static final class C64649j implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163117a;

        /* renamed from: b */
        final /* synthetic */ PassportLog f163118b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163117a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            if (data != null) {
                jSONObject = data.stepInfo;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                SSOConfirmStepInfo sSOConfirmStepInfo = (SSOConfirmStepInfo) C49202p.m193967a(data.stepInfo, SSOConfirmStepInfo.class);
                if (sSOConfirmStepInfo != null) {
                    IGetDataCallback iGetDataCallback = this.f163117a;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(sSOConfirmStepInfo);
                        return;
                    }
                    return;
                }
                IGetDataCallback iGetDataCallback2 = this.f163117a;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onError(new ErrorResult(-1, UIHelper.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus)));
                }
                this.f163118b.mo171471d("LoginApi", "ssoSdkAuthAutoCheck step_info parse result is null in /accounts/auth_login/oauth2/sdk");
                return;
            }
            IGetDataCallback iGetDataCallback3 = this.f163117a;
            if (iGetDataCallback3 != null) {
                iGetDataCallback3.onError(new ErrorResult(-1, UIHelper.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus)));
            }
            this.f163118b.mo171471d("LoginApi", "ssoSdkAuthAutoCheck step_info is null in /accounts/auth_login/oauth2/sdk");
        }

        C64649j(IGetDataCallback iGetDataCallback, PassportLog passportLog) {
            this.f163117a = iGetDataCallback;
            this.f163118b = passportLog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$ssoSdkAuthCheck$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$l */
    public static final class C64651l implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163119a;

        /* renamed from: b */
        final /* synthetic */ PassportLog f163120b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163119a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            if (data != null) {
                jSONObject = data.stepInfo;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                AuthInfo authInfo = (AuthInfo) C49202p.m193967a(data.stepInfo, AuthInfo.class);
                if (authInfo != null) {
                    IGetDataCallback iGetDataCallback = this.f163119a;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(authInfo);
                        return;
                    }
                    return;
                }
                IGetDataCallback iGetDataCallback2 = this.f163119a;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onError(new ErrorResult(-1, UIHelper.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus)));
                }
                this.f163120b.mo171471d("LoginApi", "ssoSdkAuthCheck step_info parse result is null in /accounts/auth_login/oauth2/sdk");
                return;
            }
            IGetDataCallback iGetDataCallback3 = this.f163119a;
            if (iGetDataCallback3 != null) {
                iGetDataCallback3.onError(new ErrorResult(-1, UIHelper.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus)));
            }
            this.f163120b.mo171471d("LoginApi", "ssoSdkAuthCheck step_info is null in /accounts/auth_login/oauth2/sdk");
        }

        C64651l(IGetDataCallback iGetDataCallback, PassportLog passportLog) {
            this.f163119a = iGetDataCallback;
            this.f163120b = passportLog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/feature/LoginApi$ssoSdkAuthConfirm$3", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.b$n */
    public static final class C64653n implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f163121a;

        /* renamed from: b */
        final /* synthetic */ PassportLog f163122b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f163121a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            BaseStepData data = responseModel.getData();
            if (data != null) {
                jSONObject = data.stepInfo;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                SSOConfirmStepInfo sSOConfirmStepInfo = (SSOConfirmStepInfo) C49202p.m193967a(data.stepInfo, SSOConfirmStepInfo.class);
                if (sSOConfirmStepInfo != null) {
                    IGetDataCallback iGetDataCallback = this.f163121a;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(sSOConfirmStepInfo);
                        return;
                    }
                    return;
                }
                IGetDataCallback iGetDataCallback2 = this.f163121a;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onError(new ErrorResult(-1, UIHelper.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus)));
                }
                this.f163122b.mo171471d("LoginApi", "step_info parse result is  null in /accounts/auth_login/confirm");
                return;
            }
            IGetDataCallback iGetDataCallback3 = this.f163121a;
            if (iGetDataCallback3 != null) {
                iGetDataCallback3.onError(new ErrorResult(-1, UIHelper.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus)));
            }
            this.f163122b.mo171471d("LoginApi", "step_info is null in /accounts/auth_login/confirm");
        }

        C64653n(IGetDataCallback iGetDataCallback, PassportLog passportLog) {
            this.f163121a = iGetDataCallback;
            this.f163122b = passportLog;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253946a(UniContext uniContext, String str, IGetDataCallback<BaseStepData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171309a(true).mo171308a(MapsKt.mutableMapOf(TuplesKt.to("token", str))).mo171305a("/accounts/qrlogin/cancel").mo171304a(new C64639b()).mo171310a();
        RequestService.f123287a.mo171365a(a, new C64638a(iGetDataCallback));
        return a;
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC49347c m253956b(String str, String str2, boolean z, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "tenantId");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, z).mo171303a(HttpMethod.POST).mo171306a("tenant_id", (Object) str).mo171311b(str2).mo171305a("/accounts/official_email/create").mo171310a(), aVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253944a(UniContext uniContext, C49366a aVar, PassportLog passportLog, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(passportLog, "logger");
        if (uniContext != null) {
            uniContext.appendOneSceneMonitorParam("is_internal", "true");
        }
        CommonRequest.Builder a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.GET).mo171309a(true).mo171314c(false).mo171305a("/accounts/auth_login/oauth2/sdk").mo171304a(new C64650k());
        if (!(aVar == null || aVar.f123890a == null)) {
            String str = aVar.f123890a;
            Intrinsics.checkExpressionValueIsNotNull(str, "authRequestData.appId");
            a.mo171307a("app_id", str);
        }
        if (!(aVar == null || aVar.f123891b == null)) {
            String str2 = aVar.f123891b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "authRequestData.packageId");
            a.mo171307a("package_id", str2);
        }
        if (!(aVar == null || aVar.f123894e == null)) {
            String str3 = aVar.f123894e;
            Intrinsics.checkExpressionValueIsNotNull(str3, "authRequestData.signature");
            a.mo171307a("signature", str3);
        }
        if (!(aVar == null || aVar.f123896g == null)) {
            String str4 = aVar.f123896g;
            Intrinsics.checkExpressionValueIsNotNull(str4, "authRequestData.scope");
            a.mo171307a("scope", str4);
        }
        if (!(aVar == null || aVar.f123895f == null)) {
            String str5 = aVar.f123895f;
            Intrinsics.checkExpressionValueIsNotNull(str5, "authRequestData.redirectUri");
            a.mo171307a("redirect_uri", str5);
        }
        if (!(aVar == null || aVar.f123893d == null)) {
            String str6 = aVar.f123893d;
            Intrinsics.checkExpressionValueIsNotNull(str6, "authRequestData.state");
            a.mo171307a("state", str6);
        }
        if (!(aVar == null || aVar.f123892c == null)) {
            String str7 = aVar.f123892c;
            Intrinsics.checkExpressionValueIsNotNull(str7, "authRequestData.responseType");
            a.mo171307a("response_type", str7);
        }
        if (aVar != null) {
            a.mo171307a(ShareHitPoint.f121868c, "sso_android");
        }
        CommonRequest a2 = a.mo171310a();
        RequestService.f123287a.mo171365a(a2, new C64649j(iGetDataCallback, passportLog));
        return a2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253952a(String str, String str2, RsaInfo rsaInfo, boolean z, ICallback<BaseStepData> aVar) {
        Intrinsics.checkParameterIsNotNull(str2, "pwd");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        CommonRequest a = new CommonRequest.Builder(UniContext.CONTEXT_GLOBAL, z).mo171303a(HttpMethod.POST).mo171305a("/accounts/auth/pwd/set").mo171310a();
        Map<String, Object> i = a.mo171290i();
        if (str == null) {
            str = "";
        }
        i.put("flow_type", str);
        CommonRequest aVar2 = a;
        C49085f.m193499a(aVar2, str2, rsaInfo);
        RequestService.f123287a.mo171365a(aVar2, aVar);
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253945a(UniContext uniContext, C49366a aVar, boolean z, PassportLog passportLog, IGetDataCallback<AuthInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(passportLog, "logger");
        if (uniContext != null) {
            uniContext.appendOneSceneMonitorParam("is_internal", "false");
        }
        CommonRequest.Builder a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.GET).mo171309a(true).mo171305a("/accounts/auth_login/oauth2/sdk").mo171304a(new C64652m());
        if (!(aVar == null || aVar.f123890a == null)) {
            String str = aVar.f123890a;
            Intrinsics.checkExpressionValueIsNotNull(str, "authRequestData.appId");
            a.mo171307a("app_id", str);
        }
        if (aVar != null) {
            a.mo171307a(ShareHitPoint.f121868c, "sso_android");
        }
        if (aVar != null) {
            a.mo171307a("sdk_platform", "Android");
        }
        if (!(aVar == null || aVar.f123891b == null)) {
            String str2 = aVar.f123891b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "authRequestData.packageId");
            a.mo171307a("package_id", str2);
        }
        if (!(aVar == null || aVar.f123892c == null)) {
            String str3 = aVar.f123892c;
            Intrinsics.checkExpressionValueIsNotNull(str3, "authRequestData.responseType");
            a.mo171307a("response_type", str3);
        }
        if (!(aVar == null || aVar.f123893d == null)) {
            String str4 = aVar.f123893d;
            Intrinsics.checkExpressionValueIsNotNull(str4, "authRequestData.state");
            a.mo171307a("state", str4);
        }
        if (!(aVar == null || aVar.f123894e == null)) {
            String str5 = aVar.f123894e;
            Intrinsics.checkExpressionValueIsNotNull(str5, "authRequestData.signature");
            a.mo171307a("signature", str5);
        }
        if (!(aVar == null || aVar.f123895f == null)) {
            String str6 = aVar.f123895f;
            Intrinsics.checkExpressionValueIsNotNull(str6, "authRequestData.redirectUri");
            a.mo171307a("redirect_uri", str6);
        }
        if (!(aVar == null || aVar.f123896g == null)) {
            String str7 = aVar.f123896g;
            Intrinsics.checkExpressionValueIsNotNull(str7, "authRequestData.scope");
            a.mo171307a("scope", str7);
        }
        if (z) {
            if (!(aVar == null || aVar.f123898i == null)) {
                String str8 = aVar.f123898i;
                Intrinsics.checkExpressionValueIsNotNull(str8, "authRequestData.codeChallengeMethod");
                a.mo171307a("code_challenge_method", str8);
            }
            if (!(aVar == null || aVar.f123897h == null)) {
                String str9 = aVar.f123897h;
                Intrinsics.checkExpressionValueIsNotNull(str9, "authRequestData.codeChallenge");
                a.mo171307a("code_challenge", str9);
            }
        }
        CommonRequest a2 = a.mo171310a();
        RequestService.f123287a.mo171365a(a2, new C64651l(iGetDataCallback, passportLog));
        return a2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253947a(UniContext uniContext, String str, List<String> list, PassportLog passportLog, IGetDataCallback<SSOConfirmStepInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(passportLog, "logger");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("user_id", str);
        }
        if (list != null) {
            linkedHashMap.put("authz", MapsKt.mutableMapOf(TuplesKt.to("scopes", list)));
        }
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171309a(true).mo171308a(linkedHashMap).mo171305a("/accounts/auth_login/confirm").mo171304a(new C64654o()).mo171310a();
        RequestService.f123287a.mo171365a(a, new C64653n(iGetDataCallback, passportLog));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253948a(UniContext uniContext, String str, List<String> list, boolean z, IGetDataCallback<BaseStepData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("token", str), TuplesKt.to("is_multi_login", Boolean.valueOf(z)));
        if (list != null) {
            mutableMapOf.put("authz", MapsKt.mutableMapOf(TuplesKt.to("scopes", list)));
        }
        CommonRequest a = new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.POST).mo171309a(true).mo171308a(mutableMapOf).mo171305a("/accounts/qrlogin/confirm").mo171304a(new C64645f()).mo171310a();
        RequestService.f123287a.mo171365a(a, new C64644e(iGetDataCallback));
        return a;
    }
}
