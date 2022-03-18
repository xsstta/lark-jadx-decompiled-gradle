package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SuggestionQueries extends Message<SuggestionQueries, C19043a> {
    public static final ProtoAdapter<SuggestionQueries> ADAPTER = new C19044b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionQueries$b */
    private static final class C19044b extends ProtoAdapter<SuggestionQueries> {
        C19044b() {
            super(FieldEncoding.LENGTH_DELIMITED, SuggestionQueries.class);
        }

        /* renamed from: a */
        public int encodedSize(SuggestionQueries suggestionQueries) {
            return suggestionQueries.unknownFields().size();
        }

        /* renamed from: a */
        public SuggestionQueries decode(ProtoReader protoReader) throws IOException {
            C19043a aVar = new C19043a();
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
        public void encode(ProtoWriter protoWriter, SuggestionQueries suggestionQueries) throws IOException {
            protoWriter.writeBytes(suggestionQueries.unknownFields());
        }
    }

    public SuggestionQueries() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SuggestionQueries$a */
    public static final class C19043a extends Message.Builder<SuggestionQueries, C19043a> {
        /* renamed from: a */
        public SuggestionQueries build() {
            return new SuggestionQueries(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19043a newBuilder() {
        C19043a aVar = new C19043a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SuggestionQueries");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SuggestionQueries{");
        replace.append('}');
        return replace.toString();
    }

    public SuggestionQueries(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
