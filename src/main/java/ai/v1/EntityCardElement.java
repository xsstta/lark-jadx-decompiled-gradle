package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EntityCardElement extends Message<EntityCardElement, C0049a> {
    public static final ProtoAdapter<EntityCardElement> ADAPTER = new C0050b();
    private static final long serialVersionUID = 0;
    public final AttributedText attributed_text;
    public final ChatMeta chat;
    public final ChatterMeta chatter;
    public final DocMeta doc;
    public final Link link;
    public final String plain_text;

    /* renamed from: ai.v1.EntityCardElement$b */
    private static final class C0050b extends ProtoAdapter<EntityCardElement> {
        C0050b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCardElement.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCardElement entityCardElement) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (entityCardElement.plain_text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, entityCardElement.plain_text);
            } else {
                i = 0;
            }
            if (entityCardElement.chatter != null) {
                i2 = ChatterMeta.ADAPTER.encodedSizeWithTag(2, entityCardElement.chatter);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (entityCardElement.chat != null) {
                i3 = ChatMeta.ADAPTER.encodedSizeWithTag(3, entityCardElement.chat);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (entityCardElement.doc != null) {
                i4 = DocMeta.ADAPTER.encodedSizeWithTag(4, entityCardElement.doc);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (entityCardElement.link != null) {
                i5 = Link.ADAPTER.encodedSizeWithTag(5, entityCardElement.link);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (entityCardElement.attributed_text != null) {
                i6 = AttributedText.ADAPTER.encodedSizeWithTag(6, entityCardElement.attributed_text);
            }
            return i10 + i6 + entityCardElement.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCardElement decode(ProtoReader protoReader) throws IOException {
            C0049a aVar = new C0049a();
            aVar.mo68a("");
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.mo68a(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.mo65a(ChatterMeta.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.mo64a(ChatMeta.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.mo66a(DocMeta.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.mo67a(Link.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo63a(AttributedText.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, EntityCardElement entityCardElement) throws IOException {
            if (entityCardElement.plain_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCardElement.plain_text);
            }
            if (entityCardElement.chatter != null) {
                ChatterMeta.ADAPTER.encodeWithTag(protoWriter, 2, entityCardElement.chatter);
            }
            if (entityCardElement.chat != null) {
                ChatMeta.ADAPTER.encodeWithTag(protoWriter, 3, entityCardElement.chat);
            }
            if (entityCardElement.doc != null) {
                DocMeta.ADAPTER.encodeWithTag(protoWriter, 4, entityCardElement.doc);
            }
            if (entityCardElement.link != null) {
                Link.ADAPTER.encodeWithTag(protoWriter, 5, entityCardElement.link);
            }
            if (entityCardElement.attributed_text != null) {
                AttributedText.ADAPTER.encodeWithTag(protoWriter, 6, entityCardElement.attributed_text);
            }
            protoWriter.writeBytes(entityCardElement.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0049a newBuilder() {
        C0049a aVar = new C0049a();
        aVar.f84a = this.plain_text;
        aVar.f85b = this.chatter;
        aVar.f86c = this.chat;
        aVar.f87d = this.doc;
        aVar.f88e = this.link;
        aVar.f89f = this.attributed_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "EntityCardElement");
        StringBuilder sb = new StringBuilder();
        if (this.plain_text != null) {
            sb.append(", plain_text=");
            sb.append(this.plain_text);
        }
        if (this.chatter != null) {
            sb.append(", chatter=");
            sb.append(this.chatter);
        }
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        if (this.doc != null) {
            sb.append(", doc=");
            sb.append(this.doc);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.attributed_text != null) {
            sb.append(", attributed_text=");
            sb.append(this.attributed_text);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCardElement{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: ai.v1.EntityCardElement$a */
    public static final class C0049a extends Message.Builder<EntityCardElement, C0049a> {

        /* renamed from: a */
        public String f84a;

        /* renamed from: b */
        public ChatterMeta f85b;

        /* renamed from: c */
        public ChatMeta f86c;

        /* renamed from: d */
        public DocMeta f87d;

        /* renamed from: e */
        public Link f88e;

        /* renamed from: f */
        public AttributedText f89f;

        /* renamed from: a */
        public EntityCardElement build() {
            return new EntityCardElement(this.f84a, this.f85b, this.f86c, this.f87d, this.f88e, this.f89f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C0049a mo63a(AttributedText attributedText) {
            this.f89f = attributedText;
            this.f84a = null;
            this.f85b = null;
            this.f86c = null;
            this.f87d = null;
            this.f88e = null;
            return this;
        }

        /* renamed from: a */
        public C0049a mo64a(ChatMeta chatMeta) {
            this.f86c = chatMeta;
            this.f84a = null;
            this.f85b = null;
            this.f87d = null;
            this.f88e = null;
            this.f89f = null;
            return this;
        }

        /* renamed from: a */
        public C0049a mo65a(ChatterMeta chatterMeta) {
            this.f85b = chatterMeta;
            this.f84a = null;
            this.f86c = null;
            this.f87d = null;
            this.f88e = null;
            this.f89f = null;
            return this;
        }

        /* renamed from: a */
        public C0049a mo66a(DocMeta docMeta) {
            this.f87d = docMeta;
            this.f84a = null;
            this.f85b = null;
            this.f86c = null;
            this.f88e = null;
            this.f89f = null;
            return this;
        }

        /* renamed from: a */
        public C0049a mo67a(Link link) {
            this.f88e = link;
            this.f84a = null;
            this.f85b = null;
            this.f86c = null;
            this.f87d = null;
            this.f89f = null;
            return this;
        }

        /* renamed from: a */
        public C0049a mo68a(String str) {
            this.f84a = str;
            this.f85b = null;
            this.f86c = null;
            this.f87d = null;
            this.f88e = null;
            this.f89f = null;
            return this;
        }
    }

    public EntityCardElement(String str, ChatterMeta chatterMeta, ChatMeta chatMeta, DocMeta docMeta, Link link2, AttributedText attributedText) {
        this(str, chatterMeta, chatMeta, docMeta, link2, attributedText, ByteString.EMPTY);
    }

    public EntityCardElement(String str, ChatterMeta chatterMeta, ChatMeta chatMeta, DocMeta docMeta, Link link2, AttributedText attributedText, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(str, chatterMeta, chatMeta, docMeta, link2, attributedText) <= 1) {
            this.plain_text = str;
            this.chatter = chatterMeta;
            this.chat = chatMeta;
            this.doc = docMeta;
            this.link = link2;
            this.attributed_text = attributedText;
            return;
        }
        throw new IllegalArgumentException("at most one of plain_text, chatter, chat, doc, link, attributed_text may be non-null");
    }
}
