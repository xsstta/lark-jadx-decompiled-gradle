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

public final class ElementRefs extends Message<ElementRefs, C14898a> {
    public static final ProtoAdapter<ElementRefs> ADAPTER = new C14899b();
    private static final long serialVersionUID = 0;
    public final Map<String, Refs> element_refs;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ElementRefs$a */
    public static final class C14898a extends Message.Builder<ElementRefs, C14898a> {

        /* renamed from: a */
        public Map<String, Refs> f39416a = Internal.newMutableMap();

        /* renamed from: a */
        public ElementRefs build() {
            return new ElementRefs(this.f39416a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ElementRefs$b */
    private static final class C14899b extends ProtoAdapter<ElementRefs> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Refs>> f39417a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Refs.ADAPTER);

        C14899b() {
            super(FieldEncoding.LENGTH_DELIMITED, ElementRefs.class);
        }

        /* renamed from: a */
        public int encodedSize(ElementRefs elementRefs) {
            return this.f39417a.encodedSizeWithTag(1, elementRefs.element_refs) + elementRefs.unknownFields().size();
        }

        /* renamed from: a */
        public ElementRefs decode(ProtoReader protoReader) throws IOException {
            C14898a aVar = new C14898a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39416a.putAll(this.f39417a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ElementRefs elementRefs) throws IOException {
            this.f39417a.encodeWithTag(protoWriter, 1, elementRefs.element_refs);
            protoWriter.writeBytes(elementRefs.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14898a newBuilder() {
        C14898a aVar = new C14898a();
        aVar.f39416a = Internal.copyOf("element_refs", this.element_refs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ElementRefs");
        StringBuilder sb = new StringBuilder();
        if (!this.element_refs.isEmpty()) {
            sb.append(", element_refs=");
            sb.append(this.element_refs);
        }
        StringBuilder replace = sb.replace(0, 2, "ElementRefs{");
        replace.append('}');
        return replace.toString();
    }

    public ElementRefs(Map<String, Refs> map) {
        this(map, ByteString.EMPTY);
    }

    public ElementRefs(Map<String, Refs> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.element_refs = Internal.immutableCopyOf("element_refs", map);
    }
}
