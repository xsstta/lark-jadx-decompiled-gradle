package com.ss.android.lark.desktopmode.p1788b.p1792d;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.ss.android.lark.desktopmode.b.d.a */
public class C36547a {

    /* renamed from: a */
    private Map<String, C36516a> f94087a = new HashMap();

    /* renamed from: b */
    private Map<ContainerType, Stack<String>> f94088b = new HashMap();

    /* renamed from: a */
    public void mo134882a() {
        this.f94087a.clear();
        this.f94088b.clear();
    }

    /* renamed from: d */
    public boolean mo134889d(String str) {
        return this.f94087a.containsKey(str);
    }

    /* renamed from: c */
    public C36516a mo134888c(String str) {
        return this.f94087a.get(str);
    }

    /* renamed from: a */
    public C36516a mo134881a(ContainerType containerType) {
        Stack<String> stack = this.f94088b.get(containerType);
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return this.f94087a.get(stack.peek());
    }

    /* renamed from: b */
    public Stack<C36516a> mo134885b(ContainerType containerType) {
        Stack<String> stack = this.f94088b.get(containerType);
        if (stack == null) {
            return new Stack<>();
        }
        Stack<C36516a> stack2 = new Stack<>();
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (this.f94087a.containsKey(next) && this.f94087a.get(next) != null) {
                stack2.add(this.f94087a.get(next));
            }
        }
        return stack2;
    }

    /* renamed from: a */
    public void mo134883a(C36516a aVar) {
        ContainerType containerType = aVar.getFragmentParams().getContainerType();
        Stack<String> stack = this.f94088b.get(containerType);
        if (stack == null) {
            stack = new Stack<>();
            this.f94088b.put(containerType, stack);
        }
        stack.push(aVar.getFragmentInfoId());
        this.f94087a.put(aVar.getFragmentInfoId(), aVar);
    }

    /* renamed from: b */
    public void mo134886b(C36516a aVar) {
        ContainerType containerType = aVar.getFragmentParams().getContainerType();
        Stack<String> stack = this.f94088b.get(containerType);
        if (stack == null) {
            stack = new Stack<>();
            this.f94088b.put(containerType, stack);
        }
        if (!stack.empty()) {
            this.f94087a.remove(stack.pop());
        }
        stack.push(aVar.getFragmentInfoId());
        this.f94087a.put(aVar.getFragmentInfoId(), aVar);
    }

    /* renamed from: e */
    public C36516a mo134890e(String str) {
        Stack<String> stack = this.f94088b.get(ContainerType.Float);
        if (CollectionUtils.isEmpty(stack)) {
            return null;
        }
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            C36516a aVar = this.f94087a.get(it.next());
            if (aVar != null) {
                FloatWindowParams floatWindowParams = (FloatWindowParams) aVar.getFragmentParams();
                if (TextUtils.equals(floatWindowParams.getFloatTag(), str) && floatWindowParams.isFloatStackBase()) {
                    return aVar;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public void mo134891f(String str) {
        Stack<String> stack = this.f94088b.get(ContainerType.Float);
        if (!CollectionUtils.isEmpty(stack)) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator<String> it = stack.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C36516a aVar = this.f94087a.get(next);
                if (aVar != null && TextUtils.equals(((FloatWindowParams) aVar.getFragmentParams()).getFloatTag(), str)) {
                    arrayList.add(next);
                }
            }
            for (String str2 : arrayList) {
                mo134884a(str2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo134884a(String str) {
        C36516a aVar = this.f94087a.get(str);
        if (aVar == null) {
            return false;
        }
        Stack<String> stack = this.f94088b.get(aVar.getFragmentParams().getContainerType());
        if (stack != null) {
            stack.remove(str);
        }
        this.f94087a.remove(str);
        return true;
    }

    /* renamed from: b */
    public void mo134887b(String str) {
        Stack<String> stack;
        C36516a aVar = this.f94087a.get(str);
        if (aVar != null && (stack = this.f94088b.get(aVar.getFragmentParams().getContainerType())) != null && stack.indexOf(str) != -1) {
            stack.remove(str);
            stack.push(str);
        }
    }
}
