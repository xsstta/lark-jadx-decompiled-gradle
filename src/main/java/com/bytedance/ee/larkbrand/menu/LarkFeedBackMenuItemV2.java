package com.bytedance.ee.larkbrand.menu;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.suite.R;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.item.C66937e;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\t\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/larkbrand/menu/LarkFeedBackMenuItemV2;", "Lcom/tt/miniapp/titlemenu/item/MenuItemAdapter;", "activity", "Landroid/app/Activity;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "feedBackAppLink", "", "(Landroid/app/Activity;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;Ljava/lang/String;)V", "LAUNCH_QUERY_KEY", "TAG", "appInfoEntity", "Lcom/tt/miniapphost/entity/AppInfoEntity;", "mItemView", "Lcom/tt/miniapp/titlemenu/view/MenuItemView;", "getId", "getLaunchQueryValue", "getView", "openFeedBackAppLink", "", "schema", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.menu.e */
public final class LarkFeedBackMenuItemV2 extends C66937e {

    /* renamed from: a */
    public final String f34838a = "LarkFeedBackMenuItemV2";

    /* renamed from: b */
    public final String f34839b = "bdp_launch_query";

    /* renamed from: c */
    public AppInfoEntity f34840c;

    /* renamed from: e */
    private C66899a f34841e;

    /* renamed from: f */
    private String f34842f;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public String mo49183a() {
        return "enter_feedBack";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f34841e;
    }

    /* renamed from: a */
    public final String mo49193a(AppInfoEntity appInfoEntity) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        IAppContext iAppContext = this.f168835d;
        Intrinsics.checkExpressionValueIsNotNull(iAppContext, "appContext");
        jSONObject.put("app_id", iAppContext.getAppId());
        String str3 = null;
        if (appInfoEntity != null) {
            str = appInfoEntity.appName;
        } else {
            str = null;
        }
        jSONObject.put("app_name", str);
        IAppContext iAppContext2 = this.f168835d;
        Intrinsics.checkExpressionValueIsNotNull(iAppContext2, "appContext");
        jSONObject.put("app_type", iAppContext2.getAppType());
        if (appInfoEntity != null) {
            str2 = appInfoEntity.version;
        } else {
            str2 = null;
        }
        jSONObject.put("app_version", str2);
        if (appInfoEntity != null) {
            str3 = appInfoEntity.scene;
        }
        jSONObject.put("orig_secne_type", str3);
        AbstractC67538f a = C67432a.m262319a(this.f168835d);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(appContext)");
        jSONObject.put("page_path", a.getCurrentPagePath());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo49194a(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52831w(this.f34838a, "schema is null");
            return;
        }
        IBaseService findServiceByInterface = this.f168835d.findServiceByInterface(AbstractC67724a.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
        AbstractC67724a aVar = (AbstractC67724a) findServiceByInterface;
        if (aVar.mo50464f(str)) {
            if (str != null) {
                IAppContext iAppContext = this.f168835d;
                Intrinsics.checkExpressionValueIsNotNull(iAppContext, "appContext");
                aVar.mo50442a(iAppContext.getCurrentActivity(), str);
            }
        } else if (str != null) {
            IAppContext iAppContext2 = this.f168835d;
            Intrinsics.checkExpressionValueIsNotNull(iAppContext2, "appContext");
            aVar.mo50440a(iAppContext2.getCurrentActivity(), str, (String) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkFeedBackMenuItemV2(Activity activity, final IAppContext iAppContext, final String str) {
        super(iAppContext);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f34842f = str;
        this.f34841e = new C66899a(activity, iAppContext);
        AbstractC67538f a = C67432a.m262319a(iAppContext);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(appContext)");
        this.f34840c = a.getAppInfo();
        this.f34841e.setIcon(activity.getDrawable(2131234580));
        this.f34841e.setLabel(activity.getString(R.string.lark_brand_feedback));
        this.f34841e.setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.ee.larkbrand.menu.LarkFeedBackMenuItemV2.View$OnClickListenerC131401 */

            /* renamed from: a */
            final /* synthetic */ LarkFeedBackMenuItemV2 f34843a;

            {
                this.f34843a = r1;
            }

            public final void onClick(View view) {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52830i(this.f34843a.f34838a, "feedBackAppLink is null");
                    return;
                }
                DialogC66908d.m260930a(iAppContext).dismiss();
                LarkFeedBackMenuItemV2 eVar = this.f34843a;
                String a = eVar.mo49193a(eVar.f34840c);
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter(this.f34843a.f34839b, a);
                this.f34843a.mo49194a(buildUpon.build().toString());
            }
        });
    }
}
