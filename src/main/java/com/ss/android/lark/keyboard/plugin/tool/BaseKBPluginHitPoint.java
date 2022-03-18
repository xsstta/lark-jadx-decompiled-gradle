package com.ss.android.lark.keyboard.plugin.tool;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/BaseKBPluginHitPoint;", "", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "paramValue", "getParamValue", "send", "", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a */
public abstract class BaseKBPluginHitPoint {

    /* renamed from: b */
    public static final Companion f103653b = new Companion(null);

    /* renamed from: a */
    public abstract String mo147204a();

    /* renamed from: b */
    public abstract String mo147205b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/BaseKBPluginHitPoint$Companion;", "", "()V", "PARAM_NAME", "", "TAG", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo147285c() {
        try {
            Statistics.sendEvent(mo147204a(), new JSONObject().put("click_button", mo147205b()));
        } catch (Exception e) {
            Log.m165383e("KBPluginHitPoint", "send hit point failed " + e.getMessage());
        }
    }
}
