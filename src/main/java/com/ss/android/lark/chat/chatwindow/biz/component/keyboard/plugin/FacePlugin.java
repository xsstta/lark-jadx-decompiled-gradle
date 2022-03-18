package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33224n;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.IKeyboardViewModel;
import com.ss.android.lark.chatbase.keyboard.FaceKBPluginDependency;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/FacePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "showCollectedEmoji", "", "darkStyle", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(ZZLcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "item", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getName", "", "getPlugin", "isEnable", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.b */
public final class FacePlugin implements IKeyboardCreator.IPlugin<IKeyBoardPlugin> {

    /* renamed from: a */
    private IKeyBoardPlugin f85006a;

    /* renamed from: b */
    private final boolean f85007b;

    /* renamed from: c */
    private final boolean f85008c;

    /* renamed from: d */
    private final IKeyboardCreator.PluginContext f85009d;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "face";
    }

    /* renamed from: e */
    public final IKeyboardCreator.PluginContext mo122019e() {
        return this.f85009d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/FacePlugin$getPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;", "getBaseFragment", "Landroidx/fragment/app/Fragment;", "onSendStickerMsg", "", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.b$a */
    public static final class C33026a implements FacePluginDependency {

        /* renamed from: a */
        final /* synthetic */ FacePlugin f85010a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public Fragment mo122020a() {
            return this.f85010a.mo122019e().mo122076a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33026a(FacePlugin bVar) {
            this.f85010a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public void mo122021a(C40964l lVar) {
            KeyBoard b = this.f85010a.mo122019e().mo122077b();
            if (b != null) {
                String q = b.mo146836q();
                String r = b.mo146837r();
                IStickerDependency.StickerFileInfo a = C33224n.m128431a(lVar);
                IKeyboardViewModel e = this.f85010a.mo122019e().mo122080e();
                if (e != null) {
                    Intrinsics.checkExpressionValueIsNotNull(a, "send");
                    e.sendStickerMsg(a, q, r);
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        Context context = this.f85009d.mo122076a().getContext();
        if (context != null) {
            return true ^ DesktopUtil.m144301a(context);
        }
        return true;
    }

    /* renamed from: b */
    public IKeyBoardPlugin mo122014c() {
        if (this.f85006a == null) {
            boolean z = this.f85007b;
            boolean z2 = this.f85008c;
            FragmentManager childFragmentManager = this.f85009d.mo122076a().getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "pluginContext.host.childFragmentManager");
            this.f85006a = new FaceKBPlugin(z, z2, childFragmentManager, new FaceKBPluginDependency(new C33026a(this)));
        }
        return this.f85006a;
    }

    public FacePlugin(boolean z, boolean z2, IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f85007b = z;
        this.f85008c = z2;
        this.f85009d = cVar;
    }
}
