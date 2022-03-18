package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RecordMeetingResponse extends Message<RecordMeetingResponse, C50960a> {
    public static final ProtoAdapter<RecordMeetingResponse> ADAPTER = new C50961b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RecordMeetingResponse$b */
    private static final class C50961b extends ProtoAdapter<RecordMeetingResponse> {
        C50961b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecordMeetingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RecordMeetingResponse recordMeetingResponse) {
            return recordMeetingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RecordMeetingResponse decode(ProtoReader protoReader) throws IOException {
            C50960a aVar = new C50960a();
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
        public void encode(ProtoWriter protoWriter, RecordMeetingResponse recordMeetingResponse) throws IOException {
            protoWriter.writeBytes(recordMeetingResponse.unknownFields());
        }
    }

    public RecordMeetingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RecordMeetingResponse$a */
    public static final class C50960a extends Message.Builder<RecordMeetingResponse, C50960a> {
        /* renamed from: a */
        public RecordMeetingResponse build() {
            return new RecordMeetingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50960a newBuilder() {
        C50960a aVar = new C50960a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RecordMeetingResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "RecordMeetingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RecordMeetingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
