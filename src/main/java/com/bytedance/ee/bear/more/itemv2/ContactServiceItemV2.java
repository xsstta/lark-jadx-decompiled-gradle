package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.lark.p414b.AbstractC7995h;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

public class ContactServiceItemV2 extends BaseMoreItem implements ITextMoreItem {
    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_helpdesk_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.CONTACT_SERVICE.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_ContactService);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return ((AbstractC7995h) KoinJavaComponent.m268610a(AbstractC7995h.class)).mo30994a("suite_help_service_doc");
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        String str;
        int i;
        boolean z;
        IMoreInfo moreInfo = getMoreInfo();
        C13479a.m54772d("ContactServiceItemV2", "onClick: moreInfo = " + moreInfo);
        C10196b.m42465a(moreInfo, "contact");
        String str2 = "null";
        if (moreInfo != null) {
            str = moreInfo.mo39041h();
        } else {
            str = str2;
        }
        if (moreInfo != null) {
            i = moreInfo.mo39036e();
        } else {
            i = -1;
        }
        if (moreInfo == null || !moreInfo.mo39009E()) {
            z = false;
        } else {
            z = true;
        }
        if (moreInfo != null) {
            str2 = moreInfo.mo39038f();
        }
        if (moreInfo instanceof DocMoreInfo) {
            C10196b.m42463a(getHost().mo39165b().getArguments(), str, i, z, str2, "contact_us", "none", "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
        }
        if (moreInfo != null) {
            new C10917c(new C10929e()).mo41508c(ak.class).mo238020d($$Lambda$ContactServiceItemV2$JrP60Rz0yXVG82X18BYUX_aASo.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$ContactServiceItemV2$nVmvtS_2i3Ow3t5xbh6Pe7Xtw */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ContactServiceItemV2.this.lambda$onClick$1$ContactServiceItemV2((String) obj);
                }
            }, $$Lambda$ContactServiceItemV2$pcnQOf5ek4rppmj0WvMcQSwHRo.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$onClick$1$ContactServiceItemV2(String str) throws Exception {
        getHost().mo39166c();
        C13479a.m54772d("ContactServiceItemV2", "hostService goToCustomService success ");
    }
}
