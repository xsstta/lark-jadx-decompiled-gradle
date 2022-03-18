package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class StartByteviewHeartbeatResponse extends Message<StartByteviewHeartbeatResponse, C51090a> {
    public static final ProtoAdapter<StartByteviewHeartbeatResponse> ADAPTER = new C51091b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatResponse$b */
    private static final class C51091b extends ProtoAdapter<StartByteviewHeartbeatResponse> {
        C51091b() {
            super(FieldEncoding.LENGTH_DELIMITED, StartByteviewHeartbeatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(StartByteviewHeartbeatResponse startByteviewHeartbeatResponse) {
            return startByteviewHeartbeatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public StartByteviewHeartbeatResponse decode(ProtoReader protoReader) throws IOException {
            C51090a aVar = new C51090a();
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
        public void encode(ProtoWriter protoWriter, StartByteviewHeartbeatResponse startByteviewHeartbeatResponse) throws IOException {
            protoWriter.writeBytes(startByteviewHeartbeatResponse.unknownFields());
        }
    }

    public StartByteviewHeartbeatResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatResponse$a */
    public static final class C51090a extends Message.Builder<StartByteviewHeartbeatResponse, C51090a> {
        /* renamed from: a */
        public StartByteviewHeartbeatResponse build() {
            return new StartByteviewHeartbeatResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51090a newBuilder() {
        C51090a aVar = new C51090a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StartByteviewHeartbeatResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "StartByteviewHeartbeatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public StartByteviewHeartbeatResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
