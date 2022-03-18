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

public final class SearchDepartmentMeta extends Message<SearchDepartmentMeta, C18865a> {
    public static final ProtoAdapter<SearchDepartmentMeta> ADAPTER = new C18866b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchDepartmentMeta$b */
    private static final class C18866b extends ProtoAdapter<SearchDepartmentMeta> {
        C18866b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchDepartmentMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchDepartmentMeta searchDepartmentMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, searchDepartmentMeta.id) + searchDepartmentMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchDepartmentMeta decode(ProtoReader protoReader) throws IOException {
            C18865a aVar = new C18865a();
            aVar.f46632a = "";
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
                    aVar.f46632a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchDepartmentMeta searchDepartmentMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchDepartmentMeta.id);
            protoWriter.writeBytes(searchDepartmentMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchDepartmentMeta$a */
    public static final class C18865a extends Message.Builder<SearchDepartmentMeta, C18865a> {

        /* renamed from: a */
        public String f46632a;

        /* renamed from: a */
        public SearchDepartmentMeta build() {
            String str = this.f46632a;
            if (str != null) {
                return new SearchDepartmentMeta(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18865a newBuilder() {
        C18865a aVar = new C18865a();
        aVar.f46632a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchDepartmentMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "SearchDepartmentMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchDepartmentMeta(String str) {
        this(str, ByteString.EMPTY);
    }

    public SearchDepartmentMeta(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
