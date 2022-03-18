package com.ss.android.lark.pb.misc;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullChatMemberSuppRoleApprovalSettingResponse extends Message<PullChatMemberSuppRoleApprovalSettingResponse, C49886a> {
    public static final ProtoAdapter<PullChatMemberSuppRoleApprovalSettingResponse> ADAPTER = new C49887b();
    private static final long serialVersionUID = 0;
    public final List<Integer> mapply_upper_limit_options;
    public final String mapproval_desc_link;
    public final List<Long> mapprover_ids;

    /* renamed from: com.ss.android.lark.pb.misc.PullChatMemberSuppRoleApprovalSettingResponse$b */
    private static final class C49887b extends ProtoAdapter<PullChatMemberSuppRoleApprovalSettingResponse> {
        C49887b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatMemberSuppRoleApprovalSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatMemberSuppRoleApprovalSettingResponse pullChatMemberSuppRoleApprovalSettingResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, pullChatMemberSuppRoleApprovalSettingResponse.mapprover_ids) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, pullChatMemberSuppRoleApprovalSettingResponse.mapply_upper_limit_options);
            if (pullChatMemberSuppRoleApprovalSettingResponse.mapproval_desc_link != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, pullChatMemberSuppRoleApprovalSettingResponse.mapproval_desc_link);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pullChatMemberSuppRoleApprovalSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatMemberSuppRoleApprovalSettingResponse decode(ProtoReader protoReader) throws IOException {
            C49886a aVar = new C49886a();
            aVar.f124909c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124907a.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f124908b.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124909c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatMemberSuppRoleApprovalSettingResponse pullChatMemberSuppRoleApprovalSettingResponse) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, pullChatMemberSuppRoleApprovalSettingResponse.mapprover_ids);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, pullChatMemberSuppRoleApprovalSettingResponse.mapply_upper_limit_options);
            if (pullChatMemberSuppRoleApprovalSettingResponse.mapproval_desc_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullChatMemberSuppRoleApprovalSettingResponse.mapproval_desc_link);
            }
            protoWriter.writeBytes(pullChatMemberSuppRoleApprovalSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.misc.PullChatMemberSuppRoleApprovalSettingResponse$a */
    public static final class C49886a extends Message.Builder<PullChatMemberSuppRoleApprovalSettingResponse, C49886a> {

        /* renamed from: a */
        public List<Long> f124907a = Internal.newMutableList();

        /* renamed from: b */
        public List<Integer> f124908b = Internal.newMutableList();

        /* renamed from: c */
        public String f124909c;

        /* renamed from: a */
        public PullChatMemberSuppRoleApprovalSettingResponse build() {
            return new PullChatMemberSuppRoleApprovalSettingResponse(this.f124907a, this.f124908b, this.f124909c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49886a newBuilder() {
        C49886a aVar = new C49886a();
        aVar.f124907a = Internal.copyOf("mapprover_ids", this.mapprover_ids);
        aVar.f124908b = Internal.copyOf("mapply_upper_limit_options", this.mapply_upper_limit_options);
        aVar.f124909c = this.mapproval_desc_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mapprover_ids.isEmpty()) {
            sb.append(", approver_ids=");
            sb.append(this.mapprover_ids);
        }
        if (!this.mapply_upper_limit_options.isEmpty()) {
            sb.append(", apply_upper_limit_options=");
            sb.append(this.mapply_upper_limit_options);
        }
        if (this.mapproval_desc_link != null) {
            sb.append(", approval_desc_link=");
            sb.append(this.mapproval_desc_link);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatMemberSuppRoleApprovalSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatMemberSuppRoleApprovalSettingResponse(List<Long> list, List<Integer> list2, String str) {
        this(list, list2, str, ByteString.EMPTY);
    }

    public PullChatMemberSuppRoleApprovalSettingResponse(List<Long> list, List<Integer> list2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mapprover_ids = Internal.immutableCopyOf("mapprover_ids", list);
        this.mapply_upper_limit_options = Internal.immutableCopyOf("mapply_upper_limit_options", list2);
        this.mapproval_desc_link = str;
    }
}
