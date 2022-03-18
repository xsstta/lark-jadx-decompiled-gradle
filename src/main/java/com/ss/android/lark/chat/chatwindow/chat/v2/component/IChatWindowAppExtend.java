package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.biz.im.api.ChatBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H&J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\nH&J\b\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowAppExtend;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "handleBack", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onDestroy", "onFragmentBringToFront", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "parseNewIntentPurpose", "intent", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.e */
public interface IChatWindowAppExtend extends IChatWindowApp {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.e$a */
    public static final class C33504a {
        /* renamed from: a */
        public static boolean m129837a(IChatWindowAppExtend eVar, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(keyEvent, "event");
            return false;
        }

        /* renamed from: a */
        public static boolean m129838a(IChatWindowAppExtend eVar, MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            return false;
        }
    }

    /* renamed from: a */
    int mo123120a(Intent intent);

    /* renamed from: a */
    void mo123124a(ChatBundle chatBundle);

    /* renamed from: a */
    boolean mo123132a(KeyEvent keyEvent);

    /* renamed from: a */
    boolean mo123133a(MotionEvent motionEvent);

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp
    /* renamed from: j */
    boolean mo123139j();

    /* renamed from: l */
    void mo123141l();

    void onActivityResult(int i, int i2, Intent intent);

    /* renamed from: r */
    void mo122001r();
}
