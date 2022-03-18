package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRemoteUserPrimaryCalendarRequest extends Message<GetRemoteUserPrimaryCalendarRequest, C15762a> {
    public static final ProtoAdapter<GetRemoteUserPrimaryCalendarRequest> ADAPTER = new C15763b();
    public static final MessageOptions MESSAGE_OPTIONS = new MessageOptions.C23078a().mo80177a(true).build();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRemoteUserPrimaryCalendarRequest$b */
    private static final class C15763b extends ProtoAdapter<GetRemoteUserPrimaryCalendarRequest> {
        C15763b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRemoteUserPrimaryCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRemoteUserPrimaryCalendarRequest getRemoteUserPrimaryCalendarRequest) {
            return getRemoteUserPrimaryCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRemoteUserPrimaryCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C15762a aVar = new C15762a();
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
        public void encode(ProtoWriter protoWriter, GetRemoteUserPrimaryCalendarRequest getRemoteUserPrimaryCalendarRequest) throws IOException {
            protoWriter.writeBytes(getRemoteUserPrimaryCalendarRequest.unknownFields());
        }
    }

    public GetRemoteUserPrimaryCalendarRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRemoteUserPrimaryCalendarRequest$a */
    public static final class C15762a extends Message.Builder<GetRemoteUserPrimaryCalendarRequest, C15762a> {
        /* renamed from: a */
        public GetRemoteUserPrimaryCalendarRequest build() {
            return new GetRemoteUserPrimaryCalendarRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15762a newBuilder() {
        C15762a aVar = new C15762a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetRemoteUserPrimaryCalendarRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetRemoteUserPrimaryCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRemoteUserPrimaryCalendarRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
