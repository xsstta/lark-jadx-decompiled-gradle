package com.ss.android.lark.profile.v2.entity;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/BaseField;", "Ljava/io/Serializable;", "()V", "fieldType", "", "getFieldType", "()I", "setFieldType", "(I)V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "name", "getName", "setName", "Companion", "FieldType", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseField implements Serializable {
    public static final Companion Companion = new Companion(null);
    private int fieldType;
    private String key = "";
    private String name;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/BaseField$FieldType;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface FieldType {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/BaseField$Companion;", "", "()V", "FIELD_TYPE_ALIAS_AND_MEMO", "", "FIELD_TYPE_C_ALIAS", "FIELD_TYPE_C_DESCRIPTION", "FIELD_TYPE_LINK", "FIELD_TYPE_LINK_LIST", "FIELD_TYPE_MEMO_DESCRIPTION", "FIELD_TYPE_NAME_CARD_PHONE", "FIELD_TYPE_S_DEPARTMENT", "FIELD_TYPE_S_FRIEND_LINK", "FIELD_TYPE_S_PHONE_NUMBER", "FIELD_TYPE_TEXT", "FIELD_TYPE_TEXT_LIST", "FIELD_TYPE_UNKNOWN", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.entity.BaseField$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getFieldType() {
        return this.fieldType;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final void setFieldType(int i) {
        this.fieldType = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }
}
