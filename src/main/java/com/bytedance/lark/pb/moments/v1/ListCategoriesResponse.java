package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ListCategoriesResponse extends Message<ListCategoriesResponse, C18420a> {
    public static final ProtoAdapter<ListCategoriesResponse> ADAPTER = new C18421b();
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final Entities entities;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCategoriesResponse$b */
    private static final class C18421b extends ProtoAdapter<ListCategoriesResponse> {
        C18421b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListCategoriesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListCategoriesResponse listCategoriesResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, listCategoriesResponse.category_ids);
            if (listCategoriesResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listCategoriesResponse.entities);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + listCategoriesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListCategoriesResponse decode(ProtoReader protoReader) throws IOException {
            C18420a aVar = new C18420a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45803a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45804b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListCategoriesResponse listCategoriesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, listCategoriesResponse.category_ids);
            if (listCategoriesResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listCategoriesResponse.entities);
            }
            protoWriter.writeBytes(listCategoriesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCategoriesResponse$a */
    public static final class C18420a extends Message.Builder<ListCategoriesResponse, C18420a> {

        /* renamed from: a */
        public List<String> f45803a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45804b;

        /* renamed from: a */
        public ListCategoriesResponse build() {
            return new ListCategoriesResponse(this.f45803a, this.f45804b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18420a newBuilder() {
        C18420a aVar = new C18420a();
        aVar.f45803a = Internal.copyOf("category_ids", this.category_ids);
        aVar.f45804b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListCategoriesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "ListCategoriesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListCategoriesResponse(List<String> list, Entities entities2) {
        this(list, entities2, ByteString.EMPTY);
    }

    public ListCategoriesResponse(List<String> list, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
        this.entities = entities2;
    }
}
