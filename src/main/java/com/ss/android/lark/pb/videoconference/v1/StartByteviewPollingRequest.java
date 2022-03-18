package com.ss.android.lark.pb.videoconference.v1;

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

public final class StartByteviewPollingRequest extends Message<StartByteviewPollingRequest, C51092a> {
    public static final ProtoAdapter<StartByteviewPollingRequest> ADAPTER = new C51093b();
    public static final ServiceType DEFAULT_SERVICE_TYPE = ServiceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final ServiceType service_type;

    public enum ServiceType implements WireEnum {
        UNKNOWN(0),
        CALLING(1),
        RINGING(2);
        
        public static final ProtoAdapter<ServiceType> ADAPTER = ProtoAdapter.newEnumAdapter(ServiceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ServiceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CALLING;
            }
            if (i != 2) {
                return null;
            }
            return RINGING;
        }

        private ServiceType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartByteviewPollingRequest$b */
    private static final class C51093b extends ProtoAdapter<StartByteviewPollingRequest> {
        C51093b() {
            super(FieldEncoding.LENGTH_DELIMITED, StartByteviewPollingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(StartByteviewPollingRequest startByteviewPollingRequest) {
            return ServiceType.ADAPTER.encodedSizeWithTag(1, startByteviewPollingRequest.service_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, startByteviewPollingRequest.meeting_id) + startByteviewPollingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public StartByteviewPollingRequest decode(ProtoReader protoReader) throws IOException {
            C51092a aVar = new C51092a();
            aVar.f127214a = ServiceType.UNKNOWN;
            aVar.f127215b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127214a = ServiceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127215b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StartByteviewPollingRequest startByteviewPollingRequest) throws IOException {
            ServiceType.ADAPTER.encodeWithTag(protoWriter, 1, startByteviewPollingRequest.service_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, startByteviewPollingRequest.meeting_id);
            protoWriter.writeBytes(startByteviewPollingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51092a newBuilder() {
        C51092a aVar = new C51092a();
        aVar.f127214a = this.service_type;
        aVar.f127215b = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartByteviewPollingRequest$a */
    public static final class C51092a extends Message.Builder<StartByteviewPollingRequest, C51092a> {

        /* renamed from: a */
        public ServiceType f127214a;

        /* renamed from: b */
        public String f127215b;

        /* renamed from: a */
        public StartByteviewPollingRequest build() {
            String str;
            ServiceType serviceType = this.f127214a;
            if (serviceType != null && (str = this.f127215b) != null) {
                return new StartByteviewPollingRequest(serviceType, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(serviceType, "service_type", this.f127215b, "meeting_id");
        }

        /* renamed from: a */
        public C51092a mo176334a(ServiceType serviceType) {
            this.f127214a = serviceType;
            return this;
        }

        /* renamed from: a */
        public C51092a mo176335a(String str) {
            this.f127215b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StartByteviewPollingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", service_type=");
        sb.append(this.service_type);
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        StringBuilder replace = sb.replace(0, 2, "StartByteviewPollingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public StartByteviewPollingRequest(ServiceType serviceType, String str) {
        this(serviceType, str, ByteString.EMPTY);
    }

    public StartByteviewPollingRequest(ServiceType serviceType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.service_type = serviceType;
        this.meeting_id = str;
    }
}
