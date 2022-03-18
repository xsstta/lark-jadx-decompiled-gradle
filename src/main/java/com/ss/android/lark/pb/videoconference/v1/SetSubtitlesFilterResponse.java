package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetSubtitlesFilterResponse extends Message<SetSubtitlesFilterResponse, C51022a> {
    public static final ProtoAdapter<SetSubtitlesFilterResponse> ADAPTER = new C51023b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetSubtitlesFilterResponse$b */
    private static final class C51023b extends ProtoAdapter<SetSubtitlesFilterResponse> {
        C51023b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSubtitlesFilterResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSubtitlesFilterResponse setSubtitlesFilterResponse) {
            return setSubtitlesFilterResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetSubtitlesFilterResponse decode(ProtoReader protoReader) throws IOException {
            C51022a aVar = new C51022a();
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
        public void encode(ProtoWriter protoWriter, SetSubtitlesFilterResponse setSubtitlesFilterResponse) throws IOException {
            protoWriter.writeBytes(setSubtitlesFilterResponse.unknownFields());
        }
    }

    public SetSubtitlesFilterResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetSubtitlesFilterResponse$a */
    public static final class C51022a extends Message.Builder<SetSubtitlesFilterResponse, C51022a> {
        /* renamed from: a */
        public SetSubtitlesFilterResponse build() {
            return new SetSubtitlesFilterResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51022a newBuilder() {
        C51022a aVar = new C51022a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SetSubtitlesFilterResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetSubtitlesFilterResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetSubtitlesFilterResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
