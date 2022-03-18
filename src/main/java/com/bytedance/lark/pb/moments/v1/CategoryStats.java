package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CategoryStats extends Message<CategoryStats, C18330a> {
    public static final ProtoAdapter<CategoryStats> ADAPTER = new C18331b();
    public static final Long DEFAULT_PARTICIPANT_COUNT = 0L;
    public static final Long DEFAULT_POST_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Long participant_count;
    public final Long post_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CategoryStats$b */
    private static final class C18331b extends ProtoAdapter<CategoryStats> {
        C18331b() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryStats.class);
        }

        /* renamed from: a */
        public int encodedSize(CategoryStats categoryStats) {
            int i;
            int i2 = 0;
            if (categoryStats.post_count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, categoryStats.post_count);
            } else {
                i = 0;
            }
            if (categoryStats.participant_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, categoryStats.participant_count);
            }
            return i + i2 + categoryStats.unknownFields().size();
        }

        /* renamed from: a */
        public CategoryStats decode(ProtoReader protoReader) throws IOException {
            C18330a aVar = new C18330a();
            aVar.f45655a = 0L;
            aVar.f45656b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45655a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45656b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CategoryStats categoryStats) throws IOException {
            if (categoryStats.post_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, categoryStats.post_count);
            }
            if (categoryStats.participant_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, categoryStats.participant_count);
            }
            protoWriter.writeBytes(categoryStats.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CategoryStats$a */
    public static final class C18330a extends Message.Builder<CategoryStats, C18330a> {

        /* renamed from: a */
        public Long f45655a;

        /* renamed from: b */
        public Long f45656b;

        /* renamed from: a */
        public CategoryStats build() {
            return new CategoryStats(this.f45655a, this.f45656b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18330a newBuilder() {
        C18330a aVar = new C18330a();
        aVar.f45655a = this.post_count;
        aVar.f45656b = this.participant_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CategoryStats");
        StringBuilder sb = new StringBuilder();
        if (this.post_count != null) {
            sb.append(", post_count=");
            sb.append(this.post_count);
        }
        if (this.participant_count != null) {
            sb.append(", participant_count=");
            sb.append(this.participant_count);
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
        this.post_count = l;
        this.participant_count = l2;
    }
}
