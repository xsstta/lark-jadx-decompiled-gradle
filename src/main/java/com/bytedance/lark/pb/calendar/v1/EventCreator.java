package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class EventCreator extends Message<EventCreator, C15608a> {
    public static final ProtoAdapter<EventCreator> ADAPTER = new C15609b();
    public static final Boolean DEFAULT_HAS_RESIGNED = false;
    public static final Type DEFAULT_TYPE = Type.CHATTER;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String avatar_url;
    public final String chatter_id;
    public final String department;
    public final Boolean has_resigned;
    public final String name;
    public final Type type;

    public enum Type implements WireEnum {
        CHATTER(1),
        GOOGLE(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return CHATTER;
            }
            if (i != 2) {
                return null;
            }
            return GOOGLE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventCreator$b */
    private static final class C15609b extends ProtoAdapter<EventCreator> {
        C15609b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventCreator.class);
        }

        /* renamed from: a */
        public int encodedSize(EventCreator eventCreator) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (eventCreator.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, eventCreator.type);
            } else {
                i = 0;
            }
            if (eventCreator.chatter_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eventCreator.chatter_id);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (eventCreator.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, eventCreator.name);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (eventCreator.department != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, eventCreator.department);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (eventCreator.avatar_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, eventCreator.avatar_url);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (eventCreator.avatar_key != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, eventCreator.avatar_key);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (eventCreator.has_resigned != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, eventCreator.has_resigned);
            }
            return i12 + i7 + eventCreator.unknownFields().size();
        }

        /* renamed from: a */
        public EventCreator decode(ProtoReader protoReader) throws IOException {
            C15608a aVar = new C15608a();
            aVar.f41344a = Type.CHATTER;
            aVar.f41345b = "";
            aVar.f41346c = "";
            aVar.f41347d = "";
            aVar.f41348e = "";
            aVar.f41349f = "";
            aVar.f41350g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f41344a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f41345b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41346c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41347d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41348e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41349f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41350g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, EventCreator eventCreator) throws IOException {
            if (eventCreator.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, eventCreator.type);
            }
            if (eventCreator.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventCreator.chatter_id);
            }
            if (eventCreator.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, eventCreator.name);
            }
            if (eventCreator.department != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, eventCreator.department);
            }
            if (eventCreator.avatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, eventCreator.avatar_url);
            }
            if (eventCreator.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, eventCreator.avatar_key);
            }
            if (eventCreator.has_resigned != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, eventCreator.has_resigned);
            }
            protoWriter.writeBytes(eventCreator.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventCreator$a */
    public static final class C15608a extends Message.Builder<EventCreator, C15608a> {

        /* renamed from: a */
        public Type f41344a;

        /* renamed from: b */
        public String f41345b;

        /* renamed from: c */
        public String f41346c;

        /* renamed from: d */
        public String f41347d;

        /* renamed from: e */
        public String f41348e;

        /* renamed from: f */
        public String f41349f;

        /* renamed from: g */
        public Boolean f41350g;

        /* renamed from: a */
        public EventCreator build() {
            return new EventCreator(this.f41344a, this.f41345b, this.f41346c, this.f41347d, this.f41348e, this.f41349f, this.f41350g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15608a newBuilder() {
        C15608a aVar = new C15608a();
        aVar.f41344a = this.type;
        aVar.f41345b = this.chatter_id;
        aVar.f41346c = this.name;
        aVar.f41347d = this.department;
        aVar.f41348e = this.avatar_url;
        aVar.f41349f = this.avatar_key;
        aVar.f41350g = this.has_resigned;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventCreator");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.department != null) {
            sb.append(", department=");
            sb.append(this.department);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.has_resigned != null) {
            sb.append(", has_resigned=");
            sb.append(this.has_resigned);
        }
        StringBuilder replace = sb.replace(0, 2, "EventCreator{");
        replace.append('}');
        return replace.toString();
    }

    public EventCreator(Type type2, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this(type2, str, str2, str3, str4, str5, bool, ByteString.EMPTY);
    }

    public EventCreator(Type type2, String str, String str2, String str3, String str4, String str5, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.chatter_id = str;
        this.name = str2;
        this.department = str3;
        this.avatar_url = str4;
        this.avatar_key = str5;
        this.has_resigned = bool;
    }
}
