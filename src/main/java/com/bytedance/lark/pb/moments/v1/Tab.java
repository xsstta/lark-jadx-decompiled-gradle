package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Tab extends Message<Tab, C18552a> {
    public static final ProtoAdapter<Tab> ADAPTER = new C18553b();
    public static final Boolean DEFAULT_CAN_REMOVE = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_remove;
    public final String icon_key;
    public final String id;
    public final String name;

    public enum FeedTabId implements WireEnum {
        FEED_UNKNOWN(0),
        FEED_RECOMMEND(1),
        FEED_FOLLOWING(2);
        
        public static final ProtoAdapter<FeedTabId> ADAPTER = ProtoAdapter.newEnumAdapter(FeedTabId.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FeedTabId fromValue(int i) {
            if (i == 0) {
                return FEED_UNKNOWN;
            }
            if (i == 1) {
                return FEED_RECOMMEND;
            }
            if (i != 2) {
                return null;
            }
            return FEED_FOLLOWING;
        }

        private FeedTabId(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Tab$b */
    private static final class C18553b extends ProtoAdapter<Tab> {
        C18553b() {
            super(FieldEncoding.LENGTH_DELIMITED, Tab.class);
        }

        /* renamed from: a */
        public int encodedSize(Tab tab) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (tab.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, tab.id);
            } else {
                i = 0;
            }
            if (tab.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, tab.name);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (tab.icon_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, tab.icon_key);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (tab.can_remove != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(11, tab.can_remove);
            }
            return i6 + i4 + tab.unknownFields().size();
        }

        /* renamed from: a */
        public Tab decode(ProtoReader protoReader) throws IOException {
            C18552a aVar = new C18552a();
            aVar.f46040a = "";
            aVar.f46041b = "";
            aVar.f46042c = "";
            aVar.f46043d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46040a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46041b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46042c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46043d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Tab tab) throws IOException {
            if (tab.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tab.id);
            }
            if (tab.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, tab.name);
            }
            if (tab.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, tab.icon_key);
            }
            if (tab.can_remove != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, tab.can_remove);
            }
            protoWriter.writeBytes(tab.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Tab$a */
    public static final class C18552a extends Message.Builder<Tab, C18552a> {

        /* renamed from: a */
        public String f46040a;

        /* renamed from: b */
        public String f46041b;

        /* renamed from: c */
        public String f46042c;

        /* renamed from: d */
        public Boolean f46043d;

        /* renamed from: a */
        public Tab build() {
            return new Tab(this.f46040a, this.f46041b, this.f46042c, this.f46043d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18552a newBuilder() {
        C18552a aVar = new C18552a();
        aVar.f46040a = this.id;
        aVar.f46041b = this.name;
        aVar.f46042c = this.icon_key;
        aVar.f46043d = this.can_remove;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Tab");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.can_remove != null) {
            sb.append(", can_remove=");
            sb.append(this.can_remove);
        }
        StringBuilder replace = sb.replace(0, 2, "Tab{");
        replace.append('}');
        return replace.toString();
    }

    public Tab(String str, String str2, String str3, Boolean bool) {
        this(str, str2, str3, bool, ByteString.EMPTY);
    }

    public Tab(String str, String str2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.icon_key = str3;
        this.can_remove = bool;
    }
}
