package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010!\u001a\u00020\u00142\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0016J\u0018\u0010#\u001a\u00020\u00142\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016J\u0012\u0010%\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorModel;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;", "mSelectedTimeZoneId", "", "(Ljava/lang/String;)V", "isShowToast", "", "()Z", "setShowToast", "(Z)V", "mDeviceTimeZone", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "mRecentTimeZoneList", "Ljava/util/ArrayList;", "mSearchTimeZoneList", ShareHitPoint.f121868c, "getSource", "()Ljava/lang/String;", "setSource", "create", "", "deleteAllRecentTimeZone", "deleteRecentTimeZone", "timeZoneId", "destroy", "getDeviceTimeZoneId", "getSelectedTimeZoneId", "getTimeZoneDataById", "getViewData", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "handleSelectTimeZoneId", "setDeviceTimeZone", "timeZoneData", "setRecentTomeZone", "recentTimeZoneIdList", "setSearchResult", "searchTimeZoneList", "setSelectedTimeZoneId", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.k */
public final class TimeZoneSelectorModel implements ITimeZoneSelectorContract.ITimeZoneSelectorModel {

    /* renamed from: a */
    public TimeZoneItemData f112043a;

    /* renamed from: b */
    public final ArrayList<TimeZoneItemData> f112044b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<TimeZoneItemData> f112045c = new ArrayList<>();

    /* renamed from: d */
    private String f112046d = "";

    /* renamed from: e */
    private boolean f112047e = true;

    /* renamed from: f */
    private String f112048f;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public boolean mo157022a() {
        return this.f112047e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorModel$getViewData$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "getDeviceTimeZone", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "getRecentResult", "Ljava/util/ArrayList;", "getSearchResult", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.k$a */
    public static final class C44119a implements ITimeZoneSelectorContract.IViewData {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorModel f112049a;

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.IViewData
        /* renamed from: a */
        public TimeZoneItemData mo157037a() {
            return this.f112049a.f112043a;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.IViewData
        /* renamed from: b */
        public ArrayList<TimeZoneItemData> mo157038b() {
            return this.f112049a.f112045c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44119a(TimeZoneSelectorModel kVar) {
            this.f112049a = kVar;
        }
    }

    /* renamed from: b */
    public ITimeZoneSelectorContract.IViewData mo156858q() {
        return new C44119a(this);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f112044b.clear();
        this.f112045c.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1) != false) goto L_0x001c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m174888c() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneSelectorModel.m174888c():void");
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo157020a(String str) {
        this.f112048f = str;
        m174888c();
    }

    /* renamed from: b */
    public void mo157054b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f112046d = str;
    }

    public TimeZoneSelectorModel(String str) {
        this.f112048f = str;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo157019a(TimeZoneItemData iVar) {
        if (iVar != null) {
            if (TextUtils.isEmpty(this.f112048f) || Intrinsics.areEqual(this.f112048f, iVar.mo157046c())) {
                iVar.mo157043a(true);
            }
            this.f112043a = iVar;
        }
    }

    /* renamed from: c */
    private final TimeZoneItemData m174887c(String str) {
        TimeZone timeZone = TimeZone.getTimeZone(str);
        String a = TimeZoneUtils.m174942a(timeZone.getOffset(System.currentTimeMillis()) / 1000);
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timezone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        String displayName = timeZone.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName, "timezone.displayName");
        return new TimeZoneItemData(id, displayName, a);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: b */
    public void mo157023b(ArrayList<TimeZoneItemData> arrayList) {
        this.f112045c.clear();
        if (arrayList != null) {
            this.f112045c.addAll(arrayList);
        }
        for (T t : this.f112045c) {
            t.mo157043a(Intrinsics.areEqual(t.mo157046c(), this.f112048f));
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo157021a(ArrayList<String> arrayList) {
        String str;
        this.f112044b.clear();
        if (arrayList != null) {
            for (T t : arrayList) {
                TimeZoneItemData iVar = this.f112043a;
                if (iVar != null) {
                    str = iVar.mo157046c();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(t, str)) {
                    TimeZoneItemData c = m174887c(t);
                    c.mo157043a(Intrinsics.areEqual(c.mo157046c(), this.f112048f));
                    this.f112044b.add(c);
                }
            }
        }
    }
}
