package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest;
import java.io.IOException;
import okio.ByteString;

public final class ByteviewHeartbeatStop extends Message<ByteviewHeartbeatStop, C50489a> {
    public static final ProtoAdapter<ByteviewHeartbeatStop> ADAPTER = new C50490b();
    public static final Reason DEFAULT_REASON = Reason.UNKOWN;
    public static final StartByteviewHeartbeatRequest.ServiceType DEFAULT_SERVICE_TYPE = StartByteviewHeartbeatRequest.ServiceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Reason reason;
    public final StartByteviewHeartbeatRequest.ServiceType service_type;
    public final String token;

    public enum Reason implements WireEnum {
        UNKOWN(0),
        DISCONNECT(1),
        INVALID(2);
        
        public static final ProtoAdapter<Reason> ADAPTER = ProtoAdapter.newEnumAdapter(Reason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Reason fromValue(int i) {
            if (i == 0) {
                return UNKOWN;
            }
            if (i == 1) {
                return DISCONNECT;
            }
            if (i != 2) {
                return null;
            }
            return INVALID;
        }

        private Reason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteviewHeartbeatStop$b */
    private static final class C50490b extends ProtoAdapter<ByteviewHeartbeatStop> {
        C50490b() {
            super(FieldEncoding.LENGTH_DELIMITED, ByteviewHeartbeatStop.class);
        }

        /* renamed from: a */
        public int encodedSize(ByteviewHeartbeatStop byteviewHeartbeatStop) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, byteviewHeartbeatStop.token) + StartByteviewHeartbeatRequest.ServiceType.ADAPTER.encodedSizeWithTag(2, byteviewHeartbeatStop.service_type);
            if (byteviewHeartbeatStop.reason != null) {
                i = Reason.ADAPTER.encodedSizeWithTag(3, byteviewHeartbeatStop.reason);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + byteviewHeartbeatStop.unknownFields().size();
        }

        /* renamed from: a */
        public ByteviewHeartbeatStop decode(ProtoReader protoReader) throws IOException {
            C50489a aVar = new C50489a();
            aVar.f126045a = "";
            aVar.f126046b = StartByteviewHeartbeatRequest.ServiceType.UNKNOWN;
            aVar.f126047c = Reason.UNKOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126045a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126046b = StartByteviewHeartbeatRequest.ServiceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126047c = Reason.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ByteviewHeartbeatStop byteviewHeartbeatStop) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, byteviewHeartbeatStop.token);
            StartByteviewHeartbeatRequest.ServiceType.ADAPTER.encodeWithTag(protoWriter, 2, byteviewHeartbeatStop.service_type);
            if (byteviewHeartbeatStop.reason != null) {
                Reason.ADAPTER.encodeWithTag(protoWriter, 3, byteviewHeartbeatStop.reason);
            }
            protoWriter.writeBytes(byteviewHeartbeatStop.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50489a newBuilder() {
        C50489a aVar = new C50489a();
        aVar.f126045a = this.token;
        aVar.f126046b = this.service_type;
        aVar.f126047c = this.reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteviewHeartbeatStop$a */
    public static final class C50489a extends Message.Builder<ByteviewHeartbeatStop, C50489a> {

        /* renamed from: a */
        public String f126045a;

        /* renamed from: b */
        public StartByteviewHeartbeatRequest.ServiceType f126046b;

        /* renamed from: c */
        public Reason f126047c;

        /* renamed from: a */
        public ByteviewHeartbeatStop build() {
            StartByteviewHeartbeatRequest.ServiceType serviceType;
            String str = this.f126045a;
            if (str != null && (serviceType = this.f126046b) != null) {
                return new ByteviewHeartbeatStop(str, serviceType, this.f126047c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "token", this.f126046b, "service_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ByteviewHeartbeatStop");
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", service_type=");
        sb.append(this.service_type);
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        StringBuilder replace = sb.replace(0, 2, "ByteviewHeartbeatStop{");
        replace.append('}');
        return replace.toString();
    }

    public ByteviewHeartbeatStop(String str, StartByteviewHeartbeatRequest.ServiceType serviceType, Reason reason2) {
        this(str, serviceType, reason2, ByteString.EMPTY);
    }

    public ByteviewHeartbeatStop(String str, StartByteviewHeartbeatRequest.ServiceType serviceType, Reason reason2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.service_type = serviceType;
        this.reason = reason2;
    }
}
