package com.ss.android.lark.pb.appshare;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CardLink extends Message<CardLink, C49539a> {
    public static final ProtoAdapter<CardLink> ADAPTER = new C49540b();
    private static final long serialVersionUID = 0;
    public final String mandroid_href;
    public final String mhref;
    public final String mios_href;
    public final String mpc_href;

    /* renamed from: com.ss.android.lark.pb.appshare.CardLink$b */
    private static final class C49540b extends ProtoAdapter<CardLink> {
        C49540b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardLink.class);
        }

        /* renamed from: a */
        public int encodedSize(CardLink cardLink) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (cardLink.mhref != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, cardLink.mhref);
            } else {
                i = 0;
            }
            if (cardLink.mios_href != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cardLink.mios_href);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (cardLink.mandroid_href != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, cardLink.mandroid_href);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (cardLink.mpc_href != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, cardLink.mpc_href);
            }
            return i6 + i4 + cardLink.unknownFields().size();
        }

        /* renamed from: a */
        public CardLink decode(ProtoReader protoReader) throws IOException {
            C49539a aVar = new C49539a();
            aVar.f124136a = "";
            aVar.f124137b = "";
            aVar.f124138c = "";
            aVar.f124139d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124136a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124137b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124138c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124139d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CardLink cardLink) throws IOException {
            if (cardLink.mhref != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardLink.mhref);
            }
            if (cardLink.mios_href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cardLink.mios_href);
            }
            if (cardLink.mandroid_href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cardLink.mandroid_href);
            }
            if (cardLink.mpc_href != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, cardLink.mpc_href);
            }
            protoWriter.writeBytes(cardLink.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.appshare.CardLink$a */
    public static final class C49539a extends Message.Builder<CardLink, C49539a> {

        /* renamed from: a */
        public String f124136a;

        /* renamed from: b */
        public String f124137b;

        /* renamed from: c */
        public String f124138c;

        /* renamed from: d */
        public String f124139d;

        /* renamed from: a */
        public CardLink build() {
            return new CardLink(this.f124136a, this.f124137b, this.f124138c, this.f124139d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49539a newBuilder() {
        C49539a aVar = new C49539a();
        aVar.f124136a = this.mhref;
        aVar.f124137b = this.mios_href;
        aVar.f124138c = this.mandroid_href;
        aVar.f124139d = this.mpc_href;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mhref != null) {
            sb.append(", href=");
            sb.append(this.mhref);
        }
        if (this.mios_href != null) {
            sb.append(", ios_href=");
            sb.append(this.mios_href);
        }
        if (this.mandroid_href != null) {
            sb.append(", android_href=");
            sb.append(this.mandroid_href);
        }
        if (this.mpc_href != null) {
            sb.append(", pc_href=");
            sb.append(this.mpc_href);
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
        this.mhref = str;
        this.mios_href = str2;
        this.mandroid_href = str3;
        this.mpc_href = str4;
    }
}
