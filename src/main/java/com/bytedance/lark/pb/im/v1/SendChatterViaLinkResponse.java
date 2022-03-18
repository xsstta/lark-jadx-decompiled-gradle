package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SendChatterViaLinkResponse extends Message<SendChatterViaLinkResponse, C18015a> {
    public static final ProtoAdapter<SendChatterViaLinkResponse> ADAPTER = new C18016b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendChatterViaLinkResponse$b */
    private static final class C18016b extends ProtoAdapter<SendChatterViaLinkResponse> {
        C18016b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendChatterViaLinkResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendChatterViaLinkResponse sendChatterViaLinkResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendChatterViaLinkResponse.chat_id) + C14928Entity.ADAPTER.encodedSizeWithTag(2, sendChatterViaLinkResponse.entity) + sendChatterViaLinkResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendChatterViaLinkResponse decode(ProtoReader protoReader) throws IOException {
            C18015a aVar = new C18015a();
            aVar.f45120a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45120a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45121b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendChatterViaLinkResponse sendChatterViaLinkResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendChatterViaLinkResponse.chat_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, sendChatterViaLinkResponse.entity);
            protoWriter.writeBytes(sendChatterViaLinkResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18015a newBuilder() {
        C18015a aVar = new C18015a();
        aVar.f45120a = this.chat_id;
        aVar.f45121b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendChatterViaLinkResponse$a */
    public static final class C18015a extends Message.Builder<SendChatterViaLinkResponse, C18015a> {

        /* renamed from: a */
        public String f45120a;

        /* renamed from: b */
        public C14928Entity f45121b;

        /* renamed from: a */
        public SendChatterViaLinkResponse build() {
            C14928Entity entity;
            String str = this.f45120a;
            if (str != null && (entity = this.f45121b) != null) {
                return new SendChatterViaLinkResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f45121b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendChatterViaLinkResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "SendChatterViaLinkResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendChatterViaLinkResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public SendChatterViaLinkResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
    }
}
