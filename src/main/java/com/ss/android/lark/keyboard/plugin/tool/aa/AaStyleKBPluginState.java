package com.ss.android.lark.keyboard.plugin.tool.aa;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007H\u0002J\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPluginState;", "", "target", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;", "(Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPlugin;)V", "kvMap", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPluginSnapshot;", "popOrDefault", "key", "stash", "", "stash$im_keyboard_release", "toNextState", "nextStateTag", "toNextState$im_keyboard_release", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.c */
public final class AaStyleKBPluginState {

    /* renamed from: a */
    public static final Companion f103738a = new Companion(null);

    /* renamed from: b */
    private final Map<String, AaStyleKBPluginSnapshot> f103739b = new LinkedHashMap();

    /* renamed from: c */
    private final AaStyleKBPlugin f103740c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/AaStyleKBPluginState$Companion;", "", "()V", "KEY_NO_EDITOR", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AaStyleKBPluginState(AaStyleKBPlugin aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "target");
        this.f103740c = aVar;
    }

    /* renamed from: b */
    private final AaStyleKBPluginSnapshot m161533b(String str) {
        AaStyleKBPluginSnapshot remove = this.f103739b.remove(str);
        if (remove != null) {
            return remove;
        }
        return new AaStyleKBPluginSnapshot(str, 0, null, false, false, false, 62, null);
    }

    /* renamed from: a */
    public final void mo147363a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nextStateTag");
        AaStyleKBPluginSnapshot o = this.f103740c.mo147311o();
        this.f103739b.put(o.mo147337a(), o);
        this.f103740c.mo147289a(m161533b(str));
    }
}
