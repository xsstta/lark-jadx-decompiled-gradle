package com.bytedance.ee.bear.middleground.comment.reaction;

import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "business", "", "getBusiness", "()Ljava/lang/String;", "setBusiness", "(Ljava/lang/String;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity;", "getData", "()Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity;", "setData", "(Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity;)V", "Entity", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ReactionDataEntity implements NonProguard {
    private String business;
    private Entity data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "body", "Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$BodyEntity;", "getBody", "()Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$BodyEntity;", "setBody", "(Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$BodyEntity;)V", "header", "Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$HeaderEntity;", "getHeader", "()Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$HeaderEntity;", "setHeader", "(Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$HeaderEntity;)V", "identifier", "Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$IdentifierEntity;", "getIdentifier", "()Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$IdentifierEntity;", "setIdentifier", "(Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$IdentifierEntity;)V", "operation", "", "getOperation", "()Ljava/lang/String;", "setOperation", "(Ljava/lang/String;)V", "BodyEntity", "HeaderEntity", "IdentifierEntity", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Entity implements NonProguard {
        private BodyEntity body;
        private HeaderEntity header;
        private IdentifierEntity identifier;
        private String operation;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$BodyEntity;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class BodyEntity implements NonProguard {
            private Integer code = 0;
            private String msg;

            public final Integer getCode() {
                return this.code;
            }

            public final String getMsg() {
                return this.msg;
            }

            public final void setCode(Integer num) {
                this.code = num;
            }

            public final void setMsg(String str) {
                this.msg = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$HeaderEntity;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "requestId", "", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class HeaderEntity implements NonProguard {
            private String requestId;

            public final String getRequestId() {
                return this.requestId;
            }

            public final void setRequestId(String str) {
                this.requestId = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/reaction/ReactionDataEntity$Entity$IdentifierEntity;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class IdentifierEntity implements NonProguard {
            private String token;
            private int type;

            public final String getToken() {
                return this.token;
            }

            public final int getType() {
                return this.type;
            }

            public final void setToken(String str) {
                this.token = str;
            }

            public final void setType(int i) {
                this.type = i;
            }
        }

        public final BodyEntity getBody() {
            return this.body;
        }

        public final HeaderEntity getHeader() {
            return this.header;
        }

        public final IdentifierEntity getIdentifier() {
            return this.identifier;
        }

        public final String getOperation() {
            return this.operation;
        }

        public final void setBody(BodyEntity bodyEntity) {
            this.body = bodyEntity;
        }

        public final void setHeader(HeaderEntity headerEntity) {
            this.header = headerEntity;
        }

        public final void setIdentifier(IdentifierEntity identifierEntity) {
            this.identifier = identifierEntity;
        }

        public final void setOperation(String str) {
            this.operation = str;
        }
    }

    public final String getBusiness() {
        return this.business;
    }

    public final Entity getData() {
        return this.data;
    }

    public final void setBusiness(String str) {
        this.business = str;
    }

    public final void setData(Entity entity) {
        this.data = entity;
    }
}
