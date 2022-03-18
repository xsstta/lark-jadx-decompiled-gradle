package com.ss.android.lark.search.impl.func.pick.chatpick;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class PickChatLauncher {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PickChatType {
    }

    /* renamed from: a */
    public static Intent m207656a(Context context, List<BasePickViewData> list, int i) {
        return m207658a(context, list, "", i);
    }

    /* renamed from: a */
    public static Intent m207657a(Context context, List<BasePickViewData> list, String str) {
        return m207658a(context, list, str, 0);
    }

    /* renamed from: a */
    public static Intent m207658a(Context context, List<BasePickViewData> list, String str, int i) {
        Intent intent = new Intent(context, PickChatActivity.class);
        intent.putExtra("message/filter/picked_chat", new ArrayList(list));
        intent.putExtra("filter/from_source", str);
        intent.putExtra("message/filter/pick_chat_type", i);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }
}
