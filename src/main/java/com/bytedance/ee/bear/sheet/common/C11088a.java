package com.bytedance.ee.bear.sheet.common;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.sheet.common.a */
public class C11088a {

    /* renamed from: a */
    public static String f29782a;

    /* renamed from: b */
    public static boolean f29783b;

    /* renamed from: c */
    private BearUrl f29784c;

    /* renamed from: I */
    private BearUrl m46085I() {
        return this.f29784c;
    }

    /* renamed from: D */
    private void m46080D() {
        m46089e("switch_text_tab");
    }

    /* renamed from: E */
    private void m46081E() {
        m46089e("switch_number_tab");
    }

    /* renamed from: F */
    private void m46082F() {
        m46089e("switch_date_tab");
    }

    /* renamed from: A */
    public void mo42255A() {
        m46089e("show_screenshot_dialog");
    }

    /* renamed from: a */
    public void mo42258a() {
        m46089e("open_toolbar");
    }

    /* renamed from: b */
    public void mo42266b() {
        m46089e("close_toolbar");
    }

    /* renamed from: c */
    public void mo42270c() {
        m46091l("close_keyboard", "sheet_toolbar");
    }

    /* renamed from: d */
    public void mo42274d() {
        m46091l("fore_color_open", "sheet_toolbar");
    }

    /* renamed from: e */
    public void mo42277e() {
        m46091l("back_color_open", "sheet_toolbar");
    }

    /* renamed from: f */
    public void mo42279f() {
        m46089e("enter_cell_expand");
    }

    /* renamed from: g */
    public void mo42281g() {
        m46089e("exit_cell_expand");
    }

    /* renamed from: h */
    public void mo42283h() {
        m46089e("next_row");
    }

    /* renamed from: w */
    public void mo42302w() {
        m46089e("show_landscape_btn");
    }

    /* renamed from: x */
    public void mo42303x() {
        m46089e("show_portrait_btn");
    }

    /* renamed from: y */
    public void mo42304y() {
        m46089e("filter_search");
    }

    /* renamed from: z */
    public void mo42305z() {
        m46089e("filter_search_confirm");
    }

    /* renamed from: B */
    public void mo42256B() {
        C5234y.m21391b().mo21079a("sheet_close_keyboard", new HashMap());
    }

    /* renamed from: C */
    public void mo42257C() {
        C5234y.m21391b().mo21079a("sheet_close_fabPanel", new HashMap());
    }

    /* renamed from: G */
    private String m46083G() {
        BearUrl I = m46085I();
        if (I != null && !TextUtils.isEmpty(I.f17447b)) {
            return C13598b.m55197d(I.f17447b);
        }
        return "ERR";
    }

    /* renamed from: H */
    private String m46084H() {
        BearUrl I = m46085I();
        if (I != null && !TextUtils.isEmpty(I.f17446a)) {
            return I.f17446a;
        }
        return "ERR";
    }

    /* renamed from: i */
    public void mo42285i() {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, "sheet_m_fab");
        hashMap.put("fab_type", "cell_fab");
        m46086a("open_keyboard", hashMap);
    }

    /* renamed from: j */
    public void mo42287j() {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, "sheet_m_fab");
        hashMap.put("fab_type", "keyboard");
        m46086a("cell_action_open", hashMap);
    }

    /* renamed from: k */
    public void mo42289k() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "text");
        m46086a("click_keyboard_next_row", hashMap);
    }

    /* renamed from: l */
    public void mo42291l() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "number");
        m46086a("click_keyboard_next_row", hashMap);
    }

    /* renamed from: m */
    public void mo42292m() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "number");
        m46086a("click_keyboard_next_column", hashMap);
    }

    /* renamed from: n */
    public void mo42293n() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "number");
        m46086a("click_keyboard_plus_minus", hashMap);
    }

    /* renamed from: o */
    public void mo42294o() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "number");
        m46086a("click_keyboard_money", hashMap);
    }

    /* renamed from: p */
    public void mo42295p() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "number");
        m46086a("click_keyboard_slash", hashMap);
    }

    /* renamed from: q */
    public void mo42296q() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "number");
        m46086a("click_keyboard_ratio", hashMap);
    }

    /* renamed from: r */
    public void mo42297r() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "date");
        m46086a("click_keyboard_done_all", hashMap);
    }

    /* renamed from: s */
    public void mo42298s() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "date");
        m46086a("click_keyboard_clear", hashMap);
    }

    /* renamed from: t */
    public void mo42299t() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "date");
        m46086a("click_keyboard_done_date", hashMap);
    }

    /* renamed from: u */
    public void mo42300u() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "date");
        m46086a("click_keyboard_done_time", hashMap);
    }

    /* renamed from: v */
    public void mo42301v() {
        HashMap hashMap = new HashMap();
        hashMap.put("op_item", "date");
        m46086a("click_keyboard_done_date_time", hashMap);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.common.a$1 */
    static /* synthetic */ class C110891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29785a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum[] r0 = com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.common.C11088a.C110891.f29785a = r0
                com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum r1 = com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum.text     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.common.C11088a.C110891.f29785a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum r1 = com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum.number     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.common.C11088a.C110891.f29785a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum r1 = com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum.date     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.common.C11088a.C110891.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo42260a(BearUrl bearUrl) {
        this.f29784c = bearUrl;
    }

    /* renamed from: d */
    private String m46088d(boolean z) {
        if (f29783b) {
            return "card_view";
        }
        if (z) {
            return "cell_expand";
        }
        return "default";
    }

    /* renamed from: b */
    public void mo42267b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        m46086a("export_image_success", hashMap);
    }

    /* renamed from: c */
    public void mo42271c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        m46086a("export_image_fail", hashMap);
    }

    /* renamed from: a */
    public void mo42261a(ToolbarItemEnum toolbarItemEnum) {
        int i = C110891.f29785a[toolbarItemEnum.ordinal()];
        if (i == 1) {
            m46080D();
        } else if (i == 2) {
            m46081E();
        } else if (i == 3) {
            m46082F();
        }
    }

    /* renamed from: e */
    private void m46089e(String str) {
        Map<String, String> f = m46090f(str);
        C13479a.m54772d("SheetAnalytic", "report: params = " + f);
        C5234y.m21391b().mo21079a("sheet_opration", f);
    }

    /* renamed from: f */
    private Map<String, String> m46090f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("file_id", m46083G());
        hashMap.put("file_type", C8275a.f22372e.mo32553a());
        hashMap.put("module", m46084H());
        hashMap.put("eventType", "click");
        return hashMap;
    }

    /* renamed from: b */
    public void mo42269b(boolean z) {
        m46087a("text", z);
    }

    /* renamed from: c */
    public void mo42273c(boolean z) {
        m46087a("number", z);
    }

    /* renamed from: d */
    public void mo42275d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("pic_path", str);
        C13479a.m54772d("SheetAnalytic", "report: params = " + hashMap);
        C5234y.m21391b().mo21079a("dev_performance_sheet_screenshot_illegal_path", hashMap);
    }

    /* renamed from: a */
    public void mo42262a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("table_id", str);
        hashMap.put("op_item", "reminder_person_num");
        m46086a("show_reminder_limit_toast", hashMap);
    }

    /* renamed from: a */
    public void mo42264a(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "last button";
        } else {
            str = "next button";
        }
        hashMap.put("op_item", str);
        m46086a("find_item", hashMap);
    }

    /* renamed from: b */
    public void mo42268b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("click_share_export_image", hashMap);
    }

    /* renamed from: c */
    public void mo42272c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("click_download_card_img", hashMap);
    }

    /* renamed from: d */
    public void mo42276d(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("click_share_card_img", hashMap);
    }

    /* renamed from: e */
    public void mo42278e(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("click_copy_card_text", hashMap);
    }

    /* renamed from: f */
    public void mo42280f(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("click_share_card_text", hashMap);
    }

    /* renamed from: g */
    public void mo42282g(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("download_card_img_success", hashMap);
    }

    /* renamed from: h */
    public void mo42284h(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("share_card_img_success", hashMap);
    }

    /* renamed from: a */
    private void m46086a(String str, Map<String, String> map) {
        Map<String, String> f = m46090f(str);
        f.putAll(map);
        C13479a.m54772d("SheetAnalytic", "report: params = " + f);
        C5234y.m21391b().mo21079a("sheet_opration", f);
    }

    /* renamed from: l */
    private void m46091l(String str, String str2) {
        Map<String, String> f = m46090f(str);
        f.put(ShareHitPoint.f121868c, str2);
        C13479a.m54772d("SheetAnalytic", "report: params = " + f);
        C5234y.m21391b().mo21079a("sheet_opration", f);
    }

    /* renamed from: i */
    public void mo42286i(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("copy_card_text_success", hashMap);
    }

    /* renamed from: j */
    public void mo42288j(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("share_card_text_success", hashMap);
    }

    /* renamed from: k */
    public void mo42290k(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        hashMap.put("op_item", str2);
        m46086a("share_export_image_success", hashMap);
    }

    /* renamed from: a */
    private void m46087a(String str, boolean z) {
        Map<String, String> f = m46090f("input");
        f.put("keyboard_type", str);
        f.put("mode", m46088d(z));
        C13479a.m54772d("SheetAnalytic", "report: params = " + f);
        C5234y.m21391b().mo21079a("edit_cell_content", f);
    }

    /* renamed from: a */
    public void mo42263a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        hashMap.put("fab_type", f29782a);
        hashMap.put("op_item", str2);
        m46086a("panel_height", hashMap);
    }

    /* renamed from: a */
    public void mo42265a(boolean z, boolean z2) {
        String str;
        HashMap hashMap = new HashMap();
        if (z2) {
            str = "keyboard";
        } else {
            str = "sheet_toolbar";
        }
        hashMap.put(ShareHitPoint.f121868c, str);
        hashMap.put("mode", m46088d(z));
        m46086a("line_feed", hashMap);
    }

    /* renamed from: a */
    public void mo42259a(float f, int i, int i2, int i3, float f2) {
        HashMap hashMap = new HashMap();
        hashMap.put("memory_size", String.valueOf(f));
        hashMap.put("pic_width", String.valueOf(i));
        hashMap.put("pic_height", String.valueOf(i2));
        hashMap.put("pic_size", String.valueOf(i3));
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(f2));
        C13479a.m54772d("SheetAnalytic", "report: params = " + hashMap);
        C5234y.m21391b().mo21079a("dev_performance_sheet_screenshot_download_time", hashMap);
    }
}
