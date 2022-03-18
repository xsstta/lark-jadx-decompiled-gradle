package com.ss.android.lark.pb.videoconference.v1;

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

public final class VCManageApprovalResponse extends Message<VCManageApprovalResponse, C51150a> {
    public static final ProtoAdapter<VCManageApprovalResponse> ADAPTER = new C51151b();
    private static final long serialVersionUID = 0;
    public final List<ByteviewUser> users;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageApprovalResponse$b */
    private static final class C51151b extends ProtoAdapter<VCManageApprovalResponse> {
        C51151b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageApprovalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageApprovalResponse vCManageApprovalResponse) {
            return ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(1, vCManageApprovalResponse.users) + vCManageApprovalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageApprovalResponse decode(ProtoReader protoReader) throws IOException {
            C51150a aVar = new C51150a();
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
                    aVar.f127294a.add(ByteviewUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageApprovalResponse vCManageApprovalResponse) throws IOException {
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vCManageApprovalResponse.users);
            protoWriter.writeBytes(vCManageApprovalResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageApprovalResponse$a */
    public static final class C51150a extends Message.Builder<VCManageApprovalResponse, C51150a> {

        /* renamed from: a */
        public List<ByteviewUser> f127294a = Internal.newMutableList();

        /* renamed from: a */
        public VCManageApprovalResponse build() {
            return new VCManageApprovalResponse(this.f127294a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51150a newBuilder() {
        C51150a aVar = new C51150a();
        aVar.f127294a = Internal.copyOf("users", this.users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCManageApprovalResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageApprovalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageApprovalResponse(List<ByteviewUser> list) {
        this(list, ByteString.EMPTY);
    }

    public VCManageApprovalResponse(List<ByteviewUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = Internal.immutableCopyOf("users", list);
    }
}
