package com.ss.android.lark.search.widget.reporter;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.reporter.PickerReporterConstants;
import com.ss.android.lark.searchcommon.reporter.SafeReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J \u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/search/widget/reporter/PickerReporter;", "", "()V", "TAG", "", "profileClickReporter", "", "scene", "removeReporter", "selectReporter", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isSelected", "", "position", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "viewReporter", "eventName", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.d.a */
public final class PickerReporter {

    /* renamed from: a */
    public static final PickerReporter f133096a = new PickerReporter();

    private PickerReporter() {
    }

    /* renamed from: c */
    public final void mo183768c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        SafeReporter.f133151a.mo183813a(str, new JSONObject());
    }

    /* renamed from: b */
    public final void mo183767b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
        SafeReporter dVar = SafeReporter.f133151a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "view_profile");
        jSONObject.put("target", "profile_main_view");
        jSONObject.put("scene", str);
        dVar.mo183813a("public_picker_select_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo183766a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
        SafeReporter dVar = SafeReporter.f133151a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "remove");
        jSONObject.put("target", "public_picker_select_view");
        jSONObject.put("scene", str);
        dVar.mo183813a("public_picker_select_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo183764a(Chat chat, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        SafeReporter dVar = SafeReporter.f133151a;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("click", "select");
            jSONObject.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183771b());
            jSONObject.put("list_number", i + 1);
        } else {
            jSONObject.put("click", "remove");
        }
        jSONObject.put("target", "public_picker_select_manage_group_view");
        dVar.mo183813a("public_picker_select_manage_group_click", jSONObject);
    }

    /* renamed from: a */
    public final void mo183765a(Chatter chatter, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Log.m165379d("LarkSearch.SearchWidget.PickerReporter", "position: " + i + ", isSelected: " + z + " position: " + i);
        int i2 = i + 1;
        if (i2 <= 0) {
            return;
        }
        if (chatter.isCollaboration()) {
            SafeReporter dVar = SafeReporter.f133151a;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("click", "select");
                jSONObject.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183769a());
                jSONObject.put("list_number", i2);
            } else {
                jSONObject.put("click", "remove");
            }
            jSONObject.put("target", "public_picker_select_associated_organizations_view");
            dVar.mo183813a("public_picker_select_associated_organizations_click", jSONObject);
        } else if (chatter.isCrossTenant()) {
            SafeReporter dVar2 = SafeReporter.f133151a;
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("click", "select");
                jSONObject2.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183769a());
                jSONObject2.put("list_number", i2);
            } else {
                jSONObject2.put("click", "remove");
            }
            jSONObject2.put("target", "public_picker_select_external_view");
            dVar2.mo183813a("public_picker_select_external_click", jSONObject2);
        } else {
            SafeReporter dVar3 = SafeReporter.f133151a;
            JSONObject jSONObject3 = new JSONObject();
            if (z) {
                jSONObject3.put("click", "select");
                jSONObject3.put("select_type", PickerReporterConstants.VALUE.TYPE.f133099a.mo183769a());
                jSONObject3.put("list_number", i2);
            } else {
                jSONObject3.put("click", "remove");
            }
            jSONObject3.put("target", "public_picker_select_architecture_member_view");
            dVar3.mo183813a("public_picker_select_architecture_member_click", jSONObject3);
        }
    }
}
