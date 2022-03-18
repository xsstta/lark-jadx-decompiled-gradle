package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TrySetUGEventStateResponse extends Message<TrySetUGEventStateResponse, C49768a> {
    public static final ProtoAdapter<TrySetUGEventStateResponse> ADAPTER = new C49769b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final String moriginalStates;
    public final Boolean msuccess;

    /* renamed from: com.ss.android.lark.pb.flow.TrySetUGEventStateResponse$b */
    private static final class C49769b extends ProtoAdapter<TrySetUGEventStateResponse> {
        C49769b() {
            super(FieldEncoding.LENGTH_DELIMITED, TrySetUGEventStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TrySetUGEventStateResponse trySetUGEventStateResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, trySetUGEventStateResponse.msuccess);
            if (trySetUGEventStateResponse.moriginalStates != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, trySetUGEventStateResponse.moriginalStates);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + trySetUGEventStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TrySetUGEventStateResponse decode(ProtoReader protoReader) throws IOException {
            C49768a aVar = new C49768a();
            aVar.f124655a = false;
            aVar.f124656b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124655a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124656b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TrySetUGEventStateResponse trySetUGEventStateResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, trySetUGEventStateResponse.msuccess);
            if (trySetUGEventStateResponse.moriginalStates != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trySetUGEventStateResponse.moriginalStates);
            }
            protoWriter.writeBytes(trySetUGEventStateResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.TrySetUGEventStateResponse$a */
    public static final class C49768a extends Message.Builder<TrySetUGEventStateResponse, C49768a> {

        /* renamed from: a */
        public Boolean f124655a;

        /* renamed from: b */
        public String f124656b;

        /* renamed from: a */
        public TrySetUGEventStateResponse build() {
            Boolean bool = this.f124655a;
            if (bool != null) {
                return new TrySetUGEventStateResponse(bool, this.f124656b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "msuccess");
        }
    }

    @Override // com.squareup.wire.Message
    public C49768a newBuilder() {
        C49768a aVar = new C49768a();
        aVar.f124655a = this.msuccess;
        aVar.f124656b = this.moriginalStates;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.msuccess);
        if (this.moriginalStates != null) {
            sb.append(", originalStates=");
            sb.append(this.moriginalStates);
        }
        StringBuilder replace = sb.replace(0, 2, "TrySetUGEventStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TrySetUGEventStateResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public TrySetUGEventStateResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msuccess = bool;
        this.moriginalStates = str;
    }
}
