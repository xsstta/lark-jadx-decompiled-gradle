package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class KeepMeetingRequest extends Message<KeepMeetingRequest, C50364a> {
    public static final ProtoAdapter<KeepMeetingRequest> ADAPTER = new C50365b();
    private static final long serialVersionUID = 0;
    public final String mmeeting_id;

    /* renamed from: com.ss.android.lark.pb.videochat.KeepMeetingRequest$b */
    private static final class C50365b extends ProtoAdapter<KeepMeetingRequest> {
        C50365b() {
            super(FieldEncoding.LENGTH_DELIMITED, KeepMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(KeepMeetingRequest keepMeetingRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, keepMeetingRequest.mmeeting_id) + keepMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public KeepMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C50364a aVar = new C50364a();
            aVar.f125756a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125756a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, KeepMeetingRequest keepMeetingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, keepMeetingRequest.mmeeting_id);
            protoWriter.writeBytes(keepMeetingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.KeepMeetingRequest$a */
    public static final class C50364a extends Message.Builder<KeepMeetingRequest, C50364a> {

        /* renamed from: a */
        public String f125756a;

        /* renamed from: a */
        public KeepMeetingRequest build() {
            String str = this.f125756a;
            if (str != null) {
                return new KeepMeetingRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmeeting_id");
        }

        /* renamed from: a */
        public C50364a mo174619a(String str) {
            this.f125756a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50364a newBuilder() {
        C50364a aVar = new C50364a();
        aVar.f125756a = this.mmeeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.mmeeting_id);
        StringBuilder replace = sb.replace(0, 2, "KeepMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public KeepMeetingRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public KeepMeetingRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmeeting_id = str;
    }
}
