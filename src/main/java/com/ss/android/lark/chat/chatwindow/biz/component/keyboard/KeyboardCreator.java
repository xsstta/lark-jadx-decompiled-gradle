package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.ViewGroup;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.widget.AutoAdjustSizeLayoutManager;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u0004\u0018\u0001H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator;", "context", "Landroid/app/Activity;", "dependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator$IKeyboardBuildDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator$IKeyboardBuildDependency;)V", "getContext", "()Landroid/app/Activity;", "getDependency", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator$IKeyboardBuildDependency;", "mKeyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "create", "container", "Landroid/view/ViewGroup;", "factory", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IKeyboardPluginFactory;", "getInputPlugin", "T", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "name", "", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getKBPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "start", "IKeyboardBuildDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.g */
public final class KeyboardCreator implements IKeyboardCreator {

    /* renamed from: a */
    public KeyBoard f85059a;

    /* renamed from: b */
    private final Activity f85060b;

    /* renamed from: c */
    private final IKeyboardBuildDependency f85061c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J8\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0007H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator$IKeyboardBuildDependency;", "", "attachNestRoot", "", "nestScrollFrameLayout", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "enableLateInit", "", "resetDraft", "resetOnStart", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "saveDraft", "parentId", "", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "saveDraftOnStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.g$a */
    public interface IKeyboardBuildDependency {
        /* renamed from: a */
        void mo122002a(NestScrollFrameLayout nestScrollFrameLayout);

        /* renamed from: a */
        void mo122003a(String str, RichText richText, String str2, RichText richText2, boolean z);

        /* renamed from: a */
        void mo122004a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar);

        /* renamed from: a */
        boolean mo122005a();
    }

    /* renamed from: b */
    public final IKeyboardBuildDependency mo122094b() {
        return this.f85061c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "queueIdle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.g$c */
    static final class C33040c implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ KeyboardCreator f85063a;

        /* renamed from: b */
        final /* synthetic */ TransationData f85064b;

        C33040c(KeyboardCreator gVar, TransationData jVar) {
            this.f85063a = gVar;
            this.f85064b = jVar;
        }

        public final boolean queueIdle() {
            PerfLog.start("keyboard_init_start", "");
            KeyBoard fVar = this.f85063a.f85059a;
            if (fVar != null) {
                fVar.mo146799a(this.f85064b);
            }
            PerfLog.end("keyboard_init_start", "");
            return false;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator
    /* renamed from: a */
    public KeyBoard mo122070a() {
        if (this.f85059a != null) {
            TransationData jVar = new TransationData();
            jVar.mo147176a("param_show_edit_cursor", false);
            if (this.f85061c.mo122005a()) {
                Looper.myQueue().addIdleHandler(new C33040c(this, jVar));
            } else {
                KeyBoard fVar = this.f85059a;
                if (fVar != null) {
                    fVar.mo146799a(jVar);
                }
            }
            KeyBoard fVar2 = this.f85059a;
            if (fVar2 == null) {
                Intrinsics.throwNpe();
            }
            return fVar2;
        }
        throw new RuntimeException("create keyboard first");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J8\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardCreator$create$keyboard$1", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "attachNestRoot", "", "nestScrollFrameLayout", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "resetDraft", "resetOnStart", "", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "saveDraft", "parentId", "", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "saveDraftOnStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.g$b */
    public static final class C33039b implements IKeyBoardDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardCreator f85062a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33039b(KeyboardCreator gVar) {
            this.f85062a = gVar;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
            this.f85062a.mo122094b().mo122002a(nestScrollFrameLayout);
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            this.f85062a.mo122094b().mo122004a(z, bVar);
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
            this.f85062a.mo122094b().mo122003a(str, richText, str2, richText2, z);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator
    /* renamed from: a */
    public IKeyboardCreator mo122069a(IKeyboardCreator.IKeyboardPluginFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "factory");
        KeyBoard fVar = this.f85059a;
        if (fVar != null) {
            if (fVar != null) {
                aVar.mo122072a();
            }
            return this;
        }
        throw new RuntimeException("create keyboard first");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator
    /* renamed from: a */
    public KeyBoard mo122071a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        KeyBoard fVar = new KeyBoard(this.f85060b, viewGroup, new C33039b(this), null, null, this.f85061c.mo122005a(), 24, null);
        fVar.mo146801a(new AutoAdjustSizeLayoutManager());
        fVar.mo146795a(KeyboardScene.ChatMain);
        this.f85059a = fVar;
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        return fVar;
    }

    public KeyboardCreator(Activity activity, IKeyboardBuildDependency aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f85060b = activity;
        this.f85061c = aVar;
    }
}
