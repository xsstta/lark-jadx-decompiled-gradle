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

public final class UploadCalendarCoverImageRequest extends Message<UploadCalendarCoverImageRequest, C16108a> {
    public static final ProtoAdapter<UploadCalendarCoverImageRequest> ADAPTER = new C16109b();
    public static final ByteString DEFAULT_IMAGE = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString image;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UploadCalendarCoverImageRequest$b */
    private static final class C16109b extends ProtoAdapter<UploadCalendarCoverImageRequest> {
        C16109b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadCalendarCoverImageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadCalendarCoverImageRequest uploadCalendarCoverImageRequest) {
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, uploadCalendarCoverImageRequest.image) + uploadCalendarCoverImageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadCalendarCoverImageRequest decode(ProtoReader protoReader) throws IOException {
            C16108a aVar = new C16108a();
            aVar.f42196a = ByteString.EMPTY;
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
                    aVar.f42196a = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadCalendarCoverImageRequest uploadCalendarCoverImageRequest) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, uploadCalendarCoverImageRequest.image);
            protoWriter.writeBytes(uploadCalendarCoverImageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UploadCalendarCoverImageRequest$a */
    public static final class C16108a extends Message.Builder<UploadCalendarCoverImageRequest, C16108a> {

        /* renamed from: a */
        public ByteString f42196a;

        /* renamed from: a */
        public UploadCalendarCoverImageRequest build() {
            ByteString byteString = this.f42196a;
            if (byteString != null) {
                return new UploadCalendarCoverImageRequest(byteString, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "image");
        }

        /* renamed from: a */
        public C16108a mo57866a(ByteString byteString) {
            this.f42196a = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16108a newBuilder() {
        C16108a aVar = new C16108a();
        aVar.f42196a = this.image;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UploadCalendarCoverImageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", image=");
        sb.append(this.image);
        StringBuilder replace = sb.replace(0, 2, "UploadCalendarCoverImageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadCalendarCoverImageRequest(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public UploadCalendarCoverImageRequest(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.image = byteString;
    }
}
