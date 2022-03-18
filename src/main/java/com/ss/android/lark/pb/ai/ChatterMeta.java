package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Image;
import com.ss.android.lark.pb.entities.ImageSet;
import java.io.IOException;
import okio.ByteString;

public final class ChatterMeta extends Message<ChatterMeta, C49439a> {
    public static final ProtoAdapter<ChatterMeta> ADAPTER = new C49440b();
    private static final long serialVersionUID = 0;
    public final Image mavatar;
    public final String mchatter_id;
    public final String memail;
    public final String mname;
    public final ImageSet muser_avatar;

    /* renamed from: com.ss.android.lark.pb.ai.ChatterMeta$b */
    private static final class C49440b extends ProtoAdapter<ChatterMeta> {
        C49440b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterMeta chatterMeta) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterMeta.mchatter_id);
            int i4 = 0;
            if (chatterMeta.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterMeta.mname);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (chatterMeta.mavatar != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(3, chatterMeta.mavatar);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (chatterMeta.muser_avatar != null) {
                i3 = ImageSet.ADAPTER.encodedSizeWithTag(4, chatterMeta.muser_avatar);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (chatterMeta.memail != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, chatterMeta.memail);
            }
            return i7 + i4 + chatterMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterMeta decode(ProtoReader protoReader) throws IOException {
            C49439a aVar = new C49439a();
            aVar.f123991a = "";
            aVar.f123992b = "";
            aVar.f123995e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123991a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f123992b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f123993c = Image.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f123994d = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123995e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterMeta chatterMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterMeta.mchatter_id);
            if (chatterMeta.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterMeta.mname);
            }
            if (chatterMeta.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 3, chatterMeta.mavatar);
            }
            if (chatterMeta.muser_avatar != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, chatterMeta.muser_avatar);
            }
            if (chatterMeta.memail != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, chatterMeta.memail);
            }
            protoWriter.writeBytes(chatterMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.ChatterMeta$a */
    public static final class C49439a extends Message.Builder<ChatterMeta, C49439a> {

        /* renamed from: a */
        public String f123991a;

        /* renamed from: b */
        public String f123992b;

        /* renamed from: c */
        public Image f123993c;

        /* renamed from: d */
        public ImageSet f123994d;

        /* renamed from: e */
        public String f123995e;

        /* renamed from: a */
        public ChatterMeta build() {
            String str = this.f123991a;
            if (str != null) {
                return new ChatterMeta(str, this.f123992b, this.f123993c, this.f123994d, this.f123995e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mchatter_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C49439a newBuilder() {
        C49439a aVar = new C49439a();
        aVar.f123991a = this.mchatter_id;
        aVar.f123992b = this.mname;
        aVar.f123993c = this.mavatar;
        aVar.f123994d = this.muser_avatar;
        aVar.f123995e = this.memail;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chatter_id=");
        sb.append(this.mchatter_id);
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (this.muser_avatar != null) {
            sb.append(", user_avatar=");
            sb.append(this.muser_avatar);
        }
        if (this.memail != null) {
            sb.append(", email=");
            sb.append(this.memail);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatterMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterMeta(String str, String str2, Image image, ImageSet imageSet, String str3) {
        this(str, str2, image, imageSet, str3, ByteString.EMPTY);
    }

    public ChatterMeta(String str, String str2, Image image, ImageSet imageSet, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchatter_id = str;
        this.mname = str2;
        this.mavatar = image;
        this.muser_avatar = imageSet;
        this.memail = str3;
    }
}
