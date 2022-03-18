package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CardJsonToPBRequest extends Message<CardJsonToPBRequest, C18639a> {
    public static final ProtoAdapter<CardJsonToPBRequest> ADAPTER = new C18640b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String chat_id;
    public final String json_str;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CardJsonToPBRequest$b */
    private static final class C18640b extends ProtoAdapter<CardJsonToPBRequest> {
        C18640b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardJsonToPBRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CardJsonToPBRequest cardJsonToPBRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (cardJsonToPBRequest.json_str != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, cardJsonToPBRequest.json_str);
            } else {
                i = 0;
            }
            if (cardJsonToPBRequest.app_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cardJsonToPBRequest.app_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (cardJsonToPBRequest.chat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, cardJsonToPBRequest.chat_id);
            }
            return i4 + i3 + cardJsonToPBRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CardJsonToPBRequest decode(ProtoReader protoReader) throws IOException {
            C18639a aVar = new C18639a();
            aVar.f46161a = "";
            aVar.f46162b = "";
            aVar.f46163c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46161a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46162b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46163c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CardJsonToPBRequest cardJsonToPBRequest) throws IOException {
            if (cardJsonToPBRequest.json_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardJsonToPBRequest.json_str);
            }
            if (cardJsonToPBRequest.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cardJsonToPBRequest.app_id);
            }
            if (cardJsonToPBRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cardJsonToPBRequest.chat_id);
            }
            protoWriter.writeBytes(cardJsonToPBRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CardJsonToPBRequest$a */
    public static final class C18639a extends Message.Builder<CardJsonToPBRequest, C18639a> {

        /* renamed from: a */
        public String f46161a;

        /* renamed from: b */
        public String f46162b;

        /* renamed from: c */
        public String f46163c;

        /* renamed from: a */
        public CardJsonToPBRequest build() {
            return new CardJsonToPBRequest(this.f46161a, this.f46162b, this.f46163c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18639a mo64190a(String str) {
            this.f46161a = str;
            return this;
        }

        /* renamed from: b */
        public C18639a mo64192b(String str) {
            this.f46162b = str;
            return this;
        }

        /* renamed from: c */
        public C18639a mo64193c(String str) {
            this.f46163c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18639a newBuilder() {
        C18639a aVar = new C18639a();
        aVar.f46161a = this.json_str;
        aVar.f46162b = this.app_id;
        aVar.f46163c = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "CardJsonToPBRequest");
        StringBuilder sb = new StringBuilder();
        if (this.json_str != null) {
            sb.append(", json_str=");
            sb.append(this.json_str);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CardJsonToPBRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CardJsonToPBRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public CardJsonToPBRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.json_str = str;
        this.app_id = str2;
        this.chat_id = str3;
    }
}
