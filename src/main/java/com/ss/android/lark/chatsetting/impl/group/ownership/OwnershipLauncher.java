package com.ss.android.lark.chatsetting.impl.group.ownership;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.GroupOwnershipActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007J$\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/OwnershipLauncher;", "", "()V", "LOG_TAG", "", "getOwnershipIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "openGroupOwnership", "", "isScrollBottom", "", "openGroupOwnershipForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.a */
public final class OwnershipLauncher {

    /* renamed from: a */
    public static final OwnershipLauncher f89537a = new OwnershipLauncher();

    private OwnershipLauncher() {
    }

    /* renamed from: a */
    private final Intent m134809a(Context context, Chat chat) {
        Intent intent;
        if (C34501a.m133935b()) {
            Log.m165389i("OwnershipLauncher", "enter group ownership V2 view");
            intent = new Intent(context, GroupOwnershipActivityV2.class);
        } else {
            Log.m165389i("OwnershipLauncher", "enter group ownership V1 view");
            intent = new Intent(context, GroupOwnershipActivity.class);
        }
        intent.putExtra("key_group_management_chat", chat);
        return intent;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m134810a(Activity activity, Chat chat, int i) {
        if (activity != null) {
            activity.startActivityForResult(f89537a.m134809a(activity, chat), i);
        }
    }
}
