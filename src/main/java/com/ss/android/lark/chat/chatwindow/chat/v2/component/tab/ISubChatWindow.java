package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import android.content.Intent;
import android.view.KeyEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016J/\u0010\t\u001a\u0004\u0018\u0001H\u0001\"\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\rH&¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H&J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H&J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/ISubChatWindow;", "T", "", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "getComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "handleBack", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "onStop", "setTitleStateChangeListener", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.f */
public interface ISubChatWindow<T> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.f$a */
    public static final class C33695a {
        /* renamed from: a */
        public static <T> boolean m130667a(ISubChatWindow<T> fVar, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            return false;
        }
    }

    /* renamed from: a */
    <T extends IComponent<? extends IComponentCallbacks>> T mo123550a(Class<T> cls);

    /* renamed from: a */
    void mo123554a(IChatTabPageSpec.OnTitleStateChangeListener dVar);

    /* renamed from: a */
    boolean mo123557a(KeyEvent keyEvent);

    /* renamed from: h */
    boolean mo121990h();

    void onActivityResult(int i, int i2, Intent intent);

    void onStop();
}
