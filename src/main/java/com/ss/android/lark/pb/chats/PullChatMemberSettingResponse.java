package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullChatMemberSettingResponse extends Message<PullChatMemberSettingResponse, C49594a> {
    public static final ProtoAdapter<PullChatMemberSettingResponse> ADAPTER = new C49595b();
    public static final Boolean DEFAULT_ALLOW_APPLY = false;
    public static final Integer DEFAULT_CHAT_MEMBER_UPPER_LIMIT = 0;
    public static final Integer DEFAULT_MEMBER_UPPER_LIMIT = 0;
    public static final Integer DEFAULT_THREAD_MEMBER_UPPER_LIMIT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean mallow_apply;
    public final Integer mchat_member_upper_limit;
    public final Integer mmember_upper_limit;
    public final List<Integer> mmember_upper_limit_options;
    public final Integer mthread_member_upper_limit;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatMemberSettingResponse$b */
    private static final class C49595b extends ProtoAdapter<PullChatMemberSettingResponse> {
        C49595b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatMemberSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatMemberSettingResponse pullChatMemberSettingResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, pullChatMemberSettingResponse.mallow_apply) + ProtoAdapter.INT32.encodedSizeWithTag(2, pullChatMemberSettingResponse.mmember_upper_limit) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(3, pullChatMemberSettingResponse.mmember_upper_limit_options);
            if (pullChatMemberSettingResponse.mchat_member_upper_limit != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, pullChatMemberSettingResponse.mchat_member_upper_limit);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.INT32.encodedSizeWithTag(5, pullChatMemberSettingResponse.mthread_member_upper_limit) + pullChatMemberSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatMemberSettingResponse decode(ProtoReader protoReader) throws IOException {
            C49594a aVar = new C49594a();
            aVar.f124215a = false;
            aVar.f124216b = 0;
            aVar.f124218d = 0;
            aVar.f124219e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124215a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124216b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124217c.add(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f124218d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124219e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatMemberSettingResponse pullChatMemberSettingResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullChatMemberSettingResponse.mallow_apply);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullChatMemberSettingResponse.mmember_upper_limit);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 3, pullChatMemberSettingResponse.mmember_upper_limit_options);
            if (pullChatMemberSettingResponse.mchat_member_upper_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, pullChatMemberSettingResponse.mchat_member_upper_limit);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, pullChatMemberSettingResponse.mthread_member_upper_limit);
            protoWriter.writeBytes(pullChatMemberSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatMemberSettingResponse$a */
    public static final class C49594a extends Message.Builder<PullChatMemberSettingResponse, C49594a> {

        /* renamed from: a */
        public Boolean f124215a;

        /* renamed from: b */
        public Integer f124216b;

        /* renamed from: c */
        public List<Integer> f124217c = Internal.newMutableList();

        /* renamed from: d */
        public Integer f124218d;

        /* renamed from: e */
        public Integer f124219e;

        /* renamed from: a */
        public PullChatMemberSettingResponse build() {
            Integer num;
            Integer num2;
            Boolean bool = this.f124215a;
            if (bool != null && (num = this.f124216b) != null && (num2 = this.f124219e) != null) {
                return new PullChatMemberSettingResponse(bool, num, this.f124217c, this.f124218d, num2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mallow_apply", this.f124216b, "mmember_upper_limit", this.f124219e, "mthread_member_upper_limit");
        }
    }

    @Override // com.squareup.wire.Message
    public C49594a newBuilder() {
        C49594a aVar = new C49594a();
        aVar.f124215a = this.mallow_apply;
        aVar.f124216b = this.mmember_upper_limit;
        aVar.f124217c = Internal.copyOf("mmember_upper_limit_options", this.mmember_upper_limit_options);
        aVar.f124218d = this.mchat_member_upper_limit;
        aVar.f124219e = this.mthread_member_upper_limit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", allow_apply=");
        sb.append(this.mallow_apply);
        sb.append(", member_upper_limit=");
        sb.append(this.mmember_upper_limit);
        if (!this.mmember_upper_limit_options.isEmpty()) {
            sb.append(", member_upper_limit_options=");
            sb.append(this.mmember_upper_limit_options);
        }
        if (this.mchat_member_upper_limit != null) {
            sb.append(", chat_member_upper_limit=");
            sb.append(this.mchat_member_upper_limit);
        }
        sb.append(", thread_member_upper_limit=");
        sb.append(this.mthread_member_upper_limit);
        StringBuilder replace = sb.replace(0, 2, "PullChatMemberSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatMemberSettingResponse(Boolean bool, Integer num, List<Integer> list, Integer num2, Integer num3) {
        this(bool, num, list, num2, num3, ByteString.EMPTY);
    }

    public PullChatMemberSettingResponse(Boolean bool, Integer num, List<Integer> list, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mallow_apply = bool;
        this.mmember_upper_limit = num;
        this.mmember_upper_limit_options = Internal.immutableCopyOf("mmember_upper_limit_options", list);
        this.mchat_member_upper_limit = num2;
        this.mthread_member_upper_limit = num3;
    }
}
