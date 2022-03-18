package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BannerTemplateMore extends Message<BannerTemplateMore, C49782a> {
    public static final ProtoAdapter<BannerTemplateMore> ADAPTER = new C49783b();
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final String mcontent_pic;
    public final String mframe_color;
    public final String mlink;
    public final String mname;

    /* renamed from: com.ss.android.lark.pb.guide.BannerTemplateMore$b */
    private static final class C49783b extends ProtoAdapter<BannerTemplateMore> {
        C49783b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerTemplateMore.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerTemplateMore bannerTemplateMore) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (bannerTemplateMore.mbackground_color != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerTemplateMore.mbackground_color);
            } else {
                i = 0;
            }
            if (bannerTemplateMore.mcontent_pic != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bannerTemplateMore.mcontent_pic);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (bannerTemplateMore.mname != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, bannerTemplateMore.mname);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (bannerTemplateMore.mlink != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, bannerTemplateMore.mlink);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (bannerTemplateMore.mframe_color != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, bannerTemplateMore.mframe_color);
            }
            return i8 + i5 + bannerTemplateMore.unknownFields().size();
        }

        /* renamed from: a */
        public BannerTemplateMore decode(ProtoReader protoReader) throws IOException {
            C49782a aVar = new C49782a();
            aVar.f124709a = "";
            aVar.f124710b = "";
            aVar.f124711c = "";
            aVar.f124712d = "";
            aVar.f124713e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124709a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124710b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124711c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124712d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124713e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerTemplateMore bannerTemplateMore) throws IOException {
            if (bannerTemplateMore.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerTemplateMore.mbackground_color);
            }
            if (bannerTemplateMore.mcontent_pic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerTemplateMore.mcontent_pic);
            }
            if (bannerTemplateMore.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bannerTemplateMore.mname);
            }
            if (bannerTemplateMore.mlink != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerTemplateMore.mlink);
            }
            if (bannerTemplateMore.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bannerTemplateMore.mframe_color);
            }
            protoWriter.writeBytes(bannerTemplateMore.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerTemplateMore$a */
    public static final class C49782a extends Message.Builder<BannerTemplateMore, C49782a> {

        /* renamed from: a */
        public String f124709a;

        /* renamed from: b */
        public String f124710b;

        /* renamed from: c */
        public String f124711c;

        /* renamed from: d */
        public String f124712d;

        /* renamed from: e */
        public String f124713e;

        /* renamed from: a */
        public BannerTemplateMore build() {
            return new BannerTemplateMore(this.f124709a, this.f124710b, this.f124711c, this.f124712d, this.f124713e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49782a newBuilder() {
        C49782a aVar = new C49782a();
        aVar.f124709a = this.mbackground_color;
        aVar.f124710b = this.mcontent_pic;
        aVar.f124711c = this.mname;
        aVar.f124712d = this.mlink;
        aVar.f124713e = this.mframe_color;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mbackground_color != null) {
            sb.append(", background_color=");
            sb.append(this.mbackground_color);
        }
        if (this.mcontent_pic != null) {
            sb.append(", content_pic=");
            sb.append(this.mcontent_pic);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mlink != null) {
            sb.append(", link=");
            sb.append(this.mlink);
        }
        if (this.mframe_color != null) {
            sb.append(", frame_color=");
            sb.append(this.mframe_color);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerTemplateMore{");
        replace.append('}');
        return replace.toString();
    }

    public BannerTemplateMore(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public BannerTemplateMore(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mcontent_pic = str2;
        this.mname = str3;
        this.mlink = str4;
        this.mframe_color = str5;
    }
}
