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

public final class GetP2PChatsByChatterIdsRequest extends Message<GetP2PChatsByChatterIdsRequest, C17657a> {
    public static final ProtoAdapter<GetP2PChatsByChatterIdsRequest> ADAPTER = new C17658b();
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetP2PChatsByChatterIdsRequest$b */
    private static final class C17658b extends ProtoAdapter<GetP2PChatsByChatterIdsRequest> {
        C17658b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetP2PChatsByChatterIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetP2PChatsByChatterIdsRequest getP2PChatsByChatterIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getP2PChatsByChatterIdsRequest.chatter_ids) + getP2PChatsByChatterIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetP2PChatsByChatterIdsRequest decode(ProtoReader protoReader) throws IOException {
            C17657a aVar = new C17657a();
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
                    aVar.f44666a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetP2PChatsByChatterIdsRequest getP2PChatsByChatterIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getP2PChatsByChatterIdsRequest.chatter_ids);
            protoWriter.writeBytes(getP2PChatsByChatterIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetP2PChatsByChatterIdsRequest$a */
    public static final class C17657a extends Message.Builder<GetP2PChatsByChatterIdsRequest, C17657a> {

        /* renamed from: a */
        public List<String> f44666a = Internal.newMutableList();

        /* renamed from: a */
        public GetP2PChatsByChatterIdsRequest build() {
            return new GetP2PChatsByChatterIdsRequest(this.f44666a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17657a mo61717a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44666a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17657a newBuilder() {
        C17657a aVar = new C17657a();
        aVar.f44666a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetP2PChatsByChatterIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetP2PChatsByChatterIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetP2PChatsByChatterIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetP2PChatsByChatterIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
    }
}
