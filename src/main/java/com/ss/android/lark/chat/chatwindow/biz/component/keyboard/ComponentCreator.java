package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import android.app.Activity;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponentV2;
import com.ss.android.lark.chat.chatwindow.secretchat.component.keyboard.plugin.SecretKeyboardComponentV2;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/ComponentCreator;", "", "()V", "createKeyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "secret", "", "context", "Landroid/app/Activity;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;", "dependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "controlStatusChangeListener", "listener", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "statusListener", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.b */
public final class ComponentCreator {

    /* renamed from: a */
    public static final ComponentCreator f85048a = new ComponentCreator();

    private ComponentCreator() {
    }

    /* renamed from: a */
    public final IKeyboardComponent mo122060a(IKeyboardComponent cVar, IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$controlStatusChangeListener");
        if (cVar2 != null) {
            cVar.mo121970a(cVar2);
        }
        return cVar;
    }

    /* renamed from: a */
    public final IKeyboardComponent mo122061a(IKeyboardComponent cVar, IKeyBoardStatusListener eVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$statusListener");
        if (eVar != null) {
            cVar.mo121975a(eVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final IKeyboardComponent mo122062a(boolean z, Activity activity, IKeyboardDependenceViewModel eVar, KeyboardComponentDependency fVar) {
        KeyboardComponentV2 keyboardComponentV2;
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(eVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(fVar, "dependency");
        if (!ChatKeyboardFgUtil.f85002a.mo122016a()) {
            return new KeyboardComponent(activity, eVar, fVar);
        }
        if (z) {
            keyboardComponentV2 = new SecretKeyboardComponentV2(activity, eVar, fVar);
        } else {
            keyboardComponentV2 = new KeyboardComponentV2(activity, eVar, fVar);
        }
        return keyboardComponentV2;
    }
}
