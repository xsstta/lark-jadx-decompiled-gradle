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

public final class MergeMessagesAsTodoResourceRequest extends Message<MergeMessagesAsTodoResourceRequest, C19589a> {
    public static final ProtoAdapter<MergeMessagesAsTodoResourceRequest> ADAPTER = new C19590b();
    public static final Boolean DEFAULT_SHOULD_MERGE = true;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> msg_ids;
    public final Boolean should_merge;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeMessagesAsTodoResourceRequest$b */
    private static final class C19590b extends ProtoAdapter<MergeMessagesAsTodoResourceRequest> {
        C19590b() {
            super(FieldEncoding.LENGTH_DELIMITED, MergeMessagesAsTodoResourceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MergeMessagesAsTodoResourceRequest mergeMessagesAsTodoResourceRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mergeMessagesAsTodoResourceRequest.msg_ids);
            int i2 = 0;
            if (mergeMessagesAsTodoResourceRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mergeMessagesAsTodoResourceRequest.chat_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mergeMessagesAsTodoResourceRequest.should_merge != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mergeMessagesAsTodoResourceRequest.should_merge);
            }
            return i3 + i2 + mergeMessagesAsTodoResourceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MergeMessagesAsTodoResourceRequest decode(ProtoReader protoReader) throws IOException {
            C19589a aVar = new C19589a();
            aVar.f47941b = "";
            aVar.f47942c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47940a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47941b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47942c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MergeMessagesAsTodoResourceRequest mergeMessagesAsTodoResourceRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mergeMessagesAsTodoResourceRequest.msg_ids);
            if (mergeMessagesAsTodoResourceRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mergeMessagesAsTodoResourceRequest.chat_id);
            }
            if (mergeMessagesAsTodoResourceRequest.should_merge != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mergeMessagesAsTodoResourceRequest.should_merge);
            }
            protoWriter.writeBytes(mergeMessagesAsTodoResourceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MergeMessagesAsTodoResourceRequest$a */
    public static final class C19589a extends Message.Builder<MergeMessagesAsTodoResourceRequest, C19589a> {

        /* renamed from: a */
        public List<String> f47940a = Internal.newMutableList();

        /* renamed from: b */
        public String f47941b;

        /* renamed from: c */
        public Boolean f47942c;

        /* renamed from: a */
        public MergeMessagesAsTodoResourceRequest build() {
            return new MergeMessagesAsTodoResourceRequest(this.f47940a, this.f47941b, this.f47942c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19589a mo66514a(Boolean bool) {
            this.f47942c = bool;
            return this;
        }

        /* renamed from: a */
        public C19589a mo66515a(String str) {
            this.f47941b = str;
            return this;
        }

        /* renamed from: a */
        public C19589a mo66516a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47940a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19589a newBuilder() {
        C19589a aVar = new C19589a();
        aVar.f47940a = Internal.copyOf("msg_ids", this.msg_ids);
        aVar.f47941b = this.chat_id;
        aVar.f47942c = this.should_merge;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MergeMessagesAsTodoResourceRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.msg_ids.isEmpty()) {
            sb.append(", msg_ids=");
            sb.append(this.msg_ids);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.should_merge != null) {
            sb.append(", should_merge=");
            sb.append(this.should_merge);
        }
        StringBuilder replace = sb.replace(0, 2, "MergeMessagesAsTodoResourceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MergeMessagesAsTodoResourceRequest(List<String> list, String str, Boolean bool) {
        this(list, str, bool, ByteString.EMPTY);
    }

    public MergeMessagesAsTodoResourceRequest(List<String> list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_ids = Internal.immutableCopyOf("msg_ids", list);
        this.chat_id = str;
        this.should_merge = bool;
    }
}
