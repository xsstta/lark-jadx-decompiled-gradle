package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCategoryDetailResponse extends Message<GetCategoryDetailResponse, C18378a> {
    public static final ProtoAdapter<GetCategoryDetailResponse> ADAPTER = new C18379b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final CategoryStats stats;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetCategoryDetailResponse$b */
    private static final class C18379b extends ProtoAdapter<GetCategoryDetailResponse> {
        C18379b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCategoryDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCategoryDetailResponse getCategoryDetailResponse) {
            int i;
            int i2 = 0;
            if (getCategoryDetailResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(1, getCategoryDetailResponse.entities);
            } else {
                i = 0;
            }
            if (getCategoryDetailResponse.stats != null) {
                i2 = CategoryStats.ADAPTER.encodedSizeWithTag(2, getCategoryDetailResponse.stats);
            }
            return i + i2 + getCategoryDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCategoryDetailResponse decode(ProtoReader protoReader) throws IOException {
            C18378a aVar = new C18378a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45761a = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45762b = CategoryStats.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCategoryDetailResponse getCategoryDetailResponse) throws IOException {
            if (getCategoryDetailResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 1, getCategoryDetailResponse.entities);
            }
            if (getCategoryDetailResponse.stats != null) {
                CategoryStats.ADAPTER.encodeWithTag(protoWriter, 2, getCategoryDetailResponse.stats);
            }
            protoWriter.writeBytes(getCategoryDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetCategoryDetailResponse$a */
    public static final class C18378a extends Message.Builder<GetCategoryDetailResponse, C18378a> {

        /* renamed from: a */
        public Entities f45761a;

        /* renamed from: b */
        public CategoryStats f45762b;

        /* renamed from: a */
        public GetCategoryDetailResponse build() {
            return new GetCategoryDetailResponse(this.f45761a, this.f45762b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18378a newBuilder() {
        C18378a aVar = new C18378a();
        aVar.f45761a = this.entities;
        aVar.f45762b = this.stats;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetCategoryDetailResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.stats != null) {
            sb.append(", stats=");
            sb.append(this.stats);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCategoryDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCategoryDetailResponse(Entities entities2, CategoryStats categoryStats) {
        this(entities2, categoryStats, ByteString.EMPTY);
    }

    public GetCategoryDetailResponse(Entities entities2, CategoryStats categoryStats, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entities = entities2;
        this.stats = categoryStats;
    }
}
