package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event/SharePermissionEvent;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.event.bw */
public final class SharePermissionEvent {

    /* renamed from: a */
    public static final Companion f160905a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event/SharePermissionEvent$Companion;", "", "()V", "sendOnlyPresenterCanAnnotateChangeEvent", "", "hasPermission", "", "isPresenter", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "sendReplaceSharePermissionChangeEvent", "sendSharePermissionChangeEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.event.bw$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo220399a(boolean z, VideoChat videoChat) {
            int i;
            Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "share_permission");
                jSONObject.put("from_source", "host_panel");
                JSONObject jSONObject2 = new JSONObject();
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("action_enabled", i);
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public final void mo220401b(boolean z, VideoChat videoChat) {
            int i;
            Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "host_reshare_permission");
                jSONObject.put("from_source", "host_panel");
                JSONObject jSONObject2 = new JSONObject();
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("action_enabled", i);
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public final void mo220400a(boolean z, boolean z2, VideoChat videoChat) {
            int i;
            Intrinsics.checkParameterIsNotNull(videoChat, "videoChat");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "annotation_permission");
                jSONObject.put("from_source", "host_panel");
                int i2 = 1;
                if (z2) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_sharer", i);
                JSONObject jSONObject2 = new JSONObject();
                if (!z) {
                    i2 = 0;
                }
                jSONObject2.put("action_enabled", i2);
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
