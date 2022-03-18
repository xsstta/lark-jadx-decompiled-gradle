package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CardAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CardActionPacket extends Message<CardActionPacket, C14734a> {
    public static final ProtoAdapter<CardActionPacket> ADAPTER = new C14735b();
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final CardAction.Parameters parameters;
    public final ByteString payload;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardActionPacket$b */
    private static final class C14735b extends ProtoAdapter<CardActionPacket> {
        C14735b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardActionPacket.class);
        }

        /* renamed from: a */
        public int encodedSize(CardActionPacket cardActionPacket) {
            int i;
            int i2;
            int i3 = 0;
            if (cardActionPacket.cid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, cardActionPacket.cid);
            } else {
                i = 0;
            }
            if (cardActionPacket.parameters != null) {
                i2 = CardAction.Parameters.ADAPTER.encodedSizeWithTag(2, cardActionPacket.parameters);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (cardActionPacket.payload != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, cardActionPacket.payload);
            }
            return i4 + i3 + cardActionPacket.unknownFields().size();
        }

        /* renamed from: a */
        public CardActionPacket decode(ProtoReader protoReader) throws IOException {
            C14734a aVar = new C14734a();
            aVar.f38963a = "";
            aVar.f38965c = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38963a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38964b = CardAction.Parameters.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38965c = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CardActionPacket cardActionPacket) throws IOException {
            if (cardActionPacket.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardActionPacket.cid);
            }
            if (cardActionPacket.parameters != null) {
                CardAction.Parameters.ADAPTER.encodeWithTag(protoWriter, 2, cardActionPacket.parameters);
            }
            if (cardActionPacket.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, cardActionPacket.payload);
            }
            protoWriter.writeBytes(cardActionPacket.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardActionPacket$a */
    public static final class C14734a extends Message.Builder<CardActionPacket, C14734a> {

        /* renamed from: a */
        public String f38963a;

        /* renamed from: b */
        public CardAction.Parameters f38964b;

        /* renamed from: c */
        public ByteString f38965c;

        /* renamed from: a */
        public CardActionPacket build() {
            return new CardActionPacket(this.f38963a, this.f38964b, this.f38965c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14734a mo54219a(CardAction.Parameters parameters) {
            this.f38964b = parameters;
            return this;
        }

        /* renamed from: a */
        public C14734a mo54220a(String str) {
            this.f38963a = str;
            return this;
        }

        /* renamed from: a */
        public C14734a mo54221a(ByteString byteString) {
            this.f38965c = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14734a newBuilder() {
        C14734a aVar = new C14734a();
        aVar.f38963a = this.cid;
        aVar.f38964b = this.parameters;
        aVar.f38965c = this.payload;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CardActionPacket");
        StringBuilder sb = new StringBuilder();
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.parameters != null) {
            sb.append(", parameters=");
            sb.append(this.parameters);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        StringBuilder replace = sb.replace(0, 2, "CardActionPacket{");
        replace.append('}');
        return replace.toString();
    }

    public CardActionPacket(String str, CardAction.Parameters parameters2, ByteString byteString) {
        this(str, parameters2, byteString, ByteString.EMPTY);
    }

    public CardActionPacket(String str, CardAction.Parameters parameters2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.cid = str;
        this.parameters = parameters2;
        this.payload = byteString;
    }
}
