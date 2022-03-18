package com.ss.android.appcenter.business.p1265a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.dto.ItemUrl;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.a.f */
public class C27577f {
    /* renamed from: b */
    public static boolean m100658b(ItemInfo itemInfo) {
        return itemInfo.isNormalApp();
    }

    /* renamed from: a */
    public static boolean m100657a(ItemInfo itemInfo) {
        if (itemInfo == null || itemInfo.getItemUrl() == null) {
            return false;
        }
        ItemUrl itemUrl = itemInfo.getItemUrl();
        if (!TextUtils.isEmpty(itemUrl.getMobileMpUrl()) || !TextUtils.isEmpty(itemUrl.getMobileAppLink()) || !TextUtils.isEmpty(itemUrl.getMobileH5Url()) || !TextUtils.isEmpty(itemUrl.getPcH5Url()) || !TextUtils.isEmpty(itemUrl.getPcMpUrl()) || !TextUtils.isEmpty(itemInfo.getBotId())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m100655a(Context context, ItemInfo itemInfo) {
        if (itemInfo.isNative()) {
            C27548m.m100547m().mo98216a().mo98163c(itemInfo.getNativeAppKey());
        }
        ItemUrl itemUrl = itemInfo.getItemUrl();
        if (itemUrl == null) {
            C28184h.m103250d("Workplace_Page", "itemurl null. item:" + itemInfo);
        } else if (!m100656a(context, itemInfo.getMobileDefaultAbility(), itemInfo)) {
            if (!TextUtils.isEmpty(itemUrl.getMobileAppLink())) {
                AbstractC27545j f = C27548m.m100547m().mo98222f();
                if (f.mo98204a(context, itemUrl.getMobileAppLink())) {
                    f.mo98205b(context, itemUrl.getMobileAppLink());
                    return;
                }
            }
            if (!TextUtils.isEmpty(itemUrl.getMobileMpUrl())) {
                C27570c.m100627b(context, itemUrl.getMobileMpUrl(), null);
            } else if (!TextUtils.isEmpty(itemUrl.getMobileH5Url())) {
                C27570c.m100622a(context, itemUrl.getMobileH5Url(), itemInfo.getAppId(), itemInfo.getIconKey(), itemInfo.getName(), null);
            } else if (!TextUtils.isEmpty(itemInfo.getBotId())) {
                C27570c.m100621a(context, itemInfo.getBotId(), null);
            } else if (!TextUtils.isEmpty(itemUrl.getPcMpUrl()) || !TextUtils.isEmpty(itemUrl.getPcH5Url())) {
                LKUIToast.show(context, context.getString(R.string.OpenPlatform_AppCenter_OpenAppOnPC));
            } else {
                C28184h.m103250d("Workplace_Page", "click item error:" + itemInfo);
            }
        }
    }

    /* renamed from: a */
    public static boolean m100656a(Context context, int i, ItemInfo itemInfo) {
        return C27578a.m100659a(context, i, itemInfo);
    }

    /* renamed from: com.ss.android.appcenter.business.a.f$a */
    public static class C27578a {
        /* renamed from: a */
        public static boolean m100659a(Context context, int i, ItemInfo itemInfo) {
            C28184h.m103250d("AppDefaultOpenHelper", "app default ability is :" + i);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    if (TextUtils.isEmpty(itemInfo.getBotId())) {
                        C28184h.m103250d("AppDefaultOpenHelper", "openAppInDefaultWay>>> botId is null");
                        return false;
                    }
                    C27570c.m100621a(context, itemInfo.getBotId(), null);
                    return true;
                } else if (TextUtils.isEmpty(itemInfo.getItemUrl().getMobileH5Url())) {
                    C28184h.m103250d("AppDefaultOpenHelper", "openAppInDefaultWay>>> h5url is null");
                    return false;
                } else {
                    C27570c.m100622a(context, itemInfo.getItemUrl().getMobileH5Url(), itemInfo.getAppId(), itemInfo.getIconKey(), itemInfo.getName(), null);
                    return true;
                }
            } else if (TextUtils.isEmpty(itemInfo.getItemUrl().getMobileMpUrl())) {
                C28184h.m103250d("AppDefaultOpenHelper", "openAppInDefaultWay>>> Mpurl is null");
                return false;
            } else {
                C27570c.m100627b(context, itemInfo.getItemUrl().getMobileMpUrl(), null);
                return true;
            }
        }
    }
}
