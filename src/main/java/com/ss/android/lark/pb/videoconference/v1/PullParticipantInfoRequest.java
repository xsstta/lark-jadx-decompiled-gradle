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

public final class PullParticipantInfoRequest extends Message<PullParticipantInfoRequest, C50920a> {
    public static final ProtoAdapter<PullParticipantInfoRequest> ADAPTER = new C50921b();
    private static final long serialVersionUID = 0;
    public final List<ByteviewUser> byteview_users;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullParticipantInfoRequest$b */
    private static final class C50921b extends ProtoAdapter<PullParticipantInfoRequest> {
        C50921b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullParticipantInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullParticipantInfoRequest pullParticipantInfoRequest) {
            return ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(1, pullParticipantInfoRequest.byteview_users) + ProtoAdapter.STRING.encodedSizeWithTag(2, pullParticipantInfoRequest.meeting_id) + pullParticipantInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullParticipantInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50920a aVar = new C50920a();
            aVar.f126917b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126916a.add(ByteviewUser.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126917b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullParticipantInfoRequest pullParticipantInfoRequest) throws IOException {
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullParticipantInfoRequest.byteview_users);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullParticipantInfoRequest.meeting_id);
            protoWriter.writeBytes(pullParticipantInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullParticipantInfoRequest$a */
    public static final class C50920a extends Message.Builder<PullParticipantInfoRequest, C50920a> {

        /* renamed from: a */
        public List<ByteviewUser> f126916a = Internal.newMutableList();

        /* renamed from: b */
        public String f126917b;

        /* renamed from: a */
        public PullParticipantInfoRequest build() {
            String str = this.f126917b;
            if (str != null) {
                return new PullParticipantInfoRequest(this.f126916a, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }

        /* renamed from: a */
        public C50920a mo175907a(String str) {
            this.f126917b = str;
            return this;
        }

        /* renamed from: a */
        public C50920a mo175908a(List<ByteviewUser> list) {
            Internal.checkElementsNotNull(list);
            this.f126916a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50920a newBuilder() {
        C50920a aVar = new C50920a();
        aVar.f126916a = Internal.copyOf("byteview_users", this.byteview_users);
        aVar.f126917b = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullParticipantInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.byteview_users.isEmpty()) {
            sb.append(", byteview_users=");
            sb.append(this.byteview_users);
        }
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        StringBuilder replace = sb.replace(0, 2, "PullParticipantInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullParticipantInfoRequest(List<ByteviewUser> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public PullParticipantInfoRequest(List<ByteviewUser> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.byteview_users = Internal.immutableCopyOf("byteview_users", list);
        this.meeting_id = str;
    }
}
