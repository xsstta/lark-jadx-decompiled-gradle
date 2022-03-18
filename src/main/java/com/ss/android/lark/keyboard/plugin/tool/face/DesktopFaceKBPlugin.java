package com.ss.android.lark.keyboard.plugin.tool.face;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.utils.KBHoverUtil;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 -2\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0003H\u0016J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\fJ\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "isShowCollectedEmoji", "", "isDarkStyle", "faceDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "showHoverTips", "(ZZLcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;Z)V", "mContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mDimAmount", "", "mFragment", "Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment;", "mIcon", "Landroid/view/View;", "mView", "createIcon", "onCreate", "", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onVisibleChanged", "isVisible", "setDimAmount", "dimAmount", "setKeyBoardContext", "context", "showFaceFragment", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.b */
public final class DesktopFaceKBPlugin implements IKeyBoardPlugin {

    /* renamed from: b */
    public static final Companion f104073b = new Companion(null);

    /* renamed from: a */
    public final boolean f104074a;

    /* renamed from: c */
    private View f104075c;

    /* renamed from: d */
    private View f104076d;

    /* renamed from: e */
    private DesktopFaceFragment f104077e;

    /* renamed from: f */
    private float f104078f;

    /* renamed from: g */
    private IKeyBoardPlugin.IKeyBoardContext f104079g;

    /* renamed from: h */
    private final boolean f104080h;

    /* renamed from: i */
    private final boolean f104081i;

    /* renamed from: j */
    private final IFaceDependency f104082j;

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceKBPlugin$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.b$a */
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

    /* renamed from: b */
    private final View m162130b() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104079g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_emoji, R.drawable.kb_ic_svg_chat_menu_emoji_normal);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…g_chat_menu_emoji_normal)");
        return a;
    }

    /* renamed from: a */
    public final void mo147595a() {
        this.f104077e = new DesktopFaceFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_show_collected_emoji", this.f104080h);
        DesktopFaceFragment aVar = this.f104077e;
        if (aVar != null) {
            aVar.setArguments(bundle);
        }
        DesktopFaceFragment aVar2 = this.f104077e;
        if (aVar2 != null) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104079g;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            aVar2.mo147507a(bVar);
        }
        DesktopFaceFragment aVar3 = this.f104077e;
        if (aVar3 != null) {
            aVar3.mo147508a(this.f104082j);
        }
        DesktopFaceFragment aVar4 = this.f104077e;
        if (aVar4 != null) {
            View view = this.f104076d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            }
            aVar4.mo147506a(view);
        }
        View view2 = this.f104076d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        int[] a = DesktopUtil.m144302a(view2);
        View view3 = this.f104076d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        int i = R.drawable.dialog_round_bottom_triangle_bg;
        int i2 = 0;
        int width = ((a[0] + (UIUtils.getWidth(view3) / 2)) - (UIHelper.dp2px((float) 436) / 2)) - UIHelper.dp2px(2.0f);
        if (width < 0) {
            i = 0;
        } else {
            i2 = width;
        }
        View view4 = this.f104076d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        int screenHeight = (DeviceUtils.getScreenHeight(view4.getContext()) - a[1]) + UIHelper.dp2px(6.0f);
        FloatWindowParams.C36567a aVar5 = new FloatWindowParams.C36567a();
        aVar5.mo134948b(436);
        aVar5.mo134949c(342);
        aVar5.mo134943a(8388691);
        aVar5.mo134944a(i2, screenHeight);
        aVar5.mo134942a(this.f104078f);
        aVar5.mo134950d(i);
        C36512a.m144041a().mo134762a(this.f104077e, aVar5.mo134930b());
    }

    /* renamed from: a */
    public final void mo147596a(float f) {
        this.f104078f = f;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.b$b */
    public static final class View$OnClickListenerC40943b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceKBPlugin f104083a;

        View$OnClickListenerC40943b(DesktopFaceKBPlugin bVar) {
            this.f104083a = bVar;
        }

        public final void onClick(View view) {
            KBHoverUtil.f103302a.mo146863a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin.View$OnClickListenerC40943b.C409441 */
                final /* synthetic */ View$OnClickListenerC40943b this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.f104083a.mo147595a();
                }
            });
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f104079g = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f104076d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setEnabled(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.b$c */
    static final class View$OnHoverListenerC40945c implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceKBPlugin f104084a;

        View$OnHoverListenerC40945c(DesktopFaceKBPlugin bVar) {
            this.f104084a = bVar;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            String string = UIUtils.getString(view.getContext(), R.string.Lark_Legacy_StickerChatHolder);
            KBHoverUtil bVar = KBHoverUtil.f103302a;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (!this.f104084a.f104074a) {
                string = null;
            }
            return bVar.mo146864a(view, motionEvent, string);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IKeyBoardPlugin.C40806a.m161552a(this, i, intent);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View b = m162130b();
        this.f104075c = b;
        if (b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        View findViewById = b.findViewById(R.id.toolbox_btn_emoji);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mView.findViewById<AppCo…>(R.id.toolbox_btn_emoji)");
        this.f104076d = findViewById;
        if (findViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        findViewById.setActivated(this.f104081i);
        View view = this.f104075c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view.setOnClickListener(new View$OnClickListenerC40943b(this));
        View view2 = this.f104075c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        view2.setOnHoverListener(new View$OnHoverListenerC40945c(this));
        View view3 = this.f104076d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return view3;
    }

    public DesktopFaceKBPlugin(boolean z, boolean z2, IFaceDependency gVar, boolean z3) {
        Intrinsics.checkParameterIsNotNull(gVar, "faceDependency");
        this.f104080h = z;
        this.f104081i = z2;
        this.f104082j = gVar;
        this.f104074a = z3;
    }
}
