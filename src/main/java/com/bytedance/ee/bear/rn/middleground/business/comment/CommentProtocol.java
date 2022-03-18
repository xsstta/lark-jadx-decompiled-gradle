package com.bytedance.ee.bear.rn.middleground.business.comment;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol;
import com.bytedance.ee.bear.rn.middleground.protocol.Protocol.Body;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol;", "T", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "()V", "AddTranslateComments", "BeginSync", "Body", "Delete", "Edit", "EndSync", "Fetch", "FetchMessage", "Publish", "SetTranslateEnableLang", "SolveMessage", "Translate", "Update", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class CommentProtocol<T extends Protocol.Body> extends Protocol<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body;", "DeleteComment", "EditComment", "Extra", "PublishComment", "PublishType", "Solve", "Translate", "UpdateComment", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public interface Body extends Protocol.Body {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "attachment", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra$Attachment;", "options", "", "image_list", "", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra$CommentImageItem;", "(Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra$Attachment;Ljava/lang/String;Ljava/util/List;)V", "getAttachment", "()Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra$Attachment;", "getImage_list", "()Ljava/util/List;", "getOptions", "()Ljava/lang/String;", "Attachment", "CommentImageItem", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Extra implements Body {
            private final Attachment attachment;
            private final List<CommentImageItem> image_list;
            private final String options;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra$Attachment;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "audio_file_token", "", "audio_duration", "", "options", "(Ljava/lang/String;ILjava/lang/String;)V", "getAudio_duration", "()I", "getAudio_file_token", "()Ljava/lang/String;", "getOptions", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            public static final class Attachment implements Body {
                private final int audio_duration;
                private final String audio_file_token;
                private final String options;

                public final int getAudio_duration() {
                    return this.audio_duration;
                }

                public final String getAudio_file_token() {
                    return this.audio_file_token;
                }

                public final String getOptions() {
                    return this.options;
                }

                public Attachment(String str, int i, String str2) {
                    Intrinsics.checkParameterIsNotNull(str, "audio_file_token");
                    this.audio_file_token = str;
                    this.audio_duration = i;
                    this.options = str2;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra$CommentImageItem;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "token", "", "uuid", "src", "originalSrc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalSrc", "()Ljava/lang/String;", "getSrc", "getToken", "getUuid", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            public static final class CommentImageItem implements Body {
                private final String originalSrc;
                private final String src;
                private final String token;
                private final String uuid;

                public final String getOriginalSrc() {
                    return this.originalSrc;
                }

                public final String getSrc() {
                    return this.src;
                }

                public final String getToken() {
                    return this.token;
                }

                public final String getUuid() {
                    return this.uuid;
                }

                public CommentImageItem(String str, String str2, String str3, String str4) {
                    Intrinsics.checkParameterIsNotNull(str3, "src");
                    this.token = str;
                    this.uuid = str2;
                    this.src = str3;
                    this.originalSrc = str4;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ CommentImageItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : str4);
                }
            }

            public final Attachment getAttachment() {
                return this.attachment;
            }

            public final List<CommentImageItem> getImage_list() {
                return this.image_list;
            }

            public final String getOptions() {
                return this.options;
            }

            public Extra(Attachment attachment2, String str, List<CommentImageItem> list) {
                this.attachment = attachment2;
                this.options = str;
                this.image_list = list;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$DeleteComment;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "comment_id", "", "reply_id", "(Ljava/lang/String;Ljava/lang/String;)V", "getComment_id", "()Ljava/lang/String;", "getReply_id", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class DeleteComment implements Body {
            private final String comment_id;
            private final String reply_id;

            public final String getComment_id() {
                return this.comment_id;
            }

            public final String getReply_id() {
                return this.reply_id;
            }

            public DeleteComment(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "comment_id");
                Intrinsics.checkParameterIsNotNull(str2, "reply_id");
                this.comment_id = str;
                this.reply_id = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bR#\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148G@GX\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$EditComment;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "comment_id", "", "reply_id", "content", "extra", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;", "bizParams", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;Ljava/util/Map;)V", "getBizParams", "()Ljava/util/Map;", "getComment_id", "()Ljava/lang/String;", "getContent", "getExtra", "()Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;", "value", "", "is_audio", "()Ljava/lang/Boolean;", "set_audio", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getReply_id", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class EditComment implements Body {
            private final Map<Object, Object> bizParams;
            private final String comment_id;
            private final String content;
            private final Extra extra;
            private Boolean is_audio = false;
            private final String reply_id;

            public final Map<Object, Object> getBizParams() {
                return this.bizParams;
            }

            public final String getComment_id() {
                return this.comment_id;
            }

            public final String getContent() {
                return this.content;
            }

            public final Extra getExtra() {
                return this.extra;
            }

            public final String getReply_id() {
                return this.reply_id;
            }

            @JSONField(name = "is_audio")
            public final Boolean is_audio() {
                return this.is_audio;
            }

            @JSONField(name = "is_audio")
            public final void set_audio(Boolean bool) {
                this.is_audio = bool;
            }

            public EditComment(String str, String str2, String str3, Extra extra2, Map<Object, ? extends Object> map) {
                Intrinsics.checkParameterIsNotNull(str, "comment_id");
                Intrinsics.checkParameterIsNotNull(str2, "reply_id");
                Intrinsics.checkParameterIsNotNull(str3, "content");
                this.comment_id = str;
                this.reply_id = str2;
                this.content = str3;
                this.extra = extra2;
                this.bizParams = map;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013R#\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8G@GX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R,\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8G@GX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$PublishComment;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "quote", "", "content", "comment_id", "extra", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;", "tmp_comment_id", "parent_type", "parent_token", "reply_id", ShareHitPoint.f121869d, "", "local_comment_id", "position", "bizParams", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBizParams", "()Ljava/util/Map;", "getComment_id", "()Ljava/lang/String;", "getContent", "getExtra", "()Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Extra;", "value", "", "is_audio", "()Ljava/lang/Boolean;", "set_audio", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "is_whole", "set_whole", "getLocal_comment_id", "getParent_token", "getParent_type", "getPosition", "getQuote", "getReply_id", "getTmp_comment_id", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class PublishComment implements Body {
            private final Map<Object, Object> bizParams;
            private final String comment_id;
            private final String content;
            private final Extra extra;
            private Boolean is_audio = false;
            private Boolean is_whole = false;
            private final String local_comment_id;
            private final String parent_token;
            private final String parent_type;
            private final String position;
            private final String quote;
            private final String reply_id;
            private final String tmp_comment_id;
            private final Integer type;

            public final Map<Object, Object> getBizParams() {
                return this.bizParams;
            }

            public final String getComment_id() {
                return this.comment_id;
            }

            public final String getContent() {
                return this.content;
            }

            public final Extra getExtra() {
                return this.extra;
            }

            public final String getLocal_comment_id() {
                return this.local_comment_id;
            }

            public final String getParent_token() {
                return this.parent_token;
            }

            public final String getParent_type() {
                return this.parent_type;
            }

            public final String getPosition() {
                return this.position;
            }

            public final String getQuote() {
                return this.quote;
            }

            public final String getReply_id() {
                return this.reply_id;
            }

            public final String getTmp_comment_id() {
                return this.tmp_comment_id;
            }

            public final Integer getType() {
                return this.type;
            }

            @JSONField(name = "is_audio")
            public final Boolean is_audio() {
                return this.is_audio;
            }

            @JSONField(name = "is_whole")
            public final Boolean is_whole() {
                return this.is_whole;
            }

            @JSONField(name = "is_audio")
            public final void set_audio(Boolean bool) {
                this.is_audio = bool;
            }

            @JSONField(name = "is_whole")
            public final void set_whole(Boolean bool) {
                this.is_whole = bool;
            }

            public PublishComment(String str, String str2, String str3, Extra extra2, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, Map<Object, ? extends Object> map) {
                Intrinsics.checkParameterIsNotNull(str2, "content");
                this.quote = str;
                this.content = str2;
                this.comment_id = str3;
                this.extra = extra2;
                this.tmp_comment_id = str4;
                this.parent_type = str5;
                this.parent_token = str6;
                this.reply_id = str7;
                this.type = num;
                this.local_comment_id = str8;
                this.position = str9;
                this.bizParams = map;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Solve;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "messageIds", "", "", "solveStatus", "", "options", "([Ljava/lang/String;ILjava/lang/String;)V", "getMessageIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSolveStatus", "()I", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Solve implements Body {
            private final String[] messageIds;
            private final int solveStatus;

            public final String[] getMessageIds() {
                return this.messageIds;
            }

            public final int getSolveStatus() {
                return this.solveStatus;
            }

            public Solve(String[] strArr, int i, String str) {
                Intrinsics.checkParameterIsNotNull(strArr, "messageIds");
                this.messageIds = strArr;
                this.solveStatus = i;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Translate;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "comment_id", "", "reply_id", "(Ljava/lang/String;Ljava/lang/String;)V", "getComment_id", "()Ljava/lang/String;", "getReply_id", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class Translate implements Body {
            private final String comment_id;
            private final String reply_id;

            public final String getComment_id() {
                return this.comment_id;
            }

            public final String getReply_id() {
                return this.reply_id;
            }

            public Translate(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "comment_id");
                Intrinsics.checkParameterIsNotNull(str2, "reply_id");
                this.comment_id = str;
                this.reply_id = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$UpdateComment;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body;", "comment_id", "", "finish", "", "(Ljava/lang/String;I)V", "getComment_id", "()Ljava/lang/String;", "getFinish", "()I", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class UpdateComment implements Body {
            private final String comment_id;
            private final int finish;

            public final String getComment_id() {
                return this.comment_id;
            }

            public final int getFinish() {
                return this.finish;
            }

            public UpdateComment(String str, int i) {
                Intrinsics.checkParameterIsNotNull(str, "comment_id");
                this.comment_id = str;
                this.finish = i;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$PublishType;", "", "()V", "CREATE", "", "getCREATE", "()I", "EDIT", "getEDIT", "REPLY", "getREPLY", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$Body$a */
        public static final class PublishType {

            /* renamed from: a */
            public static final PublishType f28664a = new PublishType();

            /* renamed from: b */
            private static final int f28665b = 1;

            /* renamed from: c */
            private static final int f28666c = 2;

            /* renamed from: a */
            public final int mo40500a() {
                return 0;
            }

            private PublishType() {
            }

            /* renamed from: b */
            public final int mo40501b() {
                return f28666c;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Update;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$UpdateComment;", "()V", "getJsonString", "", "UPDATE", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Update extends Protocol<Body.UpdateComment> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Update$UPDATE;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;II)V", "RESOLVE", "REOPEN", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public enum UPDATE {
            RESOLVE(1),
            REOPEN(0);
            
            private final int type;

            public final int type() {
                return this.type;
            }

            private UPDATE(int i) {
                this.type = i;
            }
        }

        /* renamed from: a */
        public String mo40502a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("update", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$AddTranslateComments;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$a */
    public static final class AddTranslateComments extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40504a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("addTranslateComments", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$BeginSync;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/base/BaseProtocol$Body$BeginSync;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$b */
    public static final class BeginSync extends Protocol<BaseProtocol.Body.BeginSync> {
        /* renamed from: a */
        public String mo40505a() {
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("beginSync", null, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 18, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Delete;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$DeleteComment;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$c */
    public static final class Delete extends Protocol<Body.DeleteComment> {
        /* renamed from: a */
        public String mo40506a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("delete", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Edit;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$EditComment;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$d */
    public static final class Edit extends Protocol<Body.EditComment> {
        /* renamed from: a */
        public String mo40507a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("edit", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$EndSync;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$e */
    public static final class EndSync extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40508a() {
            Protocol.Entity.Identifier c = mo40563c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            int type = c.getType();
            Protocol.Entity.Identifier c2 = mo40563c();
            if (c2 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("endSync", null, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 18, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Fetch;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$f */
    public static final class Fetch extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40509a() {
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
            String token = c2.getToken();
            Protocol.Entity.Identifier c3 = mo40563c();
            if (c3 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("fetch", d, new Protocol.Entity.Identifier(type, token, c3.getOwner(), null, 8, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$FetchMessage;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$g */
    public static final class FetchMessage extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40510a() {
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
            String token = c2.getToken();
            Protocol.Entity.Identifier c3 = mo40563c();
            if (c3 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("fetchMessage", d, new Protocol.Entity.Identifier(type, token, c3.getOwner(), null, 8, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Publish;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$PublishComment;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$h */
    public static final class Publish extends Protocol<Body.PublishComment> {
        /* renamed from: a */
        public String mo40511a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("publish", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$SetTranslateEnableLang;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol$Body$Empty;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$i */
    public static final class SetTranslateEnableLang extends Protocol<Protocol.Body.Empty> {
        /* renamed from: a */
        public String mo40512a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("setTranslateEnableLang", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$SolveMessage;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Solve;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$j */
    public static final class SolveMessage extends Protocol<Body.Solve> {
        /* renamed from: a */
        public String mo40513a() {
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
            String token = c2.getToken();
            Protocol.Entity.Identifier c3 = mo40563c();
            if (c3 == null) {
                Intrinsics.throwNpe();
            }
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("resolveMessage", d, new Protocol.Entity.Identifier(type, token, c3.getOwner(), null, 8, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Translate;", "Lcom/bytedance/ee/bear/rn/middleground/protocol/Protocol;", "Lcom/bytedance/ee/bear/rn/middleground/business/comment/CommentProtocol$Body$Translate;", "()V", "getJsonString", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.comment.CommentProtocol$k */
    public static final class Translate extends Protocol<Body.Translate> {
        /* renamed from: a */
        public String mo40514a() {
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
            String jSONString = JSONObject.toJSONString((Object) new Protocol.Entity.Base(Comment.f24093e, new Protocol.Entity.Data("translate", d, new Protocol.Entity.Identifier(type, c2.getToken(), false, null, 12, null), mo40562b(), null, 16, null)), true);
            Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…    ), true\n            )");
            return jSONString;
        }
    }
}
