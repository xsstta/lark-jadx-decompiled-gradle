package com.ss.android.lark.keyboard.plugin.tool.more;

import com.google.android.gms.stats.CodePackage;
import com.ss.android.lark.keyboard.plugin.tool.BaseKBPluginHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPluginHitPoint;", "Lcom/ss/android/lark/keyboard/plugin/tool/BaseKBPluginHitPoint;", "paramValue", "", "(Ljava/lang/String;)V", "eventName", "getEventName", "()Ljava/lang/String;", "getParamValue", "Companion", "Scene", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PlusKBPluginHitPoint extends BaseKBPluginHitPoint {

    /* renamed from: a */
    public static final Companion f104162a = new Companion(null);

    /* renamed from: c */
    private final String f104163c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPluginHitPoint$Scene;", "", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Scene {
        public static final Companion Companion = Companion.f104164a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPluginHitPoint$Scene$Companion;", "", "()V", "CLOUD_FILE", "", "LOCAL_FILE", CodePackage.LOCATION, "PIC_VIDEO", "USER_CARD", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPluginHitPoint$Scene$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f104164a = new Companion();

            private Companion() {
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.BaseKBPluginHitPoint
    /* renamed from: a */
    public String mo147204a() {
        return "im_chat_input_toolbar_plus";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPluginHitPoint$Companion;", "", "()V", "PLUS_KB_EVENT_NAME", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPluginHitPoint$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.BaseKBPluginHitPoint
    /* renamed from: b */
    public String mo147205b() {
        return this.f104163c;
    }

    public PlusKBPluginHitPoint(@Scene String str) {
        Intrinsics.checkParameterIsNotNull(str, "paramValue");
        this.f104163c = str;
    }
}
