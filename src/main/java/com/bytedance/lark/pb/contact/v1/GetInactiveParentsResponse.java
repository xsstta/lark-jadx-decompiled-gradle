package com.bytedance.lark.pb.contact.v1;

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

public final class GetInactiveParentsResponse extends Message<GetInactiveParentsResponse, C16250a> {
    public static final ProtoAdapter<GetInactiveParentsResponse> ADAPTER = new C16251b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<InactiveParent2> inactive_parent;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInactiveParentsResponse$b */
    private static final class C16251b extends ProtoAdapter<GetInactiveParentsResponse> {
        C16251b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInactiveParentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInactiveParentsResponse getInactiveParentsResponse) {
            int i;
            if (getInactiveParentsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getInactiveParentsResponse.has_more);
            } else {
                i = 0;
            }
            return i + InactiveParent2.ADAPTER.asRepeated().encodedSizeWithTag(2, getInactiveParentsResponse.inactive_parent) + getInactiveParentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetInactiveParentsResponse decode(ProtoReader protoReader) throws IOException {
            C16250a aVar = new C16250a();
            aVar.f42447a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42447a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42448b.add(InactiveParent2.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInactiveParentsResponse getInactiveParentsResponse) throws IOException {
            if (getInactiveParentsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getInactiveParentsResponse.has_more);
            }
            InactiveParent2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getInactiveParentsResponse.inactive_parent);
            protoWriter.writeBytes(getInactiveParentsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetInactiveParentsResponse$a */
    public static final class C16250a extends Message.Builder<GetInactiveParentsResponse, C16250a> {

        /* renamed from: a */
        public Boolean f42447a;

        /* renamed from: b */
        public List<InactiveParent2> f42448b = Internal.newMutableList();

        /* renamed from: a */
        public GetInactiveParentsResponse build() {
            return new GetInactiveParentsResponse(this.f42447a, this.f42448b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16250a newBuilder() {
        C16250a aVar = new C16250a();
        aVar.f42447a = this.has_more;
        aVar.f42448b = Internal.copyOf("inactive_parent", this.inactive_parent);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetInactiveParentsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (!this.inactive_parent.isEmpty()) {
            sb.append(", inactive_parent=");
            sb.append(this.inactive_parent);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInactiveParentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetInactiveParentsResponse(Boolean bool, List<InactiveParent2> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public GetInactiveParentsResponse(Boolean bool, List<InactiveParent2> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_more = bool;
        this.inactive_parent = Internal.immutableCopyOf("inactive_parent", list);
    }
}
