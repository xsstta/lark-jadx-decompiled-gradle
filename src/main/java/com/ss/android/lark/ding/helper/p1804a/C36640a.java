package com.ss.android.lark.ding.helper.p1804a;

import android.text.TextUtils;
import com.ss.android.lark.ding.helper.p1804a.AbstractC36641b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: com.ss.android.lark.ding.helper.a.a */
public class C36640a implements AbstractC36641b {

    /* renamed from: a */
    private Stack<AbstractC58451a> f94252a = new Stack<>();

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: a */
    public Stack<AbstractC58451a> mo135201a() {
        return this.f94252a;
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: c */
    public void mo135209c() {
        this.f94252a.clear();
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: b */
    public AbstractC58451a mo135206b() {
        if (this.f94252a.empty()) {
            return null;
        }
        return this.f94252a.peek();
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: a */
    public void mo135202a(AbstractC36641b.AbstractC36642a aVar) {
        if (!this.f94252a.isEmpty()) {
            AbstractC58451a peek = this.f94252a.peek();
            this.f94252a.pop();
            if (aVar != null) {
                aVar.mo135211a(peek);
                if (this.f94252a.isEmpty()) {
                    aVar.mo135210a();
                }
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: b */
    public AbstractC58451a mo135207b(AbstractC36641b.AbstractC36642a aVar) {
        if (this.f94252a.isEmpty()) {
            return null;
        }
        AbstractC58451a peek = this.f94252a.peek();
        boolean c = peek.mo117933c();
        while (!c) {
            this.f94252a.pop();
            if (aVar != null) {
                aVar.mo135211a(peek);
            }
            if (this.f94252a.isEmpty()) {
                if (aVar != null) {
                    aVar.mo135210a();
                }
                return null;
            }
            peek = this.f94252a.peek();
            c = peek.mo117933c();
        }
        return peek;
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: b */
    public void mo135208b(List<AbstractC58451a> list) {
        if (list != null) {
            for (int size = this.f94252a.size() - 1; size >= 0; size--) {
                AbstractC58451a aVar = this.f94252a.get(size);
                if (aVar == null || !aVar.aB_()) {
                    boolean z = false;
                    for (AbstractC58451a aVar2 : list) {
                        if (aVar2.mo117932b() == aVar.mo117932b() && TextUtils.equals(aVar.mo117929a(), aVar2.mo117929a())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        this.f94252a.remove(aVar);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: a */
    public void mo135204a(List<AbstractC58451a> list) {
        if (list != null) {
            for (AbstractC58451a aVar : list) {
                boolean z = false;
                Iterator<AbstractC58451a> it = this.f94252a.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next().mo117929a(), aVar.mo117929a())) {
                        z = true;
                    }
                }
                if (!z) {
                    this.f94252a.add(aVar);
                }
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: a */
    public boolean mo135205a(AbstractC58451a aVar) {
        Iterator<AbstractC58451a> it = this.f94252a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().mo117929a(), aVar.mo117929a())) {
                return false;
            }
        }
        this.f94252a.push(aVar);
        return true;
    }

    @Override // com.ss.android.lark.ding.helper.p1804a.AbstractC36641b
    /* renamed from: a */
    public void mo135203a(String str, AbstractC36641b.AbstractC36643b bVar) {
        if (this.f94252a.isEmpty()) {
            return;
        }
        if (this.f94252a.peek().mo117929a().equals(str)) {
            mo135202a(bVar);
            return;
        }
        AbstractC58451a aVar = null;
        int size = this.f94252a.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            }
            aVar = this.f94252a.get(size);
            if (aVar.mo117929a().equals(str)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            Log.m165389i("FloatDialogModel", "not found node Id " + str);
            return;
        }
        this.f94252a.remove(size);
        if (bVar != null) {
            bVar.mo135212a(size, aVar);
        }
    }
}
