package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PreviewVideo extends Message<PreviewVideo, C15123a> {
    public static final ProtoAdapter<PreviewVideo> ADAPTER = new C15124b();
    public static final Site DEFAULT_SITE = Site.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String iframe_url;
    public final Site site;
    public final String vid;

    public enum Site implements WireEnum {
        UNKNOWN(0),
        XIGUA(1),
        DOUYIN(2),
        HUOSHAN(3),
        YOUTUBE(4),
        IQIYI(5),
        YOUKU(6),
        QQ(7);
        
        public static final ProtoAdapter<Site> ADAPTER = ProtoAdapter.newEnumAdapter(Site.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Site fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return XIGUA;
                case 2:
                    return DOUYIN;
                case 3:
                    return HUOSHAN;
                case 4:
                    return YOUTUBE;
                case 5:
                    return IQIYI;
                case 6:
                    return YOUKU;
                case 7:
                    return QQ;
                default:
                    return null;
            }
        }

        private Site(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PreviewVideo$b */
    private static final class C15124b extends ProtoAdapter<PreviewVideo> {
        C15124b() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewVideo.class);
        }

        /* renamed from: a */
        public int encodedSize(PreviewVideo previewVideo) {
            int i;
            int encodedSizeWithTag = Site.ADAPTER.encodedSizeWithTag(1, previewVideo.site);
            int i2 = 0;
            if (previewVideo.vid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, previewVideo.vid);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (previewVideo.iframe_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, previewVideo.iframe_url);
            }
            return i3 + i2 + previewVideo.unknownFields().size();
        }

        /* renamed from: a */
        public PreviewVideo decode(ProtoReader protoReader) throws IOException {
            C15123a aVar = new C15123a();
            aVar.f40095a = Site.UNKNOWN;
            aVar.f40096b = "";
            aVar.f40097c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40095a = Site.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40096b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40097c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PreviewVideo previewVideo) throws IOException {
            Site.ADAPTER.encodeWithTag(protoWriter, 1, previewVideo.site);
            if (previewVideo.vid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, previewVideo.vid);
            }
            if (previewVideo.iframe_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, previewVideo.iframe_url);
            }
            protoWriter.writeBytes(previewVideo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15123a newBuilder() {
        C15123a aVar = new C15123a();
        aVar.f40095a = this.site;
        aVar.f40096b = this.vid;
        aVar.f40097c = this.iframe_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PreviewVideo$a */
    public static final class C15123a extends Message.Builder<PreviewVideo, C15123a> {

        /* renamed from: a */
        public Site f40095a;

        /* renamed from: b */
        public String f40096b;

        /* renamed from: c */
        public String f40097c;

        /* renamed from: a */
        public PreviewVideo build() {
            Site site = this.f40095a;
            if (site != null) {
                return new PreviewVideo(site, this.f40096b, this.f40097c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(site, "site");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PreviewVideo");
        StringBuilder sb = new StringBuilder();
        sb.append(", site=");
        sb.append(this.site);
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        if (this.iframe_url != null) {
            sb.append(", iframe_url=");
            sb.append(this.iframe_url);
        }
        StringBuilder replace = sb.replace(0, 2, "PreviewVideo{");
        replace.append('}');
        return replace.toString();
    }

    public PreviewVideo(Site site2, String str, String str2) {
        this(site2, str, str2, ByteString.EMPTY);
    }

    public PreviewVideo(Site site2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.site = site2;
        this.vid = str;
        this.iframe_url = str2;
    }
}
