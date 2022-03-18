package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GuideTips extends Message<GuideTips, C18673a> {
    public static final ProtoAdapter<GuideTips> ADAPTER = new C18674b();
    private static final long serialVersionUID = 0;
    public final List<C18636Button> buttons;
    public final Map<String, String> extras;
    public final String local_content;
    public final String local_title;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GuideTips$a */
    public static final class C18673a extends Message.Builder<GuideTips, C18673a> {

        /* renamed from: a */
        public String f46198a;

        /* renamed from: b */
        public String f46199b;

        /* renamed from: c */
        public Map<String, String> f46200c = Internal.newMutableMap();

        /* renamed from: d */
        public List<C18636Button> f46201d = Internal.newMutableList();

        /* renamed from: a */
        public GuideTips build() {
            return new GuideTips(this.f46198a, this.f46199b, this.f46200c, this.f46201d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GuideTips$b */
    private static final class C18674b extends ProtoAdapter<GuideTips> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f46202a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18674b() {
            super(FieldEncoding.LENGTH_DELIMITED, GuideTips.class);
        }

        /* renamed from: a */
        public int encodedSize(GuideTips guideTips) {
            int i;
            int i2 = 0;
            if (guideTips.local_title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, guideTips.local_title);
            } else {
                i = 0;
            }
            if (guideTips.local_content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, guideTips.local_content);
            }
            return i + i2 + this.f46202a.encodedSizeWithTag(3, guideTips.extras) + C18636Button.ADAPTER.asRepeated().encodedSizeWithTag(4, guideTips.buttons) + guideTips.unknownFields().size();
        }

        /* renamed from: a */
        public GuideTips decode(ProtoReader protoReader) throws IOException {
            C18673a aVar = new C18673a();
            aVar.f46198a = "";
            aVar.f46199b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46198a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46199b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46200c.putAll(this.f46202a.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46201d.add(C18636Button.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GuideTips guideTips) throws IOException {
            if (guideTips.local_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, guideTips.local_title);
            }
            if (guideTips.local_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, guideTips.local_content);
            }
            this.f46202a.encodeWithTag(protoWriter, 3, guideTips.extras);
            C18636Button.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, guideTips.buttons);
            protoWriter.writeBytes(guideTips.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18673a newBuilder() {
        C18673a aVar = new C18673a();
        aVar.f46198a = this.local_title;
        aVar.f46199b = this.local_content;
        aVar.f46200c = Internal.copyOf("extras", this.extras);
        aVar.f46201d = Internal.copyOf("buttons", this.buttons);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GuideTips");
        StringBuilder sb = new StringBuilder();
        if (this.local_title != null) {
            sb.append(", local_title=");
            sb.append(this.local_title);
        }
        if (this.local_content != null) {
            sb.append(", local_content=");
            sb.append(this.local_content);
        }
        if (!this.extras.isEmpty()) {
            sb.append(", extras=");
            sb.append(this.extras);
        }
        if (!this.buttons.isEmpty()) {
            sb.append(", buttons=");
            sb.append(this.buttons);
        }
        StringBuilder replace = sb.replace(0, 2, "GuideTips{");
        replace.append('}');
        return replace.toString();
    }

    public GuideTips(String str, String str2, Map<String, String> map, List<C18636Button> list) {
        this(str, str2, map, list, ByteString.EMPTY);
    }

    public GuideTips(String str, String str2, Map<String, String> map, List<C18636Button> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_title = str;
        this.local_content = str2;
        this.extras = Internal.immutableCopyOf("extras", map);
        this.buttons = Internal.immutableCopyOf("buttons", list);
    }
}
