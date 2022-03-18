package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ShareApp extends Message<ShareApp, C18053a> {
    public static final ProtoAdapter<ShareApp> ADAPTER = new C18054b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final CardLink card_link;

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareApp$b */
    private static final class C18054b extends ProtoAdapter<ShareApp> {
        C18054b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareApp.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareApp shareApp) {
            int i;
            int i2 = 0;
            if (shareApp.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareApp.app_id);
            } else {
                i = 0;
            }
            if (shareApp.card_link != null) {
                i2 = CardLink.ADAPTER.encodedSizeWithTag(2, shareApp.card_link);
            }
            return i + i2 + shareApp.unknownFields().size();
        }

        /* renamed from: a */
        public ShareApp decode(ProtoReader protoReader) throws IOException {
            C18053a aVar = new C18053a();
            aVar.f45167a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45167a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45168b = CardLink.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareApp shareApp) throws IOException {
            if (shareApp.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareApp.app_id);
            }
            if (shareApp.card_link != null) {
                CardLink.ADAPTER.encodeWithTag(protoWriter, 2, shareApp.card_link);
            }
            protoWriter.writeBytes(shareApp.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareApp$a */
    public static final class C18053a extends Message.Builder<ShareApp, C18053a> {

        /* renamed from: a */
        public String f45167a;

        /* renamed from: b */
        public CardLink f45168b;

        /* renamed from: a */
        public ShareApp build() {
            return new ShareApp(this.f45167a, this.f45168b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18053a newBuilder() {
        C18053a aVar = new C18053a();
        aVar.f45167a = this.app_id;
        aVar.f45168b = this.card_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareApp");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.card_link != null) {
            sb.append(", card_link=");
            sb.append(this.card_link);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareApp{");
        replace.append('}');
        return replace.toString();
    }

    public ShareApp(String str, CardLink cardLink) {
        this(str, cardLink, ByteString.EMPTY);
    }

    public ShareApp(String str, CardLink cardLink, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.card_link = cardLink;
    }
}
