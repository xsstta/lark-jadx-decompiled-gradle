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

public final class ChatMeta extends Message<ChatMeta, C49437a> {
    public static final ProtoAdapter<ChatMeta> ADAPTER = new C49438b();
    private static final long serialVersionUID = 0;
    public final ImageSet mchat_icon;
    public final String mchat_id;
    public final Image micon;
    public final String mname;

    /* renamed from: com.ss.android.lark.pb.ai.ChatMeta$b */
    private static final class C49438b extends ProtoAdapter<ChatMeta> {
        C49438b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatMeta chatMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatMeta.mchat_id);
            int i3 = 0;
            if (chatMeta.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, chatMeta.mname);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (chatMeta.micon != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(3, chatMeta.micon);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (chatMeta.mchat_icon != null) {
                i3 = ImageSet.ADAPTER.encodedSizeWithTag(4, chatMeta.mchat_icon);
            }
            return i5 + i3 + chatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChatMeta decode(ProtoReader protoReader) throws IOException {
            C49437a aVar = new C49437a();
            aVar.f123987a = "";
            aVar.f123988b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123987a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f123988b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f123989c = Image.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123990d = ImageSet.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatMeta chatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatMeta.mchat_id);
            if (chatMeta.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatMeta.mname);
            }
            if (chatMeta.micon != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 3, chatMeta.micon);
            }
            if (chatMeta.mchat_icon != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, chatMeta.mchat_icon);
            }
            protoWriter.writeBytes(chatMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49437a newBuilder() {
        C49437a aVar = new C49437a();
        aVar.f123987a = this.mchat_id;
        aVar.f123988b = this.mname;
        aVar.f123989c = this.micon;
        aVar.f123990d = this.mchat_icon;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.ChatMeta$a */
    public static final class C49437a extends Message.Builder<ChatMeta, C49437a> {

        /* renamed from: a */
        public String f123987a;

        /* renamed from: b */
        public String f123988b;

        /* renamed from: c */
        public Image f123989c;

        /* renamed from: d */
        public ImageSet f123990d;

        /* renamed from: a */
        public ChatMeta build() {
            String str = this.f123987a;
            if (str != null) {
                return new ChatMeta(str, this.f123988b, this.f123989c, this.f123990d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mchat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.mchat_id);
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.micon != null) {
            sb.append(", icon=");
            sb.append(this.micon);
        }
        if (this.mchat_icon != null) {
            sb.append(", chat_icon=");
            sb.append(this.mchat_icon);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChatMeta(String str, String str2, Image image, ImageSet imageSet) {
        this(str, str2, image, imageSet, ByteString.EMPTY);
    }

    public ChatMeta(String str, String str2, Image image, ImageSet imageSet, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.mname = str2;
        this.micon = image;
        this.mchat_icon = imageSet;
    }
}
