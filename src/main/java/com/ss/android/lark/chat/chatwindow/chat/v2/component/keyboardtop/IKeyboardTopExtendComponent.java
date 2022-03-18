package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop;

import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0004H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fH&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent$IKeyboardTopExtendCallbacks;", "changeBottomMargin", "", "toolBoxHeight", "", "getSmartReplyContainer", "Landroid/view/ViewGroup;", "getTimeZone", "hideExtend", "ype", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/ExtendType;", "hideKeyboardExtend", "registerKeyboardTopExtend", "extend", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtend;", "setOnKeyboardExtendStatusChangeListener", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/KeyboardExtendsManager$OnExtendStatusChangeListener;", "showExtend", ShareHitPoint.f121869d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardExtendData;", "showKeyboardExtend", "unRegisterKeyboardTopExtend", "IKeyboardTopExtendCallbacks", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.e */
public interface IKeyboardTopExtendComponent extends IComponent<IKeyboardTopExtendCallbacks> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.e$a */
    public static final class C33553a {
        /* renamed from: a */
        public static void m130042a(IKeyboardTopExtendComponent eVar, IKeyboardTopExtendCallbacks bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            IComponent.C33505b.m129842a(eVar, bVar);
        }

        /* renamed from: a */
        public static boolean m130043a(IKeyboardTopExtendComponent eVar) {
            return IComponent.C33505b.m129843a(eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboardtop/IKeyboardTopExtendComponent$IKeyboardTopExtendCallbacks;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.e$b */
    public interface IKeyboardTopExtendCallbacks extends IComponentCallbacks {
    }

    /* renamed from: a */
    void mo123269a(ExtendType extendType);

    /* renamed from: a */
    void mo123270a(ExtendType extendType, IKeyboardExtendData aVar);

    /* renamed from: a */
    void mo123271a(IKeyboardTopExtend dVar);

    /* renamed from: b */
    ViewGroup mo123274b();

    /* renamed from: c */
    ViewGroup mo121985c();
}
