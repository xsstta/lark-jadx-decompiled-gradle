package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetAppNotificationReadResponse extends Message<SetAppNotificationReadResponse, C18713a> {
    public static final ProtoAdapter<SetAppNotificationReadResponse> ADAPTER = new C18714b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SetAppNotificationReadResponse$b */
    private static final class C18714b extends ProtoAdapter<SetAppNotificationReadResponse> {
        C18714b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAppNotificationReadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAppNotificationReadResponse setAppNotificationReadResponse) {
            return setAppNotificationReadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetAppNotificationReadResponse decode(ProtoReader protoReader) throws IOException {
            C18713a aVar = new C18713a();
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
        public void encode(ProtoWriter protoWriter, SetAppNotificationReadResponse setAppNotificationReadResponse) throws IOException {
            protoWriter.writeBytes(setAppNotificationReadResponse.unknownFields());
        }
    }

    public SetAppNotificationReadResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SetAppNotificationReadResponse$a */
    public static final class C18713a extends Message.Builder<SetAppNotificationReadResponse, C18713a> {
        /* renamed from: a */
        public SetAppNotificationReadResponse build() {
            return new SetAppNotificationReadResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18713a newBuilder() {
        C18713a aVar = new C18713a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "SetAppNotificationReadResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetAppNotificationReadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetAppNotificationReadResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
