package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetWebSocketStatusResponse extends Message<GetWebSocketStatusResponse, C14993a> {
    public static final ProtoAdapter<GetWebSocketStatusResponse> ADAPTER = new C14994b();
    public static final Status DEFAULT_STATUS = Status.OPENING;
    private static final long serialVersionUID = 0;
    public final Status status;

    public enum Status implements WireEnum {
        OPENING(1),
        SUCCESS(2),
        CLOSE(3),
        CLOSED_FOR_LONG_TIME(4);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return OPENING;
            }
            if (i == 2) {
                return SUCCESS;
            }
            if (i == 3) {
                return CLOSE;
            }
            if (i != 4) {
                return null;
            }
            return CLOSED_FOR_LONG_TIME;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse$b */
    private static final class C14994b extends ProtoAdapter<GetWebSocketStatusResponse> {
        C14994b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWebSocketStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWebSocketStatusResponse getWebSocketStatusResponse) {
            return Status.ADAPTER.encodedSizeWithTag(1, getWebSocketStatusResponse.status) + getWebSocketStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetWebSocketStatusResponse decode(ProtoReader protoReader) throws IOException {
            C14993a aVar = new C14993a();
            aVar.f39659a = Status.OPENING;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39659a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetWebSocketStatusResponse getWebSocketStatusResponse) throws IOException {
            Status.ADAPTER.encodeWithTag(protoWriter, 1, getWebSocketStatusResponse.status);
            protoWriter.writeBytes(getWebSocketStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetWebSocketStatusResponse$a */
    public static final class C14993a extends Message.Builder<GetWebSocketStatusResponse, C14993a> {

        /* renamed from: a */
        public Status f39659a;

        /* renamed from: a */
        public GetWebSocketStatusResponse build() {
            Status status = this.f39659a;
            if (status != null) {
                return new GetWebSocketStatusResponse(status, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(status, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public C14993a newBuilder() {
        C14993a aVar = new C14993a();
        aVar.f39659a = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetWebSocketStatusResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        StringBuilder replace = sb.replace(0, 2, "GetWebSocketStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetWebSocketStatusResponse(Status status2) {
        this(status2, ByteString.EMPTY);
    }

    public GetWebSocketStatusResponse(Status status2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
    }
}
