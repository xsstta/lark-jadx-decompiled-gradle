package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ActionRecommends extends Message<ActionRecommends, C49431a> {
    public static final ProtoAdapter<ActionRecommends> ADAPTER = new C49432b();
    private static final long serialVersionUID = 0;
    public final List<ActionRecommend> maction_recommends;

    /* renamed from: com.ss.android.lark.pb.ai.ActionRecommends$b */
    private static final class C49432b extends ProtoAdapter<ActionRecommends> {
        C49432b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionRecommends.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionRecommends actionRecommends) {
            return ActionRecommend.ADAPTER.asRepeated().encodedSizeWithTag(1, actionRecommends.maction_recommends) + actionRecommends.unknownFields().size();
        }

        /* renamed from: a */
        public ActionRecommends decode(ProtoReader protoReader) throws IOException {
            C49431a aVar = new C49431a();
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
                    aVar.f123979a.add(ActionRecommend.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionRecommends actionRecommends) throws IOException {
            ActionRecommend.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, actionRecommends.maction_recommends);
            protoWriter.writeBytes(actionRecommends.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.ActionRecommends$a */
    public static final class C49431a extends Message.Builder<ActionRecommends, C49431a> {

        /* renamed from: a */
        public List<ActionRecommend> f123979a = Internal.newMutableList();

        /* renamed from: a */
        public ActionRecommends build() {
            return new ActionRecommends(this.f123979a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49431a newBuilder() {
        C49431a aVar = new C49431a();
        aVar.f123979a = Internal.copyOf("maction_recommends", this.maction_recommends);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.maction_recommends.isEmpty()) {
            sb.append(", action_recommends=");
            sb.append(this.maction_recommends);
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
        this.maction_recommends = Internal.immutableCopyOf("maction_recommends", list);
    }
}
