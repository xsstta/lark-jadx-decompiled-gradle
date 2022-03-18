package com.ss.android.lark.profile.func.v3.userprofile.fields;

import android.text.TextUtils;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias.AliasItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias_description.AliasAndDescriptionViewData;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentNameViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.description.DescriptionViewData;
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.LinkItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.list_type.LinkItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.list_type.TextItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.PhoneNumberItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.status.StatusItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.TextItemViewDataV3;
import com.ss.android.lark.profile.v2.entity.AliasDescriptionField;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.profile.v2.entity.DepartmentField;
import com.ss.android.lark.profile.v2.entity.DescriptionField;
import com.ss.android.lark.profile.v2.entity.HrefField;
import com.ss.android.lark.profile.v2.entity.HrefListField;
import com.ss.android.lark.profile.v2.entity.PhoneNumberField;
import com.ss.android.lark.profile.v2.entity.TextField;
import com.ss.android.lark.profile.v2.entity.TextListField;
import com.ss.android.lark.utils.UserStatusHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3;", "", "()V", "Companion", "JsonI18nVal", "JsonStyle", "JsonText", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InfoViewDataParserV3 {

    /* renamed from: a */
    public static final Companion f130467a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonI18nVal;", "Ljava/io/Serializable;", "()V", "default_val", "", "getDefault_val", "()Ljava/lang/String;", "setDefault_val", "(Ljava/lang/String;)V", "i18n_vals", "", "getI18n_vals", "()Ljava/util/Map;", "setI18n_vals", "(Ljava/util/Map;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class JsonI18nVal implements Serializable {
        private String default_val;
        private Map<String, String> i18n_vals;

        public final String getDefault_val() {
            return this.default_val;
        }

        public final Map<String, String> getI18n_vals() {
            return this.i18n_vals;
        }

        public final void setDefault_val(String str) {
            this.default_val = str;
        }

        public final void setI18n_vals(Map<String, String> map) {
            this.i18n_vals = map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonStyle;", "Ljava/io/Serializable;", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "expandable", "", "getExpandable", "()Ljava/lang/Boolean;", "setExpandable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "max_lines", "", "getMax_lines", "()Ljava/lang/Integer;", "setMax_lines", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class JsonStyle implements Serializable {
        private String color;
        private Boolean expandable;
        private Integer max_lines;

        public final String getColor() {
            return this.color;
        }

        public final Boolean getExpandable() {
            return this.expandable;
        }

        public final Integer getMax_lines() {
            return this.max_lines;
        }

        public final void setColor(String str) {
            this.color = str;
        }

        public final void setExpandable(Boolean bool) {
            this.expandable = bool;
        }

        public final void setMax_lines(Integer num) {
            this.max_lines = num;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonText;", "Ljava/io/Serializable;", "()V", "style", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonStyle;", "getStyle", "()Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonStyle;", "setStyle", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonStyle;)V", "text", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonI18nVal;", "getText", "()Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonI18nVal;", "setText", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$JsonI18nVal;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class JsonText implements Serializable {
        private JsonStyle style;
        private JsonI18nVal text;

        public final JsonStyle getStyle() {
            return this.style;
        }

        public final JsonI18nVal getText() {
            return this.text;
        }

        public final void setStyle(JsonStyle jsonStyle) {
            this.style = jsonStyle;
        }

        public final void setText(JsonI18nVal jsonI18nVal) {
            this.text = jsonI18nVal;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020#J\u000e\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020#J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0014\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002¨\u00060"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/InfoViewDataParserV3$Companion;", "", "()V", "parseAliasDescriptionField2DescriptionViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/description/DescriptionViewData;", "aliasDescriptionField", "Lcom/ss/android/lark/profile/v2/entity/AliasDescriptionField;", "parseDepartmentData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentItemListDataSourceV3;", "departmentField", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField;", "parseDescriptionField2StatusItemViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/StatusItemViewDataV3;", "descriptionField", "Lcom/ss/android/lark/profile/v2/entity/DescriptionField;", "parseFields2InfoViewDatasV3", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "fields", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "parseHrefField2LinkItemViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/LinkItemViewDataV3;", "hrefField", "Lcom/ss/android/lark/profile/v2/entity/HrefField;", "parseHrefListField", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/list_type/LinkItemListDataSourceV3;", "hrefListField", "Lcom/ss/android/lark/profile/v2/entity/HrefListField;", "parsePhoneNumberField2MobileItemViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/PhoneNumberItemViewDataV3;", "phoneNumberField", "Lcom/ss/android/lark/profile/v2/entity/PhoneNumberField;", "parseTextField2AliasAndDescriptionViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias_description/AliasAndDescriptionViewData;", "textField", "Lcom/ss/android/lark/profile/v2/entity/TextField;", "parseTextField2AliasItemViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/AliasItemViewDataV3;", "parseTextField2TextItemViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/text/TextItemViewDataV3;", "parseTextListField", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/list_type/TextItemListDataSourceV3;", "textListField", "Lcom/ss/android/lark/profile/v2/entity/TextListField;", "parseTextStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "pbTextStyle", "Lcom/ss/android/lark/profile/v2/entity/TextStyle;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.InfoViewDataParserV3$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final List<BaseInfoViewDataV3> mo180229a(List<? extends BaseField> list) {
            TextItemViewDataV3 cVar;
            Intrinsics.checkParameterIsNotNull(list, "fields");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                int fieldType = t.getFieldType();
                if (fieldType == 1) {
                    Companion aVar = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar.mo180228a((TextField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
                    }
                } else if (fieldType == 2) {
                    Companion aVar2 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar2.mo180225a((HrefField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.HrefField");
                    }
                } else if (fieldType == 3) {
                    Companion aVar3 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar3.m204287a((TextListField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextListField");
                    }
                } else if (fieldType == 4) {
                    Companion aVar4 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar4.m204286a((HrefListField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.HrefListField");
                    }
                } else if (fieldType == 50) {
                    Companion aVar5 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar5.mo180230b(t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
                    }
                } else if (fieldType == 51) {
                    Companion aVar6 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar6.mo180227a((DescriptionField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.DescriptionField");
                    }
                } else if (fieldType == 104) {
                    Companion aVar7 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar7.mo180231c(t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
                    }
                } else if (fieldType == 105) {
                    Companion aVar8 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar8.mo180224a((AliasDescriptionField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.AliasDescriptionField");
                    }
                } else if (fieldType != 500) {
                    switch (fieldType) {
                        case 100:
                            Companion aVar9 = InfoViewDataParserV3.f130467a;
                            if (t != null) {
                                cVar = aVar9.m204285a((DepartmentField) t);
                                break;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.DepartmentField");
                            }
                        case 101:
                            Companion aVar10 = InfoViewDataParserV3.f130467a;
                            if (t != null) {
                                cVar = aVar10.mo180226a((PhoneNumberField) t);
                                break;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.PhoneNumberField");
                            }
                        case 102:
                            Companion aVar11 = InfoViewDataParserV3.f130467a;
                            if (t != null) {
                                cVar = aVar11.mo180225a((HrefField) t);
                                break;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.HrefField");
                            }
                        default:
                            cVar = null;
                            break;
                    }
                } else {
                    Companion aVar12 = InfoViewDataParserV3.f130467a;
                    if (t != null) {
                        cVar = aVar12.mo180226a((PhoneNumberField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.PhoneNumberField");
                    }
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final TextItemViewDataV3 mo180228a(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            return new TextItemViewDataV3(textField.getKey(), textField.getName(), textField.getText(), m204284a(textField.getTextStyle()));
        }

        /* renamed from: a */
        public final StatusItemViewDataV3 mo180227a(DescriptionField descriptionField) {
            Intrinsics.checkParameterIsNotNull(descriptionField, "descriptionField");
            if (descriptionField.getDescription() != null) {
                ChatterDescription description = descriptionField.getDescription();
                if (!TextUtils.isEmpty(description != null ? description.description : null)) {
                    String name = descriptionField.getName();
                    ChatterDescription description2 = descriptionField.getDescription();
                    if (description2 == null) {
                        Intrinsics.throwNpe();
                    }
                    String str = description2.description;
                    UserStatusHelper a = UserStatusHelper.m224138a();
                    ChatterDescription description3 = descriptionField.getDescription();
                    if (description3 == null) {
                        Intrinsics.throwNpe();
                    }
                    ChatterDescription.Type type = description3.type;
                    Intrinsics.checkExpressionValueIsNotNull(type, "descriptionField.description!!.type");
                    return new StatusItemViewDataV3(name, str, a.mo195998a(type.getNumber()));
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DescriptionViewData mo180224a(AliasDescriptionField aliasDescriptionField) {
            Intrinsics.checkParameterIsNotNull(aliasDescriptionField, "aliasDescriptionField");
            return new DescriptionViewData(aliasDescriptionField.getKey(), aliasDescriptionField.getName(), aliasDescriptionField.getDescription(), aliasDescriptionField.getImage());
        }

        /* renamed from: c */
        public final AliasAndDescriptionViewData mo180231c(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            return new AliasAndDescriptionViewData(textField.getKey(), textField.getName(), textField.getText());
        }

        /* renamed from: a */
        private final TextStyle m204284a(com.ss.android.lark.profile.v2.entity.TextStyle aVar) {
            if (aVar == null) {
                return null;
            }
            TextStyle eVar = new TextStyle();
            eVar.mo179596b(Integer.parseInt(aVar.mo180734c()));
            eVar.mo179595a(aVar.mo180733b());
            eVar.mo179594a(aVar.mo180729a());
            return eVar;
        }

        /* renamed from: b */
        public final AliasItemViewDataV3 mo180230b(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            return new AliasItemViewDataV3(textField.getKey(), textField.getName(), textField.getText(), m204284a(textField.getTextStyle()));
        }

        /* renamed from: a */
        private final LinkItemListDataSourceV3 m204286a(HrefListField hrefListField) {
            ArrayList arrayList;
            List<HrefField> data = hrefListField.getData();
            if (data != null) {
                List<HrefField> list = data;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mo180225a((HrefField) it.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
            return new LinkItemListDataSourceV3(hrefListField.getKey(), hrefListField.getName(), arrayList);
        }

        /* renamed from: a */
        private final DepartmentItemListDataSourceV3 m204285a(DepartmentField departmentField) {
            ArrayList arrayList = new ArrayList();
            List<DepartmentField.DepartmentPath> departmentPathList = departmentField.getDepartmentPathList();
            if (departmentPathList != null) {
                Iterator<T> it = departmentPathList.iterator();
                while (it.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    List<DepartmentField.DepartmentNode> a = it.next().mo180654a();
                    if (a != null) {
                        for (T t : a) {
                            sb.append(t.mo180652b());
                            sb.append("-");
                            sb2.append(t.mo180650a());
                        }
                    }
                    String obj = StringsKt.removeSuffix(sb, "-").toString();
                    String sb3 = sb2.toString();
                    Intrinsics.checkExpressionValueIsNotNull(sb3, "idBuilder.toString()");
                    arrayList.add(new DepartmentNameViewDataV3(sb3, obj));
                }
            }
            return new DepartmentItemListDataSourceV3(departmentField.getKey(), departmentField.getName(), arrayList);
        }

        /* renamed from: a */
        private final TextItemListDataSourceV3 m204287a(TextListField textListField) {
            ArrayList arrayList;
            List<TextField> data = textListField.getData();
            if (data != null) {
                List<TextField> list = data;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mo180228a((TextField) it.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
            return new TextItemListDataSourceV3(textListField.getName(), arrayList);
        }

        /* renamed from: a */
        public final LinkItemViewDataV3 mo180225a(HrefField hrefField) {
            Intrinsics.checkParameterIsNotNull(hrefField, "hrefField");
            return new LinkItemViewDataV3(hrefField.getKey(), hrefField.getName(), hrefField.getKey(), hrefField.getType(), hrefField.getTitle(), hrefField.getLink(), m204284a(hrefField.getTextStyle()));
        }

        /* renamed from: a */
        public final PhoneNumberItemViewDataV3 mo180226a(PhoneNumberField phoneNumberField) {
            Intrinsics.checkParameterIsNotNull(phoneNumberField, "phoneNumberField");
            return new PhoneNumberItemViewDataV3(phoneNumberField.getName(), phoneNumberField.getNumber(), phoneNumberField.isPlain(), phoneNumberField.getRateLimited(), phoneNumberField.getKey());
        }
    }
}
