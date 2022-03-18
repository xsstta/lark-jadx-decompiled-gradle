package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import android.content.Intent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.post.PostTypeSettingActivity;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J(\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/PostSettingPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "getPostTypeText", "", "postType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "isThread", "", "itemType", "", "onChatChanged", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onClick", "startPostSettingActivity", "chatId", "ownerId", "isThreadChat", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PostSettingPiece extends ChatSettingNavigationPiece {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 21;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Group_GroupSettings_MsgRestriction_Title;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        Chat n = mo127670n();
        if (n != null) {
            String id = n.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            String ownerId = n.getOwnerId();
            Intrinsics.checkExpressionValueIsNotNull(ownerId, "chat.ownerId");
            Chat.PostType postType = n.getPostType();
            Intrinsics.checkExpressionValueIsNotNull(postType, "chat.postType");
            m135812a(id, ownerId, postType, n.isThread());
            ChatSettingHitPointNew.m136625a(ChatSettingHitPointNew.GroupManageParam.MESSAGE_RESTRICTION, null, 2, null);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Chat.PostType postType = chat.getPostType();
        Intrinsics.checkExpressionValueIsNotNull(postType, "chat.postType");
        SettingNavigationPiece.m134140a(this, null, m135811a(postType, chat.isThread()), null, 0, 13, null);
    }

    /* renamed from: a */
    private final String m135811a(Chat.PostType postType, boolean z) {
        int i;
        int i2 = C34912a.f90099a[postType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (z) {
                i = R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_Default;
            } else {
                i = R.string.Lark_Group_GroupSettings_MsgRestriction_Default;
            }
        } else if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                i = R.string.Lark_Group_Topic_GroupSettings_MsgRestriction_SelectedMember;
            } else {
                i = R.string.Lark_Group_GroupSettings_MsgRestriction_SelectedMember;
            }
        } else if (z) {
            i = R.string.Lark_Legacy_OnlyGroupOwnerGroupAdminNewTopics;
        } else {
            i = R.string.Lark_Legacy_OnlyGOGASendMsg;
        }
        return C51468a.m199493c(i, mo177180C());
    }

    /* renamed from: a */
    private final void m135812a(String str, String str2, Chat.PostType postType, boolean z) {
        Intent intent = new Intent(mo177180C(), PostTypeSettingActivity.class);
        intent.putExtra("extra_chat_id", str);
        intent.putExtra("extra_owner_id", str2);
        intent.putExtra("extra_post_type", postType);
        intent.putExtra("extra_is_thread_chat", z);
        mo177186a(intent);
    }
}
