package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatFetchLivePolicyRequest extends Message<VideoChatFetchLivePolicyRequest, C51236a> {
    public static final ProtoAdapter<VideoChatFetchLivePolicyRequest> ADAPTER = new C51237b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyRequest$b */
    private static final class C51237b extends ProtoAdapter<VideoChatFetchLivePolicyRequest> {
        C51237b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatFetchLivePolicyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatFetchLivePolicyRequest videoChatFetchLivePolicyRequest) {
            return videoChatFetchLivePolicyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatFetchLivePolicyRequest decode(ProtoReader protoReader) throws IOException {
            C51236a aVar = new C51236a();
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
        public void encode(ProtoWriter protoWriter, VideoChatFetchLivePolicyRequest videoChatFetchLivePolicyRequest) throws IOException {
            protoWriter.writeBytes(videoChatFetchLivePolicyRequest.unknownFields());
        }
    }

    public VideoChatFetchLivePolicyRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyRequest$a */
    public static final class C51236a extends Message.Builder<VideoChatFetchLivePolicyRequest, C51236a> {
        /* renamed from: a */
        public VideoChatFetchLivePolicyRequest build() {
            return new VideoChatFetchLivePolicyRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51236a newBuilder() {
        C51236a aVar = new C51236a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatFetchLivePolicyRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "VideoChatFetchLivePolicyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatFetchLivePolicyRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
