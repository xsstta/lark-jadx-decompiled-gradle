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

public final class InviteVideoChatResponse extends Message<InviteVideoChatResponse, C50809a> {
    public static final ProtoAdapter<InviteVideoChatResponse> ADAPTER = new C50810b();
    private static final long serialVersionUID = 0;
    public final List<String> busy_user_ids;
    public final List<String> pstn_ids;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InviteVideoChatResponse$b */
    private static final class C50810b extends ProtoAdapter<InviteVideoChatResponse> {
        C50810b() {
            super(FieldEncoding.LENGTH_DELIMITED, InviteVideoChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(InviteVideoChatResponse inviteVideoChatResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, inviteVideoChatResponse.busy_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, inviteVideoChatResponse.pstn_ids) + inviteVideoChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public InviteVideoChatResponse decode(ProtoReader protoReader) throws IOException {
            C50809a aVar = new C50809a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126669a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126670b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InviteVideoChatResponse inviteVideoChatResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, inviteVideoChatResponse.busy_user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, inviteVideoChatResponse.pstn_ids);
            protoWriter.writeBytes(inviteVideoChatResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InviteVideoChatResponse$a */
    public static final class C50809a extends Message.Builder<InviteVideoChatResponse, C50809a> {

        /* renamed from: a */
        public List<String> f126669a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f126670b = Internal.newMutableList();

        /* renamed from: a */
        public InviteVideoChatResponse build() {
            return new InviteVideoChatResponse(this.f126669a, this.f126670b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50809a newBuilder() {
        C50809a aVar = new C50809a();
        aVar.f126669a = Internal.copyOf("busy_user_ids", this.busy_user_ids);
        aVar.f126670b = Internal.copyOf("pstn_ids", this.pstn_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InviteVideoChatResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.busy_user_ids.isEmpty()) {
            sb.append(", busy_user_ids=");
            sb.append(this.busy_user_ids);
        }
        if (!this.pstn_ids.isEmpty()) {
            sb.append(", pstn_ids=");
            sb.append(this.pstn_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "InviteVideoChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public InviteVideoChatResponse(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public InviteVideoChatResponse(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.busy_user_ids = Internal.immutableCopyOf("busy_user_ids", list);
        this.pstn_ids = Internal.immutableCopyOf("pstn_ids", list2);
    }
}
