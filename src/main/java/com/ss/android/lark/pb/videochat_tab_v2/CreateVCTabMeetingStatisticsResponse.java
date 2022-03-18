package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateVCTabMeetingStatisticsResponse extends Message<CreateVCTabMeetingStatisticsResponse, C50441a> {
    public static final ProtoAdapter<CreateVCTabMeetingStatisticsResponse> ADAPTER = new C50442b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.CreateVCTabMeetingStatisticsResponse$b */
    private static final class C50442b extends ProtoAdapter<CreateVCTabMeetingStatisticsResponse> {
        C50442b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateVCTabMeetingStatisticsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateVCTabMeetingStatisticsResponse createVCTabMeetingStatisticsResponse) {
            return createVCTabMeetingStatisticsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateVCTabMeetingStatisticsResponse decode(ProtoReader protoReader) throws IOException {
            C50441a aVar = new C50441a();
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
        public void encode(ProtoWriter protoWriter, CreateVCTabMeetingStatisticsResponse createVCTabMeetingStatisticsResponse) throws IOException {
            protoWriter.writeBytes(createVCTabMeetingStatisticsResponse.unknownFields());
        }
    }

    public CreateVCTabMeetingStatisticsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.CreateVCTabMeetingStatisticsResponse$a */
    public static final class C50441a extends Message.Builder<CreateVCTabMeetingStatisticsResponse, C50441a> {
        /* renamed from: a */
        public CreateVCTabMeetingStatisticsResponse build() {
            return new CreateVCTabMeetingStatisticsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50441a newBuilder() {
        C50441a aVar = new C50441a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "CreateVCTabMeetingStatisticsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateVCTabMeetingStatisticsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
