package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CancelResourceResponse extends Message<CancelResourceResponse, C18200a> {
    public static final ProtoAdapter<CancelResourceResponse> ADAPTER = new C18201b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.media.v1.CancelResourceResponse$b */
    private static final class C18201b extends ProtoAdapter<CancelResourceResponse> {
        C18201b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelResourceResponse cancelResourceResponse) {
            return cancelResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelResourceResponse decode(ProtoReader protoReader) throws IOException {
            C18200a aVar = new C18200a();
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
        public void encode(ProtoWriter protoWriter, CancelResourceResponse cancelResourceResponse) throws IOException {
            protoWriter.writeBytes(cancelResourceResponse.unknownFields());
        }
    }

    public CancelResourceResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.CancelResourceResponse$a */
    public static final class C18200a extends Message.Builder<CancelResourceResponse, C18200a> {
        /* renamed from: a */
        public CancelResourceResponse build() {
            return new CancelResourceResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18200a newBuilder() {
        C18200a aVar = new C18200a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "CancelResourceResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CancelResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelResourceResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
