package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CardLink extends Message<CardLink, C17306a> {
    public static final ProtoAdapter<CardLink> ADAPTER = new C17307b();
    private static final long serialVersionUID = 0;
    public final String android_href;
    public final String href;
    public final String ios_href;
    public final String pc_href;

    /* renamed from: com.bytedance.lark.pb.im.v1.CardLink$b */
    private static final class C17307b extends ProtoAdapter<CardLink> {
        C17307b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardLink.class);
        }

        /* renamed from: a */
        public int encodedSize(CardLink cardLink) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (cardLink.href != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, cardLink.href);
            } else {
                i = 0;
            }
            if (cardLink.ios_href != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cardLink.ios_href);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (cardLink.android_href != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, cardLink.android_href);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (cardLink.pc_href != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, cardLink.pc_href);
            }
            return i6 + i4 + cardLink.unknownFields().size();
        }

        /* renamed from: a */
        public CardLink decode(ProtoReader protoReader) throws IOException {
            C17306a aVar = new C17306a();
            aVar.f44149a = "";
            aVar.f44150b = "";
            aVar.f44151c = "";
            aVar.f44152d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44149a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44150b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44151c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44152d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CardLink cardLink) throws IOException {
            if (cardLink.href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardLink.href);
            }
            if (cardLink.ios_href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cardLink.ios_href);
            }
            if (cardLink.android_href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cardLink.android_href);
            }
            if (cardLink.pc_href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, cardLink.pc_href);
            }
            protoWriter.writeBytes(cardLink.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CardLink$a */
    public static final class C17306a extends Message.Builder<CardLink, C17306a> {

        /* renamed from: a */
        public String f44149a;

        /* renamed from: b */
        public String f44150b;

        /* renamed from: c */
        public String f44151c;

        /* renamed from: d */
        public String f44152d;

        /* renamed from: a */
        public CardLink build() {
            return new CardLink(this.f44149a, this.f44150b, this.f44151c, this.f44152d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17306a newBuilder() {
        C17306a aVar = new C17306a();
        aVar.f44149a = this.href;
        aVar.f44150b = this.ios_href;
        aVar.f44151c = this.android_href;
        aVar.f44152d = this.pc_href;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CardLink");
        StringBuilder sb = new StringBuilder();
        if (this.href != null) {
            sb.append(", href=");
            sb.append(this.href);
        }
        if (this.ios_href != null) {
            sb.append(", ios_href=");
            sb.append(this.ios_href);
        }
        if (this.android_href != null) {
            sb.append(", android_href=");
            sb.append(this.android_href);
        }
        if (this.pc_href != null) {
            sb.append(", pc_href=");
            sb.append(this.pc_href);
        }
        StringBuilder replace = sb.replace(0, 2, "CardLink{");
        replace.append('}');
        return replace.toString();
    }

    public CardLink(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public CardLink(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.href = str;
        this.ios_href = str2;
        this.android_href = str3;
        this.pc_href = str4;
    }
}
