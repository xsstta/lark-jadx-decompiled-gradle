package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import android.content.Context;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/LayoutSizeHelper;", "", "()V", "CHAT_BUBBLE_PADDING", "", "CHAT_COUNT_DOWN_VIEW_MARGIN", "CHAT_GUIDE_LINE_MARGIN", "CHAT_GUIDE_LINE_MARGIN_DP", "CHAT_ITEM_PADDING_RIGHT", "CHAT_READ_STATUS_VIEW", "CHAT_READ_STATUS_VIEW_MARGIN", "LOG_TAG", "", "ORIGINAL_CHAT_AVATAR_SIZE", "TEXT_ITALIC_PADDING", "THREAD_BUBBLE_PADDING", "TIME_TEXT_SIZE", "enableNewLayout", "", "calcuThreadItemWidth", "context", "Landroid/content/Context;", "calculateChatItemWidth", "calculateChatThreadItemWidth", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.g */
public final class LayoutSizeHelper {

    /* renamed from: a */
    public static final LayoutSizeHelper f85478a = new LayoutSizeHelper();

    /* renamed from: b */
    private static final boolean f85479b;

    /* renamed from: c */
    private static final int f85480c = UIHelper.dp2px((float) 56);

    /* renamed from: d */
    private static final int f85481d = 20;

    /* renamed from: e */
    private static final int f85482e = UIHelper.dp2px(5.0f);

    /* renamed from: f */
    private static final int f85483f;

    /* renamed from: g */
    private static final int f85484g = UIHelper.dp2px(6.0f);

    /* renamed from: h */
    private static final int f85485h = UIHelper.dp2px(12.0f);

    /* renamed from: i */
    private static final int f85486i = UIHelper.dp2px(16.0f);

    /* renamed from: j */
    private static final int f85487j = UIHelper.dp2px(2.0f);

    private LayoutSizeHelper() {
    }

    static {
        int i;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        boolean h = b.mo134580h();
        f85479b = h;
        if (h) {
            i = UIHelper.dp2px(16.0f);
        } else {
            i = UIHelper.dp2px(15.0f);
        }
        f85483f = i;
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m128407b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return (DeviceUtils.getScreenWidth(context) - (f85486i * 2)) - f85487j;
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m128408c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return (DeviceUtils.getScreenWidth(context) - (f85486i * 2)) - f85487j;
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m128406a(Context context) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        int c = f85480c + (LKUIDisplayManager.m91881c(context, 32) - UIHelper.dp2px((float) 32));
        Integer f = MagicWindowUtil.m224688f(context);
        if (f != null) {
            i = f.intValue();
        } else {
            i = 0;
        }
        return (((((i - c) - f85483f) - (f85485h * 2)) - LKUIDisplayManager.m91881c(context, f85481d)) - f85482e) - f85487j;
    }
}
