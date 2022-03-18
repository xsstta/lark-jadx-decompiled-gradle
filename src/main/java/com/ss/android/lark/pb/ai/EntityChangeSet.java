package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.Image;
import java.io.IOException;
import okio.ByteString;

public final class EntityChangeSet extends Message<EntityChangeSet, C49453a> {
    public static final ProtoAdapter<EntityChangeSet> ADAPTER = new C49454b();
    public static final Long DEFAULT_UPDATE_AT = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Image mavatar;
    public final Long mupdate_at;
    public final Long muser_id;
    public final String muser_name;

    /* renamed from: com.ss.android.lark.pb.ai.EntityChangeSet$b */
    private static final class C49454b extends ProtoAdapter<EntityChangeSet> {
        C49454b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityChangeSet.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityChangeSet entityChangeSet) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, entityChangeSet.muser_id);
            int i3 = 0;
            if (entityChangeSet.muser_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, entityChangeSet.muser_name);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (entityChangeSet.mavatar != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(3, entityChangeSet.mavatar);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (entityChangeSet.mupdate_at != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, entityChangeSet.mupdate_at);
            }
            return i5 + i3 + entityChangeSet.unknownFields().size();
        }

        /* renamed from: a */
        public EntityChangeSet decode(ProtoReader protoReader) throws IOException {
            C49453a aVar = new C49453a();
            aVar.f124039a = 0L;
            aVar.f124040b = "";
            aVar.f124042d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124039a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124040b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124041c = Image.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124042d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntityChangeSet entityChangeSet) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, entityChangeSet.muser_id);
            if (entityChangeSet.muser_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, entityChangeSet.muser_name);
            }
            if (entityChangeSet.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 3, entityChangeSet.mavatar);
            }
            if (entityChangeSet.mupdate_at != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, entityChangeSet.mupdate_at);
            }
            protoWriter.writeBytes(entityChangeSet.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49453a newBuilder() {
        C49453a aVar = new C49453a();
        aVar.f124039a = this.muser_id;
        aVar.f124040b = this.muser_name;
        aVar.f124041c = this.mavatar;
        aVar.f124042d = this.mupdate_at;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.EntityChangeSet$a */
    public static final class C49453a extends Message.Builder<EntityChangeSet, C49453a> {

        /* renamed from: a */
        public Long f124039a;

        /* renamed from: b */
        public String f124040b;

        /* renamed from: c */
        public Image f124041c;

        /* renamed from: d */
        public Long f124042d;

        /* renamed from: a */
        public EntityChangeSet build() {
            Long l = this.f124039a;
            if (l != null) {
                return new EntityChangeSet(l, this.f124040b, this.f124041c, this.f124042d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "muser_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        if (this.muser_name != null) {
            sb.append(", user_name=");
            sb.append(this.muser_name);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (this.mupdate_at != null) {
            sb.append(", update_at=");
            sb.append(this.mupdate_at);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityChangeSet{");
        replace.append('}');
        return replace.toString();
    }

    public EntityChangeSet(Long l, String str, Image image, Long l2) {
        this(l, str, image, l2, ByteString.EMPTY);
    }

    public EntityChangeSet(Long l, String str, Image image, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = l;
        this.muser_name = str;
        this.mavatar = image;
        this.mupdate_at = l2;
    }
}
