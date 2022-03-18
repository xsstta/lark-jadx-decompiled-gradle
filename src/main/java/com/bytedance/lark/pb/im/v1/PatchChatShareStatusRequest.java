package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChatShareInfo;
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

public final class PatchChatShareStatusRequest extends Message<PatchChatShareStatusRequest, C17819a> {
    public static final ProtoAdapter<PatchChatShareStatusRequest> ADAPTER = new C17820b();
    public static final ChatShareInfo.ShareStatus DEFAULT_STATUS = ChatShareInfo.ShareStatus.UNKNOWN_STATE;
    private static final long serialVersionUID = 0;
    public final ChatShareInfo.ShareStatus status;
    public final List<String> tokens;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatShareStatusRequest$b */
    private static final class C17820b extends ProtoAdapter<PatchChatShareStatusRequest> {
        C17820b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchChatShareStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchChatShareStatusRequest patchChatShareStatusRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, patchChatShareStatusRequest.tokens) + ChatShareInfo.ShareStatus.ADAPTER.encodedSizeWithTag(2, patchChatShareStatusRequest.status) + patchChatShareStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchChatShareStatusRequest decode(ProtoReader protoReader) throws IOException {
            C17819a aVar = new C17819a();
            aVar.f44878b = ChatShareInfo.ShareStatus.UNKNOWN_STATE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44877a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44878b = ChatShareInfo.ShareStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchChatShareStatusRequest patchChatShareStatusRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, patchChatShareStatusRequest.tokens);
            ChatShareInfo.ShareStatus.ADAPTER.encodeWithTag(protoWriter, 2, patchChatShareStatusRequest.status);
            protoWriter.writeBytes(patchChatShareStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatShareStatusRequest$a */
    public static final class C17819a extends Message.Builder<PatchChatShareStatusRequest, C17819a> {

        /* renamed from: a */
        public List<String> f44877a = Internal.newMutableList();

        /* renamed from: b */
        public ChatShareInfo.ShareStatus f44878b;

        /* renamed from: a */
        public PatchChatShareStatusRequest build() {
            ChatShareInfo.ShareStatus shareStatus = this.f44878b;
            if (shareStatus != null) {
                return new PatchChatShareStatusRequest(this.f44877a, shareStatus, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(shareStatus, UpdateKey.STATUS);
        }

        /* renamed from: a */
        public C17819a mo62118a(ChatShareInfo.ShareStatus shareStatus) {
            this.f44878b = shareStatus;
            return this;
        }

        /* renamed from: a */
        public C17819a mo62119a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44877a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17819a newBuilder() {
        C17819a aVar = new C17819a();
        aVar.f44877a = Internal.copyOf("tokens", this.tokens);
        aVar.f44878b = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchChatShareStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.tokens.isEmpty()) {
            sb.append(", tokens=");
            sb.append(this.tokens);
        }
        sb.append(", status=");
        sb.append(this.status);
        StringBuilder replace = sb.replace(0, 2, "PatchChatShareStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchChatShareStatusRequest(List<String> list, ChatShareInfo.ShareStatus shareStatus) {
        this(list, shareStatus, ByteString.EMPTY);
    }

    public PatchChatShareStatusRequest(List<String> list, ChatShareInfo.ShareStatus shareStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tokens = Internal.immutableCopyOf("tokens", list);
        this.status = shareStatus;
    }
}
