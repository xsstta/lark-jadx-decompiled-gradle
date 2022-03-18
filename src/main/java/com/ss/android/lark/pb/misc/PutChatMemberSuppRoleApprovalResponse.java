package com.ss.android.lark.pb.misc;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutChatMemberSuppRoleApprovalResponse extends Message<PutChatMemberSuppRoleApprovalResponse, C49890a> {
    public static final ProtoAdapter<PutChatMemberSuppRoleApprovalResponse> ADAPTER = new C49891b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.misc.PutChatMemberSuppRoleApprovalResponse$b */
    private static final class C49891b extends ProtoAdapter<PutChatMemberSuppRoleApprovalResponse> {
        C49891b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutChatMemberSuppRoleApprovalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutChatMemberSuppRoleApprovalResponse putChatMemberSuppRoleApprovalResponse) {
            return putChatMemberSuppRoleApprovalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutChatMemberSuppRoleApprovalResponse decode(ProtoReader protoReader) throws IOException {
            C49890a aVar = new C49890a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutChatMemberSuppRoleApprovalResponse putChatMemberSuppRoleApprovalResponse) throws IOException {
            protoWriter.writeBytes(putChatMemberSuppRoleApprovalResponse.unknownFields());
        }
    }

    public PutChatMemberSuppRoleApprovalResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.misc.PutChatMemberSuppRoleApprovalResponse$a */
    public static final class C49890a extends Message.Builder<PutChatMemberSuppRoleApprovalResponse, C49890a> {
        /* renamed from: a */
        public PutChatMemberSuppRoleApprovalResponse build() {
            return new PutChatMemberSuppRoleApprovalResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49890a newBuilder() {
        C49890a aVar = new C49890a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutChatMemberSuppRoleApprovalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutChatMemberSuppRoleApprovalResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
