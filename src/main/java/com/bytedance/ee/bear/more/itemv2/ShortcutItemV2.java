package com.bytedance.ee.bear.more.itemv2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.BinderIMarkFeedCallback;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.itemv2.ShortcutItemV2;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import io.reactivex.functions.Function;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class ShortcutItemV2 extends BaseMoreItem implements IGridMoreItem {
    private AbstractC5233x mAnalyticService = C5234y.m21391b();
    public Context mApplicationContext;
    private String mFeedId;
    private C10917c mServiceContext = new C10917c(new C10929e());

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.SHORT_CUT.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        if (isFeedShortcut()) {
            return R.drawable.ud_icon_set_top_cancel_outlined;
        }
        return R.drawable.ud_icon_set_top_outlined;
    }

    private boolean isFeedShortcut() {
        if (getMoreInfo() == null || !getMoreInfo().mo39055v()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        int i;
        if (isFeedShortcut()) {
            i = R.string.Doc_More_CancelShortcut;
        } else {
            i = R.string.Doc_More_Shortcut;
        }
        return getString(i);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        if (TextUtils.isEmpty(this.mFeedId)) {
            C13479a.m54758a("ShortcutItemV2", "onItemClick()... feedId is empty");
        } else {
            this.mServiceContext.mo41508c(ak.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ShortcutItemV2$DofPpPqrfPCrY3i9ysg2nApales */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ShortcutItemV2.this.lambda$onClick$0$ShortcutItemV2((ak) obj);
                }
            }).mo238001b($$Lambda$ShortcutItemV2$NiKKmG0Ffz6UpM0LXX86V3lkBIk.INSTANCE, $$Lambda$ShortcutItemV2$6spdFpO7DUrTKaIUBkPMJVED_kI.INSTANCE);
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        Uri parse;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null || TextUtils.isEmpty(moreInfo.mo39040g()) || (parse = Uri.parse(moreInfo.mo39040g())) == null) {
            return false;
        }
        boolean booleanQueryParameter = parse.getBooleanQueryParameter("enableShortcut", true);
        String queryParameter = parse.getQueryParameter("sourceType");
        String queryParameter2 = parse.getQueryParameter("docId");
        this.mFeedId = queryParameter2;
        if (TextUtils.isEmpty(queryParameter2)) {
            return false;
        }
        C13479a.m54764b("ShortcutItemV2", String.format("isVisible(enableShortcut:%b,source:%s)", Boolean.valueOf(booleanQueryParameter), queryParameter));
        if (!booleanQueryParameter || !"feed".equalsIgnoreCase(queryParameter) || moreInfo.mo39036e() == C8275a.f22378k.mo32555b()) {
            return false;
        }
        return true;
    }

    public ShortcutItemV2(Activity activity) {
        this.mApplicationContext = activity.getApplicationContext();
    }

    public /* synthetic */ String lambda$onClick$0$ShortcutItemV2(ak akVar) throws Exception {
        String str;
        final boolean z = !akVar.isFeedCardShortcut(this.mFeedId);
        C13479a.m54764b("ShortcutItemV2", "getCallback()... onItemClick feedId = " + this.mFeedId + ", markShortcut = " + z);
        akVar.markFeedCardShortcut(z, 0, this.mFeedId, new BinderIMarkFeedCallback.Stub() {
            /* class com.bytedance.ee.bear.more.itemv2.ShortcutItemV2.BinderC102281 */

            public /* synthetic */ void lambda$onFail$1$ShortcutItemV2$1(boolean z) {
                String str;
                if (z) {
                    str = ShortcutItemV2.this.mApplicationContext.getString(R.string.Doc_More_AddQuickSwitcherFail);
                } else {
                    str = ShortcutItemV2.this.mApplicationContext.getString(R.string.Doc_More_RemoveQuickSwitcherFail);
                }
                Toast.showFailureText(ShortcutItemV2.this.mApplicationContext, str, 0);
                ShortcutItemV2.this.getHost().mo39166c();
            }

            public /* synthetic */ void lambda$onSuccess$0$ShortcutItemV2$1(boolean z) {
                String str;
                if (z) {
                    str = ShortcutItemV2.this.mApplicationContext.getString(R.string.Doc_More_AddQuickSwitcherSuccess);
                } else {
                    str = ShortcutItemV2.this.mApplicationContext.getString(R.string.Doc_More_RemoveQuickSwitcherSuccess);
                }
                Toast.showSuccessText(ShortcutItemV2.this.mApplicationContext, str, 0);
                ShortcutItemV2.this.getHost().mo39166c();
            }

            @Override // com.bytedance.ee.bear.contract.ak.AbstractC5106b
            public void onSuccess(String str) {
                C13479a.m54764b("ShortcutItemV2", "getCallback()... onSuccess result = " + str);
                C13742g.m55705a(new Runnable(z) {
                    /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ShortcutItemV2$1$VbTTAaMBgoUDU3iGyQIZm5yfiRU */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ShortcutItemV2.BinderC102281.this.lambda$onSuccess$0$ShortcutItemV2$1(this.f$1);
                    }
                });
            }

            @Override // com.bytedance.ee.bear.contract.ak.AbstractC5106b
            public void onFail(int i, String str) {
                C13479a.m54764b("ShortcutItemV2", "getCallback()... onFail code = " + i + ", msg = " + str);
                C13742g.m55705a(new Runnable(z) {
                    /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ShortcutItemV2$1$aDSFOxY8ewdgmE7IrCuI2jqlzE */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ShortcutItemV2.BinderC102281.this.lambda$onFail$1$ShortcutItemV2$1(this.f$1);
                    }
                });
            }
        });
        if (getMoreInfo() != null) {
            reportShortcut(z, getMoreInfo().mo39040g());
        }
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return "";
        }
        if (z) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), str, "ccm_docs_page_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        return "";
    }

    private void reportShortcut(boolean z, String str) {
        BearUrl g;
        String str2;
        if (!TextUtils.isEmpty(str) && (g = C6313i.m25327a().mo25399g(str)) != null) {
            if (z) {
                str2 = "pin_to_quickswitcher";
            } else {
                str2 = "unpin_to_quickswitcher";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", C13598b.m55197d(g.f17447b));
            hashMap.put("file_type", g.f17446a);
            this.mAnalyticService.mo21079a(str2, hashMap);
        }
    }
}
