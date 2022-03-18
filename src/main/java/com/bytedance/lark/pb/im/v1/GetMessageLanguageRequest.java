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

public final class GetMessageLanguageRequest extends Message<GetMessageLanguageRequest, C17617a> {
    public static final ProtoAdapter<GetMessageLanguageRequest> ADAPTER = new C17618b();
    private static final long serialVersionUID = 0;
    public final List<String> message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageLanguageRequest$b */
    private static final class C17618b extends ProtoAdapter<GetMessageLanguageRequest> {
        C17618b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageLanguageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageLanguageRequest getMessageLanguageRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getMessageLanguageRequest.message_ids) + getMessageLanguageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageLanguageRequest decode(ProtoReader protoReader) throws IOException {
            C17617a aVar = new C17617a();
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
                    aVar.f44615a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageLanguageRequest getMessageLanguageRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getMessageLanguageRequest.message_ids);
            protoWriter.writeBytes(getMessageLanguageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageLanguageRequest$a */
    public static final class C17617a extends Message.Builder<GetMessageLanguageRequest, C17617a> {

        /* renamed from: a */
        public List<String> f44615a = Internal.newMutableList();

        /* renamed from: a */
        public GetMessageLanguageRequest build() {
            return new GetMessageLanguageRequest(this.f44615a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17617a newBuilder() {
        C17617a aVar = new C17617a();
        aVar.f44615a = Internal.copyOf("message_ids", this.message_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageLanguageRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageLanguageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageLanguageRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetMessageLanguageRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
    }
}
