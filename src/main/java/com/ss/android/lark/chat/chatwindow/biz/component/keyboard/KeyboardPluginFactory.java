package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.plugin.MorePlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnLifeKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.uploadlog.UploadLogKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u0000 &2\u00020\u0001:\u0001&B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\u001e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\rH\u0016J0\u0010#\u001a\u00020\u001a2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u00052\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u0005H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR6\u0010\n\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bj\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r`\u000fX\u0004¢\u0006\u0002\n\u0000R6\u0010\u0010\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u000bj\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r`\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R6\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u000bj\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r`\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardPluginFactory;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IKeyboardPluginFactory;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "(Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;Ljava/util/List;)V", "getCallbacks", "()Ljava/util/List;", "inputPlugins", "Ljava/util/LinkedHashMap;", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "Lkotlin/collections/LinkedHashMap;", "keyboardPlugins", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "morePlugin", "getMorePlugin", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "plusPlugins", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "attach", "", "collectInnerPlugins", "registerInputSupport", "name", "inputSupport", "registerKBPlugin", "plugin", "registerKeyboardPlusPlugin", "plusItem", "updateKeyboardPlusPlugin", "removed", "added", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.j */
public abstract class KeyboardPluginFactory implements IKeyboardCreator.IKeyboardPluginFactory {

    /* renamed from: a */
    public static final Companion f85068a = new Companion(null);

    /* renamed from: g */
    private static final Map<Class<? extends IKeyBoardPlugin>, Integer> f85069g;

    /* renamed from: b */
    private final LinkedHashMap<String, IKeyboardCreator.IPlugin<IKeyBoardPlugin>> f85070b = new LinkedHashMap<>(10);

    /* renamed from: c */
    private final LinkedHashMap<String, IKeyboardCreator.IPlugin<IInputSupportPlugin>> f85071c = new LinkedHashMap<>(2);

    /* renamed from: d */
    private final LinkedHashMap<String, IKeyboardCreator.IPlugin<IPlusItem>> f85072d = new LinkedHashMap<>(5);

    /* renamed from: e */
    private final IKeyboardCreator.PluginContext f85073e;

    /* renamed from: f */
    private final List<IKeyboardComponent.IKeyboardComponentCallbacks> f85074f;

    /* renamed from: a */
    public abstract void mo122100a(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list);

    /* renamed from: b */
    public abstract IKeyboardCreator.IPlugin<IKeyBoardPlugin> mo122101b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardPluginFactory$Companion;", "", "()V", "sPluginOrderMap", "", "Ljava/lang/Class;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.component.keyboard.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f85069g = hashMap;
        hashMap.put(DesktopFaceKBPlugin.class, 0);
        hashMap.put(FaceKBPlugin.class, 1);
        hashMap.put(AtKBPlugin.class, 2);
        hashMap.put(VoiceKBPlugin.class, 3);
        hashMap.put(PhotoKBPlugin.class, 4);
        hashMap.put(ScreenShotDesktopPlugin.class, 5);
        hashMap.put(BurnLifeKBPlugin.class, 6);
        hashMap.put(AaStyleKBPlugin.class, 7);
        hashMap.put(PlusKBDesktopPlugin.class, 8);
        hashMap.put(PlusKBPlugin.class, 9);
        hashMap.put(UploadLogKBPlugin.class, 10);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IKeyboardPluginFactory
    /* renamed from: a */
    public void mo122072a() {
        IPlusItem bVar;
        IInputSupportPlugin c;
        IKeyBoardPlugin c2;
        KeyBoard b = this.f85073e.mo122077b();
        if (b != null) {
            mo122100a(this.f85073e, this.f85074f);
            Iterator<T> it = this.f85074f.iterator();
            while (it.hasNext()) {
                it.next().mo122066a(b);
            }
            for (Map.Entry<String, IKeyboardCreator.IPlugin<IKeyBoardPlugin>> entry : this.f85070b.entrySet()) {
                if (entry.getValue().mo122015d() && (c2 = entry.getValue().mo122014c()) != null) {
                    b.mo146806a(entry.getKey(), c2);
                }
            }
            b.mo146808a(KeyboardComponent.f86348k.mo123209a());
            for (Map.Entry<String, IKeyboardCreator.IPlugin<IInputSupportPlugin>> entry2 : this.f85071c.entrySet()) {
                if (entry2.getValue().mo122015d() && (c = entry2.getValue().mo122014c()) != null) {
                    b.mo146804a(entry2.getKey(), c);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (IKeyboardCreator.IPlugin bVar2 : new ArrayList(this.f85072d.values())) {
                if (bVar2.mo122015d()) {
                    bVar = (IPlusItem) bVar2.mo122014c();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            ArrayList arrayList2 = arrayList;
            MorePlugin eVar = (MorePlugin) mo122101b();
            if (eVar != null) {
                eVar.mo122029a(arrayList2);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IKeyboardPluginFactory
    /* renamed from: a */
    public void mo122073a(String str, IKeyboardCreator.IPlugin<IKeyBoardPlugin> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        this.f85070b.put(str, bVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IKeyboardPluginFactory
    /* renamed from: b */
    public void mo122075b(String str, IKeyboardCreator.IPlugin<IPlusItem> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plusItem");
        this.f85072d.put(str, bVar);
    }

    /* renamed from: c */
    public void mo122102c(String str, IKeyboardCreator.IPlugin<IInputSupportPlugin> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "inputSupport");
        this.f85071c.put(str, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.chatwindow.biz.component.keyboard.c$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardPluginFactory(IKeyboardCreator.PluginContext cVar, List<? extends IKeyboardComponent.IKeyboardComponentCallbacks> list) {
        Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
        Intrinsics.checkParameterIsNotNull(list, "callbacks");
        this.f85073e = cVar;
        this.f85074f = list;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IKeyboardPluginFactory
    /* renamed from: a */
    public void mo122074a(List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list, List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list2) {
        Intrinsics.checkParameterIsNotNull(list, "removed");
        Intrinsics.checkParameterIsNotNull(list2, "added");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IPlusItem bVar = (IPlusItem) it.next().mo122014c();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            IPlusItem bVar2 = (IPlusItem) it2.next().mo122014c();
            if (bVar2 != null) {
                arrayList3.add(bVar2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        MorePlugin eVar = (MorePlugin) mo122101b();
        if (eVar != null) {
            eVar.mo122030a(arrayList2, arrayList4);
        }
    }
}
