package com.ss.android.lark.keyboard.plugin.tool.hashtag;

import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.utils.KBHoverUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/hashtag/HashTagKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "dependency", "Lcom/ss/android/lark/keyboard/plugin/tool/hashtag/IHashTagDependency;", "(Lcom/ss/android/lark/keyboard/plugin/tool/hashtag/IHashTagDependency;)V", "mIsUsable", "", "mIsVisible", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "createIcon", "Landroid/view/View;", "onActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onUsableChanged", "isUsable", "onVisibleChanged", "isVisible", "setKeyBoardContext", "context", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.c.a */
public final class HashTagKBPlugin implements IKeyBoardPlugin {

    /* renamed from: a */
    public IKeyBoardPlugin.IKeyBoardContext f103790a;

    /* renamed from: b */
    public final IHashTagDependency f103791b;

    /* renamed from: c */
    private boolean f103792c = true;

    /* renamed from: d */
    private boolean f103793d = true;

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
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

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    /* renamed from: a */
    private final View m161653a() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103790a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.btHashTag, R.drawable.ud_icon_hashtag_outlined);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…ud_icon_hashtag_outlined)");
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
        this.f103792c = z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        this.f103793d = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/keyboard/plugin/tool/hashtag/HashTagKBPlugin$onCreateIcon$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.c.a$a */
    public static final class View$OnClickListenerC40818a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HashTagKBPlugin f103794a;

        View$OnClickListenerC40818a(HashTagKBPlugin aVar) {
            this.f103794a = aVar;
        }

        public final void onClick(View view) {
            KBHoverUtil.f103302a.mo146863a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.hashtag.HashTagKBPlugin.View$OnClickListenerC40818a.C408191 */
                final /* synthetic */ View$OnClickListenerC40818a this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) HashTagKBPlugin.m161654a(this.this$0.f103794a).mo147381z().mo146904l();
                    if (richTextEmojiconEditText != null) {
                        int selectionStart = richTextEmojiconEditText.getSelectionStart();
                        Editable editableText = richTextEmojiconEditText.getEditableText();
                        IHashTagDependency bVar = this.this$0.f103794a.f103791b;
                        Intrinsics.checkExpressionValueIsNotNull(editableText, "editable");
                        bVar.mo147415a(editableText, selectionStart);
                    }
                }
            });
        }
    }

    public HashTagKBPlugin(IHashTagDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f103791b = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext m161654a(HashTagKBPlugin aVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar = aVar.f103790a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103790a = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View a = m161653a();
        a.setOnClickListener(new View$OnClickListenerC40818a(this));
        return a;
    }
}
