package com.bytedance.ee.bear.bitable.common;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardType;
import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

public class BitableAnalytic {

    /* renamed from: a */
    private AbstractC5233x f14059a;

    /* renamed from: b */
    private Map<String, Object> f14060b = new HashMap();

    /* renamed from: c */
    private BearUrl f14061c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttachmentClickAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttachmentOperationAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EditParamKey {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FieldType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkSceneClickType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MemberItemSource {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SelectSceneClickType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SelectSceneEvent {
    }

    /* renamed from: a */
    public void mo18677a(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("bitable_field_type", str);
        hashMap.put("bitable_editor_type", "card");
        if (map != null) {
            hashMap.putAll(map);
        }
        m19785b("bitable_record_edit", hashMap);
        if (TextUtils.equals("dateTime", str) && TextUtils.equals(map.get("click_clear_btn"), String.valueOf(true))) {
            mo18670a();
        }
    }

    /* renamed from: a */
    public void mo18680a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("switch_type", z ? "previous_record" : "next_record");
        hashMap.put(ShareHitPoint.f121868c, "swipe");
        m19785b("bitable_card_switch", hashMap);
    }

    /* renamed from: a */
    public void mo18679a(String str, boolean z, String str2, boolean z2) {
        HashMap hashMap = new HashMap(m19786c(str, z, str2, z2));
        hashMap.put("action", "enter_landscape");
        C13479a.m54772d("BitableAnalytic", "reportEnterLandscape: params = " + hashMap);
        this.f14059a.mo21079a("sheet_opration", hashMap);
    }

    /* renamed from: a */
    public void mo18678a(String str, boolean z) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("field_type", z ? "duplex_relation" : "relation");
        m19784a(str, hashMap);
    }

    /* renamed from: a */
    public void mo18681a(boolean z, boolean z2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(UpdateKey.STATUS, z ? "open" : "close");
        hashMap.put("field_type", z2 ? "duplex_relation" : "relation");
        m19784a("click_record", hashMap);
    }

    /* renamed from: a */
    public void mo18670a() {
        HashMap hashMap = new HashMap();
        hashMap.put("bitable_editor_type", "card");
        m19785b("click_bitable_clear_date", hashMap);
    }

    /* renamed from: b */
    public void mo18682b() {
        HashMap hashMap = new HashMap();
        hashMap.put("link_type", "jira");
        hashMap.put(ShareHitPoint.f121868c, "recordinfilter");
        hashMap.put("view_status", "card");
        m19785b("click_openorigin_link", hashMap);
    }

    /* renamed from: c */
    public void mo18685c() {
        HashMap hashMap = new HashMap();
        hashMap.put("target", "none");
        m19787c("ccm_bitable_card_view", hashMap);
    }

    /* renamed from: d */
    private String m19788d() {
        String str = this.f14061c.f17446a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -102775833:
                if (str.equals("bitable")) {
                    c = 0;
                    break;
                }
                break;
            case 99640:
                if (str.equals("doc")) {
                    c = 1;
                    break;
                }
                break;
            case 3649456:
                if (str.equals("wiki")) {
                    c = 2;
                    break;
                }
                break;
            case 109403487:
                if (str.equals("sheet")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "bitable_app";
            case 1:
            case 2:
                return "bitable_doc_block";
            case 3:
                return "bitable_sheet_block";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public void mo18673a(String str) {
        mo18674a(str, 1);
    }

    /* renamed from: b */
    public void mo18683b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("attach_file_type", str);
        m19785b("bitable_upload_type", hashMap);
    }

    /* renamed from: d */
    public void mo18687d(String str) {
        m19787c(str, new HashMap());
    }

    /* renamed from: c */
    public void mo18686c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", str);
        hashMap.put("target", "none");
        m19787c("ccm_bitable_card_attachment_operate_click", hashMap);
    }

    /* renamed from: a */
    private void m19784a(String str, HashMap<String, Object> hashMap) {
        String str2;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("click", str);
        if (TextUtils.equals(str, "expand") || TextUtils.equals(str, "create_record")) {
            str2 = "ccm_bitable_card_view";
        } else {
            str2 = "none";
        }
        hashMap.put("target", str2);
        if (TextUtils.equals(str, "add_record")) {
            hashMap.put("location", "plus_sign");
        }
        m19787c("ccm_bitable_relation_field_modify_click", hashMap);
    }

    /* renamed from: b */
    private void m19785b(String str, Map<String, Object> map) {
        map.putAll(this.f14060b);
        C13479a.m54772d("BitableAnalytic", "reportEvent: event = " + str + ", params = " + map);
        this.f14059a.mo21079a(str, map);
    }

    /* renamed from: c */
    private void m19787c(String str, Map<String, Object> map) {
        map.putAll(this.f14060b);
        C13479a.m54772d("BitableAnalytic", "reportEventV2: event = " + str + ", params = " + map);
        this.f14059a.mo21084b(str, map);
    }

    public BitableAnalytic(AbstractC5233x xVar, BearUrl bearUrl) {
        this.f14059a = xVar;
        this.f14061c = bearUrl;
        HashMap<String, Object> c = xVar.mo21086c("docCommonParams");
        if (!c.isEmpty()) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                this.f14060b.put(entry.getKey(), entry.getValue());
            }
        }
        this.f14060b.put("module", bearUrl.f17446a);
        this.f14060b.put("file_type", C8275a.f22373f.mo32553a());
        this.f14060b.put("bitable_type", m19788d());
        this.f14060b.put("is_full_screen", "true");
    }

    /* renamed from: a */
    public void mo18671a(int i, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("relation_count", Integer.valueOf(i));
        if (z) {
            str = "duplex_relation";
        } else {
            str = "relation";
        }
        hashMap.put("field_type", str);
        m19787c("ccm_bitable_relation_field_modify_view", hashMap);
    }

    /* renamed from: a */
    public void mo18674a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("bitable_editor_type", "card");
        hashMap.put("action", str);
        hashMap.put("attach_number", String.valueOf(i));
        m19785b("bitable_attachment_operation", hashMap);
    }

    /* renamed from: a */
    public void mo18672a(long j, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "upload_image");
        hashMap.put("image_size", Long.valueOf(j));
        hashMap.put("is_phone_restricted", Boolean.valueOf(z2));
        if (z) {
            m19787c("ccm_bitable_form_click", hashMap);
        } else {
            m19787c("ccm_bitable_card_click", hashMap);
        }
    }

    /* renamed from: a */
    public void mo18676a(String str, String str2, boolean z) {
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("click", str2);
        if (z) {
            str3 = "multi_options";
        } else {
            str3 = "single_option";
        }
        hashMap.put("field_type", str3);
        if (str2.equals("add") || str2.equals("edit")) {
            str4 = "ccm_bitable_option_field_edit_view";
        } else if (str2.equals("option_more")) {
            str4 = "ccm_bitable_option_field_more_view";
        } else if (str.equals("ccm_bitable_option_field_delete_click") && str2.equals("delete")) {
            str4 = "ccm_bitable_option_field_delete_view";
        } else if ((!str2.equals("create_option") || !z) && !str2.equals("complete") && !str2.equals("similar_option")) {
            str4 = "none";
        } else {
            str4 = "ccm_bitable_option_field_panel_view";
        }
        hashMap.put("target", str4);
        m19787c(str, hashMap);
    }

    /* renamed from: c */
    private Map<String, String> m19786c(String str, boolean z, String str2, boolean z2) {
        String str3;
        String str4;
        String str5;
        String str6;
        HashMap hashMap = new HashMap();
        BearUrl bearUrl = this.f14061c;
        String str7 = "ERR";
        if (bearUrl == null || TextUtils.isEmpty(bearUrl.f17447b)) {
            str3 = str7;
        } else {
            str3 = C13598b.m55197d(this.f14061c.f17447b);
        }
        BearUrl bearUrl2 = this.f14061c;
        if (bearUrl2 != null && !TextUtils.isEmpty(bearUrl2.f17446a)) {
            str7 = C13598b.m55197d(this.f14061c.f17446a);
        }
        hashMap.put("file_id", str3);
        hashMap.put("module", str7);
        if (str2 == null) {
            str4 = "sheet";
        } else {
            str4 = "bitable";
        }
        hashMap.put("file_type", str4);
        hashMap.put(ShareHitPoint.f121868c, str);
        if (z) {
            str5 = "portrait_locked";
        } else {
            str5 = "default";
        }
        hashMap.put("op_item", str5);
        if (z2) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        hashMap.put("recordOpen", str6);
        if (str2 != null) {
            hashMap.put("bitable_view_type", str2);
        }
        return hashMap;
    }

    /* renamed from: b */
    public void mo18684b(String str, boolean z, String str2, boolean z2) {
        Map<String, String> c = m19786c(str, z, str2, z2);
        c.put("action", "exit_landscape");
        C13479a.m54772d("BitableAnalytic", "reportExitLandscape: params = " + c);
        this.f14059a.mo21079a("sheet_opration", c);
    }

    /* renamed from: a */
    public void mo18675a(String str, String str2, String str3, EViewType eViewType, ECardType eCardType) {
        this.f14060b.put("bitable_id", C13598b.m55197d(str));
        this.f14060b.put("table_id", str2);
        this.f14060b.put("view_id", str3);
        this.f14060b.put("bitable_data_source", eCardType.toString());
        this.f14060b.put("bitable_view_type", eViewType.toString().toLowerCase());
        this.f14060b.put("view_type", eViewType.toString().toLowerCase());
    }
}
