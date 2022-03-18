package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRlimitRequest extends Message<GetRlimitRequest, C14985a> {
    public static final ProtoAdapter<GetRlimitRequest> ADAPTER = new C14986b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetRlimitRequest$b */
    private static final class C14986b extends ProtoAdapter<GetRlimitRequest> {
        C14986b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRlimitRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRlimitRequest getRlimitRequest) {
            return getRlimitRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRlimitRequest decode(ProtoReader protoReader) throws IOException {
            C14985a aVar = new C14985a();
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
        public void encode(ProtoWriter protoWriter, GetRlimitRequest getRlimitRequest) throws IOException {
            protoWriter.writeBytes(getRlimitRequest.unknownFields());
        }
    }

    public GetRlimitRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetRlimitRequest$a */
    public static final class C14985a extends Message.Builder<GetRlimitRequest, C14985a> {
        /* renamed from: a */
        public GetRlimitRequest build() {
            return new GetRlimitRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14985a newBuilder() {
        C14985a aVar = new C14985a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetRlimitRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetRlimitRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRlimitRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
