package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarLocation extends Message<CalendarLocation, C15544a> {
    public static final ProtoAdapter<CalendarLocation> ADAPTER = new C15545b();
    public static final Float DEFAULT_LATITUDE;
    public static final Float DEFAULT_LONGITUDE;
    private static final long serialVersionUID = 0;
    public final String address;
    public final Float latitude;
    public final String location;
    public final Float longitude;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarLocation$b */
    private static final class C15545b extends ProtoAdapter<CalendarLocation> {
        C15545b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarLocation.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarLocation calendarLocation) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (calendarLocation.location != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarLocation.location);
            } else {
                i = 0;
            }
            if (calendarLocation.address != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarLocation.address);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (calendarLocation.latitude != null) {
                i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(3, calendarLocation.latitude);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (calendarLocation.longitude != null) {
                i4 = ProtoAdapter.FLOAT.encodedSizeWithTag(4, calendarLocation.longitude);
            }
            return i6 + i4 + calendarLocation.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarLocation decode(ProtoReader protoReader) throws IOException {
            C15544a aVar = new C15544a();
            aVar.f41209a = "";
            aVar.f41210b = "";
            Float valueOf = Float.valueOf(360.0f);
            aVar.f41211c = valueOf;
            aVar.f41212d = valueOf;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41209a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41210b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41211c = ProtoAdapter.FLOAT.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41212d = ProtoAdapter.FLOAT.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarLocation calendarLocation) throws IOException {
            if (calendarLocation.location != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarLocation.location);
            }
            if (calendarLocation.address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarLocation.address);
            }
            if (calendarLocation.latitude != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, calendarLocation.latitude);
            }
            if (calendarLocation.longitude != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, calendarLocation.longitude);
            }
            protoWriter.writeBytes(calendarLocation.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarLocation$a */
    public static final class C15544a extends Message.Builder<CalendarLocation, C15544a> {

        /* renamed from: a */
        public String f41209a;

        /* renamed from: b */
        public String f41210b;

        /* renamed from: c */
        public Float f41211c;

        /* renamed from: d */
        public Float f41212d;

        /* renamed from: a */
        public CalendarLocation build() {
            return new CalendarLocation(this.f41209a, this.f41210b, this.f41211c, this.f41212d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15544a mo56380a(Float f) {
            this.f41211c = f;
            return this;
        }

        /* renamed from: b */
        public C15544a mo56383b(Float f) {
            this.f41212d = f;
            return this;
        }

        /* renamed from: a */
        public C15544a mo56381a(String str) {
            this.f41209a = str;
            return this;
        }

        /* renamed from: b */
        public C15544a mo56384b(String str) {
            this.f41210b = str;
            return this;
        }
    }

    static {
        Float valueOf = Float.valueOf(360.0f);
        DEFAULT_LATITUDE = valueOf;
        DEFAULT_LONGITUDE = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C15544a newBuilder() {
        C15544a aVar = new C15544a();
        aVar.f41209a = this.location;
        aVar.f41210b = this.address;
        aVar.f41211c = this.latitude;
        aVar.f41212d = this.longitude;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarLocation");
        StringBuilder sb = new StringBuilder();
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.address != null) {
            sb.append(", address=");
            sb.append(this.address);
        }
        if (this.latitude != null) {
            sb.append(", latitude=");
            sb.append(this.latitude);
        }
        if (this.longitude != null) {
            sb.append(", longitude=");
            sb.append(this.longitude);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarLocation{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarLocation(String str, String str2, Float f, Float f2) {
        this(str, str2, f, f2, ByteString.EMPTY);
    }

    public CalendarLocation(String str, String str2, Float f, Float f2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.location = str;
        this.address = str2;
        this.latitude = f;
        this.longitude = f2;
    }
}
