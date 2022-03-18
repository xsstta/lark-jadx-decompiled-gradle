package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest;
import java.io.IOException;
import okio.ByteString;

public final class StopByteviewHeartbeatRequest extends Message<StopByteviewHeartbeatRequest, C51096a> {
    public static final ProtoAdapter<StopByteviewHeartbeatRequest> ADAPTER = new C51097b();
    public static final Boolean DEFAULT_FORCE_STOP_ALL = false;
    public static final StartByteviewHeartbeatRequest.ServiceType DEFAULT_SERVICE_TYPE = StartByteviewHeartbeatRequest.ServiceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean force_stop_all;
    public final StartByteviewHeartbeatRequest.ServiceType service_type;
    public final String token;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatRequest$b */
    private static final class C51097b extends ProtoAdapter<StopByteviewHeartbeatRequest> {
        C51097b() {
            super(FieldEncoding.LENGTH_DELIMITED, StopByteviewHeartbeatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(StopByteviewHeartbeatRequest stopByteviewHeartbeatRequest) {
            int i;
            int i2 = 0;
            if (stopByteviewHeartbeatRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, stopByteviewHeartbeatRequest.token);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + StartByteviewHeartbeatRequest.ServiceType.ADAPTER.encodedSizeWithTag(2, stopByteviewHeartbeatRequest.service_type);
            if (stopByteviewHeartbeatRequest.force_stop_all != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, stopByteviewHeartbeatRequest.force_stop_all);
            }
            return encodedSizeWithTag + i2 + stopByteviewHeartbeatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public StopByteviewHeartbeatRequest decode(ProtoReader protoReader) throws IOException {
            C51096a aVar = new C51096a();
            aVar.f127217a = "";
            aVar.f127218b = StartByteviewHeartbeatRequest.ServiceType.UNKNOWN;
            aVar.f127219c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127217a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f127218b = StartByteviewHeartbeatRequest.ServiceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127219c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StopByteviewHeartbeatRequest stopByteviewHeartbeatRequest) throws IOException {
            if (stopByteviewHeartbeatRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, stopByteviewHeartbeatRequest.token);
            }
            StartByteviewHeartbeatRequest.ServiceType.ADAPTER.encodeWithTag(protoWriter, 2, stopByteviewHeartbeatRequest.service_type);
            if (stopByteviewHeartbeatRequest.force_stop_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, stopByteviewHeartbeatRequest.force_stop_all);
            }
            protoWriter.writeBytes(stopByteviewHeartbeatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51096a newBuilder() {
        C51096a aVar = new C51096a();
        aVar.f127217a = this.token;
        aVar.f127218b = this.service_type;
        aVar.f127219c = this.force_stop_all;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatRequest$a */
    public static final class C51096a extends Message.Builder<StopByteviewHeartbeatRequest, C51096a> {

        /* renamed from: a */
        public String f127217a;

        /* renamed from: b */
        public StartByteviewHeartbeatRequest.ServiceType f127218b;

        /* renamed from: c */
        public Boolean f127219c;

        /* renamed from: a */
        public StopByteviewHeartbeatRequest build() {
            StartByteviewHeartbeatRequest.ServiceType serviceType = this.f127218b;
            if (serviceType != null) {
                return new StopByteviewHeartbeatRequest(this.f127217a, serviceType, this.f127219c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(serviceType, "service_type");
        }

        /* renamed from: a */
        public C51096a mo176345a(StartByteviewHeartbeatRequest.ServiceType serviceType) {
            this.f127218b = serviceType;
            return this;
        }

        /* renamed from: a */
        public C51096a mo176346a(String str) {
            this.f127217a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StopByteviewHeartbeatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        sb.append(", service_type=");
        sb.append(this.service_type);
        if (this.force_stop_all != null) {
            sb.append(", force_stop_all=");
            sb.append(this.force_stop_all);
        }
        StringBuilder replace = sb.replace(0, 2, "StopByteviewHeartbeatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public StopByteviewHeartbeatRequest(String str, StartByteviewHeartbeatRequest.ServiceType serviceType, Boolean bool) {
        this(str, serviceType, bool, ByteString.EMPTY);
    }

    public StopByteviewHeartbeatRequest(String str, StartByteviewHeartbeatRequest.ServiceType serviceType, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.service_type = serviceType;
        this.force_stop_all = bool;
    }
}
