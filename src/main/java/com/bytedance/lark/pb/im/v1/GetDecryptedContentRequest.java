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

public final class GetDecryptedContentRequest extends Message<GetDecryptedContentRequest, C17566a> {
    public static final ProtoAdapter<GetDecryptedContentRequest> ADAPTER = new C17567b();
    private static final long serialVersionUID = 0;
    public final List<String> decrypted_tokens;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDecryptedContentRequest$b */
    private static final class C17567b extends ProtoAdapter<GetDecryptedContentRequest> {
        C17567b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDecryptedContentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDecryptedContentRequest getDecryptedContentRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getDecryptedContentRequest.decrypted_tokens) + getDecryptedContentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDecryptedContentRequest decode(ProtoReader protoReader) throws IOException {
            C17566a aVar = new C17566a();
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
                    aVar.f44526a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDecryptedContentRequest getDecryptedContentRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getDecryptedContentRequest.decrypted_tokens);
            protoWriter.writeBytes(getDecryptedContentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDecryptedContentRequest$a */
    public static final class C17566a extends Message.Builder<GetDecryptedContentRequest, C17566a> {

        /* renamed from: a */
        public List<String> f44526a = Internal.newMutableList();

        /* renamed from: a */
        public GetDecryptedContentRequest build() {
            return new GetDecryptedContentRequest(this.f44526a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17566a mo61482a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44526a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17566a newBuilder() {
        C17566a aVar = new C17566a();
        aVar.f44526a = Internal.copyOf("decrypted_tokens", this.decrypted_tokens);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetDecryptedContentRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.decrypted_tokens.isEmpty()) {
            sb.append(", decrypted_tokens=");
            sb.append(this.decrypted_tokens);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDecryptedContentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDecryptedContentRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetDecryptedContentRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.decrypted_tokens = Internal.immutableCopyOf("decrypted_tokens", list);
    }
}
