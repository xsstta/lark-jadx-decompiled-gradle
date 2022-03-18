package com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin;

import android.content.Context;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.statistics.chat.ChatStatisticUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J$\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/MorePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/IMorePlugin;", "darkStyle", "", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(ZLcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "item", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "addPlusItem", "", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "addPlusItems", "list", "", "getName", "", "getPlugin", "isEnable", "updatePlusItems", "removed", "added", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.e */
public final class MorePlugin implements IKeyboardCreator.IPlugin<IKeyBoardPlugin> {

    /* renamed from: a */
    private IKeyBoardPlugin f85019a;

    /* renamed from: b */
    private final boolean f85020b;

    /* renamed from: c */
    private final IKeyboardCreator.PluginContext f85021c;

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: a */
    public String mo122012a() {
        return "plus";
    }

    /* renamed from: e */
    public final IKeyboardCreator.PluginContext mo122032e() {
        return this.f85021c;
    }

    /* renamed from: b */
    public IKeyBoardPlugin mo122014c() {
        if (this.f85019a == null) {
            PlusKBPlugin eVar = new PlusKBPlugin(this.f85020b);
            eVar.mo147660a(new C33028a(this));
            this.f85019a = eVar;
        }
        return this.f85019a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
    /* renamed from: d */
    public boolean mo122015d() {
        Context context = this.f85021c.mo122076a().getContext();
        if (context != null) {
            return true ^ DesktopUtil.m144301a(context);
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/component/keyboard/plugin/MorePlugin$getPlugin$1$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "onClicked", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.a.e$a */
    public static final class C33028a implements IKeyBoardPlugin.IPluginClickListener {

        /* renamed from: a */
        final /* synthetic */ MorePlugin f85022a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
        /* renamed from: a */
        public void mo122033a() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ai().mo134637a(this.f85022a.mo122032e().mo122078c());
            ChatStatisticUtil.m213142c(this.f85022a.mo122032e().mo122078c());
        }

        C33028a(MorePlugin eVar) {
            this.f85022a = eVar;
        }
    }

    /* renamed from: a */
    public void mo122029a(List<? extends IPlusItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        IKeyBoardPlugin b = mo122014c();
        if (b != null) {
            ((PlusKBPlugin) b).mo147643a(CollectionsKt.filterNotNull(list));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin");
    }

    public MorePlugin(boolean z, IKeyboardCreator.PluginContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        this.f85020b = z;
        this.f85021c = cVar;
    }

    /* renamed from: a */
    public void mo122030a(List<? extends IPlusItem> list, List<? extends IPlusItem> list2) {
        Intrinsics.checkParameterIsNotNull(list, "removed");
        Intrinsics.checkParameterIsNotNull(list2, "added");
        IKeyBoardPlugin b = mo122014c();
        if (b != null) {
            ((PlusKBPlugin) b).mo147644a(list, list2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin");
    }
}
