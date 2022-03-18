package com.ss.android.lark.reaction.widget.panel;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/reaction/widget/panel/ReactionHitPoint;", "", "()V", "Companion", "Params", "Value", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.reaction.widget.panel.b */
public final class ReactionHitPoint {

    /* renamed from: a */
    public static final Companion f131244a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/reaction/widget/panel/ReactionHitPoint$Companion;", "", "()V", "sendReactionSelectClick", "", "reactionKey", "", "click", "target", "sendReactionSelectView", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.panel.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo181326a() {
            Statistics.sendEvent("public_reaction_panel_select_view");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo181327a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            Statistics.sendEvent("public_reaction_panel_select_click", new JSONObject().put("click", str2).put("emoji_type", str).put("target", str3));
        }
    }
}
