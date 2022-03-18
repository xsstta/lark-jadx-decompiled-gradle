package com.ss.android.lark.calendar.impl.features.meetingroom.form.helper;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ6\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00120\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ4\u0010\u001c\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00120\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0014J\u0010\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0017J\u001a\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0017J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006JF\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00120\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/helper/MeetingRoomFormHelper;", "", "()V", "addRequiredLabelEndIfNeed", "", "originalText", "", "isRequired", "", "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/CharSequence;", "filterUnKnowCustomizationData", "", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationData;", "customizationDataList", "", "getContactSpannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "contactIds", "Lkotlin/Pair;", "routeProfile", "Lkotlin/Function1;", "", "getResourceCustomizationData", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "resource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "schemaExtraData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData;", "getUserContactBottomTip", "contactNames", "hasEmptyRequiredOption", "resourceCustomization", "isNoRequiredOptionEmptyForm", "isResourceCustomizationEqual", "originData", "newData", "replaceRedRequiredLabel", "replaceSpecialStr", "originStr", "replaceStr", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b.a */
public final class MeetingRoomFormHelper {

    /* renamed from: a */
    public static final MeetingRoomFormHelper f82028a = new MeetingRoomFormHelper();

    private MeetingRoomFormHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/form/helper/MeetingRoomFormHelper$getContactSpannableStringBuilder$1$routeAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebounceAction;", "doAction", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b.a$a */
    public static final class C32091a extends DebounceAction {

        /* renamed from: a */
        final /* synthetic */ String f82029a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f82030b;

        /* renamed from: c */
        final /* synthetic */ Function1 f82031c;

        @Override // com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction
        /* renamed from: a */
        public void mo115941a() {
            this.f82031c.invoke(this.f82029a);
        }

        C32091a(String str, SpannableStringBuilder spannableStringBuilder, Function1 function1) {
            this.f82029a = str;
            this.f82030b = spannableStringBuilder;
            this.f82031c = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/form/helper/MeetingRoomFormHelper$getContactSpannableStringBuilder$1$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.b.a$b */
    public static final class C32092b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C32091a f82032a;

        C32092b(C32091a aVar) {
            this.f82032a = aVar;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f82032a.mo120295b();
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(C32634ae.m125178a(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: a */
    public final SchemaExtraData.ResourceCustomization mo117081a(CalendarResource calendarResource) {
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData;
        if (calendarResource != null) {
            schemaExtraData = calendarResource.getSchemaExtraData();
        } else {
            schemaExtraData = null;
        }
        return mo117082a(schemaExtraData);
    }

    /* renamed from: a */
    public final SchemaExtraData.ResourceCustomization mo117082a(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData) {
        List<SchemaExtraData.BizData> bizDataList;
        if (schemaExtraData == null || (bizDataList = schemaExtraData.getBizDataList()) == null) {
            return null;
        }
        for (T t : bizDataList) {
            if (t.getType() == SchemaExtraData.Type.RESOURCE_CUSTOMIZATION) {
                return t.getResourceCustomization();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final CharSequence mo117083a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "originalText");
        String str2 = str;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '*', 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C32634ae.m125178a(R.color.function_danger_500)), indexOf$default, indexOf$default + 1, 33);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public final boolean mo117088b(SchemaExtraData.ResourceCustomization resourceCustomization) {
        List<SchemaExtraData.CustomizationData> list;
        boolean z;
        List<SchemaExtraData.CustomizationData> list2;
        boolean z2;
        SchemaExtraData.CustomizationType customizationType;
        boolean z3;
        boolean z4;
        if (resourceCustomization != null) {
            list = resourceCustomization.customization_data;
        } else {
            list = null;
        }
        List<SchemaExtraData.CustomizationData> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(z || resourceCustomization == null || (list2 = resourceCustomization.customization_data) == null)) {
            for (T t : list2) {
                List<SchemaExtraData.OptionCondition> list4 = t.conditions;
                if (list4 == null || list4.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Boolean bool = t.is_required;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_required");
                    if (bool.booleanValue() && (customizationType = t.customization_type) != null) {
                        int i = C32093b.f82034b[customizationType.ordinal()];
                        if (i == 1) {
                            String str = t.input_content;
                            if (str == null || str.length() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                return true;
                            }
                        } else if (i == 2 || i == 3) {
                            List<SchemaExtraData.CustomizationOption> list5 = t.options;
                            if (list5 != null) {
                                Iterator<T> it = list5.iterator();
                                z4 = false;
                                while (it.hasNext()) {
                                    Boolean bool2 = it.next().is_selected;
                                    Intrinsics.checkExpressionValueIsNotNull(bool2, "option.is_selected");
                                    if (bool2.booleanValue()) {
                                        z4 = true;
                                    }
                                }
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<SchemaExtraData.CustomizationData> mo117085a(List<SchemaExtraData.CustomizationData> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "customizationDataList");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.customization_type == SchemaExtraData.CustomizationType.SingleSelect || t2.customization_type == SchemaExtraData.CustomizationType.MultipleSelect || t2.customization_type == SchemaExtraData.CustomizationType.Input) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo117086a(SchemaExtraData.ResourceCustomization resourceCustomization) {
        boolean z;
        boolean z2;
        List<SchemaExtraData.CustomizationOption> list;
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
        List<SchemaExtraData.CustomizationData> list2 = resourceCustomization.customization_data;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        List<SchemaExtraData.CustomizationData> list3 = resourceCustomization.customization_data;
        if (list3 != null) {
            for (T t : list3) {
                Boolean bool = t.is_required;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_required");
                if (bool.booleanValue()) {
                    return false;
                }
                SchemaExtraData.CustomizationType customizationType = t.customization_type;
                if (customizationType != null) {
                    int i = C32093b.f82033a[customizationType.ordinal()];
                    if (i == 1) {
                        String str = t.input_content;
                        if (str == null || str.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            return false;
                        }
                    } else if ((i == 2 || i == 3) && (list = t.options) != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Boolean bool2 = it.next().is_selected;
                            Intrinsics.checkExpressionValueIsNotNull(bool2, "option.is_selected");
                            if (bool2.booleanValue()) {
                                return false;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo117080a(List<Pair<String, String>> list, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(list, "contactNames");
        Intrinsics.checkParameterIsNotNull(function1, "routeProfile");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C32634ae.m125182b(R.string.Calendar_MeetingRoom_ContactPersonResponsbileForSetUp));
        m122028a(spannableStringBuilder, "{{username}}", list, function1);
        m122028a(spannableStringBuilder, "{{username}}", list, function1);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private final SpannableStringBuilder m122029b(List<Pair<String, String>> list, Function1<? super String, Unit> function1) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (T t : list) {
            if (spannableStringBuilder.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            String str = (String) t.getSecond();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            spannableStringBuilder2.setSpan(new C32092b(new C32091a((String) t.getFirst(), spannableStringBuilder, function1)), 0, str.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final CharSequence mo117084a(String str, Boolean bool) {
        boolean z;
        if (!(!Intrinsics.areEqual((Object) bool, (Object) true))) {
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str3 = str + '*';
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new ForegroundColorSpan(C32634ae.m125178a(R.color.function_danger_500)), str3.length() - 1, str3.length(), 33);
                return spannableString;
            }
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo117087a(SchemaExtraData.ResourceCustomization resourceCustomization, SchemaExtraData.ResourceCustomization resourceCustomization2) {
        String str;
        String str2 = null;
        if (resourceCustomization != null) {
            str = resourceCustomization.toString();
        } else {
            str = null;
        }
        if (resourceCustomization2 != null) {
            str2 = resourceCustomization2.toString();
        }
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: a */
    private final void m122028a(SpannableStringBuilder spannableStringBuilder, String str, List<Pair<String, String>> list, Function1<? super String, Unit> function1) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, str, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            spannableStringBuilder.replace(indexOf$default, str.length() + indexOf$default, (CharSequence) m122029b(list, function1));
        }
    }
}
