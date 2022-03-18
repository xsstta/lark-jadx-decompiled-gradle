package com.ss.android.lark.pb.misc;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullChatMemberSuppRoleApprovalSettingRequest extends Message<PullChatMemberSuppRoleApprovalSettingRequest, C49884a> {
    public static final ProtoAdapter<PullChatMemberSuppRoleApprovalSettingRequest> ADAPTER = new C49885b();
    public static final Long DEFAULT_TENANT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mtenant_id;

    /* renamed from: com.ss.android.lark.pb.misc.PullChatMemberSuppRoleApprovalSettingRequest$b */
    private static final class C49885b extends ProtoAdapter<PullChatMemberSuppRoleApprovalSettingRequest> {
        C49885b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatMemberSuppRoleApprovalSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatMemberSuppRoleApprovalSettingRequest pullChatMemberSuppRoleApprovalSettingRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, pullChatMemberSuppRoleApprovalSettingRequest.mtenant_id) + pullChatMemberSuppRoleApprovalSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatMemberSuppRoleApprovalSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49884a aVar = new C49884a();
            aVar.f124906a = 0L;
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
                    aVar.f124906a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatMemberSuppRoleApprovalSettingRequest pullChatMemberSuppRoleApprovalSettingRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pullChatMemberSuppRoleApprovalSettingRequest.mtenant_id);
            protoWriter.writeBytes(pullChatMemberSuppRoleApprovalSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.misc.PullChatMemberSuppRoleApprovalSettingRequest$a */
    public static final class C49884a extends Message.Builder<PullChatMemberSuppRoleApprovalSettingRequest, C49884a> {

        /* renamed from: a */
        public Long f124906a;

        /* renamed from: a */
        public PullChatMemberSuppRoleApprovalSettingRequest build() {
            Long l = this.f124906a;
            if (l != null) {
                return new PullChatMemberSuppRoleApprovalSettingRequest(l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "mtenant_id");
        }

        /* renamed from: a */
        public C49884a mo173526a(Long l) {
            this.f124906a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49884a newBuilder() {
        C49884a aVar = new C49884a();
        aVar.f124906a = this.mtenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", tenant_id=");
        sb.append(this.mtenant_id);
        StringBuilder replace = sb.replace(0, 2, "PullChatMemberSuppRoleApprovalSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatMemberSuppRoleApprovalSettingRequest(Long l) {
        this(l, ByteString.EMPTY);
    }

    public PullChatMemberSuppRoleApprovalSettingRequest(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtenant_id = l;
    }
}
