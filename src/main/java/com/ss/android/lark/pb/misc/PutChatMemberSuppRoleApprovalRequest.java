package com.ss.android.lark.pb.misc;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PutChatMemberSuppRoleApprovalRequest extends Message<PutChatMemberSuppRoleApprovalRequest, C49888a> {
    public static final ProtoAdapter<PutChatMemberSuppRoleApprovalRequest> ADAPTER = new C49889b();
    public static final Integer DEFAULT_APPLY_UPPER_LIMIT = 0;
    public static final Long DEFAULT_CHAT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Integer mapply_upper_limit;
    public final Long mchat_id;
    public final String mdescription;

    /* renamed from: com.ss.android.lark.pb.misc.PutChatMemberSuppRoleApprovalRequest$b */
    private static final class C49889b extends ProtoAdapter<PutChatMemberSuppRoleApprovalRequest> {
        C49889b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutChatMemberSuppRoleApprovalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutChatMemberSuppRoleApprovalRequest putChatMemberSuppRoleApprovalRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, putChatMemberSuppRoleApprovalRequest.mchat_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, putChatMemberSuppRoleApprovalRequest.mapply_upper_limit) + ProtoAdapter.STRING.encodedSizeWithTag(3, putChatMemberSuppRoleApprovalRequest.mdescription) + putChatMemberSuppRoleApprovalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutChatMemberSuppRoleApprovalRequest decode(ProtoReader protoReader) throws IOException {
            C49888a aVar = new C49888a();
            aVar.f124910a = 0L;
            aVar.f124911b = 0;
            aVar.f124912c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124910a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124911b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124912c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutChatMemberSuppRoleApprovalRequest putChatMemberSuppRoleApprovalRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, putChatMemberSuppRoleApprovalRequest.mchat_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, putChatMemberSuppRoleApprovalRequest.mapply_upper_limit);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, putChatMemberSuppRoleApprovalRequest.mdescription);
            protoWriter.writeBytes(putChatMemberSuppRoleApprovalRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49888a newBuilder() {
        C49888a aVar = new C49888a();
        aVar.f124910a = this.mchat_id;
        aVar.f124911b = this.mapply_upper_limit;
        aVar.f124912c = this.mdescription;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.misc.PutChatMemberSuppRoleApprovalRequest$a */
    public static final class C49888a extends Message.Builder<PutChatMemberSuppRoleApprovalRequest, C49888a> {

        /* renamed from: a */
        public Long f124910a;

        /* renamed from: b */
        public Integer f124911b;

        /* renamed from: c */
        public String f124912c;

        /* renamed from: a */
        public PutChatMemberSuppRoleApprovalRequest build() {
            Integer num;
            String str;
            Long l = this.f124910a;
            if (l != null && (num = this.f124911b) != null && (str = this.f124912c) != null) {
                return new PutChatMemberSuppRoleApprovalRequest(l, num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "mchat_id", this.f124911b, "mapply_upper_limit", this.f124912c, "mdescription");
        }

        /* renamed from: a */
        public C49888a mo173535a(Integer num) {
            this.f124911b = num;
            return this;
        }

        /* renamed from: a */
        public C49888a mo173536a(Long l) {
            this.f124910a = l;
            return this;
        }

        /* renamed from: a */
        public C49888a mo173537a(String str) {
            this.f124912c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.mchat_id);
        sb.append(", apply_upper_limit=");
        sb.append(this.mapply_upper_limit);
        sb.append(", description=");
        sb.append(this.mdescription);
        StringBuilder replace = sb.replace(0, 2, "PutChatMemberSuppRoleApprovalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutChatMemberSuppRoleApprovalRequest(Long l, Integer num, String str) {
        this(l, num, str, ByteString.EMPTY);
    }

    public PutChatMemberSuppRoleApprovalRequest(Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = l;
        this.mapply_upper_limit = num;
        this.mdescription = str;
    }
}
