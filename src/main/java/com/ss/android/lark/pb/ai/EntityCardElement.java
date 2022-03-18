package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EntityCardElement extends Message<EntityCardElement, C49449a> {
    public static final ProtoAdapter<EntityCardElement> ADAPTER = new C49450b();
    private static final long serialVersionUID = 0;
    public final AttributedText mattributed_text;
    public final ChatMeta mchat;
    public final ChatterMeta mchatter;
    public final DocMeta mdoc;
    public final Link mlink;
    public final String mplain_text;
    public final RichLink mrich_link;

    /* renamed from: com.ss.android.lark.pb.ai.EntityCardElement$b */
    private static final class C49450b extends ProtoAdapter<EntityCardElement> {
        C49450b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCardElement.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCardElement entityCardElement) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (entityCardElement.mplain_text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, entityCardElement.mplain_text);
            } else {
                i = 0;
            }
            if (entityCardElement.mchatter != null) {
                i2 = ChatterMeta.ADAPTER.encodedSizeWithTag(2, entityCardElement.mchatter);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (entityCardElement.mchat != null) {
                i3 = ChatMeta.ADAPTER.encodedSizeWithTag(3, entityCardElement.mchat);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (entityCardElement.mdoc != null) {
                i4 = DocMeta.ADAPTER.encodedSizeWithTag(4, entityCardElement.mdoc);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (entityCardElement.mlink != null) {
                i5 = Link.ADAPTER.encodedSizeWithTag(5, entityCardElement.mlink);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (entityCardElement.mattributed_text != null) {
                i6 = AttributedText.ADAPTER.encodedSizeWithTag(6, entityCardElement.mattributed_text);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (entityCardElement.mrich_link != null) {
                i7 = RichLink.ADAPTER.encodedSizeWithTag(7, entityCardElement.mrich_link);
            }
            return i12 + i7 + entityCardElement.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCardElement decode(ProtoReader protoReader) throws IOException {
            C49449a aVar = new C49449a();
            aVar.mo172553a("");
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.mo172553a(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.mo172549a(ChatterMeta.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.mo172548a(ChatMeta.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.mo172550a(DocMeta.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.mo172551a(Link.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo172547a(AttributedText.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.mo172552a(RichLink.ADAPTER.decode(protoReader));
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
            if (entityCardElement.mplain_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCardElement.mplain_text);
            }
            if (entityCardElement.mchatter != null) {
                ChatterMeta.ADAPTER.encodeWithTag(protoWriter, 2, entityCardElement.mchatter);
            }
            if (entityCardElement.mchat != null) {
                ChatMeta.ADAPTER.encodeWithTag(protoWriter, 3, entityCardElement.mchat);
            }
            if (entityCardElement.mdoc != null) {
                DocMeta.ADAPTER.encodeWithTag(protoWriter, 4, entityCardElement.mdoc);
            }
            if (entityCardElement.mlink != null) {
                Link.ADAPTER.encodeWithTag(protoWriter, 5, entityCardElement.mlink);
            }
            if (entityCardElement.mattributed_text != null) {
                AttributedText.ADAPTER.encodeWithTag(protoWriter, 6, entityCardElement.mattributed_text);
            }
            if (entityCardElement.mrich_link != null) {
                RichLink.ADAPTER.encodeWithTag(protoWriter, 7, entityCardElement.mrich_link);
            }
            protoWriter.writeBytes(entityCardElement.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49449a newBuilder() {
        C49449a aVar = new C49449a();
        aVar.f124026a = this.mplain_text;
        aVar.f124027b = this.mchatter;
        aVar.f124028c = this.mchat;
        aVar.f124029d = this.mdoc;
        aVar.f124030e = this.mlink;
        aVar.f124031f = this.mattributed_text;
        aVar.f124032g = this.mrich_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mplain_text != null) {
            sb.append(", plain_text=");
            sb.append(this.mplain_text);
        }
        if (this.mchatter != null) {
            sb.append(", chatter=");
            sb.append(this.mchatter);
        }
        if (this.mchat != null) {
            sb.append(", chat=");
            sb.append(this.mchat);
        }
        if (this.mdoc != null) {
            sb.append(", doc=");
            sb.append(this.mdoc);
        }
        if (this.mlink != null) {
            sb.append(", link=");
            sb.append(this.mlink);
        }
        if (this.mattributed_text != null) {
            sb.append(", attributed_text=");
            sb.append(this.mattributed_text);
        }
        if (this.mrich_link != null) {
            sb.append(", rich_link=");
            sb.append(this.mrich_link);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCardElement{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.ai.EntityCardElement$a */
    public static final class C49449a extends Message.Builder<EntityCardElement, C49449a> {

        /* renamed from: a */
        public String f124026a;

        /* renamed from: b */
        public ChatterMeta f124027b;

        /* renamed from: c */
        public ChatMeta f124028c;

        /* renamed from: d */
        public DocMeta f124029d;

        /* renamed from: e */
        public Link f124030e;

        /* renamed from: f */
        public AttributedText f124031f;

        /* renamed from: g */
        public RichLink f124032g;

        /* renamed from: a */
        public EntityCardElement build() {
            return new EntityCardElement(this.f124026a, this.f124027b, this.f124028c, this.f124029d, this.f124030e, this.f124031f, this.f124032g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49449a mo172547a(AttributedText attributedText) {
            this.f124031f = attributedText;
            this.f124026a = null;
            this.f124027b = null;
            this.f124028c = null;
            this.f124029d = null;
            this.f124030e = null;
            this.f124032g = null;
            return this;
        }

        /* renamed from: a */
        public C49449a mo172548a(ChatMeta chatMeta) {
            this.f124028c = chatMeta;
            this.f124026a = null;
            this.f124027b = null;
            this.f124029d = null;
            this.f124030e = null;
            this.f124031f = null;
            this.f124032g = null;
            return this;
        }

        /* renamed from: a */
        public C49449a mo172549a(ChatterMeta chatterMeta) {
            this.f124027b = chatterMeta;
            this.f124026a = null;
            this.f124028c = null;
            this.f124029d = null;
            this.f124030e = null;
            this.f124031f = null;
            this.f124032g = null;
            return this;
        }

        /* renamed from: a */
        public C49449a mo172550a(DocMeta docMeta) {
            this.f124029d = docMeta;
            this.f124026a = null;
            this.f124027b = null;
            this.f124028c = null;
            this.f124030e = null;
            this.f124031f = null;
            this.f124032g = null;
            return this;
        }

        /* renamed from: a */
        public C49449a mo172551a(Link link) {
            this.f124030e = link;
            this.f124026a = null;
            this.f124027b = null;
            this.f124028c = null;
            this.f124029d = null;
            this.f124031f = null;
            this.f124032g = null;
            return this;
        }

        /* renamed from: a */
        public C49449a mo172552a(RichLink richLink) {
            this.f124032g = richLink;
            this.f124026a = null;
            this.f124027b = null;
            this.f124028c = null;
            this.f124029d = null;
            this.f124030e = null;
            this.f124031f = null;
            return this;
        }

        /* renamed from: a */
        public C49449a mo172553a(String str) {
            this.f124026a = str;
            this.f124027b = null;
            this.f124028c = null;
            this.f124029d = null;
            this.f124030e = null;
            this.f124031f = null;
            this.f124032g = null;
            return this;
        }
    }

    public EntityCardElement(String str, ChatterMeta chatterMeta, ChatMeta chatMeta, DocMeta docMeta, Link link, AttributedText attributedText, RichLink richLink) {
        this(str, chatterMeta, chatMeta, docMeta, link, attributedText, richLink, ByteString.EMPTY);
    }

    public EntityCardElement(String str, ChatterMeta chatterMeta, ChatMeta chatMeta, DocMeta docMeta, Link link, AttributedText attributedText, RichLink richLink, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(str, chatterMeta, chatMeta, docMeta, link, attributedText, richLink) <= 1) {
            this.mplain_text = str;
            this.mchatter = chatterMeta;
            this.mchat = chatMeta;
            this.mdoc = docMeta;
            this.mlink = link;
            this.mattributed_text = attributedText;
            this.mrich_link = richLink;
            return;
        }
        throw new IllegalArgumentException("at most one of mplain_text, mchatter, mchat, mdoc, mlink, mattributed_text, mrich_link may be non-null");
    }
}
