package com.bytedance.lark.pb.url.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUrlPreviewResponse extends Message<GetUrlPreviewResponse, C19813a> {
    public static final ProtoAdapter<GetUrlPreviewResponse> ADAPTER = new C19814b();
    public static final UrlPreviewSourceType DEFAULT_SOURCE_TYPE = UrlPreviewSourceType.CHAT_ANNOUNCEMENT;
    private static final long serialVersionUID = 0;
    public final List<UrlPreviewEntry> preview_entries;
    public final String source_id;
    public final String source_text_md5;
    public final UrlPreviewSourceType source_type;

    /* renamed from: com.bytedance.lark.pb.url.v1.GetUrlPreviewResponse$b */
    private static final class C19814b extends ProtoAdapter<GetUrlPreviewResponse> {
        C19814b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrlPreviewResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrlPreviewResponse getUrlPreviewResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getUrlPreviewResponse.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUrlPreviewResponse.source_id);
            } else {
                i = 0;
            }
            if (getUrlPreviewResponse.source_type != null) {
                i2 = UrlPreviewSourceType.ADAPTER.encodedSizeWithTag(2, getUrlPreviewResponse.source_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getUrlPreviewResponse.source_text_md5 != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getUrlPreviewResponse.source_text_md5);
            }
            return i4 + i3 + UrlPreviewEntry.ADAPTER.asRepeated().encodedSizeWithTag(4, getUrlPreviewResponse.preview_entries) + getUrlPreviewResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrlPreviewResponse decode(ProtoReader protoReader) throws IOException {
            C19813a aVar = new C19813a();
            aVar.f48298a = "";
            aVar.f48299b = UrlPreviewSourceType.CHAT_ANNOUNCEMENT;
            aVar.f48300c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48298a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f48299b = UrlPreviewSourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f48300c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48301d.add(UrlPreviewEntry.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrlPreviewResponse getUrlPreviewResponse) throws IOException {
            if (getUrlPreviewResponse.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUrlPreviewResponse.source_id);
            }
            if (getUrlPreviewResponse.source_type != null) {
                UrlPreviewSourceType.ADAPTER.encodeWithTag(protoWriter, 2, getUrlPreviewResponse.source_type);
            }
            if (getUrlPreviewResponse.source_text_md5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getUrlPreviewResponse.source_text_md5);
            }
            UrlPreviewEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getUrlPreviewResponse.preview_entries);
            protoWriter.writeBytes(getUrlPreviewResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.GetUrlPreviewResponse$a */
    public static final class C19813a extends Message.Builder<GetUrlPreviewResponse, C19813a> {

        /* renamed from: a */
        public String f48298a;

        /* renamed from: b */
        public UrlPreviewSourceType f48299b;

        /* renamed from: c */
        public String f48300c;

        /* renamed from: d */
        public List<UrlPreviewEntry> f48301d = Internal.newMutableList();

        /* renamed from: a */
        public GetUrlPreviewResponse build() {
            return new GetUrlPreviewResponse(this.f48298a, this.f48299b, this.f48300c, this.f48301d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19813a newBuilder() {
        C19813a aVar = new C19813a();
        aVar.f48298a = this.source_id;
        aVar.f48299b = this.source_type;
        aVar.f48300c = this.source_text_md5;
        aVar.f48301d = Internal.copyOf("preview_entries", this.preview_entries);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "GetUrlPreviewResponse");
        StringBuilder sb = new StringBuilder();
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_text_md5 != null) {
            sb.append(", source_text_md5=");
            sb.append(this.source_text_md5);
        }
        if (!this.preview_entries.isEmpty()) {
            sb.append(", preview_entries=");
            sb.append(this.preview_entries);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUrlPreviewResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrlPreviewResponse(String str, UrlPreviewSourceType urlPreviewSourceType, String str2, List<UrlPreviewEntry> list) {
        this(str, urlPreviewSourceType, str2, list, ByteString.EMPTY);
    }

    public GetUrlPreviewResponse(String str, UrlPreviewSourceType urlPreviewSourceType, String str2, List<UrlPreviewEntry> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.source_type = urlPreviewSourceType;
        this.source_text_md5 = str2;
        this.preview_entries = Internal.immutableCopyOf("preview_entries", list);
    }
}
