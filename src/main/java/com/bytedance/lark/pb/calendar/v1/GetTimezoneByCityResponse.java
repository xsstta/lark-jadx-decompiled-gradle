package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetTimezoneByCityResponse extends Message<GetTimezoneByCityResponse, C15796a> {
    public static final ProtoAdapter<GetTimezoneByCityResponse> ADAPTER = new C15797b();
    private static final long serialVersionUID = 0;
    public final List<CityTimezone> city_timezones;

    public static final class CityTimezone extends Message<CityTimezone, C15794a> {
        public static final ProtoAdapter<CityTimezone> ADAPTER = new C15795b();
        private static final long serialVersionUID = 0;
        public final List<String> city_names;
        public final Timezone timezone;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse$CityTimezone$b */
        private static final class C15795b extends ProtoAdapter<CityTimezone> {
            C15795b() {
                super(FieldEncoding.LENGTH_DELIMITED, CityTimezone.class);
            }

            /* renamed from: a */
            public int encodedSize(CityTimezone cityTimezone) {
                return Timezone.ADAPTER.encodedSizeWithTag(1, cityTimezone.timezone) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, cityTimezone.city_names) + cityTimezone.unknownFields().size();
            }

            /* renamed from: a */
            public CityTimezone decode(ProtoReader protoReader) throws IOException {
                C15794a aVar = new C15794a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f41568a = Timezone.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41569b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CityTimezone cityTimezone) throws IOException {
                Timezone.ADAPTER.encodeWithTag(protoWriter, 1, cityTimezone.timezone);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, cityTimezone.city_names);
                protoWriter.writeBytes(cityTimezone.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse$CityTimezone$a */
        public static final class C15794a extends Message.Builder<CityTimezone, C15794a> {

            /* renamed from: a */
            public Timezone f41568a;

            /* renamed from: b */
            public List<String> f41569b = Internal.newMutableList();

            /* renamed from: a */
            public CityTimezone build() {
                Timezone timezone = this.f41568a;
                if (timezone != null) {
                    return new CityTimezone(timezone, this.f41569b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(timezone, "timezone");
            }
        }

        @Override // com.squareup.wire.Message
        public C15794a newBuilder() {
            C15794a aVar = new C15794a();
            aVar.f41568a = this.timezone;
            aVar.f41569b = Internal.copyOf("city_names", this.city_names);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CityTimezone");
            StringBuilder sb = new StringBuilder();
            sb.append(", timezone=");
            sb.append(this.timezone);
            if (!this.city_names.isEmpty()) {
                sb.append(", city_names=");
                sb.append(this.city_names);
            }
            StringBuilder replace = sb.replace(0, 2, "CityTimezone{");
            replace.append('}');
            return replace.toString();
        }

        public CityTimezone(Timezone timezone2, List<String> list) {
            this(timezone2, list, ByteString.EMPTY);
        }

        public CityTimezone(Timezone timezone2, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.timezone = timezone2;
            this.city_names = Internal.immutableCopyOf("city_names", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse$b */
    private static final class C15797b extends ProtoAdapter<GetTimezoneByCityResponse> {
        C15797b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTimezoneByCityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTimezoneByCityResponse getTimezoneByCityResponse) {
            return CityTimezone.ADAPTER.asRepeated().encodedSizeWithTag(1, getTimezoneByCityResponse.city_timezones) + getTimezoneByCityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTimezoneByCityResponse decode(ProtoReader protoReader) throws IOException {
            C15796a aVar = new C15796a();
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
                    aVar.f41570a.add(CityTimezone.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTimezoneByCityResponse getTimezoneByCityResponse) throws IOException {
            CityTimezone.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getTimezoneByCityResponse.city_timezones);
            protoWriter.writeBytes(getTimezoneByCityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse$a */
    public static final class C15796a extends Message.Builder<GetTimezoneByCityResponse, C15796a> {

        /* renamed from: a */
        public List<CityTimezone> f41570a = Internal.newMutableList();

        /* renamed from: a */
        public GetTimezoneByCityResponse build() {
            return new GetTimezoneByCityResponse(this.f41570a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15796a newBuilder() {
        C15796a aVar = new C15796a();
        aVar.f41570a = Internal.copyOf("city_timezones", this.city_timezones);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetTimezoneByCityResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.city_timezones.isEmpty()) {
            sb.append(", city_timezones=");
            sb.append(this.city_timezones);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTimezoneByCityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTimezoneByCityResponse(List<CityTimezone> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTimezoneByCityResponse(List<CityTimezone> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.city_timezones = Internal.immutableCopyOf("city_timezones", list);
    }
}
