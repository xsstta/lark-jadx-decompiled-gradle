package com.bytedance.ee.bear.templates;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.p705h.C13666a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ:\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0014j\b\u0012\u0004\u0012\u00020\f`\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplatesParser;", "", "()V", "SOURCE_CACHE", "", "SOURCE_NET", "TAG", "", "isSupportType", "", ShareHitPoint.f121869d, "parseTemplate", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "jsonObject", "Lorg/json/JSONObject;", "usersJsonObj", "local", "Ljava/util/Locale;", "isConnected", "parseTemplateArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "Lorg/json/JSONArray;", "parseThumbnail", "Lcom/bytedance/ee/bear/templates/ThumbnailExtra;", "parserUser", "Lcom/bytedance/ee/bear/templates/TemplatesParser$TemplateUser;", "userJsonObj", "TemplateUser", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.m */
public final class TemplatesParser {

    /* renamed from: a */
    public static final TemplatesParser f31104a = new TemplatesParser();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplatesParser$TemplateUser;", "", "avatarUrl", "", "name", "enName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getName", "local", "Ljava/util/Locale;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.m$a */
    public static final class TemplateUser {

        /* renamed from: a */
        private final String f31105a;

        /* renamed from: b */
        private final String f31106b;

        /* renamed from: c */
        private final String f31107c;

        public TemplateUser() {
            this(null, null, null, 7, null);
        }

        /* renamed from: a */
        public final String mo44288a() {
            return this.f31105a;
        }

        /* renamed from: a */
        public final String mo44289a(Locale locale) {
            Intrinsics.checkParameterIsNotNull(locale, "local");
            String a = C13666a.m55443a(locale.getLanguage(), this.f31106b, this.f31107c);
            Intrinsics.checkExpressionValueIsNotNull(a, "DisplayNameUtils.getDisp…l.language, name, enName)");
            return a;
        }

        public TemplateUser(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "avatarUrl");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(str3, "enName");
            this.f31105a = str;
            this.f31106b = str2;
            this.f31107c = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TemplateUser(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }

    private TemplatesParser() {
    }

    /* renamed from: a */
    private final boolean m48058a(int i) {
        C8275a aVar = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.MINDNOTE");
        if (i == aVar.mo32555b()) {
            return C4211a.m17514a().mo16536a("spacekit.mobile.template_filter_mindnote_enable", false);
        }
        C8275a aVar2 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.BITABLE");
        if (i == aVar2.mo32555b()) {
            return C4211a.m17514a().mo16536a("ccm.spacekit.template.bitable.enable", false);
        }
        return true;
    }

    /* renamed from: b */
    private final TemplateUser m48059b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TemplateUser(null, null, null, 7, null);
        }
        String optString = jSONObject.optString("avatar_url");
        Intrinsics.checkExpressionValueIsNotNull(optString, "userJsonObj.optString(\"avatar_url\")");
        String optString2 = jSONObject.optString("name");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "userJsonObj.optString(\"name\")");
        String optString3 = jSONObject.optString("en_name");
        Intrinsics.checkExpressionValueIsNotNull(optString3, "userJsonObj.optString(\"en_name\")");
        return new TemplateUser(optString, optString2, optString3);
    }

    /* renamed from: a */
    private final ThumbnailExtra m48057a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new ThumbnailExtra(0, null, null, 7, null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("thumbnail_extra");
        if (optJSONObject == null) {
            return new ThumbnailExtra(0, null, null, 7, null);
        }
        int optInt = optJSONObject.optInt(ShareHitPoint.f121869d);
        String optString = optJSONObject.optString("thumbnail");
        Intrinsics.checkExpressionValueIsNotNull(optString, "thumbnailObj.optString(\"thumbnail\")");
        String optString2 = optJSONObject.optString("decrypt_key");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "thumbnailObj.optString(\"decrypt_key\")");
        return new ThumbnailExtra(optInt, optString, optString2);
    }

    /* renamed from: a */
    public final ArrayList<TemplateV4> mo44287a(JSONArray jSONArray, JSONObject jSONObject, Locale locale, boolean z) {
        Intrinsics.checkParameterIsNotNull(locale, "local");
        if (jSONArray == null) {
            return new ArrayList<>();
        }
        ArrayList<TemplateV4> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "jsonArray.optJSONObject(i)");
            TemplateV4 a = mo44286a(optJSONObject, jSONObject, locale, z);
            if (m48058a(a.getObjType())) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final TemplateV4 mo44286a(JSONObject jSONObject, JSONObject jSONObject2, Locale locale, boolean z) {
        JSONObject jSONObject3;
        String str;
        String str2;
        JSONArray optJSONArray;
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        Intrinsics.checkParameterIsNotNull(locale, "local");
        String optString = jSONObject.optString("from_user_id");
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2.optJSONObject(optString);
        } else {
            jSONObject3 = null;
        }
        TemplateUser b = m48059b(jSONObject3);
        ThumbnailExtra a = m48057a(jSONObject);
        String optString2 = jSONObject.optString("id");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "jsonObject.optString(\"id\")");
        String optString3 = jSONObject.optString("name");
        Intrinsics.checkExpressionValueIsNotNull(optString3, "jsonObject.optString(\"name\")");
        int optInt = jSONObject.optInt("obj_type");
        String optString4 = jSONObject.optString("obj_token");
        Intrinsics.checkExpressionValueIsNotNull(optString4, "jsonObject.optString(\"obj_token\")");
        String optString5 = jSONObject.optString("category_id");
        Intrinsics.checkExpressionValueIsNotNull(optString5, "jsonObject.optString(\"category_id\")");
        String optString6 = jSONObject.optString("description");
        Intrinsics.checkExpressionValueIsNotNull(optString6, "jsonObject.optString(\"description\")");
        int optInt2 = jSONObject.optInt(ShareHitPoint.f121868c);
        String optString7 = jSONObject.optString("platform");
        Intrinsics.checkExpressionValueIsNotNull(optString7, "jsonObject.optString(\"platform\")");
        String optString8 = jSONObject.optString("operational_label_url");
        Intrinsics.checkExpressionValueIsNotNull(optString8, "jsonObject.optString(\"operational_label_url\")");
        String optString9 = jSONObject.optString("op_label_url_v2", "");
        Intrinsics.checkExpressionValueIsNotNull(optString9, "jsonObject.optString(\"op_label_url_v2\",\"\")");
        long optLong = jSONObject.optLong("heat");
        String optString10 = jSONObject.optString("author", "");
        Intrinsics.checkExpressionValueIsNotNull(optString10, "jsonObject.optString(\"author\",\"\")");
        Intrinsics.checkExpressionValueIsNotNull(optString, "fromUserId");
        String a2 = b.mo44288a();
        String a3 = b.mo44289a(locale);
        int optInt3 = jSONObject.optInt("bottom_label_type");
        long optLong2 = jSONObject.optLong("create_time");
        long optLong3 = jSONObject.optLong("update_time");
        long optLong4 = jSONObject.optLong("share_time");
        long optLong5 = jSONObject.optLong("last_used_time");
        String optString11 = jSONObject.optString("box_color_background");
        Intrinsics.checkExpressionValueIsNotNull(optString11, "jsonObject.optString(\"box_color_background\")");
        String optString12 = jSONObject.optString("frame_color");
        Intrinsics.checkExpressionValueIsNotNull(optString12, "jsonObject.optString(\"frame_color\")");
        int optInt4 = jSONObject.optInt("display_type");
        String optString13 = jSONObject.optString("cover_token");
        Intrinsics.checkExpressionValueIsNotNull(optString13, "jsonObject.optString(\"cover_token\")");
        String optString14 = jSONObject.optString("cover_download_url");
        Intrinsics.checkExpressionValueIsNotNull(optString14, "jsonObject.optString(\"cover_download_url\")");
        int optInt5 = jSONObject.optInt("template_type", 1);
        JSONObject optJSONObject = jSONObject.optJSONObject("extra");
        if (optJSONObject != null) {
            str = optJSONObject.optString("collection_id");
        } else {
            str = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
        if (optJSONObject2 == null || (optJSONArray = optJSONObject2.optJSONArray("template_collection_obj_types")) == null) {
            str2 = null;
        } else {
            str2 = optJSONArray.toString();
        }
        return new TemplateV4(optString2, optString3, optInt, optString4, optString5, optString6, optInt2, optString7, optString8, optString9, optLong, optString10, optString, a2, a3, optInt3, optLong2, optLong3, optLong4, optLong5, optString11, optString12, optInt4, optString13, optString14, a, z, optInt5, str, com.alibaba.fastjson.JSONObject.parseArray(str2, Integer.TYPE), false, 1073741824, null);
    }
}
