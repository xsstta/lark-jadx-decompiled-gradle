package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetNewestPoliciesRequest extends Message<GetNewestPoliciesRequest, C14981a> {
    public static final ProtoAdapter<GetNewestPoliciesRequest> ADAPTER = new C14982b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewestPoliciesRequest$b */
    private static final class C14982b extends ProtoAdapter<GetNewestPoliciesRequest> {
        C14982b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNewestPoliciesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNewestPoliciesRequest getNewestPoliciesRequest) {
            return getNewestPoliciesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNewestPoliciesRequest decode(ProtoReader protoReader) throws IOException {
            C14981a aVar = new C14981a();
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
        public void encode(ProtoWriter protoWriter, GetNewestPoliciesRequest getNewestPoliciesRequest) throws IOException {
            protoWriter.writeBytes(getNewestPoliciesRequest.unknownFields());
        }
    }

    public GetNewestPoliciesRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewestPoliciesRequest$a */
    public static final class C14981a extends Message.Builder<GetNewestPoliciesRequest, C14981a> {
        /* renamed from: a */
        public GetNewestPoliciesRequest build() {
            return new GetNewestPoliciesRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14981a newBuilder() {
        C14981a aVar = new C14981a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetNewestPoliciesRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetNewestPoliciesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNewestPoliciesRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
