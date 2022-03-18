package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ClearResourcesRequest extends Message<ClearResourcesRequest, C18202a> {
    public static final ProtoAdapter<ClearResourcesRequest> ADAPTER = new C18203b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.media.v1.ClearResourcesRequest$b */
    private static final class C18203b extends ProtoAdapter<ClearResourcesRequest> {
        C18203b() {
            super(FieldEncoding.LENGTH_DELIMITED, ClearResourcesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ClearResourcesRequest clearResourcesRequest) {
            return clearResourcesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ClearResourcesRequest decode(ProtoReader protoReader) throws IOException {
            C18202a aVar = new C18202a();
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
        public void encode(ProtoWriter protoWriter, ClearResourcesRequest clearResourcesRequest) throws IOException {
            protoWriter.writeBytes(clearResourcesRequest.unknownFields());
        }
    }

    public ClearResourcesRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.ClearResourcesRequest$a */
    public static final class C18202a extends Message.Builder<ClearResourcesRequest, C18202a> {
        /* renamed from: a */
        public ClearResourcesRequest build() {
            return new ClearResourcesRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18202a newBuilder() {
        C18202a aVar = new C18202a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "ClearResourcesRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ClearResourcesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ClearResourcesRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
