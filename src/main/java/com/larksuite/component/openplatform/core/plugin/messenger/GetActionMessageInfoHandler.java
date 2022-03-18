package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.launchaction.ActionMessageLoadManager;
import com.tt.miniapp.launchaction.bean.ActionMessageResult;
import com.tt.miniapp.launchaction.bean.C66303a;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "apiNames", "", "callbackOkWithMessages", "", "actionTime", "", "messages", "", "Lcom/tt/miniapp/launchaction/bean/ActionMessageResult$ContentDetail;", "handleAPI", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
@Deprecated(message = "unused", replaceWith = @ReplaceWith(expression = "GetActionMessageInfoPlugin", imports = {}))
@ApiSupportType(apiName = {"getBlockActionSourceDetail"}, support = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.m */
public final class GetActionMessageInfoHandler extends AbstractC65797c {

    /* renamed from: a */
    public static final Companion f61596a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoHandler$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.m$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetActionMessageInfoHandler() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("getBlockActionSourceDetail");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…PI_GET_BLOCK_ACTION_INFO)");
        return singletonList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.m$c */
    static final class C25230c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ GetActionMessageInfoHandler f61598a;

        C25230c(GetActionMessageInfoHandler mVar) {
            this.f61598a = mVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            AppBrandLogger.m52829e("GetActionMessageInfo", th);
            this.f61598a.mo230486a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tt/miniapp/launchaction/bean/ActionMessageLoadResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.m$b */
    static final class C25229b<T> implements Consumer<C66303a> {

        /* renamed from: a */
        final /* synthetic */ GetActionMessageInfoHandler f61597a;

        C25229b(GetActionMessageInfoHandler mVar) {
            this.f61597a = mVar;
        }

        /* renamed from: a */
        public final void accept(C66303a aVar) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
            ActionMessageResult b = aVar.mo231755b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "messageResult");
                if (b.isSuccess()) {
                    GetActionMessageInfoHandler mVar = this.f61597a;
                    long c = aVar.mo231756c();
                    Map<String, ActionMessageResult.ContentDetail> messageContents = b.getMessageContents();
                    if (messageContents == null) {
                        Intrinsics.throwNpe();
                    }
                    mVar.mo88334a(c, messageContents.values());
                    return;
                }
                this.f61597a.mo230481a(ApiCode.GETBLOCKACTIONSOURCEDETAIL_GET_BLOCK_ACTION_FAIL);
                return;
            }
            GetActionMessageInfoHandler mVar2 = this.f61597a;
            int a = aVar.mo231754a();
            if (a == C66303a.f167330d) {
                mVar2.mo230481a(ApiCode.GETBLOCKACTIONSOURCEDETAIL_CODE_INVALID);
            } else if (a == C66303a.f167329c) {
                mVar2.mo230481a(ApiCode.GENERAL_JSON_ERROR);
            } else {
                mVar2.mo230481a(ApiCode.GETBLOCKACTIONSOURCEDETAIL_GET_BLOCK_ACTION_FAIL);
            }
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "apiInvokeData");
        AbstractC67709b.AbstractC67710a h = mo230475h();
        IAppContext f = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
        String g = h.mo235054g(f.getAppId());
        if (g != null) {
            boolean z2 = true;
            if (g.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Object a = bVar.mo234985a("triggerCode", "");
                Intrinsics.checkExpressionValueIsNotNull(a, "apiInvokeData.getParam(\"triggerCode\", \"\")");
                String str = (String) a;
                if (str.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    mo230481a(ApiCode.GETBLOCKACTIONSOURCEDETAIL_CODE_EMPTY);
                    return;
                }
                ActionMessageLoadManager aVar = ActionMessageLoadManager.f167308a;
                IAppContext f2 = mo230473f();
                Intrinsics.checkExpressionValueIsNotNull(f2, "appContext");
                aVar.mo231697a(f2, str).subscribe(new C25229b(this), new C25230c(this));
                return;
            }
        }
        mo230481a(ApiCode.GETBLOCKACTIONSOURCEDETAIL_PLATFORM_SESSION_EMPTY);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetActionMessageInfoHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00da A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88334a(long r10, java.util.Collection<? extends com.tt.miniapp.launchaction.bean.ActionMessageResult.ContentDetail> r12) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.GetActionMessageInfoHandler.mo88334a(long, java.util.Collection):void");
    }
}
