package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAccountBadgeRequest extends Message<GetAccountBadgeRequest, C14955a> {
    public static final ProtoAdapter<GetAccountBadgeRequest> ADAPTER = new C14956b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAccountBadgeRequest$b */
    private static final class C14956b extends ProtoAdapter<GetAccountBadgeRequest> {
        C14956b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAccountBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAccountBadgeRequest getAccountBadgeRequest) {
            return getAccountBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAccountBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C14955a aVar = new C14955a();
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
        public void encode(ProtoWriter protoWriter, GetAccountBadgeRequest getAccountBadgeRequest) throws IOException {
            protoWriter.writeBytes(getAccountBadgeRequest.unknownFields());
        }
    }

    public GetAccountBadgeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetAccountBadgeRequest$a */
    public static final class C14955a extends Message.Builder<GetAccountBadgeRequest, C14955a> {
        /* renamed from: a */
        public GetAccountBadgeRequest build() {
            return new GetAccountBadgeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14955a newBuilder() {
        C14955a aVar = new C14955a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetAccountBadgeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAccountBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAccountBadgeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
