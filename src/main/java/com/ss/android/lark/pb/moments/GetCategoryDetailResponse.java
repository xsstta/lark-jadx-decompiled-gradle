package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.moments_entities.Category;
import com.ss.android.lark.pb.moments_entities.CategoryStats;
import java.io.IOException;
import okio.ByteString;

public final class GetCategoryDetailResponse extends Message<GetCategoryDetailResponse, C49918a> {
    public static final ProtoAdapter<GetCategoryDetailResponse> ADAPTER = new C49919b();
    private static final long serialVersionUID = 0;
    public final Category mcategory;
    public final CategoryStats mstats;

    /* renamed from: com.ss.android.lark.pb.moments.GetCategoryDetailResponse$b */
    private static final class C49919b extends ProtoAdapter<GetCategoryDetailResponse> {
        C49919b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCategoryDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCategoryDetailResponse getCategoryDetailResponse) {
            int i;
            int i2 = 0;
            if (getCategoryDetailResponse.mcategory != null) {
                i = Category.ADAPTER.encodedSizeWithTag(1, getCategoryDetailResponse.mcategory);
            } else {
                i = 0;
            }
            if (getCategoryDetailResponse.mstats != null) {
                i2 = CategoryStats.ADAPTER.encodedSizeWithTag(2, getCategoryDetailResponse.mstats);
            }
            return i + i2 + getCategoryDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCategoryDetailResponse decode(ProtoReader protoReader) throws IOException {
            C49918a aVar = new C49918a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124932a = Category.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124933b = CategoryStats.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCategoryDetailResponse getCategoryDetailResponse) throws IOException {
            if (getCategoryDetailResponse.mcategory != null) {
                Category.ADAPTER.encodeWithTag(protoWriter, 1, getCategoryDetailResponse.mcategory);
            }
            if (getCategoryDetailResponse.mstats != null) {
                CategoryStats.ADAPTER.encodeWithTag(protoWriter, 2, getCategoryDetailResponse.mstats);
            }
            protoWriter.writeBytes(getCategoryDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.GetCategoryDetailResponse$a */
    public static final class C49918a extends Message.Builder<GetCategoryDetailResponse, C49918a> {

        /* renamed from: a */
        public Category f124932a;

        /* renamed from: b */
        public CategoryStats f124933b;

        /* renamed from: a */
        public GetCategoryDetailResponse build() {
            return new GetCategoryDetailResponse(this.f124932a, this.f124933b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49918a newBuilder() {
        C49918a aVar = new C49918a();
        aVar.f124932a = this.mcategory;
        aVar.f124933b = this.mstats;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcategory != null) {
            sb.append(", category=");
            sb.append(this.mcategory);
        }
        if (this.mstats != null) {
            sb.append(", stats=");
            sb.append(this.mstats);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCategoryDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCategoryDetailResponse(Category category, CategoryStats categoryStats) {
        this(category, categoryStats, ByteString.EMPTY);
    }

    public GetCategoryDetailResponse(Category category, CategoryStats categoryStats, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcategory = category;
        this.mstats = categoryStats;
    }
}
