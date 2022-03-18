package com.ss.android.lark.chat.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.sticker.StickerInfo;

/* renamed from: com.ss.android.lark.chat.utils.i */
public class C34343i {
    /* renamed from: a */
    public static String m133180a(StickerContent stickerContent) {
        if (stickerContent == null) {
            return UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Legacy_StickerHolder);
        }
        StickerInfo stickerInfo = stickerContent.getStickerInfo();
        if (stickerInfo == null) {
            return UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Legacy_StickerHolder);
        }
        String description = stickerInfo.getDescription();
        if (TextUtils.isEmpty(description)) {
            return UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Legacy_StickerHolder);
        }
        return "[" + description + "]";
    }
}
