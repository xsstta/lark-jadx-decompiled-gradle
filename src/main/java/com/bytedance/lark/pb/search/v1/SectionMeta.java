package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.sections.v1.SectionFooter;
import com.bytedance.lark.pb.search.sections.v1.SectionHeader;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SectionMeta extends Message<SectionMeta, C18919a> {
    public static final ProtoAdapter<SectionMeta> ADAPTER = new C18920b();
    private static final long serialVersionUID = 0;
    public final String extras;
    public final SectionFooter footer;
    public final SectionHeader header;
    public final String id;
    public final List<SearchResult> items;

    /* renamed from: com.bytedance.lark.pb.search.v1.SectionMeta$b */
    private static final class C18920b extends ProtoAdapter<SectionMeta> {
        C18920b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionMeta sectionMeta) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (sectionMeta.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sectionMeta.id);
            } else {
                i = 0;
            }
            if (sectionMeta.header != null) {
                i2 = SectionHeader.ADAPTER.encodedSizeWithTag(2, sectionMeta.header);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (sectionMeta.footer != null) {
                i3 = SectionFooter.ADAPTER.encodedSizeWithTag(3, sectionMeta.footer);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i5 + i3 + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(4, sectionMeta.items);
            if (sectionMeta.extras != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, sectionMeta.extras);
            }
            return encodedSizeWithTag + i4 + sectionMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SectionMeta decode(ProtoReader protoReader) throws IOException {
            C18919a aVar = new C18919a();
            aVar.f46802a = "";
            aVar.f46806e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46802a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46803b = SectionHeader.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46804c = SectionFooter.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46805d.add(SearchResult.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46806e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionMeta sectionMeta) throws IOException {
            if (sectionMeta.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionMeta.id);
            }
            if (sectionMeta.header != null) {
                SectionHeader.ADAPTER.encodeWithTag(protoWriter, 2, sectionMeta.header);
            }
            if (sectionMeta.footer != null) {
                SectionFooter.ADAPTER.encodeWithTag(protoWriter, 3, sectionMeta.footer);
            }
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, sectionMeta.items);
            if (sectionMeta.extras != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, sectionMeta.extras);
            }
            protoWriter.writeBytes(sectionMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SectionMeta$a */
    public static final class C18919a extends Message.Builder<SectionMeta, C18919a> {

        /* renamed from: a */
        public String f46802a;

        /* renamed from: b */
        public SectionHeader f46803b;

        /* renamed from: c */
        public SectionFooter f46804c;

        /* renamed from: d */
        public List<SearchResult> f46805d = Internal.newMutableList();

        /* renamed from: e */
        public String f46806e;

        /* renamed from: a */
        public SectionMeta build() {
            return new SectionMeta(this.f46802a, this.f46803b, this.f46804c, this.f46805d, this.f46806e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18919a newBuilder() {
        C18919a aVar = new C18919a();
        aVar.f46802a = this.id;
        aVar.f46803b = this.header;
        aVar.f46804c = this.footer;
        aVar.f46805d = Internal.copyOf("items", this.items);
        aVar.f46806e = this.extras;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SectionMeta");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.footer != null) {
            sb.append(", footer=");
            sb.append(this.footer);
        }
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        if (this.extras != null) {
            sb.append(", extras=");
            sb.append(this.extras);
        }
        StringBuilder replace = sb.replace(0, 2, "SectionMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SectionMeta(String str, SectionHeader sectionHeader, SectionFooter sectionFooter, List<SearchResult> list, String str2) {
        this(str, sectionHeader, sectionFooter, list, str2, ByteString.EMPTY);
    }

    public SectionMeta(String str, SectionHeader sectionHeader, SectionFooter sectionFooter, List<SearchResult> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.header = sectionHeader;
        this.footer = sectionFooter;
        this.items = Internal.immutableCopyOf("items", list);
        this.extras = str2;
    }
}
