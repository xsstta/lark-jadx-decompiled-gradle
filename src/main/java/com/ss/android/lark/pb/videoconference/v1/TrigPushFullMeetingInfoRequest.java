package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TrigPushFullMeetingInfoRequest extends Message<TrigPushFullMeetingInfoRequest, C51118a> {
    public static final ProtoAdapter<TrigPushFullMeetingInfoRequest> ADAPTER = new C51119b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TrigPushFullMeetingInfoRequest$b */
    private static final class C51119b extends ProtoAdapter<TrigPushFullMeetingInfoRequest> {
        C51119b() {
            super(FieldEncoding.LENGTH_DELIMITED, TrigPushFullMeetingInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TrigPushFullMeetingInfoRequest trigPushFullMeetingInfoRequest) {
            return trigPushFullMeetingInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TrigPushFullMeetingInfoRequest decode(ProtoReader protoReader) throws IOException {
            C51118a aVar = new C51118a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TrigPushFullMeetingInfoRequest trigPushFullMeetingInfoRequest) throws IOException {
            protoWriter.writeBytes(trigPushFullMeetingInfoRequest.unknownFields());
        }
    }

    public TrigPushFullMeetingInfoRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TrigPushFullMeetingInfoRequest$a */
    public static final class C51118a extends Message.Builder<TrigPushFullMeetingInfoRequest, C51118a> {
        /* renamed from: a */
        public TrigPushFullMeetingInfoRequest build() {
            return new TrigPushFullMeetingInfoRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51118a newBuilder() {
        C51118a aVar = new C51118a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "TrigPushFullMeetingInfoRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "TrigPushFullMeetingInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TrigPushFullMeetingInfoRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
