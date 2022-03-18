package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPrimaryCalendarLoadingStatusRequest extends Message<GetPrimaryCalendarLoadingStatusRequest, C15754a> {
    public static final ProtoAdapter<GetPrimaryCalendarLoadingStatusRequest> ADAPTER = new C15755b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetPrimaryCalendarLoadingStatusRequest$b */
    private static final class C15755b extends ProtoAdapter<GetPrimaryCalendarLoadingStatusRequest> {
        C15755b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPrimaryCalendarLoadingStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPrimaryCalendarLoadingStatusRequest getPrimaryCalendarLoadingStatusRequest) {
            return getPrimaryCalendarLoadingStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPrimaryCalendarLoadingStatusRequest decode(ProtoReader protoReader) throws IOException {
            C15754a aVar = new C15754a();
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
        public void encode(ProtoWriter protoWriter, GetPrimaryCalendarLoadingStatusRequest getPrimaryCalendarLoadingStatusRequest) throws IOException {
            protoWriter.writeBytes(getPrimaryCalendarLoadingStatusRequest.unknownFields());
        }
    }

    public GetPrimaryCalendarLoadingStatusRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetPrimaryCalendarLoadingStatusRequest$a */
    public static final class C15754a extends Message.Builder<GetPrimaryCalendarLoadingStatusRequest, C15754a> {
        /* renamed from: a */
        public GetPrimaryCalendarLoadingStatusRequest build() {
            return new GetPrimaryCalendarLoadingStatusRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15754a newBuilder() {
        C15754a aVar = new C15754a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetPrimaryCalendarLoadingStatusRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetPrimaryCalendarLoadingStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPrimaryCalendarLoadingStatusRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
