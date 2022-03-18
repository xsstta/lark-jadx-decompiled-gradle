package com.bytedance.lark.pb.search.recommend.v1;

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

public final class ActionRecommends extends Message<ActionRecommends, C18765a> {
    public static final ProtoAdapter<ActionRecommends> ADAPTER = new C18766b();
    private static final long serialVersionUID = 0;
    public final List<ActionRecommend> recommends;

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.ActionRecommends$b */
    private static final class C18766b extends ProtoAdapter<ActionRecommends> {
        C18766b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionRecommends.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionRecommends actionRecommends) {
            return ActionRecommend.ADAPTER.asRepeated().encodedSizeWithTag(2, actionRecommends.recommends) + actionRecommends.unknownFields().size();
        }

        /* renamed from: a */
        public ActionRecommends decode(ProtoReader protoReader) throws IOException {
            C18765a aVar = new C18765a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46320a.add(ActionRecommend.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionRecommends actionRecommends) throws IOException {
            ActionRecommend.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, actionRecommends.recommends);
            protoWriter.writeBytes(actionRecommends.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.recommend.v1.ActionRecommends$a */
    public static final class C18765a extends Message.Builder<ActionRecommends, C18765a> {

        /* renamed from: a */
        public List<ActionRecommend> f46320a = Internal.newMutableList();

        /* renamed from: a */
        public ActionRecommends build() {
            return new ActionRecommends(this.f46320a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18765a newBuilder() {
        C18765a aVar = new C18765a();
        aVar.f46320a = Internal.copyOf("recommends", this.recommends);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ActionRecommends");
        StringBuilder sb = new StringBuilder();
        if (!this.recommends.isEmpty()) {
            sb.append(", recommends=");
            sb.append(this.recommends);
        }
        StringBuilder replace = sb.replace(0, 2, "ActionRecommends{");
        replace.append('}');
        return replace.toString();
    }

    public ActionRecommends(List<ActionRecommend> list) {
        this(list, ByteString.EMPTY);
    }

    public ActionRecommends(List<ActionRecommend> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recommends = Internal.immutableCopyOf("recommends", list);
    }
}
