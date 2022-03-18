package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetFocusChatterListResponse extends Message<GetFocusChatterListResponse, C16246a> {
    public static final ProtoAdapter<GetFocusChatterListResponse> ADAPTER = new C16247b();
    private static final long serialVersionUID = 0;
    public final List<Chatter> chatters;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetFocusChatterListResponse$b */
    private static final class C16247b extends ProtoAdapter<GetFocusChatterListResponse> {
        C16247b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFocusChatterListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFocusChatterListResponse getFocusChatterListResponse) {
            return Chatter.ADAPTER.asRepeated().encodedSizeWithTag(1, getFocusChatterListResponse.chatters) + getFocusChatterListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFocusChatterListResponse decode(ProtoReader protoReader) throws IOException {
            C16246a aVar = new C16246a();
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
                    aVar.f42442a.add(Chatter.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFocusChatterListResponse getFocusChatterListResponse) throws IOException {
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFocusChatterListResponse.chatters);
            protoWriter.writeBytes(getFocusChatterListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetFocusChatterListResponse$a */
    public static final class C16246a extends Message.Builder<GetFocusChatterListResponse, C16246a> {

        /* renamed from: a */
        public List<Chatter> f42442a = Internal.newMutableList();

        /* renamed from: a */
        public GetFocusChatterListResponse build() {
            return new GetFocusChatterListResponse(this.f42442a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16246a newBuilder() {
        C16246a aVar = new C16246a();
        aVar.f42442a = Internal.copyOf("chatters", this.chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetFocusChatterListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFocusChatterListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFocusChatterListResponse(List<Chatter> list) {
        this(list, ByteString.EMPTY);
    }

    public GetFocusChatterListResponse(List<Chatter> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatters = Internal.immutableCopyOf("chatters", list);
    }
}
