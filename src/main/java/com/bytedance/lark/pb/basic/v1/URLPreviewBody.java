package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class URLPreviewBody extends Message<URLPreviewBody, C15368a> {
    public static final ProtoAdapter<URLPreviewBody> ADAPTER = new C15369b();
    private static final long serialVersionUID = 0;
    public final Map<String, UrlPreviewAction> actions;
    public final URL card_url;
    public final URLPreviewComponents components;

    /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewBody$a */
    public static final class C15368a extends Message.Builder<URLPreviewBody, C15368a> {

        /* renamed from: a */
        public URLPreviewComponents f40685a;

        /* renamed from: b */
        public Map<String, UrlPreviewAction> f40686b = Internal.newMutableMap();

        /* renamed from: c */
        public URL f40687c;

        /* renamed from: a */
        public URLPreviewBody build() {
            return new URLPreviewBody(this.f40685a, this.f40686b, this.f40687c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewBody$b */
    private static final class C15369b extends ProtoAdapter<URLPreviewBody> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlPreviewAction>> f40688a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewAction.ADAPTER);

        C15369b() {
            super(FieldEncoding.LENGTH_DELIMITED, URLPreviewBody.class);
        }

        /* renamed from: a */
        public int encodedSize(URLPreviewBody uRLPreviewBody) {
            int i;
            int i2 = 0;
            if (uRLPreviewBody.components != null) {
                i = URLPreviewComponents.ADAPTER.encodedSizeWithTag(1, uRLPreviewBody.components);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f40688a.encodedSizeWithTag(13, uRLPreviewBody.actions);
            if (uRLPreviewBody.card_url != null) {
                i2 = URL.ADAPTER.encodedSizeWithTag(3, uRLPreviewBody.card_url);
            }
            return encodedSizeWithTag + i2 + uRLPreviewBody.unknownFields().size();
        }

        /* renamed from: a */
        public URLPreviewBody decode(ProtoReader protoReader) throws IOException {
            C15368a aVar = new C15368a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40685a = URLPreviewComponents.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40687c = URL.ADAPTER.decode(protoReader);
                } else if (nextTag != 13) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40686b.putAll(this.f40688a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, URLPreviewBody uRLPreviewBody) throws IOException {
            if (uRLPreviewBody.components != null) {
                URLPreviewComponents.ADAPTER.encodeWithTag(protoWriter, 1, uRLPreviewBody.components);
            }
            this.f40688a.encodeWithTag(protoWriter, 13, uRLPreviewBody.actions);
            if (uRLPreviewBody.card_url != null) {
                URL.ADAPTER.encodeWithTag(protoWriter, 3, uRLPreviewBody.card_url);
            }
            protoWriter.writeBytes(uRLPreviewBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15368a newBuilder() {
        C15368a aVar = new C15368a();
        aVar.f40685a = this.components;
        aVar.f40686b = Internal.copyOf("actions", this.actions);
        aVar.f40687c = this.card_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "URLPreviewBody");
        StringBuilder sb = new StringBuilder();
        if (this.components != null) {
            sb.append(", components=");
            sb.append(this.components);
        }
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        if (this.card_url != null) {
            sb.append(", card_url=");
            sb.append(this.card_url);
        }
        StringBuilder replace = sb.replace(0, 2, "URLPreviewBody{");
        replace.append('}');
        return replace.toString();
    }

    public URLPreviewBody(URLPreviewComponents uRLPreviewComponents, Map<String, UrlPreviewAction> map, URL url) {
        this(uRLPreviewComponents, map, url, ByteString.EMPTY);
    }

    public URLPreviewBody(URLPreviewComponents uRLPreviewComponents, Map<String, UrlPreviewAction> map, URL url, ByteString byteString) {
        super(ADAPTER, byteString);
        this.components = uRLPreviewComponents;
        this.actions = Internal.immutableCopyOf("actions", map);
        this.card_url = url;
    }
}
