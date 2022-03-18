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

public final class DeletePinRequest extends Message<DeletePinRequest, C17418a> {
    public static final ProtoAdapter<DeletePinRequest> ADAPTER = new C17419b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeletePinRequest$b */
    private static final class C17419b extends ProtoAdapter<DeletePinRequest> {
        C17419b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeletePinRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeletePinRequest deletePinRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deletePinRequest.message_id);
            if (deletePinRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, deletePinRequest.chat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deletePinRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeletePinRequest decode(ProtoReader protoReader) throws IOException {
            C17418a aVar = new C17418a();
            aVar.f44321a = "";
            aVar.f44322b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44321a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44322b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeletePinRequest deletePinRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deletePinRequest.message_id);
            if (deletePinRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deletePinRequest.chat_id);
            }
            protoWriter.writeBytes(deletePinRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeletePinRequest$a */
    public static final class C17418a extends Message.Builder<DeletePinRequest, C17418a> {

        /* renamed from: a */
        public String f44321a;

        /* renamed from: b */
        public String f44322b;

        /* renamed from: a */
        public DeletePinRequest build() {
            String str = this.f44321a;
            if (str != null) {
                return new DeletePinRequest(str, this.f44322b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C17418a mo61109a(String str) {
            this.f44321a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17418a newBuilder() {
        C17418a aVar = new C17418a();
        aVar.f44321a = this.message_id;
        aVar.f44322b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeletePinRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeletePinRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeletePinRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DeletePinRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.chat_id = str2;
    }
}
