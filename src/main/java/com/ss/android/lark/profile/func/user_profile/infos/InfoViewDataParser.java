package com.ss.android.lark.profile.func.user_profile.infos;

import android.text.TextUtils;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.alias.AliasItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentItemListDataSource;
import com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.link.LinkItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.list.LinkItemListDataSource;
import com.ss.android.lark.profile.func.user_profile.infos.list.TextItemListDataSource;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.PhoneNumberItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.text.TextItemViewData;
import com.ss.android.lark.profile.v2.entity.DepartmentField;
import com.ss.android.lark.profile.v2.entity.DescriptionField;
import com.ss.android.lark.profile.v2.entity.HrefField;
import com.ss.android.lark.profile.v2.entity.HrefListField;
import com.ss.android.lark.profile.v2.entity.PhoneNumberField;
import com.ss.android.lark.profile.v2.entity.Profile;
import com.ss.android.lark.profile.v2.entity.TextField;
import com.ss.android.lark.profile.v2.entity.TextListField;
import com.ss.android.lark.utils.UserStatusHelper;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/InfoViewDataParser;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e */
public final class InfoViewDataParser {

    /* renamed from: a */
    public static final Companion f130305a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0014\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002¨\u0006,"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/InfoViewDataParser$Companion;", "", "()V", "parseDepartmentData", "Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentItemListDataSource;", "departmentField", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField;", "parseDescriptionField2StatusItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/StatusItemViewData;", "descriptionField", "Lcom/ss/android/lark/profile/v2/entity/DescriptionField;", "spansResult", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", "parseHrefField2LinkItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/link/LinkItemViewData;", "hrefField", "Lcom/ss/android/lark/profile/v2/entity/HrefField;", "parseHrefListField", "Lcom/ss/android/lark/profile/func/user_profile/infos/list/LinkItemListDataSource;", "hrefListField", "Lcom/ss/android/lark/profile/v2/entity/HrefListField;", "parsePhoneNumberField2MobileItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/PhoneNumberItemViewData;", "phoneNumberField", "Lcom/ss/android/lark/profile/v2/entity/PhoneNumberField;", "parseProfile2InfoViewDatas", "", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "profile", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "parseTextField2AliasItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemViewData;", "textField", "Lcom/ss/android/lark/profile/v2/entity/TextField;", "parseTextField2TextItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/text/TextItemViewData;", "parseTextListField", "Lcom/ss/android/lark/profile/func/user_profile/infos/list/TextItemListDataSource;", "textListField", "Lcom/ss/android/lark/profile/v2/entity/TextListField;", "parseTextStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "pbTextStyle", "Lcom/ss/android/lark/profile/v2/entity/TextStyle;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final List<BaseInfoViewData> mo179901a(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, "profile");
            ArrayList arrayList = new ArrayList();
            for (T t : profile.getFields()) {
                int fieldType = t.getFieldType();
                TextItemViewData cVar = null;
                if (fieldType == 1) {
                    Companion aVar = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar.mo179900a((TextField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
                    }
                } else if (fieldType == 2) {
                    Companion aVar2 = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar2.mo179897a((HrefField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.HrefField");
                    }
                } else if (fieldType == 3) {
                    Companion aVar3 = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar3.m203998a((TextListField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextListField");
                    }
                } else if (fieldType == 4) {
                    Companion aVar4 = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar4.m203997a((HrefListField) t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.HrefListField");
                    }
                } else if (fieldType == 50) {
                    Companion aVar5 = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar5.mo179902b(t);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
                    }
                } else if (fieldType == 51) {
                    Companion aVar6 = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar6.mo179899a(t, null);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.DescriptionField");
                    }
                } else if (fieldType != 500) {
                    switch (fieldType) {
                        case 100:
                            Companion aVar7 = InfoViewDataParser.f130305a;
                            if (t != null) {
                                cVar = aVar7.m203999a((DepartmentField) t);
                                break;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.DepartmentField");
                            }
                        case 101:
                            Companion aVar8 = InfoViewDataParser.f130305a;
                            if (t != null) {
                                cVar = aVar8.mo179898a((PhoneNumberField) t);
                                break;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.PhoneNumberField");
                            }
                        case 102:
                            Companion aVar9 = InfoViewDataParser.f130305a;
                            if (t != null) {
                                cVar = aVar9.mo179897a((HrefField) t);
                                break;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.HrefField");
                            }
                    }
                } else {
                    Companion aVar10 = InfoViewDataParser.f130305a;
                    if (t != null) {
                        cVar = aVar10.mo179898a((PhoneNumberField) t);
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
        public final TextItemViewData mo179900a(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            return new TextItemViewData(textField.getKey(), textField.getName(), textField.getText(), m203996a(textField.getTextStyle()));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PhoneNumberItemViewData mo179898a(PhoneNumberField phoneNumberField) {
            Intrinsics.checkParameterIsNotNull(phoneNumberField, "phoneNumberField");
            return new PhoneNumberItemViewData(phoneNumberField.getName(), phoneNumberField.getNumber(), phoneNumberField.isPlain(), phoneNumberField.getRateLimited(), phoneNumberField.getKey());
        }

        /* renamed from: a */
        private final TextStyle m203996a(com.ss.android.lark.profile.v2.entity.TextStyle aVar) {
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
        public final AliasItemViewData mo179902b(TextField textField) {
            Intrinsics.checkParameterIsNotNull(textField, "textField");
            return new AliasItemViewData(textField.getKey(), textField.getName(), textField.getText(), m203996a(textField.getTextStyle()));
        }

        /* renamed from: a */
        private final LinkItemListDataSource m203997a(HrefListField hrefListField) {
            ArrayList arrayList;
            List<HrefField> data = hrefListField.getData();
            if (data != null) {
                List<HrefField> list = data;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mo179897a((HrefField) it.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
            return new LinkItemListDataSource(hrefListField.getKey(), hrefListField.getName(), arrayList);
        }

        /* renamed from: a */
        private final TextItemListDataSource m203998a(TextListField textListField) {
            ArrayList arrayList;
            List<TextField> data = textListField.getData();
            if (data != null) {
                List<TextField> list = data;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mo179900a((TextField) it.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
            return new TextItemListDataSource(textListField.getName(), arrayList);
        }

        /* renamed from: a */
        private final DepartmentItemListDataSource m203999a(DepartmentField departmentField) {
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
                    arrayList.add(new DepartmentItemViewData(sb3, obj));
                }
            }
            return new DepartmentItemListDataSource(departmentField.getKey(), departmentField.getName(), arrayList);
        }

        /* renamed from: a */
        public final LinkItemViewData mo179897a(HrefField hrefField) {
            Intrinsics.checkParameterIsNotNull(hrefField, "hrefField");
            return new LinkItemViewData(hrefField.getKey(), hrefField.getName(), hrefField.getKey(), hrefField.getType(), hrefField.getTitle(), hrefField.getLink(), m203996a(hrefField.getTextStyle()));
        }

        /* renamed from: a */
        public final StatusItemViewData mo179899a(DescriptionField descriptionField, RecogniseSpansResult recogniseSpansResult) {
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
                    String name = descriptionField.getName();
                    ChatterDescription description2 = descriptionField.getDescription();
                    if (description2 == null) {
                        Intrinsics.throwNpe();
                    }
                    String str2 = description2.description;
                    UserStatusHelper a = UserStatusHelper.m224138a();
                    ChatterDescription description3 = descriptionField.getDescription();
                    if (description3 == null) {
                        Intrinsics.throwNpe();
                    }
                    ChatterDescription.Type type = description3.type;
                    Intrinsics.checkExpressionValueIsNotNull(type, "descriptionField.description!!.type");
                    return new StatusItemViewData(name, str2, a.mo195998a(type.getNumber()), recogniseSpansResult);
                }
            }
            return null;
        }
    }
}
