package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdatePinReadRequest extends Message<UpdatePinReadRequest, C18156a> {
    public static final ProtoAdapter<UpdatePinReadRequest> ADAPTER = new C18157b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdatePinReadRequest$b */
    private static final class C18157b extends ProtoAdapter<UpdatePinReadRequest> {
        C18157b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdatePinReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdatePinReadRequest updatePinReadRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updatePinReadRequest.chat_id) + updatePinReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdatePinReadRequest decode(ProtoReader protoReader) throws IOException {
            C18156a aVar = new C18156a();
            aVar.f45356a = "";
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
                    aVar.f45356a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdatePinReadRequest updatePinReadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updatePinReadRequest.chat_id);
            protoWriter.writeBytes(updatePinReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdatePinReadRequest$a */
    public static final class C18156a extends Message.Builder<UpdatePinReadRequest, C18156a> {

        /* renamed from: a */
        public String f45356a;

        /* renamed from: a */
        public UpdatePinReadRequest build() {
            String str = this.f45356a;
            if (str != null) {
                return new UpdatePinReadRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C18156a mo62981a(String str) {
            this.f45356a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18156a newBuilder() {
        C18156a aVar = new C18156a();
        aVar.f45356a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdatePinReadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "UpdatePinReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdatePinReadRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdatePinReadRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
