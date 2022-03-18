package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AdjustMeetingDurationRequest extends Message<AdjustMeetingDurationRequest, C50457a> {
    public static final ProtoAdapter<AdjustMeetingDurationRequest> ADAPTER = new C50458b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationRequest$b */
    private static final class C50458b extends ProtoAdapter<AdjustMeetingDurationRequest> {
        C50458b() {
            super(FieldEncoding.LENGTH_DELIMITED, AdjustMeetingDurationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AdjustMeetingDurationRequest adjustMeetingDurationRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, adjustMeetingDurationRequest.meeting_id) + adjustMeetingDurationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AdjustMeetingDurationRequest decode(ProtoReader protoReader) throws IOException {
            C50457a aVar = new C50457a();
            aVar.f125995a = "";
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
                    aVar.f125995a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AdjustMeetingDurationRequest adjustMeetingDurationRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, adjustMeetingDurationRequest.meeting_id);
            protoWriter.writeBytes(adjustMeetingDurationRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationRequest$a */
    public static final class C50457a extends Message.Builder<AdjustMeetingDurationRequest, C50457a> {

        /* renamed from: a */
        public String f125995a;

        /* renamed from: a */
        public AdjustMeetingDurationRequest build() {
            String str = this.f125995a;
            if (str != null) {
                return new AdjustMeetingDurationRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50457a newBuilder() {
        C50457a aVar = new C50457a();
        aVar.f125995a = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "AdjustMeetingDurationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        StringBuilder replace = sb.replace(0, 2, "AdjustMeetingDurationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AdjustMeetingDurationRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public AdjustMeetingDurationRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
    }
}
