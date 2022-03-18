package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetThirdPartyCalendarSettingsRequest extends Message<GetThirdPartyCalendarSettingsRequest, C15788a> {
    public static final ProtoAdapter<GetThirdPartyCalendarSettingsRequest> ADAPTER = new C15789b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetThirdPartyCalendarSettingsRequest$b */
    private static final class C15789b extends ProtoAdapter<GetThirdPartyCalendarSettingsRequest> {
        C15789b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThirdPartyCalendarSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThirdPartyCalendarSettingsRequest getThirdPartyCalendarSettingsRequest) {
            return getThirdPartyCalendarSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetThirdPartyCalendarSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C15788a aVar = new C15788a();
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
        public void encode(ProtoWriter protoWriter, GetThirdPartyCalendarSettingsRequest getThirdPartyCalendarSettingsRequest) throws IOException {
            protoWriter.writeBytes(getThirdPartyCalendarSettingsRequest.unknownFields());
        }
    }

    public GetThirdPartyCalendarSettingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetThirdPartyCalendarSettingsRequest$a */
    public static final class C15788a extends Message.Builder<GetThirdPartyCalendarSettingsRequest, C15788a> {
        /* renamed from: a */
        public GetThirdPartyCalendarSettingsRequest build() {
            return new GetThirdPartyCalendarSettingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15788a newBuilder() {
        C15788a aVar = new C15788a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetThirdPartyCalendarSettingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetThirdPartyCalendarSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetThirdPartyCalendarSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
