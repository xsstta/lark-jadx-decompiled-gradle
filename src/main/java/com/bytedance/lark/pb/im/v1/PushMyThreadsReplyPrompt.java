package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushMyThreadsReplyPrompt extends Message<PushMyThreadsReplyPrompt, C17933a> {
    public static final ProtoAdapter<PushMyThreadsReplyPrompt> ADAPTER = new C17934b();
    public static final Integer DEFAULT_NEW_AT_REPLY_COUNT = 0;
    public static final Integer DEFAULT_NEW_REPLY_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final String group_id;
    public final Integer new_at_reply_count;
    public final List<String> new_at_reply_ids;
    public final Integer new_reply_count;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMyThreadsReplyPrompt$b */
    private static final class C17934b extends ProtoAdapter<PushMyThreadsReplyPrompt> {
        C17934b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMyThreadsReplyPrompt.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMyThreadsReplyPrompt pushMyThreadsReplyPrompt) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushMyThreadsReplyPrompt.group_id);
            int i3 = 0;
            if (pushMyThreadsReplyPrompt.new_reply_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pushMyThreadsReplyPrompt.new_reply_count);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, pushMyThreadsReplyPrompt.new_at_reply_ids);
            if (pushMyThreadsReplyPrompt.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(4, pushMyThreadsReplyPrompt.entity);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag2 + i2;
            if (pushMyThreadsReplyPrompt.new_at_reply_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, pushMyThreadsReplyPrompt.new_at_reply_count);
            }
            return i4 + i3 + pushMyThreadsReplyPrompt.unknownFields().size();
        }

        /* renamed from: a */
        public PushMyThreadsReplyPrompt decode(ProtoReader protoReader) throws IOException {
            C17933a aVar = new C17933a();
            aVar.f45022a = "";
            aVar.f45023b = 0;
            aVar.f45026e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45022a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45023b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45024c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f45025d = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45026e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMyThreadsReplyPrompt pushMyThreadsReplyPrompt) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushMyThreadsReplyPrompt.group_id);
            if (pushMyThreadsReplyPrompt.new_reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushMyThreadsReplyPrompt.new_reply_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, pushMyThreadsReplyPrompt.new_at_reply_ids);
            if (pushMyThreadsReplyPrompt.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 4, pushMyThreadsReplyPrompt.entity);
            }
            if (pushMyThreadsReplyPrompt.new_at_reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, pushMyThreadsReplyPrompt.new_at_reply_count);
            }
            protoWriter.writeBytes(pushMyThreadsReplyPrompt.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMyThreadsReplyPrompt$a */
    public static final class C17933a extends Message.Builder<PushMyThreadsReplyPrompt, C17933a> {

        /* renamed from: a */
        public String f45022a;

        /* renamed from: b */
        public Integer f45023b;

        /* renamed from: c */
        public List<String> f45024c = Internal.newMutableList();

        /* renamed from: d */
        public C14928Entity f45025d;

        /* renamed from: e */
        public Integer f45026e;

        /* renamed from: a */
        public PushMyThreadsReplyPrompt build() {
            String str = this.f45022a;
            if (str != null) {
                return new PushMyThreadsReplyPrompt(str, this.f45023b, this.f45024c, this.f45025d, this.f45026e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "group_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C17933a newBuilder() {
        C17933a aVar = new C17933a();
        aVar.f45022a = this.group_id;
        aVar.f45023b = this.new_reply_count;
        aVar.f45024c = Internal.copyOf("new_at_reply_ids", this.new_at_reply_ids);
        aVar.f45025d = this.entity;
        aVar.f45026e = this.new_at_reply_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushMyThreadsReplyPrompt");
        StringBuilder sb = new StringBuilder();
        sb.append(", group_id=");
        sb.append(this.group_id);
        if (this.new_reply_count != null) {
            sb.append(", new_reply_count=");
            sb.append(this.new_reply_count);
        }
        if (!this.new_at_reply_ids.isEmpty()) {
            sb.append(", new_at_reply_ids=");
            sb.append(this.new_at_reply_ids);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.new_at_reply_count != null) {
            sb.append(", new_at_reply_count=");
            sb.append(this.new_at_reply_count);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMyThreadsReplyPrompt{");
        replace.append('}');
        return replace.toString();
    }

    public PushMyThreadsReplyPrompt(String str, Integer num, List<String> list, C14928Entity entity2, Integer num2) {
        this(str, num, list, entity2, num2, ByteString.EMPTY);
    }

    public PushMyThreadsReplyPrompt(String str, Integer num, List<String> list, C14928Entity entity2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_id = str;
        this.new_reply_count = num;
        this.new_at_reply_ids = Internal.immutableCopyOf("new_at_reply_ids", list);
        this.entity = entity2;
        this.new_at_reply_count = num2;
    }
}
