package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserRelationRequest extends Message<GetUserRelationRequest, C16534a> {
    public static final ProtoAdapter<GetUserRelationRequest> ADAPTER = new C16535b();
    private static final long serialVersionUID = 0;
    public final String target_user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserRelationRequest$b */
    private static final class C16535b extends ProtoAdapter<GetUserRelationRequest> {
        C16535b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserRelationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserRelationRequest getUserRelationRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getUserRelationRequest.target_user_id) + getUserRelationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserRelationRequest decode(ProtoReader protoReader) throws IOException {
            C16534a aVar = new C16534a();
            aVar.f42890a = "";
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
                    aVar.f42890a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserRelationRequest getUserRelationRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUserRelationRequest.target_user_id);
            protoWriter.writeBytes(getUserRelationRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserRelationRequest$a */
    public static final class C16534a extends Message.Builder<GetUserRelationRequest, C16534a> {

        /* renamed from: a */
        public String f42890a;

        /* renamed from: a */
        public GetUserRelationRequest build() {
            String str = this.f42890a;
            if (str != null) {
                return new GetUserRelationRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "target_user_id");
        }

        /* renamed from: a */
        public C16534a mo58869a(String str) {
            this.f42890a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16534a newBuilder() {
        C16534a aVar = new C16534a();
        aVar.f42890a = this.target_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserRelationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", target_user_id=");
        sb.append(this.target_user_id);
        StringBuilder replace = sb.replace(0, 2, "GetUserRelationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserRelationRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetUserRelationRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_user_id = str;
    }
}
