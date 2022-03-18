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

public final class ShareAppPage extends Message<ShareAppPage, C49547a> {
    public static final ProtoAdapter<ShareAppPage> ADAPTER = new C49548b();
    private static final long serialVersionUID = 0;
    public final String mapp_id;
    public final CardLink mcard_link;
    public final List<Long> mchat_ids;
    public final List<String> mchat_ids_str;
    public final String mimg_key;
    public final String mimg_url;
    public final String mtitle;

    /* renamed from: com.ss.android.lark.pb.appshare.ShareAppPage$b */
    private static final class C49548b extends ProtoAdapter<ShareAppPage> {
        C49548b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAppPage.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAppPage shareAppPage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (shareAppPage.mapp_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareAppPage.mapp_id);
            } else {
                i = 0;
            }
            if (shareAppPage.mcard_link != null) {
                i2 = CardLink.ADAPTER.encodedSizeWithTag(2, shareAppPage.mcard_link);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (shareAppPage.mtitle != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareAppPage.mtitle);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (shareAppPage.mimg_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, shareAppPage.mimg_key);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (shareAppPage.mimg_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, shareAppPage.mimg_url);
            }
            return i8 + i5 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(6, shareAppPage.mchat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, shareAppPage.mchat_ids_str) + shareAppPage.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAppPage decode(ProtoReader protoReader) throws IOException {
            C49547a aVar = new C49547a();
            aVar.f124148a = "";
            aVar.f124150c = "";
            aVar.f124151d = "";
            aVar.f124152e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124148a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124149b = CardLink.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124150c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124151d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124152e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124153f.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124154g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAppPage shareAppPage) throws IOException {
            if (shareAppPage.mapp_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareAppPage.mapp_id);
            }
            if (shareAppPage.mcard_link != null) {
                CardLink.ADAPTER.encodeWithTag(protoWriter, 2, shareAppPage.mcard_link);
            }
            if (shareAppPage.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareAppPage.mtitle);
            }
            if (shareAppPage.mimg_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareAppPage.mimg_key);
            }
            if (shareAppPage.mimg_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, shareAppPage.mimg_url);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 6, shareAppPage.mchat_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, shareAppPage.mchat_ids_str);
            protoWriter.writeBytes(shareAppPage.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.appshare.ShareAppPage$a */
    public static final class C49547a extends Message.Builder<ShareAppPage, C49547a> {

        /* renamed from: a */
        public String f124148a;

        /* renamed from: b */
        public CardLink f124149b;

        /* renamed from: c */
        public String f124150c;

        /* renamed from: d */
        public String f124151d;

        /* renamed from: e */
        public String f124152e;

        /* renamed from: f */
        public List<Long> f124153f = Internal.newMutableList();

        /* renamed from: g */
        public List<String> f124154g = Internal.newMutableList();

        /* renamed from: a */
        public ShareAppPage build() {
            return new ShareAppPage(this.f124148a, this.f124149b, this.f124150c, this.f124151d, this.f124152e, this.f124153f, this.f124154g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49547a mo172786a(CardLink cardLink) {
            this.f124149b = cardLink;
            return this;
        }

        /* renamed from: b */
        public C49547a mo172790b(String str) {
            this.f124150c = str;
            return this;
        }

        /* renamed from: c */
        public C49547a mo172791c(String str) {
            this.f124151d = str;
            return this;
        }

        /* renamed from: a */
        public C49547a mo172787a(String str) {
            this.f124148a = str;
            return this;
        }

        /* renamed from: a */
        public C49547a mo172788a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124154g = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49547a newBuilder() {
        C49547a aVar = new C49547a();
        aVar.f124148a = this.mapp_id;
        aVar.f124149b = this.mcard_link;
        aVar.f124150c = this.mtitle;
        aVar.f124151d = this.mimg_key;
        aVar.f124152e = this.mimg_url;
        aVar.f124153f = Internal.copyOf("mchat_ids", this.mchat_ids);
        aVar.f124154g = Internal.copyOf("mchat_ids_str", this.mchat_ids_str);
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
        if (this.mtitle != null) {
            sb.append(", title=");
            sb.append(this.mtitle);
        }
        if (this.mimg_key != null) {
            sb.append(", img_key=");
            sb.append(this.mimg_key);
        }
        if (this.mimg_url != null) {
            sb.append(", img_url=");
            sb.append(this.mimg_url);
        }
        if (!this.mchat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.mchat_ids);
        }
        if (!this.mchat_ids_str.isEmpty()) {
            sb.append(", chat_ids_str=");
            sb.append(this.mchat_ids_str);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareAppPage{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAppPage(String str, CardLink cardLink, String str2, String str3, String str4, List<Long> list, List<String> list2) {
        this(str, cardLink, str2, str3, str4, list, list2, ByteString.EMPTY);
    }

    public ShareAppPage(String str, CardLink cardLink, String str2, String str3, String str4, List<Long> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mapp_id = str;
        this.mcard_link = cardLink;
        this.mtitle = str2;
        this.mimg_key = str3;
        this.mimg_url = str4;
        this.mchat_ids = Internal.immutableCopyOf("mchat_ids", list);
        this.mchat_ids_str = Internal.immutableCopyOf("mchat_ids_str", list2);
    }
}
