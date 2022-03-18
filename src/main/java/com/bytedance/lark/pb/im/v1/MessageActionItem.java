package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class MessageActionItem extends Message<MessageActionItem, C17815a> {
    public static final ProtoAdapter<MessageActionItem> ADAPTER = new C17816b();
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    private static final long serialVersionUID = 0;
    public final String description;
    public final String icon_key;
    public final Long id;
    public final String name;
    public final String target_url;
    public final Integer type;

    /* renamed from: com.bytedance.lark.pb.im.v1.MessageActionItem$b */
    private static final class C17816b extends ProtoAdapter<MessageActionItem> {
        C17816b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageActionItem.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageActionItem messageActionItem) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, messageActionItem.id) + ProtoAdapter.INT32.encodedSizeWithTag(2, messageActionItem.type);
            int i4 = 0;
            if (messageActionItem.icon_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, messageActionItem.icon_key);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (messageActionItem.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, messageActionItem.name);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (messageActionItem.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, messageActionItem.description);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (messageActionItem.target_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, messageActionItem.target_url);
            }
            return i7 + i4 + messageActionItem.unknownFields().size();
        }

        /* renamed from: a */
        public MessageActionItem decode(ProtoReader protoReader) throws IOException {
            C17815a aVar = new C17815a();
            aVar.f44868a = 0L;
            aVar.f44869b = 0;
            aVar.f44870c = "";
            aVar.f44871d = "";
            aVar.f44872e = "";
            aVar.f44873f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44868a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44869b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44870c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44871d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44872e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44873f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageActionItem messageActionItem) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messageActionItem.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageActionItem.type);
            if (messageActionItem.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, messageActionItem.icon_key);
            }
            if (messageActionItem.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, messageActionItem.name);
            }
            if (messageActionItem.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, messageActionItem.description);
            }
            if (messageActionItem.target_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, messageActionItem.target_url);
            }
            protoWriter.writeBytes(messageActionItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MessageActionItem$a */
    public static final class C17815a extends Message.Builder<MessageActionItem, C17815a> {

        /* renamed from: a */
        public Long f44868a;

        /* renamed from: b */
        public Integer f44869b;

        /* renamed from: c */
        public String f44870c;

        /* renamed from: d */
        public String f44871d;

        /* renamed from: e */
        public String f44872e;

        /* renamed from: f */
        public String f44873f;

        /* renamed from: a */
        public MessageActionItem build() {
            Integer num;
            Long l = this.f44868a;
            if (l != null && (num = this.f44869b) != null) {
                return new MessageActionItem(l, num, this.f44870c, this.f44871d, this.f44872e, this.f44873f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "id", this.f44869b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C17815a newBuilder() {
        C17815a aVar = new C17815a();
        aVar.f44868a = this.id;
        aVar.f44869b = this.type;
        aVar.f44870c = this.icon_key;
        aVar.f44871d = this.name;
        aVar.f44872e = this.description;
        aVar.f44873f = this.target_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MessageActionItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.target_url != null) {
            sb.append(", target_url=");
            sb.append(this.target_url);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageActionItem{");
        replace.append('}');
        return replace.toString();
    }

    public MessageActionItem(Long l, Integer num, String str, String str2, String str3, String str4) {
        this(l, num, str, str2, str3, str4, ByteString.EMPTY);
    }

    public MessageActionItem(Long l, Integer num, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.type = num;
        this.icon_key = str;
        this.name = str2;
        this.description = str3;
        this.target_url = str4;
    }
}
