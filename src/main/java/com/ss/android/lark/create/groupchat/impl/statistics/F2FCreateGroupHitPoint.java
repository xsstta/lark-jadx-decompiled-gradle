package com.ss.android.lark.create.groupchat.impl.statistics;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/F2FCreateGroupHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "sendClickEnterF2FGroup", "", "sendContactClickEnterF2FGroup", "sendContactCreateF2FGroup", "sendCreateF2FGroup", "sendF2FGroupCreated", "chatId", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.a */
public final class F2FCreateGroupHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final F2FCreateGroupHitPoint f93888a = new F2FCreateGroupHitPoint();

    private F2FCreateGroupHitPoint() {
    }

    /* renamed from: a */
    public final void mo134202a() {
        Statistics.sendEvent("face_to_face_create_group_chat");
    }

    /* renamed from: b */
    public final void mo134204b() {
        Statistics.sendEvent("face_to_face_enter_group_chat");
    }

    /* renamed from: c */
    public final void mo134205c() {
        Statistics.sendEvent("contact_face_to_face_create_group_chat");
    }

    /* renamed from: d */
    public final void mo134206d() {
        Statistics.sendEvent("contact_face_to_face_enter_group_chat");
    }

    /* renamed from: a */
    public final void mo134203a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Statistics.sendEvent("face_to_face_group_chat_new_created", new JSONObject().put("face_to_face_group_id", str));
    }
}
