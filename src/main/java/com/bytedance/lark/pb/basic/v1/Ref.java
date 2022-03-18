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

public final class Ref extends Message<Ref, C15147a> {
    public static final ProtoAdapter<Ref> ADAPTER = new C15148b();
    private static final long serialVersionUID = 0;
    public final BaikeEntityMeta baike_entity_meta;
    public final String matched_word;
    public final Map<String, String> platform_disable_option;
    public final Span span;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Ref$b */
    private static final class C15148b extends ProtoAdapter<Ref> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40189a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15148b() {
            super(FieldEncoding.LENGTH_DELIMITED, Ref.class);
        }

        /* renamed from: a */
        public int encodedSize(Ref ref) {
            int i;
            int encodedSizeWithTag = Span.ADAPTER.encodedSizeWithTag(1, ref.span);
            int i2 = 0;
            if (ref.matched_word != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, ref.matched_word);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + this.f40189a.encodedSizeWithTag(3, ref.platform_disable_option);
            if (ref.baike_entity_meta != null) {
                i2 = BaikeEntityMeta.ADAPTER.encodedSizeWithTag(4, ref.baike_entity_meta);
            }
            return encodedSizeWithTag2 + i2 + ref.unknownFields().size();
        }

        /* renamed from: a */
        public Ref decode(ProtoReader protoReader) throws IOException {
            C15147a aVar = new C15147a();
            aVar.f40186b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40185a = Span.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40186b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40187c.putAll(this.f40189a.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40188d = BaikeEntityMeta.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Ref ref) throws IOException {
            Span.ADAPTER.encodeWithTag(protoWriter, 1, ref.span);
            if (ref.matched_word != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ref.matched_word);
            }
            this.f40189a.encodeWithTag(protoWriter, 3, ref.platform_disable_option);
            if (ref.baike_entity_meta != null) {
                BaikeEntityMeta.ADAPTER.encodeWithTag(protoWriter, 4, ref.baike_entity_meta);
            }
            protoWriter.writeBytes(ref.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Ref$a */
    public static final class C15147a extends Message.Builder<Ref, C15147a> {

        /* renamed from: a */
        public Span f40185a;

        /* renamed from: b */
        public String f40186b;

        /* renamed from: c */
        public Map<String, String> f40187c = Internal.newMutableMap();

        /* renamed from: d */
        public BaikeEntityMeta f40188d;

        /* renamed from: a */
        public Ref build() {
            Span span = this.f40185a;
            if (span != null) {
                return new Ref(span, this.f40186b, this.f40187c, this.f40188d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(span, "span");
        }
    }

    @Override // com.squareup.wire.Message
    public C15147a newBuilder() {
        C15147a aVar = new C15147a();
        aVar.f40185a = this.span;
        aVar.f40186b = this.matched_word;
        aVar.f40187c = Internal.copyOf("platform_disable_option", this.platform_disable_option);
        aVar.f40188d = this.baike_entity_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Ref");
        StringBuilder sb = new StringBuilder();
        sb.append(", span=");
        sb.append(this.span);
        if (this.matched_word != null) {
            sb.append(", matched_word=");
            sb.append(this.matched_word);
        }
        if (!this.platform_disable_option.isEmpty()) {
            sb.append(", platform_disable_option=");
            sb.append(this.platform_disable_option);
        }
        if (this.baike_entity_meta != null) {
            sb.append(", baike_entity_meta=");
            sb.append(this.baike_entity_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "Ref{");
        replace.append('}');
        return replace.toString();
    }

    public Ref(Span span2, String str, Map<String, String> map, BaikeEntityMeta baikeEntityMeta) {
        this(span2, str, map, baikeEntityMeta, ByteString.EMPTY);
    }

    public Ref(Span span2, String str, Map<String, String> map, BaikeEntityMeta baikeEntityMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.span = span2;
        this.matched_word = str;
        this.platform_disable_option = Internal.immutableCopyOf("platform_disable_option", map);
        this.baike_entity_meta = baikeEntityMeta;
    }
}
