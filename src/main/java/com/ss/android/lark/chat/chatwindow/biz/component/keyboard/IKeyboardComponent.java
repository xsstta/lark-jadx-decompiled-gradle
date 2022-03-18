package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import android.view.View;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000245J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH&J\b\u0010\r\u001a\u00020\u0004H&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&J!\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u0018J\n\u0010\u0019\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u0004H&J\b\u0010\u001e\u001a\u00020\u0012H&J\b\u0010\u001f\u001a\u00020\u0012H&J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0016H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H&J\u001e\u0010(\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020*0)H&J\b\u0010+\u001a\u00020\u0004H&J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0012H&J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H&J0\u00100\u001a\u00020\u00042\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)022\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)02H&¨\u00066"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "addKeyboardStatusListener", "", "listener", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "appendText", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "postText", "closePanelAndSysKeyboard", "enterReplyMode", "replyInfo", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "isReEdit", "", "resetOnStart", "getKBPlugin", "T", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "name", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getReplyParentMsgId", "getReplyRootMsgId", "getRootView", "Landroid/view/View;", "hideKeyboard", "isKeyboardShown", "isKeyboardTipShown", "registerIInputPlugin", "plugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "registerInputChangeListener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerKBPlugin", "registerKeyboardControlStatusChangeListener", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "registerPlusItem", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "showKeyboard", "toggleKeyboardTipShown", "shown", "unRegisterInputChangeListener", "unRegisterKeyboardControlStatusChangeListener", "updatePlusItems", "removed", "", "added", "IKeyboardComponentCallbacks", "OnKeyboardControlStatusChangeListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c */
public interface IKeyboardComponent extends IComponent<IKeyboardComponentCallbacks> {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$a */
    public static final class C33035a {
        /* renamed from: a */
        public static void m127730a(IKeyboardComponent cVar, IKeyboardComponentCallbacks bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            IComponent.C33505b.m129842a(cVar, bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "onTextInputAreaResume", "onTextInputAreaStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$b */
    public interface IKeyboardComponentCallbacks extends IComponentCallbacks {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$b$a */
        public static final class C33036a {
            /* renamed from: a */
            public static void m127734a(IKeyboardComponentCallbacks bVar) {
            }

            /* renamed from: a */
            public static void m127735a(IKeyboardComponentCallbacks bVar, KeyBoard fVar) {
                Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            }

            /* renamed from: b */
            public static void m127736b(IKeyboardComponentCallbacks bVar) {
            }
        }

        /* renamed from: a */
        void mo122065a();

        /* renamed from: a */
        void mo122066a(KeyBoard fVar);

        /* renamed from: b */
        void mo122067b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "", "onKeyboardControlStatusChange", "", "show", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$c */
    public interface OnKeyboardControlStatusChangeListener {
        /* renamed from: a */
        void mo122068a(boolean z);
    }

    /* renamed from: a */
    <T extends IKeyBoardPlugin> T mo121967a(String str);

    /* renamed from: a */
    void mo121970a(OnKeyboardControlStatusChangeListener cVar);

    /* renamed from: a */
    void mo122063a(C35221d dVar, boolean z, boolean z2);

    /* renamed from: a */
    void mo121975a(IKeyBoardStatusListener eVar);

    /* renamed from: a */
    void mo121976a(InputPluginController.InputSupportPluginChangeListener aVar);

    /* renamed from: a */
    void mo122064a(RichText richText, String str, RichText richText2);

    /* renamed from: a */
    void mo121977a(String str, IKeyboardCreator.IPlugin<IPlusItem> bVar);

    /* renamed from: a */
    void mo121978a(String str, IKeyBoardPlugin bVar);

    /* renamed from: a */
    void mo121979a(List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list, List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list2);

    /* renamed from: a */
    void mo121980a(boolean z);

    boolean an_();

    /* renamed from: b */
    void mo121983b(OnKeyboardControlStatusChangeListener cVar);

    /* renamed from: b */
    void mo121984b(InputPluginController.InputSupportPluginChangeListener aVar);

    /* renamed from: i */
    View mo121991i();

    /* renamed from: j */
    boolean mo121992j();

    /* renamed from: k */
    String mo121993k();

    /* renamed from: l */
    String mo121994l();

    /* renamed from: m */
    void mo121995m();

    /* renamed from: n */
    void mo121996n();

    /* renamed from: p */
    void mo121999p();
}
