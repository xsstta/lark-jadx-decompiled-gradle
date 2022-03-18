package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.impl;

import android.content.Context;
import android.text.Layout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.LayoutSizeHelper;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ILayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.layout.C58487b;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/impl/CharSequenceProcessor;", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ILayoutProcessor;", "", "()V", "getTextColor", "", "isDisable", "", "context", "Landroid/content/Context;", "process", "Landroid/text/Layout;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "params", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.a.a */
public final class CharSequenceProcessor implements ILayoutProcessor<CharSequence> {
    /* renamed from: a */
    private final int m128340a(boolean z, Context context) {
        if (z) {
            return C52990a.m205239c(context, R.color.text_placeholder);
        }
        return C52990a.m205239c(context, R.color.text_title);
    }

    /* renamed from: a */
    public Layout mo122459a(CharSequence charSequence, ProcessParams dVar, Context context) {
        int i;
        float f;
        Intrinsics.checkParameterIsNotNull(charSequence, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(context, "context");
        switch (dVar.mo122487l()) {
            case 17:
                i = LayoutSizeHelper.m128406a(context);
                break;
            case 18:
                i = LayoutSizeHelper.m128407b(context);
                break;
            case 19:
                i = LayoutSizeHelper.m128408c(context);
                break;
            default:
                i = Integer.MAX_VALUE;
                break;
        }
        boolean z = !dVar.mo122482h();
        TextLayoutBuilder a = new TextLayoutBuilder().mo198149a(charSequence);
        if (DesktopUtil.m144307b()) {
            f = UIHelper.sp2px(17.0f);
        } else {
            f = LKUIDisplayManager.m91864a(context, 17);
        }
        return a.mo198144a((int) f).mo198152b(m128340a(dVar.mo122476e(), context)).mo198157d(i).mo198151b(1.0f).mo198158d(true).mo198148a(new C58487b()).mo198143a((float) UIHelper.dp2px(2.5f)).mo198156c(z).mo198142a();
    }
}
