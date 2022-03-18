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

public final class CommentSet extends Message<CommentSet, C18340a> {
    public static final ProtoAdapter<CommentSet> ADAPTER = new C18341b();
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<String> comment_ids;
    public final Integer total_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CommentSet$b */
    private static final class C18341b extends ProtoAdapter<CommentSet> {
        C18341b() {
            super(FieldEncoding.LENGTH_DELIMITED, CommentSet.class);
        }

        /* renamed from: a */
        public int encodedSize(CommentSet commentSet) {
            int i;
            if (commentSet.total_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, commentSet.total_count);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, commentSet.comment_ids) + commentSet.unknownFields().size();
        }

        /* renamed from: a */
        public CommentSet decode(ProtoReader protoReader) throws IOException {
            C18340a aVar = new C18340a();
            aVar.f45698a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45698a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45699b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CommentSet commentSet) throws IOException {
            if (commentSet.total_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commentSet.total_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, commentSet.comment_ids);
            protoWriter.writeBytes(commentSet.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CommentSet$a */
    public static final class C18340a extends Message.Builder<CommentSet, C18340a> {

        /* renamed from: a */
        public Integer f45698a;

        /* renamed from: b */
        public List<String> f45699b = Internal.newMutableList();

        /* renamed from: a */
        public CommentSet build() {
            return new CommentSet(this.f45698a, this.f45699b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18340a mo63464a(Integer num) {
            this.f45698a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18340a newBuilder() {
        C18340a aVar = new C18340a();
        aVar.f45698a = this.total_count;
        aVar.f45699b = Internal.copyOf("comment_ids", this.comment_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CommentSet");
        StringBuilder sb = new StringBuilder();
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        if (!this.comment_ids.isEmpty()) {
            sb.append(", comment_ids=");
            sb.append(this.comment_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CommentSet{");
        replace.append('}');
        return replace.toString();
    }

    public CommentSet(Integer num, List<String> list) {
        this(num, list, ByteString.EMPTY);
    }

    public CommentSet(Integer num, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_count = num;
        this.comment_ids = Internal.immutableCopyOf("comment_ids", list);
    }
}
