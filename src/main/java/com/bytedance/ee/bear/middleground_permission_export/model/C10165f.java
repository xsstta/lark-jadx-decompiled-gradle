package com.bytedance.ee.bear.middleground_permission_export.model;

/* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.f */
public class C10165f {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.f$a */
    public enum EnumC10166a {
        Manager(1),
        Member(2),
        Visitor(3);
        
        private int permission;

        public int getPermission() {
            return this.permission;
        }

        private EnumC10166a(int i) {
            this.permission = i;
        }
    }

    /* renamed from: a */
    public static int m42295a() {
        return EnumC10166a.Manager.getPermission();
    }
}
