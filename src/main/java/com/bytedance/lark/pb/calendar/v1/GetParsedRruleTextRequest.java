package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.LanguageType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetParsedRruleTextRequest extends Message<GetParsedRruleTextRequest, C15750a> {
    public static final ProtoAdapter<GetParsedRruleTextRequest> ADAPTER = new C15751b();
    public static final LanguageType DEFAULT_LANGUAGE_TYPE = LanguageType.UNKNOWN_LANGUAGE;
    private static final long serialVersionUID = 0;
    public final LanguageType language_type;
    public final String rrule;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetParsedRruleTextRequest$b */
    private static final class C15751b extends ProtoAdapter<GetParsedRruleTextRequest> {
        C15751b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetParsedRruleTextRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetParsedRruleTextRequest getParsedRruleTextRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getParsedRruleTextRequest.rrule) + LanguageType.ADAPTER.encodedSizeWithTag(2, getParsedRruleTextRequest.language_type) + getParsedRruleTextRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetParsedRruleTextRequest decode(ProtoReader protoReader) throws IOException {
            C15750a aVar = new C15750a();
            aVar.f41519a = "";
            aVar.f41520b = LanguageType.UNKNOWN_LANGUAGE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41519a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41520b = LanguageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetParsedRruleTextRequest getParsedRruleTextRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getParsedRruleTextRequest.rrule);
            LanguageType.ADAPTER.encodeWithTag(protoWriter, 2, getParsedRruleTextRequest.language_type);
            protoWriter.writeBytes(getParsedRruleTextRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15750a newBuilder() {
        C15750a aVar = new C15750a();
        aVar.f41519a = this.rrule;
        aVar.f41520b = this.language_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetParsedRruleTextRequest$a */
    public static final class C15750a extends Message.Builder<GetParsedRruleTextRequest, C15750a> {

        /* renamed from: a */
        public String f41519a;

        /* renamed from: b */
        public LanguageType f41520b;

        /* renamed from: a */
        public GetParsedRruleTextRequest build() {
            LanguageType languageType;
            String str = this.f41519a;
            if (str != null && (languageType = this.f41520b) != null) {
                return new GetParsedRruleTextRequest(str, languageType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "rrule", this.f41520b, "language_type");
        }

        /* renamed from: a */
        public C15750a mo56942a(LanguageType languageType) {
            this.f41520b = languageType;
            return this;
        }

        /* renamed from: a */
        public C15750a mo56943a(String str) {
            this.f41519a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetParsedRruleTextRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", rrule=");
        sb.append(this.rrule);
        sb.append(", language_type=");
        sb.append(this.language_type);
        StringBuilder replace = sb.replace(0, 2, "GetParsedRruleTextRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetParsedRruleTextRequest(String str, LanguageType languageType) {
        this(str, languageType, ByteString.EMPTY);
    }

    public GetParsedRruleTextRequest(String str, LanguageType languageType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rrule = str;
        this.language_type = languageType;
    }
}
