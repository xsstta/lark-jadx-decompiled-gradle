package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import com.bytedance.ee.bear.middleground.permission.collaborator.invite.BlockUserParser;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkErrorParser;", "", "()V", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.c */
public class InviteMemberSendLinkErrorParser {

    /* renamed from: a */
    public static final Companion f26209a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkErrorParser$Companion;", "", "()V", "TAG", "", "parseNotNotifyEntities", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkData;", "json", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteMemberSendLinkData mo37119a(String str, ArrayList<UserInfo> arrayList) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            InviteMemberSendLinkData inviteMemberSendLinkData = new InviteMemberSendLinkData(0, 0, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("block_user_map");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("user_map");
                if (!(optJSONObject == null || optJSONObject2 == null)) {
                    inviteMemberSendLinkData.setNotNotifyUsers(BlockUserParser.m40175a(10015, optJSONObject, optJSONObject2));
                    inviteMemberSendLinkData.setBlockUsers(BlockUserParser.m40175a(10021, optJSONObject, optJSONObject2));
                    inviteMemberSendLinkData.setBlockedUsers(BlockUserParser.m40175a(10022, optJSONObject, optJSONObject2));
                    inviteMemberSendLinkData.setPrivacyUsers(BlockUserParser.m40175a(10023, optJSONObject, optJSONObject2));
                    inviteMemberSendLinkData.setInviteFailedUsers(BlockUserParser.m40175a(10024, optJSONObject, optJSONObject2));
                    inviteMemberSendLinkData.setLimitUsers(BlockUserParser.m40175a(10025, optJSONObject, optJSONObject2));
                }
                inviteMemberSendLinkData.setAskOwnerLimitNum(jSONObject.optInt("limit_num", 20));
                JSONObject optJSONObject3 = jSONObject.optJSONObject("fail_members");
                if (!(optJSONObject3 == null || arrayList == null || !(!arrayList.isEmpty()))) {
                    inviteMemberSendLinkData.setOwnerNotInGroups(BlockUserParser.f26192a.mo37043a(10027, optJSONObject3, arrayList));
                }
                return inviteMemberSendLinkData;
            } catch (Exception e) {
                C13479a.m54758a("InviteMemberSendLinkErrorParser", "parse()...error = " + e);
                return inviteMemberSendLinkData;
            }
        }
    }
}
