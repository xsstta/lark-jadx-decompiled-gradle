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

public final class CreateOrDeleteChatLastDraftIdRequest extends Message<CreateOrDeleteChatLastDraftIdRequest, C17364a> {
    public static final ProtoAdapter<CreateOrDeleteChatLastDraftIdRequest> ADAPTER = new C17365b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String draft_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateOrDeleteChatLastDraftIdRequest$b */
    private static final class C17365b extends ProtoAdapter<CreateOrDeleteChatLastDraftIdRequest> {
        C17365b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateOrDeleteChatLastDraftIdRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateOrDeleteChatLastDraftIdRequest createOrDeleteChatLastDraftIdRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createOrDeleteChatLastDraftIdRequest.chat_id);
            if (createOrDeleteChatLastDraftIdRequest.draft_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, createOrDeleteChatLastDraftIdRequest.draft_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + createOrDeleteChatLastDraftIdRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateOrDeleteChatLastDraftIdRequest decode(ProtoReader protoReader) throws IOException {
            C17364a aVar = new C17364a();
            aVar.f44246a = "";
            aVar.f44247b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44246a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44247b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateOrDeleteChatLastDraftIdRequest createOrDeleteChatLastDraftIdRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createOrDeleteChatLastDraftIdRequest.chat_id);
            if (createOrDeleteChatLastDraftIdRequest.draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createOrDeleteChatLastDraftIdRequest.draft_id);
            }
            protoWriter.writeBytes(createOrDeleteChatLastDraftIdRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateOrDeleteChatLastDraftIdRequest$a */
    public static final class C17364a extends Message.Builder<CreateOrDeleteChatLastDraftIdRequest, C17364a> {

        /* renamed from: a */
        public String f44246a;

        /* renamed from: b */
        public String f44247b;

        /* renamed from: a */
        public CreateOrDeleteChatLastDraftIdRequest build() {
            String str = this.f44246a;
            if (str != null) {
                return new CreateOrDeleteChatLastDraftIdRequest(str, this.f44247b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17364a mo60951a(String str) {
            this.f44246a = str;
            return this;
        }

        /* renamed from: b */
        public C17364a mo60953b(String str) {
            this.f44247b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17364a newBuilder() {
        C17364a aVar = new C17364a();
        aVar.f44246a = this.chat_id;
        aVar.f44247b = this.draft_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateOrDeleteChatLastDraftIdRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.draft_id != null) {
            sb.append(", draft_id=");
            sb.append(this.draft_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateOrDeleteChatLastDraftIdRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateOrDeleteChatLastDraftIdRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CreateOrDeleteChatLastDraftIdRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.draft_id = str2;
    }
}
