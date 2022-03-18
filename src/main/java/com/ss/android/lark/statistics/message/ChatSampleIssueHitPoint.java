package com.ss.android.lark.statistics.message;

import android.util.ArrayMap;
import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.log.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint;", "", "()V", "TAG", "", "sendEvent", "", "eventKey", "metric", "Lorg/json/JSONObject;", "extra", "ReactionParam", "ReadParam", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.n.a */
public final class ChatSampleIssueHitPoint {

    /* renamed from: a */
    public static final ChatSampleIssueHitPoint f135747a = new ChatSampleIssueHitPoint();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011BS\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReactionParam;", "", "reactionCountMap", "Landroid/util/ArrayMap;", "", "", "reactionUserIdMap", "", "quantileCount", "syncMsgDep", "", "syncMsgPipeFinished", "messageId", "(Landroid/util/ArrayMap;Landroid/util/ArrayMap;IZZLjava/lang/String;)V", "sendEvent", "", "Builder", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.a$a */
    public static final class ReactionParam {

        /* renamed from: a */
        public static final Companion f135748a = new Companion(null);

        /* renamed from: b */
        private final ArrayMap<String, Integer> f135749b;

        /* renamed from: c */
        private final ArrayMap<String, List<String>> f135750c;

        /* renamed from: d */
        private final int f135751d;

        /* renamed from: e */
        private final boolean f135752e;

        /* renamed from: f */
        private final boolean f135753f;

        /* renamed from: g */
        private final String f135754g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReactionParam$Companion;", "", "()V", "KEY_EVENT", "", "KEY_EXTRA", "KEY_MESSAGE_ID", "KEY_QUANTILE_COUNT", "KEY_REACTIONS", "KEY_SYNC_MSG_DEP", "KEY_SYNC_MSG_PIPE_FINISHED", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.a$a$b */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\bJ \u0010\t\u001a\u00020\u00002\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\bX\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReactionParam$Builder;", "", "()V", "messageId", "", "quantileCount", "", "reactionCountMap", "Landroid/util/ArrayMap;", "reactionUserIdMap", "", "syncMsgDep", "", "syncMsgPipeFinished", "build", "Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReactionParam;", "quantile", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.a$a$a */
        public static final class Builder {

            /* renamed from: a */
            private ArrayMap<String, Integer> f135755a = new ArrayMap<>();

            /* renamed from: b */
            private ArrayMap<String, List<String>> f135756b = new ArrayMap<>();

            /* renamed from: c */
            private String f135757c = "";

            /* renamed from: d */
            private int f135758d = 4;

            /* renamed from: e */
            private boolean f135759e;

            /* renamed from: f */
            private boolean f135760f;

            /* renamed from: a */
            public final ReactionParam mo187506a() {
                return new ReactionParam(this.f135755a, this.f135756b, this.f135758d, this.f135759e, this.f135760f, this.f135757c);
            }

            /* renamed from: a */
            public final Builder mo187502a(int i) {
                Builder aVar = this;
                aVar.f135758d = i;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo187508b(boolean z) {
                Builder aVar = this;
                aVar.f135760f = z;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187503a(ArrayMap<String, Integer> arrayMap) {
                Intrinsics.checkParameterIsNotNull(arrayMap, "reactionCountMap");
                Builder aVar = this;
                aVar.f135755a = arrayMap;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo187507b(ArrayMap<String, List<String>> arrayMap) {
                Intrinsics.checkParameterIsNotNull(arrayMap, "reactionUserIdMap");
                Builder aVar = this;
                aVar.f135756b = arrayMap;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187504a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "messageId");
                Builder aVar = this;
                aVar.f135757c = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187505a(boolean z) {
                Builder aVar = this;
                aVar.f135759e = z;
                return aVar;
            }
        }

        /* renamed from: a */
        public final void mo187501a() {
            JSONObject jSONObject = new JSONObject();
            Set<Map.Entry<String, Integer>> entrySet = this.f135749b.entrySet();
            Intrinsics.checkExpressionValueIsNotNull(entrySet, "reactionCountMap.entries");
            for (T t : entrySet) {
                Object value = t.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                jSONObject.put((String) t.getKey(), ((Number) value).intValue());
            }
            JSONObject jSONObject2 = new JSONObject();
            Set<Map.Entry<String, List<String>>> entrySet2 = this.f135750c.entrySet();
            Intrinsics.checkExpressionValueIsNotNull(entrySet2, "reactionUserIdMap.entries");
            for (T t2 : entrySet2) {
                jSONObject2.put((String) t2.getKey(), new JSONArray((Collection) t2.getValue()));
            }
            JSONObject put = new JSONObject().put("extra", new JSONObject().put("message_id", this.f135754g).put("reactions", jSONObject2).put("quantile_count", this.f135751d).put("sync_msg_dep", this.f135752e).put("sync_pipe_finished", this.f135753f));
            Intrinsics.checkExpressionValueIsNotNull(put, "extra");
            ChatSampleIssueHitPoint.m213256a("message_reaction_sample", jSONObject, put);
        }

        public ReactionParam(ArrayMap<String, Integer> arrayMap, ArrayMap<String, List<String>> arrayMap2, int i, boolean z, boolean z2, String str) {
            Intrinsics.checkParameterIsNotNull(arrayMap, "reactionCountMap");
            Intrinsics.checkParameterIsNotNull(arrayMap2, "reactionUserIdMap");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f135749b = arrayMap;
            this.f135750c = arrayMap2;
            this.f135751d = i;
            this.f135752e = z;
            this.f135753f = z2;
            this.f135754g = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReadParam;", "", "readCount", "", "unReadCount", "syncMsgDep", "", "syncMsgPipeFinished", "messageId", "", "(IIZZLjava/lang/String;)V", "sendEvent", "", "Builder", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.a$b */
    public static final class ReadParam {

        /* renamed from: a */
        public static final Companion f135761a = new Companion(null);

        /* renamed from: b */
        private final int f135762b;

        /* renamed from: c */
        private final int f135763c;

        /* renamed from: d */
        private final boolean f135764d;

        /* renamed from: e */
        private final boolean f135765e;

        /* renamed from: f */
        private final String f135766f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReadParam$Companion;", "", "()V", "KEY_EVENT", "", "KEY_EXTRA", "KEY_MESSAGE_ID", "KEY_READ_COUNT", "KEY_SYNC_MSG_DEP", "KEY_SYNC_MSG_PIPE_FINISHED", "KEY_UNREAD_COUNT", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.a$b$b */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReadParam$Builder;", "", "()V", "messageId", "", "readCount", "", "syncMsgDep", "", "syncMsgPipeFinished", "unReadCount", "build", "Lcom/ss/android/lark/statistics/message/ChatSampleIssueHitPoint$ReadParam;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.a$b$a */
        public static final class Builder {

            /* renamed from: a */
            private int f135767a;

            /* renamed from: b */
            private int f135768b;

            /* renamed from: c */
            private String f135769c = "";

            /* renamed from: d */
            private boolean f135770d;

            /* renamed from: e */
            private boolean f135771e;

            /* renamed from: a */
            public final ReadParam mo187513a() {
                return new ReadParam(this.f135767a, this.f135768b, this.f135770d, this.f135771e, this.f135769c);
            }

            /* renamed from: a */
            public final Builder mo187510a(int i) {
                Builder aVar = this;
                aVar.f135767a = i;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo187514b(int i) {
                Builder aVar = this;
                aVar.f135768b = i;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187511a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "messageId");
                Builder aVar = this;
                aVar.f135769c = str;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo187515b(boolean z) {
                Builder aVar = this;
                aVar.f135771e = z;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187512a(boolean z) {
                Builder aVar = this;
                aVar.f135770d = z;
                return aVar;
            }
        }

        /* renamed from: a */
        public final void mo187509a() {
            JSONObject put = new JSONObject().put("read_count", this.f135762b).put("unread_count", this.f135763c);
            JSONObject put2 = new JSONObject().put("extra", new JSONObject().put("message_id", this.f135766f).put("sync_msg_dep", this.f135764d).put("sync_pipe_finished", this.f135765e));
            Intrinsics.checkExpressionValueIsNotNull(put, "metric");
            Intrinsics.checkExpressionValueIsNotNull(put2, "extra");
            ChatSampleIssueHitPoint.m213256a("message_read_sample", put, put2);
        }

        public ReadParam(int i, int i2, boolean z, boolean z2, String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f135762b = i;
            this.f135763c = i2;
            this.f135764d = z;
            this.f135765e = z2;
            this.f135766f = str;
        }
    }

    private ChatSampleIssueHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m213256a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ApmAgent.monitorEvent(str, null, jSONObject, jSONObject2);
        Log.m165389i("ChatSampleIssueHitPoint", "tracked sample issue: " + str + ", " + jSONObject + ", " + jSONObject2);
    }
}
