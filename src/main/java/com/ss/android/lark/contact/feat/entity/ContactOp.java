package com.ss.android.lark.contact.feat.entity;

import com.bytedance.lark.pb.basic.v1.ContactOperation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ContactOp {

    /* renamed from: com.ss.android.lark.contact.feat.entity.ContactOp$a */
    public static class C35467a {
        /* renamed from: a */
        public static int m138740a(ContactOperation contactOperation) {
            if (contactOperation == ContactOperation.OPERATION_ADD) {
                return 1;
            }
            if (contactOperation == ContactOperation.OPERATION_DELETE) {
                return 2;
            }
            if (contactOperation == ContactOperation.OPERATION_UPDATE) {
                return 3;
            }
            return 0;
        }
    }
}
