package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ShareH5 extends Message<ShareH5, C18067a> {
    public static final ProtoAdapter<ShareH5> ADAPTER = new C18068b();
    private static final long serialVersionUID = 0;
    public final CardLink card_link;
    public final String description;
    public final String img_key;
    public final String img_url;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareH5$b */
    private static final class C18068b extends ProtoAdapter<ShareH5> {
        C18068b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareH5.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareH5 shareH5) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (shareH5.card_link != null) {
                i = CardLink.ADAPTER.encodedSizeWithTag(1, shareH5.card_link);
            } else {
                i = 0;
            }
            if (shareH5.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, shareH5.title);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (shareH5.img_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareH5.img_key);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (shareH5.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, shareH5.description);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (shareH5.img_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, shareH5.img_url);
            }
            return i8 + i5 + shareH5.unknownFields().size();
        }

        /* renamed from: a */
        public ShareH5 decode(ProtoReader protoReader) throws IOException {
            C18067a aVar = new C18067a();
            aVar.f45193b = "";
            aVar.f45194c = "";
            aVar.f45195d = "";
            aVar.f45196e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45192a = CardLink.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45193b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45194c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45195d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45196e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareH5 shareH5) throws IOException {
            if (shareH5.card_link != null) {
                CardLink.ADAPTER.encodeWithTag(protoWriter, 1, shareH5.card_link);
            }
            if (shareH5.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareH5.title);
            }
            if (shareH5.img_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareH5.img_key);
            }
            if (shareH5.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareH5.description);
            }
            if (shareH5.img_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, shareH5.img_url);
            }
            protoWriter.writeBytes(shareH5.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareH5$a */
    public static final class C18067a extends Message.Builder<ShareH5, C18067a> {

        /* renamed from: a */
        public CardLink f45192a;

        /* renamed from: b */
        public String f45193b;

        /* renamed from: c */
        public String f45194c;

        /* renamed from: d */
        public String f45195d;

        /* renamed from: e */
        public String f45196e;

        /* renamed from: a */
        public ShareH5 build() {
            return new ShareH5(this.f45192a, this.f45193b, this.f45194c, this.f45195d, this.f45196e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18067a newBuilder() {
        C18067a aVar = new C18067a();
        aVar.f45192a = this.card_link;
        aVar.f45193b = this.title;
        aVar.f45194c = this.img_key;
        aVar.f45195d = this.description;
        aVar.f45196e = this.img_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareH5");
        StringBuilder sb = new StringBuilder();
        if (this.card_link != null) {
            sb.append(", card_link=");
            sb.append(this.card_link);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.img_key != null) {
            sb.append(", img_key=");
            sb.append(this.img_key);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.img_url != null) {
            sb.append(", img_url=");
            sb.append(this.img_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareH5{");
        replace.append('}');
        return replace.toString();
    }

    public ShareH5(CardLink cardLink, String str, String str2, String str3, String str4) {
        this(cardLink, str, str2, str3, str4, ByteString.EMPTY);
    }

    public ShareH5(CardLink cardLink, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_link = cardLink;
        this.title = str;
        this.img_key = str2;
        this.description = str3;
        this.img_url = str4;
    }
}
