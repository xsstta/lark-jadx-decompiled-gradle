package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016J%\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/MailtoAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "apiNames", "", "getArgsArray", "", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "key", "(Lcom/tt/refer/abs/api/entity/APIInvokeData;Ljava/lang/String;)[Ljava/lang/String;", "getMailToIntent", "Landroid/content/Intent;", "handleAPI", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
@Deprecated(message = "use mail to plugin")
@ApiSupportType(apiName = {"mailto"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.i */
public final class MailtoAsyncHandler extends AbstractC65797c {

    /* renamed from: a */
    public static final Companion f60981a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/MailtoAsyncHandler$Companion;", "", "()V", "KEY_ARGS_BCC", "", "KEY_ARGS_BODY", "KEY_ARGS_CC", "KEY_ARGS_SUBJECT", "KEY_ARGS_TO", "MAIL_PROTOCOL", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.i$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MailtoAsyncHandler() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("mailto");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…stant.AppApi.API_MAIL_TO)");
        return singletonList;
    }

    /* renamed from: c */
    private final Intent m89951c(C67701b bVar) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", m89950a(bVar, "to"));
        intent.putExtra("android.intent.extra.CC", m89950a(bVar, "cc"));
        intent.putExtra("android.intent.extra.BCC", m89950a(bVar, "bcc"));
        intent.putExtra("android.intent.extra.SUBJECT", (String) bVar.mo234984a("subject"));
        intent.putExtra("android.intent.extra.TEXT", (String) bVar.mo234984a("body"));
        return intent;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apiInvokeData");
        AbstractC67709b.AbstractC67710a h = mo230475h();
        Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
        Activity f = h.mo235051f();
        if (f != null) {
            try {
                f.startActivity(m89951c(bVar));
                mo230494j();
            } catch (Exception e) {
                AppBrandLogger.m52829e("MailtoAsyncHandler", e.getMessage());
                mo230486a(e);
            }
            if (f != null) {
                return;
            }
        }
        mo230493c(ApiCallResultHelper.generateDataNullExtraInfo("activity"));
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailtoAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }

    /* renamed from: a */
    private final String[] m89950a(C67701b bVar, String str) {
        JSONArray jSONArray = (JSONArray) bVar.mo234984a(str);
        if (jSONArray != null) {
            int length = jSONArray.length();
            if (length == 0) {
                AppBrandLogger.m52830i("MailtoAsyncHandler", "size is 0");
                return null;
            }
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArray.optString(i);
            }
            return strArr;
        }
        AppBrandLogger.m52830i("MailtoAsyncHandler", "param is null, key " + str + ' ');
        return null;
    }
}
