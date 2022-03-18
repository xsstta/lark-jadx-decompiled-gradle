package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.app.Activity;
import android.widget.EditText;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28531b;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36470d;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputExpandPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartComposePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "isEnableRichTextInput", "", "()Z", "isEnableRichTextInput$delegate", "Lkotlin/Lazy;", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "postInputCompose", "Lcom/ss/android/lark/ai/IComposeController;", "textInputCompose", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.n */
public final class SmartComposePlugin extends BaseChatPlugin {

    /* renamed from: a */
    public IComposeController f87124a;

    /* renamed from: b */
    public IComposeController f87125b;

    /* renamed from: c */
    private IKeyboardComponent f87126c;

    /* renamed from: d */
    private final Lazy f87127d = LazyKt.lazy(C33813a.INSTANCE);

    /* renamed from: b */
    public final boolean mo123842b() {
        return ((Boolean) this.f87127d.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartComposePlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.n$b */
    public static final class C33814b implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ SmartComposePlugin f87128a;

        /* renamed from: b */
        final /* synthetic */ C35219b f87129b;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.n$b$a */
        static final class RunnableC33815a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33814b f87130a;

            /* renamed from: b */
            final /* synthetic */ KeyBoard f87131b;

            RunnableC33815a(C33814b bVar, KeyBoard fVar) {
                this.f87130a = bVar;
                this.f87131b = fVar;
            }

            public final void run() {
                String str;
                final TextInputSupportPlugin cVar = (TextInputSupportPlugin) this.f87131b.mo146821d("text");
                final PostInputSupportPlugin bVar = (PostInputSupportPlugin) this.f87131b.mo146821d("post");
                final RichTextInputShrinkPlugin dVar = (RichTextInputShrinkPlugin) this.f87131b.mo146821d("input_richtext_shrink");
                final RichTextInputExpandPlugin cVar2 = (RichTextInputExpandPlugin) this.f87131b.mo146821d("input_richtext_expand");
                String str2 = null;
                if (!(cVar == null && dVar == null)) {
                    SmartComposePlugin nVar = this.f87130a.f87128a;
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36470d aj = b.aj();
                    Chat chat = this.f87130a.f87129b.f90956f;
                    if (chat != null) {
                        str = chat.getId();
                    } else {
                        str = null;
                    }
                    nVar.f87124a = aj.mo134484a(str, IComposeController.ConvoType.CHAT, IComposeController.EditorType.TEXT);
                    IComposeController iComposeController = this.f87130a.f87128a.f87124a;
                    if (iComposeController != null) {
                        iComposeController.mo101541a(new AbstractC28531b(this) {
                            /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.SmartComposePlugin.C33814b.RunnableC33815a.C338161 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC33815a f87132a;

                            @Override // com.ss.android.lark.ai.AbstractC28531b
                            /* renamed from: b */
                            public Activity mo101578b() {
                                return this.f87132a.f87130a.f87128a.mo122130k().requireActivity();
                            }

                            @Override // com.ss.android.lark.ai.AbstractC28531b
                            /* renamed from: a */
                            public EditText mo101577a() {
                                RichTextEmojiconEditText richTextEmojiconEditText = null;
                                if (this.f87132a.f87130a.f87128a.mo123842b()) {
                                    RichTextInputShrinkPlugin dVar = dVar;
                                    if (dVar != null) {
                                        richTextEmojiconEditText = dVar.mo147028M();
                                    }
                                    return richTextEmojiconEditText;
                                }
                                TextInputSupportPlugin cVar = cVar;
                                if (cVar != null) {
                                    richTextEmojiconEditText = cVar.mo147266r();
                                }
                                return richTextEmojiconEditText;
                            }

                            {
                                this.f87132a = r1;
                            }
                        });
                    }
                }
                if (bVar != null || cVar2 != null) {
                    SmartComposePlugin nVar2 = this.f87130a.f87128a;
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36470d aj2 = b2.aj();
                    Chat chat2 = this.f87130a.f87129b.f90956f;
                    if (chat2 != null) {
                        str2 = chat2.getId();
                    }
                    nVar2.f87125b = aj2.mo134484a(str2, IComposeController.ConvoType.CHAT, IComposeController.EditorType.TEXT);
                    IComposeController iComposeController2 = this.f87130a.f87128a.f87125b;
                    if (iComposeController2 != null) {
                        iComposeController2.mo101541a(new AbstractC28531b(this) {
                            /* class com.ss.android.lark.chat.chatwindow.chat.v2.plugin.SmartComposePlugin.C33814b.RunnableC33815a.C338172 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC33815a f87135a;

                            @Override // com.ss.android.lark.ai.AbstractC28531b
                            /* renamed from: b */
                            public Activity mo101578b() {
                                return this.f87135a.f87130a.f87128a.mo122130k().requireActivity();
                            }

                            @Override // com.ss.android.lark.ai.AbstractC28531b
                            /* renamed from: a */
                            public EditText mo101577a() {
                                RichTextEmojiconEditText richTextEmojiconEditText = null;
                                if (this.f87135a.f87130a.f87128a.mo123842b()) {
                                    RichTextInputExpandPlugin cVar = cVar2;
                                    if (cVar != null) {
                                        richTextEmojiconEditText = cVar.mo147028M();
                                    }
                                    return richTextEmojiconEditText;
                                }
                                PostInputSupportPlugin bVar = bVar;
                                if (bVar != null) {
                                    richTextEmojiconEditText = bVar.mo147214t();
                                }
                                return richTextEmojiconEditText;
                            }

                            {
                                this.f87135a = r1;
                            }
                        });
                    }
                }
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127735a(this, fVar);
            Chat chat = this.f87129b.f90956f;
            if (chat == null || !chat.isSecret()) {
                UICallbackExecutor.post(new RunnableC33815a(this, fVar));
            }
        }

        C33814b(SmartComposePlugin nVar, C35219b bVar) {
            this.f87128a = nVar;
            this.f87129b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.n$a */
    static final class C33813a extends Lambda implements Function0<Boolean> {
        public static final C33813a INSTANCE = new C33813a();

        C33813a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134586n().mo134685a("messenger.message_inputbox_redesign");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        IComposeController iComposeController = this.f87124a;
        if (iComposeController != null) {
            iComposeController.mo101539a();
        }
        IComposeController iComposeController2 = this.f87125b;
        if (iComposeController2 != null) {
            iComposeController2.mo101539a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartComposePlugin$onCreate$2", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.n$c */
    public static final class C33818c implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ SmartComposePlugin f87138a;

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33818c(SmartComposePlugin nVar) {
            this.f87138a = nVar;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            if (z) {
                IComposeController iComposeController = this.f87138a.f87124a;
                if (iComposeController != null) {
                    iComposeController.mo101540a(i);
                }
                IComposeController iComposeController2 = this.f87138a.f87125b;
                if (iComposeController2 != null) {
                    iComposeController2.mo101540a(i);
                    return;
                }
                return;
            }
            IComposeController iComposeController3 = this.f87138a.f87124a;
            if (iComposeController3 != null) {
                iComposeController3.mo101542b();
            }
            IComposeController iComposeController4 = this.f87138a.f87125b;
            if (iComposeController4 != null) {
                iComposeController4.mo101542b();
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        this.f87126c = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        cVar.mo121971a(new C33814b(this, bVar));
        IKeyboardComponent cVar2 = this.f87126c;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        cVar2.mo121975a(new C33818c(this));
    }
}
