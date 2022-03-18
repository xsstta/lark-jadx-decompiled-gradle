package com.tt.miniapp.falcon.p3285a;

import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.ReadableArray;
import com.lark.falcon.engine.bridge.ReadableMap;
import com.lark.falcon.engine.bridge.WritableArray;

/* renamed from: com.tt.miniapp.falcon.a.c */
public class C66048c implements AbstractC66046a {

    /* renamed from: a */
    private WritableArray f166713a;

    /* renamed from: a */
    public WritableArray mo231136a() {
        return this.f166713a;
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public int arrayGetLength() {
        return this.f166713a.size();
    }

    public C66048c() {
        this.f166713a = new JavaOnlyArray();
    }

    public C66048c(WritableArray writableArray) {
        this.f166713a = writableArray;
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public boolean getBoolean(int i) {
        return this.f166713a.getBoolean(i);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public int getInt(int i) {
        return this.f166713a.getInt(i);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public String getString(int i) {
        return this.f166713a.getString(i);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    /* renamed from: a */
    public AbstractC66046a mo81263a(int i) {
        ReadableArray array = this.f166713a.getArray(i);
        if (array == null || !(array instanceof JavaOnlyArray)) {
            return null;
        }
        return new C66048c((JavaOnlyArray) array);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public AbstractC66047b getObject(int i) {
        ReadableMap map = this.f166713a.getMap(i);
        if (map == null || !(map instanceof JavaOnlyMap)) {
            return null;
        }
        return new C66049d((JavaOnlyMap) map);
    }

    @Override // com.tt.miniapp.falcon.p3285a.AbstractC66046a
    public void set(int i, AbstractC66047b bVar) {
        if (bVar instanceof C66049d) {
            this.f166713a.pushMap(((C66049d) bVar).mo231137a());
        }
    }
}
