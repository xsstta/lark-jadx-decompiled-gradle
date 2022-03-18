package com.ss.android.lark.keyboard.plugin.tool.at;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency;
import com.ss.android.lark.keyboard.utils.KBHoverUtil;
import com.ss.android.lark.statistics.extensions.C54952a;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J&\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\u0010\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0012H\u0002J\u0010\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u000eH\u0016J\b\u00107\u001a\u00020\u0012H\u0002J\u000e\u00108\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/at/AtKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "chatId", "", "isDarkStyle", "", "showHoverTips", "atDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency;", "(Ljava/lang/String;ZZLcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency;)V", "mIsEnable", "mIsUseable", "mIsVisiable", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mView", "Landroid/view/View;", "addAtChar", "", "createIcon", "insertAt", BottomDialog.f17198f, "chatterName", "isOutChatUser", "isAnonymous", "onActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onUsableChanged", "isUsable", "onVisibleChanged", "isVisible", "sendAtHitPoint", "setKeyBoardContext", "context", "startAtSelector", "updateCurrentChatId", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a */
public final class AtKBPlugin implements IKeyBoardPlugin {

    /* renamed from: f */
    public static final Companion f103741f = new Companion(null);

    /* renamed from: a */
    public boolean f103742a = true;

    /* renamed from: b */
    public IKeyBoardPlugin.IKeyBoardContext f103743b;

    /* renamed from: c */
    public String f103744c;

    /* renamed from: d */
    public final boolean f103745d;

    /* renamed from: e */
    public final IAtDependency f103746e;

    /* renamed from: g */
    private View f103747g;

    /* renamed from: h */
    private boolean f103748h = true;

    /* renamed from: i */
    private boolean f103749i = true;

    /* renamed from: j */
    private final boolean f103750j;

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/at/AtKBPlugin$Companion;", "", "()V", "REQUEST_CODE", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a$b */
    public static final class RunnableC40808b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AtKBPlugin f103751a;

        /* renamed from: b */
        final /* synthetic */ RichTextEmojiconEditText f103752b;

        RunnableC40808b(AtKBPlugin aVar, RichTextEmojiconEditText richTextEmojiconEditText) {
            this.f103751a = aVar;
            this.f103752b = richTextEmojiconEditText;
        }

        public final void run() {
            this.f103752b.requestFocus();
            AtKBPlugin.m161581a(this.f103751a).mo147375j();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        if (DesktopUtil.m144301a((Context) bVar.mo147365B())) {
            this.f103746e.mo127066a();
        }
    }

    /* renamed from: c */
    private final View m161582c() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_at, R.drawable.ud_icon_at_outlined);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…able.ud_icon_at_outlined)");
        return a;
    }

    /* renamed from: a */
    public final void mo147382a() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) bVar.mo147381z().mo146904l();
        if (richTextEmojiconEditText != null) {
            int selectionStart = richTextEmojiconEditText.getSelectionStart();
            Editable editableText = richTextEmojiconEditText.getEditableText();
            if (selectionStart < 0 || selectionStart >= editableText.length()) {
                editableText.append((CharSequence) "@");
            } else {
                editableText.insert(selectionStart, "@");
            }
        }
    }

    /* renamed from: d */
    private final void m161583d() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.AT_MENTION;
            KeyboardHitPointExtraParams.Target target = KeyboardHitPointExtraParams.Target.PUBLIC_AT_MENTION_SELECT_VIEW;
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103743b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(click.plus(target).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())), C40683h.m160856f(b)));
        }
    }

    /* renamed from: b */
    public final void mo147385b() {
        m161583d();
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        if (DesktopUtil.m144301a((Context) bVar.mo147365B())) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103743b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            EditText l = bVar2.mo147381z().mo146904l();
            if (l != null) {
                this.f103746e.mo127068a(1638, (RichTextEmojiconEditText) l, new C40813f(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText");
        }
        this.f103746e.mo127067a(1638);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
        this.f103742a = z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        this.f103748h = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/at/AtKBPlugin$onCreate$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "onTextChanged", "", "s", "", "start", "", "before", "count", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a$c */
    public static final class C40809c implements IKeyBoardPlugin.IKeyBoardContext.ITextWatcher {

        /* renamed from: a */
        final /* synthetic */ AtKBPlugin f103753a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40809c(AtKBPlugin aVar) {
            this.f103753a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public void mo147171a(EditText editText) {
            Intrinsics.checkParameterIsNotNull(editText, "editText");
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher.C40807a.m161576a(this, editText);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public boolean mo147173a(int i, KeyEvent keyEvent) {
            return IKeyBoardPlugin.IKeyBoardContext.ITextWatcher.C40807a.m161577a(this, i, keyEvent);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public void mo147170a(Editable editable, int i, int i2) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher.C40807a.m161575a(this, editable, i, i2);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IKeyBoardContext.ITextWatcher
        /* renamed from: a */
        public void mo147172a(CharSequence charSequence, int i, int i2, int i3) {
            EditText l;
            if (this.f103753a.f103742a && AtKBPlugin.m161581a(this.f103753a).mo147364A() && (l = AtKBPlugin.m161581a(this.f103753a).mo147381z().mo146904l()) != null && l.isAttachedToWindow() && i3 == 1 && charSequence != null && charSequence.charAt(i) == '@' && this.f103753a.f103746e.mo127064a(this.f103753a.f103744c, false, false) == 0) {
                this.f103753a.mo147385b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a$d */
    public static final class View$OnClickListenerC40810d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtKBPlugin f103754a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f103755b;

        View$OnClickListenerC40810d(AtKBPlugin aVar, IKeyBoardPlugin.ITouchActionNotifier dVar) {
            this.f103754a = aVar;
            this.f103755b = dVar;
        }

        public final void onClick(View view) {
            KBHoverUtil.f103302a.mo146863a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin.View$OnClickListenerC40810d.C408111 */
                final /* synthetic */ View$OnClickListenerC40810d this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    int a = this.this$0.f103754a.f103746e.mo127064a(this.this$0.f103754a.f103744c, true, false);
                    if (a == 0) {
                        this.this$0.f103754a.mo147385b();
                    } else if (a == 1) {
                        this.this$0.f103754a.mo147382a();
                    }
                    this.this$0.f103755b.mo147314b(this.this$0.f103754a);
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext m161581a(AtKBPlugin aVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar = aVar.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103743b = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        bVar.mo147370a(new C40809c(this));
    }

    /* renamed from: a */
    public final void mo147383a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f103744c = str;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f103747g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view.setEnabled(z);
        this.f103749i = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a$e */
    static final class View$OnHoverListenerC40812e implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ AtKBPlugin f103756a;

        View$OnHoverListenerC40812e(AtKBPlugin aVar) {
            this.f103756a = aVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            sb.append(UIUtils.getString(view.getContext(), R.string.Lark_Legacy_TitleSelectMember));
            sb.append('\n');
            sb.append(UIUtils.getString(view.getContext(), R.string.Lark_Legacy_TryType));
            String sb2 = sb.toString();
            KBHoverUtil bVar = KBHoverUtil.f103302a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (!this.f103756a.f103745d) {
                sb2 = null;
            }
            return bVar.mo146864a(view, motionEvent, sb2);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View c = m161582c();
        this.f103747g = c;
        if (c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) c.findViewById(R.id.toolbox_btn_at);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "iconIV");
        appCompatImageView.setActivated(this.f103750j);
        View view = this.f103747g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view.setOnClickListener(new View$OnClickListenerC40810d(this, dVar));
        View view2 = this.f103747g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view2.setOnHoverListener(new View$OnHoverListenerC40812e(this));
        View view3 = this.f103747g;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        return view3;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i != 1638) {
            return false;
        }
        List<IAtDependency.ChatterInfo> a = this.f103746e.mo127065a(intent);
        if (CollectionUtils.isEmpty(a)) {
            return false;
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        EditText l = bVar.mo147381z().mo146904l();
        if (!(l instanceof RichTextEmojiconEditText)) {
            l = null;
        }
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) l;
        if (richTextEmojiconEditText == null) {
            return false;
        }
        for (T t : a) {
            richTextEmojiconEditText.mo146917a(t.mo147390a(), t.mo147391b(), t.mo147392c(), t.mo147393d());
        }
        richTextEmojiconEditText.post(new RunnableC40808b(this, richTextEmojiconEditText));
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "requestCode", "", "<anonymous parameter 1>", "intent", "Landroid/content/Intent;", "onActivityResult"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.a$f */
    public static final class C40813f implements PreferenceManager.OnActivityResultListener {

        /* renamed from: a */
        final /* synthetic */ AtKBPlugin f103757a;

        C40813f(AtKBPlugin aVar) {
            this.f103757a = aVar;
        }

        public final boolean onActivityResult(int i, int i2, Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            this.f103757a.mo147292a(i, intent);
            return false;
        }
    }

    public AtKBPlugin(String str, boolean z, boolean z2, IAtDependency bVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(bVar, "atDependency");
        this.f103744c = str;
        this.f103750j = z;
        this.f103745d = z2;
        this.f103746e = bVar;
    }

    /* renamed from: a */
    public final boolean mo147384a(String str, String str2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "chatterName");
        if (!this.f103742a || !this.f103748h || !this.f103749i) {
            return false;
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103743b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        EditText l = bVar.mo147381z().mo146904l();
        if (!(l instanceof RichTextEmojiconEditText)) {
            return true;
        }
        ((RichTextEmojiconEditText) l).mo146917a(str, str2, z, z2);
        l.setSelection(l.getText().length());
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103743b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        bVar2.mo147375j();
        l.requestFocus();
        return true;
    }
}
