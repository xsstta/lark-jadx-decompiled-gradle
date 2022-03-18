package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchExternalMeta extends Message<SearchExternalMeta, C18873a> {
    public static final ProtoAdapter<SearchExternalMeta> ADAPTER = new C18874b();
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String source;
    public final Long update_time;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchExternalMeta$b */
    private static final class C18874b extends ProtoAdapter<SearchExternalMeta> {
        C18874b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchExternalMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchExternalMeta searchExternalMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchExternalMeta.id);
            int i3 = 0;
            if (searchExternalMeta.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, searchExternalMeta.url);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (searchExternalMeta.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, searchExternalMeta.update_time);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (searchExternalMeta.source != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchExternalMeta.source);
            }
            return i5 + i3 + searchExternalMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchExternalMeta decode(ProtoReader protoReader) throws IOException {
            C18873a aVar = new C18873a();
            aVar.f46664a = "";
            aVar.f46665b = "";
            aVar.f46666c = 0L;
            aVar.f46667d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46664a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46665b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46666c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46667d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchExternalMeta searchExternalMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchExternalMeta.id);
            if (searchExternalMeta.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchExternalMeta.url);
            }
            if (searchExternalMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchExternalMeta.update_time);
            }
            if (searchExternalMeta.source != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchExternalMeta.source);
            }
            protoWriter.writeBytes(searchExternalMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18873a newBuilder() {
        C18873a aVar = new C18873a();
        aVar.f46664a = this.id;
        aVar.f46665b = this.url;
        aVar.f46666c = this.update_time;
        aVar.f46667d = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchExternalMeta$a */
    public static final class C18873a extends Message.Builder<SearchExternalMeta, C18873a> {

        /* renamed from: a */
        public String f46664a;

        /* renamed from: b */
        public String f46665b;

        /* renamed from: c */
        public Long f46666c;

        /* renamed from: d */
        public String f46667d;

        /* renamed from: a */
        public SearchExternalMeta build() {
            String str = this.f46664a;
            if (str != null) {
                return new SearchExternalMeta(str, this.f46665b, this.f46666c, this.f46667d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchExternalMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchExternalMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchExternalMeta(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, ByteString.EMPTY);
    }

    public SearchExternalMeta(String str, String str2, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.url = str2;
        this.update_time = l;
        this.source = str3;
    }
}
