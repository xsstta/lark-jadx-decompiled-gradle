package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FaceToFaceApplicant extends Message<FaceToFaceApplicant, C17456a> {
    public static final ProtoAdapter<FaceToFaceApplicant> ADAPTER = new C17457b();
    public static final Long DEFAULT_RANK = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String name;
    public final Long rank;
    public final Long user_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.FaceToFaceApplicant$b */
    private static final class C17457b extends ProtoAdapter<FaceToFaceApplicant> {
        C17457b() {
            super(FieldEncoding.LENGTH_DELIMITED, FaceToFaceApplicant.class);
        }

        /* renamed from: a */
        public int encodedSize(FaceToFaceApplicant faceToFaceApplicant) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, faceToFaceApplicant.user_id);
            int i3 = 0;
            if (faceToFaceApplicant.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, faceToFaceApplicant.name);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (faceToFaceApplicant.avatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, faceToFaceApplicant.avatar_key);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (faceToFaceApplicant.rank != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, faceToFaceApplicant.rank);
            }
            return i5 + i3 + faceToFaceApplicant.unknownFields().size();
        }

        /* renamed from: a */
        public FaceToFaceApplicant decode(ProtoReader protoReader) throws IOException {
            C17456a aVar = new C17456a();
            aVar.f44347a = 0L;
            aVar.f44348b = "";
            aVar.f44349c = "";
            aVar.f44350d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44347a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44348b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44349c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44350d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FaceToFaceApplicant faceToFaceApplicant) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, faceToFaceApplicant.user_id);
            if (faceToFaceApplicant.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, faceToFaceApplicant.name);
            }
            if (faceToFaceApplicant.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, faceToFaceApplicant.avatar_key);
            }
            if (faceToFaceApplicant.rank != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, faceToFaceApplicant.rank);
            }
            protoWriter.writeBytes(faceToFaceApplicant.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17456a newBuilder() {
        C17456a aVar = new C17456a();
        aVar.f44347a = this.user_id;
        aVar.f44348b = this.name;
        aVar.f44349c = this.avatar_key;
        aVar.f44350d = this.rank;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.FaceToFaceApplicant$a */
    public static final class C17456a extends Message.Builder<FaceToFaceApplicant, C17456a> {

        /* renamed from: a */
        public Long f44347a;

        /* renamed from: b */
        public String f44348b;

        /* renamed from: c */
        public String f44349c;

        /* renamed from: d */
        public Long f44350d;

        /* renamed from: a */
        public FaceToFaceApplicant build() {
            Long l = this.f44347a;
            if (l != null) {
                return new FaceToFaceApplicant(l, this.f44348b, this.f44349c, this.f44350d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "user_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "FaceToFaceApplicant");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        StringBuilder replace = sb.replace(0, 2, "FaceToFaceApplicant{");
        replace.append('}');
        return replace.toString();
    }

    public FaceToFaceApplicant(Long l, String str, String str2, Long l2) {
        this(l, str, str2, l2, ByteString.EMPTY);
    }

    public FaceToFaceApplicant(Long l, String str, String str2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.name = str;
        this.avatar_key = str2;
        this.rank = l2;
    }
}
