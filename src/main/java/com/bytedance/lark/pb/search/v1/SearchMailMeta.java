package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchMailMeta extends Message<SearchMailMeta, C18891a> {
    public static final ProtoAdapter<SearchMailMeta> ADAPTER = new C18892b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchMailMeta$b */
    private static final class C18892b extends ProtoAdapter<SearchMailMeta> {
        C18892b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMailMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMailMeta searchMailMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, searchMailMeta.id) + searchMailMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMailMeta decode(ProtoReader protoReader) throws IOException {
            C18891a aVar = new C18891a();
            aVar.f46698a = "";
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
                    aVar.f46698a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchMailMeta searchMailMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchMailMeta.id);
            protoWriter.writeBytes(searchMailMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchMailMeta$a */
    public static final class C18891a extends Message.Builder<SearchMailMeta, C18891a> {

        /* renamed from: a */
        public String f46698a;

        /* renamed from: a */
        public SearchMailMeta build() {
            String str = this.f46698a;
            if (str != null) {
                return new SearchMailMeta(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18891a newBuilder() {
        C18891a aVar = new C18891a();
        aVar.f46698a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchMailMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "SearchMailMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMailMeta(String str) {
        this(str, ByteString.EMPTY);
    }

    public SearchMailMeta(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
