package com.ss.android.lark.chat.chatwindow.chat.message.p1631f;

import android.view.View;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a */
public class C33348a {

    /* renamed from: a */
    public static final int f85906a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    public static final int f85907b = UIHelper.dp2px(12.0f);

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a$b */
    public static class C33350b {
        /* renamed from: a */
        public static C34034b m129129a(boolean z) {
            int i;
            if (z) {
                i = 3;
            } else {
                i = 2;
            }
            return C34034b.m131984b(i);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a$c */
    public static class C33351c {
        /* renamed from: a */
        public static C34035c m129130a(boolean z) {
            return C34035c.m131993a(C33360a.m129162f(z), C33360a.m129166j(z));
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a$a */
    public static class C33349a {
        /* renamed from: a */
        public static BubbleStyle m129127a(int i, boolean z) {
            return m129126a(i, null, z);
        }

        /* renamed from: a */
        public static BubbleStyle m129128a(boolean z, boolean z2) {
            return m129126a(!z ? 1 : 0, null, z2);
        }

        /* renamed from: a */
        public static BubbleStyle m129126a(int i, View view, boolean z) {
            return BubbleStyle.m131964a(i, view, new int[]{C33348a.f85906a, C33348a.f85907b, C33348a.f85906a, C33348a.f85907b});
        }
    }
}
