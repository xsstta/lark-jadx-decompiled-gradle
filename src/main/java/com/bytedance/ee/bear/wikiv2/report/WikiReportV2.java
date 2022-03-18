package com.bytedance.ee.bear.wikiv2.report;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wikiv2.home.create.SelectIndex;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004<=>?B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0014J]\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0006H\u0007J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010\u001e\u001a\u00020\u0006H\u0007J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010 \u001a\u00020\u0006H\u0007Ji\u0010!\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010#JI\u0010$\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010%Jd\u0010&\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010-\u001a\u00020\u0006H\u0007J$\u0010.\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010/\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u00100\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J}\u00101\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u00102JI\u00103\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010%Ji\u00104\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010#Ji\u00105\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010#JI\u00106\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010%J \u00107\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007JW\u00108\u001a\u00020\u0006*\u0002092\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010;R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/report/WikiReportV2;", "", "()V", "TAG", "", "reportClientWikiPagesOperation", "", "action", "file_id", "target_file_id", "file_type", "", "expand_node_level", "file_is_have_edit", "", "shortcut_id", "reference_type", "parent_id", "parent_type", UpdateKey.STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "reportSpaceDocsMoreMenuClick", "click", "target", "container_id", "page_token", "is_shortcut", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "reportTopBarClickWikiTreeEvent", "reportWikiAllSpaceClick", "reportWikiAllSpaceView", "reportWikiCreateNewClick", "reportWikiCreateNewView", "reportWikiDeleteConfirmClick", "is_favorites", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "reportWikiDeleteConfirmView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "reportWikiFileLocationSelectClick", "view_title", "target_space_id", "children_file_type", "children_page_token", "reportWikiFileLocationSelectView", "reportWikiHomeClick", "reportWikiHomeView", "reportWikiPermissionChangeClick", "reportWikiPermissionChangeView", "reportWikiTrashView", "reportWikiTreeAddClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "reportWikiTreeAddView", "reportWikiTreeClick", "reportWikiTreeMoreClick", "reportWikiTreeMoreView", "reportWikiTreeView", "putWikiPublicParams", "Lorg/json/JSONObject;", "module", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Action", "EventID", "ParamValue", "Utils", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.c.c */
public final class WikiReportV2 {

    /* renamed from: a */
    public static final WikiReportV2 f32882a = new WikiReportV2();

    @Deprecated(message = "")
    @JvmStatic
    /* renamed from: a */
    public static final void m50909a(String str, String str2, String str3, Integer num) {
        m50912a(str, str2, str3, num, null, null, null, null, null, null, null, 2032, null);
    }

    @Deprecated(message = "")
    @JvmStatic
    /* renamed from: a */
    public static final void m50910a(String str, String str2, String str3, Integer num, Integer num2, Boolean bool) {
        m50912a(str, str2, str3, num, num2, bool, null, null, null, null, null, 1984, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/report/WikiReportV2$Utils;", "", "()V", "parseCreateClick", "", "selectIndexId", "", "parseViewTitle", "mode", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.c.c$a */
    public static final class Utils {

        /* renamed from: a */
        public static final Utils f32883a = new Utils();

        private Utils() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final String m50929a(int i) {
            SelectIndex a = SelectIndex.Companion.mo46850a(i);
            int documentType = a.getDocumentType();
            if (documentType == 2) {
                return "doc";
            }
            if (documentType == 3) {
                return "sheet";
            }
            if (documentType == 8) {
                return "bitable";
            }
            if (documentType == 22) {
                return "docx";
            }
            if (documentType == 11) {
                return "mindnote";
            }
            if (documentType != 12) {
                return "";
            }
            if (a == SelectIndex.MEDIA) {
                return "upload_picture";
            }
            return "upload_file";
        }

        @JvmStatic
        /* renamed from: a */
        public static final String m50930a(int i, int i2) {
            if (i != 1) {
                if (i == 2) {
                    return "move_to";
                }
                if (i == 3) {
                    return "shortcut_to";
                }
                if (i != 4) {
                    return "";
                }
                return "make_a_copy_to";
            } else if (SelectIndex.Companion.mo46851b(i2)) {
                return "upload_file_to";
            } else {
                return "create_file";
            }
        }
    }

    private WikiReportV2() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50908a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "view_title", "move_to");
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        C12238d.m50933a(jSONObject, "is_success", String.valueOf(true));
        m50902a(f32882a, jSONObject, str3, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 62, (Object) null);
        C12238d.m50932a("ccm_wiki_permission_change_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50915a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        C12238d.m50933a(jSONObject, "view_title", str3);
        C12238d.m50933a(jSONObject, "target_space_id", C12238d.m50931a(str4));
        C12238d.m50933a(jSONObject, "children_file_type", str5);
        C12238d.m50933a(jSONObject, "children_page_token", C12238d.m50931a(str6));
        m50902a(f32882a, jSONObject, str7, str8, (Boolean) null, (String) null, (String) null, (String) null, 60, (Object) null);
        C12238d.m50932a("ccm_wiki_file_location_select_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50914a(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Boolean bool2, String str7, String str8) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        C12238d.m50933a(jSONObject, "children_page_token", C13598b.m55197d(str3));
        C12238d.m50933a(jSONObject, "children_file_type", str4);
        C12238d.m50933a(jSONObject, "is_favorites", bool != null ? String.valueOf(bool.booleanValue()) : null);
        m50902a(f32882a, jSONObject, str5, str6, bool2, str7, str8, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_tree_add_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50913a(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        m50902a(f32882a, jSONObject, str3, str4, bool, str5, str6, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_space_docs_more_menu_click", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m50912a(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, Integer num3, String str7, int i, Object obj) {
        m50911a(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? null : str5, (i & DynamicModule.f58006b) != 0 ? null : str6, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? null : num3, (i & 1024) != 0 ? null : str7);
    }

    @Deprecated(message = "")
    @JvmStatic
    /* renamed from: a */
    public static final void m50911a(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, Integer num3, String str7) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        Intrinsics.checkParameterIsNotNull(str2, "file_id");
        Intrinsics.checkParameterIsNotNull(str3, "target_file_id");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "action", str);
        C12238d.m50933a(jSONObject, "module", "wiki2.0");
        C12238d.m50933a(jSONObject, "file_id", C13598b.m55197d(str2));
        C12238d.m50933a(jSONObject, "target_file_id", C13598b.m55197d(str3));
        String str8 = null;
        C12238d.m50933a(jSONObject, "file_type", num != null ? C8275a.m34050a(num.intValue()) : null);
        C12238d.m50933a(jSONObject, "file_is_have_edit", bool != null ? String.valueOf(bool.booleanValue()) : null);
        C12238d.m50933a(jSONObject, "expand_node_level", num2);
        C12238d.m50933a(jSONObject, "shortcut_id", str4);
        C12238d.m50933a(jSONObject, "reference_type", str5);
        C12238d.m50933a(jSONObject, "parent_id", str6 != null ? C13598b.m55197d(str6) : null);
        if (num3 != null) {
            str8 = C8275a.m34050a(num3.intValue());
        }
        C12238d.m50933a(jSONObject, "parent_type", str8);
        C12238d.m50933a(jSONObject, UpdateKey.STATUS, str7);
        C13479a.m54772d("WikiReportV2", "report client_wiki_pages_operation, params: " + jSONObject);
        C5234y.m21391b().mo21080a("client_wiki_pages_operation", jSONObject);
    }

    /* renamed from: a */
    private final void m50916a(JSONObject jSONObject, String str, String str2, Boolean bool, String str3, String str4, String str5) {
        C12238d.m50933a(jSONObject, "container_id", C12238d.m50931a(str));
        C12238d.m50933a(jSONObject, "container_type", "wiki");
        C12238d.m50933a(jSONObject, "page_token", C12238d.m50931a(str2));
        String str6 = null;
        C12238d.m50933a(jSONObject, "is_shortcut", bool != null ? String.valueOf(bool.booleanValue()) : null);
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            str6 = C12238d.m50931a(str2);
        }
        C12238d.m50933a(jSONObject, "shortcut_id", str6);
        C12238d.m50933a(jSONObject, "file_id", C12238d.m50931a(str3));
        C12238d.m50933a(jSONObject, "file_type", str4);
        C12238d.m50933a(jSONObject, "app_form", "null");
        C12238d.m50933a(jSONObject, "module", str5);
        C12238d.m50933a(jSONObject, "sub_module", "null");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m50917b() {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, (String) null, (String) null, (Boolean) null, (String) null, (String) null, "wiki_home", 31, (Object) null);
        C12238d.m50932a("ccm_wiki_all_space_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m50922c() {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, (String) null, (String) null, (Boolean) null, (String) null, (String) null, "wiki_home", 31, (Object) null);
        C12238d.m50932a("ccm_wiki_create_new_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50901a() {
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "is_loading_success", String.valueOf(true));
        C12238d.m50933a(jSONObject, "is_empty", String.valueOf(false));
        m50902a(f32882a, jSONObject, (String) null, (String) null, (Boolean) null, (String) null, (String) null, "wiki_home", 31, (Object) null);
        C12238d.m50932a("ccm_wiki_home_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m50926d() {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap();
        HashMap<String, Object> c = b.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "analyticService.getAllCo…Plugin.DOC_COMMON_PARAMS)");
        hashMap.putAll(c);
        hashMap.put("click", "wiki_tree");
        hashMap.put("target", "ccm_wiki_tree_view");
        b.mo21084b("ccm_space_docs_topbar_click", hashMap);
        C13479a.m54772d("WikiReportV2", "reportTopBarClickWikiTreeEvent, params = " + hashMap);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m50918b(String str) {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, str, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 62, (Object) null);
        C12238d.m50932a("ccm_wiki_trash_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50903a(String str) {
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "view_title", "move_to");
        m50902a(f32882a, jSONObject, str, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 62, (Object) null);
        C12238d.m50932a("ccm_wiki_permission_change_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m50923c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        m50902a(f32882a, jSONObject, (String) null, (String) null, (Boolean) null, (String) null, (String) null, "wiki_home", 31, (Object) null);
        C12238d.m50932a("ccm_wiki_home_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m50927d(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        m50902a(f32882a, jSONObject, (String) null, (String) null, (Boolean) null, (String) null, (String) null, "wiki_home", 31, (Object) null);
        C12238d.m50932a("ccm_wiki_all_space_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m50928e(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "click");
        Intrinsics.checkParameterIsNotNull(str2, "target");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        m50902a(f32882a, jSONObject, (String) null, (String) null, (Boolean) null, (String) null, (String) null, "wiki_home", 31, (Object) null);
        C12238d.m50932a("ccm_wiki_create_new_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m50919b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, str, str2, (Boolean) null, (String) null, (String) null, (String) null, 60, (Object) null);
        C12238d.m50932a("ccm_wiki_tree_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50904a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "view_title");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "view_title", str);
        m50902a(f32882a, jSONObject, str2, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 62, (Object) null);
        C12238d.m50932a("ccm_wiki_file_location_select_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50905a(String str, String str2, Boolean bool, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, str, str2, bool, str3, str4, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_tree_add_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m50924c(String str, String str2, Boolean bool, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, str, str2, bool, str3, str4, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_delete_confirm_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m50920b(String str, String str2, Boolean bool, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        m50902a(f32882a, jSONObject, str, str2, bool, str3, str4, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_tree_more_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m50925c(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6) {
        String str7;
        Intrinsics.checkParameterIsNotNull(str, "click");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        C12238d.m50933a(jSONObject, "is_success", true);
        if (bool != null) {
            str7 = String.valueOf(bool.booleanValue());
        } else {
            str7 = null;
        }
        C12238d.m50933a(jSONObject, "is_favorites", str7);
        m50902a(f32882a, jSONObject, str3, str4, bool2, str5, str6, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_delete_confirm_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m50921b(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6) {
        String str7;
        Intrinsics.checkParameterIsNotNull(str, "click");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        if (bool != null) {
            str7 = String.valueOf(bool.booleanValue());
        } else {
            str7 = null;
        }
        C12238d.m50933a(jSONObject, "is_favorites", str7);
        m50902a(f32882a, jSONObject, str3, str4, bool2, str5, str6, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_tree_more_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m50906a(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6) {
        String str7;
        Intrinsics.checkParameterIsNotNull(str, "click");
        JSONObject jSONObject = new JSONObject();
        C12238d.m50933a(jSONObject, "click", str);
        C12238d.m50933a(jSONObject, "target", str2);
        if (bool != null) {
            str7 = String.valueOf(bool.booleanValue());
        } else {
            str7 = null;
        }
        C12238d.m50933a(jSONObject, "is_favorites", str7);
        m50902a(f32882a, jSONObject, str3, str4, bool2, str5, str6, (String) null, 32, (Object) null);
        C12238d.m50932a("ccm_wiki_tree_click", jSONObject);
    }

    /* renamed from: a */
    static /* synthetic */ void m50902a(WikiReportV2 cVar, JSONObject jSONObject, String str, String str2, Boolean bool, String str3, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        Boolean bool2;
        String str8;
        String str9;
        String str10;
        if ((i & 1) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 8) != 0) {
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 16) != 0) {
            str9 = null;
        } else {
            str9 = str4;
        }
        if ((i & 32) != 0) {
            str10 = "wiki";
        } else {
            str10 = str5;
        }
        cVar.m50916a(jSONObject, str6, str7, bool2, str8, str9, str10);
    }

    /* renamed from: a */
    public static /* synthetic */ void m50907a(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            str6 = null;
        }
        m50906a(str, str2, bool, str3, str4, bool2, str5, str6);
    }
}
