package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BannerButton extends Message<BannerButton, C49770a> {
    public static final ProtoAdapter<BannerButton> ADAPTER = new C49771b();
    private static final long serialVersionUID = 0;
    public final String mcta_background_color;
    public final String mcta_link;
    public final String mcta_title;
    public final String mcta_title_color;

    /* renamed from: com.ss.android.lark.pb.guide.BannerButton$b */
    private static final class C49771b extends ProtoAdapter<BannerButton> {
        C49771b() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerButton.class);
        }

        /* renamed from: a */
        public int encodedSize(BannerButton bannerButton) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (bannerButton.mcta_title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bannerButton.mcta_title);
            } else {
                i = 0;
            }
            if (bannerButton.mcta_title_color != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bannerButton.mcta_title_color);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (bannerButton.mcta_background_color != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, bannerButton.mcta_background_color);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (bannerButton.mcta_link != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, bannerButton.mcta_link);
            }
            return i6 + i4 + bannerButton.unknownFields().size();
        }

        /* renamed from: a */
        public BannerButton decode(ProtoReader protoReader) throws IOException {
            C49770a aVar = new C49770a();
            aVar.f124657a = "";
            aVar.f124658b = "";
            aVar.f124659c = "";
            aVar.f124660d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124657a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124658b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124659c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124660d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BannerButton bannerButton) throws IOException {
            if (bannerButton.mcta_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bannerButton.mcta_title);
            }
            if (bannerButton.mcta_title_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerButton.mcta_title_color);
            }
            if (bannerButton.mcta_background_color != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bannerButton.mcta_background_color);
            }
            if (bannerButton.mcta_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerButton.mcta_link);
            }
            protoWriter.writeBytes(bannerButton.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.BannerButton$a */
    public static final class C49770a extends Message.Builder<BannerButton, C49770a> {

        /* renamed from: a */
        public String f124657a;

        /* renamed from: b */
        public String f124658b;

        /* renamed from: c */
        public String f124659c;

        /* renamed from: d */
        public String f124660d;

        /* renamed from: a */
        public BannerButton build() {
            return new BannerButton(this.f124657a, this.f124658b, this.f124659c, this.f124660d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49770a newBuilder() {
        C49770a aVar = new C49770a();
        aVar.f124657a = this.mcta_title;
        aVar.f124658b = this.mcta_title_color;
        aVar.f124659c = this.mcta_background_color;
        aVar.f124660d = this.mcta_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcta_title != null) {
            sb.append(", cta_title=");
            sb.append(this.mcta_title);
        }
        if (this.mcta_title_color != null) {
            sb.append(", cta_title_color=");
            sb.append(this.mcta_title_color);
        }
        if (this.mcta_background_color != null) {
            sb.append(", cta_background_color=");
            sb.append(this.mcta_background_color);
        }
        if (this.mcta_link != null) {
            sb.append(", cta_link=");
            sb.append(this.mcta_link);
        }
        StringBuilder replace = sb.replace(0, 2, "BannerButton{");
        replace.append('}');
        return replace.toString();
    }

    public BannerButton(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public BannerButton(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcta_title = str;
        this.mcta_title_color = str2;
        this.mcta_background_color = str3;
        this.mcta_link = str4;
    }
}
