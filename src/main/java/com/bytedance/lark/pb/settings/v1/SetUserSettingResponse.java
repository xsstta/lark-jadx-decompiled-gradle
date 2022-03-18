package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetUserSettingResponse extends Message<SetUserSettingResponse, C19211a> {
    public static final ProtoAdapter<SetUserSettingResponse> ADAPTER = new C19212b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetUserSettingResponse$b */
    private static final class C19212b extends ProtoAdapter<SetUserSettingResponse> {
        C19212b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserSettingResponse setUserSettingResponse) {
            return setUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C19211a aVar = new C19211a();
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
        public void encode(ProtoWriter protoWriter, SetUserSettingResponse setUserSettingResponse) throws IOException {
            protoWriter.writeBytes(setUserSettingResponse.unknownFields());
        }
    }

    public SetUserSettingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetUserSettingResponse$a */
    public static final class C19211a extends Message.Builder<SetUserSettingResponse, C19211a> {
        /* renamed from: a */
        public SetUserSettingResponse build() {
            return new SetUserSettingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19211a newBuilder() {
        C19211a aVar = new C19211a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetUserSettingResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserSettingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
