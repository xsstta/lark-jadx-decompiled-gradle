package com.bytedance.lark.pb.space.doc.v1;

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

public final class GetMessageDocPermissionsRequest extends Message<GetMessageDocPermissionsRequest, C19259a> {
    public static final ProtoAdapter<GetMessageDocPermissionsRequest> ADAPTER = new C19260b();
    private static final long serialVersionUID = 0;
    public final List<String> message_ids;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsRequest$b */
    private static final class C19260b extends ProtoAdapter<GetMessageDocPermissionsRequest> {
        C19260b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageDocPermissionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageDocPermissionsRequest getMessageDocPermissionsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getMessageDocPermissionsRequest.message_ids) + getMessageDocPermissionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageDocPermissionsRequest decode(ProtoReader protoReader) throws IOException {
            C19259a aVar = new C19259a();
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
                    aVar.f47451a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageDocPermissionsRequest getMessageDocPermissionsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getMessageDocPermissionsRequest.message_ids);
            protoWriter.writeBytes(getMessageDocPermissionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsRequest$a */
    public static final class C19259a extends Message.Builder<GetMessageDocPermissionsRequest, C19259a> {

        /* renamed from: a */
        public List<String> f47451a = Internal.newMutableList();

        /* renamed from: a */
        public GetMessageDocPermissionsRequest build() {
            return new GetMessageDocPermissionsRequest(this.f47451a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19259a mo65716a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47451a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19259a newBuilder() {
        C19259a aVar = new C19259a();
        aVar.f47451a = Internal.copyOf("message_ids", this.message_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetMessageDocPermissionsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageDocPermissionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageDocPermissionsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetMessageDocPermissionsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
    }
}
