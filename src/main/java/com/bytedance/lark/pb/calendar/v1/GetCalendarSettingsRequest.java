package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarSettingsRequest extends Message<GetCalendarSettingsRequest, C15668a> {
    public static final ProtoAdapter<GetCalendarSettingsRequest> ADAPTER = new C15669b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarSettingsRequest$b */
    private static final class C15669b extends ProtoAdapter<GetCalendarSettingsRequest> {
        C15669b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarSettingsRequest getCalendarSettingsRequest) {
            return getCalendarSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C15668a aVar = new C15668a();
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
        public void encode(ProtoWriter protoWriter, GetCalendarSettingsRequest getCalendarSettingsRequest) throws IOException {
            protoWriter.writeBytes(getCalendarSettingsRequest.unknownFields());
        }
    }

    public GetCalendarSettingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarSettingsRequest$a */
    public static final class C15668a extends Message.Builder<GetCalendarSettingsRequest, C15668a> {
        /* renamed from: a */
        public GetCalendarSettingsRequest build() {
            return new GetCalendarSettingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15668a newBuilder() {
        C15668a aVar = new C15668a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarSettingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetCalendarSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
