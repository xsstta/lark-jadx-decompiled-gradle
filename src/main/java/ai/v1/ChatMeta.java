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

public final class ChatMeta extends Message<ChatMeta, C0035a> {
    public static final ProtoAdapter<ChatMeta> ADAPTER = new C0036b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final ImageSet icon;
    public final Image icon_image;
    public final String name;

    /* renamed from: ai.v1.ChatMeta$b */
    private static final class C0036b extends ProtoAdapter<ChatMeta> {
        C0036b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatMeta chatMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatMeta.chat_id);
            int i3 = 0;
            if (chatMeta.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, chatMeta.name);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (chatMeta.icon != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(3, chatMeta.icon);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (chatMeta.icon_image != null) {
                i3 = Image.ADAPTER.encodedSizeWithTag(4, chatMeta.icon_image);
            }
            return i5 + i3 + chatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChatMeta decode(ProtoReader protoReader) throws IOException {
            C0035a aVar = new C0035a();
            aVar.f58a = "";
            aVar.f59b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f58a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f59b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f60c = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f61d = Image.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatMeta chatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatMeta.chat_id);
            if (chatMeta.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatMeta.name);
            }
            if (chatMeta.icon != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 3, chatMeta.icon);
            }
            if (chatMeta.icon_image != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, chatMeta.icon_image);
            }
            protoWriter.writeBytes(chatMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0035a newBuilder() {
        C0035a aVar = new C0035a();
        aVar.f58a = this.chat_id;
        aVar.f59b = this.name;
        aVar.f60c = this.icon;
        aVar.f61d = this.icon_image;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.ChatMeta$a */
    public static final class C0035a extends Message.Builder<ChatMeta, C0035a> {

        /* renamed from: a */
        public String f58a;

        /* renamed from: b */
        public String f59b;

        /* renamed from: c */
        public ImageSet f60c;

        /* renamed from: d */
        public Image f61d;

        /* renamed from: a */
        public ChatMeta build() {
            String str = this.f58a;
            if (str != null) {
                return new ChatMeta(str, this.f59b, this.f60c, this.f61d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "ChatMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.icon_image != null) {
            sb.append(", icon_image=");
            sb.append(this.icon_image);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChatMeta(String str, String str2, ImageSet imageSet, Image image) {
        this(str, str2, imageSet, image, ByteString.EMPTY);
    }

    public ChatMeta(String str, String str2, ImageSet imageSet, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.name = str2;
        this.icon = imageSet;
        this.icon_image = image;
    }
}
