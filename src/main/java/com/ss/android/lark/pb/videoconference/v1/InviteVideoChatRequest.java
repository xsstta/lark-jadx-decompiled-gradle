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

public final class InviteVideoChatRequest extends Message<InviteVideoChatRequest, C50807a> {
    public static final ProtoAdapter<InviteVideoChatRequest> ADAPTER = new C50808b();
    private static final long serialVersionUID = 0;
    public final String id;
    public final List<String> participant_ids;
    public final List<PSTNInfo> pstn_info;
    public final List<String> room_ids;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InviteVideoChatRequest$b */
    private static final class C50808b extends ProtoAdapter<InviteVideoChatRequest> {
        C50808b() {
            super(FieldEncoding.LENGTH_DELIMITED, InviteVideoChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(InviteVideoChatRequest inviteVideoChatRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, inviteVideoChatRequest.participant_ids) + ProtoAdapter.STRING.encodedSizeWithTag(2, inviteVideoChatRequest.id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, inviteVideoChatRequest.room_ids) + PSTNInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, inviteVideoChatRequest.pstn_info) + inviteVideoChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public InviteVideoChatRequest decode(ProtoReader protoReader) throws IOException {
            C50807a aVar = new C50807a();
            aVar.f126666b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126665a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126666b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126667c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126668d.add(PSTNInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InviteVideoChatRequest inviteVideoChatRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, inviteVideoChatRequest.participant_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, inviteVideoChatRequest.id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, inviteVideoChatRequest.room_ids);
            PSTNInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, inviteVideoChatRequest.pstn_info);
            protoWriter.writeBytes(inviteVideoChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InviteVideoChatRequest$a */
    public static final class C50807a extends Message.Builder<InviteVideoChatRequest, C50807a> {

        /* renamed from: a */
        public List<String> f126665a = Internal.newMutableList();

        /* renamed from: b */
        public String f126666b;

        /* renamed from: c */
        public List<String> f126667c = Internal.newMutableList();

        /* renamed from: d */
        public List<PSTNInfo> f126668d = Internal.newMutableList();

        /* renamed from: a */
        public InviteVideoChatRequest build() {
            String str = this.f126666b;
            if (str != null) {
                return new InviteVideoChatRequest(this.f126665a, str, this.f126667c, this.f126668d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        /* renamed from: a */
        public C50807a mo175631a(String str) {
            this.f126666b = str;
            return this;
        }

        /* renamed from: a */
        public C50807a mo175632a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126665a = list;
            return this;
        }

        /* renamed from: b */
        public C50807a mo175634b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126667c = list;
            return this;
        }

        /* renamed from: c */
        public C50807a mo175635c(List<PSTNInfo> list) {
            Internal.checkElementsNotNull(list);
            this.f126668d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50807a newBuilder() {
        C50807a aVar = new C50807a();
        aVar.f126665a = Internal.copyOf("participant_ids", this.participant_ids);
        aVar.f126666b = this.id;
        aVar.f126667c = Internal.copyOf("room_ids", this.room_ids);
        aVar.f126668d = Internal.copyOf("pstn_info", this.pstn_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InviteVideoChatRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.participant_ids.isEmpty()) {
            sb.append(", participant_ids=");
            sb.append(this.participant_ids);
        }
        sb.append(", id=");
        sb.append(this.id);
        if (!this.room_ids.isEmpty()) {
            sb.append(", room_ids=");
            sb.append(this.room_ids);
        }
        if (!this.pstn_info.isEmpty()) {
            sb.append(", pstn_info=");
            sb.append(this.pstn_info);
        }
        StringBuilder replace = sb.replace(0, 2, "InviteVideoChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public InviteVideoChatRequest(List<String> list, String str, List<String> list2, List<PSTNInfo> list3) {
        this(list, str, list2, list3, ByteString.EMPTY);
    }

    public InviteVideoChatRequest(List<String> list, String str, List<String> list2, List<PSTNInfo> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participant_ids = Internal.immutableCopyOf("participant_ids", list);
        this.id = str;
        this.room_ids = Internal.immutableCopyOf("room_ids", list2);
        this.pstn_info = Internal.immutableCopyOf("pstn_info", list3);
    }
}
