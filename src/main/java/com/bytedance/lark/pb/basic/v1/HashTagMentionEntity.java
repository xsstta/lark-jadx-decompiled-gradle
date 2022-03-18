package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HashTagMentionEntity extends Message<HashTagMentionEntity, C14999a> {
    public static final ProtoAdapter<HashTagMentionEntity> ADAPTER = new C15000b();
    private static final long serialVersionUID = 0;
    public final MentionAction click_action;
    public final String id;
    public final MentionContent name;

    /* renamed from: com.bytedance.lark.pb.basic.v1.HashTagMentionEntity$b */
    private static final class C15000b extends ProtoAdapter<HashTagMentionEntity> {
        C15000b() {
            super(FieldEncoding.LENGTH_DELIMITED, HashTagMentionEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(HashTagMentionEntity hashTagMentionEntity) {
            int i;
            int i2;
            int i3 = 0;
            if (hashTagMentionEntity.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, hashTagMentionEntity.id);
            } else {
                i = 0;
            }
            if (hashTagMentionEntity.name != null) {
                i2 = MentionContent.ADAPTER.encodedSizeWithTag(2, hashTagMentionEntity.name);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (hashTagMentionEntity.click_action != null) {
                i3 = MentionAction.ADAPTER.encodedSizeWithTag(3, hashTagMentionEntity.click_action);
            }
            return i4 + i3 + hashTagMentionEntity.unknownFields().size();
        }

        /* renamed from: a */
        public HashTagMentionEntity decode(ProtoReader protoReader) throws IOException {
            C14999a aVar = new C14999a();
            aVar.f39664a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39664a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39665b = MentionContent.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39666c = MentionAction.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HashTagMentionEntity hashTagMentionEntity) throws IOException {
            if (hashTagMentionEntity.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hashTagMentionEntity.id);
            }
            if (hashTagMentionEntity.name != null) {
                MentionContent.ADAPTER.encodeWithTag(protoWriter, 2, hashTagMentionEntity.name);
            }
            if (hashTagMentionEntity.click_action != null) {
                MentionAction.ADAPTER.encodeWithTag(protoWriter, 3, hashTagMentionEntity.click_action);
            }
            protoWriter.writeBytes(hashTagMentionEntity.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.HashTagMentionEntity$a */
    public static final class C14999a extends Message.Builder<HashTagMentionEntity, C14999a> {

        /* renamed from: a */
        public String f39664a;

        /* renamed from: b */
        public MentionContent f39665b;

        /* renamed from: c */
        public MentionAction f39666c;

        /* renamed from: a */
        public HashTagMentionEntity build() {
            return new HashTagMentionEntity(this.f39664a, this.f39665b, this.f39666c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14999a newBuilder() {
        C14999a aVar = new C14999a();
        aVar.f39664a = this.id;
        aVar.f39665b = this.name;
        aVar.f39666c = this.click_action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "HashTagMentionEntity");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.click_action != null) {
            sb.append(", click_action=");
            sb.append(this.click_action);
        }
        StringBuilder replace = sb.replace(0, 2, "HashTagMentionEntity{");
        replace.append('}');
        return replace.toString();
    }

    public HashTagMentionEntity(String str, MentionContent mentionContent, MentionAction mentionAction) {
        this(str, mentionContent, mentionAction, ByteString.EMPTY);
    }

    public HashTagMentionEntity(String str, MentionContent mentionContent, MentionAction mentionAction, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = mentionContent;
        this.click_action = mentionAction;
    }
}
