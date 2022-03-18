package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ApplyByteviewAccessibilityResponse extends Message<ApplyByteviewAccessibilityResponse, C50463a> {
    public static final ProtoAdapter<ApplyByteviewAccessibilityResponse> ADAPTER = new C50464b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyByteviewAccessibilityResponse$b */
    private static final class C50464b extends ProtoAdapter<ApplyByteviewAccessibilityResponse> {
        C50464b() {
            super(FieldEncoding.LENGTH_DELIMITED, ApplyByteviewAccessibilityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ApplyByteviewAccessibilityResponse applyByteviewAccessibilityResponse) {
            return applyByteviewAccessibilityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ApplyByteviewAccessibilityResponse decode(ProtoReader protoReader) throws IOException {
            C50463a aVar = new C50463a();
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
        public void encode(ProtoWriter protoWriter, ApplyByteviewAccessibilityResponse applyByteviewAccessibilityResponse) throws IOException {
            protoWriter.writeBytes(applyByteviewAccessibilityResponse.unknownFields());
        }
    }

    public ApplyByteviewAccessibilityResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyByteviewAccessibilityResponse$a */
    public static final class C50463a extends Message.Builder<ApplyByteviewAccessibilityResponse, C50463a> {
        /* renamed from: a */
        public ApplyByteviewAccessibilityResponse build() {
            return new ApplyByteviewAccessibilityResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50463a newBuilder() {
        C50463a aVar = new C50463a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ApplyByteviewAccessibilityResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ApplyByteviewAccessibilityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ApplyByteviewAccessibilityResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
