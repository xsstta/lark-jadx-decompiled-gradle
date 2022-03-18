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

public final class UrlPreviewHangPoint extends Message<UrlPreviewHangPoint, C15430a> {
    public static final ProtoAdapter<UrlPreviewHangPoint> ADAPTER = new C15431b();
    public static final Boolean DEFAULT_NEED_LOCAL_PREVIEW = false;
    private static final long serialVersionUID = 0;
    public final Boolean need_local_preview;
    public final String preview_id;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint$b */
    private static final class C15431b extends ProtoAdapter<UrlPreviewHangPoint> {
        C15431b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlPreviewHangPoint.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlPreviewHangPoint urlPreviewHangPoint) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, urlPreviewHangPoint.url);
            int i2 = 0;
            if (urlPreviewHangPoint.preview_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, urlPreviewHangPoint.preview_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (urlPreviewHangPoint.need_local_preview != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, urlPreviewHangPoint.need_local_preview);
            }
            return i3 + i2 + urlPreviewHangPoint.unknownFields().size();
        }

        /* renamed from: a */
        public UrlPreviewHangPoint decode(ProtoReader protoReader) throws IOException {
            C15430a aVar = new C15430a();
            aVar.f40839a = "";
            aVar.f40840b = "";
            aVar.f40841c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40839a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40840b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40841c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrlPreviewHangPoint urlPreviewHangPoint) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlPreviewHangPoint.url);
            if (urlPreviewHangPoint.preview_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, urlPreviewHangPoint.preview_id);
            }
            if (urlPreviewHangPoint.need_local_preview != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, urlPreviewHangPoint.need_local_preview);
            }
            protoWriter.writeBytes(urlPreviewHangPoint.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15430a newBuilder() {
        C15430a aVar = new C15430a();
        aVar.f40839a = this.url;
        aVar.f40840b = this.preview_id;
        aVar.f40841c = this.need_local_preview;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint$a */
    public static final class C15430a extends Message.Builder<UrlPreviewHangPoint, C15430a> {

        /* renamed from: a */
        public String f40839a;

        /* renamed from: b */
        public String f40840b;

        /* renamed from: c */
        public Boolean f40841c;

        /* renamed from: a */
        public UrlPreviewHangPoint build() {
            String str = this.f40839a;
            if (str != null) {
                return new UrlPreviewHangPoint(str, this.f40840b, this.f40841c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url");
        }

        /* renamed from: a */
        public C15430a mo55956a(Boolean bool) {
            this.f40841c = bool;
            return this;
        }

        /* renamed from: b */
        public C15430a mo55959b(String str) {
            this.f40840b = str;
            return this;
        }

        /* renamed from: a */
        public C15430a mo55957a(String str) {
            this.f40839a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "UrlPreviewHangPoint");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        if (this.preview_id != null) {
            sb.append(", preview_id=");
            sb.append(this.preview_id);
        }
        if (this.need_local_preview != null) {
            sb.append(", need_local_preview=");
            sb.append(this.need_local_preview);
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
        this.url = str;
        this.preview_id = str2;
        this.need_local_preview = bool;
    }
}
