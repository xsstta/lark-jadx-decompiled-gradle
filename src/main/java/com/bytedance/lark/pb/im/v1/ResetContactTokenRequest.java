package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ResetContactTokenRequest extends Message<ResetContactTokenRequest, C18007a> {
    public static final ProtoAdapter<ResetContactTokenRequest> ADAPTER = new C18008b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.ResetContactTokenRequest$b */
    private static final class C18008b extends ProtoAdapter<ResetContactTokenRequest> {
        C18008b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResetContactTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ResetContactTokenRequest resetContactTokenRequest) {
            return resetContactTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ResetContactTokenRequest decode(ProtoReader protoReader) throws IOException {
            C18007a aVar = new C18007a();
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
        public void encode(ProtoWriter protoWriter, ResetContactTokenRequest resetContactTokenRequest) throws IOException {
            protoWriter.writeBytes(resetContactTokenRequest.unknownFields());
        }
    }

    public ResetContactTokenRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ResetContactTokenRequest$a */
    public static final class C18007a extends Message.Builder<ResetContactTokenRequest, C18007a> {
        /* renamed from: a */
        public ResetContactTokenRequest build() {
            return new ResetContactTokenRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18007a newBuilder() {
        C18007a aVar = new C18007a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ResetContactTokenRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ResetContactTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ResetContactTokenRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
