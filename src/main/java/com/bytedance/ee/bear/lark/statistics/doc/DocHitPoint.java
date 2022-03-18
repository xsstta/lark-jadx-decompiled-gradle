package com.bytedance.ee.bear.lark.statistics.doc;

import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.doc.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lark/statistics/doc/DocHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lark.g.a.a */
public final class DocHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f21534a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m32116a() {
        f21534a.mo31080a();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m32117b() {
        f21534a.mo31083b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/lark/statistics/doc/DocHitPoint$Companion;", "", "()V", "docsSend", "", "sendDocsChangeShare", "edit", "", "sendDocsView", "isGroup", "area", "", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lark.g.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo31083b() {
            Statistics.sendEvent("docs_send");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo31080a() {
            try {
                Statistics.sendEvent("docs_click_explorer_enter_docs");
            } catch (Throwable th) {
                C13479a.m54757a(th.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo31081a(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "view";
            } else {
                str = "edit";
            }
            Statistics.sendEvent("docs_change_share", jSONObject.put("change_to", str));
        }

        /* renamed from: a */
        public final void mo31082a(boolean z, int i) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (i == 1) {
                str = "discription";
            } else {
                str = "title";
            }
            Statistics.sendEvent("docs_view", jSONObject.put("click_area", str).put("chat_type", ChatTypeStateKeeper.f94673b.mo135789a()));
        }
    }
}
