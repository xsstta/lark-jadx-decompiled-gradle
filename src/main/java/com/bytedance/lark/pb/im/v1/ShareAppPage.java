package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ShareAppPage extends Message<ShareAppPage, C18059a> {
    public static final ProtoAdapter<ShareAppPage> ADAPTER = new C18060b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final CardLink card_link;
    public final String img_key;
    public final String img_url;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAppPage$b */
    private static final class C18060b extends ProtoAdapter<ShareAppPage> {
        C18060b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAppPage.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAppPage shareAppPage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (shareAppPage.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareAppPage.app_id);
            } else {
                i = 0;
            }
            if (shareAppPage.card_link != null) {
                i2 = CardLink.ADAPTER.encodedSizeWithTag(2, shareAppPage.card_link);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (shareAppPage.title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareAppPage.title);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (shareAppPage.img_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, shareAppPage.img_key);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (shareAppPage.img_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, shareAppPage.img_url);
            }
            return i8 + i5 + shareAppPage.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAppPage decode(ProtoReader protoReader) throws IOException {
            C18059a aVar = new C18059a();
            aVar.f45181a = "";
            aVar.f45183c = "";
            aVar.f45184d = "";
            aVar.f45185e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45181a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45182b = CardLink.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45183c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45184d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45185e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAppPage shareAppPage) throws IOException {
            if (shareAppPage.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareAppPage.app_id);
            }
            if (shareAppPage.card_link != null) {
                CardLink.ADAPTER.encodeWithTag(protoWriter, 2, shareAppPage.card_link);
            }
            if (shareAppPage.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareAppPage.title);
            }
            if (shareAppPage.img_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareAppPage.img_key);
            }
            if (shareAppPage.img_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, shareAppPage.img_url);
            }
            protoWriter.writeBytes(shareAppPage.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAppPage$a */
    public static final class C18059a extends Message.Builder<ShareAppPage, C18059a> {

        /* renamed from: a */
        public String f45181a;

        /* renamed from: b */
        public CardLink f45182b;

        /* renamed from: c */
        public String f45183c;

        /* renamed from: d */
        public String f45184d;

        /* renamed from: e */
        public String f45185e;

        /* renamed from: a */
        public ShareAppPage build() {
            return new ShareAppPage(this.f45181a, this.f45182b, this.f45183c, this.f45184d, this.f45185e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18059a newBuilder() {
        C18059a aVar = new C18059a();
        aVar.f45181a = this.app_id;
        aVar.f45182b = this.card_link;
        aVar.f45183c = this.title;
        aVar.f45184d = this.img_key;
        aVar.f45185e = this.img_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareAppPage");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
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
        if (this.img_url != null) {
            sb.append(", img_url=");
            sb.append(this.img_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareAppPage{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAppPage(String str, CardLink cardLink, String str2, String str3, String str4) {
        this(str, cardLink, str2, str3, str4, ByteString.EMPTY);
    }

    public ShareAppPage(String str, CardLink cardLink, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.card_link = cardLink;
        this.title = str2;
        this.img_key = str3;
        this.img_url = str4;
    }
}
