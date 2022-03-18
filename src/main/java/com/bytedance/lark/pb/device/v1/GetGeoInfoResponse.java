package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetGeoInfoResponse extends Message<GetGeoInfoResponse, C16578a> {
    public static final ProtoAdapter<GetGeoInfoResponse> ADAPTER = new C16579b();
    private static final long serialVersionUID = 0;
    public final Country country;

    public static final class Country extends Message<Country, C16576a> {
        public static final ProtoAdapter<Country> ADAPTER = new C16577b();
        public static final Long DEFAULT_GEOCODE_NAME_ID = 0L;
        private static final long serialVersionUID = 0;
        public final Long geocode_name_id;
        public final String iso_code;

        /* renamed from: com.bytedance.lark.pb.device.v1.GetGeoInfoResponse$Country$b */
        private static final class C16577b extends ProtoAdapter<Country> {
            C16577b() {
                super(FieldEncoding.LENGTH_DELIMITED, Country.class);
            }

            /* renamed from: a */
            public int encodedSize(Country country) {
                int i;
                int i2 = 0;
                if (country.geocode_name_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, country.geocode_name_id);
                } else {
                    i = 0;
                }
                if (country.iso_code != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, country.iso_code);
                }
                return i + i2 + country.unknownFields().size();
            }

            /* renamed from: a */
            public Country decode(ProtoReader protoReader) throws IOException {
                C16576a aVar = new C16576a();
                aVar.f42942a = 0L;
                aVar.f42943b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42942a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42943b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Country country) throws IOException {
                if (country.geocode_name_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, country.geocode_name_id);
                }
                if (country.iso_code != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, country.iso_code);
                }
                protoWriter.writeBytes(country.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.device.v1.GetGeoInfoResponse$Country$a */
        public static final class C16576a extends Message.Builder<Country, C16576a> {

            /* renamed from: a */
            public Long f42942a;

            /* renamed from: b */
            public String f42943b;

            /* renamed from: a */
            public Country build() {
                return new Country(this.f42942a, this.f42943b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16576a newBuilder() {
            C16576a aVar = new C16576a();
            aVar.f42942a = this.geocode_name_id;
            aVar.f42943b = this.iso_code;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("device", "Country");
            StringBuilder sb = new StringBuilder();
            if (this.geocode_name_id != null) {
                sb.append(", geocode_name_id=");
                sb.append(this.geocode_name_id);
            }
            if (this.iso_code != null) {
                sb.append(", iso_code=");
                sb.append(this.iso_code);
            }
            StringBuilder replace = sb.replace(0, 2, "Country{");
            replace.append('}');
            return replace.toString();
        }

        public Country(Long l, String str) {
            this(l, str, ByteString.EMPTY);
        }

        public Country(Long l, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.geocode_name_id = l;
            this.iso_code = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetGeoInfoResponse$b */
    private static final class C16579b extends ProtoAdapter<GetGeoInfoResponse> {
        C16579b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGeoInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGeoInfoResponse getGeoInfoResponse) {
            int i;
            if (getGeoInfoResponse.country != null) {
                i = Country.ADAPTER.encodedSizeWithTag(1, getGeoInfoResponse.country);
            } else {
                i = 0;
            }
            return i + getGeoInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetGeoInfoResponse decode(ProtoReader protoReader) throws IOException {
            C16578a aVar = new C16578a();
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
                    aVar.f42944a = Country.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetGeoInfoResponse getGeoInfoResponse) throws IOException {
            if (getGeoInfoResponse.country != null) {
                Country.ADAPTER.encodeWithTag(protoWriter, 1, getGeoInfoResponse.country);
            }
            protoWriter.writeBytes(getGeoInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetGeoInfoResponse$a */
    public static final class C16578a extends Message.Builder<GetGeoInfoResponse, C16578a> {

        /* renamed from: a */
        public Country f42944a;

        /* renamed from: a */
        public GetGeoInfoResponse build() {
            return new GetGeoInfoResponse(this.f42944a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16578a newBuilder() {
        C16578a aVar = new C16578a();
        aVar.f42944a = this.country;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "GetGeoInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.country != null) {
            sb.append(", country=");
            sb.append(this.country);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGeoInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetGeoInfoResponse(Country country2) {
        this(country2, ByteString.EMPTY);
    }

    public GetGeoInfoResponse(Country country2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.country = country2;
    }
}
