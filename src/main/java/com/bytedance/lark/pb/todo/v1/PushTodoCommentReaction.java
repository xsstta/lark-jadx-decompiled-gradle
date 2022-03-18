package com.bytedance.lark.pb.todo.v1;

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

public final class PushTodoCommentReaction extends Message<PushTodoCommentReaction, C19601a> {
    public static final ProtoAdapter<PushTodoCommentReaction> ADAPTER = new C19602b();
    public static final Long DEFAULT_UPDATE_MILLI_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String comment_id;
    public final List<TodoCommentReaction> reactions;
    public final String todo_guid;
    public final Long update_milli_time;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoCommentReaction$b */
    private static final class C19602b extends ProtoAdapter<PushTodoCommentReaction> {
        C19602b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodoCommentReaction.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodoCommentReaction pushTodoCommentReaction) {
            int i;
            int i2;
            int i3 = 0;
            if (pushTodoCommentReaction.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushTodoCommentReaction.todo_guid);
            } else {
                i = 0;
            }
            if (pushTodoCommentReaction.comment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushTodoCommentReaction.comment_id);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + TodoCommentReaction.ADAPTER.asRepeated().encodedSizeWithTag(3, pushTodoCommentReaction.reactions);
            if (pushTodoCommentReaction.update_milli_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, pushTodoCommentReaction.update_milli_time);
            }
            return encodedSizeWithTag + i3 + pushTodoCommentReaction.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodoCommentReaction decode(ProtoReader protoReader) throws IOException {
            C19601a aVar = new C19601a();
            aVar.f47949a = "";
            aVar.f47950b = "";
            aVar.f47952d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47949a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47950b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47951c.add(TodoCommentReaction.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47952d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTodoCommentReaction pushTodoCommentReaction) throws IOException {
            if (pushTodoCommentReaction.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushTodoCommentReaction.todo_guid);
            }
            if (pushTodoCommentReaction.comment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushTodoCommentReaction.comment_id);
            }
            TodoCommentReaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, pushTodoCommentReaction.reactions);
            if (pushTodoCommentReaction.update_milli_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, pushTodoCommentReaction.update_milli_time);
            }
            protoWriter.writeBytes(pushTodoCommentReaction.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoCommentReaction$a */
    public static final class C19601a extends Message.Builder<PushTodoCommentReaction, C19601a> {

        /* renamed from: a */
        public String f47949a;

        /* renamed from: b */
        public String f47950b;

        /* renamed from: c */
        public List<TodoCommentReaction> f47951c = Internal.newMutableList();

        /* renamed from: d */
        public Long f47952d;

        /* renamed from: a */
        public PushTodoCommentReaction build() {
            return new PushTodoCommentReaction(this.f47949a, this.f47950b, this.f47951c, this.f47952d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19601a newBuilder() {
        C19601a aVar = new C19601a();
        aVar.f47949a = this.todo_guid;
        aVar.f47950b = this.comment_id;
        aVar.f47951c = Internal.copyOf("reactions", this.reactions);
        aVar.f47952d = this.update_milli_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodoCommentReaction");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        if (this.update_milli_time != null) {
            sb.append(", update_milli_time=");
            sb.append(this.update_milli_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodoCommentReaction{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodoCommentReaction(String str, String str2, List<TodoCommentReaction> list, Long l) {
        this(str, str2, list, l, ByteString.EMPTY);
    }

    public PushTodoCommentReaction(String str, String str2, List<TodoCommentReaction> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.comment_id = str2;
        this.reactions = Internal.immutableCopyOf("reactions", list);
        this.update_milli_time = l;
    }
}
