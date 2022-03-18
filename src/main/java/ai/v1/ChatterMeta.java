package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ChatterMeta extends Message<ChatterMeta, C0037a> {
    public static final ProtoAdapter<ChatterMeta> ADAPTER = new C0038b();
    private static final long serialVersionUID = 0;
    public final ImageSet avatar;
    public final Image avatar_image;
    public final String chatter_id;
    public final String name;

    /* renamed from: ai.v1.ChatterMeta$b */
    private static final class C0038b extends ProtoAdapter<ChatterMeta> {
        C0038b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterMeta chatterMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterMeta.chatter_id);
            int i3 = 0;
            if (chatterMeta.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterMeta.name);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (chatterMeta.avatar != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(3, chatterMeta.avatar);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (chatterMeta.avatar_image != null) {
                i3 = Image.ADAPTER.encodedSizeWithTag(4, chatterMeta.avatar_image);
            }
            return i5 + i3 + chatterMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterMeta decode(ProtoReader protoReader) throws IOException {
            C0037a aVar = new C0037a();
            aVar.f62a = "";
            aVar.f63b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f62a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f63b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f64c = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f65d = Image.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterMeta chatterMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterMeta.chatter_id);
            if (chatterMeta.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterMeta.name);
            }
            if (chatterMeta.avatar != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 3, chatterMeta.avatar);
            }
            if (chatterMeta.avatar_image != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, chatterMeta.avatar_image);
            }
            protoWriter.writeBytes(chatterMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0037a newBuilder() {
        C0037a aVar = new C0037a();
        aVar.f62a = this.chatter_id;
        aVar.f63b = this.name;
        aVar.f64c = this.avatar;
        aVar.f65d = this.avatar_image;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.ChatterMeta$a */
    public static final class C0037a extends Message.Builder<ChatterMeta, C0037a> {

        /* renamed from: a */
        public String f62a;

        /* renamed from: b */
        public String f63b;

        /* renamed from: c */
        public ImageSet f64c;

        /* renamed from: d */
        public Image f65d;

        /* renamed from: a */
        public ChatterMeta build() {
            String str = this.f62a;
            if (str != null) {
                return new ChatterMeta(str, this.f63b, this.f64c, this.f65d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chatter_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "ChatterMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", chatter_id=");
        sb.append(this.chatter_id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.avatar_image != null) {
            sb.append(", avatar_image=");
            sb.append(this.avatar_image);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatterMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterMeta(String str, String str2, ImageSet imageSet, Image image) {
        this(str, str2, imageSet, image, ByteString.EMPTY);
    }

    public ChatterMeta(String str, String str2, ImageSet imageSet, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_id = str;
        this.name = str2;
        this.avatar = imageSet;
        this.avatar_image = image;
    }
}
