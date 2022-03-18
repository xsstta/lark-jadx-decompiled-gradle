package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.section.SectionFooter;
import com.ss.android.lark.pb.section.SectionHeader;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SectionMeta extends Message<SectionMeta, C50240a> {
    public static final ProtoAdapter<SectionMeta> ADAPTER = new C50241b();
    private static final long serialVersionUID = 0;
    public final String mextras;
    public final SectionFooter mfooter;
    public final SectionHeader mheader;
    public final String mid;
    public final List<SearchResult> mitems;

    /* renamed from: com.ss.android.lark.pb.usearch.SectionMeta$b */
    private static final class C50241b extends ProtoAdapter<SectionMeta> {
        C50241b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionMeta sectionMeta) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (sectionMeta.mid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sectionMeta.mid);
            } else {
                i = 0;
            }
            if (sectionMeta.mheader != null) {
                i2 = SectionHeader.ADAPTER.encodedSizeWithTag(2, sectionMeta.mheader);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (sectionMeta.mfooter != null) {
                i3 = SectionFooter.ADAPTER.encodedSizeWithTag(3, sectionMeta.mfooter);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i5 + i3 + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(4, sectionMeta.mitems);
            if (sectionMeta.mextras != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, sectionMeta.mextras);
            }
            return encodedSizeWithTag + i4 + sectionMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SectionMeta decode(ProtoReader protoReader) throws IOException {
            C50240a aVar = new C50240a();
            aVar.f125545a = "";
            aVar.f125549e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125545a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125546b = SectionHeader.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125547c = SectionFooter.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125548d.add(SearchResult.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125549e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionMeta sectionMeta) throws IOException {
            if (sectionMeta.mid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sectionMeta.mid);
            }
            if (sectionMeta.mheader != null) {
                SectionHeader.ADAPTER.encodeWithTag(protoWriter, 2, sectionMeta.mheader);
            }
            if (sectionMeta.mfooter != null) {
                SectionFooter.ADAPTER.encodeWithTag(protoWriter, 3, sectionMeta.mfooter);
            }
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, sectionMeta.mitems);
            if (sectionMeta.mextras != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, sectionMeta.mextras);
            }
            protoWriter.writeBytes(sectionMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.SectionMeta$a */
    public static final class C50240a extends Message.Builder<SectionMeta, C50240a> {

        /* renamed from: a */
        public String f125545a;

        /* renamed from: b */
        public SectionHeader f125546b;

        /* renamed from: c */
        public SectionFooter f125547c;

        /* renamed from: d */
        public List<SearchResult> f125548d = Internal.newMutableList();

        /* renamed from: e */
        public String f125549e;

        /* renamed from: a */
        public SectionMeta build() {
            return new SectionMeta(this.f125545a, this.f125546b, this.f125547c, this.f125548d, this.f125549e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50240a newBuilder() {
        C50240a aVar = new C50240a();
        aVar.f125545a = this.mid;
        aVar.f125546b = this.mheader;
        aVar.f125547c = this.mfooter;
        aVar.f125548d = Internal.copyOf("mitems", this.mitems);
        aVar.f125549e = this.mextras;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.mheader != null) {
            sb.append(", header=");
            sb.append(this.mheader);
        }
        if (this.mfooter != null) {
            sb.append(", footer=");
            sb.append(this.mfooter);
        }
        if (!this.mitems.isEmpty()) {
            sb.append(", items=");
            sb.append(this.mitems);
        }
        if (this.mextras != null) {
            sb.append(", extras=");
            sb.append(this.mextras);
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
        this.mid = str;
        this.mheader = sectionHeader;
        this.mfooter = sectionFooter;
        this.mitems = Internal.immutableCopyOf("mitems", list);
        this.mextras = str2;
    }
}
