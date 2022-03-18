package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.Team;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PushItems extends Message<PushItems, C17899a> {
    public static final ProtoAdapter<PushItems> ADAPTER = new C17900b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final List<Item> items;
    public final Map<Long, Team> teams;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        UPDATE(1),
        DELETE(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i != 2) {
                return null;
            }
            return DELETE;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushItems$a */
    public static final class C17899a extends Message.Builder<PushItems, C17899a> {

        /* renamed from: a */
        public List<Item> f44977a = Internal.newMutableList();

        /* renamed from: b */
        public Action f44978b;

        /* renamed from: c */
        public Map<Long, Team> f44979c = Internal.newMutableMap();

        /* renamed from: a */
        public PushItems build() {
            return new PushItems(this.f44977a, this.f44978b, this.f44979c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushItems$b */
    private static final class C17900b extends ProtoAdapter<PushItems> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Team>> f44980a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Team.ADAPTER);

        C17900b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushItems.class);
        }

        /* renamed from: a */
        public int encodedSize(PushItems pushItems) {
            int i;
            int encodedSizeWithTag = Item.ADAPTER.asRepeated().encodedSizeWithTag(1, pushItems.items);
            if (pushItems.action != null) {
                i = Action.ADAPTER.encodedSizeWithTag(2, pushItems.action);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f44980a.encodedSizeWithTag(10, pushItems.teams) + pushItems.unknownFields().size();
        }

        /* renamed from: a */
        public PushItems decode(ProtoReader protoReader) throws IOException {
            C17899a aVar = new C17899a();
            aVar.f44978b = Action.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44977a.add(Item.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f44978b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44979c.putAll(this.f44980a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushItems pushItems) throws IOException {
            Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushItems.items);
            if (pushItems.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 2, pushItems.action);
            }
            this.f44980a.encodeWithTag(protoWriter, 10, pushItems.teams);
            protoWriter.writeBytes(pushItems.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17899a newBuilder() {
        C17899a aVar = new C17899a();
        aVar.f44977a = Internal.copyOf("items", this.items);
        aVar.f44978b = this.action;
        aVar.f44979c = Internal.copyOf("teams", this.teams);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushItems");
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (!this.teams.isEmpty()) {
            sb.append(", teams=");
            sb.append(this.teams);
        }
        StringBuilder replace = sb.replace(0, 2, "PushItems{");
        replace.append('}');
        return replace.toString();
    }

    public PushItems(List<Item> list, Action action2, Map<Long, Team> map) {
        this(list, action2, map, ByteString.EMPTY);
    }

    public PushItems(List<Item> list, Action action2, Map<Long, Team> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = Internal.immutableCopyOf("items", list);
        this.action = action2;
        this.teams = Internal.immutableCopyOf("teams", map);
    }
}
