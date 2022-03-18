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

public final class CreateP2PChatsRequest extends Message<CreateP2PChatsRequest, C17368a> {
    public static final ProtoAdapter<CreateP2PChatsRequest> ADAPTER = new C17369b();
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateP2PChatsRequest$b */
    private static final class C17369b extends ProtoAdapter<CreateP2PChatsRequest> {
        C17369b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateP2PChatsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateP2PChatsRequest createP2PChatsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, createP2PChatsRequest.chatter_ids) + createP2PChatsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateP2PChatsRequest decode(ProtoReader protoReader) throws IOException {
            C17368a aVar = new C17368a();
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
                    aVar.f44254a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateP2PChatsRequest createP2PChatsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, createP2PChatsRequest.chatter_ids);
            protoWriter.writeBytes(createP2PChatsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateP2PChatsRequest$a */
    public static final class C17368a extends Message.Builder<CreateP2PChatsRequest, C17368a> {

        /* renamed from: a */
        public List<String> f44254a = Internal.newMutableList();

        /* renamed from: a */
        public CreateP2PChatsRequest build() {
            return new CreateP2PChatsRequest(this.f44254a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17368a mo60965a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44254a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17368a newBuilder() {
        C17368a aVar = new C17368a();
        aVar.f44254a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateP2PChatsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateP2PChatsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateP2PChatsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public CreateP2PChatsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
    }
}
