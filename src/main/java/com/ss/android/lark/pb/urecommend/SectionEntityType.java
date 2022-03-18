package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SectionEntityType extends Message<SectionEntityType, C50164a> {
    public static final ProtoAdapter<SectionEntityType> ADAPTER = new C50165b();
    private static final long serialVersionUID = 0;
    public final List<SearchEntityType> mentity_types;

    /* renamed from: com.ss.android.lark.pb.urecommend.SectionEntityType$b */
    private static final class C50165b extends ProtoAdapter<SectionEntityType> {
        C50165b() {
            super(FieldEncoding.LENGTH_DELIMITED, SectionEntityType.class);
        }

        /* renamed from: a */
        public int encodedSize(SectionEntityType sectionEntityType) {
            return SearchEntityType.ADAPTER.asRepeated().encodedSizeWithTag(1, sectionEntityType.mentity_types) + sectionEntityType.unknownFields().size();
        }

        /* renamed from: a */
        public SectionEntityType decode(ProtoReader protoReader) throws IOException {
            C50164a aVar = new C50164a();
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
                    try {
                        aVar.f125360a.add(SearchEntityType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SectionEntityType sectionEntityType) throws IOException {
            SearchEntityType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sectionEntityType.mentity_types);
            protoWriter.writeBytes(sectionEntityType.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.SectionEntityType$a */
    public static final class C50164a extends Message.Builder<SectionEntityType, C50164a> {

        /* renamed from: a */
        public List<SearchEntityType> f125360a = Internal.newMutableList();

        /* renamed from: a */
        public SectionEntityType build() {
            return new SectionEntityType(this.f125360a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50164a newBuilder() {
        C50164a aVar = new C50164a();
        aVar.f125360a = Internal.copyOf("mentity_types", this.mentity_types);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mentity_types.isEmpty()) {
            sb.append(", entity_types=");
            sb.append(this.mentity_types);
        }
        StringBuilder replace = sb.replace(0, 2, "SectionEntityType{");
        replace.append('}');
        return replace.toString();
    }

    public SectionEntityType(List<SearchEntityType> list) {
        this(list, ByteString.EMPTY);
    }

    public SectionEntityType(List<SearchEntityType> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mentity_types = Internal.immutableCopyOf("mentity_types", list);
    }
}
