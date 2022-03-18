package com.ss.android.lark.profile.func.user_profile.infos;

import android.text.TextUtils;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.profile.v2.entity.DepartmentField;
import com.ss.android.lark.profile.v2.entity.DescriptionField;
import com.ss.android.lark.profile.v2.entity.HrefField;
import com.ss.android.lark.profile.v2.entity.PhoneNumberField;
import com.ss.android.lark.profile.v2.entity.TextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/Profile2DepartmentDataParser;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f */
public final class Profile2DepartmentDataParser {

    /* renamed from: a */
    public static final Companion f130315a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/Profile2DepartmentDataParser$Companion;", "", "()V", "parseDepartmentData", "", "departmentField", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField;", "parseDescriptionField2StatusItemViewData", "descriptionField", "Lcom/ss/android/lark/profile/v2/entity/DescriptionField;", "parseHrefField2LinkItemViewData", "hrefField", "Lcom/ss/android/lark/profile/v2/entity/HrefField;", "parsePhoneNumberField2MobileItemViewData", "phoneNumberField", "Lcom/ss/android/lark/profile/v2/entity/PhoneNumberField;", "parseProfile2InfoViewDatas", "baseField", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "parseTextField2AliasItemViewData", "textField", "Lcom/ss/android/lark/profile/v2/entity/TextField;", "parseTextField2TextItemViewData", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo179914a(HrefField hrefField) {
            Intrinsics.checkParameterIsNotNull(hrefField, "hrefField");
            String title = hrefField.getTitle();
            if (title != null) {
                return title;
            }
            return "";
        }

        /* renamed from: b */
        public final String mo179917b(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            String text = textField.getText();
            if (text != null) {
                return text;
            }
            return "";
        }

        /* renamed from: a */
        public final String mo179915a(PhoneNumberField phoneNumberField) {
            Intrinsics.checkParameterIsNotNull(phoneNumberField, "phoneNumberField");
            String number = phoneNumberField.getNumber();
            if (number != null) {
                return number;
            }
            return "";
        }

        /* renamed from: a */
        public final String mo179913a(DescriptionField descriptionField) {
            String str;
            Intrinsics.checkParameterIsNotNull(descriptionField, "descriptionField");
            if (descriptionField.getDescription() != null) {
                ChatterDescription description = descriptionField.getDescription();
                if (description != null) {
                    str = description.description;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    ChatterDescription description2 = descriptionField.getDescription();
                    if (description2 != null) {
                        return description2.description;
                    }
                    return null;
                }
            }
            return "";
        }

        /* renamed from: a */
        private final String m204017a(DepartmentField departmentField) {
            ArrayList arrayList = new ArrayList();
            List<DepartmentField.DepartmentPath> departmentPathList = departmentField.getDepartmentPathList();
            String str = "";
            if (departmentPathList != null) {
                Iterator<T> it = departmentPathList.iterator();
                while (it.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    List<DepartmentField.DepartmentNode> a = it.next().mo180654a();
                    if (a != null) {
                        Iterator<T> it2 = a.iterator();
                        while (it2.hasNext()) {
                            sb.append(it2.next().mo180652b());
                            sb.append("-");
                        }
                    }
                    str = StringsKt.removeSuffix(sb, "-").toString();
                    String sb2 = sb.toString();
                    Intrinsics.checkExpressionValueIsNotNull(sb2, "nameBuilder.toString()");
                    arrayList.add(sb2);
                }
            }
            return str;
        }

        /* renamed from: a */
        public final String mo179912a(BaseField baseField) {
            Intrinsics.checkParameterIsNotNull(baseField, "baseField");
            int fieldType = baseField.getFieldType();
            if (fieldType == 1) {
                String a = mo179916a((TextField) baseField);
                if (a != null) {
                    return a;
                }
                Intrinsics.throwNpe();
                return a;
            } else if (fieldType == 2) {
                String a2 = mo179914a((HrefField) baseField);
                if (a2 != null) {
                    return a2;
                }
                Intrinsics.throwNpe();
                return a2;
            } else if (fieldType == 50) {
                String b = mo179917b((TextField) baseField);
                if (b != null) {
                    return b;
                }
                Intrinsics.throwNpe();
                return b;
            } else if (fieldType == 51) {
                String a3 = mo179913a((DescriptionField) baseField);
                if (a3 != null) {
                    return a3;
                }
                Intrinsics.throwNpe();
                return a3;
            } else if (fieldType != 500) {
                switch (fieldType) {
                    case 100:
                        String a4 = m204017a((DepartmentField) baseField);
                        if (a4 != null) {
                            return a4;
                        }
                        Intrinsics.throwNpe();
                        return a4;
                    case 101:
                        String a5 = mo179915a((PhoneNumberField) baseField);
                        if (a5 != null) {
                            return a5;
                        }
                        Intrinsics.throwNpe();
                        return a5;
                    case 102:
                        String a6 = mo179914a((HrefField) baseField);
                        if (a6 != null) {
                            return a6;
                        }
                        Intrinsics.throwNpe();
                        return a6;
                    default:
                        return "";
                }
            } else {
                String a7 = mo179915a((PhoneNumberField) baseField);
                if (a7 != null) {
                    return a7;
                }
                Intrinsics.throwNpe();
                return a7;
            }
        }

        /* renamed from: a */
        public final String mo179916a(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            String text = textField.getText();
            if (text != null) {
                return text;
            }
            return "";
        }
    }
}
