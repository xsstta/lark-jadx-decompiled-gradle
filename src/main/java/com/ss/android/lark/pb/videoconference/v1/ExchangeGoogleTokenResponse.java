package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ExchangeGoogleTokenResponse extends Message<ExchangeGoogleTokenResponse, C50539a> {
    public static final ProtoAdapter<ExchangeGoogleTokenResponse> ADAPTER = new C50540b();
    private static final long serialVersionUID = 0;
    public final GoogleToken token;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ExchangeGoogleTokenResponse$b */
    private static final class C50540b extends ProtoAdapter<ExchangeGoogleTokenResponse> {
        C50540b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExchangeGoogleTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ExchangeGoogleTokenResponse exchangeGoogleTokenResponse) {
            int i;
            if (exchangeGoogleTokenResponse.token != null) {
                i = GoogleToken.ADAPTER.encodedSizeWithTag(1, exchangeGoogleTokenResponse.token);
            } else {
                i = 0;
            }
            return i + exchangeGoogleTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ExchangeGoogleTokenResponse decode(ProtoReader protoReader) throws IOException {
            C50539a aVar = new C50539a();
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
                    aVar.f126170a = GoogleToken.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExchangeGoogleTokenResponse exchangeGoogleTokenResponse) throws IOException {
            if (exchangeGoogleTokenResponse.token != null) {
                GoogleToken.ADAPTER.encodeWithTag(protoWriter, 1, exchangeGoogleTokenResponse.token);
            }
            protoWriter.writeBytes(exchangeGoogleTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ExchangeGoogleTokenResponse$a */
    public static final class C50539a extends Message.Builder<ExchangeGoogleTokenResponse, C50539a> {

        /* renamed from: a */
        public GoogleToken f126170a;

        /* renamed from: a */
        public ExchangeGoogleTokenResponse build() {
            return new ExchangeGoogleTokenResponse(this.f126170a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50539a newBuilder() {
        C50539a aVar = new C50539a();
        aVar.f126170a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ExchangeGoogleTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "ExchangeGoogleTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ExchangeGoogleTokenResponse(GoogleToken googleToken) {
        this(googleToken, ByteString.EMPTY);
    }

    public ExchangeGoogleTokenResponse(GoogleToken googleToken, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = googleToken;
    }
}
