package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RequestFollowPermResponse extends Message<RequestFollowPermResponse, C50984a> {
    public static final ProtoAdapter<RequestFollowPermResponse> ADAPTER = new C50985b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RequestFollowPermResponse$b */
    private static final class C50985b extends ProtoAdapter<RequestFollowPermResponse> {
        C50985b() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestFollowPermResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RequestFollowPermResponse requestFollowPermResponse) {
            return requestFollowPermResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RequestFollowPermResponse decode(ProtoReader protoReader) throws IOException {
            C50984a aVar = new C50984a();
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
        public void encode(ProtoWriter protoWriter, RequestFollowPermResponse requestFollowPermResponse) throws IOException {
            protoWriter.writeBytes(requestFollowPermResponse.unknownFields());
        }
    }

    public RequestFollowPermResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RequestFollowPermResponse$a */
    public static final class C50984a extends Message.Builder<RequestFollowPermResponse, C50984a> {
        /* renamed from: a */
        public RequestFollowPermResponse build() {
            return new RequestFollowPermResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50984a newBuilder() {
        C50984a aVar = new C50984a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RequestFollowPermResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "RequestFollowPermResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RequestFollowPermResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
