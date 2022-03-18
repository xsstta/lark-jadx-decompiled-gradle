package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetGoogleTokenResponse extends Message<GetGoogleTokenResponse, C50651a> {
    public static final ProtoAdapter<GetGoogleTokenResponse> ADAPTER = new C50652b();
    private static final long serialVersionUID = 0;
    public final GoogleToken token;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetGoogleTokenResponse$b */
    private static final class C50652b extends ProtoAdapter<GetGoogleTokenResponse> {
        C50652b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGoogleTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGoogleTokenResponse getGoogleTokenResponse) {
            int i;
            if (getGoogleTokenResponse.token != null) {
                i = GoogleToken.ADAPTER.encodedSizeWithTag(1, getGoogleTokenResponse.token);
            } else {
                i = 0;
            }
            return i + getGoogleTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetGoogleTokenResponse decode(ProtoReader protoReader) throws IOException {
            C50651a aVar = new C50651a();
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
                    aVar.f126386a = GoogleToken.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetGoogleTokenResponse getGoogleTokenResponse) throws IOException {
            if (getGoogleTokenResponse.token != null) {
                GoogleToken.ADAPTER.encodeWithTag(protoWriter, 1, getGoogleTokenResponse.token);
            }
            protoWriter.writeBytes(getGoogleTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetGoogleTokenResponse$a */
    public static final class C50651a extends Message.Builder<GetGoogleTokenResponse, C50651a> {

        /* renamed from: a */
        public GoogleToken f126386a;

        /* renamed from: a */
        public GetGoogleTokenResponse build() {
            return new GetGoogleTokenResponse(this.f126386a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50651a newBuilder() {
        C50651a aVar = new C50651a();
        aVar.f126386a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetGoogleTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGoogleTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetGoogleTokenResponse(GoogleToken googleToken) {
        this(googleToken, ByteString.EMPTY);
    }

    public GetGoogleTokenResponse(GoogleToken googleToken, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = googleToken;
    }
}
