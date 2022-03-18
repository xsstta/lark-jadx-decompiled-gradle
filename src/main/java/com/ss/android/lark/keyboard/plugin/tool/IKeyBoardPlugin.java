package com.ss.android.lark.keyboard.plugin.tool;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003$%&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fH&J\b\u0010\u0013\u001a\u00020\nH&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\nH&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H&¨\u0006'"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "", "onActivityResult", "", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "Landroid/view/View;", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onUsableChanged", "isUsable", "onVisibleChanged", "isVisible", "setKeyBoardContext", "context", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "IKeyBoardContext", "IPluginClickListener", "ITouchActionNotifier", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.b */
public interface IKeyBoardPlugin {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b$a */
    public static final class C40806a {
        /* renamed from: a */
        public static void m161550a(IKeyBoardPlugin bVar, boolean z) {
        }

        /* renamed from: a */
        public static boolean m161551a(IKeyBoardPlugin bVar) {
            return false;
        }

        /* renamed from: a */
        public static boolean m161552a(IKeyBoardPlugin bVar, int i, Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001.J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H&J\b\u0010\u0017\u001a\u00020\u0012H&J\b\u0010\u0018\u001a\u00020\u0012H&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020\u0003H&J\u0018\u0010%\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H&J\"\u0010&\u001a\u00020\u00032\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(2\b\u0010*\u001a\u0004\u0018\u00010+H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010-\u001a\u00020\u0003H&¨\u0006/"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "", "clearPluginPanelContainer", "", "getActivity", "Landroid/app/Activity;", "getInputHeight", "", "getKeyBoardInputSupport", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getMenuHeight", "getParentMsgId", "", "getRootMsgId", "getSourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "getToolPanelHeight", "hasKeyBoardInputSupport", "", "hideSysKeyBoard", "hideSysKeyboardAndRun", "action", "Lkotlin/Function0;", "isSysKeyBoardShow", "isToolPanelShow", "notifySend", "registerInputPluginChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "selectPluginWithNoPanel", "plugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "selectPluginWithPanel", "setEditorWatcher", "textWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "showSysKeyBoard", "showSysKeyboardAndRun", "startInputSupportPlugin", "inputSupportPlugin", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "params", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "unRegisterInputPluginChangeListener", "unSelectedCurrPlugin", "ITextWatcher", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b$b */
    public interface IKeyBoardContext {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH&J\"\u0010\u0012\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "", "onEditorFocused", "", "editText", "Landroid/widget/EditText;", "onEditorKeyPreIme", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onTextChanged", "s", "", "start", "before", "count", "onTextSelected", "Landroid/text/Editable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b$b$a */
        public interface ITextWatcher {

            @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b$b$a$a */
            public static final class C40807a {
                /* renamed from: a */
                public static void m161575a(ITextWatcher aVar, Editable editable, int i, int i2) {
                }

                /* renamed from: a */
                public static void m161576a(ITextWatcher aVar, EditText editText) {
                    Intrinsics.checkParameterIsNotNull(editText, "editText");
                }

                /* renamed from: a */
                public static boolean m161577a(ITextWatcher aVar, int i, KeyEvent keyEvent) {
                    return false;
                }
            }

            /* renamed from: a */
            void mo147170a(Editable editable, int i, int i2);

            /* renamed from: a */
            void mo147171a(EditText editText);

            /* renamed from: a */
            void mo147172a(CharSequence charSequence, int i, int i2, int i3);

            /* renamed from: a */
            boolean mo147173a(int i, KeyEvent keyEvent);
        }

        /* renamed from: A */
        boolean mo147364A();

        /* renamed from: B */
        Activity mo147365B();

        /* renamed from: C */
        int mo147366C();

        /* renamed from: D */
        int mo147367D();

        /* renamed from: E */
        int mo147368E();

        /* renamed from: F */
        boolean mo147369F();

        /* renamed from: a */
        void mo147370a(ITextWatcher aVar);

        /* renamed from: a */
        void mo147371a(KClass<? extends IInputSupportPlugin> kClass, TransationData jVar);

        /* renamed from: b */
        KeyboardScene mo147372b();

        /* renamed from: b */
        void mo147373b(IKeyBoardPlugin bVar);

        /* renamed from: d */
        boolean mo147374d();

        /* renamed from: j */
        void mo147375j();

        /* renamed from: k */
        void mo147376k();

        /* renamed from: q */
        String mo147377q();

        /* renamed from: r */
        String mo147378r();

        /* renamed from: v */
        void mo147379v();

        /* renamed from: y */
        void mo147380y();

        /* renamed from: z */
        IOutInputSupport mo147381z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "", "onClicked", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b$c */
    public interface IPluginClickListener {
        /* renamed from: a */
        void mo122033a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "", "notifyClicked", "", "clicked", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "notifySelected", "plugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b$d */
    public interface ITouchActionNotifier {
        /* renamed from: a */
        void mo147313a(IKeyBoardPlugin bVar);

        /* renamed from: b */
        void mo147314b(IKeyBoardPlugin bVar);
    }

    /* renamed from: a */
    View mo147287a(ViewGroup viewGroup);

    /* renamed from: a */
    View mo147288a(ViewGroup viewGroup, ITouchActionNotifier dVar);

    /* renamed from: a */
    void mo147290a(IKeyBoardContext bVar);

    /* renamed from: a */
    void mo147291a(boolean z);

    /* renamed from: a */
    boolean mo147292a(int i, Intent intent);

    /* renamed from: b */
    void mo147294b(ViewGroup viewGroup);

    /* renamed from: b */
    void mo147295b(boolean z);

    /* renamed from: c */
    void mo147297c(boolean z);

    /* renamed from: d */
    void mo147299d(boolean z);

    /* renamed from: e */
    void mo147301e(boolean z);

    /* renamed from: g */
    void mo147303g();

    /* renamed from: h */
    void mo147304h();

    /* renamed from: i */
    void mo147305i();

    /* renamed from: j */
    void mo147306j();

    /* renamed from: k */
    boolean mo147307k();
}
