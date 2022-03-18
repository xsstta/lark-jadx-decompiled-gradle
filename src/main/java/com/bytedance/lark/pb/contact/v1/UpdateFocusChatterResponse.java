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

public final class UpdateFocusChatterResponse extends Message<UpdateFocusChatterResponse, C16412a> {
    public static final ProtoAdapter<UpdateFocusChatterResponse> ADAPTER = new C16413b();
    private static final long serialVersionUID = 0;
    public final List<Chatter> add_chatters;

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateFocusChatterResponse$b */
    private static final class C16413b extends ProtoAdapter<UpdateFocusChatterResponse> {
        C16413b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateFocusChatterResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateFocusChatterResponse updateFocusChatterResponse) {
            return Chatter.ADAPTER.asRepeated().encodedSizeWithTag(1, updateFocusChatterResponse.add_chatters) + updateFocusChatterResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateFocusChatterResponse decode(ProtoReader protoReader) throws IOException {
            C16412a aVar = new C16412a();
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
                    aVar.f42682a.add(Chatter.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateFocusChatterResponse updateFocusChatterResponse) throws IOException {
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateFocusChatterResponse.add_chatters);
            protoWriter.writeBytes(updateFocusChatterResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateFocusChatterResponse$a */
    public static final class C16412a extends Message.Builder<UpdateFocusChatterResponse, C16412a> {

        /* renamed from: a */
        public List<Chatter> f42682a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateFocusChatterResponse build() {
            return new UpdateFocusChatterResponse(this.f42682a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16412a newBuilder() {
        C16412a aVar = new C16412a();
        aVar.f42682a = Internal.copyOf("add_chatters", this.add_chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateFocusChatterResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.add_chatters.isEmpty()) {
            sb.append(", add_chatters=");
            sb.append(this.add_chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateFocusChatterResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateFocusChatterResponse(List<Chatter> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateFocusChatterResponse(List<Chatter> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.add_chatters = Internal.immutableCopyOf("add_chatters", list);
    }
}
