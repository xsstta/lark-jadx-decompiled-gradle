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

public final class GetChatFreeBusyFavorResponse extends Message<GetChatFreeBusyFavorResponse, C15682a> {
    public static final ProtoAdapter<GetChatFreeBusyFavorResponse> ADAPTER = new C15683b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> ordered_favor_chatter_ids;
    public final List<String> selected_favor_chatter_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorResponse$b */
    private static final class C15683b extends ProtoAdapter<GetChatFreeBusyFavorResponse> {
        C15683b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatFreeBusyFavorResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatFreeBusyFavorResponse getChatFreeBusyFavorResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatFreeBusyFavorResponse.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getChatFreeBusyFavorResponse.ordered_favor_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getChatFreeBusyFavorResponse.selected_favor_chatter_ids) + getChatFreeBusyFavorResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatFreeBusyFavorResponse decode(ProtoReader protoReader) throws IOException {
            C15682a aVar = new C15682a();
            aVar.f41443a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41443a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41444b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41445c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatFreeBusyFavorResponse getChatFreeBusyFavorResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatFreeBusyFavorResponse.chat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getChatFreeBusyFavorResponse.ordered_favor_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getChatFreeBusyFavorResponse.selected_favor_chatter_ids);
            protoWriter.writeBytes(getChatFreeBusyFavorResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorResponse$a */
    public static final class C15682a extends Message.Builder<GetChatFreeBusyFavorResponse, C15682a> {

        /* renamed from: a */
        public String f41443a;

        /* renamed from: b */
        public List<String> f41444b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f41445c = Internal.newMutableList();

        /* renamed from: a */
        public GetChatFreeBusyFavorResponse build() {
            String str = this.f41443a;
            if (str != null) {
                return new GetChatFreeBusyFavorResponse(str, this.f41444b, this.f41445c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15682a newBuilder() {
        C15682a aVar = new C15682a();
        aVar.f41443a = this.chat_id;
        aVar.f41444b = Internal.copyOf("ordered_favor_chatter_ids", this.ordered_favor_chatter_ids);
        aVar.f41445c = Internal.copyOf("selected_favor_chatter_ids", this.selected_favor_chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetChatFreeBusyFavorResponse");
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
        StringBuilder replace = sb.replace(0, 2, "GetChatFreeBusyFavorResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatFreeBusyFavorResponse(String str, List<String> list, List<String> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public GetChatFreeBusyFavorResponse(String str, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.ordered_favor_chatter_ids = Internal.immutableCopyOf("ordered_favor_chatter_ids", list);
        this.selected_favor_chatter_ids = Internal.immutableCopyOf("selected_favor_chatter_ids", list2);
    }
}
