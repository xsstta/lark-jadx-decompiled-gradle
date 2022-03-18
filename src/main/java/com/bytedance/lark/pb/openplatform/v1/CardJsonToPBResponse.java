package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CardJsonToPBResponse extends Message<CardJsonToPBResponse, C18641a> {
    public static final ProtoAdapter<CardJsonToPBResponse> ADAPTER = new C18642b();
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    public final CardContent card_content;
    public final String card_key;
    public final Integer status;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CardJsonToPBResponse$b */
    private static final class C18642b extends ProtoAdapter<CardJsonToPBResponse> {
        C18642b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardJsonToPBResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CardJsonToPBResponse cardJsonToPBResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (cardJsonToPBResponse.card_content != null) {
                i = CardContent.ADAPTER.encodedSizeWithTag(1, cardJsonToPBResponse.card_content);
            } else {
                i = 0;
            }
            if (cardJsonToPBResponse.card_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cardJsonToPBResponse.card_key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (cardJsonToPBResponse.status != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, cardJsonToPBResponse.status);
            }
            return i4 + i3 + cardJsonToPBResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CardJsonToPBResponse decode(ProtoReader protoReader) throws IOException {
            C18641a aVar = new C18641a();
            aVar.f46165b = "";
            aVar.f46166c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46164a = CardContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46165b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46166c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CardJsonToPBResponse cardJsonToPBResponse) throws IOException {
            if (cardJsonToPBResponse.card_content != null) {
                CardContent.ADAPTER.encodeWithTag(protoWriter, 1, cardJsonToPBResponse.card_content);
            }
            if (cardJsonToPBResponse.card_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cardJsonToPBResponse.card_key);
            }
            if (cardJsonToPBResponse.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, cardJsonToPBResponse.status);
            }
            protoWriter.writeBytes(cardJsonToPBResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.CardJsonToPBResponse$a */
    public static final class C18641a extends Message.Builder<CardJsonToPBResponse, C18641a> {

        /* renamed from: a */
        public CardContent f46164a;

        /* renamed from: b */
        public String f46165b;

        /* renamed from: c */
        public Integer f46166c;

        /* renamed from: a */
        public CardJsonToPBResponse build() {
            return new CardJsonToPBResponse(this.f46164a, this.f46165b, this.f46166c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18641a newBuilder() {
        C18641a aVar = new C18641a();
        aVar.f46164a = this.card_content;
        aVar.f46165b = this.card_key;
        aVar.f46166c = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "CardJsonToPBResponse");
        StringBuilder sb = new StringBuilder();
        if (this.card_content != null) {
            sb.append(", card_content=");
            sb.append(this.card_content);
        }
        if (this.card_key != null) {
            sb.append(", card_key=");
            sb.append(this.card_key);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "CardJsonToPBResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CardJsonToPBResponse(CardContent cardContent, String str, Integer num) {
        this(cardContent, str, num, ByteString.EMPTY);
    }

    public CardJsonToPBResponse(CardContent cardContent, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_content = cardContent;
        this.card_key = str;
        this.status = num;
    }
}
