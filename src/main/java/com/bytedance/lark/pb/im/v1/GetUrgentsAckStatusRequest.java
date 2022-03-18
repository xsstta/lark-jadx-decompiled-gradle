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

public final class GetUrgentsAckStatusRequest extends Message<GetUrgentsAckStatusRequest, C17751a> {
    public static final ProtoAdapter<GetUrgentsAckStatusRequest> ADAPTER = new C17752b();
    private static final long serialVersionUID = 0;
    public final List<String> message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusRequest$b */
    private static final class C17752b extends ProtoAdapter<GetUrgentsAckStatusRequest> {
        C17752b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrgentsAckStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrgentsAckStatusRequest getUrgentsAckStatusRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUrgentsAckStatusRequest.message_ids) + getUrgentsAckStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrgentsAckStatusRequest decode(ProtoReader protoReader) throws IOException {
            C17751a aVar = new C17751a();
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
                    aVar.f44798a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrgentsAckStatusRequest getUrgentsAckStatusRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUrgentsAckStatusRequest.message_ids);
            protoWriter.writeBytes(getUrgentsAckStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusRequest$a */
    public static final class C17751a extends Message.Builder<GetUrgentsAckStatusRequest, C17751a> {

        /* renamed from: a */
        public List<String> f44798a = Internal.newMutableList();

        /* renamed from: a */
        public GetUrgentsAckStatusRequest build() {
            return new GetUrgentsAckStatusRequest(this.f44798a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17751a mo61949a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44798a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17751a newBuilder() {
        C17751a aVar = new C17751a();
        aVar.f44798a = Internal.copyOf("message_ids", this.message_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUrgentsAckStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUrgentsAckStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrgentsAckStatusRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUrgentsAckStatusRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
    }
}
