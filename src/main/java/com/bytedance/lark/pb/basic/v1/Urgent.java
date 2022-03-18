package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Urgent extends Message<Urgent, C15422a> {
    public static final ProtoAdapter<Urgent> ADAPTER = new C15423b();
    public static final Long DEFAULT_SEND_TIME = 0L;
    public static final Status DEFAULT_STATUS = Status.ME_CREATE;
    public static final Type DEFAULT_TYPE = Type.APP;
    private static final long serialVersionUID = 0;
    public final String ack_chatter_id;
    public final String id;
    public final String message_id;
    public final Long send_time;
    public final Status status;
    public final Type type;

    public enum Status implements WireEnum {
        ME_CREATE(1),
        ME_ACK(2),
        URGENT_ME(3),
        ACK_ME(4);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return ME_CREATE;
            }
            if (i == 2) {
                return ME_ACK;
            }
            if (i == 3) {
                return URGENT_ME;
            }
            if (i != 4) {
                return null;
            }
            return ACK_ME;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        APP(1),
        SMS(2),
        PHONE(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return APP;
            }
            if (i == 2) {
                return SMS;
            }
            if (i != 3) {
                return null;
            }
            return PHONE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Urgent$b */
    private static final class C15423b extends ProtoAdapter<Urgent> {
        C15423b() {
            super(FieldEncoding.LENGTH_DELIMITED, Urgent.class);
        }

        /* renamed from: a */
        public int encodedSize(Urgent urgent) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, urgent.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, urgent.message_id);
            int i4 = 0;
            if (urgent.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(3, urgent.type);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (urgent.send_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, urgent.send_time);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (urgent.status != null) {
                i3 = Status.ADAPTER.encodedSizeWithTag(5, urgent.status);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (urgent.ack_chatter_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, urgent.ack_chatter_id);
            }
            return i7 + i4 + urgent.unknownFields().size();
        }

        /* renamed from: a */
        public Urgent decode(ProtoReader protoReader) throws IOException {
            C15422a aVar = new C15422a();
            aVar.f40807a = "";
            aVar.f40808b = "";
            aVar.f40809c = Type.APP;
            aVar.f40810d = 0L;
            aVar.f40811e = Status.ME_CREATE;
            aVar.f40812f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40807a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40808b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f40809c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f40810d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f40811e = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f40812f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Urgent urgent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urgent.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, urgent.message_id);
            if (urgent.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, urgent.type);
            }
            if (urgent.send_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, urgent.send_time);
            }
            if (urgent.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 5, urgent.status);
            }
            if (urgent.ack_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, urgent.ack_chatter_id);
            }
            protoWriter.writeBytes(urgent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Urgent$a */
    public static final class C15422a extends Message.Builder<Urgent, C15422a> {

        /* renamed from: a */
        public String f40807a;

        /* renamed from: b */
        public String f40808b;

        /* renamed from: c */
        public Type f40809c;

        /* renamed from: d */
        public Long f40810d;

        /* renamed from: e */
        public Status f40811e;

        /* renamed from: f */
        public String f40812f;

        /* renamed from: a */
        public Urgent build() {
            String str;
            String str2 = this.f40807a;
            if (str2 != null && (str = this.f40808b) != null) {
                return new Urgent(str2, str, this.f40809c, this.f40810d, this.f40811e, this.f40812f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f40808b, "message_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15422a newBuilder() {
        C15422a aVar = new C15422a();
        aVar.f40807a = this.id;
        aVar.f40808b = this.message_id;
        aVar.f40809c = this.type;
        aVar.f40810d = this.send_time;
        aVar.f40811e = this.status;
        aVar.f40812f = this.ack_chatter_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Urgent");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.send_time != null) {
            sb.append(", send_time=");
            sb.append(this.send_time);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.ack_chatter_id != null) {
            sb.append(", ack_chatter_id=");
            sb.append(this.ack_chatter_id);
        }
        StringBuilder replace = sb.replace(0, 2, "Urgent{");
        replace.append('}');
        return replace.toString();
    }

    public Urgent(String str, String str2, Type type2, Long l, Status status2, String str3) {
        this(str, str2, type2, l, status2, str3, ByteString.EMPTY);
    }

    public Urgent(String str, String str2, Type type2, Long l, Status status2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.message_id = str2;
        this.type = type2;
        this.send_time = l;
        this.status = status2;
        this.ack_chatter_id = str3;
    }
}
