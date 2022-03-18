package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ClearNetworkProxyRequest extends Message<ClearNetworkProxyRequest, C19689a> {
    public static final ProtoAdapter<ClearNetworkProxyRequest> ADAPTER = new C19690b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.tool.v1.ClearNetworkProxyRequest$b */
    private static final class C19690b extends ProtoAdapter<ClearNetworkProxyRequest> {
        C19690b() {
            super(FieldEncoding.LENGTH_DELIMITED, ClearNetworkProxyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ClearNetworkProxyRequest clearNetworkProxyRequest) {
            return clearNetworkProxyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ClearNetworkProxyRequest decode(ProtoReader protoReader) throws IOException {
            C19689a aVar = new C19689a();
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
        public void encode(ProtoWriter protoWriter, ClearNetworkProxyRequest clearNetworkProxyRequest) throws IOException {
            protoWriter.writeBytes(clearNetworkProxyRequest.unknownFields());
        }
    }

    public ClearNetworkProxyRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.ClearNetworkProxyRequest$a */
    public static final class C19689a extends Message.Builder<ClearNetworkProxyRequest, C19689a> {
        /* renamed from: a */
        public ClearNetworkProxyRequest build() {
            return new ClearNetworkProxyRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19689a newBuilder() {
        C19689a aVar = new C19689a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "ClearNetworkProxyRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ClearNetworkProxyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ClearNetworkProxyRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
