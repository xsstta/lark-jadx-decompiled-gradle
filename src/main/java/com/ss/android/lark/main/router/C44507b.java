package com.ss.android.lark.main.router;

import android.content.Context;
import android.net.Uri;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.utils.C57858o;

/* renamed from: com.ss.android.lark.main.router.b */
public class C44507b {
    /* renamed from: a */
    public void mo157954a(Context context, String str) {
        Uri parse = Uri.parse(str);
        if (!C44508c.m176554a(context, parse) && !"/main".equals(parse.getPath())) {
            Log.m165383e("RouterCallBack", "openLostPage:" + str);
            C57858o.m224559a(MainActivity.class).mo196050a(335544320).mo196064a(context);
        }
    }
}
