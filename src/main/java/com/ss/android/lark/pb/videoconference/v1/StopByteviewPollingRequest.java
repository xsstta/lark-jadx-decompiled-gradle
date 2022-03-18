package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewPollingRequest;
import java.io.IOException;
import okio.ByteString;

public final class StopByteviewPollingRequest extends Message<StopByteviewPollingRequest, C51100a> {
    public static final ProtoAdapter<StopByteviewPollingRequest> ADAPTER = new C51101b();
    public static final StartByteviewPollingRequest.ServiceType DEFAULT_SERVICE_TYPE = StartByteviewPollingRequest.ServiceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final StartByteviewPollingRequest.ServiceType service_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopByteviewPollingRequest$b */
    private static final class C51101b extends ProtoAdapter<StopByteviewPollingRequest> {
        C51101b() {
            super(FieldEncoding.LENGTH_DELIMITED, StopByteviewPollingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(StopByteviewPollingRequest stopByteviewPollingRequest) {
            int i;
            int encodedSizeWithTag = StartByteviewPollingRequest.ServiceType.ADAPTER.encodedSizeWithTag(1, stopByteviewPollingRequest.service_type);
            if (stopByteviewPollingRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, stopByteviewPollingRequest.meeting_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + stopByteviewPollingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public StopByteviewPollingRequest decode(ProtoReader protoReader) throws IOException {
            C51100a aVar = new C51100a();
            aVar.f127220a = StartByteviewPollingRequest.ServiceType.UNKNOWN;
            aVar.f127221b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127220a = StartByteviewPollingRequest.ServiceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127221b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StopByteviewPollingRequest stopByteviewPollingRequest) throws IOException {
            StartByteviewPollingRequest.ServiceType.ADAPTER.encodeWithTag(protoWriter, 1, stopByteviewPollingRequest.service_type);
            if (stopByteviewPollingRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, stopByteviewPollingRequest.meeting_id);
            }
            protoWriter.writeBytes(stopByteviewPollingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopByteviewPollingRequest$a */
    public static final class C51100a extends Message.Builder<StopByteviewPollingRequest, C51100a> {

        /* renamed from: a */
        public StartByteviewPollingRequest.ServiceType f127220a;

        /* renamed from: b */
        public String f127221b;

        /* renamed from: a */
        public StopByteviewPollingRequest build() {
            StartByteviewPollingRequest.ServiceType serviceType = this.f127220a;
            if (serviceType != null) {
                return new StopByteviewPollingRequest(serviceType, this.f127221b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(serviceType, "service_type");
        }

        /* renamed from: a */
        public C51100a mo176355a(StartByteviewPollingRequest.ServiceType serviceType) {
            this.f127220a = serviceType;
            return this;
        }

        /* renamed from: a */
        public C51100a mo176356a(String str) {
            this.f127221b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51100a newBuilder() {
        C51100a aVar = new C51100a();
        aVar.f127220a = this.service_type;
        aVar.f127221b = this.meeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StopByteviewPollingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", service_type=");
        sb.append(this.service_type);
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        StringBuilder replace = sb.replace(0, 2, "StopByteviewPollingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public StopByteviewPollingRequest(StartByteviewPollingRequest.ServiceType serviceType, String str) {
        this(serviceType, str, ByteString.EMPTY);
    }

    public StopByteviewPollingRequest(StartByteviewPollingRequest.ServiceType serviceType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.service_type = serviceType;
        this.meeting_id = str;
    }
}
