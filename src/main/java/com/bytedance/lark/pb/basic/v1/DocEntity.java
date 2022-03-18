package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class DocEntity extends Message<DocEntity, C14872a> {
    public static final ProtoAdapter<DocEntity> ADAPTER = new C14873b();
    private static final long serialVersionUID = 0;
    public final Map<String, ElementEntity> element_entity_ref;

    public static final class ElementEntity extends Message<ElementEntity, C14870a> {
        public static final ProtoAdapter<ElementEntity> ADAPTER = new C14871b();
        public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Doc.Type doc_type;
        public final String doc_url;
        public final Icon icon;
        public final String title;
        public final String token;

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocEntity$ElementEntity$b */
        private static final class C14871b extends ProtoAdapter<ElementEntity> {
            C14871b() {
                super(FieldEncoding.LENGTH_DELIMITED, ElementEntity.class);
            }

            /* renamed from: a */
            public int encodedSize(ElementEntity elementEntity) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (elementEntity.title != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, elementEntity.title);
                } else {
                    i = 0;
                }
                if (elementEntity.doc_type != null) {
                    i2 = Doc.Type.ADAPTER.encodedSizeWithTag(2, elementEntity.doc_type);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (elementEntity.token != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, elementEntity.token);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (elementEntity.doc_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, elementEntity.doc_url);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (elementEntity.icon != null) {
                    i5 = Icon.ADAPTER.encodedSizeWithTag(5, elementEntity.icon);
                }
                return i8 + i5 + elementEntity.unknownFields().size();
            }

            /* renamed from: a */
            public ElementEntity decode(ProtoReader protoReader) throws IOException {
                C14870a aVar = new C14870a();
                aVar.f39327a = "";
                aVar.f39328b = Doc.Type.UNKNOWN;
                aVar.f39329c = "";
                aVar.f39330d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39327a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f39328b = Doc.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 3) {
                        aVar.f39329c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f39330d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39331e = Icon.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ElementEntity elementEntity) throws IOException {
                if (elementEntity.title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, elementEntity.title);
                }
                if (elementEntity.doc_type != null) {
                    Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, elementEntity.doc_type);
                }
                if (elementEntity.token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, elementEntity.token);
                }
                if (elementEntity.doc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, elementEntity.doc_url);
                }
                if (elementEntity.icon != null) {
                    Icon.ADAPTER.encodeWithTag(protoWriter, 5, elementEntity.icon);
                }
                protoWriter.writeBytes(elementEntity.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocEntity$ElementEntity$a */
        public static final class C14870a extends Message.Builder<ElementEntity, C14870a> {

            /* renamed from: a */
            public String f39327a;

            /* renamed from: b */
            public Doc.Type f39328b;

            /* renamed from: c */
            public String f39329c;

            /* renamed from: d */
            public String f39330d;

            /* renamed from: e */
            public Icon f39331e;

            /* renamed from: a */
            public ElementEntity build() {
                return new ElementEntity(this.f39327a, this.f39328b, this.f39329c, this.f39330d, this.f39331e, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C14870a mo54524a(Doc.Type type) {
                this.f39328b = type;
                return this;
            }

            /* renamed from: b */
            public C14870a mo54528b(String str) {
                this.f39329c = str;
                return this;
            }

            /* renamed from: c */
            public C14870a mo54529c(String str) {
                this.f39330d = str;
                return this;
            }

            /* renamed from: a */
            public C14870a mo54525a(Icon icon) {
                this.f39331e = icon;
                return this;
            }

            /* renamed from: a */
            public C14870a mo54526a(String str) {
                this.f39327a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C14870a newBuilder() {
            C14870a aVar = new C14870a();
            aVar.f39327a = this.title;
            aVar.f39328b = this.doc_type;
            aVar.f39329c = this.token;
            aVar.f39330d = this.doc_url;
            aVar.f39331e = this.icon;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ElementEntity");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.doc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.doc_type);
            }
            if (this.token != null) {
                sb.append(", token=");
                sb.append(this.token);
            }
            if (this.doc_url != null) {
                sb.append(", doc_url=");
                sb.append(this.doc_url);
            }
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            StringBuilder replace = sb.replace(0, 2, "ElementEntity{");
            replace.append('}');
            return replace.toString();
        }

        public ElementEntity(String str, Doc.Type type, String str2, String str3, Icon icon2) {
            this(str, type, str2, str3, icon2, ByteString.EMPTY);
        }

        public ElementEntity(String str, Doc.Type type, String str2, String str3, Icon icon2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = str;
            this.doc_type = type;
            this.token = str2;
            this.doc_url = str3;
            this.icon = icon2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocEntity$a */
    public static final class C14872a extends Message.Builder<DocEntity, C14872a> {

        /* renamed from: a */
        public Map<String, ElementEntity> f39332a = Internal.newMutableMap();

        /* renamed from: a */
        public DocEntity build() {
            return new DocEntity(this.f39332a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14872a mo54533a(Map<String, ElementEntity> map) {
            Internal.checkElementsNotNull(map);
            this.f39332a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocEntity$b */
    private static final class C14873b extends ProtoAdapter<DocEntity> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ElementEntity>> f39333a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ElementEntity.ADAPTER);

        C14873b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(DocEntity docEntity) {
            return this.f39333a.encodedSizeWithTag(1, docEntity.element_entity_ref) + docEntity.unknownFields().size();
        }

        /* renamed from: a */
        public DocEntity decode(ProtoReader protoReader) throws IOException {
            C14872a aVar = new C14872a();
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
                    aVar.f39332a.putAll(this.f39333a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocEntity docEntity) throws IOException {
            this.f39333a.encodeWithTag(protoWriter, 1, docEntity.element_entity_ref);
            protoWriter.writeBytes(docEntity.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14872a newBuilder() {
        C14872a aVar = new C14872a();
        aVar.f39332a = Internal.copyOf("element_entity_ref", this.element_entity_ref);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DocEntity");
        StringBuilder sb = new StringBuilder();
        if (!this.element_entity_ref.isEmpty()) {
            sb.append(", element_entity_ref=");
            sb.append(this.element_entity_ref);
        }
        StringBuilder replace = sb.replace(0, 2, "DocEntity{");
        replace.append('}');
        return replace.toString();
    }

    public DocEntity(Map<String, ElementEntity> map) {
        this(map, ByteString.EMPTY);
    }

    public DocEntity(Map<String, ElementEntity> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.element_entity_ref = Internal.immutableCopyOf("element_entity_ref", map);
    }
}
