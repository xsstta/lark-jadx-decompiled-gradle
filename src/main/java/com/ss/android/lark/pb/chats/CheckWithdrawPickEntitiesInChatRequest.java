package com.ss.android.lark.pb.chats;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CheckWithdrawPickEntitiesInChatRequest extends Message<CheckWithdrawPickEntitiesInChatRequest, C49578a> {
    public static final ProtoAdapter<CheckWithdrawPickEntitiesInChatRequest> ADAPTER = new C49579b();
    public static final FieldOptions FIELD_OPTIONS_MCHAT_ID = new FieldOptions.C23155a().mo80350a("split,type=channel").build();
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final List<PickEntities> mpick_entities;

    /* renamed from: com.ss.android.lark.pb.chats.CheckWithdrawPickEntitiesInChatRequest$b */
    private static final class C49579b extends ProtoAdapter<CheckWithdrawPickEntitiesInChatRequest> {
        C49579b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckWithdrawPickEntitiesInChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckWithdrawPickEntitiesInChatRequest checkWithdrawPickEntitiesInChatRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, checkWithdrawPickEntitiesInChatRequest.mchat_id) + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(2, checkWithdrawPickEntitiesInChatRequest.mpick_entities) + checkWithdrawPickEntitiesInChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckWithdrawPickEntitiesInChatRequest decode(ProtoReader protoReader) throws IOException {
            C49578a aVar = new C49578a();
            aVar.f124193a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124193a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124194b.add(PickEntities.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckWithdrawPickEntitiesInChatRequest checkWithdrawPickEntitiesInChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkWithdrawPickEntitiesInChatRequest.mchat_id);
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, checkWithdrawPickEntitiesInChatRequest.mpick_entities);
            protoWriter.writeBytes(checkWithdrawPickEntitiesInChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.CheckWithdrawPickEntitiesInChatRequest$a */
    public static final class C49578a extends Message.Builder<CheckWithdrawPickEntitiesInChatRequest, C49578a> {

        /* renamed from: a */
        public String f124193a;

        /* renamed from: b */
        public List<PickEntities> f124194b = Internal.newMutableList();

        /* renamed from: a */
        public CheckWithdrawPickEntitiesInChatRequest build() {
            String str = this.f124193a;
            if (str != null) {
                return new CheckWithdrawPickEntitiesInChatRequest(str, this.f124194b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mchat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C49578a newBuilder() {
        C49578a aVar = new C49578a();
        aVar.f124193a = this.mchat_id;
        aVar.f124194b = Internal.copyOf("mpick_entities", this.mpick_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.mchat_id);
        if (!this.mpick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.mpick_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckWithdrawPickEntitiesInChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckWithdrawPickEntitiesInChatRequest(String str, List<PickEntities> list) {
        this(str, list, ByteString.EMPTY);
    }

    public CheckWithdrawPickEntitiesInChatRequest(String str, List<PickEntities> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.mpick_entities = Internal.immutableCopyOf("mpick_entities", list);
    }
}
