package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UrlPreviewHangPoint extends Message<UrlPreviewHangPoint, C49742a> {
    public static final ProtoAdapter<UrlPreviewHangPoint> ADAPTER = new C49743b();
    public static final Boolean DEFAULT_NEED_LOCAL_PREVIEW = false;
    private static final long serialVersionUID = 0;
    public final Boolean mneed_local_preview;
    public final String mpreview_id;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.entities.UrlPreviewHangPoint$b */
    private static final class C49743b extends ProtoAdapter<UrlPreviewHangPoint> {
        C49743b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlPreviewHangPoint.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlPreviewHangPoint urlPreviewHangPoint) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, urlPreviewHangPoint.murl);
            int i2 = 0;
            if (urlPreviewHangPoint.mpreview_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, urlPreviewHangPoint.mpreview_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (urlPreviewHangPoint.mneed_local_preview != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, urlPreviewHangPoint.mneed_local_preview);
            }
            return i3 + i2 + urlPreviewHangPoint.unknownFields().size();
        }

        /* renamed from: a */
        public UrlPreviewHangPoint decode(ProtoReader protoReader) throws IOException {
            C49742a aVar = new C49742a();
            aVar.f124576a = "";
            aVar.f124577b = "";
            aVar.f124578c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124576a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124577b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124578c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrlPreviewHangPoint urlPreviewHangPoint) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlPreviewHangPoint.murl);
            if (urlPreviewHangPoint.mpreview_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, urlPreviewHangPoint.mpreview_id);
            }
            if (urlPreviewHangPoint.mneed_local_preview != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, urlPreviewHangPoint.mneed_local_preview);
            }
            protoWriter.writeBytes(urlPreviewHangPoint.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49742a newBuilder() {
        C49742a aVar = new C49742a();
        aVar.f124576a = this.murl;
        aVar.f124577b = this.mpreview_id;
        aVar.f124578c = this.mneed_local_preview;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.entities.UrlPreviewHangPoint$a */
    public static final class C49742a extends Message.Builder<UrlPreviewHangPoint, C49742a> {

        /* renamed from: a */
        public String f124576a;

        /* renamed from: b */
        public String f124577b;

        /* renamed from: c */
        public Boolean f124578c;

        /* renamed from: a */
        public UrlPreviewHangPoint build() {
            String str = this.f124576a;
            if (str != null) {
                return new UrlPreviewHangPoint(str, this.f124577b, this.f124578c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "murl");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.murl);
        if (this.mpreview_id != null) {
            sb.append(", preview_id=");
            sb.append(this.mpreview_id);
        }
        if (this.mneed_local_preview != null) {
            sb.append(", need_local_preview=");
            sb.append(this.mneed_local_preview);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlPreviewHangPoint{");
        replace.append('}');
        return replace.toString();
    }

    public UrlPreviewHangPoint(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public UrlPreviewHangPoint(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.murl = str;
        this.mpreview_id = str2;
        this.mneed_local_preview = bool;
    }
}
