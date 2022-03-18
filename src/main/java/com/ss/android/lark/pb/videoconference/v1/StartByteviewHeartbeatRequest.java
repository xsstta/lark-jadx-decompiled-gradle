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

public final class StartByteviewHeartbeatRequest extends Message<StartByteviewHeartbeatRequest, C51088a> {
    public static final ProtoAdapter<StartByteviewHeartbeatRequest> ADAPTER = new C51089b();
    public static final Integer DEFAULT_CYCLE = 0;
    public static final Integer DEFAULT_EXPIRED_TIME = 0;
    public static final ServiceType DEFAULT_SERVICE_TYPE = ServiceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer cycle;
    public final Integer expired_time;
    public final ServiceType service_type;
    public final String token;

    public enum ServiceType implements WireEnum {
        UNKNOWN(0),
        VOIP(1),
        VC(2),
        VCLOBBY(3),
        SHAREBOX(4);
        
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
                return VOIP;
            }
            if (i == 2) {
                return VC;
            }
            if (i == 3) {
                return VCLOBBY;
            }
            if (i != 4) {
                return null;
            }
            return SHAREBOX;
        }

        private ServiceType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest$b */
    private static final class C51089b extends ProtoAdapter<StartByteviewHeartbeatRequest> {
        C51089b() {
            super(FieldEncoding.LENGTH_DELIMITED, StartByteviewHeartbeatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(StartByteviewHeartbeatRequest startByteviewHeartbeatRequest) {
            int i;
            if (startByteviewHeartbeatRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, startByteviewHeartbeatRequest.token);
            } else {
                i = 0;
            }
            return i + ServiceType.ADAPTER.encodedSizeWithTag(2, startByteviewHeartbeatRequest.service_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, startByteviewHeartbeatRequest.cycle) + ProtoAdapter.INT32.encodedSizeWithTag(4, startByteviewHeartbeatRequest.expired_time) + startByteviewHeartbeatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public StartByteviewHeartbeatRequest decode(ProtoReader protoReader) throws IOException {
            C51088a aVar = new C51088a();
            aVar.f127210a = "";
            aVar.f127211b = ServiceType.UNKNOWN;
            aVar.f127212c = 0;
            aVar.f127213d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127210a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f127211b = ServiceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f127212c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127213d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StartByteviewHeartbeatRequest startByteviewHeartbeatRequest) throws IOException {
            if (startByteviewHeartbeatRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, startByteviewHeartbeatRequest.token);
            }
            ServiceType.ADAPTER.encodeWithTag(protoWriter, 2, startByteviewHeartbeatRequest.service_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, startByteviewHeartbeatRequest.cycle);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, startByteviewHeartbeatRequest.expired_time);
            protoWriter.writeBytes(startByteviewHeartbeatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51088a newBuilder() {
        C51088a aVar = new C51088a();
        aVar.f127210a = this.token;
        aVar.f127211b = this.service_type;
        aVar.f127212c = this.cycle;
        aVar.f127213d = this.expired_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest$a */
    public static final class C51088a extends Message.Builder<StartByteviewHeartbeatRequest, C51088a> {

        /* renamed from: a */
        public String f127210a;

        /* renamed from: b */
        public ServiceType f127211b;

        /* renamed from: c */
        public Integer f127212c;

        /* renamed from: d */
        public Integer f127213d;

        /* renamed from: a */
        public StartByteviewHeartbeatRequest build() {
            Integer num;
            Integer num2;
            ServiceType serviceType = this.f127211b;
            if (serviceType != null && (num = this.f127212c) != null && (num2 = this.f127213d) != null) {
                return new StartByteviewHeartbeatRequest(this.f127210a, serviceType, num, num2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(serviceType, "service_type", this.f127212c, "cycle", this.f127213d, "expired_time");
        }

        /* renamed from: a */
        public C51088a mo176322a(ServiceType serviceType) {
            this.f127211b = serviceType;
            return this;
        }

        /* renamed from: b */
        public C51088a mo176326b(Integer num) {
            this.f127213d = num;
            return this;
        }

        /* renamed from: a */
        public C51088a mo176323a(Integer num) {
            this.f127212c = num;
            return this;
        }

        /* renamed from: a */
        public C51088a mo176324a(String str) {
            this.f127210a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StartByteviewHeartbeatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        sb.append(", service_type=");
        sb.append(this.service_type);
        sb.append(", cycle=");
        sb.append(this.cycle);
        sb.append(", expired_time=");
        sb.append(this.expired_time);
        StringBuilder replace = sb.replace(0, 2, "StartByteviewHeartbeatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public StartByteviewHeartbeatRequest(String str, ServiceType serviceType, Integer num, Integer num2) {
        this(str, serviceType, num, num2, ByteString.EMPTY);
    }

    public StartByteviewHeartbeatRequest(String str, ServiceType serviceType, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.service_type = serviceType;
        this.cycle = num;
        this.expired_time = num2;
    }
}
