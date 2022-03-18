package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Signature extends Message<Signature, C16984a> {
    public static final ProtoAdapter<Signature> ADAPTER = new C16985b();
    public static final Boolean DEFAULT_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final Boolean enabled;
    public final List<DraftImage> images;
    public final String text;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Signature$b */
    private static final class C16985b extends ProtoAdapter<Signature> {
        C16985b() {
            super(FieldEncoding.LENGTH_DELIMITED, Signature.class);
        }

        /* renamed from: a */
        public int encodedSize(Signature signature) {
            int i;
            int i2 = 0;
            if (signature.enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, signature.enabled);
            } else {
                i = 0;
            }
            if (signature.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, signature.text);
            }
            return i + i2 + DraftImage.ADAPTER.asRepeated().encodedSizeWithTag(3, signature.images) + signature.unknownFields().size();
        }

        /* renamed from: a */
        public Signature decode(ProtoReader protoReader) throws IOException {
            C16984a aVar = new C16984a();
            aVar.f43589a = false;
            aVar.f43590b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43589a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43590b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43591c.add(DraftImage.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Signature signature) throws IOException {
            if (signature.enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, signature.enabled);
            }
            if (signature.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, signature.text);
            }
            DraftImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, signature.images);
            protoWriter.writeBytes(signature.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Signature$a */
    public static final class C16984a extends Message.Builder<Signature, C16984a> {

        /* renamed from: a */
        public Boolean f43589a;

        /* renamed from: b */
        public String f43590b;

        /* renamed from: c */
        public List<DraftImage> f43591c = Internal.newMutableList();

        /* renamed from: a */
        public Signature build() {
            return new Signature(this.f43589a, this.f43590b, this.f43591c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16984a newBuilder() {
        C16984a aVar = new C16984a();
        aVar.f43589a = this.enabled;
        aVar.f43590b = this.text;
        aVar.f43591c = Internal.copyOf("images", this.images);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Signature");
        StringBuilder sb = new StringBuilder();
        if (this.enabled != null) {
            sb.append(", enabled=");
            sb.append(this.enabled);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        StringBuilder replace = sb.replace(0, 2, "Signature{");
        replace.append('}');
        return replace.toString();
    }

    public Signature(Boolean bool, String str, List<DraftImage> list) {
        this(bool, str, list, ByteString.EMPTY);
    }

    public Signature(Boolean bool, String str, List<DraftImage> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enabled = bool;
        this.text = str;
        this.images = Internal.immutableCopyOf("images", list);
    }
}
