package com.ss.android.lark.main.router.loader;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.main.C44134a;
import java.util.HashMap;

public class TargetPageLoader {

    /* renamed from: a */
    public HashMap<Target, Boolean> f112864a;

    public enum Target {
        CHAT_SETTING
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.router.loader.TargetPageLoader$a */
    public static final class C44512a {

        /* renamed from: a */
        public static final TargetPageLoader f112869a = new TargetPageLoader();
    }

    /* renamed from: a */
    public static TargetPageLoader m176590a() {
        return C44512a.f112869a;
    }

    private TargetPageLoader() {
        this.f112864a = new HashMap<>();
    }

    /* renamed from: a */
    public boolean mo157957a(Context context, final String str) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(str)) {
            return false;
        }
        final Activity activity = (Activity) context;
        final Target target = Target.CHAT_SETTING;
        Boolean bool = this.f112864a.get(target);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        this.f112864a.put(target, true);
        C44134a.m174959a().mo133192L().mo133378a(str, new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.main.router.loader.TargetPageLoader.C445111 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                TargetPageLoader.this.f112864a.put(target, false);
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    if (num == null) {
                        num = 0;
                    }
                    C44134a.m174959a().mo133193M().openChatSetting(activity, str, num.intValue());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                TargetPageLoader.this.f112864a.put(target, false);
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    C44134a.m174959a().mo133193M().openChatSetting(activity, str, 0);
                }
            }
        });
        return true;
    }
}
