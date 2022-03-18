package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatApplication extends Message<ChatApplication, C14777a> {
    public static final ProtoAdapter<ChatApplication> ADAPTER = new C14778b();
    public static final Long DEFAULT_APPLY_TIME = 0L;
    public static final Boolean DEFAULT_IS_READ = false;
    public static final Long DEFAULT_PROCESSED_TIME = 0L;
    public static final Status DEFAULT_STATUS = Status.UNKNOWN_STATUS;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Long apply_time;
    public final String chat_id;
    public final ContactSummary contact_summary;
    public final String extra_message;
    public final String id;
    public final Boolean is_read;
    public final Long processed_time;
    public final Status status;
    public final Type type;

    public enum Status implements WireEnum {
        UNKNOWN_STATUS(0),
        PENDING(1),
        AGREED(2),
        REFUSED(3),
        DELETED(4),
        EXPIRED(5);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return PENDING;
            }
            if (i == 2) {
                return AGREED;
            }
            if (i == 3) {
                return REFUSED;
            }
            if (i == 4) {
                return DELETED;
            }
            if (i != 5) {
                return null;
            }
            return EXPIRED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        FRIEND(1),
        JOIN_CHAT(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return FRIEND;
            }
            if (i != 2) {
                return null;
            }
            return JOIN_CHAT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatApplication$b */
    private static final class C14778b extends ProtoAdapter<ChatApplication> {
        C14778b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatApplication.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatApplication chatApplication) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (chatApplication.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatApplication.id);
            } else {
                i = 0;
            }
            if (chatApplication.type != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, chatApplication.type);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (chatApplication.chat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatApplication.chat_id);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (chatApplication.contact_summary != null) {
                i4 = ContactSummary.ADAPTER.encodedSizeWithTag(4, chatApplication.contact_summary);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (chatApplication.apply_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, chatApplication.apply_time);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (chatApplication.processed_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, chatApplication.processed_time);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (chatApplication.status != null) {
                i7 = Status.ADAPTER.encodedSizeWithTag(7, chatApplication.status);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (chatApplication.is_read != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, chatApplication.is_read);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (chatApplication.extra_message != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, chatApplication.extra_message);
            }
            return i16 + i9 + chatApplication.unknownFields().size();
        }

        /* renamed from: a */
        public ChatApplication decode(ProtoReader protoReader) throws IOException {
            C14777a aVar = new C14777a();
            aVar.f39051a = "";
            aVar.f39052b = Type.UNKNOWN_TYPE;
            aVar.f39053c = "";
            aVar.f39055e = 0L;
            aVar.f39056f = 0L;
            aVar.f39057g = Status.UNKNOWN_STATUS;
            aVar.f39058h = false;
            aVar.f39059i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39051a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f39052b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f39053c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39054d = ContactSummary.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39055e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39056f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f39057g = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f39058h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39059i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatApplication chatApplication) throws IOException {
            if (chatApplication.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatApplication.id);
            }
            if (chatApplication.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, chatApplication.type);
            }
            if (chatApplication.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatApplication.chat_id);
            }
            if (chatApplication.contact_summary != null) {
                ContactSummary.ADAPTER.encodeWithTag(protoWriter, 4, chatApplication.contact_summary);
            }
            if (chatApplication.apply_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, chatApplication.apply_time);
            }
            if (chatApplication.processed_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, chatApplication.processed_time);
            }
            if (chatApplication.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 7, chatApplication.status);
            }
            if (chatApplication.is_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, chatApplication.is_read);
            }
            if (chatApplication.extra_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, chatApplication.extra_message);
            }
            protoWriter.writeBytes(chatApplication.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatApplication$a */
    public static final class C14777a extends Message.Builder<ChatApplication, C14777a> {

        /* renamed from: a */
        public String f39051a;

        /* renamed from: b */
        public Type f39052b;

        /* renamed from: c */
        public String f39053c;

        /* renamed from: d */
        public ContactSummary f39054d;

        /* renamed from: e */
        public Long f39055e;

        /* renamed from: f */
        public Long f39056f;

        /* renamed from: g */
        public Status f39057g;

        /* renamed from: h */
        public Boolean f39058h;

        /* renamed from: i */
        public String f39059i;

        /* renamed from: a */
        public ChatApplication build() {
            return new ChatApplication(this.f39051a, this.f39052b, this.f39053c, this.f39054d, this.f39055e, this.f39056f, this.f39057g, this.f39058h, this.f39059i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14777a newBuilder() {
        C14777a aVar = new C14777a();
        aVar.f39051a = this.id;
        aVar.f39052b = this.type;
        aVar.f39053c = this.chat_id;
        aVar.f39054d = this.contact_summary;
        aVar.f39055e = this.apply_time;
        aVar.f39056f = this.processed_time;
        aVar.f39057g = this.status;
        aVar.f39058h = this.is_read;
        aVar.f39059i = this.extra_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChatApplication");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.contact_summary != null) {
            sb.append(", contact_summary=");
            sb.append(this.contact_summary);
        }
        if (this.apply_time != null) {
            sb.append(", apply_time=");
            sb.append(this.apply_time);
        }
        if (this.processed_time != null) {
            sb.append(", processed_time=");
            sb.append(this.processed_time);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.is_read != null) {
            sb.append(", is_read=");
            sb.append(this.is_read);
        }
        if (this.extra_message != null) {
            sb.append(", extra_message=");
            sb.append(this.extra_message);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatApplication{");
        replace.append('}');
        return replace.toString();
    }

    public ChatApplication(String str, Type type2, String str2, ContactSummary contactSummary, Long l, Long l2, Status status2, Boolean bool, String str3) {
        this(str, type2, str2, contactSummary, l, l2, status2, bool, str3, ByteString.EMPTY);
    }

    public ChatApplication(String str, Type type2, String str2, ContactSummary contactSummary, Long l, Long l2, Status status2, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.chat_id = str2;
        this.contact_summary = contactSummary;
        this.apply_time = l;
        this.processed_time = l2;
        this.status = status2;
        this.is_read = bool;
        this.extra_message = str3;
    }
}
