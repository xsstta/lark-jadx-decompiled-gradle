package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SyncFollowActionResponse extends Message<SyncFollowActionResponse, C51106a> {
    public static final ProtoAdapter<SyncFollowActionResponse> ADAPTER = new C51107b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncFollowActionResponse$b */
    private static final class C51107b extends ProtoAdapter<SyncFollowActionResponse> {
        C51107b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncFollowActionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncFollowActionResponse syncFollowActionResponse) {
            return syncFollowActionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SyncFollowActionResponse decode(ProtoReader protoReader) throws IOException {
            C51106a aVar = new C51106a();
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
        public void encode(ProtoWriter protoWriter, SyncFollowActionResponse syncFollowActionResponse) throws IOException {
            protoWriter.writeBytes(syncFollowActionResponse.unknownFields());
        }
    }

    public SyncFollowActionResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncFollowActionResponse$a */
    public static final class C51106a extends Message.Builder<SyncFollowActionResponse, C51106a> {
        /* renamed from: a */
        public SyncFollowActionResponse build() {
            return new SyncFollowActionResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51106a newBuilder() {
        C51106a aVar = new C51106a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SyncFollowActionResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SyncFollowActionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SyncFollowActionResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
