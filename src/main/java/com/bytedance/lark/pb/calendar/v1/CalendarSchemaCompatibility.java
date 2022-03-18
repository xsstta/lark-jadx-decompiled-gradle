package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarSchemaCompatibility extends Message<CalendarSchemaCompatibility, C15562a> {
    public static final ProtoAdapter<CalendarSchemaCompatibility> ADAPTER = new C15563b();
    public static final IncompatibleLevel DEFAULT_INCOMPATIBLE_LEVEL = IncompatibleLevel.SHOW_HINT;
    public static final Integer DEFAULT_MINIMUM_COMPATIBILITY_VER = 0;
    private static final long serialVersionUID = 0;
    public final IncompatibleLevel incompatible_level;
    public final Integer minimum_compatibility_ver;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSchemaCompatibility$b */
    private static final class C15563b extends ProtoAdapter<CalendarSchemaCompatibility> {
        C15563b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarSchemaCompatibility.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarSchemaCompatibility calendarSchemaCompatibility) {
            int i;
            int i2 = 0;
            if (calendarSchemaCompatibility.minimum_compatibility_ver != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, calendarSchemaCompatibility.minimum_compatibility_ver);
            } else {
                i = 0;
            }
            if (calendarSchemaCompatibility.incompatible_level != null) {
                i2 = IncompatibleLevel.ADAPTER.encodedSizeWithTag(2, calendarSchemaCompatibility.incompatible_level);
            }
            return i + i2 + calendarSchemaCompatibility.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarSchemaCompatibility decode(ProtoReader protoReader) throws IOException {
            C15562a aVar = new C15562a();
            aVar.f41265a = 0;
            aVar.f41266b = IncompatibleLevel.SHOW_HINT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41265a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41266b = IncompatibleLevel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarSchemaCompatibility calendarSchemaCompatibility) throws IOException {
            if (calendarSchemaCompatibility.minimum_compatibility_ver != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, calendarSchemaCompatibility.minimum_compatibility_ver);
            }
            if (calendarSchemaCompatibility.incompatible_level != null) {
                IncompatibleLevel.ADAPTER.encodeWithTag(protoWriter, 2, calendarSchemaCompatibility.incompatible_level);
            }
            protoWriter.writeBytes(calendarSchemaCompatibility.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSchemaCompatibility$a */
    public static final class C15562a extends Message.Builder<CalendarSchemaCompatibility, C15562a> {

        /* renamed from: a */
        public Integer f41265a;

        /* renamed from: b */
        public IncompatibleLevel f41266b;

        /* renamed from: a */
        public CalendarSchemaCompatibility build() {
            return new CalendarSchemaCompatibility(this.f41265a, this.f41266b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15562a mo56453a(IncompatibleLevel incompatibleLevel) {
            this.f41266b = incompatibleLevel;
            return this;
        }

        /* renamed from: a */
        public C15562a mo56454a(Integer num) {
            this.f41265a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15562a newBuilder() {
        C15562a aVar = new C15562a();
        aVar.f41265a = this.minimum_compatibility_ver;
        aVar.f41266b = this.incompatible_level;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarSchemaCompatibility");
        StringBuilder sb = new StringBuilder();
        if (this.minimum_compatibility_ver != null) {
            sb.append(", minimum_compatibility_ver=");
            sb.append(this.minimum_compatibility_ver);
        }
        if (this.incompatible_level != null) {
            sb.append(", incompatible_level=");
            sb.append(this.incompatible_level);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarSchemaCompatibility{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarSchemaCompatibility(Integer num, IncompatibleLevel incompatibleLevel) {
        this(num, incompatibleLevel, ByteString.EMPTY);
    }

    public CalendarSchemaCompatibility(Integer num, IncompatibleLevel incompatibleLevel, ByteString byteString) {
        super(ADAPTER, byteString);
        this.minimum_compatibility_ver = num;
        this.incompatible_level = incompatibleLevel;
    }
}
