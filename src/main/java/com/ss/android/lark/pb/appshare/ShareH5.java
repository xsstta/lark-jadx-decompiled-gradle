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

public final class ShareH5 extends Message<ShareH5, C49549a> {
    public static final ProtoAdapter<ShareH5> ADAPTER = new C49550b();
    private static final long serialVersionUID = 0;
    public final String mapp_id;
    public final CardLink mcard_link;
    public final List<Long> mchat_ids;
    public final List<String> mchat_ids_str;
    public final String mdescription;
    public final String mimg_key;
    public final String mimg_url;
    public final String mtitle;

    /* renamed from: com.ss.android.lark.pb.appshare.ShareH5$b */
    private static final class C49550b extends ProtoAdapter<ShareH5> {
        C49550b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareH5.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareH5 shareH5) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (shareH5.mcard_link != null) {
                i = CardLink.ADAPTER.encodedSizeWithTag(1, shareH5.mcard_link);
            } else {
                i = 0;
            }
            if (shareH5.mtitle != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, shareH5.mtitle);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (shareH5.mimg_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareH5.mimg_key);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (shareH5.mdescription != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, shareH5.mdescription);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (shareH5.mimg_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, shareH5.mimg_url);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i9 + i5 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(6, shareH5.mchat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, shareH5.mchat_ids_str);
            if (shareH5.mapp_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, shareH5.mapp_id);
            }
            return encodedSizeWithTag + i6 + shareH5.unknownFields().size();
        }

        /* renamed from: a */
        public ShareH5 decode(ProtoReader protoReader) throws IOException {
            C49549a aVar = new C49549a();
            aVar.f124156b = "";
            aVar.f124157c = "";
            aVar.f124158d = "";
            aVar.f124159e = "";
            aVar.f124162h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124155a = CardLink.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124156b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124157c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124158d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124159e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124160f.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124161g.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f124162h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ShareH5 shareH5) throws IOException {
            if (shareH5.mcard_link != null) {
                CardLink.ADAPTER.encodeWithTag(protoWriter, 1, shareH5.mcard_link);
            }
            if (shareH5.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareH5.mtitle);
            }
            if (shareH5.mimg_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareH5.mimg_key);
            }
            if (shareH5.mdescription != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareH5.mdescription);
            }
            if (shareH5.mimg_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, shareH5.mimg_url);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 6, shareH5.mchat_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, shareH5.mchat_ids_str);
            if (shareH5.mapp_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, shareH5.mapp_id);
            }
            protoWriter.writeBytes(shareH5.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.appshare.ShareH5$a */
    public static final class C49549a extends Message.Builder<ShareH5, C49549a> {

        /* renamed from: a */
        public CardLink f124155a;

        /* renamed from: b */
        public String f124156b;

        /* renamed from: c */
        public String f124157c;

        /* renamed from: d */
        public String f124158d;

        /* renamed from: e */
        public String f124159e;

        /* renamed from: f */
        public List<Long> f124160f = Internal.newMutableList();

        /* renamed from: g */
        public List<String> f124161g = Internal.newMutableList();

        /* renamed from: h */
        public String f124162h;

        /* renamed from: a */
        public ShareH5 build() {
            return new ShareH5(this.f124155a, this.f124156b, this.f124157c, this.f124158d, this.f124159e, this.f124160f, this.f124161g, this.f124162h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49549a mo172795a(CardLink cardLink) {
            this.f124155a = cardLink;
            return this;
        }

        /* renamed from: b */
        public C49549a mo172799b(String str) {
            this.f124157c = str;
            return this;
        }

        /* renamed from: c */
        public C49549a mo172800c(String str) {
            this.f124158d = str;
            return this;
        }

        /* renamed from: d */
        public C49549a mo172801d(String str) {
            this.f124162h = str;
            return this;
        }

        /* renamed from: a */
        public C49549a mo172796a(String str) {
            this.f124156b = str;
            return this;
        }

        /* renamed from: a */
        public C49549a mo172797a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124161g = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49549a newBuilder() {
        C49549a aVar = new C49549a();
        aVar.f124155a = this.mcard_link;
        aVar.f124156b = this.mtitle;
        aVar.f124157c = this.mimg_key;
        aVar.f124158d = this.mdescription;
        aVar.f124159e = this.mimg_url;
        aVar.f124160f = Internal.copyOf("mchat_ids", this.mchat_ids);
        aVar.f124161g = Internal.copyOf("mchat_ids_str", this.mchat_ids_str);
        aVar.f124162h = this.mapp_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        if (this.mdescription != null) {
            sb.append(", description=");
            sb.append(this.mdescription);
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
        if (this.mapp_id != null) {
            sb.append(", app_id=");
            sb.append(this.mapp_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareH5{");
        replace.append('}');
        return replace.toString();
    }

    public ShareH5(CardLink cardLink, String str, String str2, String str3, String str4, List<Long> list, List<String> list2, String str5) {
        this(cardLink, str, str2, str3, str4, list, list2, str5, ByteString.EMPTY);
    }

    public ShareH5(CardLink cardLink, String str, String str2, String str3, String str4, List<Long> list, List<String> list2, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcard_link = cardLink;
        this.mtitle = str;
        this.mimg_key = str2;
        this.mdescription = str3;
        this.mimg_url = str4;
        this.mchat_ids = Internal.immutableCopyOf("mchat_ids", list);
        this.mchat_ids_str = Internal.immutableCopyOf("mchat_ids_str", list2);
        this.mapp_id = str5;
    }
}
