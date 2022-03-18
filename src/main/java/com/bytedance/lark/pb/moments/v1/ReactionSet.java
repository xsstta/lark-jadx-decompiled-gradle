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

public final class ReactionSet extends Message<ReactionSet, C18530a> {
    public static final ProtoAdapter<ReactionSet> ADAPTER = new C18531b();
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<ReactionList> reactions;
    public final Integer total_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ReactionSet$b */
    private static final class C18531b extends ProtoAdapter<ReactionSet> {
        C18531b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReactionSet.class);
        }

        /* renamed from: a */
        public int encodedSize(ReactionSet reactionSet) {
            int i;
            if (reactionSet.total_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, reactionSet.total_count);
            } else {
                i = 0;
            }
            return i + ReactionList.ADAPTER.asRepeated().encodedSizeWithTag(2, reactionSet.reactions) + reactionSet.unknownFields().size();
        }

        /* renamed from: a */
        public ReactionSet decode(ProtoReader protoReader) throws IOException {
            C18530a aVar = new C18530a();
            aVar.f46015a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46015a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46016b.add(ReactionList.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReactionSet reactionSet) throws IOException {
            if (reactionSet.total_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, reactionSet.total_count);
            }
            ReactionList.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, reactionSet.reactions);
            protoWriter.writeBytes(reactionSet.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ReactionSet$a */
    public static final class C18530a extends Message.Builder<ReactionSet, C18530a> {

        /* renamed from: a */
        public Integer f46015a;

        /* renamed from: b */
        public List<ReactionList> f46016b = Internal.newMutableList();

        /* renamed from: a */
        public ReactionSet build() {
            return new ReactionSet(this.f46015a, this.f46016b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18530a mo63931a(Integer num) {
            this.f46015a = num;
            return this;
        }

        /* renamed from: a */
        public C18530a mo63932a(List<ReactionList> list) {
            Internal.checkElementsNotNull(list);
            this.f46016b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18530a newBuilder() {
        C18530a aVar = new C18530a();
        aVar.f46015a = this.total_count;
        aVar.f46016b = Internal.copyOf("reactions", this.reactions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ReactionSet");
        StringBuilder sb = new StringBuilder();
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        StringBuilder replace = sb.replace(0, 2, "ReactionSet{");
        replace.append('}');
        return replace.toString();
    }

    public ReactionSet(Integer num, List<ReactionList> list) {
        this(num, list, ByteString.EMPTY);
    }

    public ReactionSet(Integer num, List<ReactionList> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_count = num;
        this.reactions = Internal.immutableCopyOf("reactions", list);
    }
}
