package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class DeleteReactionRequest extends Message<DeleteReactionRequest, C17424a> {
    public static final ProtoAdapter<DeleteReactionRequest> ADAPTER = new C17425b();
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final String type;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteReactionRequest$b */
    private static final class C17425b extends ProtoAdapter<DeleteReactionRequest> {
        C17425b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteReactionRequest deleteReactionRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteReactionRequest.message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, deleteReactionRequest.type) + deleteReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteReactionRequest decode(ProtoReader protoReader) throws IOException {
            C17424a aVar = new C17424a();
            aVar.f44324a = "";
            aVar.f44325b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44324a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44325b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteReactionRequest deleteReactionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteReactionRequest.message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteReactionRequest.type);
            protoWriter.writeBytes(deleteReactionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17424a newBuilder() {
        C17424a aVar = new C17424a();
        aVar.f44324a = this.message_id;
        aVar.f44325b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteReactionRequest$a */
    public static final class C17424a extends Message.Builder<DeleteReactionRequest, C17424a> {

        /* renamed from: a */
        public String f44324a;

        /* renamed from: b */
        public String f44325b;

        /* renamed from: a */
        public DeleteReactionRequest build() {
            String str;
            String str2 = this.f44324a;
            if (str2 != null && (str = this.f44325b) != null) {
                return new DeleteReactionRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "message_id", this.f44325b, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C17424a mo61123a(String str) {
            this.f44324a = str;
            return this;
        }

        /* renamed from: b */
        public C17424a mo61125b(String str) {
            this.f44325b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteReactionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "DeleteReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteReactionRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DeleteReactionRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.type = str2;
    }
}
