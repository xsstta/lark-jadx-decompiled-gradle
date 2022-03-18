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

public final class JoinFaceToFaceChatRequest extends Message<JoinFaceToFaceChatRequest, C17789a> {
    public static final ProtoAdapter<JoinFaceToFaceChatRequest> ADAPTER = new C17790b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatRequest$b */
    private static final class C17790b extends ProtoAdapter<JoinFaceToFaceChatRequest> {
        C17790b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinFaceToFaceChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinFaceToFaceChatRequest joinFaceToFaceChatRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, joinFaceToFaceChatRequest.token) + joinFaceToFaceChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JoinFaceToFaceChatRequest decode(ProtoReader protoReader) throws IOException {
            C17789a aVar = new C17789a();
            aVar.f44832a = "";
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
                    aVar.f44832a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinFaceToFaceChatRequest joinFaceToFaceChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, joinFaceToFaceChatRequest.token);
            protoWriter.writeBytes(joinFaceToFaceChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.JoinFaceToFaceChatRequest$a */
    public static final class C17789a extends Message.Builder<JoinFaceToFaceChatRequest, C17789a> {

        /* renamed from: a */
        public String f44832a;

        /* renamed from: a */
        public JoinFaceToFaceChatRequest build() {
            String str = this.f44832a;
            if (str != null) {
                return new JoinFaceToFaceChatRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "token");
        }

        /* renamed from: a */
        public C17789a mo62035a(String str) {
            this.f44832a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17789a newBuilder() {
        C17789a aVar = new C17789a();
        aVar.f44832a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "JoinFaceToFaceChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        StringBuilder replace = sb.replace(0, 2, "JoinFaceToFaceChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JoinFaceToFaceChatRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public JoinFaceToFaceChatRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
