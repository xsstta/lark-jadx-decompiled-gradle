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

public final class PullParticipantInfoResponse extends Message<PullParticipantInfoResponse, C50922a> {
    public static final ProtoAdapter<PullParticipantInfoResponse> ADAPTER = new C50923b();
    private static final long serialVersionUID = 0;
    public final List<ByteViewUserInfo> user_infos;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullParticipantInfoResponse$b */
    private static final class C50923b extends ProtoAdapter<PullParticipantInfoResponse> {
        C50923b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullParticipantInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullParticipantInfoResponse pullParticipantInfoResponse) {
            return ByteViewUserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, pullParticipantInfoResponse.user_infos) + pullParticipantInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullParticipantInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50922a aVar = new C50922a();
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
                    aVar.f126918a.add(ByteViewUserInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullParticipantInfoResponse pullParticipantInfoResponse) throws IOException {
            ByteViewUserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullParticipantInfoResponse.user_infos);
            protoWriter.writeBytes(pullParticipantInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullParticipantInfoResponse$a */
    public static final class C50922a extends Message.Builder<PullParticipantInfoResponse, C50922a> {

        /* renamed from: a */
        public List<ByteViewUserInfo> f126918a = Internal.newMutableList();

        /* renamed from: a */
        public PullParticipantInfoResponse build() {
            return new PullParticipantInfoResponse(this.f126918a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50922a newBuilder() {
        C50922a aVar = new C50922a();
        aVar.f126918a = Internal.copyOf("user_infos", this.user_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullParticipantInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.user_infos.isEmpty()) {
            sb.append(", user_infos=");
            sb.append(this.user_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "PullParticipantInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullParticipantInfoResponse(List<ByteViewUserInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public PullParticipantInfoResponse(List<ByteViewUserInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_infos = Internal.immutableCopyOf("user_infos", list);
    }
}
