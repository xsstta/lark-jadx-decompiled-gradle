package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.os.Bundle;
import com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020'H\u0016J \u0010(\u001a\u00020$2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016RD\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRD\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0006j\b\u0012\u0004\u0012\u00020\u0010`\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0006j\b\u0012\u0004\u0012\u00020\u0010`\b@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010 \u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarModel;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarModel;", "arguments", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "values", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "calendars", "getCalendars", "()Ljava/util/ArrayList;", "setCalendars", "(Ljava/util/ArrayList;)V", "googleAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getGoogleAccountSetting", "()Ljava/util/HashMap;", "setGoogleAccountSetting", "(Ljava/util/HashMap;)V", "value", "selectCalendarId", "getSelectCalendarId", "()Ljava/lang/String;", "setSelectCalendarId", "(Ljava/lang/String;)V", "selectedCalendarIds", "getSelectedCalendarIds", "setSelectedCalendarIds", "unSelectCalendarId", "getUnSelectCalendarId", "setUnSelectCalendarId", "create", "", "destroy", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "updateDiffCalendars", "newCalendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.e */
public final class SearchChooseCalendarModel implements ISearchChooseCalendarContract.ISearchChooseCalendarModel {

    /* renamed from: a */
    private ArrayList<Calendar> f82731a = new ArrayList<>();

    /* renamed from: b */
    private String f82732b = "";

    /* renamed from: c */
    private String f82733c = "";

    /* renamed from: d */
    private ArrayList<String> f82734d = new ArrayList<>();

    /* renamed from: e */
    private HashMap<String, Boolean> f82735e = new HashMap<>();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarModel
    /* renamed from: a */
    public ArrayList<String> mo118074a() {
        return this.f82734d;
    }

    /* renamed from: c */
    public ArrayList<Calendar> mo118100c() {
        return this.f82731a;
    }

    /* renamed from: d */
    public final HashMap<String, Boolean> mo118102d() {
        return this.f82735e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0016J$\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003`\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "getCalendarVisibility", "", "calendarId", "", "getCalendars", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "getGoogleAccountSetting", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getSelectedCalendarIds", "", "getSelectedCalendarSize", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.e$a */
    public static final class C32320a implements ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData {

        /* renamed from: a */
        final /* synthetic */ SearchChooseCalendarModel f82736a;

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData
        /* renamed from: a */
        public ArrayList<Calendar> mo118083a() {
            return this.f82736a.mo118100c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData
        /* renamed from: b */
        public HashMap<String, Boolean> mo118085b() {
            return this.f82736a.mo118102d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32320a(SearchChooseCalendarModel eVar) {
            this.f82736a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData
        /* renamed from: a */
        public boolean mo118084a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            return this.f82736a.mo118074a().contains(str);
        }
    }

    /* renamed from: b */
    public ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData mo109793f() {
        return new C32320a(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarModel
    /* renamed from: a */
    public void mo118075a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        if (!mo118074a().contains(str)) {
            mo118074a().add(str);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarModel
    /* renamed from: b */
    public void mo118077b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        if (mo118074a().contains(str)) {
            mo118074a().remove(str);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarModel
    /* renamed from: a */
    public void mo118076a(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "values");
        this.f82734d.clear();
        this.f82734d.addAll(arrayList);
    }

    /* renamed from: c */
    public void mo118101c(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "values");
        this.f82731a.clear();
        this.f82731a.addAll(arrayList);
        mo118074a().clear();
        for (T t : this.f82731a) {
            if (t.isVisible()) {
                String serverId = t.getServerId();
                Intrinsics.checkExpressionValueIsNotNull(serverId, "it.serverId");
                mo118075a(serverId);
            }
        }
    }

    public SearchChooseCalendarModel(Bundle bundle) {
        Serializable serializable;
        ArrayList<Calendar> arrayList;
        Serializable serializable2;
        HashMap<String, Boolean> hashMap = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("calendar_data");
        } else {
            serializable = null;
        }
        if (serializable == null || !(serializable instanceof ArrayList)) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = (ArrayList) serializable;
        }
        mo118101c(arrayList);
        if (bundle != null) {
            serializable2 = bundle.getSerializable("google_account_setting");
        } else {
            serializable2 = null;
        }
        HashMap<String, Boolean> hashMap2 = serializable2 instanceof HashMap ? serializable2 : hashMap;
        if (hashMap2 != null) {
            this.f82735e = hashMap2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract.ISearchChooseCalendarModel
    /* renamed from: b */
    public void mo118078b(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "newCalendars");
        HashSet hashSet = new HashSet();
        ArrayList<Calendar> arrayList2 = arrayList;
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getServerId());
        }
        for (T t : mo118100c()) {
            if (!hashSet.contains(t.getServerId())) {
                mo118074a().remove(t.getServerId());
            }
        }
        hashSet.clear();
        Iterator<T> it2 = mo118100c().iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getServerId());
        }
        for (T t2 : arrayList2) {
            if (!hashSet.contains(t2.getServerId())) {
                mo118074a().add(t2.getServerId());
            }
        }
        mo118100c().clear();
        mo118100c().addAll(arrayList);
    }
}
