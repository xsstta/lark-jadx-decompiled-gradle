package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DocFilterParam extends Message<DocFilterParam, C50012a> {
    public static final ProtoAdapter<DocFilterParam> ADAPTER = new C50013b();
    private static final long serialVersionUID = 0;
    public final List<DocSearchType> mdoc_search_type;

    public enum DocSearchType implements WireEnum {
        UNKNOWN(0),
        TITLE(1),
        FULL_TEXT(2),
        MATCH_COMMENT(3);
        
        public static final ProtoAdapter<DocSearchType> ADAPTER = ProtoAdapter.newEnumAdapter(DocSearchType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DocSearchType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TITLE;
            }
            if (i == 2) {
                return FULL_TEXT;
            }
            if (i != 3) {
                return null;
            }
            return MATCH_COMMENT;
        }

        private DocSearchType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.DocFilterParam$b */
    private static final class C50013b extends ProtoAdapter<DocFilterParam> {
        C50013b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(DocFilterParam docFilterParam) {
            return DocSearchType.ADAPTER.asRepeated().encodedSizeWithTag(1, docFilterParam.mdoc_search_type) + docFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public DocFilterParam decode(ProtoReader protoReader) throws IOException {
            C50012a aVar = new C50012a();
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
                        aVar.f125067a.add(DocSearchType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocFilterParam docFilterParam) throws IOException {
            DocSearchType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, docFilterParam.mdoc_search_type);
            protoWriter.writeBytes(docFilterParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.DocFilterParam$a */
    public static final class C50012a extends Message.Builder<DocFilterParam, C50012a> {

        /* renamed from: a */
        public List<DocSearchType> f125067a = Internal.newMutableList();

        /* renamed from: a */
        public DocFilterParam build() {
            return new DocFilterParam(this.f125067a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50012a newBuilder() {
        C50012a aVar = new C50012a();
        aVar.f125067a = Internal.copyOf("mdoc_search_type", this.mdoc_search_type);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mdoc_search_type.isEmpty()) {
            sb.append(", doc_search_type=");
            sb.append(this.mdoc_search_type);
        }
        StringBuilder replace = sb.replace(0, 2, "DocFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public DocFilterParam(List<DocSearchType> list) {
        this(list, ByteString.EMPTY);
    }

    public DocFilterParam(List<DocSearchType> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdoc_search_type = Internal.immutableCopyOf("mdoc_search_type", list);
    }
}
