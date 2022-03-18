package com.bytedance.lark.pb.onboarding.v1;

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

public final class UserGuideViewAreaPair extends Message<UserGuideViewAreaPair, C18628a> {
    public static final ProtoAdapter<UserGuideViewAreaPair> ADAPTER = new C18629b();
    private static final long serialVersionUID = 0;
    public final Area area;
    public final List<UserGuideInfo> ordered_infos;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.UserGuideViewAreaPair$b */
    private static final class C18629b extends ProtoAdapter<UserGuideViewAreaPair> {
        C18629b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserGuideViewAreaPair.class);
        }

        /* renamed from: a */
        public int encodedSize(UserGuideViewAreaPair userGuideViewAreaPair) {
            int i;
            if (userGuideViewAreaPair.area != null) {
                i = Area.ADAPTER.encodedSizeWithTag(1, userGuideViewAreaPair.area);
            } else {
                i = 0;
            }
            return i + UserGuideInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, userGuideViewAreaPair.ordered_infos) + userGuideViewAreaPair.unknownFields().size();
        }

        /* renamed from: a */
        public UserGuideViewAreaPair decode(ProtoReader protoReader) throws IOException {
            C18628a aVar = new C18628a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46136a = Area.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46137b.add(UserGuideInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserGuideViewAreaPair userGuideViewAreaPair) throws IOException {
            if (userGuideViewAreaPair.area != null) {
                Area.ADAPTER.encodeWithTag(protoWriter, 1, userGuideViewAreaPair.area);
            }
            UserGuideInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, userGuideViewAreaPair.ordered_infos);
            protoWriter.writeBytes(userGuideViewAreaPair.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.UserGuideViewAreaPair$a */
    public static final class C18628a extends Message.Builder<UserGuideViewAreaPair, C18628a> {

        /* renamed from: a */
        public Area f46136a;

        /* renamed from: b */
        public List<UserGuideInfo> f46137b = Internal.newMutableList();

        /* renamed from: a */
        public UserGuideViewAreaPair build() {
            return new UserGuideViewAreaPair(this.f46136a, this.f46137b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18628a newBuilder() {
        C18628a aVar = new C18628a();
        aVar.f46136a = this.area;
        aVar.f46137b = Internal.copyOf("ordered_infos", this.ordered_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "UserGuideViewAreaPair");
        StringBuilder sb = new StringBuilder();
        if (this.area != null) {
            sb.append(", area=");
            sb.append(this.area);
        }
        if (!this.ordered_infos.isEmpty()) {
            sb.append(", ordered_infos=");
            sb.append(this.ordered_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "UserGuideViewAreaPair{");
        replace.append('}');
        return replace.toString();
    }

    public UserGuideViewAreaPair(Area area2, List<UserGuideInfo> list) {
        this(area2, list, ByteString.EMPTY);
    }

    public UserGuideViewAreaPair(Area area2, List<UserGuideInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.area = area2;
        this.ordered_infos = Internal.immutableCopyOf("ordered_infos", list);
    }
}
