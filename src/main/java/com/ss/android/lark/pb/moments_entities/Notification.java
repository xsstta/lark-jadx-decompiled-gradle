package com.ss.android.lark.pb.moments_entities;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import java.io.IOException;
import okio.ByteString;

public final class Notification extends Message<Notification, C49986a> {
    public static final ProtoAdapter<Notification> ADAPTER = new C49987b();
    public static final Long DEFAULT_CREATE_TIME_MSEC = 0L;
    public static final Boolean DEFAULT_IS_UNREAD = false;
    private static final long serialVersionUID = 0;
    public final AtInCommentData mat_in_comment_data;
    public final AtInPostData mat_in_post_data;
    public final String mcircle_id;
    public final CommentData mcomment_data;
    public final CommentReactionData mcomment_reaction_data;
    public final Long mcreate_time_msec;
    public final FollowerData mfollower_data;
    public final String mid;
    public final Boolean mis_unread;
    public final PostReactionData mpost_reaction_data;
    public final ReplyData mreply_data;
    public final Type mtype;

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

    public static final class AtInCommentData extends Message<AtInCommentData, C49972a> {
        public static final ProtoAdapter<AtInCommentData> ADAPTER = new C49973b();
        private static final long serialVersionUID = 0;
        public final String mcomment_id;
        public final String mcomment_user_id;
        public final String mpost_id;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$AtInCommentData$b */
        private static final class C49973b extends ProtoAdapter<AtInCommentData> {
            C49973b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtInCommentData.class);
            }

            /* renamed from: a */
            public int encodedSize(AtInCommentData atInCommentData) {
                int i;
                int i2;
                int i3 = 0;
                if (atInCommentData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, atInCommentData.mpost_id);
                } else {
                    i = 0;
                }
                if (atInCommentData.mcomment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, atInCommentData.mcomment_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (atInCommentData.mcomment_user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, atInCommentData.mcomment_user_id);
                }
                return i4 + i3 + atInCommentData.unknownFields().size();
            }

            /* renamed from: a */
            public AtInCommentData decode(ProtoReader protoReader) throws IOException {
                C49972a aVar = new C49972a();
                aVar.f124987a = "";
                aVar.f124988b = "";
                aVar.f124989c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124987a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124988b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124989c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtInCommentData atInCommentData) throws IOException {
                if (atInCommentData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, atInCommentData.mpost_id);
                }
                if (atInCommentData.mcomment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atInCommentData.mcomment_id);
                }
                if (atInCommentData.mcomment_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, atInCommentData.mcomment_user_id);
                }
                protoWriter.writeBytes(atInCommentData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$AtInCommentData$a */
        public static final class C49972a extends Message.Builder<AtInCommentData, C49972a> {

            /* renamed from: a */
            public String f124987a;

            /* renamed from: b */
            public String f124988b;

            /* renamed from: c */
            public String f124989c;

            /* renamed from: a */
            public AtInCommentData build() {
                return new AtInCommentData(this.f124987a, this.f124988b, this.f124989c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49972a newBuilder() {
            C49972a aVar = new C49972a();
            aVar.f124987a = this.mpost_id;
            aVar.f124988b = this.mcomment_id;
            aVar.f124989c = this.mcomment_user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            if (this.mcomment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.mcomment_id);
            }
            if (this.mcomment_user_id != null) {
                sb.append(", comment_user_id=");
                sb.append(this.mcomment_user_id);
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
            this.mpost_id = str;
            this.mcomment_id = str2;
            this.mcomment_user_id = str3;
        }
    }

    public static final class AtInPostData extends Message<AtInPostData, C49974a> {
        public static final ProtoAdapter<AtInPostData> ADAPTER = new C49975b();
        private static final long serialVersionUID = 0;
        public final String mpost_id;
        public final String mpost_user_id;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$AtInPostData$b */
        private static final class C49975b extends ProtoAdapter<AtInPostData> {
            C49975b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtInPostData.class);
            }

            /* renamed from: a */
            public int encodedSize(AtInPostData atInPostData) {
                int i;
                int i2 = 0;
                if (atInPostData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, atInPostData.mpost_id);
                } else {
                    i = 0;
                }
                if (atInPostData.mpost_user_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, atInPostData.mpost_user_id);
                }
                return i + i2 + atInPostData.unknownFields().size();
            }

            /* renamed from: a */
            public AtInPostData decode(ProtoReader protoReader) throws IOException {
                C49974a aVar = new C49974a();
                aVar.f124990a = "";
                aVar.f124991b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124990a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124991b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtInPostData atInPostData) throws IOException {
                if (atInPostData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, atInPostData.mpost_id);
                }
                if (atInPostData.mpost_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, atInPostData.mpost_user_id);
                }
                protoWriter.writeBytes(atInPostData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$AtInPostData$a */
        public static final class C49974a extends Message.Builder<AtInPostData, C49974a> {

            /* renamed from: a */
            public String f124990a;

            /* renamed from: b */
            public String f124991b;

            /* renamed from: a */
            public AtInPostData build() {
                return new AtInPostData(this.f124990a, this.f124991b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49974a newBuilder() {
            C49974a aVar = new C49974a();
            aVar.f124990a = this.mpost_id;
            aVar.f124991b = this.mpost_user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            if (this.mpost_user_id != null) {
                sb.append(", post_user_id=");
                sb.append(this.mpost_user_id);
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
            this.mpost_id = str;
            this.mpost_user_id = str2;
        }
    }

    public static final class CommentData extends Message<CommentData, C49976a> {
        public static final ProtoAdapter<CommentData> ADAPTER = new C49977b();
        private static final long serialVersionUID = 0;
        public final String mcomment_id;
        public final String mpost_id;
        public final String muser_id;
        public final MomentUser.Type muser_type;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$CommentData$b */
        private static final class C49977b extends ProtoAdapter<CommentData> {
            C49977b() {
                super(FieldEncoding.LENGTH_DELIMITED, CommentData.class);
            }

            /* renamed from: a */
            public int encodedSize(CommentData commentData) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (commentData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, commentData.mpost_id);
                } else {
                    i = 0;
                }
                if (commentData.mcomment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, commentData.mcomment_id);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (commentData.muser_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, commentData.muser_id);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (commentData.muser_type != null) {
                    i4 = MomentUser.Type.ADAPTER.encodedSizeWithTag(4, commentData.muser_type);
                }
                return i6 + i4 + commentData.unknownFields().size();
            }

            /* renamed from: a */
            public CommentData decode(ProtoReader protoReader) throws IOException {
                C49976a aVar = new C49976a();
                aVar.f124992a = "";
                aVar.f124993b = "";
                aVar.f124994c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124992a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124993b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f124994c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f124995d = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CommentData commentData) throws IOException {
                if (commentData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentData.mpost_id);
                }
                if (commentData.mcomment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentData.mcomment_id);
                }
                if (commentData.muser_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentData.muser_id);
                }
                if (commentData.muser_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 4, commentData.muser_type);
                }
                protoWriter.writeBytes(commentData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$CommentData$a */
        public static final class C49976a extends Message.Builder<CommentData, C49976a> {

            /* renamed from: a */
            public String f124992a;

            /* renamed from: b */
            public String f124993b;

            /* renamed from: c */
            public String f124994c;

            /* renamed from: d */
            public MomentUser.Type f124995d;

            /* renamed from: a */
            public CommentData build() {
                return new CommentData(this.f124992a, this.f124993b, this.f124994c, this.f124995d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49976a newBuilder() {
            C49976a aVar = new C49976a();
            aVar.f124992a = this.mpost_id;
            aVar.f124993b = this.mcomment_id;
            aVar.f124994c = this.muser_id;
            aVar.f124995d = this.muser_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            if (this.mcomment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.mcomment_id);
            }
            if (this.muser_id != null) {
                sb.append(", user_id=");
                sb.append(this.muser_id);
            }
            if (this.muser_type != null) {
                sb.append(", user_type=");
                sb.append(this.muser_type);
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
            this.mpost_id = str;
            this.mcomment_id = str2;
            this.muser_id = str3;
            this.muser_type = type;
        }
    }

    public static final class CommentReactionData extends Message<CommentReactionData, C49978a> {
        public static final ProtoAdapter<CommentReactionData> ADAPTER = new C49979b();
        private static final long serialVersionUID = 0;
        public final String maction_type;
        public final String mcomment_id;
        public final String mpost_id;
        public final String mreaction_user_id;
        public final MomentUser.Type muser_type;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$CommentReactionData$b */
        private static final class C49979b extends ProtoAdapter<CommentReactionData> {
            C49979b() {
                super(FieldEncoding.LENGTH_DELIMITED, CommentReactionData.class);
            }

            /* renamed from: a */
            public int encodedSize(CommentReactionData commentReactionData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (commentReactionData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, commentReactionData.mpost_id);
                } else {
                    i = 0;
                }
                if (commentReactionData.mcomment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, commentReactionData.mcomment_id);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (commentReactionData.maction_type != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, commentReactionData.maction_type);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (commentReactionData.mreaction_user_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, commentReactionData.mreaction_user_id);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (commentReactionData.muser_type != null) {
                    i5 = MomentUser.Type.ADAPTER.encodedSizeWithTag(5, commentReactionData.muser_type);
                }
                return i8 + i5 + commentReactionData.unknownFields().size();
            }

            /* renamed from: a */
            public CommentReactionData decode(ProtoReader protoReader) throws IOException {
                C49978a aVar = new C49978a();
                aVar.f124996a = "";
                aVar.f124997b = "";
                aVar.f124998c = "";
                aVar.f124999d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124996a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124997b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f124998c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f124999d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125000e = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CommentReactionData commentReactionData) throws IOException {
                if (commentReactionData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commentReactionData.mpost_id);
                }
                if (commentReactionData.mcomment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commentReactionData.mcomment_id);
                }
                if (commentReactionData.maction_type != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commentReactionData.maction_type);
                }
                if (commentReactionData.mreaction_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commentReactionData.mreaction_user_id);
                }
                if (commentReactionData.muser_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 5, commentReactionData.muser_type);
                }
                protoWriter.writeBytes(commentReactionData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$CommentReactionData$a */
        public static final class C49978a extends Message.Builder<CommentReactionData, C49978a> {

            /* renamed from: a */
            public String f124996a;

            /* renamed from: b */
            public String f124997b;

            /* renamed from: c */
            public String f124998c;

            /* renamed from: d */
            public String f124999d;

            /* renamed from: e */
            public MomentUser.Type f125000e;

            /* renamed from: a */
            public CommentReactionData build() {
                return new CommentReactionData(this.f124996a, this.f124997b, this.f124998c, this.f124999d, this.f125000e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49978a newBuilder() {
            C49978a aVar = new C49978a();
            aVar.f124996a = this.mpost_id;
            aVar.f124997b = this.mcomment_id;
            aVar.f124998c = this.maction_type;
            aVar.f124999d = this.mreaction_user_id;
            aVar.f125000e = this.muser_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            if (this.mcomment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.mcomment_id);
            }
            if (this.maction_type != null) {
                sb.append(", action_type=");
                sb.append(this.maction_type);
            }
            if (this.mreaction_user_id != null) {
                sb.append(", reaction_user_id=");
                sb.append(this.mreaction_user_id);
            }
            if (this.muser_type != null) {
                sb.append(", user_type=");
                sb.append(this.muser_type);
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
            this.mpost_id = str;
            this.mcomment_id = str2;
            this.maction_type = str3;
            this.mreaction_user_id = str4;
            this.muser_type = type;
        }
    }

    public static final class FollowerData extends Message<FollowerData, C49980a> {
        public static final ProtoAdapter<FollowerData> ADAPTER = new C49981b();
        private static final long serialVersionUID = 0;
        public final String mfollower_id;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$FollowerData$b */
        private static final class C49981b extends ProtoAdapter<FollowerData> {
            C49981b() {
                super(FieldEncoding.LENGTH_DELIMITED, FollowerData.class);
            }

            /* renamed from: a */
            public int encodedSize(FollowerData followerData) {
                int i;
                if (followerData.mfollower_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, followerData.mfollower_id);
                } else {
                    i = 0;
                }
                return i + followerData.unknownFields().size();
            }

            /* renamed from: a */
            public FollowerData decode(ProtoReader protoReader) throws IOException {
                C49980a aVar = new C49980a();
                aVar.f125001a = "";
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
                        aVar.f125001a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FollowerData followerData) throws IOException {
                if (followerData.mfollower_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followerData.mfollower_id);
                }
                protoWriter.writeBytes(followerData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$FollowerData$a */
        public static final class C49980a extends Message.Builder<FollowerData, C49980a> {

            /* renamed from: a */
            public String f125001a;

            /* renamed from: a */
            public FollowerData build() {
                return new FollowerData(this.f125001a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49980a newBuilder() {
            C49980a aVar = new C49980a();
            aVar.f125001a = this.mfollower_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mfollower_id != null) {
                sb.append(", follower_id=");
                sb.append(this.mfollower_id);
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
            this.mfollower_id = str;
        }
    }

    public static final class PostReactionData extends Message<PostReactionData, C49982a> {
        public static final ProtoAdapter<PostReactionData> ADAPTER = new C49983b();
        private static final long serialVersionUID = 0;
        public final String maction_type;
        public final String mpost_id;
        public final String mreaction_user_id;
        public final MomentUser.Type muser_type;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$PostReactionData$b */
        private static final class C49983b extends ProtoAdapter<PostReactionData> {
            C49983b() {
                super(FieldEncoding.LENGTH_DELIMITED, PostReactionData.class);
            }

            /* renamed from: a */
            public int encodedSize(PostReactionData postReactionData) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (postReactionData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, postReactionData.mpost_id);
                } else {
                    i = 0;
                }
                if (postReactionData.maction_type != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, postReactionData.maction_type);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (postReactionData.mreaction_user_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, postReactionData.mreaction_user_id);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (postReactionData.muser_type != null) {
                    i4 = MomentUser.Type.ADAPTER.encodedSizeWithTag(4, postReactionData.muser_type);
                }
                return i6 + i4 + postReactionData.unknownFields().size();
            }

            /* renamed from: a */
            public PostReactionData decode(ProtoReader protoReader) throws IOException {
                C49982a aVar = new C49982a();
                aVar.f125002a = "";
                aVar.f125003b = "";
                aVar.f125004c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125002a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125003b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f125004c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125005d = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PostReactionData postReactionData) throws IOException {
                if (postReactionData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, postReactionData.mpost_id);
                }
                if (postReactionData.maction_type != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, postReactionData.maction_type);
                }
                if (postReactionData.mreaction_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, postReactionData.mreaction_user_id);
                }
                if (postReactionData.muser_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 4, postReactionData.muser_type);
                }
                protoWriter.writeBytes(postReactionData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$PostReactionData$a */
        public static final class C49982a extends Message.Builder<PostReactionData, C49982a> {

            /* renamed from: a */
            public String f125002a;

            /* renamed from: b */
            public String f125003b;

            /* renamed from: c */
            public String f125004c;

            /* renamed from: d */
            public MomentUser.Type f125005d;

            /* renamed from: a */
            public PostReactionData build() {
                return new PostReactionData(this.f125002a, this.f125003b, this.f125004c, this.f125005d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49982a newBuilder() {
            C49982a aVar = new C49982a();
            aVar.f125002a = this.mpost_id;
            aVar.f125003b = this.maction_type;
            aVar.f125004c = this.mreaction_user_id;
            aVar.f125005d = this.muser_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            if (this.maction_type != null) {
                sb.append(", action_type=");
                sb.append(this.maction_type);
            }
            if (this.mreaction_user_id != null) {
                sb.append(", reaction_user_id=");
                sb.append(this.mreaction_user_id);
            }
            if (this.muser_type != null) {
                sb.append(", user_type=");
                sb.append(this.muser_type);
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
            this.mpost_id = str;
            this.maction_type = str2;
            this.mreaction_user_id = str3;
            this.muser_type = type;
        }
    }

    public static final class ReplyData extends Message<ReplyData, C49984a> {
        public static final ProtoAdapter<ReplyData> ADAPTER = new C49985b();
        private static final long serialVersionUID = 0;
        public final String mcomment_id;
        public final String mpost_id;
        public final String mreply_comment_id;
        public final String muser_id;
        public final MomentUser.Type muser_type;

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$ReplyData$b */
        private static final class C49985b extends ProtoAdapter<ReplyData> {
            C49985b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReplyData.class);
            }

            /* renamed from: a */
            public int encodedSize(ReplyData replyData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (replyData.mpost_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, replyData.mpost_id);
                } else {
                    i = 0;
                }
                if (replyData.mcomment_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, replyData.mcomment_id);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (replyData.muser_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, replyData.muser_id);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (replyData.mreply_comment_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, replyData.mreply_comment_id);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (replyData.muser_type != null) {
                    i5 = MomentUser.Type.ADAPTER.encodedSizeWithTag(5, replyData.muser_type);
                }
                return i8 + i5 + replyData.unknownFields().size();
            }

            /* renamed from: a */
            public ReplyData decode(ProtoReader protoReader) throws IOException {
                C49984a aVar = new C49984a();
                aVar.f125006a = "";
                aVar.f125007b = "";
                aVar.f125008c = "";
                aVar.f125009d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125006a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125007b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f125008c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f125009d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125010e = MomentUser.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReplyData replyData) throws IOException {
                if (replyData.mpost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, replyData.mpost_id);
                }
                if (replyData.mcomment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, replyData.mcomment_id);
                }
                if (replyData.muser_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, replyData.muser_id);
                }
                if (replyData.mreply_comment_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, replyData.mreply_comment_id);
                }
                if (replyData.muser_type != null) {
                    MomentUser.Type.ADAPTER.encodeWithTag(protoWriter, 5, replyData.muser_type);
                }
                protoWriter.writeBytes(replyData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$ReplyData$a */
        public static final class C49984a extends Message.Builder<ReplyData, C49984a> {

            /* renamed from: a */
            public String f125006a;

            /* renamed from: b */
            public String f125007b;

            /* renamed from: c */
            public String f125008c;

            /* renamed from: d */
            public String f125009d;

            /* renamed from: e */
            public MomentUser.Type f125010e;

            /* renamed from: a */
            public ReplyData build() {
                return new ReplyData(this.f125006a, this.f125007b, this.f125008c, this.f125009d, this.f125010e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49984a newBuilder() {
            C49984a aVar = new C49984a();
            aVar.f125006a = this.mpost_id;
            aVar.f125007b = this.mcomment_id;
            aVar.f125008c = this.muser_id;
            aVar.f125009d = this.mreply_comment_id;
            aVar.f125010e = this.muser_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mpost_id != null) {
                sb.append(", post_id=");
                sb.append(this.mpost_id);
            }
            if (this.mcomment_id != null) {
                sb.append(", comment_id=");
                sb.append(this.mcomment_id);
            }
            if (this.muser_id != null) {
                sb.append(", user_id=");
                sb.append(this.muser_id);
            }
            if (this.mreply_comment_id != null) {
                sb.append(", reply_comment_id=");
                sb.append(this.mreply_comment_id);
            }
            if (this.muser_type != null) {
                sb.append(", user_type=");
                sb.append(this.muser_type);
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
            this.mpost_id = str;
            this.mcomment_id = str2;
            this.muser_id = str3;
            this.mreply_comment_id = str4;
            this.muser_type = type;
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$b */
    private static final class C49987b extends ProtoAdapter<Notification> {
        C49987b() {
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
            if (notification.mcreate_time_msec != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, notification.mcreate_time_msec);
            } else {
                i = 0;
            }
            if (notification.mid != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, notification.mid);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (notification.mcircle_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, notification.mcircle_id);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (notification.mtype != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(4, notification.mtype);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (notification.mis_unread != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, notification.mis_unread);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (notification.mfollower_data != null) {
                i6 = FollowerData.ADAPTER.encodedSizeWithTag(101, notification.mfollower_data);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (notification.mpost_reaction_data != null) {
                i7 = PostReactionData.ADAPTER.encodedSizeWithTag(102, notification.mpost_reaction_data);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (notification.mcomment_reaction_data != null) {
                i8 = CommentReactionData.ADAPTER.encodedSizeWithTag(103, notification.mcomment_reaction_data);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (notification.mcomment_data != null) {
                i9 = CommentData.ADAPTER.encodedSizeWithTag(104, notification.mcomment_data);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (notification.mreply_data != null) {
                i10 = ReplyData.ADAPTER.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, notification.mreply_data);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (notification.mat_in_post_data != null) {
                i11 = AtInPostData.ADAPTER.encodedSizeWithTag(106, notification.mat_in_post_data);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (notification.mat_in_comment_data != null) {
                i12 = AtInCommentData.ADAPTER.encodedSizeWithTag(ActivityIdentificationData.WALKING, notification.mat_in_comment_data);
            }
            return i22 + i12 + notification.unknownFields().size();
        }

        /* renamed from: a */
        public Notification decode(ProtoReader protoReader) throws IOException {
            C49986a aVar = new C49986a();
            aVar.f125011a = 0L;
            aVar.f125012b = "";
            aVar.f125013c = "";
            aVar.f125015e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125011a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125012b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125013c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f125014d = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    switch (nextTag) {
                        case 101:
                            aVar.f125016f = FollowerData.ADAPTER.decode(protoReader);
                            continue;
                        case 102:
                            aVar.f125017g = PostReactionData.ADAPTER.decode(protoReader);
                            continue;
                        case 103:
                            aVar.f125018h = CommentReactionData.ADAPTER.decode(protoReader);
                            continue;
                        case 104:
                            aVar.f125019i = CommentData.ADAPTER.decode(protoReader);
                            continue;
                        case LocationRequest.PRIORITY_NO_POWER:
                            aVar.f125020j = ReplyData.ADAPTER.decode(protoReader);
                            continue;
                        case 106:
                            aVar.f125021k = AtInPostData.ADAPTER.decode(protoReader);
                            continue;
                        case ActivityIdentificationData.WALKING:
                            aVar.f125022l = AtInCommentData.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f125015e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Notification notification) throws IOException {
            if (notification.mcreate_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, notification.mcreate_time_msec);
            }
            if (notification.mid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, notification.mid);
            }
            if (notification.mcircle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, notification.mcircle_id);
            }
            if (notification.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 4, notification.mtype);
            }
            if (notification.mis_unread != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, notification.mis_unread);
            }
            if (notification.mfollower_data != null) {
                FollowerData.ADAPTER.encodeWithTag(protoWriter, 101, notification.mfollower_data);
            }
            if (notification.mpost_reaction_data != null) {
                PostReactionData.ADAPTER.encodeWithTag(protoWriter, 102, notification.mpost_reaction_data);
            }
            if (notification.mcomment_reaction_data != null) {
                CommentReactionData.ADAPTER.encodeWithTag(protoWriter, 103, notification.mcomment_reaction_data);
            }
            if (notification.mcomment_data != null) {
                CommentData.ADAPTER.encodeWithTag(protoWriter, 104, notification.mcomment_data);
            }
            if (notification.mreply_data != null) {
                ReplyData.ADAPTER.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, notification.mreply_data);
            }
            if (notification.mat_in_post_data != null) {
                AtInPostData.ADAPTER.encodeWithTag(protoWriter, 106, notification.mat_in_post_data);
            }
            if (notification.mat_in_comment_data != null) {
                AtInCommentData.ADAPTER.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, notification.mat_in_comment_data);
            }
            protoWriter.writeBytes(notification.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.Notification$a */
    public static final class C49986a extends Message.Builder<Notification, C49986a> {

        /* renamed from: a */
        public Long f125011a;

        /* renamed from: b */
        public String f125012b;

        /* renamed from: c */
        public String f125013c;

        /* renamed from: d */
        public Type f125014d;

        /* renamed from: e */
        public Boolean f125015e;

        /* renamed from: f */
        public FollowerData f125016f;

        /* renamed from: g */
        public PostReactionData f125017g;

        /* renamed from: h */
        public CommentReactionData f125018h;

        /* renamed from: i */
        public CommentData f125019i;

        /* renamed from: j */
        public ReplyData f125020j;

        /* renamed from: k */
        public AtInPostData f125021k;

        /* renamed from: l */
        public AtInCommentData f125022l;

        /* renamed from: a */
        public Notification build() {
            return new Notification(this.f125011a, this.f125012b, this.f125013c, this.f125014d, this.f125015e, this.f125016f, this.f125017g, this.f125018h, this.f125019i, this.f125020j, this.f125021k, this.f125022l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49986a newBuilder() {
        C49986a aVar = new C49986a();
        aVar.f125011a = this.mcreate_time_msec;
        aVar.f125012b = this.mid;
        aVar.f125013c = this.mcircle_id;
        aVar.f125014d = this.mtype;
        aVar.f125015e = this.mis_unread;
        aVar.f125016f = this.mfollower_data;
        aVar.f125017g = this.mpost_reaction_data;
        aVar.f125018h = this.mcomment_reaction_data;
        aVar.f125019i = this.mcomment_data;
        aVar.f125020j = this.mreply_data;
        aVar.f125021k = this.mat_in_post_data;
        aVar.f125022l = this.mat_in_comment_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcreate_time_msec != null) {
            sb.append(", create_time_msec=");
            sb.append(this.mcreate_time_msec);
        }
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.mcircle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.mcircle_id);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mis_unread != null) {
            sb.append(", is_unread=");
            sb.append(this.mis_unread);
        }
        if (this.mfollower_data != null) {
            sb.append(", follower_data=");
            sb.append(this.mfollower_data);
        }
        if (this.mpost_reaction_data != null) {
            sb.append(", post_reaction_data=");
            sb.append(this.mpost_reaction_data);
        }
        if (this.mcomment_reaction_data != null) {
            sb.append(", comment_reaction_data=");
            sb.append(this.mcomment_reaction_data);
        }
        if (this.mcomment_data != null) {
            sb.append(", comment_data=");
            sb.append(this.mcomment_data);
        }
        if (this.mreply_data != null) {
            sb.append(", reply_data=");
            sb.append(this.mreply_data);
        }
        if (this.mat_in_post_data != null) {
            sb.append(", at_in_post_data=");
            sb.append(this.mat_in_post_data);
        }
        if (this.mat_in_comment_data != null) {
            sb.append(", at_in_comment_data=");
            sb.append(this.mat_in_comment_data);
        }
        StringBuilder replace = sb.replace(0, 2, "Notification{");
        replace.append('}');
        return replace.toString();
    }

    public Notification(Long l, String str, String str2, Type type, Boolean bool, FollowerData followerData, PostReactionData postReactionData, CommentReactionData commentReactionData, CommentData commentData, ReplyData replyData, AtInPostData atInPostData, AtInCommentData atInCommentData) {
        this(l, str, str2, type, bool, followerData, postReactionData, commentReactionData, commentData, replyData, atInPostData, atInCommentData, ByteString.EMPTY);
    }

    public Notification(Long l, String str, String str2, Type type, Boolean bool, FollowerData followerData, PostReactionData postReactionData, CommentReactionData commentReactionData, CommentData commentData, ReplyData replyData, AtInPostData atInPostData, AtInCommentData atInCommentData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcreate_time_msec = l;
        this.mid = str;
        this.mcircle_id = str2;
        this.mtype = type;
        this.mis_unread = bool;
        this.mfollower_data = followerData;
        this.mpost_reaction_data = postReactionData;
        this.mcomment_reaction_data = commentReactionData;
        this.mcomment_data = commentData;
        this.mreply_data = replyData;
        this.mat_in_post_data = atInPostData;
        this.mat_in_comment_data = atInCommentData;
    }
}
