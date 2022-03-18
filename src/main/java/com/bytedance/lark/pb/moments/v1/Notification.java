package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Notification extends Message<Notification, C18482a> {
    public static final ProtoAdapter<Notification> ADAPTER = new C18483b();
    public static final Long DEFAULT_CREATE_TIME_MSEC = 0L;
    public static final Boolean DEFAULT_IS_UNREAD = false;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final AtInCommentData at_in_comment_data;
    public final AtInPostData at_in_post_data;
    public final String circle_id;
    public final CommentData comment_data;
    public final CommentReactionData comment_reaction_data;
    public final Long create_time_msec;
    public final FollowerData follower_data;
    public final String id;
    public final Boolean is_unread;
    public final PostReactionData post_reaction_data;
    public final ReplyData reply_data;
    public final Type type;

    public enum Category implements WireEnum {
        UNKNOWN_CATEGORY(0),
        MESSAGE_CATEGORY(1),
        REACTION_CATEGORY(2);
        
        public static final ProtoAdapter<Category> ADAPTER = ProtoAdapter.newEnumAdapter(Category.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Category fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_CATEGORY;
            }
            if (i == 1) {
                return MESSAGE_CATEGORY;
            }
            if (i != 2) {
                return null;
            }
            return REACTION_CATEGORY;
        }

        private Category(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        FOLLOWER(1),
        POST_REACTION(2),
        COMMENT_REACTION(3),
        COMMENT(4),
        REPLY(5),
        AT_IN_POST(6),
        AT_IN_COMMENT(7);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return FOLLOWER;
                case 2:
                    return POST_REACTION;
                case 3:
                    return COMMENT_REACTION;
                case 4:
                    return COMMENT;
                case 5:
                    return REPLY;
                case 6:
                    return AT_IN_POST;
                case 7:
                    return AT_IN_COMMENT;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class AtInCommentData extends Message<AtInCommentData, C18468a> {
        public static final ProtoAdapter<AtInCommentData> ADAPTER = new C18469b();
        private static final long serialVersionUID = 0;
        public final String comment_id;
        public final String comment_user_id;
        public final String post_id;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$AtInCommentData$b */
        private static final class C18469b extends ProtoAdapter<AtInCommentData> {
            C18469b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtInCommentData.class);
            }

            /* renamed from: a */
            public int encodedSize(AtInCommentData atInCommentData) {
                int i;
                int i2;
                int i3 = 0;
                if (atInCommentData.post_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, atInCommentData.post_id);
                } else {
                    i = 0;
                }
                if (atInCommentData.comment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, atInCommentData.comment_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (atInCommentData.comment_user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, atInCommentData.comment_user_id);
                }
                return i4 + i3 + atInCommentData.unknownFields().size();
            }

            /* renamed from: a */
            public AtInCommentData decode(ProtoReader protoReader) throws IOException {
                C18468a aVar = new C18468a();
                aVar.f45876a = "";
                aVar.f45877b = "";
                aVar.f45878c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45876a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45877b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45878c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtInCommentData atInCommentData) throws IOException {
                if (atInCommentData.post_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, atInCommentData.post_id);
                }
                if (atInCommentData.comment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atInCommentData.comment_id);
                }
                if (atInCommentData.comment_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, atInCommentData.comment_user_id);
                }
                protoWriter.writeBytes(atInCommentData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$AtInCommentData$a */
        public static final class C18468a extends Message.Builder<AtInCommentData, C18468a> {

            /* renamed from: a */
            public String f45876a;

            /* renamed from: b */
            public String f45877b;

            /* renamed from: c */
            public String f45878c;

            /* renamed from: a */
            public AtInCommentData build() {
                return new AtInCommentData(this.f45876a, this.f45877b, this.f45878c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18468a newBuilder() {
            C18468a aVar = new C18468a();
            aVar.f45876a = this.post_id;
            aVar.f45877b = this.comment_id;
            aVar.f45878c = this.comment_user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "AtInCommentData");
            StringBuilder sb = new StringBuilder();
            if (this.post_id != null) {
                sb.append(", post_id=");
                sb.append(this.post_id);
            }
            if (this.comment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.comment_id);
            }
            if (this.comment_user_id != null) {
                sb.append(", comment_user_id=");
                sb.append(this.comment_user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "AtInCommentData{");
            replace.append('}');
            return replace.toString();
        }

        public AtInCommentData(String str, String str2, String str3) {
            this(str, str2, str3, ByteString.EMPTY);
        }

        public AtInCommentData(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.post_id = str;
            this.comment_id = str2;
            this.comment_user_id = str3;
        }
    }

    public static final class AtInPostData extends Message<AtInPostData, C18470a> {
        public static final ProtoAdapter<AtInPostData> ADAPTER = new C18471b();
        private static final long serialVersionUID = 0;
        public final String post_id;
        public final String post_user_id;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$AtInPostData$b */
        private static final class C18471b extends ProtoAdapter<AtInPostData> {
            C18471b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtInPostData.class);
            }

            /* renamed from: a */
            public int encodedSize(AtInPostData atInPostData) {
                int i;
                int i2 = 0;
                if (atInPostData.post_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, atInPostData.post_id);
                } else {
                    i = 0;
                }
                if (atInPostData.post_user_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, atInPostData.post_user_id);
                }
                return i + i2 + atInPostData.unknownFields().size();
            }

            /* renamed from: a */
            public AtInPostData decode(ProtoReader protoReader) throws IOException {
                C18470a aVar = new C18470a();
                aVar.f45879a = "";
                aVar.f45880b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45879a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45880b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtInPostData atInPostData) throws IOException {
                if (atInPostData.post_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, atInPostData.post_id);
                }
                if (atInPostData.post_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atInPostData.post_user_id);
                }
                protoWriter.writeBytes(atInPostData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$AtInPostData$a */
        public static final class C18470a extends Message.Builder<AtInPostData, C18470a> {

            /* renamed from: a */
            public String f45879a;

            /* renamed from: b */
            public String f45880b;

            /* renamed from: a */
            public AtInPostData build() {
                return new AtInPostData(this.f45879a, this.f45880b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18470a newBuilder() {
            C18470a aVar = new C18470a();
            aVar.f45879a = this.post_id;
            aVar.f45880b = this.post_user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "AtInPostData");
            StringBuilder sb = new StringBuilder();
            if (this.post_id != null) {
                sb.append(", post_id=");
                sb.append(this.post_id);
            }
            if (this.post_user_id != null) {
                sb.append(", post_user_id=");
                sb.append(this.post_user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "AtInPostData{");
            replace.append('}');
            return replace.toString();
        }

        public AtInPostData(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public AtInPostData(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.post_id = str;
            this.post_user_id = str2;
        }
    }

    public static final class CommentData extends Message<CommentData, C18472a> {
        public static final ProtoAdapter<CommentData> ADAPTER = new C18473b();
        public static final MomentUser.Type DEFAULT_USER_TYPE = MomentUser.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String comment_id;
        public final String post_id;
        public final String user_id;
        public final MomentUser.Type user_type;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$CommentData$b */
        private static final class C18473b extends ProtoAdapter<CommentData> {
            C18473b() {
                super(FieldEncoding.LENGTH_DELIMITED, CommentData.class);
            }

            /* renamed from: a */
            public int encodedSize(CommentData commentData) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (commentData.post_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, commentData.post_id);
                } else {
                    i = 0;
                }
                if (commentData.comment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, commentData.comment_id);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (commentData.user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, commentData.user_id);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (commentData.user_type != null) {
                    i4 = MomentUser.Type.ADAPTER.encodedSizeWithTag(4, commentData.user_type);
                }
                return i6 + i4 + commentData.unknownFields().size();
            }

            /* renamed from: a */
            public CommentData decode(ProtoReader protoReader) throws IOException {
                C18472a aVar = new C18472a();
                aVar.f45881a = "";
                aVar.f45882b = "";
                aVar.f45883c = "";
                aVar.f45884d = MomentUser.Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45881a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45882b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45883c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45884d = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CommentData commentData) throws IOException {
                if (commentData.post_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentData.post_id);
                }
                if (commentData.comment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentData.comment_id);
                }
                if (commentData.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentData.user_id);
                }
                if (commentData.user_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 4, commentData.user_type);
                }
                protoWriter.writeBytes(commentData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$CommentData$a */
        public static final class C18472a extends Message.Builder<CommentData, C18472a> {

            /* renamed from: a */
            public String f45881a;

            /* renamed from: b */
            public String f45882b;

            /* renamed from: c */
            public String f45883c;

            /* renamed from: d */
            public MomentUser.Type f45884d;

            /* renamed from: a */
            public CommentData build() {
                return new CommentData(this.f45881a, this.f45882b, this.f45883c, this.f45884d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18472a newBuilder() {
            C18472a aVar = new C18472a();
            aVar.f45881a = this.post_id;
            aVar.f45882b = this.comment_id;
            aVar.f45883c = this.user_id;
            aVar.f45884d = this.user_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "CommentData");
            StringBuilder sb = new StringBuilder();
            if (this.post_id != null) {
                sb.append(", post_id=");
                sb.append(this.post_id);
            }
            if (this.comment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.comment_id);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.user_type != null) {
                sb.append(", user_type=");
                sb.append(this.user_type);
            }
            StringBuilder replace = sb.replace(0, 2, "CommentData{");
            replace.append('}');
            return replace.toString();
        }

        public CommentData(String str, String str2, String str3, MomentUser.Type type) {
            this(str, str2, str3, type, ByteString.EMPTY);
        }

        public CommentData(String str, String str2, String str3, MomentUser.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.post_id = str;
            this.comment_id = str2;
            this.user_id = str3;
            this.user_type = type;
        }
    }

    public static final class CommentReactionData extends Message<CommentReactionData, C18474a> {
        public static final ProtoAdapter<CommentReactionData> ADAPTER = new C18475b();
        public static final MomentUser.Type DEFAULT_USER_TYPE = MomentUser.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String action_type;
        public final String comment_id;
        public final String post_id;
        public final String reaction_user_id;
        public final MomentUser.Type user_type;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$CommentReactionData$b */
        private static final class C18475b extends ProtoAdapter<CommentReactionData> {
            C18475b() {
                super(FieldEncoding.LENGTH_DELIMITED, CommentReactionData.class);
            }

            /* renamed from: a */
            public int encodedSize(CommentReactionData commentReactionData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (commentReactionData.post_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, commentReactionData.post_id);
                } else {
                    i = 0;
                }
                if (commentReactionData.comment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, commentReactionData.comment_id);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (commentReactionData.action_type != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, commentReactionData.action_type);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (commentReactionData.reaction_user_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, commentReactionData.reaction_user_id);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (commentReactionData.user_type != null) {
                    i5 = MomentUser.Type.ADAPTER.encodedSizeWithTag(5, commentReactionData.user_type);
                }
                return i8 + i5 + commentReactionData.unknownFields().size();
            }

            /* renamed from: a */
            public CommentReactionData decode(ProtoReader protoReader) throws IOException {
                C18474a aVar = new C18474a();
                aVar.f45885a = "";
                aVar.f45886b = "";
                aVar.f45887c = "";
                aVar.f45888d = "";
                aVar.f45889e = MomentUser.Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45885a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45886b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45887c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f45888d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45889e = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CommentReactionData commentReactionData) throws IOException {
                if (commentReactionData.post_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentReactionData.post_id);
                }
                if (commentReactionData.comment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentReactionData.comment_id);
                }
                if (commentReactionData.action_type != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentReactionData.action_type);
                }
                if (commentReactionData.reaction_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commentReactionData.reaction_user_id);
                }
                if (commentReactionData.user_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 5, commentReactionData.user_type);
                }
                protoWriter.writeBytes(commentReactionData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$CommentReactionData$a */
        public static final class C18474a extends Message.Builder<CommentReactionData, C18474a> {

            /* renamed from: a */
            public String f45885a;

            /* renamed from: b */
            public String f45886b;

            /* renamed from: c */
            public String f45887c;

            /* renamed from: d */
            public String f45888d;

            /* renamed from: e */
            public MomentUser.Type f45889e;

            /* renamed from: a */
            public CommentReactionData build() {
                return new CommentReactionData(this.f45885a, this.f45886b, this.f45887c, this.f45888d, this.f45889e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18474a newBuilder() {
            C18474a aVar = new C18474a();
            aVar.f45885a = this.post_id;
            aVar.f45886b = this.comment_id;
            aVar.f45887c = this.action_type;
            aVar.f45888d = this.reaction_user_id;
            aVar.f45889e = this.user_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "CommentReactionData");
            StringBuilder sb = new StringBuilder();
            if (this.post_id != null) {
                sb.append(", post_id=");
                sb.append(this.post_id);
            }
            if (this.comment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.comment_id);
            }
            if (this.action_type != null) {
                sb.append(", action_type=");
                sb.append(this.action_type);
            }
            if (this.reaction_user_id != null) {
                sb.append(", reaction_user_id=");
                sb.append(this.reaction_user_id);
            }
            if (this.user_type != null) {
                sb.append(", user_type=");
                sb.append(this.user_type);
            }
            StringBuilder replace = sb.replace(0, 2, "CommentReactionData{");
            replace.append('}');
            return replace.toString();
        }

        public CommentReactionData(String str, String str2, String str3, String str4, MomentUser.Type type) {
            this(str, str2, str3, str4, type, ByteString.EMPTY);
        }

        public CommentReactionData(String str, String str2, String str3, String str4, MomentUser.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.post_id = str;
            this.comment_id = str2;
            this.action_type = str3;
            this.reaction_user_id = str4;
            this.user_type = type;
        }
    }

    public static final class FollowerData extends Message<FollowerData, C18476a> {
        public static final ProtoAdapter<FollowerData> ADAPTER = new C18477b();
        private static final long serialVersionUID = 0;
        public final String follower_id;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$FollowerData$b */
        private static final class C18477b extends ProtoAdapter<FollowerData> {
            C18477b() {
                super(FieldEncoding.LENGTH_DELIMITED, FollowerData.class);
            }

            /* renamed from: a */
            public int encodedSize(FollowerData followerData) {
                int i;
                if (followerData.follower_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, followerData.follower_id);
                } else {
                    i = 0;
                }
                return i + followerData.unknownFields().size();
            }

            /* renamed from: a */
            public FollowerData decode(ProtoReader protoReader) throws IOException {
                C18476a aVar = new C18476a();
                aVar.f45890a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45890a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FollowerData followerData) throws IOException {
                if (followerData.follower_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followerData.follower_id);
                }
                protoWriter.writeBytes(followerData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$FollowerData$a */
        public static final class C18476a extends Message.Builder<FollowerData, C18476a> {

            /* renamed from: a */
            public String f45890a;

            /* renamed from: a */
            public FollowerData build() {
                return new FollowerData(this.f45890a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18476a newBuilder() {
            C18476a aVar = new C18476a();
            aVar.f45890a = this.follower_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "FollowerData");
            StringBuilder sb = new StringBuilder();
            if (this.follower_id != null) {
                sb.append(", follower_id=");
                sb.append(this.follower_id);
            }
            StringBuilder replace = sb.replace(0, 2, "FollowerData{");
            replace.append('}');
            return replace.toString();
        }

        public FollowerData(String str) {
            this(str, ByteString.EMPTY);
        }

        public FollowerData(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.follower_id = str;
        }
    }

    public static final class PostReactionData extends Message<PostReactionData, C18478a> {
        public static final ProtoAdapter<PostReactionData> ADAPTER = new C18479b();
        public static final MomentUser.Type DEFAULT_USER_TYPE = MomentUser.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String action_type;
        public final String post_id;
        public final String reaction_user_id;
        public final MomentUser.Type user_type;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$PostReactionData$b */
        private static final class C18479b extends ProtoAdapter<PostReactionData> {
            C18479b() {
                super(FieldEncoding.LENGTH_DELIMITED, PostReactionData.class);
            }

            /* renamed from: a */
            public int encodedSize(PostReactionData postReactionData) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (postReactionData.post_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, postReactionData.post_id);
                } else {
                    i = 0;
                }
                if (postReactionData.action_type != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, postReactionData.action_type);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (postReactionData.reaction_user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, postReactionData.reaction_user_id);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (postReactionData.user_type != null) {
                    i4 = MomentUser.Type.ADAPTER.encodedSizeWithTag(4, postReactionData.user_type);
                }
                return i6 + i4 + postReactionData.unknownFields().size();
            }

            /* renamed from: a */
            public PostReactionData decode(ProtoReader protoReader) throws IOException {
                C18478a aVar = new C18478a();
                aVar.f45891a = "";
                aVar.f45892b = "";
                aVar.f45893c = "";
                aVar.f45894d = MomentUser.Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45891a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45892b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45893c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45894d = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PostReactionData postReactionData) throws IOException {
                if (postReactionData.post_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, postReactionData.post_id);
                }
                if (postReactionData.action_type != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, postReactionData.action_type);
                }
                if (postReactionData.reaction_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, postReactionData.reaction_user_id);
                }
                if (postReactionData.user_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 4, postReactionData.user_type);
                }
                protoWriter.writeBytes(postReactionData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$PostReactionData$a */
        public static final class C18478a extends Message.Builder<PostReactionData, C18478a> {

            /* renamed from: a */
            public String f45891a;

            /* renamed from: b */
            public String f45892b;

            /* renamed from: c */
            public String f45893c;

            /* renamed from: d */
            public MomentUser.Type f45894d;

            /* renamed from: a */
            public PostReactionData build() {
                return new PostReactionData(this.f45891a, this.f45892b, this.f45893c, this.f45894d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18478a newBuilder() {
            C18478a aVar = new C18478a();
            aVar.f45891a = this.post_id;
            aVar.f45892b = this.action_type;
            aVar.f45893c = this.reaction_user_id;
            aVar.f45894d = this.user_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "PostReactionData");
            StringBuilder sb = new StringBuilder();
            if (this.post_id != null) {
                sb.append(", post_id=");
                sb.append(this.post_id);
            }
            if (this.action_type != null) {
                sb.append(", action_type=");
                sb.append(this.action_type);
            }
            if (this.reaction_user_id != null) {
                sb.append(", reaction_user_id=");
                sb.append(this.reaction_user_id);
            }
            if (this.user_type != null) {
                sb.append(", user_type=");
                sb.append(this.user_type);
            }
            StringBuilder replace = sb.replace(0, 2, "PostReactionData{");
            replace.append('}');
            return replace.toString();
        }

        public PostReactionData(String str, String str2, String str3, MomentUser.Type type) {
            this(str, str2, str3, type, ByteString.EMPTY);
        }

        public PostReactionData(String str, String str2, String str3, MomentUser.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.post_id = str;
            this.action_type = str2;
            this.reaction_user_id = str3;
            this.user_type = type;
        }
    }

    public static final class ReplyData extends Message<ReplyData, C18480a> {
        public static final ProtoAdapter<ReplyData> ADAPTER = new C18481b();
        public static final MomentUser.Type DEFAULT_USER_TYPE = MomentUser.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String comment_id;
        public final String post_id;
        public final String reply_comment_id;
        public final String user_id;
        public final MomentUser.Type user_type;

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$ReplyData$b */
        private static final class C18481b extends ProtoAdapter<ReplyData> {
            C18481b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReplyData.class);
            }

            /* renamed from: a */
            public int encodedSize(ReplyData replyData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (replyData.post_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, replyData.post_id);
                } else {
                    i = 0;
                }
                if (replyData.comment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, replyData.comment_id);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (replyData.user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, replyData.user_id);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (replyData.reply_comment_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, replyData.reply_comment_id);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (replyData.user_type != null) {
                    i5 = MomentUser.Type.ADAPTER.encodedSizeWithTag(5, replyData.user_type);
                }
                return i8 + i5 + replyData.unknownFields().size();
            }

            /* renamed from: a */
            public ReplyData decode(ProtoReader protoReader) throws IOException {
                C18480a aVar = new C18480a();
                aVar.f45895a = "";
                aVar.f45896b = "";
                aVar.f45897c = "";
                aVar.f45898d = "";
                aVar.f45899e = MomentUser.Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45895a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45896b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45897c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f45898d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45899e = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReplyData replyData) throws IOException {
                if (replyData.post_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, replyData.post_id);
                }
                if (replyData.comment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, replyData.comment_id);
                }
                if (replyData.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, replyData.user_id);
                }
                if (replyData.reply_comment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, replyData.reply_comment_id);
                }
                if (replyData.user_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 5, replyData.user_type);
                }
                protoWriter.writeBytes(replyData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$ReplyData$a */
        public static final class C18480a extends Message.Builder<ReplyData, C18480a> {

            /* renamed from: a */
            public String f45895a;

            /* renamed from: b */
            public String f45896b;

            /* renamed from: c */
            public String f45897c;

            /* renamed from: d */
            public String f45898d;

            /* renamed from: e */
            public MomentUser.Type f45899e;

            /* renamed from: a */
            public ReplyData build() {
                return new ReplyData(this.f45895a, this.f45896b, this.f45897c, this.f45898d, this.f45899e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18480a newBuilder() {
            C18480a aVar = new C18480a();
            aVar.f45895a = this.post_id;
            aVar.f45896b = this.comment_id;
            aVar.f45897c = this.user_id;
            aVar.f45898d = this.reply_comment_id;
            aVar.f45899e = this.user_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "ReplyData");
            StringBuilder sb = new StringBuilder();
            if (this.post_id != null) {
                sb.append(", post_id=");
                sb.append(this.post_id);
            }
            if (this.comment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.comment_id);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.reply_comment_id != null) {
                sb.append(", reply_comment_id=");
                sb.append(this.reply_comment_id);
            }
            if (this.user_type != null) {
                sb.append(", user_type=");
                sb.append(this.user_type);
            }
            StringBuilder replace = sb.replace(0, 2, "ReplyData{");
            replace.append('}');
            return replace.toString();
        }

        public ReplyData(String str, String str2, String str3, String str4, MomentUser.Type type) {
            this(str, str2, str3, str4, type, ByteString.EMPTY);
        }

        public ReplyData(String str, String str2, String str3, String str4, MomentUser.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.post_id = str;
            this.comment_id = str2;
            this.user_id = str3;
            this.reply_comment_id = str4;
            this.user_type = type;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$b */
    private static final class C18483b extends ProtoAdapter<Notification> {
        C18483b() {
            super(FieldEncoding.LENGTH_DELIMITED, Notification.class);
        }

        /* renamed from: a */
        public int encodedSize(Notification notification) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = 0;
            if (notification.create_time_msec != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, notification.create_time_msec);
            } else {
                i = 0;
            }
            if (notification.id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, notification.id);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (notification.circle_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, notification.circle_id);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (notification.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(4, notification.type);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (notification.is_unread != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, notification.is_unread);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (notification.follower_data != null) {
                i6 = FollowerData.ADAPTER.encodedSizeWithTag(101, notification.follower_data);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (notification.post_reaction_data != null) {
                i7 = PostReactionData.ADAPTER.encodedSizeWithTag(102, notification.post_reaction_data);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (notification.comment_reaction_data != null) {
                i8 = CommentReactionData.ADAPTER.encodedSizeWithTag(103, notification.comment_reaction_data);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (notification.comment_data != null) {
                i9 = CommentData.ADAPTER.encodedSizeWithTag(104, notification.comment_data);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (notification.reply_data != null) {
                i10 = ReplyData.ADAPTER.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, notification.reply_data);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (notification.at_in_post_data != null) {
                i11 = AtInPostData.ADAPTER.encodedSizeWithTag(106, notification.at_in_post_data);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (notification.at_in_comment_data != null) {
                i12 = AtInCommentData.ADAPTER.encodedSizeWithTag(ActivityIdentificationData.WALKING, notification.at_in_comment_data);
            }
            return i22 + i12 + notification.unknownFields().size();
        }

        /* renamed from: a */
        public Notification decode(ProtoReader protoReader) throws IOException {
            C18482a aVar = new C18482a();
            aVar.f45900a = 0L;
            aVar.f45901b = "";
            aVar.f45902c = "";
            aVar.f45903d = Type.UNKNOWN;
            aVar.f45904e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45900a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45901b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45902c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f45903d = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    switch (nextTag) {
                        case 101:
                            aVar.f45905f = FollowerData.ADAPTER.decode(protoReader);
                            continue;
                        case 102:
                            aVar.f45906g = PostReactionData.ADAPTER.decode(protoReader);
                            continue;
                        case 103:
                            aVar.f45907h = CommentReactionData.ADAPTER.decode(protoReader);
                            continue;
                        case 104:
                            aVar.f45908i = CommentData.ADAPTER.decode(protoReader);
                            continue;
                        case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                            aVar.f45909j = ReplyData.ADAPTER.decode(protoReader);
                            continue;
                        case 106:
                            aVar.f45910k = AtInPostData.ADAPTER.decode(protoReader);
                            continue;
                        case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                            aVar.f45911l = AtInCommentData.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f45904e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Notification notification) throws IOException {
            if (notification.create_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, notification.create_time_msec);
            }
            if (notification.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, notification.id);
            }
            if (notification.circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, notification.circle_id);
            }
            if (notification.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 4, notification.type);
            }
            if (notification.is_unread != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, notification.is_unread);
            }
            if (notification.follower_data != null) {
                FollowerData.ADAPTER.encodeWithTag(protoWriter, 101, notification.follower_data);
            }
            if (notification.post_reaction_data != null) {
                PostReactionData.ADAPTER.encodeWithTag(protoWriter, 102, notification.post_reaction_data);
            }
            if (notification.comment_reaction_data != null) {
                CommentReactionData.ADAPTER.encodeWithTag(protoWriter, 103, notification.comment_reaction_data);
            }
            if (notification.comment_data != null) {
                CommentData.ADAPTER.encodeWithTag(protoWriter, 104, notification.comment_data);
            }
            if (notification.reply_data != null) {
                ReplyData.ADAPTER.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, notification.reply_data);
            }
            if (notification.at_in_post_data != null) {
                AtInPostData.ADAPTER.encodeWithTag(protoWriter, 106, notification.at_in_post_data);
            }
            if (notification.at_in_comment_data != null) {
                AtInCommentData.ADAPTER.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, notification.at_in_comment_data);
            }
            protoWriter.writeBytes(notification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Notification$a */
    public static final class C18482a extends Message.Builder<Notification, C18482a> {

        /* renamed from: a */
        public Long f45900a;

        /* renamed from: b */
        public String f45901b;

        /* renamed from: c */
        public String f45902c;

        /* renamed from: d */
        public Type f45903d;

        /* renamed from: e */
        public Boolean f45904e;

        /* renamed from: f */
        public FollowerData f45905f;

        /* renamed from: g */
        public PostReactionData f45906g;

        /* renamed from: h */
        public CommentReactionData f45907h;

        /* renamed from: i */
        public CommentData f45908i;

        /* renamed from: j */
        public ReplyData f45909j;

        /* renamed from: k */
        public AtInPostData f45910k;

        /* renamed from: l */
        public AtInCommentData f45911l;

        /* renamed from: a */
        public Notification build() {
            return new Notification(this.f45900a, this.f45901b, this.f45902c, this.f45903d, this.f45904e, this.f45905f, this.f45906g, this.f45907h, this.f45908i, this.f45909j, this.f45910k, this.f45911l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18482a newBuilder() {
        C18482a aVar = new C18482a();
        aVar.f45900a = this.create_time_msec;
        aVar.f45901b = this.id;
        aVar.f45902c = this.circle_id;
        aVar.f45903d = this.type;
        aVar.f45904e = this.is_unread;
        aVar.f45905f = this.follower_data;
        aVar.f45906g = this.post_reaction_data;
        aVar.f45907h = this.comment_reaction_data;
        aVar.f45908i = this.comment_data;
        aVar.f45909j = this.reply_data;
        aVar.f45910k = this.at_in_post_data;
        aVar.f45911l = this.at_in_comment_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Notification");
        StringBuilder sb = new StringBuilder();
        if (this.create_time_msec != null) {
            sb.append(", create_time_msec=");
            sb.append(this.create_time_msec);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.circle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.circle_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.is_unread != null) {
            sb.append(", is_unread=");
            sb.append(this.is_unread);
        }
        if (this.follower_data != null) {
            sb.append(", follower_data=");
            sb.append(this.follower_data);
        }
        if (this.post_reaction_data != null) {
            sb.append(", post_reaction_data=");
            sb.append(this.post_reaction_data);
        }
        if (this.comment_reaction_data != null) {
            sb.append(", comment_reaction_data=");
            sb.append(this.comment_reaction_data);
        }
        if (this.comment_data != null) {
            sb.append(", comment_data=");
            sb.append(this.comment_data);
        }
        if (this.reply_data != null) {
            sb.append(", reply_data=");
            sb.append(this.reply_data);
        }
        if (this.at_in_post_data != null) {
            sb.append(", at_in_post_data=");
            sb.append(this.at_in_post_data);
        }
        if (this.at_in_comment_data != null) {
            sb.append(", at_in_comment_data=");
            sb.append(this.at_in_comment_data);
        }
        StringBuilder replace = sb.replace(0, 2, "Notification{");
        replace.append('}');
        return replace.toString();
    }

    public Notification(Long l, String str, String str2, Type type2, Boolean bool, FollowerData followerData, PostReactionData postReactionData, CommentReactionData commentReactionData, CommentData commentData, ReplyData replyData, AtInPostData atInPostData, AtInCommentData atInCommentData) {
        this(l, str, str2, type2, bool, followerData, postReactionData, commentReactionData, commentData, replyData, atInPostData, atInCommentData, ByteString.EMPTY);
    }

    public Notification(Long l, String str, String str2, Type type2, Boolean bool, FollowerData followerData, PostReactionData postReactionData, CommentReactionData commentReactionData, CommentData commentData, ReplyData replyData, AtInPostData atInPostData, AtInCommentData atInCommentData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.create_time_msec = l;
        this.id = str;
        this.circle_id = str2;
        this.type = type2;
        this.is_unread = bool;
        this.follower_data = followerData;
        this.post_reaction_data = postReactionData;
        this.comment_reaction_data = commentReactionData;
        this.comment_data = commentData;
        this.reply_data = replyData;
        this.at_in_post_data = atInPostData;
        this.at_in_comment_data = atInCommentData;
    }
}
