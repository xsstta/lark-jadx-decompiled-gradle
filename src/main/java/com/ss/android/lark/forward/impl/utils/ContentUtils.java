package com.ss.android.lark.forward.impl.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.sticker.StickerInfo;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/impl/utils/ContentUtils;", "", "()V", "getStickerDesc", "", "stickerContent", "Lcom/ss/android/lark/chat/entity/message/content/StickerContent;", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.c.a */
public final class ContentUtils {

    /* renamed from: a */
    public static final ContentUtils f98777a = new ContentUtils();

    private ContentUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m151532a(StickerContent stickerContent) {
        StickerInfo stickerInfo;
        String description;
        String str;
        if (!(stickerContent == null || (stickerInfo = stickerContent.getStickerInfo()) == null || (description = stickerInfo.getDescription()) == null)) {
            if (TextUtils.isEmpty(description)) {
                str = null;
            } else {
                str = '[' + description + ']';
            }
            if (str != null) {
                return str;
            }
        }
        AbstractC38365a a = C38364a.m151054a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ForwardModule.getDependency()");
        String string = UIUtils.getString(a.mo140434a(), R.string.Lark_Legacy_StickerHolder);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(Forwar…ark_Legacy_StickerHolder)");
        return string;
    }
}
