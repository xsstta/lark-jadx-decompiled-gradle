package com.bytedance.lark.pb.im.v1;

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

public final class UpdateChatTabRequest extends Message<UpdateChatTabRequest, C18145a> {
    public static final ProtoAdapter<UpdateChatTabRequest> ADAPTER = new C18146b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final List<Long> delete_tab_ids;
    public final List<Long> reorder_tab_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabRequest$b */
    private static final class C18146b extends ProtoAdapter<UpdateChatTabRequest> {
        C18146b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatTabRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatTabRequest updateChatTabRequest) {
            int i;
            if (updateChatTabRequest.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, updateChatTabRequest.chat_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, updateChatTabRequest.delete_tab_ids) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, updateChatTabRequest.reorder_tab_ids) + updateChatTabRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatTabRequest decode(ProtoReader protoReader) throws IOException {
            C18145a aVar = new C18145a();
            aVar.f45341a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45341a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45342b.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45343c.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatTabRequest updateChatTabRequest) throws IOException {
            if (updateChatTabRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateChatTabRequest.chat_id);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, updateChatTabRequest.delete_tab_ids);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 3, updateChatTabRequest.reorder_tab_ids);
            protoWriter.writeBytes(updateChatTabRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatTabRequest$a */
    public static final class C18145a extends Message.Builder<UpdateChatTabRequest, C18145a> {

        /* renamed from: a */
        public Long f45341a;

        /* renamed from: b */
        public List<Long> f45342b = Internal.newMutableList();

        /* renamed from: c */
        public List<Long> f45343c = Internal.newMutableList();

        /* renamed from: a */
        public UpdateChatTabRequest build() {
            return new UpdateChatTabRequest(this.f45341a, this.f45342b, this.f45343c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18145a mo62942a(Long l) {
            this.f45341a = l;
            return this;
        }

        /* renamed from: a */
        public C18145a mo62943a(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.f45342b = list;
            return this;
        }

        /* renamed from: b */
        public C18145a mo62945b(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.f45343c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18145a newBuilder() {
        C18145a aVar = new C18145a();
        aVar.f45341a = this.chat_id;
        aVar.f45342b = Internal.copyOf("delete_tab_ids", this.delete_tab_ids);
        aVar.f45343c = Internal.copyOf("reorder_tab_ids", this.reorder_tab_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatTabRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (!this.delete_tab_ids.isEmpty()) {
            sb.append(", delete_tab_ids=");
            sb.append(this.delete_tab_ids);
        }
        if (!this.reorder_tab_ids.isEmpty()) {
            sb.append(", reorder_tab_ids=");
            sb.append(this.reorder_tab_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatTabRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatTabRequest(Long l, List<Long> list, List<Long> list2) {
        this(l, list, list2, ByteString.EMPTY);
    }

    public UpdateChatTabRequest(Long l, List<Long> list, List<Long> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.delete_tab_ids = Internal.immutableCopyOf("delete_tab_ids", list);
        this.reorder_tab_ids = Internal.immutableCopyOf("reorder_tab_ids", list2);
    }
}
