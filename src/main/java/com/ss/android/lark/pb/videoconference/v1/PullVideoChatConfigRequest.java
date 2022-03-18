package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullVideoChatConfigRequest extends Message<PullVideoChatConfigRequest, C50932a> {
    public static final ProtoAdapter<PullVideoChatConfigRequest> ADAPTER = new C50933b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigRequest$b */
    private static final class C50933b extends ProtoAdapter<PullVideoChatConfigRequest> {
        C50933b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVideoChatConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVideoChatConfigRequest pullVideoChatConfigRequest) {
            return pullVideoChatConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullVideoChatConfigRequest decode(ProtoReader protoReader) throws IOException {
            C50932a aVar = new C50932a();
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
        public void encode(ProtoWriter protoWriter, PullVideoChatConfigRequest pullVideoChatConfigRequest) throws IOException {
            protoWriter.writeBytes(pullVideoChatConfigRequest.unknownFields());
        }
    }

    public PullVideoChatConfigRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigRequest$a */
    public static final class C50932a extends Message.Builder<PullVideoChatConfigRequest, C50932a> {
        /* renamed from: a */
        public PullVideoChatConfigRequest build() {
            return new PullVideoChatConfigRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50932a newBuilder() {
        C50932a aVar = new C50932a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullVideoChatConfigRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullVideoChatConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullVideoChatConfigRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
