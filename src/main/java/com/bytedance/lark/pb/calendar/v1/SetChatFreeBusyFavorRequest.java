package com.bytedance.lark.pb.calendar.v1;

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

public final class SetChatFreeBusyFavorRequest extends Message<SetChatFreeBusyFavorRequest, C16042a> {
    public static final ProtoAdapter<SetChatFreeBusyFavorRequest> ADAPTER = new C16043b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> ordered_favor_chatter_ids;
    public final List<String> selected_favor_chatter_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetChatFreeBusyFavorRequest$b */
    private static final class C16043b extends ProtoAdapter<SetChatFreeBusyFavorRequest> {
        C16043b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetChatFreeBusyFavorRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetChatFreeBusyFavorRequest setChatFreeBusyFavorRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setChatFreeBusyFavorRequest.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, setChatFreeBusyFavorRequest.ordered_favor_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, setChatFreeBusyFavorRequest.selected_favor_chatter_ids) + setChatFreeBusyFavorRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetChatFreeBusyFavorRequest decode(ProtoReader protoReader) throws IOException {
            C16042a aVar = new C16042a();
            aVar.f42117a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42117a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42118b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42119c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetChatFreeBusyFavorRequest setChatFreeBusyFavorRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setChatFreeBusyFavorRequest.chat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, setChatFreeBusyFavorRequest.ordered_favor_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, setChatFreeBusyFavorRequest.selected_favor_chatter_ids);
            protoWriter.writeBytes(setChatFreeBusyFavorRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetChatFreeBusyFavorRequest$a */
    public static final class C16042a extends Message.Builder<SetChatFreeBusyFavorRequest, C16042a> {

        /* renamed from: a */
        public String f42117a;

        /* renamed from: b */
        public List<String> f42118b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f42119c = Internal.newMutableList();

        /* renamed from: a */
        public SetChatFreeBusyFavorRequest build() {
            String str = this.f42117a;
            if (str != null) {
                return new SetChatFreeBusyFavorRequest(str, this.f42118b, this.f42119c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C16042a mo57695a(String str) {
            this.f42117a = str;
            return this;
        }

        /* renamed from: a */
        public C16042a mo57696a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42118b = list;
            return this;
        }

        /* renamed from: b */
        public C16042a mo57698b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42119c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16042a newBuilder() {
        C16042a aVar = new C16042a();
        aVar.f42117a = this.chat_id;
        aVar.f42118b = Internal.copyOf("ordered_favor_chatter_ids", this.ordered_favor_chatter_ids);
        aVar.f42119c = Internal.copyOf("selected_favor_chatter_ids", this.selected_favor_chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SetChatFreeBusyFavorRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.ordered_favor_chatter_ids.isEmpty()) {
            sb.append(", ordered_favor_chatter_ids=");
            sb.append(this.ordered_favor_chatter_ids);
        }
        if (!this.selected_favor_chatter_ids.isEmpty()) {
            sb.append(", selected_favor_chatter_ids=");
            sb.append(this.selected_favor_chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SetChatFreeBusyFavorRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetChatFreeBusyFavorRequest(String str, List<String> list, List<String> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public SetChatFreeBusyFavorRequest(String str, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.ordered_favor_chatter_ids = Internal.immutableCopyOf("ordered_favor_chatter_ids", list);
        this.selected_favor_chatter_ids = Internal.immutableCopyOf("selected_favor_chatter_ids", list2);
    }
}
