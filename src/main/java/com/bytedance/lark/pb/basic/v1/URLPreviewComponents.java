package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class URLPreviewComponents extends Message<URLPreviewComponents, C15416a> {
    public static final ProtoAdapter<URLPreviewComponents> ADAPTER = new C15417b();
    private static final long serialVersionUID = 0;
    public final List<String> at_ids;
    public final List<String> button_ids;
    public final Map<String, URLPreviewComponent> elements;
    public final List<String> image_ids;
    public final List<String> richtext_ids;
    public final List<String> root_ids;

    /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponents$a */
    public static final class C15416a extends Message.Builder<URLPreviewComponents, C15416a> {

        /* renamed from: a */
        public List<String> f40791a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, URLPreviewComponent> f40792b = Internal.newMutableMap();

        /* renamed from: c */
        public List<String> f40793c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f40794d = Internal.newMutableList();

        /* renamed from: e */
        public List<String> f40795e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f40796f = Internal.newMutableList();

        /* renamed from: a */
        public URLPreviewComponents build() {
            return new URLPreviewComponents(this.f40791a, this.f40792b, this.f40793c, this.f40794d, this.f40795e, this.f40796f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.URLPreviewComponents$b */
    private static final class C15417b extends ProtoAdapter<URLPreviewComponents> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, URLPreviewComponent>> f40797a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, URLPreviewComponent.ADAPTER);

        C15417b() {
            super(FieldEncoding.LENGTH_DELIMITED, URLPreviewComponents.class);
        }

        /* renamed from: a */
        public int encodedSize(URLPreviewComponents uRLPreviewComponents) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, uRLPreviewComponents.root_ids) + this.f40797a.encodedSizeWithTag(2, uRLPreviewComponents.elements) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, uRLPreviewComponents.image_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, uRLPreviewComponents.at_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, uRLPreviewComponents.button_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, uRLPreviewComponents.richtext_ids) + uRLPreviewComponents.unknownFields().size();
        }

        /* renamed from: a */
        public URLPreviewComponents decode(ProtoReader protoReader) throws IOException {
            C15416a aVar = new C15416a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40791a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f40792b.putAll(this.f40797a.decode(protoReader));
                            break;
                        case 3:
                            aVar.f40793c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f40794d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f40795e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f40796f.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, URLPreviewComponents uRLPreviewComponents) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, uRLPreviewComponents.root_ids);
            this.f40797a.encodeWithTag(protoWriter, 2, uRLPreviewComponents.elements);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, uRLPreviewComponents.image_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, uRLPreviewComponents.at_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, uRLPreviewComponents.button_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, uRLPreviewComponents.richtext_ids);
            protoWriter.writeBytes(uRLPreviewComponents.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15416a newBuilder() {
        C15416a aVar = new C15416a();
        aVar.f40791a = Internal.copyOf("root_ids", this.root_ids);
        aVar.f40792b = Internal.copyOf("elements", this.elements);
        aVar.f40793c = Internal.copyOf("image_ids", this.image_ids);
        aVar.f40794d = Internal.copyOf("at_ids", this.at_ids);
        aVar.f40795e = Internal.copyOf("button_ids", this.button_ids);
        aVar.f40796f = Internal.copyOf("richtext_ids", this.richtext_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "URLPreviewComponents");
        StringBuilder sb = new StringBuilder();
        if (!this.root_ids.isEmpty()) {
            sb.append(", root_ids=");
            sb.append(this.root_ids);
        }
        if (!this.elements.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.elements);
        }
        if (!this.image_ids.isEmpty()) {
            sb.append(", image_ids=");
            sb.append(this.image_ids);
        }
        if (!this.at_ids.isEmpty()) {
            sb.append(", at_ids=");
            sb.append(this.at_ids);
        }
        if (!this.button_ids.isEmpty()) {
            sb.append(", button_ids=");
            sb.append(this.button_ids);
        }
        if (!this.richtext_ids.isEmpty()) {
            sb.append(", richtext_ids=");
            sb.append(this.richtext_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "URLPreviewComponents{");
        replace.append('}');
        return replace.toString();
    }

    public URLPreviewComponents(List<String> list, Map<String, URLPreviewComponent> map, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this(list, map, list2, list3, list4, list5, ByteString.EMPTY);
    }

    public URLPreviewComponents(List<String> list, Map<String, URLPreviewComponent> map, List<String> list2, List<String> list3, List<String> list4, List<String> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.root_ids = Internal.immutableCopyOf("root_ids", list);
        this.elements = Internal.immutableCopyOf("elements", map);
        this.image_ids = Internal.immutableCopyOf("image_ids", list2);
        this.at_ids = Internal.immutableCopyOf("at_ids", list3);
        this.button_ids = Internal.immutableCopyOf("button_ids", list4);
        this.richtext_ids = Internal.immutableCopyOf("richtext_ids", list5);
    }
}
