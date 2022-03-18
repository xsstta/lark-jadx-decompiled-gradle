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

public final class CreateUrgentResponse extends Message<CreateUrgentResponse, C17392a> {
    public static final ProtoAdapter<CreateUrgentResponse> ADAPTER = new C17393b();
    private static final long serialVersionUID = 0;
    public final List<String> invisible_chatter_ids;
    public final List<String> success_chatter_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateUrgentResponse$b */
    private static final class C17393b extends ProtoAdapter<CreateUrgentResponse> {
        C17393b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateUrgentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateUrgentResponse createUrgentResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, createUrgentResponse.success_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, createUrgentResponse.invisible_chatter_ids) + createUrgentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateUrgentResponse decode(ProtoReader protoReader) throws IOException {
            C17392a aVar = new C17392a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44300a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44301b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateUrgentResponse createUrgentResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, createUrgentResponse.success_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, createUrgentResponse.invisible_chatter_ids);
            protoWriter.writeBytes(createUrgentResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateUrgentResponse$a */
    public static final class C17392a extends Message.Builder<CreateUrgentResponse, C17392a> {

        /* renamed from: a */
        public List<String> f44300a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f44301b = Internal.newMutableList();

        /* renamed from: a */
        public CreateUrgentResponse build() {
            return new CreateUrgentResponse(this.f44300a, this.f44301b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17392a newBuilder() {
        C17392a aVar = new C17392a();
        aVar.f44300a = Internal.copyOf("success_chatter_ids", this.success_chatter_ids);
        aVar.f44301b = Internal.copyOf("invisible_chatter_ids", this.invisible_chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateUrgentResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.success_chatter_ids.isEmpty()) {
            sb.append(", success_chatter_ids=");
            sb.append(this.success_chatter_ids);
        }
        if (!this.invisible_chatter_ids.isEmpty()) {
            sb.append(", invisible_chatter_ids=");
            sb.append(this.invisible_chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateUrgentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateUrgentResponse(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public CreateUrgentResponse(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_chatter_ids = Internal.immutableCopyOf("success_chatter_ids", list);
        this.invisible_chatter_ids = Internal.immutableCopyOf("invisible_chatter_ids", list2);
    }
}
