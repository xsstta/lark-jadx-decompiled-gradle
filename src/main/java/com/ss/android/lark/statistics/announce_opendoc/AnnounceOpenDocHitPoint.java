package com.ss.android.lark.statistics.announce_opendoc;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/announce_opendoc/AnnounceOpenDocHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.a.a */
public final class AnnounceOpenDocHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135643a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/statistics/announce_opendoc/AnnounceOpenDocHitPoint$Companion;", "", "()V", "sendGotoAnnouncementEvent", "", "from", "", "chatId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.a.a$a$a */
        public static final class RunnableC54940a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f135644a;

            /* renamed from: b */
            final /* synthetic */ String f135645b;

            RunnableC54940a(String str, String str2) {
                this.f135644a = str;
                this.f135645b = str2;
            }

            public final void run() {
                Chat chat;
                String str = this.f135644a;
                if (str != null && (chat = C32821b.m126120a().mo121033b(Collections.singletonList(this.f135644a)).get(str)) != null) {
                    JSONObject put = new JSONObject().put("announcement_view_loacation", this.f135645b);
                    Chat.Type type = chat.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type, ShareHitPoint.f121869d);
                    JSONObject put2 = put.put("chat_type", type.getNumber());
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36450aa N = b.mo134515N();
                    Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                    Statistics.sendEvent("announcement_view", put2.put("user_unique_id", N.mo134394a()));
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187338a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "from");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC54940a(str2, str));
        }
    }
}
