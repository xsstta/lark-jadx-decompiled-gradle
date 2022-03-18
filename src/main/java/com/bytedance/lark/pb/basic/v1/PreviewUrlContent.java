package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PreviewUrlContent extends Message<PreviewUrlContent, C15121a> {
    public static final ProtoAdapter<PreviewUrlContent> ADAPTER = new C15122b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Boolean DEFAULT_HAS_PREVIEW = true;
    public static final Boolean DEFAULT_IS_HIDDEN = false;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_SEQUENCE_ID = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final ImageSet cover_image;
    public final Boolean has_preview;
    public final ImageSet icon;
    public final Boolean is_hidden;
    public final Integer offset;
    public final Integer sequence_id;
    public final String summary;
    public final String title;
    public final String url;
    public final PreviewVideo video_info;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PreviewUrlContent$b */
    private static final class C15122b extends ProtoAdapter<PreviewUrlContent> {
        C15122b() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewUrlContent.class);
        }

        /* renamed from: a */
        public int encodedSize(PreviewUrlContent previewUrlContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, previewUrlContent.sequence_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, previewUrlContent.url) + ProtoAdapter.INT32.encodedSizeWithTag(3, previewUrlContent.offset) + ProtoAdapter.INT32.encodedSizeWithTag(4, previewUrlContent.count);
            int i7 = 0;
            if (previewUrlContent.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, previewUrlContent.title);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (previewUrlContent.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, previewUrlContent.summary);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (previewUrlContent.icon != null) {
                i3 = ImageSet.ADAPTER.encodedSizeWithTag(7, previewUrlContent.icon);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (previewUrlContent.is_hidden != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(8, previewUrlContent.is_hidden);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (previewUrlContent.has_preview != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(9, previewUrlContent.has_preview);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (previewUrlContent.cover_image != null) {
                i6 = ImageSet.ADAPTER.encodedSizeWithTag(10, previewUrlContent.cover_image);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (previewUrlContent.video_info != null) {
                i7 = PreviewVideo.ADAPTER.encodedSizeWithTag(11, previewUrlContent.video_info);
            }
            return i13 + i7 + previewUrlContent.unknownFields().size();
        }

        /* renamed from: a */
        public PreviewUrlContent decode(ProtoReader protoReader) throws IOException {
            C15121a aVar = new C15121a();
            aVar.f40084a = 0;
            aVar.f40085b = "";
            aVar.f40086c = 0;
            aVar.f40087d = 0;
            aVar.f40088e = "";
            aVar.f40089f = "";
            aVar.f40091h = false;
            aVar.f40092i = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40084a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40085b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40086c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40087d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40088e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40089f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40090g = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40091h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40092i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40093j = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40094k = PreviewVideo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PreviewUrlContent previewUrlContent) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, previewUrlContent.sequence_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, previewUrlContent.url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, previewUrlContent.offset);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, previewUrlContent.count);
            if (previewUrlContent.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, previewUrlContent.title);
            }
            if (previewUrlContent.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, previewUrlContent.summary);
            }
            if (previewUrlContent.icon != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 7, previewUrlContent.icon);
            }
            if (previewUrlContent.is_hidden != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, previewUrlContent.is_hidden);
            }
            if (previewUrlContent.has_preview != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, previewUrlContent.has_preview);
            }
            if (previewUrlContent.cover_image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 10, previewUrlContent.cover_image);
            }
            if (previewUrlContent.video_info != null) {
                PreviewVideo.ADAPTER.encodeWithTag(protoWriter, 11, previewUrlContent.video_info);
            }
            protoWriter.writeBytes(previewUrlContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15121a newBuilder() {
        C15121a aVar = new C15121a();
        aVar.f40084a = this.sequence_id;
        aVar.f40085b = this.url;
        aVar.f40086c = this.offset;
        aVar.f40087d = this.count;
        aVar.f40088e = this.title;
        aVar.f40089f = this.summary;
        aVar.f40090g = this.icon;
        aVar.f40091h = this.is_hidden;
        aVar.f40092i = this.has_preview;
        aVar.f40093j = this.cover_image;
        aVar.f40094k = this.video_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PreviewUrlContent$a */
    public static final class C15121a extends Message.Builder<PreviewUrlContent, C15121a> {

        /* renamed from: a */
        public Integer f40084a;

        /* renamed from: b */
        public String f40085b;

        /* renamed from: c */
        public Integer f40086c;

        /* renamed from: d */
        public Integer f40087d;

        /* renamed from: e */
        public String f40088e;

        /* renamed from: f */
        public String f40089f;

        /* renamed from: g */
        public ImageSet f40090g;

        /* renamed from: h */
        public Boolean f40091h;

        /* renamed from: i */
        public Boolean f40092i;

        /* renamed from: j */
        public ImageSet f40093j;

        /* renamed from: k */
        public PreviewVideo f40094k;

        /* renamed from: a */
        public PreviewUrlContent build() {
            String str;
            Integer num;
            Integer num2;
            Integer num3 = this.f40084a;
            if (num3 != null && (str = this.f40085b) != null && (num = this.f40086c) != null && (num2 = this.f40087d) != null) {
                return new PreviewUrlContent(num3, str, num, num2, this.f40088e, this.f40089f, this.f40090g, this.f40091h, this.f40092i, this.f40093j, this.f40094k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num3, "sequence_id", this.f40085b, "url", this.f40086c, "offset", this.f40087d, "count");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PreviewUrlContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", sequence_id=");
        sb.append(this.sequence_id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", count=");
        sb.append(this.count);
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.is_hidden != null) {
            sb.append(", is_hidden=");
            sb.append(this.is_hidden);
        }
        if (this.has_preview != null) {
            sb.append(", has_preview=");
            sb.append(this.has_preview);
        }
        if (this.cover_image != null) {
            sb.append(", cover_image=");
            sb.append(this.cover_image);
        }
        if (this.video_info != null) {
            sb.append(", video_info=");
            sb.append(this.video_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PreviewUrlContent{");
        replace.append('}');
        return replace.toString();
    }

    public PreviewUrlContent(Integer num, String str, Integer num2, Integer num3, String str2, String str3, ImageSet imageSet, Boolean bool, Boolean bool2, ImageSet imageSet2, PreviewVideo previewVideo) {
        this(num, str, num2, num3, str2, str3, imageSet, bool, bool2, imageSet2, previewVideo, ByteString.EMPTY);
    }

    public PreviewUrlContent(Integer num, String str, Integer num2, Integer num3, String str2, String str3, ImageSet imageSet, Boolean bool, Boolean bool2, ImageSet imageSet2, PreviewVideo previewVideo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sequence_id = num;
        this.url = str;
        this.offset = num2;
        this.count = num3;
        this.title = str2;
        this.summary = str3;
        this.icon = imageSet;
        this.is_hidden = bool;
        this.has_preview = bool2;
        this.cover_image = imageSet2;
        this.video_info = previewVideo;
    }
}
