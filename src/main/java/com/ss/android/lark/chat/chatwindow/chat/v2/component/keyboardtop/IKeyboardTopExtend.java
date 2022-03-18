package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtend;", "", "canOtherExtendShow", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "create", "Landroid/view/View;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "getListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendListener;", "getType", "isEnable", "isShowing", "setShowing", "", "update", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.d */
public interface IKeyboardTopExtend {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.d$a */
    public static final class C33552a {
        /* renamed from: a */
        public static boolean m130036a(IKeyboardTopExtend dVar, ExtendType extendType) {
            Intrinsics.checkParameterIsNotNull(extendType, ShareHitPoint.f121869d);
            return true;
        }
    }

    /* renamed from: a */
    View mo123281a(Context context, IKeyboardExtendData aVar);

    /* renamed from: a */
    ExtendType mo123282a();

    /* renamed from: a */
    void mo123283a(IKeyboardExtendData aVar);

    /* renamed from: a */
    void mo123284a(boolean z);

    /* renamed from: a */
    boolean mo123285a(ExtendType extendType);

    /* renamed from: b */
    boolean mo123286b();

    /* renamed from: c */
    boolean mo123287c();

    /* renamed from: d */
    IKeyboardExtendListener mo123288d();
}
