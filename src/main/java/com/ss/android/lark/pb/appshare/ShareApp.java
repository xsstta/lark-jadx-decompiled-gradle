package com.ss.android.lark.pb.appshare;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShareApp extends Message<ShareApp, C49541a> {
    public static final ProtoAdapter<ShareApp> ADAPTER = new C49542b();
    private static final long serialVersionUID = 0;
    public final String mapp_id;
    public final CardLink mcard_link;
    public final List<Long> mchat_ids;
    public final List<String> mchat_ids_str;

    /* renamed from: com.ss.android.lark.pb.appshare.ShareApp$b */
    private static final class C49542b extends ProtoAdapter<ShareApp> {
        C49542b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareApp.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareApp shareApp) {
            int i;
            int i2 = 0;
            if (shareApp.mapp_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareApp.mapp_id);
            } else {
                i = 0;
            }
            if (shareApp.mcard_link != null) {
                i2 = CardLink.ADAPTER.encodedSizeWithTag(2, shareApp.mcard_link);
            }
            return i + i2 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, shareApp.mchat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, shareApp.mchat_ids_str) + shareApp.unknownFields().size();
        }

        /* renamed from: a */
        public ShareApp decode(ProtoReader protoReader) throws IOException {
            C49541a aVar = new C49541a();
            aVar.f124140a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124140a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124141b = CardLink.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124142c.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124143d.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareApp shareApp) throws IOException {
            if (shareApp.mapp_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareApp.mapp_id);
            }
            if (shareApp.mcard_link != null) {
                CardLink.ADAPTER.encodeWithTag(protoWriter, 2, shareApp.mcard_link);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 3, shareApp.mchat_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, shareApp.mchat_ids_str);
            protoWriter.writeBytes(shareApp.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.appshare.ShareApp$a */
    public static final class C49541a extends Message.Builder<ShareApp, C49541a> {

        /* renamed from: a */
        public String f124140a;

        /* renamed from: b */
        public CardLink f124141b;

        /* renamed from: c */
        public List<Long> f124142c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f124143d = Internal.newMutableList();

        /* renamed from: a */
        public ShareApp build() {
            return new ShareApp(this.f124140a, this.f124141b, this.f124142c, this.f124143d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49541a mo172767a(CardLink cardLink) {
            this.f124141b = cardLink;
            return this;
        }

        /* renamed from: a */
        public C49541a mo172768a(String str) {
            this.f124140a = str;
            return this;
        }

        /* renamed from: a */
        public C49541a mo172769a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124143d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49541a newBuilder() {
        C49541a aVar = new C49541a();
        aVar.f124140a = this.mapp_id;
        aVar.f124141b = this.mcard_link;
        aVar.f124142c = Internal.copyOf("mchat_ids", this.mchat_ids);
        aVar.f124143d = Internal.copyOf("mchat_ids_str", this.mchat_ids_str);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mapp_id != null) {
            sb.append(", app_id=");
            sb.append(this.mapp_id);
        }
        if (this.mcard_link != null) {
            sb.append(", card_link=");
            sb.append(this.mcard_link);
        }
        if (!this.mchat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.mchat_ids);
        }
        if (!this.mchat_ids_str.isEmpty()) {
            sb.append(", chat_ids_str=");
            sb.append(this.mchat_ids_str);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareApp{");
        replace.append('}');
        return replace.toString();
    }

    public ShareApp(String str, CardLink cardLink, List<Long> list, List<String> list2) {
        this(str, cardLink, list, list2, ByteString.EMPTY);
    }

    public ShareApp(String str, CardLink cardLink, List<Long> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mapp_id = str;
        this.mcard_link = cardLink;
        this.mchat_ids = Internal.immutableCopyOf("mchat_ids", list);
        this.mchat_ids_str = Internal.immutableCopyOf("mchat_ids_str", list2);
    }
}
