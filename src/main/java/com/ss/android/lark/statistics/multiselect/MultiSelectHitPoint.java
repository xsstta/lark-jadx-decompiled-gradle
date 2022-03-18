package com.ss.android.lark.statistics.multiselect;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/multiselect/MultiSelectHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.p.a */
public final class MultiSelectHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135851a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/statistics/multiselect/MultiSelectHitPoint$Companion;", "Lcom/ss/android/lark/statistics/multiselect/IMultiSelectHitPoint;", "()V", "PARAM_FOLLOWING_MESSAGE", "", "TAG", "VALUE_FALSE", "VALUE_TRUE", "buildFollowingMessageParams", "Lorg/json/JSONObject;", "isFollowingMsg", "", "sendClickMultiSelectDelete", "", "sendClickMultiSelectExit", "sendClickMultiSelectFavorite", "sendClickMultiSelectFollowingMessage", "sendClickMultiSelectForward", "sendClickMultiSelectTodo", "num", "", "sendClickOneByOneForward", "sendConfirmMultiSelectForward", "sendConfirmOneByOneForward", "sendEnterMultiSelectMode", "sendMultiSelectDeleteConfirm", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.p.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public void mo187655a() {
            Statistics.sendEvent("multiselect_enter");
        }

        /* renamed from: b */
        public void mo187658b() {
            Statistics.sendEvent("multiselect_forward_confirm");
        }

        /* renamed from: c */
        public void mo187660c() {
            Statistics.sendEvent("multiselect_forward_onebyone_confirm");
        }

        /* renamed from: d */
        public void mo187662d() {
            Statistics.sendEvent("multiselect_delete_confirm");
        }

        /* renamed from: e */
        public void mo187664e() {
            Statistics.sendEvent("multiselect_exit");
        }

        /* renamed from: f */
        public void mo187665f() {
            Statistics.sendEvent("multiselect_followingmessage_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public void mo187657a(boolean z) {
            Statistics.sendEvent("multiselect_forward_click", m213437e(z));
        }

        /* renamed from: b */
        public void mo187659b(boolean z) {
            Statistics.sendEvent("multiselect_quickforward_click", m213437e(z));
        }

        /* renamed from: c */
        public void mo187661c(boolean z) {
            Statistics.sendEvent("multiselect_favorite_click", m213437e(z));
        }

        /* renamed from: d */
        public void mo187663d(boolean z) {
            Statistics.sendEvent("multiselect_delete_click", m213437e(z));
        }

        /* renamed from: e */
        private final JSONObject m213437e(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            JSONObject put = jSONObject.put("followingmessage", str);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(PARAM_F…UE_TRUE else VALUE_FALSE)");
            return put;
        }

        /* renamed from: a */
        public void mo187656a(int i, boolean z) {
            try {
                Statistics.sendEvent("todo_im_conversions_task", m213437e(z).put("message_num", i));
            } catch (JSONException e) {
                Log.m165398w("MultiSelectHitPoint", "sendClickMultiSelectTodo", e);
            }
        }
    }
}
