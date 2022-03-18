package com.ss.android.lark.contact.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/entity/EduRoleType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "STUDENT", "PARENT", "SUBJECT_TEACHER", "CLASS_HEAD", "DIRECTOR", "SUPER_ADMIN", "ADMIN", "Companion", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum EduRoleType {
    STUDENT(1),
    PARENT(2),
    SUBJECT_TEACHER(3),
    CLASS_HEAD(4),
    DIRECTOR(5),
    SUPER_ADMIN(6),
    ADMIN(7);
    
    public static final Companion Companion = new Companion(null);
    private int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/entity/EduRoleType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/contact/entity/EduRoleType;", "value", "", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.EduRoleType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public EduRoleType mo130494a(int i) {
            switch (i) {
                case 1:
                    return EduRoleType.STUDENT;
                case 2:
                    return EduRoleType.PARENT;
                case 3:
                    return EduRoleType.SUBJECT_TEACHER;
                case 4:
                    return EduRoleType.CLASS_HEAD;
                case 5:
                    return EduRoleType.DIRECTOR;
                case 6:
                    return EduRoleType.SUPER_ADMIN;
                case 7:
                    return EduRoleType.ADMIN;
                default:
                    return null;
            }
        }
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    private EduRoleType(int i) {
        this.value = i;
    }
}
