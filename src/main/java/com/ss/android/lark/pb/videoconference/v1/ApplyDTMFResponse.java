package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ApplyDTMFResponse extends Message<ApplyDTMFResponse, C50467a> {
    public static final ProtoAdapter<ApplyDTMFResponse> ADAPTER = new C50468b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyDTMFResponse$b */
    private static final class C50468b extends ProtoAdapter<ApplyDTMFResponse> {
        C50468b() {
            super(FieldEncoding.LENGTH_DELIMITED, ApplyDTMFResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ApplyDTMFResponse applyDTMFResponse) {
            return applyDTMFResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ApplyDTMFResponse decode(ProtoReader protoReader) throws IOException {
            C50467a aVar = new C50467a();
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
        public void encode(ProtoWriter protoWriter, ApplyDTMFResponse applyDTMFResponse) throws IOException {
            protoWriter.writeBytes(applyDTMFResponse.unknownFields());
        }
    }

    public ApplyDTMFResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyDTMFResponse$a */
    public static final class C50467a extends Message.Builder<ApplyDTMFResponse, C50467a> {
        /* renamed from: a */
        public ApplyDTMFResponse build() {
            return new ApplyDTMFResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50467a newBuilder() {
        C50467a aVar = new C50467a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ApplyDTMFResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ApplyDTMFResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ApplyDTMFResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
