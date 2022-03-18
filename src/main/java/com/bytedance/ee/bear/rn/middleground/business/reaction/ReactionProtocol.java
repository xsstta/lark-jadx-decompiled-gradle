package com.bytedance.ee.bear.rn.middleground.business.reaction;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol.Body;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007\u0005\u0006\u0007\b\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol;", "T", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "()V", "AddReaction", "BeginSync", "Body", "DetailPanelStatus", "EndSync", "ReactionDetail", "RemoveReaction", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class ReactionProtocol<T extends Protocol.Body> extends Protocol<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "AddReaction", "DetailPanelStatus", "GetReactionDetail", "RemoveReaction", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public interface Body extends Protocol.Body {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$AddReaction;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body;", "replyId", "", "reactionKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getReactionKey", "()Ljava/lang/String;", "getReplyId", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class AddReaction implements Body {
            private final String reactionKey;
            private final String replyId;

            public final String getReactionKey() {
                return this.reactionKey;
            }

            public final String getReplyId() {
                return this.replyId;
            }

            public AddReaction(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "replyId");
                Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
                this.replyId = str;
                this.reactionKey = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$DetailPanelStatus;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "referType", "", "referKey", UpdateKey.STATUS, "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getReferKey", "()Ljava/lang/String;", "getReferType", "getStatus", "()I", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class DetailPanelStatus implements Protocol.Body {
            private final String referKey;
            private final String referType;
            private final int status;

            public final String getReferKey() {
                return this.referKey;
            }

            public final String getReferType() {
                return this.referType;
            }

            public final int getStatus() {
                return this.status;
            }

            public DetailPanelStatus(String str, String str2, int i) {
                Intrinsics.checkParameterIsNotNull(str, "referType");
                Intrinsics.checkParameterIsNotNull(str2, "referKey");
                this.referType = str;
                this.referKey = str2;
                this.status = i;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$GetReactionDetail;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body;", "referType", "", "referKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getReferKey", "()Ljava/lang/String;", "getReferType", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class GetReactionDetail implements Body {
            private final String referKey;
            private final String referType;

            public final String getReferKey() {
                return this.referKey;
            }

            public final String getReferType() {
                return this.referType;
            }

            public GetReactionDetail(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "referType");
                Intrinsics.checkParameterIsNotNull(str2, "referKey");
                this.referType = str;
                this.referKey = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$RemoveReaction;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body;", "replyId", "", "reactionKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getReactionKey", "()Ljava/lang/String;", "getReplyId", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class RemoveReaction implements Body {
            private final String reactionKey;
            private final String replyId;

            public final String getReactionKey() {
                return this.reactionKey;
            }

            public final String getReplyId() {
                return this.replyId;
            }

            public RemoveReaction(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "replyId");
                Intrinsics.checkParameterIsNotNull(str2, "reactionKey");
                this.replyId = str;
                this.reactionKey = str2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$AddReaction;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$AddReaction;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol$a */
    public static final class AddReaction extends Protocol<Body.AddReaction> {
        /* renamed from: a */
        public String mo40544a() {
            Protocol.Entity.Header d = mo40564d();
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("addReaction", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$BeginSync;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol$b */
    public static final class BeginSync extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40545a() {
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("common", new Protocol.Entity.Data("beginSync", null, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), null, null, 26, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$DetailPanelStatus;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$DetailPanelStatus;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol$c */
    public static final class DetailPanelStatus extends Protocol<Body.DetailPanelStatus> {
        /* renamed from: a */
        public String mo40546a() {
            Protocol.Entity.Header d = mo40564d();
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("setReactionDetailPanelStatus", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$EndSync;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol$d */
    public static final class EndSync extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40547a() {
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base("common", new Protocol.Entity.Data("endSync", null, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), null, null, 26, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$ReactionDetail;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$GetReactionDetail;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol$e */
    public static final class ReactionDetail extends Protocol<Body.GetReactionDetail> {
        /* renamed from: a */
        public String mo40548a() {
            Protocol.Entity.Header d = mo40564d();
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("getReactionDetail", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$RemoveReaction;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/reaction/ReactionProtocol$Body$RemoveReaction;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.reaction.ReactionProtocol$f */
    public static final class RemoveReaction extends Protocol<Body.RemoveReaction> {
        /* renamed from: a */
        public String mo40549a() {
            Protocol.Entity.Header d = mo40564d();
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("removeReaction", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }
}
