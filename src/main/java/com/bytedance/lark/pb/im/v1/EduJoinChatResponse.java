package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class EduJoinChatResponse extends Message<EduJoinChatResponse, C17452a> {
    public static final ProtoAdapter<EduJoinChatResponse> ADAPTER = new C17453b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.EduJoinChatResponse$b */
    private static final class C17453b extends ProtoAdapter<EduJoinChatResponse> {
        C17453b() {
            super(FieldEncoding.LENGTH_DELIMITED, EduJoinChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(EduJoinChatResponse eduJoinChatResponse) {
            int i;
            if (eduJoinChatResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, eduJoinChatResponse.entity);
            } else {
                i = 0;
            }
            return i + eduJoinChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public EduJoinChatResponse decode(ProtoReader protoReader) throws IOException {
            C17452a aVar = new C17452a();
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
                    aVar.f44342a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EduJoinChatResponse eduJoinChatResponse) throws IOException {
            if (eduJoinChatResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, eduJoinChatResponse.entity);
            }
            protoWriter.writeBytes(eduJoinChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.EduJoinChatResponse$a */
    public static final class C17452a extends Message.Builder<EduJoinChatResponse, C17452a> {

        /* renamed from: a */
        public C14928Entity f44342a;

        /* renamed from: a */
        public EduJoinChatResponse build() {
            return new EduJoinChatResponse(this.f44342a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17452a newBuilder() {
        C17452a aVar = new C17452a();
        aVar.f44342a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "EduJoinChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "EduJoinChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public EduJoinChatResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public EduJoinChatResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
