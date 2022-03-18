package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUsedReactionsResponse extends Message<GetUsedReactionsResponse, C17761a> {
    public static final ProtoAdapter<GetUsedReactionsResponse> ADAPTER = new C17762b();
    private static final long serialVersionUID = 0;
    public final List<String> keys;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUsedReactionsResponse$b */
    private static final class C17762b extends ProtoAdapter<GetUsedReactionsResponse> {
        C17762b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUsedReactionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUsedReactionsResponse getUsedReactionsResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUsedReactionsResponse.keys) + getUsedReactionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUsedReactionsResponse decode(ProtoReader protoReader) throws IOException {
            C17761a aVar = new C17761a();
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
                    aVar.f44808a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUsedReactionsResponse getUsedReactionsResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUsedReactionsResponse.keys);
            protoWriter.writeBytes(getUsedReactionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUsedReactionsResponse$a */
    public static final class C17761a extends Message.Builder<GetUsedReactionsResponse, C17761a> {

        /* renamed from: a */
        public List<String> f44808a = Internal.newMutableList();

        /* renamed from: a */
        public GetUsedReactionsResponse build() {
            return new GetUsedReactionsResponse(this.f44808a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17761a newBuilder() {
        C17761a aVar = new C17761a();
        aVar.f44808a = Internal.copyOf("keys", this.keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUsedReactionsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUsedReactionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUsedReactionsResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUsedReactionsResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = Internal.immutableCopyOf("keys", list);
    }
}
