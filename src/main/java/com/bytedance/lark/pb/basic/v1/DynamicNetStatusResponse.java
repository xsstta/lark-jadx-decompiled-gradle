package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DynamicNetStatusResponse extends Message<DynamicNetStatusResponse, C14896a> {
    public static final ProtoAdapter<DynamicNetStatusResponse> ADAPTER = new C14897b();
    public static final NetStatus DEFAULT_NET_STATUS = NetStatus.EXCELLENT;
    private static final long serialVersionUID = 0;
    public final NetStatus net_status;

    public enum NetStatus implements WireEnum {
        EXCELLENT(1),
        EVALUATING(2),
        WEAK(3),
        NET_UNAVAILABLE(4),
        SERVICE_UNAVAILABLE(5),
        OFFLINE(6);
        
        public static final ProtoAdapter<NetStatus> ADAPTER = ProtoAdapter.newEnumAdapter(NetStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static NetStatus fromValue(int i) {
            switch (i) {
                case 1:
                    return EXCELLENT;
                case 2:
                    return EVALUATING;
                case 3:
                    return WEAK;
                case 4:
                    return NET_UNAVAILABLE;
                case 5:
                    return SERVICE_UNAVAILABLE;
                case 6:
                    return OFFLINE;
                default:
                    return null;
            }
        }

        private NetStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DynamicNetStatusResponse$b */
    private static final class C14897b extends ProtoAdapter<DynamicNetStatusResponse> {
        C14897b() {
            super(FieldEncoding.LENGTH_DELIMITED, DynamicNetStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DynamicNetStatusResponse dynamicNetStatusResponse) {
            return NetStatus.ADAPTER.encodedSizeWithTag(1, dynamicNetStatusResponse.net_status) + dynamicNetStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DynamicNetStatusResponse decode(ProtoReader protoReader) throws IOException {
            C14896a aVar = new C14896a();
            aVar.f39415a = NetStatus.EXCELLENT;
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
                        aVar.f39415a = NetStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DynamicNetStatusResponse dynamicNetStatusResponse) throws IOException {
            NetStatus.ADAPTER.encodeWithTag(protoWriter, 1, dynamicNetStatusResponse.net_status);
            protoWriter.writeBytes(dynamicNetStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DynamicNetStatusResponse$a */
    public static final class C14896a extends Message.Builder<DynamicNetStatusResponse, C14896a> {

        /* renamed from: a */
        public NetStatus f39415a;

        /* renamed from: a */
        public DynamicNetStatusResponse build() {
            NetStatus netStatus = this.f39415a;
            if (netStatus != null) {
                return new DynamicNetStatusResponse(netStatus, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(netStatus, "net_status");
        }
    }

    @Override // com.squareup.wire.Message
    public C14896a newBuilder() {
        C14896a aVar = new C14896a();
        aVar.f39415a = this.net_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DynamicNetStatusResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", net_status=");
        sb.append(this.net_status);
        StringBuilder replace = sb.replace(0, 2, "DynamicNetStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DynamicNetStatusResponse(NetStatus netStatus) {
        this(netStatus, ByteString.EMPTY);
    }

    public DynamicNetStatusResponse(NetStatus netStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.net_status = netStatus;
    }
}
