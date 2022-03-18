package com.ss.android.lark.keyboard.plugin.input;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 )2\u00020\u0001:\u0002)*J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\nH&J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0019\u001a\u00020\bH&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0013H&J\b\u0010\u001d\u001a\u00020\u0003H&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(H&¨\u0006+"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "clearEditorFocus", "", "getLayoutId", "", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onCreateSendBtn", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onCreateView", "activity", "Landroid/app/Activity;", "onDestroy", "onEnableChanged", "isEnable", "", "onFinishReplyMode", "onInitView", "rootView", "onResume", "params", "onSaveDraft", "onSetDraft", "draft", "append", "onStop", "registerAdditionPlugin", "name", "", "plugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "setInputSupportContext", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "setTextWatcher", "textWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "Companion", "OnReplyModelChangeListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.f */
public interface IInputSupportPlugin extends IOutInputSupport {

    /* renamed from: a */
    public static final Companion f103457a = Companion.f103458a;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.f$b */
    public static final class C40730b {
        /* renamed from: a */
        public static String m161156a(IInputSupportPlugin fVar) {
            return IOutInputSupport.C40685a.m160899a(fVar);
        }

        /* renamed from: a */
        public static void m161157a(IInputSupportPlugin fVar, boolean z) {
            IOutInputSupport.C40685a.m160900a(fVar, z);
        }

        /* renamed from: b */
        public static boolean m161158b(IInputSupportPlugin fVar) {
            return IOutInputSupport.C40685a.m160901b(fVar);
        }

        /* renamed from: c */
        public static boolean m161159c(IInputSupportPlugin fVar) {
            return IOutInputSupport.C40685a.m160902c(fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin$OnReplyModelChangeListener;", "", "onReplyModelChanged", "", "isReplyModel", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.f$c */
    public interface OnReplyModelChangeListener {
        /* renamed from: a */
        void mo147128a(boolean z);
    }

    /* renamed from: a */
    View mo147031a(Activity activity, View view);

    /* renamed from: a */
    View mo147032a(Activity activity, ViewGroup viewGroup);

    /* renamed from: a */
    View mo147033a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo147037a(IInputContext eVar);

    /* renamed from: a */
    void mo147038a(TransationData jVar);

    /* renamed from: a */
    void mo147087a(TransationData jVar, boolean z);

    /* renamed from: a */
    void mo147039a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar);

    /* renamed from: a */
    void mo147009a(String str, IInputSupportAdditionPlugin iInputSupportAdditionPlugin);

    /* renamed from: b */
    void mo147088b(TransationData jVar);

    /* renamed from: b */
    void mo147011b(boolean z);

    /* renamed from: c */
    void mo147012c();

    /* renamed from: d */
    void mo147013d();

    /* renamed from: e */
    void mo147014e();

    /* renamed from: i */
    int mo147089i();

    /* renamed from: j */
    void mo147090j();

    /* renamed from: k */
    TransationData mo147053k();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin$Companion;", "", "()V", "DRAFT_EXTRA_DATA", "", "DRAFT_MSG_RICHTEXT", "DRAFT_POST_RICHTEXT", "DRAFT_POST_TITLE", "EXTRA_CUR_FOCUS_ET", "EXTRA_CUR_SELECTOR", "REPLY_DATA_MSGDIGEST", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.f$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f103458a = new Companion();

        private Companion() {
        }
    }
}
