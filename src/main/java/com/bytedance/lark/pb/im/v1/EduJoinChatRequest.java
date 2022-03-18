package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class EduJoinChatRequest extends Message<EduJoinChatRequest, C17450a> {
    public static final ProtoAdapter<EduJoinChatRequest> ADAPTER = new C17451b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String class_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.EduJoinChatRequest$b */
    private static final class C17451b extends ProtoAdapter<EduJoinChatRequest> {
        C17451b() {
            super(FieldEncoding.LENGTH_DELIMITED, EduJoinChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(EduJoinChatRequest eduJoinChatRequest) {
            int i;
            int i2 = 0;
            if (eduJoinChatRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, eduJoinChatRequest.chat_id);
            } else {
                i = 0;
            }
            if (eduJoinChatRequest.class_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eduJoinChatRequest.class_id);
            }
            return i + i2 + eduJoinChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public EduJoinChatRequest decode(ProtoReader protoReader) throws IOException {
            C17450a aVar = new C17450a();
            aVar.f44340a = "";
            aVar.f44341b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44340a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44341b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EduJoinChatRequest eduJoinChatRequest) throws IOException {
            if (eduJoinChatRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eduJoinChatRequest.chat_id);
            }
            if (eduJoinChatRequest.class_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eduJoinChatRequest.class_id);
            }
            protoWriter.writeBytes(eduJoinChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.EduJoinChatRequest$a */
    public static final class C17450a extends Message.Builder<EduJoinChatRequest, C17450a> {

        /* renamed from: a */
        public String f44340a;

        /* renamed from: b */
        public String f44341b;

        /* renamed from: a */
        public EduJoinChatRequest build() {
            return new EduJoinChatRequest(this.f44340a, this.f44341b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17450a mo61184a(String str) {
            this.f44340a = str;
            return this;
        }

        /* renamed from: b */
        public C17450a mo61186b(String str) {
            this.f44341b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17450a newBuilder() {
        C17450a aVar = new C17450a();
        aVar.f44340a = this.chat_id;
        aVar.f44341b = this.class_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "EduJoinChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.class_id != null) {
            sb.append(", class_id=");
            sb.append(this.class_id);
        }
        StringBuilder replace = sb.replace(0, 2, "EduJoinChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public EduJoinChatRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public EduJoinChatRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.class_id = str2;
    }
}
