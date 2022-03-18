package com.ss.android.lark.statistics.video_site;

import com.ss.android.lark.chat.entity.message.PreviewVideo;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/statistics/video_site/VideoSiteHitPoint;", "", "()V", "Companion", "Params", "Values", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.y.a */
public final class VideoSiteHitPoint {

    /* renamed from: a */
    public static final Companion f135914a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/statistics/video_site/VideoSiteHitPoint$Companion;", "", "()V", "getSite", "", "site", "Lcom/ss/android/lark/chat/entity/message/PreviewVideo$Site;", "sendVideoUrlClick", "", "sendVideoUrlPlay", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.y.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        private final String m213603c(PreviewVideo.Site site) {
            int i = C54987b.f135915a[site.ordinal()];
            if (i == 1) {
                return "xigua";
            }
            if (i == 2) {
                return "douyin";
            }
            if (i != 3) {
                return "";
            }
            return "youtube";
        }

        /* renamed from: a */
        public final void mo187769a(PreviewVideo.Site site) {
            Intrinsics.checkParameterIsNotNull(site, "site");
            Statistics.sendEvent("video_url_play", new JSONObject().put("video_source", m213603c(site)));
        }

        /* renamed from: b */
        public final void mo187770b(PreviewVideo.Site site) {
            Intrinsics.checkParameterIsNotNull(site, "site");
            Statistics.sendEvent("video_url_click", new JSONObject().put("video_source", m213603c(site)));
        }
    }
}
