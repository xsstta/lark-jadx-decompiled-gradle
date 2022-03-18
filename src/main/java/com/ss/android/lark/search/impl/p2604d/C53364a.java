package com.ss.android.lark.search.impl.p2604d;

import android.content.Context;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.global.SearchActivity;
import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import com.ss.android.lark.search.impl.func.global.search.order.SearchOrderManager;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53348c;
import com.ss.android.lark.search.impl.p2604d.p2605a.C53369d;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.SearchArgsSetting;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.searchcommon.p2634b.C53886b;
import com.ss.android.lark.searchcommon.reporter.SearchOpenReporter;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.utils.SessionManager;

/* renamed from: com.ss.android.lark.search.impl.d.a */
public class C53364a {
    /* renamed from: a */
    private static String m206585a(int i) {
        switch (i) {
            case 1:
                return "im";
            case 2:
                return "contact";
            case 3:
            case 4:
            case 9:
            default:
                return "none";
            case 5:
                return "calendar";
            case 6:
                return "workplace";
            case 7:
                return "docs";
            case 8:
                return "wiki";
            case 10:
                return "chat";
            case 11:
                return "todo";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "lynxcard";
        }
    }

    /* renamed from: a */
    private static void m206588a(SearchDetailInitData searchDetailInitData) {
        C53886b.m208799a(searchDetailInitData.sceneType.getNumber(), searchDetailInitData.dataFromType, searchDetailInitData.initDataList.size(), C53348c.m206468a(searchDetailInitData.initDataList));
    }

    /* renamed from: a */
    public static void m206586a(Context context, SearchDetailInitData searchDetailInitData) {
        m206588a(searchDetailInitData);
        Log.m165389i("LarkSearch.Search.SearchLauncher", "open advance search, search result type: " + SearchCommonUtils.m209226a(searchDetailInitData.resultType) + ", query: " + SearchCommonUtils.m209228a(searchDetailInitData.searchKey) + ", search session: " + C53883a.m208794a().mo183799b());
        C53369d.m206594a(searchDetailInitData.resultType, context, searchDetailInitData);
    }

    /* renamed from: a */
    public static void m206587a(Context context, String str, String str2, int i, boolean z, boolean z2, int i2) {
        Log.m165389i("LarkSearch.Search.SearchLauncher", "open search from [" + C53345b.m206467b(i2) + "], query: " + SearchCommonUtils.m209228a(str) + " (empty query is normal).");
        GlobalSearchOrderData a = SearchOrderManager.m207614a(i2);
        C53886b.m208803a(a.getSearchOrderList());
        SessionManager.m209247c();
        SearchOpenReporter.m208863a(m206585a(i2));
        SettingManager.getInstance().get(SearchArgsSetting.class, new IGetDataCallback<SearchArgsSetting>() {
            /* class com.ss.android.lark.search.impl.p2604d.C53364a.C533651 */

            /* renamed from: a */
            public void onSuccess(SearchArgsSetting searchArgsSetting) {
                SearchService.f131813a.mo181937a(searchArgsSetting);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LarkSearch.Search.SearchLauncher", "get SearchArgsSetting err!");
            }
        });
        context.startActivity(SearchActivity.m207584a(context, str, str2, i, z, z2, a));
    }
}
