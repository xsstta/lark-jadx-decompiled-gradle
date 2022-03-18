package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VerifyTwoElementResponse extends Message<VerifyTwoElementResponse, C51222a> {
    public static final ProtoAdapter<VerifyTwoElementResponse> ADAPTER = new C51223b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VerifyTwoElementResponse$b */
    private static final class C51223b extends ProtoAdapter<VerifyTwoElementResponse> {
        C51223b() {
            super(FieldEncoding.LENGTH_DELIMITED, VerifyTwoElementResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VerifyTwoElementResponse verifyTwoElementResponse) {
            return verifyTwoElementResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VerifyTwoElementResponse decode(ProtoReader protoReader) throws IOException {
            C51222a aVar = new C51222a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VerifyTwoElementResponse verifyTwoElementResponse) throws IOException {
            protoWriter.writeBytes(verifyTwoElementResponse.unknownFields());
        }
    }

    public VerifyTwoElementResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VerifyTwoElementResponse$a */
    public static final class C51222a extends Message.Builder<VerifyTwoElementResponse, C51222a> {
        /* renamed from: a */
        public VerifyTwoElementResponse build() {
            return new VerifyTwoElementResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51222a newBuilder() {
        C51222a aVar = new C51222a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VerifyTwoElementResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "VerifyTwoElementResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VerifyTwoElementResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
