package com.ss.android.lark.setting.service.usersetting.keyboardsend;

import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/keyboardsend/KeyboardSendManager;", "", "()V", "KEY_ENTER_SEND", "", "isEnableEnterSend", "", "isEnableKeyboardRedesign", "setEnterSendMode", "", "enableEnterSend", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.usersetting.d.a */
public final class KeyboardSendManager {

    /* renamed from: a */
    public static final KeyboardSendManager f135088a = new KeyboardSendManager();

    private KeyboardSendManager() {
    }

    /* renamed from: a */
    public final boolean mo186784a() {
        return C54115c.m210080a().mo178288c("messenger.message_inputbox_redesign");
    }

    /* renamed from: b */
    public final boolean mo186785b() {
        if (!mo186784a()) {
            return false;
        }
        return C57744a.m224104a().getBoolean("KEY_ENTER_SEND", false);
    }

    /* renamed from: a */
    public final void mo186783a(boolean z) {
        C57744a.m224104a().putBoolean("KEY_ENTER_SEND", z);
    }
}
