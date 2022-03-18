package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullChatMemberSettingRequest extends Message<PullChatMemberSettingRequest, C49592a> {
    public static final ProtoAdapter<PullChatMemberSettingRequest> ADAPTER = new C49593b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_TENANT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mchat_id;
    public final Long mtenant_id;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatMemberSettingRequest$b */
    private static final class C49593b extends ProtoAdapter<PullChatMemberSettingRequest> {
        C49593b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatMemberSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatMemberSettingRequest pullChatMemberSettingRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, pullChatMemberSettingRequest.mtenant_id);
            if (pullChatMemberSettingRequest.mchat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, pullChatMemberSettingRequest.mchat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pullChatMemberSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatMemberSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49592a aVar = new C49592a();
            aVar.f124213a = 0L;
            aVar.f124214b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124213a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124214b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatMemberSettingRequest pullChatMemberSettingRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pullChatMemberSettingRequest.mtenant_id);
            if (pullChatMemberSettingRequest.mchat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pullChatMemberSettingRequest.mchat_id);
            }
            protoWriter.writeBytes(pullChatMemberSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatMemberSettingRequest$a */
    public static final class C49592a extends Message.Builder<PullChatMemberSettingRequest, C49592a> {

        /* renamed from: a */
        public Long f124213a;

        /* renamed from: b */
        public Long f124214b;

        /* renamed from: a */
        public PullChatMemberSettingRequest build() {
            Long l = this.f124213a;
            if (l != null) {
                return new PullChatMemberSettingRequest(l, this.f124214b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "mtenant_id");
        }

        /* renamed from: a */
        public C49592a mo172908a(Long l) {
            this.f124213a = l;
            return this;
        }

        /* renamed from: b */
        public C49592a mo172910b(Long l) {
            this.f124214b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49592a newBuilder() {
        C49592a aVar = new C49592a();
        aVar.f124213a = this.mtenant_id;
        aVar.f124214b = this.mchat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", tenant_id=");
        sb.append(this.mtenant_id);
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatMemberSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatMemberSettingRequest(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public PullChatMemberSettingRequest(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtenant_id = l;
        this.mchat_id = l2;
    }
}
