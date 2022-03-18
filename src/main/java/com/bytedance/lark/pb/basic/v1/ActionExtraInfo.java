package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ActionExtraInfo extends Message<ActionExtraInfo, C14646a> {
    public static final ProtoAdapter<ActionExtraInfo> ADAPTER = new C14647b();
    private static final long serialVersionUID = 0;
    public final String admin_id;
    public final String params;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ActionExtraInfo$b */
    private static final class C14647b extends ProtoAdapter<ActionExtraInfo> {
        C14647b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionExtraInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionExtraInfo actionExtraInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (actionExtraInfo.admin_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, actionExtraInfo.admin_id);
            } else {
                i = 0;
            }
            if (actionExtraInfo.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, actionExtraInfo.url);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (actionExtraInfo.params != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, actionExtraInfo.params);
            }
            return i4 + i3 + actionExtraInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ActionExtraInfo decode(ProtoReader protoReader) throws IOException {
            C14646a aVar = new C14646a();
            aVar.f38753a = "";
            aVar.f38754b = "";
            aVar.f38755c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38753a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38754b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38755c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionExtraInfo actionExtraInfo) throws IOException {
            if (actionExtraInfo.admin_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, actionExtraInfo.admin_id);
            }
            if (actionExtraInfo.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, actionExtraInfo.url);
            }
            if (actionExtraInfo.params != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, actionExtraInfo.params);
            }
            protoWriter.writeBytes(actionExtraInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ActionExtraInfo$a */
    public static final class C14646a extends Message.Builder<ActionExtraInfo, C14646a> {

        /* renamed from: a */
        public String f38753a;

        /* renamed from: b */
        public String f38754b;

        /* renamed from: c */
        public String f38755c;

        /* renamed from: a */
        public ActionExtraInfo build() {
            return new ActionExtraInfo(this.f38753a, this.f38754b, this.f38755c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14646a newBuilder() {
        C14646a aVar = new C14646a();
        aVar.f38753a = this.admin_id;
        aVar.f38754b = this.url;
        aVar.f38755c = this.params;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ActionExtraInfo");
        StringBuilder sb = new StringBuilder();
        if (this.admin_id != null) {
            sb.append(", admin_id=");
            sb.append(this.admin_id);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.params != null) {
            sb.append(", params=");
            sb.append(this.params);
        }
        StringBuilder replace = sb.replace(0, 2, "ActionExtraInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ActionExtraInfo(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public ActionExtraInfo(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.admin_id = str;
        this.url = str2;
        this.params = str3;
    }
}
