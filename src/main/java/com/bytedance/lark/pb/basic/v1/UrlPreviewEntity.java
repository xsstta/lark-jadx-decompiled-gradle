package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UrlPreviewEntity extends Message<UrlPreviewEntity, C15428a> {
    public static final ProtoAdapter<UrlPreviewEntity> ADAPTER = new C15429b();
    public static final Boolean DEFAULT_IS_SDK_PREVIEW = false;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Boolean is_sdk_preview;
    public final URLPreviewBody preview_body;
    public final String preview_id;
    public final String sdk_description;
    public final String sdk_domain;
    public final String sdk_favicon_url;
    public final String sdk_icon_url;
    public final String sdk_title;
    public final String server_icon_key;
    public final String server_tag;
    public final String server_title;
    public final String source_id;
    public final URL url;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewEntity$b */
    private static final class C15429b extends ProtoAdapter<UrlPreviewEntity> {
        C15429b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlPreviewEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlPreviewEntity urlPreviewEntity) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, urlPreviewEntity.source_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, urlPreviewEntity.preview_id);
            int i12 = 0;
            if (urlPreviewEntity.url != null) {
                i = URL.ADAPTER.encodedSizeWithTag(6, urlPreviewEntity.url);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (urlPreviewEntity.server_icon_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, urlPreviewEntity.server_icon_key);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (urlPreviewEntity.server_title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, urlPreviewEntity.server_title);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (urlPreviewEntity.server_tag != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, urlPreviewEntity.server_tag);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (urlPreviewEntity.version != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, urlPreviewEntity.version);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (urlPreviewEntity.preview_body != null) {
                i6 = URLPreviewBody.ADAPTER.encodedSizeWithTag(8, urlPreviewEntity.preview_body);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (urlPreviewEntity.is_sdk_preview != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(20, urlPreviewEntity.is_sdk_preview);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (urlPreviewEntity.sdk_icon_url != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, urlPreviewEntity.sdk_icon_url);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (urlPreviewEntity.sdk_title != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, urlPreviewEntity.sdk_title);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (urlPreviewEntity.sdk_description != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, urlPreviewEntity.sdk_description);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (urlPreviewEntity.sdk_favicon_url != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, urlPreviewEntity.sdk_favicon_url);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (urlPreviewEntity.sdk_domain != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, urlPreviewEntity.sdk_domain);
            }
            return i23 + i12 + urlPreviewEntity.unknownFields().size();
        }

        /* renamed from: a */
        public UrlPreviewEntity decode(ProtoReader protoReader) throws IOException {
            C15428a aVar = new C15428a();
            aVar.f40825a = "";
            aVar.f40826b = "";
            aVar.f40828d = "";
            aVar.f40829e = "";
            aVar.f40830f = "";
            aVar.f40831g = 0;
            aVar.f40833i = false;
            aVar.f40834j = "";
            aVar.f40835k = "";
            aVar.f40836l = "";
            aVar.f40837m = "";
            aVar.f40838n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 20) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40825a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f40826b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f40828d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f40829e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f40830f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f40827c = URL.ADAPTER.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f40831g = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f40832h = URLPreviewBody.ADAPTER.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f40834j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f40835k = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f40836l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f40837m = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f40838n = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f40833i = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrlPreviewEntity urlPreviewEntity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlPreviewEntity.source_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, urlPreviewEntity.preview_id);
            if (urlPreviewEntity.url != null) {
                URL.ADAPTER.encodeWithTag(protoWriter, 6, urlPreviewEntity.url);
            }
            if (urlPreviewEntity.server_icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, urlPreviewEntity.server_icon_key);
            }
            if (urlPreviewEntity.server_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, urlPreviewEntity.server_title);
            }
            if (urlPreviewEntity.server_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, urlPreviewEntity.server_tag);
            }
            if (urlPreviewEntity.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, urlPreviewEntity.version);
            }
            if (urlPreviewEntity.preview_body != null) {
                URLPreviewBody.ADAPTER.encodeWithTag(protoWriter, 8, urlPreviewEntity.preview_body);
            }
            if (urlPreviewEntity.is_sdk_preview != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, urlPreviewEntity.is_sdk_preview);
            }
            if (urlPreviewEntity.sdk_icon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, urlPreviewEntity.sdk_icon_url);
            }
            if (urlPreviewEntity.sdk_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, urlPreviewEntity.sdk_title);
            }
            if (urlPreviewEntity.sdk_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, urlPreviewEntity.sdk_description);
            }
            if (urlPreviewEntity.sdk_favicon_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, urlPreviewEntity.sdk_favicon_url);
            }
            if (urlPreviewEntity.sdk_domain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, urlPreviewEntity.sdk_domain);
            }
            protoWriter.writeBytes(urlPreviewEntity.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewEntity$a */
    public static final class C15428a extends Message.Builder<UrlPreviewEntity, C15428a> {

        /* renamed from: a */
        public String f40825a;

        /* renamed from: b */
        public String f40826b;

        /* renamed from: c */
        public URL f40827c;

        /* renamed from: d */
        public String f40828d;

        /* renamed from: e */
        public String f40829e;

        /* renamed from: f */
        public String f40830f;

        /* renamed from: g */
        public Integer f40831g;

        /* renamed from: h */
        public URLPreviewBody f40832h;

        /* renamed from: i */
        public Boolean f40833i;

        /* renamed from: j */
        public String f40834j;

        /* renamed from: k */
        public String f40835k;

        /* renamed from: l */
        public String f40836l;

        /* renamed from: m */
        public String f40837m;

        /* renamed from: n */
        public String f40838n;

        /* renamed from: a */
        public UrlPreviewEntity build() {
            String str;
            String str2 = this.f40825a;
            if (str2 != null && (str = this.f40826b) != null) {
                return new UrlPreviewEntity(str2, str, this.f40827c, this.f40828d, this.f40829e, this.f40830f, this.f40831g, this.f40832h, this.f40833i, this.f40834j, this.f40835k, this.f40836l, this.f40837m, this.f40838n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "source_id", this.f40826b, "preview_id");
        }

        /* renamed from: a */
        public C15428a mo55945a(URL url) {
            this.f40827c = url;
            return this;
        }

        /* renamed from: b */
        public C15428a mo55949b(String str) {
            this.f40826b = str;
            return this;
        }

        /* renamed from: c */
        public C15428a mo55950c(String str) {
            this.f40828d = str;
            return this;
        }

        /* renamed from: d */
        public C15428a mo55951d(String str) {
            this.f40829e = str;
            return this;
        }

        /* renamed from: e */
        public C15428a mo55952e(String str) {
            this.f40830f = str;
            return this;
        }

        /* renamed from: a */
        public C15428a mo55946a(Integer num) {
            this.f40831g = num;
            return this;
        }

        /* renamed from: a */
        public C15428a mo55947a(String str) {
            this.f40825a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15428a newBuilder() {
        C15428a aVar = new C15428a();
        aVar.f40825a = this.source_id;
        aVar.f40826b = this.preview_id;
        aVar.f40827c = this.url;
        aVar.f40828d = this.server_icon_key;
        aVar.f40829e = this.server_title;
        aVar.f40830f = this.server_tag;
        aVar.f40831g = this.version;
        aVar.f40832h = this.preview_body;
        aVar.f40833i = this.is_sdk_preview;
        aVar.f40834j = this.sdk_icon_url;
        aVar.f40835k = this.sdk_title;
        aVar.f40836l = this.sdk_description;
        aVar.f40837m = this.sdk_favicon_url;
        aVar.f40838n = this.sdk_domain;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "UrlPreviewEntity");
        StringBuilder sb = new StringBuilder();
        sb.append(", source_id=");
        sb.append(this.source_id);
        sb.append(", preview_id=");
        sb.append(this.preview_id);
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.server_icon_key != null) {
            sb.append(", server_icon_key=");
            sb.append(this.server_icon_key);
        }
        if (this.server_title != null) {
            sb.append(", server_title=");
            sb.append(this.server_title);
        }
        if (this.server_tag != null) {
            sb.append(", server_tag=");
            sb.append(this.server_tag);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.preview_body != null) {
            sb.append(", preview_body=");
            sb.append(this.preview_body);
        }
        if (this.is_sdk_preview != null) {
            sb.append(", is_sdk_preview=");
            sb.append(this.is_sdk_preview);
        }
        if (this.sdk_icon_url != null) {
            sb.append(", sdk_icon_url=");
            sb.append(this.sdk_icon_url);
        }
        if (this.sdk_title != null) {
            sb.append(", sdk_title=");
            sb.append(this.sdk_title);
        }
        if (this.sdk_description != null) {
            sb.append(", sdk_description=");
            sb.append(this.sdk_description);
        }
        if (this.sdk_favicon_url != null) {
            sb.append(", sdk_favicon_url=");
            sb.append(this.sdk_favicon_url);
        }
        if (this.sdk_domain != null) {
            sb.append(", sdk_domain=");
            sb.append(this.sdk_domain);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlPreviewEntity{");
        replace.append('}');
        return replace.toString();
    }

    public UrlPreviewEntity(String str, String str2, URL url2, String str3, String str4, String str5, Integer num, URLPreviewBody uRLPreviewBody, Boolean bool, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, url2, str3, str4, str5, num, uRLPreviewBody, bool, str6, str7, str8, str9, str10, ByteString.EMPTY);
    }

    public UrlPreviewEntity(String str, String str2, URL url2, String str3, String str4, String str5, Integer num, URLPreviewBody uRLPreviewBody, Boolean bool, String str6, String str7, String str8, String str9, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.preview_id = str2;
        this.url = url2;
        this.server_icon_key = str3;
        this.server_title = str4;
        this.server_tag = str5;
        this.version = num;
        this.preview_body = uRLPreviewBody;
        this.is_sdk_preview = bool;
        this.sdk_icon_url = str6;
        this.sdk_title = str7;
        this.sdk_description = str8;
        this.sdk_favicon_url = str9;
        this.sdk_domain = str10;
    }
}
