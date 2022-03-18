package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUsedReactionsRequest extends Message<GetUsedReactionsRequest, C17759a> {
    public static final ProtoAdapter<GetUsedReactionsRequest> ADAPTER = new C17760b();
    public static final Boolean DEFAULT_IS_FROM_LOCAL = true;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_local;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUsedReactionsRequest$b */
    private static final class C17760b extends ProtoAdapter<GetUsedReactionsRequest> {
        C17760b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUsedReactionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUsedReactionsRequest getUsedReactionsRequest) {
            int i;
            if (getUsedReactionsRequest.is_from_local != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUsedReactionsRequest.is_from_local);
            } else {
                i = 0;
            }
            return i + getUsedReactionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUsedReactionsRequest decode(ProtoReader protoReader) throws IOException {
            C17759a aVar = new C17759a();
            aVar.f44807a = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44807a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUsedReactionsRequest getUsedReactionsRequest) throws IOException {
            if (getUsedReactionsRequest.is_from_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUsedReactionsRequest.is_from_local);
            }
            protoWriter.writeBytes(getUsedReactionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUsedReactionsRequest$a */
    public static final class C17759a extends Message.Builder<GetUsedReactionsRequest, C17759a> {

        /* renamed from: a */
        public Boolean f44807a;

        /* renamed from: a */
        public GetUsedReactionsRequest build() {
            return new GetUsedReactionsRequest(this.f44807a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17759a newBuilder() {
        C17759a aVar = new C17759a();
        aVar.f44807a = this.is_from_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUsedReactionsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_from_local != null) {
            sb.append(", is_from_local=");
            sb.append(this.is_from_local);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUsedReactionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUsedReactionsRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetUsedReactionsRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_from_local = bool;
    }
}
