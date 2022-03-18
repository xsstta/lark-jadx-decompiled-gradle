package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class WikiInfo extends Message<WikiInfo, C18937a> {
    public static final ProtoAdapter<WikiInfo> ADAPTER = new C18938b();
    public static final Long DEFAULT_SPACE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long space_id;
    public final String space_name;
    public final String url;
    public final String wiki_token;

    /* renamed from: com.bytedance.lark.pb.search.v1.WikiInfo$b */
    private static final class C18938b extends ProtoAdapter<WikiInfo> {
        C18938b() {
            super(FieldEncoding.LENGTH_DELIMITED, WikiInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(WikiInfo wikiInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (wikiInfo.wiki_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, wikiInfo.wiki_token);
            } else {
                i = 0;
            }
            if (wikiInfo.space_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, wikiInfo.space_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (wikiInfo.space_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, wikiInfo.space_name);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (wikiInfo.url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, wikiInfo.url);
            }
            return i6 + i4 + wikiInfo.unknownFields().size();
        }

        /* renamed from: a */
        public WikiInfo decode(ProtoReader protoReader) throws IOException {
            C18937a aVar = new C18937a();
            aVar.f46818a = "";
            aVar.f46819b = 0L;
            aVar.f46820c = "";
            aVar.f46821d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46818a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46819b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46820c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46821d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WikiInfo wikiInfo) throws IOException {
            if (wikiInfo.wiki_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, wikiInfo.wiki_token);
            }
            if (wikiInfo.space_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, wikiInfo.space_id);
            }
            if (wikiInfo.space_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, wikiInfo.space_name);
            }
            if (wikiInfo.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, wikiInfo.url);
            }
            protoWriter.writeBytes(wikiInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.WikiInfo$a */
    public static final class C18937a extends Message.Builder<WikiInfo, C18937a> {

        /* renamed from: a */
        public String f46818a;

        /* renamed from: b */
        public Long f46819b;

        /* renamed from: c */
        public String f46820c;

        /* renamed from: d */
        public String f46821d;

        /* renamed from: a */
        public WikiInfo build() {
            return new WikiInfo(this.f46818a, this.f46819b, this.f46820c, this.f46821d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18937a newBuilder() {
        C18937a aVar = new C18937a();
        aVar.f46818a = this.wiki_token;
        aVar.f46819b = this.space_id;
        aVar.f46820c = this.space_name;
        aVar.f46821d = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "WikiInfo");
        StringBuilder sb = new StringBuilder();
        if (this.wiki_token != null) {
            sb.append(", wiki_token=");
            sb.append(this.wiki_token);
        }
        if (this.space_id != null) {
            sb.append(", space_id=");
            sb.append(this.space_id);
        }
        if (this.space_name != null) {
            sb.append(", space_name=");
            sb.append(this.space_name);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "WikiInfo{");
        replace.append('}');
        return replace.toString();
    }

    public WikiInfo(String str, Long l, String str2, String str3) {
        this(str, l, str2, str3, ByteString.EMPTY);
    }

    public WikiInfo(String str, Long l, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.wiki_token = str;
        this.space_id = l;
        this.space_name = str2;
        this.url = str3;
    }
}
