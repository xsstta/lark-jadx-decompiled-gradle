package com.bytedance.ee.bear.list.folderselect;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/FolderSelectAnalytic;", "", "()V", "ACTION_CLICK_CREATE_FOLDER", "", "ACTION_CLICK_RECENT_FOLDER", "ACTION_CLICK_SEARCH_RESULT", "EVENT_CLICK_ADD_TO_OPERATION", "EVENT_CLICK_SEARCH_FILTER_FOLDER_OPERATION", "TAG", "reportClickedFolder", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "module", "action", "reportOperation", "operateBean", "Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folderselect.a */
public final class FolderSelectAnalytic {

    /* renamed from: a */
    public static final FolderSelectAnalytic f22639a = new FolderSelectAnalytic();

    private FolderSelectAnalytic() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m34773a(AbstractC5233x xVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        Intrinsics.checkParameterIsNotNull(str, "module");
        Intrinsics.checkParameterIsNotNull(str2, "action");
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        hashMap.put("action", str2);
        xVar.mo21079a("click_search_filter_folder_operation", hashMap);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m34772a(AbstractC5233x xVar, DocOperateBean docOperateBean, String str) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        Intrinsics.checkParameterIsNotNull(docOperateBean, "operateBean");
        Intrinsics.checkParameterIsNotNull(str, "action");
        C13479a.m54772d("FolderSelectAnalytic", "source: " + docOperateBean.mo20980f() + ", \n" + "module:" + docOperateBean.mo20979e() + ", \n" + "action: " + str + ", \n" + "file_type: " + docOperateBean.mo20977d() + ", \n" + "file_id: " + docOperateBean.mo20976c());
        HashMap hashMap = new HashMap();
        String f = docOperateBean.mo20980f();
        Intrinsics.checkExpressionValueIsNotNull(f, "operateBean.source");
        hashMap.put(ShareHitPoint.f121868c, f);
        String e = docOperateBean.mo20979e();
        Intrinsics.checkExpressionValueIsNotNull(e, "operateBean.module");
        hashMap.put("module", e);
        hashMap.put("action", str);
        String a = C8275a.m34050a(docOperateBean.mo20977d());
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentType.getDocument…ring(operateBean.srcType)");
        hashMap.put("file_type", a);
        String d = C13598b.m55197d(docOperateBean.mo20976c());
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncri…ion(operateBean.srcToken)");
        hashMap.put("file_id", d);
        String g = docOperateBean.mo20981g();
        if (g == null) {
            g = "";
        }
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, g);
        xVar.mo21079a("click_addto_operation", hashMap);
        String str2 = str;
        if (TextUtils.equals(str2, "click_search_result") || TextUtils.equals(str2, "click_recent_folder")) {
            String e2 = docOperateBean.mo20979e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "operateBean.module");
            m34773a(xVar, e2, str);
        }
    }
}
