package com.ss.android.lark.team.stastics;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.team.C55356a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/team/stastics/ChatHintPoint;", "", "()V", "ASSIGN_ADMIN", "", "CLICK", "CONFIRM", "CONFIRM_TYPE", "DELETE_ADMIN", "DELETE_GROUP_MEMBERS", "IM_GROUP_CONFIRM_VIEW", "NONE", "TARGET", "TRANSFER_OWNER", "sendGroupConfirmClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "action", "sendGroupMemberClick", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.e.a */
public final class ChatHintPoint {

    /* renamed from: a */
    public static final ChatHintPoint f136853a = new ChatHintPoint();

    private ChatHintPoint() {
    }

    /* renamed from: b */
    public final void mo189109b(Chat chat, String str) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(str, "action");
        Statistics.sendEvent("im_group_confirm_click", new JSONObject(ChatParamUtils.m133137a(chat, C55356a.m214819a().mo144123b().mo144130a(), (Chatter) null, 4, (Object) null)).put("click", "confirm").put("confirm_type", str).put("target", "none"));
    }

    /* renamed from: a */
    public final void mo189108a(Chat chat, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(str, "action");
        String a = C55356a.m214819a().mo144123b().mo144130a();
        int hashCode = str.hashCode();
        if (hashCode == 378800069 ? !str.equals("delete_group_members") : hashCode != 1987850591 || !str.equals("transfer_owner")) {
            str2 = "none";
        } else {
            str2 = "im_group_confirm_view";
        }
        Statistics.sendEvent("im_group_member_click", new JSONObject(ChatParamUtils.m133137a(chat, a, (Chatter) null, 4, (Object) null)).put("click", str).put("target", str2));
    }
}
