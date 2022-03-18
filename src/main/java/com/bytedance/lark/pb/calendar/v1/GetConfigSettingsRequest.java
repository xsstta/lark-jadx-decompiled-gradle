package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetConfigSettingsRequest extends Message<GetConfigSettingsRequest, C15688a> {
    public static final ProtoAdapter<GetConfigSettingsRequest> ADAPTER = new C15689b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetConfigSettingsRequest$b */
    private static final class C15689b extends ProtoAdapter<GetConfigSettingsRequest> {
        C15689b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConfigSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetConfigSettingsRequest getConfigSettingsRequest) {
            return getConfigSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetConfigSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C15688a aVar = new C15688a();
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
        public void encode(ProtoWriter protoWriter, GetConfigSettingsRequest getConfigSettingsRequest) throws IOException {
            protoWriter.writeBytes(getConfigSettingsRequest.unknownFields());
        }
    }

    public GetConfigSettingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetConfigSettingsRequest$a */
    public static final class C15688a extends Message.Builder<GetConfigSettingsRequest, C15688a> {
        /* renamed from: a */
        public GetConfigSettingsRequest build() {
            return new GetConfigSettingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15688a newBuilder() {
        C15688a aVar = new C15688a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetConfigSettingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetConfigSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetConfigSettingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
