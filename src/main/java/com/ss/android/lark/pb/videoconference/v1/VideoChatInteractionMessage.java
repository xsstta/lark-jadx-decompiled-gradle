package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatInteractionMessage extends Message<VideoChatInteractionMessage, C51248a> {
    public static final ProtoAdapter<VideoChatInteractionMessage> ADAPTER = new C51249b();
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_TENANT_ID = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final String create_milli_time;
    public final VideoChatParticipant from_user;
    public final String id;
    public final String meeting_id;
    public final Integer position;
    public final ReactionMessageContent reaction_content;
    public final SystemMessageContent system_content;
    public final List<Tag> tags;
    public final Long tenant_id;
    public final TextMessageContent text_content;
    public final Type type;

    public enum Tag implements WireEnum {
        GUEST(1);
        
        public static final ProtoAdapter<Tag> ADAPTER = ProtoAdapter.newEnumAdapter(Tag.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Tag fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return GUEST;
        }

        private Tag(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        SYSTEM(2),
        REACTION(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TEXT;
            }
            if (i == 2) {
                return SYSTEM;
            }
            if (i != 3) {
                return null;
            }
            return REACTION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatInteractionMessage$b */
    private static final class C51249b extends ProtoAdapter<VideoChatInteractionMessage> {
        C51249b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatInteractionMessage.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatInteractionMessage videoChatInteractionMessage) {
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
            int i11 = 0;
            if (videoChatInteractionMessage.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatInteractionMessage.id);
            } else {
                i = 0;
            }
            if (videoChatInteractionMessage.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, videoChatInteractionMessage.type);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (videoChatInteractionMessage.from_user != null) {
                i3 = VideoChatParticipant.ADAPTER.encodedSizeWithTag(3, videoChatInteractionMessage.from_user);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (videoChatInteractionMessage.cid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoChatInteractionMessage.cid);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (videoChatInteractionMessage.position != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, videoChatInteractionMessage.position);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (videoChatInteractionMessage.create_milli_time != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, videoChatInteractionMessage.create_milli_time);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (videoChatInteractionMessage.meeting_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, videoChatInteractionMessage.meeting_id);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag = i16 + i7 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(10, videoChatInteractionMessage.tags);
            if (videoChatInteractionMessage.tenant_id != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(11, videoChatInteractionMessage.tenant_id);
            } else {
                i8 = 0;
            }
            int i17 = encodedSizeWithTag + i8;
            if (videoChatInteractionMessage.reaction_content != null) {
                i9 = ReactionMessageContent.ADAPTER.encodedSizeWithTag(101, videoChatInteractionMessage.reaction_content);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (videoChatInteractionMessage.text_content != null) {
                i10 = TextMessageContent.ADAPTER.encodedSizeWithTag(102, videoChatInteractionMessage.text_content);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (videoChatInteractionMessage.system_content != null) {
                i11 = SystemMessageContent.ADAPTER.encodedSizeWithTag(103, videoChatInteractionMessage.system_content);
            }
            return i19 + i11 + videoChatInteractionMessage.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatInteractionMessage decode(ProtoReader protoReader) throws IOException {
            C51248a aVar = new C51248a();
            aVar.f127619a = "";
            aVar.f127620b = Type.UNKNOWN;
            aVar.f127622d = "";
            aVar.f127623e = 0;
            aVar.f127624f = "";
            aVar.f127625g = "";
            aVar.f127627i = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 10) {
                    try {
                        aVar.f127626h.add(Tag.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 11) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127619a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f127620b = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f127621c = VideoChatParticipant.ADAPTER.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f127622d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f127623e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f127624f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f127625g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 101:
                                    aVar.mo176703a(ReactionMessageContent.ADAPTER.decode(protoReader));
                                    continue;
                                case 102:
                                    aVar.mo176705a(TextMessageContent.ADAPTER.decode(protoReader));
                                    continue;
                                case 103:
                                    aVar.mo176704a(SystemMessageContent.ADAPTER.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f127627i = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatInteractionMessage videoChatInteractionMessage) throws IOException {
            if (videoChatInteractionMessage.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatInteractionMessage.id);
            }
            if (videoChatInteractionMessage.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, videoChatInteractionMessage.type);
            }
            if (videoChatInteractionMessage.from_user != null) {
                VideoChatParticipant.ADAPTER.encodeWithTag(protoWriter, 3, videoChatInteractionMessage.from_user);
            }
            if (videoChatInteractionMessage.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoChatInteractionMessage.cid);
            }
            if (videoChatInteractionMessage.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, videoChatInteractionMessage.position);
            }
            if (videoChatInteractionMessage.create_milli_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, videoChatInteractionMessage.create_milli_time);
            }
            if (videoChatInteractionMessage.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoChatInteractionMessage.meeting_id);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, videoChatInteractionMessage.tags);
            if (videoChatInteractionMessage.tenant_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, videoChatInteractionMessage.tenant_id);
            }
            if (videoChatInteractionMessage.reaction_content != null) {
                ReactionMessageContent.ADAPTER.encodeWithTag(protoWriter, 101, videoChatInteractionMessage.reaction_content);
            }
            if (videoChatInteractionMessage.text_content != null) {
                TextMessageContent.ADAPTER.encodeWithTag(protoWriter, 102, videoChatInteractionMessage.text_content);
            }
            if (videoChatInteractionMessage.system_content != null) {
                SystemMessageContent.ADAPTER.encodeWithTag(protoWriter, 103, videoChatInteractionMessage.system_content);
            }
            protoWriter.writeBytes(videoChatInteractionMessage.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatInteractionMessage$a */
    public static final class C51248a extends Message.Builder<VideoChatInteractionMessage, C51248a> {

        /* renamed from: a */
        public String f127619a;

        /* renamed from: b */
        public Type f127620b;

        /* renamed from: c */
        public VideoChatParticipant f127621c;

        /* renamed from: d */
        public String f127622d;

        /* renamed from: e */
        public Integer f127623e;

        /* renamed from: f */
        public String f127624f;

        /* renamed from: g */
        public String f127625g;

        /* renamed from: h */
        public List<Tag> f127626h = Internal.newMutableList();

        /* renamed from: i */
        public Long f127627i;

        /* renamed from: j */
        public ReactionMessageContent f127628j;

        /* renamed from: k */
        public TextMessageContent f127629k;

        /* renamed from: l */
        public SystemMessageContent f127630l;

        /* renamed from: a */
        public VideoChatInteractionMessage build() {
            return new VideoChatInteractionMessage(this.f127619a, this.f127620b, this.f127621c, this.f127622d, this.f127623e, this.f127624f, this.f127625g, this.f127626h, this.f127627i, this.f127628j, this.f127629k, this.f127630l, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51248a mo176703a(ReactionMessageContent reactionMessageContent) {
            this.f127628j = reactionMessageContent;
            this.f127629k = null;
            this.f127630l = null;
            return this;
        }

        /* renamed from: a */
        public C51248a mo176704a(SystemMessageContent systemMessageContent) {
            this.f127630l = systemMessageContent;
            this.f127628j = null;
            this.f127629k = null;
            return this;
        }

        /* renamed from: a */
        public C51248a mo176705a(TextMessageContent textMessageContent) {
            this.f127629k = textMessageContent;
            this.f127628j = null;
            this.f127630l = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51248a newBuilder() {
        C51248a aVar = new C51248a();
        aVar.f127619a = this.id;
        aVar.f127620b = this.type;
        aVar.f127621c = this.from_user;
        aVar.f127622d = this.cid;
        aVar.f127623e = this.position;
        aVar.f127624f = this.create_milli_time;
        aVar.f127625g = this.meeting_id;
        aVar.f127626h = Internal.copyOf("tags", this.tags);
        aVar.f127627i = this.tenant_id;
        aVar.f127628j = this.reaction_content;
        aVar.f127629k = this.text_content;
        aVar.f127630l = this.system_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatInteractionMessage");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.from_user != null) {
            sb.append(", from_user=");
            sb.append(this.from_user);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.create_milli_time != null) {
            sb.append(", create_milli_time=");
            sb.append(this.create_milli_time);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.reaction_content != null) {
            sb.append(", reaction_content=");
            sb.append(this.reaction_content);
        }
        if (this.text_content != null) {
            sb.append(", text_content=");
            sb.append(this.text_content);
        }
        if (this.system_content != null) {
            sb.append(", system_content=");
            sb.append(this.system_content);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatInteractionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatInteractionMessage(String str, Type type2, VideoChatParticipant videoChatParticipant, String str2, Integer num, String str3, String str4, List<Tag> list, Long l, ReactionMessageContent reactionMessageContent, TextMessageContent textMessageContent, SystemMessageContent systemMessageContent) {
        this(str, type2, videoChatParticipant, str2, num, str3, str4, list, l, reactionMessageContent, textMessageContent, systemMessageContent, ByteString.EMPTY);
    }

    public VideoChatInteractionMessage(String str, Type type2, VideoChatParticipant videoChatParticipant, String str2, Integer num, String str3, String str4, List<Tag> list, Long l, ReactionMessageContent reactionMessageContent, TextMessageContent textMessageContent, SystemMessageContent systemMessageContent, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(reactionMessageContent, textMessageContent, systemMessageContent) <= 1) {
            this.id = str;
            this.type = type2;
            this.from_user = videoChatParticipant;
            this.cid = str2;
            this.position = num;
            this.create_milli_time = str3;
            this.meeting_id = str4;
            this.tags = Internal.immutableCopyOf("tags", list);
            this.tenant_id = l;
            this.reaction_content = reactionMessageContent;
            this.text_content = textMessageContent;
            this.system_content = systemMessageContent;
            return;
        }
        throw new IllegalArgumentException("at most one of reaction_content, text_content, system_content may be non-null");
    }
}
