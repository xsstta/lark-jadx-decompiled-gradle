package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUserCustomStatusResponse extends Message<GetUserCustomStatusResponse, C16274a> {
    public static final ProtoAdapter<GetUserCustomStatusResponse> ADAPTER = new C16275b();
    private static final long serialVersionUID = 0;
    public final List<UserCustomStatus> status;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserCustomStatusResponse$b */
    private static final class C16275b extends ProtoAdapter<GetUserCustomStatusResponse> {
        C16275b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserCustomStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserCustomStatusResponse getUserCustomStatusResponse) {
            return UserCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserCustomStatusResponse.status) + getUserCustomStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserCustomStatusResponse decode(ProtoReader protoReader) throws IOException {
            C16274a aVar = new C16274a();
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
                    aVar.f42471a.add(UserCustomStatus.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserCustomStatusResponse getUserCustomStatusResponse) throws IOException {
            UserCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserCustomStatusResponse.status);
            protoWriter.writeBytes(getUserCustomStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserCustomStatusResponse$a */
    public static final class C16274a extends Message.Builder<GetUserCustomStatusResponse, C16274a> {

        /* renamed from: a */
        public List<UserCustomStatus> f42471a = Internal.newMutableList();

        /* renamed from: a */
        public GetUserCustomStatusResponse build() {
            return new GetUserCustomStatusResponse(this.f42471a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16274a newBuilder() {
        C16274a aVar = new C16274a();
        aVar.f42471a = Internal.copyOf(UpdateKey.STATUS, this.status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserCustomStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.status.isEmpty()) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserCustomStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserCustomStatusResponse(List<UserCustomStatus> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUserCustomStatusResponse(List<UserCustomStatus> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = Internal.immutableCopyOf(UpdateKey.STATUS, list);
    }
}
