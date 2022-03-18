package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TrySetUGEventStateRequest extends Message<TrySetUGEventStateRequest, C49766a> {
    public static final ProtoAdapter<TrySetUGEventStateRequest> ADAPTER = new C49767b();
    public static final Boolean DEFAULT_SHOULDOVERWRITE = false;
    private static final long serialVersionUID = 0;
    public final String mbizKey;
    public final String mnewStates;
    public final Boolean mshouldOverwrite;

    /* renamed from: com.ss.android.lark.pb.flow.TrySetUGEventStateRequest$b */
    private static final class C49767b extends ProtoAdapter<TrySetUGEventStateRequest> {
        C49767b() {
            super(FieldEncoding.LENGTH_DELIMITED, TrySetUGEventStateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TrySetUGEventStateRequest trySetUGEventStateRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, trySetUGEventStateRequest.mbizKey);
            int i2 = 0;
            if (trySetUGEventStateRequest.mnewStates != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, trySetUGEventStateRequest.mnewStates);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (trySetUGEventStateRequest.mshouldOverwrite != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, trySetUGEventStateRequest.mshouldOverwrite);
            }
            return i3 + i2 + trySetUGEventStateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TrySetUGEventStateRequest decode(ProtoReader protoReader) throws IOException {
            C49766a aVar = new C49766a();
            aVar.f124652a = "";
            aVar.f124653b = "";
            aVar.f124654c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124652a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124653b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124654c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TrySetUGEventStateRequest trySetUGEventStateRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, trySetUGEventStateRequest.mbizKey);
            if (trySetUGEventStateRequest.mnewStates != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trySetUGEventStateRequest.mnewStates);
            }
            if (trySetUGEventStateRequest.mshouldOverwrite != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, trySetUGEventStateRequest.mshouldOverwrite);
            }
            protoWriter.writeBytes(trySetUGEventStateRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49766a newBuilder() {
        C49766a aVar = new C49766a();
        aVar.f124652a = this.mbizKey;
        aVar.f124653b = this.mnewStates;
        aVar.f124654c = this.mshouldOverwrite;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.flow.TrySetUGEventStateRequest$a */
    public static final class C49766a extends Message.Builder<TrySetUGEventStateRequest, C49766a> {

        /* renamed from: a */
        public String f124652a;

        /* renamed from: b */
        public String f124653b;

        /* renamed from: c */
        public Boolean f124654c;

        /* renamed from: a */
        public TrySetUGEventStateRequest build() {
            String str = this.f124652a;
            if (str != null) {
                return new TrySetUGEventStateRequest(str, this.f124653b, this.f124654c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mbizKey");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", bizKey=");
        sb.append(this.mbizKey);
        if (this.mnewStates != null) {
            sb.append(", newStates=");
            sb.append(this.mnewStates);
        }
        if (this.mshouldOverwrite != null) {
            sb.append(", shouldOverwrite=");
            sb.append(this.mshouldOverwrite);
        }
        StringBuilder replace = sb.replace(0, 2, "TrySetUGEventStateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TrySetUGEventStateRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public TrySetUGEventStateRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbizKey = str;
        this.mnewStates = str2;
        this.mshouldOverwrite = bool;
    }
}
