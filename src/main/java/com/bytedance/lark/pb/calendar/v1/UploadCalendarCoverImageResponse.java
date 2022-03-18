package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadCalendarCoverImageResponse extends Message<UploadCalendarCoverImageResponse, C16110a> {
    public static final ProtoAdapter<UploadCalendarCoverImageResponse> ADAPTER = new C16111b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UploadCalendarCoverImageResponse$b */
    private static final class C16111b extends ProtoAdapter<UploadCalendarCoverImageResponse> {
        C16111b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadCalendarCoverImageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadCalendarCoverImageResponse uploadCalendarCoverImageResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, uploadCalendarCoverImageResponse.key) + uploadCalendarCoverImageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadCalendarCoverImageResponse decode(ProtoReader protoReader) throws IOException {
            C16110a aVar = new C16110a();
            aVar.f42197a = "";
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
                    aVar.f42197a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadCalendarCoverImageResponse uploadCalendarCoverImageResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadCalendarCoverImageResponse.key);
            protoWriter.writeBytes(uploadCalendarCoverImageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UploadCalendarCoverImageResponse$a */
    public static final class C16110a extends Message.Builder<UploadCalendarCoverImageResponse, C16110a> {

        /* renamed from: a */
        public String f42197a;

        /* renamed from: a */
        public UploadCalendarCoverImageResponse build() {
            String str = this.f42197a;
            if (str != null) {
                return new UploadCalendarCoverImageResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C16110a newBuilder() {
        C16110a aVar = new C16110a();
        aVar.f42197a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UploadCalendarCoverImageResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "UploadCalendarCoverImageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadCalendarCoverImageResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public UploadCalendarCoverImageResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
