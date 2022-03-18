package com.ss.android.lark.pb.users;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchUserMemoRequest extends Message<PatchUserMemoRequest, C50264a> {
    public static final ProtoAdapter<PatchUserMemoRequest> ADAPTER = new C50265b();
    private static final long serialVersionUID = 0;
    public final String malias;
    public final String mmemo_picture_key;
    public final String mmemo_text;
    public final String mtarget_user_id;

    /* renamed from: com.ss.android.lark.pb.users.PatchUserMemoRequest$b */
    private static final class C50265b extends ProtoAdapter<PatchUserMemoRequest> {
        C50265b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchUserMemoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchUserMemoRequest patchUserMemoRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (patchUserMemoRequest.mtarget_user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, patchUserMemoRequest.mtarget_user_id);
            } else {
                i = 0;
            }
            if (patchUserMemoRequest.malias != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, patchUserMemoRequest.malias);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (patchUserMemoRequest.mmemo_text != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, patchUserMemoRequest.mmemo_text);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (patchUserMemoRequest.mmemo_picture_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, patchUserMemoRequest.mmemo_picture_key);
            }
            return i6 + i4 + patchUserMemoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchUserMemoRequest decode(ProtoReader protoReader) throws IOException {
            C50264a aVar = new C50264a();
            aVar.f125613a = "";
            aVar.f125614b = "";
            aVar.f125615c = "";
            aVar.f125616d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125613a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125614b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125615c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125616d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchUserMemoRequest patchUserMemoRequest) throws IOException {
            if (patchUserMemoRequest.mtarget_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, patchUserMemoRequest.mtarget_user_id);
            }
            if (patchUserMemoRequest.malias != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, patchUserMemoRequest.malias);
            }
            if (patchUserMemoRequest.mmemo_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, patchUserMemoRequest.mmemo_text);
            }
            if (patchUserMemoRequest.mmemo_picture_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, patchUserMemoRequest.mmemo_picture_key);
            }
            protoWriter.writeBytes(patchUserMemoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.users.PatchUserMemoRequest$a */
    public static final class C50264a extends Message.Builder<PatchUserMemoRequest, C50264a> {

        /* renamed from: a */
        public String f125613a;

        /* renamed from: b */
        public String f125614b;

        /* renamed from: c */
        public String f125615c;

        /* renamed from: d */
        public String f125616d;

        /* renamed from: a */
        public PatchUserMemoRequest build() {
            return new PatchUserMemoRequest(this.f125613a, this.f125614b, this.f125615c, this.f125616d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50264a mo174398a(String str) {
            this.f125613a = str;
            return this;
        }

        /* renamed from: b */
        public C50264a mo174400b(String str) {
            this.f125614b = str;
            return this;
        }

        /* renamed from: c */
        public C50264a mo174401c(String str) {
            this.f125615c = str;
            return this;
        }

        /* renamed from: d */
        public C50264a mo174402d(String str) {
            this.f125616d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50264a newBuilder() {
        C50264a aVar = new C50264a();
        aVar.f125613a = this.mtarget_user_id;
        aVar.f125614b = this.malias;
        aVar.f125615c = this.mmemo_text;
        aVar.f125616d = this.mmemo_picture_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtarget_user_id != null) {
            sb.append(", target_user_id=");
            sb.append(this.mtarget_user_id);
        }
        if (this.malias != null) {
            sb.append(", alias=");
            sb.append(this.malias);
        }
        if (this.mmemo_text != null) {
            sb.append(", memo_text=");
            sb.append(this.mmemo_text);
        }
        if (this.mmemo_picture_key != null) {
            sb.append(", memo_picture_key=");
            sb.append(this.mmemo_picture_key);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchUserMemoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchUserMemoRequest(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public PatchUserMemoRequest(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtarget_user_id = str;
        this.malias = str2;
        this.mmemo_text = str3;
        this.mmemo_picture_key = str4;
    }
}
