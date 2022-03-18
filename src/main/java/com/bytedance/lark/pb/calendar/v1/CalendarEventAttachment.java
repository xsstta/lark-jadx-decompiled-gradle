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

public final class CalendarEventAttachment extends Message<CalendarEventAttachment, C15518a> {
    public static final ProtoAdapter<CalendarEventAttachment> ADAPTER = new C15519b();
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String file_size;
    public final String file_token;
    public final Boolean is_deleted;
    public final String local_path;
    public final String name;
    public final Integer position;
    public final Type type;
    public final String uploader_user_id;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        LOCAL(1);
        
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
            if (i != 1) {
                return null;
            }
            return LOCAL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttachment$b */
    private static final class C15519b extends ProtoAdapter<CalendarEventAttachment> {
        C15519b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventAttachment.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventAttachment calendarEventAttachment) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (calendarEventAttachment.file_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEventAttachment.file_token);
            } else {
                i = 0;
            }
            if (calendarEventAttachment.file_size != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarEventAttachment.file_size);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (calendarEventAttachment.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, calendarEventAttachment.name);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (calendarEventAttachment.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(4, calendarEventAttachment.type);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (calendarEventAttachment.local_path != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, calendarEventAttachment.local_path);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (calendarEventAttachment.uploader_user_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarEventAttachment.uploader_user_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (calendarEventAttachment.is_deleted != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, calendarEventAttachment.is_deleted);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (calendarEventAttachment.position != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, calendarEventAttachment.position);
            }
            return i14 + i8 + calendarEventAttachment.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventAttachment decode(ProtoReader protoReader) throws IOException {
            C15518a aVar = new C15518a();
            aVar.f41091a = "";
            aVar.f41092b = "";
            aVar.f41093c = "";
            aVar.f41094d = Type.UNKNOWN;
            aVar.f41095e = "";
            aVar.f41096f = "";
            aVar.f41097g = false;
            aVar.f41098h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41091a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41092b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41093c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f41094d = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f41095e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41096f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41097g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41098h = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarEventAttachment calendarEventAttachment) throws IOException {
            if (calendarEventAttachment.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEventAttachment.file_token);
            }
            if (calendarEventAttachment.file_size != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarEventAttachment.file_size);
            }
            if (calendarEventAttachment.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarEventAttachment.name);
            }
            if (calendarEventAttachment.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 4, calendarEventAttachment.type);
            }
            if (calendarEventAttachment.local_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendarEventAttachment.local_path);
            }
            if (calendarEventAttachment.uploader_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarEventAttachment.uploader_user_id);
            }
            if (calendarEventAttachment.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, calendarEventAttachment.is_deleted);
            }
            if (calendarEventAttachment.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, calendarEventAttachment.position);
            }
            protoWriter.writeBytes(calendarEventAttachment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventAttachment$a */
    public static final class C15518a extends Message.Builder<CalendarEventAttachment, C15518a> {

        /* renamed from: a */
        public String f41091a;

        /* renamed from: b */
        public String f41092b;

        /* renamed from: c */
        public String f41093c;

        /* renamed from: d */
        public Type f41094d;

        /* renamed from: e */
        public String f41095e;

        /* renamed from: f */
        public String f41096f;

        /* renamed from: g */
        public Boolean f41097g;

        /* renamed from: h */
        public Integer f41098h;

        /* renamed from: a */
        public CalendarEventAttachment build() {
            return new CalendarEventAttachment(this.f41091a, this.f41092b, this.f41093c, this.f41094d, this.f41095e, this.f41096f, this.f41097g, this.f41098h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15518a mo56256a(Type type) {
            this.f41094d = type;
            return this;
        }

        /* renamed from: b */
        public C15518a mo56261b(String str) {
            this.f41092b = str;
            return this;
        }

        /* renamed from: c */
        public C15518a mo56262c(String str) {
            this.f41093c = str;
            return this;
        }

        /* renamed from: d */
        public C15518a mo56263d(String str) {
            this.f41095e = str;
            return this;
        }

        /* renamed from: e */
        public C15518a mo56264e(String str) {
            this.f41096f = str;
            return this;
        }

        /* renamed from: a */
        public C15518a mo56257a(Boolean bool) {
            this.f41097g = bool;
            return this;
        }

        /* renamed from: a */
        public C15518a mo56258a(Integer num) {
            this.f41098h = num;
            return this;
        }

        /* renamed from: a */
        public C15518a mo56259a(String str) {
            this.f41091a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15518a newBuilder() {
        C15518a aVar = new C15518a();
        aVar.f41091a = this.file_token;
        aVar.f41092b = this.file_size;
        aVar.f41093c = this.name;
        aVar.f41094d = this.type;
        aVar.f41095e = this.local_path;
        aVar.f41096f = this.uploader_user_id;
        aVar.f41097g = this.is_deleted;
        aVar.f41098h = this.position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventAttachment");
        StringBuilder sb = new StringBuilder();
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.file_size != null) {
            sb.append(", file_size=");
            sb.append(this.file_size);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.local_path != null) {
            sb.append(", local_path=");
            sb.append(this.local_path);
        }
        if (this.uploader_user_id != null) {
            sb.append(", uploader_user_id=");
            sb.append(this.uploader_user_id);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEventAttachment{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventAttachment(String str, String str2, String str3, Type type2, String str4, String str5, Boolean bool, Integer num) {
        this(str, str2, str3, type2, str4, str5, bool, num, ByteString.EMPTY);
    }

    public CalendarEventAttachment(String str, String str2, String str3, Type type2, String str4, String str5, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_token = str;
        this.file_size = str2;
        this.name = str3;
        this.type = type2;
        this.local_path = str4;
        this.uploader_user_id = str5;
        this.is_deleted = bool;
        this.position = num;
    }
}
