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

public final class RichText extends Message<RichText, C15159a> {
    public static final ProtoAdapter<RichText> ADAPTER = new C15160b();
    public static final Integer DEFAULT_RICH_TEXT_VERSION = 0;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<String> anchor_ids;
    public final List<String> at_ids;
    public final List<String> docs_ids;
    public final List<String> element_ids;
    public final Map<String, RichTextElement> elements;
    public final List<String> image_ids;
    public final String inner_text;
    public final List<String> media_ids;
    public final List<String> mention_ids;
    public final Integer rich_text_version;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.RichText$b */
    private static final class C15160b extends ProtoAdapter<RichText> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, RichTextElement>> f40223a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, RichTextElement.ADAPTER);

        C15160b() {
            super(FieldEncoding.LENGTH_DELIMITED, RichText.class);
        }

        /* renamed from: a */
        public int encodedSize(RichText richText) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, richText.element_ids) + ProtoAdapter.STRING.encodedSizeWithTag(2, richText.inner_text) + this.f40223a.encodedSizeWithTag(3, richText.elements) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, richText.image_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, richText.at_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, richText.anchor_ids);
            int i2 = 0;
            if (richText.version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(7, richText.version);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, richText.media_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, richText.docs_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, richText.mention_ids);
            if (richText.rich_text_version != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(11, richText.rich_text_version);
            }
            return encodedSizeWithTag2 + i2 + richText.unknownFields().size();
        }

        /* renamed from: a */
        public RichText decode(ProtoReader protoReader) throws IOException {
            C15159a aVar = new C15159a();
            aVar.f40213b = "";
            aVar.f40218g = 0;
            aVar.f40222k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40212a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f40213b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40214c.putAll(this.f40223a.decode(protoReader));
                            break;
                        case 4:
                            aVar.f40215d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f40216e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f40217f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f40218g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40219h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f40220i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            aVar.f40221j.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            aVar.f40222k = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, RichText richText) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, richText.element_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, richText.inner_text);
            this.f40223a.encodeWithTag(protoWriter, 3, richText.elements);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, richText.image_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, richText.at_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, richText.anchor_ids);
            if (richText.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, richText.version);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, richText.media_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, richText.docs_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, richText.mention_ids);
            if (richText.rich_text_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, richText.rich_text_version);
            }
            protoWriter.writeBytes(richText.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RichText$a */
    public static final class C15159a extends Message.Builder<RichText, C15159a> {

        /* renamed from: a */
        public List<String> f40212a = Internal.newMutableList();

        /* renamed from: b */
        public String f40213b;

        /* renamed from: c */
        public Map<String, RichTextElement> f40214c = Internal.newMutableMap();

        /* renamed from: d */
        public List<String> f40215d = Internal.newMutableList();

        /* renamed from: e */
        public List<String> f40216e = Internal.newMutableList();

        /* renamed from: f */
        public List<String> f40217f = Internal.newMutableList();

        /* renamed from: g */
        public Integer f40218g;

        /* renamed from: h */
        public List<String> f40219h = Internal.newMutableList();

        /* renamed from: i */
        public List<String> f40220i = Internal.newMutableList();

        /* renamed from: j */
        public List<String> f40221j = Internal.newMutableList();

        /* renamed from: k */
        public Integer f40222k;

        /* renamed from: a */
        public RichText build() {
            String str = this.f40213b;
            if (str != null) {
                return new RichText(this.f40212a, str, this.f40214c, this.f40215d, this.f40216e, this.f40217f, this.f40218g, this.f40219h, this.f40220i, this.f40221j, this.f40222k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "inner_text");
        }

        /* renamed from: a */
        public C15159a mo55260a(Integer num) {
            this.f40222k = num;
            return this;
        }

        /* renamed from: a */
        public C15159a mo55261a(String str) {
            this.f40213b = str;
            return this;
        }

        /* renamed from: b */
        public C15159a mo55265b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40215d = list;
            return this;
        }

        /* renamed from: c */
        public C15159a mo55266c(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40216e = list;
            return this;
        }

        /* renamed from: d */
        public C15159a mo55267d(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40217f = list;
            return this;
        }

        /* renamed from: e */
        public C15159a mo55268e(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40219h = list;
            return this;
        }

        /* renamed from: a */
        public C15159a mo55262a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40212a = list;
            return this;
        }

        /* renamed from: a */
        public C15159a mo55263a(Map<String, RichTextElement> map) {
            Internal.checkElementsNotNull(map);
            this.f40214c = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15159a newBuilder() {
        C15159a aVar = new C15159a();
        aVar.f40212a = Internal.copyOf("element_ids", this.element_ids);
        aVar.f40213b = this.inner_text;
        aVar.f40214c = Internal.copyOf("elements", this.elements);
        aVar.f40215d = Internal.copyOf("image_ids", this.image_ids);
        aVar.f40216e = Internal.copyOf("at_ids", this.at_ids);
        aVar.f40217f = Internal.copyOf("anchor_ids", this.anchor_ids);
        aVar.f40218g = this.version;
        aVar.f40219h = Internal.copyOf("media_ids", this.media_ids);
        aVar.f40220i = Internal.copyOf("docs_ids", this.docs_ids);
        aVar.f40221j = Internal.copyOf("mention_ids", this.mention_ids);
        aVar.f40222k = this.rich_text_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "RichText");
        StringBuilder sb = new StringBuilder();
        if (!this.element_ids.isEmpty()) {
            sb.append(", element_ids=");
            sb.append(this.element_ids);
        }
        sb.append(", inner_text=");
        sb.append(this.inner_text);
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
        if (!this.anchor_ids.isEmpty()) {
            sb.append(", anchor_ids=");
            sb.append(this.anchor_ids);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.media_ids.isEmpty()) {
            sb.append(", media_ids=");
            sb.append(this.media_ids);
        }
        if (!this.docs_ids.isEmpty()) {
            sb.append(", docs_ids=");
            sb.append(this.docs_ids);
        }
        if (!this.mention_ids.isEmpty()) {
            sb.append(", mention_ids=");
            sb.append(this.mention_ids);
        }
        if (this.rich_text_version != null) {
            sb.append(", rich_text_version=");
            sb.append(this.rich_text_version);
        }
        StringBuilder replace = sb.replace(0, 2, "RichText{");
        replace.append('}');
        return replace.toString();
    }

    public RichText(List<String> list, String str, Map<String, RichTextElement> map, List<String> list2, List<String> list3, List<String> list4, Integer num, List<String> list5, List<String> list6, List<String> list7, Integer num2) {
        this(list, str, map, list2, list3, list4, num, list5, list6, list7, num2, ByteString.EMPTY);
    }

    public RichText(List<String> list, String str, Map<String, RichTextElement> map, List<String> list2, List<String> list3, List<String> list4, Integer num, List<String> list5, List<String> list6, List<String> list7, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.element_ids = Internal.immutableCopyOf("element_ids", list);
        this.inner_text = str;
        this.elements = Internal.immutableCopyOf("elements", map);
        this.image_ids = Internal.immutableCopyOf("image_ids", list2);
        this.at_ids = Internal.immutableCopyOf("at_ids", list3);
        this.anchor_ids = Internal.immutableCopyOf("anchor_ids", list4);
        this.version = num;
        this.media_ids = Internal.immutableCopyOf("media_ids", list5);
        this.docs_ids = Internal.immutableCopyOf("docs_ids", list6);
        this.mention_ids = Internal.immutableCopyOf("mention_ids", list7);
        this.rich_text_version = num2;
    }
}
