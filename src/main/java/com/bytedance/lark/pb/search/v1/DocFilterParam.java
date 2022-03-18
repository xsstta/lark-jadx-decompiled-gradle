package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class DocFilterParam extends Message<DocFilterParam, C18823a> {
    public static final ProtoAdapter<DocFilterParam> ADAPTER = new C18824b();
    private static final long serialVersionUID = 0;
    public final List<DocSearchType> doc_search_type;

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

    /* renamed from: com.bytedance.lark.pb.search.v1.DocFilterParam$b */
    private static final class C18824b extends ProtoAdapter<DocFilterParam> {
        C18824b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(DocFilterParam docFilterParam) {
            return DocSearchType.ADAPTER.asRepeated().encodedSizeWithTag(1, docFilterParam.doc_search_type) + docFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public DocFilterParam decode(ProtoReader protoReader) throws IOException {
            C18823a aVar = new C18823a();
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
                        aVar.f46388a.add(DocSearchType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocFilterParam docFilterParam) throws IOException {
            DocSearchType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, docFilterParam.doc_search_type);
            protoWriter.writeBytes(docFilterParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.DocFilterParam$a */
    public static final class C18823a extends Message.Builder<DocFilterParam, C18823a> {

        /* renamed from: a */
        public List<DocSearchType> f46388a = Internal.newMutableList();

        /* renamed from: a */
        public DocFilterParam build() {
            return new DocFilterParam(this.f46388a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18823a newBuilder() {
        C18823a aVar = new C18823a();
        aVar.f46388a = Internal.copyOf("doc_search_type", this.doc_search_type);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "DocFilterParam");
        StringBuilder sb = new StringBuilder();
        if (!this.doc_search_type.isEmpty()) {
            sb.append(", doc_search_type=");
            sb.append(this.doc_search_type);
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
        this.doc_search_type = Internal.immutableCopyOf("doc_search_type", list);
    }
}
