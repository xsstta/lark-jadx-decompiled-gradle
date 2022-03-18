package com.tt.miniapp.falcon.p3285a;

import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.NativeHostObject;
import com.lark.falcon.engine.bridge.WritableMap;
import java.nio.ByteBuffer;

/* renamed from: com.tt.miniapp.falcon.a.d */
public class C66049d implements AbstractC66047b {

    /* renamed from: a */
    private WritableMap f166714a;

    /* renamed from: a */
    public WritableMap mo231137a() {
        return this.f166714a;
    }

    public C66049d() {
        this.f166714a = new JavaOnlyMap();
    }

    public C66049d(WritableMap writableMap) {
        this.f166714a = writableMap;
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public int getInt(String str) {
        return this.f166714a.getInt(str, 0);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public String getString(String str) {
        return this.f166714a.getString(str);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public AbstractC66047b getObject(String str) {
        return new C66049d((JavaOnlyMap) this.f166714a.getMap(str));
    }

    /* renamed from: a */
    public AbstractC66046a mo231138a(String str) {
        if (this.f166714a.getArray(str) instanceof JavaOnlyArray) {
            return new C66048c((JavaOnlyArray) this.f166714a.getArray(str));
        }
        return null;
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public boolean getBoolean(String str) {
        if (!this.f166714a.hasKey(str) || !this.f166714a.getBoolean(str)) {
            return false;
        }
        return true;
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    /* renamed from: a */
    public void mo81264a(String str, NativeHostObject nativeHostObject) {
        this.f166714a.putNativeHostObject(str, nativeHostObject);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, double d) {
        this.f166714a.putDouble(str, d);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, int i) {
        this.f166714a.putInt(str, i);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, AbstractC66046a aVar) {
        if (aVar instanceof C66048c) {
            this.f166714a.putArray(str, ((C66048c) aVar).mo231136a());
        }
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, AbstractC66047b bVar) {
        if (bVar instanceof C66049d) {
            this.f166714a.putMap(str, ((C66049d) bVar).mo231137a());
        }
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, String str2) {
        this.f166714a.putString(str, str2);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, ByteBuffer byteBuffer) {
        this.f166714a.putByteArray(str, byteBuffer.array());
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66047b
    public void set(String str, boolean z) {
        this.f166714a.putBoolean(str, z);
    }
}
