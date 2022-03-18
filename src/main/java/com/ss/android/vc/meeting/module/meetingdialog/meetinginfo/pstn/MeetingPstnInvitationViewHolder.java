package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.PSTNPhone;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.basedialog.IBackPressHandlerRegister;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.module.base.AbstractC61425e;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62413e;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryInfo;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryListManifest;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u001e\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0002J\u0006\u0010:\u001a\u00020\u0014J\b\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0014H\u0002J\b\u0010?\u001a\u00020@H\u0016J\u0018\u0010A\u001a\u00020<2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010B\u001a\u000209H\u0002J\u000e\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020@R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018¨\u0006E"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationViewHolder;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/IBackPressedHandler;", "context", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "dialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "backPressHandlerRegister", "Lcom/ss/android/vc/meeting/basedialog/IBackPressHandlerRegister;", "meetingNumber", "", "adminSettings", "Lcom/ss/android/vc/entity/AdminSettings;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;Lcom/ss/android/vc/meeting/basedialog/IBackPressHandlerRegister;Ljava/lang/String;Lcom/ss/android/vc/entity/AdminSettings;)V", "adapter", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/MeetingPstnInvitationAdapter;", "getContext", "()Landroid/app/Activity;", "crossIcon", "Landroid/view/View;", "getCrossIcon", "()Landroid/view/View;", "setCrossIcon", "(Landroid/view/View;)V", "getDialog", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "dismissListener", "Lcom/ss/android/vc/meeting/module/base/DismissListener;", "getDismissListener", "()Lcom/ss/android/vc/meeting/module/base/DismissListener;", "setDismissListener", "(Lcom/ss/android/vc/meeting/module/base/DismissListener;)V", "headerLayout", "getHeaderLayout", "setHeaderLayout", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "meetingNumberTv", "Landroid/widget/TextView;", "getMeetingNumberTv", "()Landroid/widget/TextView;", "setMeetingNumberTv", "(Landroid/widget/TextView;)V", "pstnRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getPstnRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setPstnRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "title", "getTitle", "setTitle", "buildPstnInviteInfo", "", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInviteInfo;", "countryListManifest", "Lcom/ss/android/vc/meeting/module/meetingdialog/pstn/country/CountryListManifest;", "createView", "fetchPstnInfo", "", "initViews", "rootView", "onBackPressed", "", "onFetchPstnInfoFinished", "manifest", "onOrientationChanged", "isLandscape", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.c */
public final class MeetingPstnInvitationViewHolder implements AbstractC61214a {

    /* renamed from: a */
    public View f156582a;

    /* renamed from: b */
    public View f156583b;

    /* renamed from: c */
    public TextView f156584c;

    /* renamed from: d */
    public RecyclerView f156585d;

    /* renamed from: e */
    public View f156586e;

    /* renamed from: f */
    public MeetingPstnInvitationAdapter f156587f;

    /* renamed from: g */
    public final AdminSettings f156588g;

    /* renamed from: h */
    private AbstractC61425e f156589h;

    /* renamed from: i */
    private final Activity f156590i;

    /* renamed from: j */
    private final C61303k f156591j;

    /* renamed from: k */
    private final AbstractC61222a f156592k;

    /* renamed from: l */
    private final IBackPressHandlerRegister f156593l;

    /* renamed from: m */
    private final String f156594m;

    /* renamed from: d */
    public final C61303k mo215497d() {
        return this.f156591j;
    }

    /* renamed from: e */
    private final void m243431e() {
        C57865c.m224576a(new RunnableC62315b(this));
    }

    /* renamed from: a */
    public final View mo215492a() {
        View view = this.f156583b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crossIcon");
        }
        return view;
    }

    /* renamed from: b */
    public final View mo215496b() {
        View inflate = LayoutInflater.from(this.f156590i).inflate(R.layout.dialog_meeting_pstn_invitation, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        m243429a(inflate);
        m243431e();
        return inflate;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        AbstractC61425e eVar = this.f156589h;
        if (eVar != null) {
            eVar.dismiss();
        }
        IBackPressHandlerRegister cVar = this.f156593l;
        if (cVar == null) {
            return true;
        }
        cVar.mo211612b(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.c$b */
    public static final class RunnableC62315b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingPstnInvitationViewHolder f156595a;

        RunnableC62315b(MeetingPstnInvitationViewHolder cVar) {
            this.f156595a = cVar;
        }

        public final void run() {
            final CountryListManifest b = C62413e.m243942a().mo215805b(ar.m236694a());
            if (b != null) {
                AdminSettings adminSettings = this.f156595a.f156588g;
                if (adminSettings != null) {
                    this.f156595a.mo215493a(adminSettings, b);
                } else if (this.f156595a.mo215497d() != null) {
                    C61383d I = this.f156595a.mo215497d().mo212091I();
                    Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
                    I.mo212496c().mo212426a(new AbstractC63598b<AdminSettings>(this) {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.MeetingPstnInvitationViewHolder.RunnableC62315b.C623161 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC62315b f156596a;

                        /* renamed from: a */
                        public void onSuccess(AdminSettings adminSettings) {
                            if (adminSettings != null) {
                                C60700b.m235851b("MeetingPstnInvitationViewHolder", "[fetchPstnInfo]", "success");
                                this.f156596a.f156595a.mo215493a(adminSettings, b);
                            }
                        }

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            String str;
                            if (eVar != null) {
                                str = eVar.mo219902b();
                            } else {
                                str = null;
                            }
                            C60700b.m235864f("MeetingPstnInvitationViewHolder", "[fetchPstnInfo2]", String.valueOf(str));
                        }

                        {
                            this.f156596a = r1;
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.c$c */
    public static final class RunnableC62317c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingPstnInvitationViewHolder f156598a;

        /* renamed from: b */
        final /* synthetic */ List f156599b;

        RunnableC62317c(MeetingPstnInvitationViewHolder cVar, List list) {
            this.f156598a = cVar;
            this.f156599b = list;
        }

        public final void run() {
            C60700b.m235851b("MeetingPstnInvitationViewHolder", "[onFetchPstnInfoFinished]", "pstnInviteInfoList: " + this.f156599b.size());
            MeetingPstnInvitationViewHolder.m243428a(this.f156598a).mo208289a(this.f156599b);
            if (DesktopUtil.m144307b()) {
                this.f156598a.mo215495a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo215494a(AbstractC61425e eVar) {
        this.f156589h = eVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/vc/entity/PSTNPhone;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.c$a */
    public static final class C62314a extends Lambda implements Function1<PSTNPhone, String> {
        public static final C62314a INSTANCE = new C62314a();

        C62314a() {
            super(1);
        }

        public final String invoke(PSTNPhone pSTNPhone) {
            String str = pSTNPhone.displayNumber;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.displayNumber");
            return str;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MeetingPstnInvitationAdapter m243428a(MeetingPstnInvitationViewHolder cVar) {
        MeetingPstnInvitationAdapter aVar = cVar.f156587f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo215495a(boolean z) {
        double d;
        if (z) {
            d = 60.0d;
        } else {
            d = 16.0d;
        }
        int a = C60773o.m236115a(d);
        View view = this.f156586e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerLayout");
        }
        view.setPadding(a, 0, a, 0);
        MeetingPstnInvitationAdapter aVar = this.f156587f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo215489a(z);
    }

    /* renamed from: a */
    private final void m243429a(View view) {
        View findViewById = view.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.title)");
        this.f156582a = findViewById;
        View findViewById2 = view.findViewById(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.crossIcon)");
        this.f156583b = findViewById2;
        View findViewById3 = view.findViewById(R.id.meetingNumberTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.meetingNumberTv)");
        this.f156584c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.pstnRecyclerView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.pstnRecyclerView)");
        this.f156585d = (RecyclerView) findViewById4;
        View findViewById5 = view.findViewById(R.id.headerLayout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.headerLayout)");
        this.f156586e = findViewById5;
        if (DesktopUtil.m144307b()) {
            View view2 = this.f156583b;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("crossIcon");
            }
            C60752f.m236083c(view2);
            View view3 = this.f156582a;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("title");
            }
            C60752f.m236083c(view3);
            view.setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
        }
        IBackPressHandlerRegister cVar = this.f156593l;
        if (cVar != null) {
            cVar.mo211608a(this);
        }
        AbstractC61222a aVar = this.f156592k;
        if (aVar != null) {
            aVar.mo211610a(UIHelper.getString(R.string.View_M_DialIn));
        }
        TextView textView = this.f156584c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("meetingNumberTv");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f156590i.getString(R.string.View_M_MeetingIdColon));
        String str = this.f156594m;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(C60733aa.m235978a(str));
        textView.setText(sb.toString());
        RecyclerView recyclerView = this.f156585d;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pstnRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f156590i));
        String str3 = this.f156594m;
        if (str3 != null) {
            str2 = str3;
        }
        this.f156587f = new MeetingPstnInvitationAdapter(str2);
        RecyclerView recyclerView2 = this.f156585d;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pstnRecyclerView");
        }
        MeetingPstnInvitationAdapter aVar2 = this.f156587f;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(aVar2);
    }

    /* renamed from: a */
    public final void mo215493a(AdminSettings adminSettings, CountryListManifest countryListManifest) {
        C60735ab.m236001a(new RunnableC62317c(this, m243430b(adminSettings, countryListManifest)));
    }

    /* renamed from: b */
    private final List<PstnInviteInfo> m243430b(AdminSettings adminSettings, CountryListManifest countryListManifest) {
        boolean z;
        CountryInfo countryInfo;
        LinkedHashMap<String, CountryInfo> data = countryListManifest.getData();
        LinkedHashMap<String, CountryInfo> linkedHashMap = data;
        boolean z2 = false;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C60700b.m235864f("MeetingPstnInvitationViewHolder", "[buildPstnInviteInfo]", "countryMap is null or empty");
            List<PstnInviteInfo> emptyList = Collections.emptyList();
            Intrinsics.checkExpressionValueIsNotNull(emptyList, "Collections.emptyList()");
            return emptyList;
        }
        List<PSTNPhone> list = adminSettings.pstnIncomingCallPhoneList;
        List<PSTNPhone> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        }
        if (z2) {
            C60700b.m235864f("MeetingPstnInvitationViewHolder", "[buildPstnInviteInfo]", "phoneList is null or empty");
            List<PstnInviteInfo> emptyList2 = Collections.emptyList();
            Intrinsics.checkExpressionValueIsNotNull(emptyList2, "Collections.emptyList()");
            return emptyList2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T t : list) {
            String str = t.country;
            Object obj = linkedHashMap2.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(str, obj);
            }
            ((List) obj).add(t);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : linkedHashMap2.keySet()) {
            if (data.containsKey(str2) && (countryInfo = data.get(str2)) != null) {
                Intrinsics.checkExpressionValueIsNotNull(countryInfo, "countryMap[country] ?: continue");
                List list3 = (List) linkedHashMap2.get(str2);
                if (list3 != null) {
                    String name = countryInfo.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "countryInfo.name");
                    arrayList.add(new PstnInviteInfo(name, CollectionsKt.joinToString$default(list3, "\n", null, null, 0, null, C62314a.INSTANCE, 30, null)));
                }
            }
        }
        return arrayList;
    }

    public MeetingPstnInvitationViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar, IBackPressHandlerRegister cVar, String str, AdminSettings adminSettings) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f156590i = activity;
        this.f156591j = kVar;
        this.f156592k = aVar;
        this.f156593l = cVar;
        this.f156594m = str;
        this.f156588g = adminSettings;
    }
}
