package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarVCSettingsRequest extends Message<GetCalendarVCSettingsRequest, C50631a> {
    public static final ProtoAdapter<GetCalendarVCSettingsRequest> ADAPTER = new C50632b();
    private static final long serialVersionUID = 0;
    public final String meeting_number;
    public final String unique_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarVCSettingsRequest$b */
    private static final class C50632b extends ProtoAdapter<GetCalendarVCSettingsRequest> {
        C50632b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarVCSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarVCSettingsRequest getCalendarVCSettingsRequest) {
            int i;
            int i2 = 0;
            if (getCalendarVCSettingsRequest.unique_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarVCSettingsRequest.unique_id);
            } else {
                i = 0;
            }
            if (getCalendarVCSettingsRequest.meeting_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getCalendarVCSettingsRequest.meeting_number);
            }
            return i + i2 + getCalendarVCSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarVCSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C50631a aVar = new C50631a();
            aVar.f126370a = "";
            aVar.f126371b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126370a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126371b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarVCSettingsRequest getCalendarVCSettingsRequest) throws IOException {
            if (getCalendarVCSettingsRequest.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarVCSettingsRequest.unique_id);
            }
            if (getCalendarVCSettingsRequest.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCalendarVCSettingsRequest.meeting_number);
            }
            protoWriter.writeBytes(getCalendarVCSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarVCSettingsRequest$a */
    public static final class C50631a extends Message.Builder<GetCalendarVCSettingsRequest, C50631a> {

        /* renamed from: a */
        public String f126370a;

        /* renamed from: b */
        public String f126371b;

        /* renamed from: a */
        public GetCalendarVCSettingsRequest build() {
            return new GetCalendarVCSettingsRequest(this.f126370a, this.f126371b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50631a newBuilder() {
        C50631a aVar = new C50631a();
        aVar.f126370a = this.unique_id;
        aVar.f126371b = this.meeting_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarVCSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarVCSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarVCSettingsRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetCalendarVCSettingsRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unique_id = str;
        this.meeting_number = str2;
    }
}
