package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class StopByteviewHeartbeatResponse extends Message<StopByteviewHeartbeatResponse, C51098a> {
    public static final ProtoAdapter<StopByteviewHeartbeatResponse> ADAPTER = new C51099b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatResponse$b */
    private static final class C51099b extends ProtoAdapter<StopByteviewHeartbeatResponse> {
        C51099b() {
            super(FieldEncoding.LENGTH_DELIMITED, StopByteviewHeartbeatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(StopByteviewHeartbeatResponse stopByteviewHeartbeatResponse) {
            return stopByteviewHeartbeatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public StopByteviewHeartbeatResponse decode(ProtoReader protoReader) throws IOException {
            C51098a aVar = new C51098a();
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
        public void encode(ProtoWriter protoWriter, StopByteviewHeartbeatResponse stopByteviewHeartbeatResponse) throws IOException {
            protoWriter.writeBytes(stopByteviewHeartbeatResponse.unknownFields());
        }
    }

    public StopByteviewHeartbeatResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatResponse$a */
    public static final class C51098a extends Message.Builder<StopByteviewHeartbeatResponse, C51098a> {
        /* renamed from: a */
        public StopByteviewHeartbeatResponse build() {
            return new StopByteviewHeartbeatResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51098a newBuilder() {
        C51098a aVar = new C51098a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "StopByteviewHeartbeatResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "StopByteviewHeartbeatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public StopByteviewHeartbeatResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
