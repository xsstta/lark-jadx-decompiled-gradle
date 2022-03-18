package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SuggestionFilters extends Message<SuggestionFilters, C19037a> {
    public static final ProtoAdapter<SuggestionFilters> ADAPTER = new C19038b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionFilters$b */
    private static final class C19038b extends ProtoAdapter<SuggestionFilters> {
        C19038b() {
            super(FieldEncoding.LENGTH_DELIMITED, SuggestionFilters.class);
        }

        /* renamed from: a */
        public int encodedSize(SuggestionFilters suggestionFilters) {
            return suggestionFilters.unknownFields().size();
        }

        /* renamed from: a */
        public SuggestionFilters decode(ProtoReader protoReader) throws IOException {
            C19037a aVar = new C19037a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SuggestionFilters suggestionFilters) throws IOException {
            protoWriter.writeBytes(suggestionFilters.unknownFields());
        }
    }

    public SuggestionFilters() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionFilters$a */
    public static final class C19037a extends Message.Builder<SuggestionFilters, C19037a> {
        /* renamed from: a */
        public SuggestionFilters build() {
            return new SuggestionFilters(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19037a newBuilder() {
        C19037a aVar = new C19037a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SuggestionFilters");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SuggestionFilters{");
        replace.append('}');
        return replace.toString();
    }

    public SuggestionFilters(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
