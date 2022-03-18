package com.bytedance.ee.bear.document.export;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/export/ExportPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "onClickExport", "", "onClickSheetLongImage", "onShowExportBadges", "panelName", "", "badge", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ExportPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/export/ExportPlugin$Companion;", "", "()V", "BIZ_SHEET_CLEAR_BADGES", "", "BIZ_SHEET_CLICK_EXPORT", "EXPORT_ITEM_ID_EXPORTPANEL", "EXPORT_ITEM_ID_SHEETLONGIMAGE", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.export.ExportPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onClickExport() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "id", (Object) "exportPanel");
        execJS("javascript:lark.biz.sheet.clickExport", jSONObject);
        C13479a.m54764b("ExportPlugin", "Click ExportPanel item.");
    }

    public final void onClickSheetLongImage() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((Object) "id", (Object) "sheetLongImage");
        execJS("javascript:lark.biz.sheet.clickExport", jSONObject);
        C13479a.m54764b("ExportPlugin", "Click SheetLongImage item.");
    }

    public final void onShowExportBadges(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "panelName");
        Intrinsics.checkParameterIsNotNull(str2, "badge");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "panelName", (Object) str);
        jSONObject2.put((Object) "badges", (Object) new String[]{str2});
        execJS("javascript:window.lark.biz.sheet.clearBadges", jSONObject);
        C13479a.m54772d("ExportPlugin", "clear badges: " + jSONObject.toJSONString());
    }
}
