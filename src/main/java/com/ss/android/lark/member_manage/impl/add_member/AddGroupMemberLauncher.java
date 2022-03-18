package com.ss.android.lark.member_manage.impl.add_member;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/AddGroupMemberLauncher;", "", "()V", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.add_member.b */
public final class AddGroupMemberLauncher {

    /* renamed from: a */
    public static final Companion f113807a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/add_member/AddGroupMemberLauncher$Companion;", "", "()V", "launcher", "", "activity", "Landroid/app/Activity;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isEdu", "", "requestCode", "", ShareHitPoint.f121868c, "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo159062a(Activity activity, Chat chat, boolean z, int i, String str) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_key_chat", chat);
            bundle.putBoolean("key_chat_is_edu", z);
            bundle.putString("extra_key_source", str);
            Activity activity2 = activity;
            if (!DesktopUtil.m144301a((Context) activity2)) {
                Intent intent = new Intent(activity2, AddGroupMemberActivity.class);
                intent.putExtras(bundle);
                activity.startActivityForResult(intent, i);
                return;
            }
            C44931a aVar = new C44931a();
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(aVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1).mo134945a("AddGroupMemberActivity").mo134930b());
        }
    }
}
