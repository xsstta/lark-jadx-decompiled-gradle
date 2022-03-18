package com.ss.android.lark.pb.moments_entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CategoryStats extends Message<CategoryStats, C49960a> {
    public static final ProtoAdapter<CategoryStats> ADAPTER = new C49961b();
    public static final Long DEFAULT_PARTICIPANT_COUNT = 0L;
    public static final Long DEFAULT_POST_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Long mparticipant_count;
    public final Long mpost_count;

    /* renamed from: com.ss.android.lark.pb.moments_entities.CategoryStats$b */
    private static final class C49961b extends ProtoAdapter<CategoryStats> {
        C49961b() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryStats.class);
        }

        /* renamed from: a */
        public int encodedSize(CategoryStats categoryStats) {
            int i;
            int i2 = 0;
            if (categoryStats.mpost_count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, categoryStats.mpost_count);
            } else {
                i = 0;
            }
            if (categoryStats.mparticipant_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, categoryStats.mparticipant_count);
            }
            return i + i2 + categoryStats.unknownFields().size();
        }

        /* renamed from: a */
        public CategoryStats decode(ProtoReader protoReader) throws IOException {
            C49960a aVar = new C49960a();
            aVar.f124975a = 0L;
            aVar.f124976b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124975a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124976b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CategoryStats categoryStats) throws IOException {
            if (categoryStats.mpost_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, categoryStats.mpost_count);
            }
            if (categoryStats.mparticipant_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, categoryStats.mparticipant_count);
            }
            protoWriter.writeBytes(categoryStats.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.CategoryStats$a */
    public static final class C49960a extends Message.Builder<CategoryStats, C49960a> {

        /* renamed from: a */
        public Long f124975a;

        /* renamed from: b */
        public Long f124976b;

        /* renamed from: a */
        public CategoryStats build() {
            return new CategoryStats(this.f124975a, this.f124976b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49960a newBuilder() {
        C49960a aVar = new C49960a();
        aVar.f124975a = this.mpost_count;
        aVar.f124976b = this.mparticipant_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mpost_count != null) {
            sb.append(", post_count=");
            sb.append(this.mpost_count);
        }
        if (this.mparticipant_count != null) {
            sb.append(", participant_count=");
            sb.append(this.mparticipant_count);
        }
        StringBuilder replace = sb.replace(0, 2, "CategoryStats{");
        replace.append('}');
        return replace.toString();
    }

    public CategoryStats(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public CategoryStats(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpost_count = l;
        this.mparticipant_count = l2;
    }
}
