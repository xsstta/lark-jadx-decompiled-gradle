package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BannerTemplateMore extends Message<BannerTemplateMore, C50114a> {
    public static final ProtoAdapter<BannerTemplateMore> ADAPTER = new C50115b();
    private static final long serialVersionUID = 0;
    public final String mbackground_color;
    public final ImageElement mcontent_pic;
    public final String mframe_color;
    public final TextElement mlink;
    public final TextElement mname;

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerTemplateMore$b */
    private static final class C50115b extends ProtoAdapter<BannerTemplateMore> {
        C50115b() {
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
                i2 = ImageElement.ADAPTER.encodedSizeWithTag(2, bannerTemplateMore.mcontent_pic);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (bannerTemplateMore.mname != null) {
                i3 = TextElement.ADAPTER.encodedSizeWithTag(3, bannerTemplateMore.mname);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (bannerTemplateMore.mlink != null) {
                i4 = TextElement.ADAPTER.encodedSizeWithTag(4, bannerTemplateMore.mlink);
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
            C50114a aVar = new C50114a();
            aVar.f125261a = "";
            aVar.f125265e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125261a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125262b = ImageElement.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125263c = TextElement.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125264d = TextElement.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125265e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerTemplateMore bannerTemplateMore) throws IOException {
            if (bannerTemplateMore.mbackground_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerTemplateMore.mbackground_color);
            }
            if (bannerTemplateMore.mcontent_pic != null) {
                ImageElement.ADAPTER.encodeWithTag(protoWriter, 2, bannerTemplateMore.mcontent_pic);
            }
            if (bannerTemplateMore.mname != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 3, bannerTemplateMore.mname);
            }
            if (bannerTemplateMore.mlink != null) {
                TextElement.ADAPTER.encodeWithTag(protoWriter, 4, bannerTemplateMore.mlink);
            }
            if (bannerTemplateMore.mframe_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bannerTemplateMore.mframe_color);
            }
            protoWriter.writeBytes(bannerTemplateMore.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.BannerTemplateMore$a */
    public static final class C50114a extends Message.Builder<BannerTemplateMore, C50114a> {

        /* renamed from: a */
        public String f125261a;

        /* renamed from: b */
        public ImageElement f125262b;

        /* renamed from: c */
        public TextElement f125263c;

        /* renamed from: d */
        public TextElement f125264d;

        /* renamed from: e */
        public String f125265e;

        /* renamed from: a */
        public BannerTemplateMore build() {
            return new BannerTemplateMore(this.f125261a, this.f125262b, this.f125263c, this.f125264d, this.f125265e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50114a newBuilder() {
        C50114a aVar = new C50114a();
        aVar.f125261a = this.mbackground_color;
        aVar.f125262b = this.mcontent_pic;
        aVar.f125263c = this.mname;
        aVar.f125264d = this.mlink;
        aVar.f125265e = this.mframe_color;
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

    public BannerTemplateMore(String str, ImageElement imageElement, TextElement textElement, TextElement textElement2, String str2) {
        this(str, imageElement, textElement, textElement2, str2, ByteString.EMPTY);
    }

    public BannerTemplateMore(String str, ImageElement imageElement, TextElement textElement, TextElement textElement2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbackground_color = str;
        this.mcontent_pic = imageElement;
        this.mname = textElement;
        this.mlink = textElement2;
        this.mframe_color = str2;
    }
}
