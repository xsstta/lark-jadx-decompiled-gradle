package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetParsedRruleTextResponse extends Message<GetParsedRruleTextResponse, C15752a> {
    public static final ProtoAdapter<GetParsedRruleTextResponse> ADAPTER = new C15753b();
    private static final long serialVersionUID = 0;
    public final String freq_part;
    public final String parsed_rrule;
    public final String until_part;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetParsedRruleTextResponse$b */
    private static final class C15753b extends ProtoAdapter<GetParsedRruleTextResponse> {
        C15753b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetParsedRruleTextResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetParsedRruleTextResponse getParsedRruleTextResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getParsedRruleTextResponse.parsed_rrule);
            int i2 = 0;
            if (getParsedRruleTextResponse.freq_part != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getParsedRruleTextResponse.freq_part);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getParsedRruleTextResponse.until_part != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getParsedRruleTextResponse.until_part);
            }
            return i3 + i2 + getParsedRruleTextResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetParsedRruleTextResponse decode(ProtoReader protoReader) throws IOException {
            C15752a aVar = new C15752a();
            aVar.f41521a = "";
            aVar.f41522b = "";
            aVar.f41523c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41521a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41522b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41523c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetParsedRruleTextResponse getParsedRruleTextResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getParsedRruleTextResponse.parsed_rrule);
            if (getParsedRruleTextResponse.freq_part != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getParsedRruleTextResponse.freq_part);
            }
            if (getParsedRruleTextResponse.until_part != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getParsedRruleTextResponse.until_part);
            }
            protoWriter.writeBytes(getParsedRruleTextResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15752a newBuilder() {
        C15752a aVar = new C15752a();
        aVar.f41521a = this.parsed_rrule;
        aVar.f41522b = this.freq_part;
        aVar.f41523c = this.until_part;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetParsedRruleTextResponse$a */
    public static final class C15752a extends Message.Builder<GetParsedRruleTextResponse, C15752a> {

        /* renamed from: a */
        public String f41521a;

        /* renamed from: b */
        public String f41522b;

        /* renamed from: c */
        public String f41523c;

        /* renamed from: a */
        public GetParsedRruleTextResponse build() {
            String str = this.f41521a;
            if (str != null) {
                return new GetParsedRruleTextResponse(str, this.f41522b, this.f41523c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "parsed_rrule");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetParsedRruleTextResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", parsed_rrule=");
        sb.append(this.parsed_rrule);
        if (this.freq_part != null) {
            sb.append(", freq_part=");
            sb.append(this.freq_part);
        }
        if (this.until_part != null) {
            sb.append(", until_part=");
            sb.append(this.until_part);
        }
        StringBuilder replace = sb.replace(0, 2, "GetParsedRruleTextResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetParsedRruleTextResponse(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public GetParsedRruleTextResponse(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parsed_rrule = str;
        this.freq_part = str2;
        this.until_part = str3;
    }
}
