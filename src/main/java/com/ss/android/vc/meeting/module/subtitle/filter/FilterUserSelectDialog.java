package com.ss.android.vc.meeting.module.subtitle.filter;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.response.C60983q;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.subtitle.filter.UserSelectAdapter;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001'B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0006\u0010\u001b\u001a\u00020\u0018J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\nJ\u0010\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0011J\u0014\u0010$\u001a\u00020\u00182\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110&R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/filter/FilterUserSelectDialog;", "Lcom/ss/android/vc/meeting/basedialog/FullScreen/MeetingFullScreenDialog;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mDelegate", "Lcom/ss/android/vc/meeting/module/subtitle/filter/FilterUserSelectDialog$UserSelectDelegate;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/subtitle/filter/FilterUserSelectDialog$UserSelectDelegate;)V", "LOG_TAG", "", "deleteFilter", "Landroid/widget/TextView;", "filterCloseView", "Landroid/view/View;", "filterTitle", "mSelectedUser", "Lcom/ss/android/vc/entity/ByteviewUser;", "mUserAdapter", "Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter;", "userRv", "Landroidx/recyclerview/widget/RecyclerView;", "createContentView", "finishSelectUser", "", "user", "initGroupShowRecycleView", "initView", "loadSubtitleUsers", "onOrientationChanged", "isLandscape", "", "setMeetingId", "id", "setSelectedUser", "selectedUser", "updateGroupData", "groupData", "", "UserSelectDelegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a */
public final class FilterUserSelectDialog extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    public final String f159073d = "FilterUserSelectDialog";

    /* renamed from: e */
    private UserSelectAdapter f159074e = new UserSelectAdapter();

    /* renamed from: f */
    private ByteviewUser f159075f;

    /* renamed from: g */
    private View f159076g;

    /* renamed from: h */
    private TextView f159077h;

    /* renamed from: i */
    private TextView f159078i;

    /* renamed from: j */
    private RecyclerView f159079j;

    /* renamed from: k */
    private C61303k f159080k;

    /* renamed from: l */
    private UserSelectDelegate f159081l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/filter/FilterUserSelectDialog$UserSelectDelegate;", "", "canLoadMore", "", "onLoadMore", "", "onUserSelected", "user", "Lcom/ss/android/vc/entity/ByteviewUser;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a$a */
    public interface UserSelectDelegate {
        /* renamed from: a */
        void mo218574a(ByteviewUser byteviewUser);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a$b */
    public static final class RunnableC63122b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FilterUserSelectDialog f159082a;

        RunnableC63122b(FilterUserSelectDialog aVar) {
            this.f159082a = aVar;
        }

        public final void run() {
            this.f159082a.dismiss();
        }
    }

    /* renamed from: l */
    private final void m247207l() {
        VcBizSender.m249273f().mo219889a(new C63126f(this));
    }

    /* renamed from: m */
    private final void m247208m() {
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(bL_(), 1, false);
        stableLinearLayoutManager.setRecycleChildrenOnDetach(true);
        RecyclerView recyclerView = this.f159079j;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(stableLinearLayoutManager);
        }
        this.f159074e.mo218582a(new C63123c(this));
        RecyclerView recyclerView2 = this.f159079j;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f159074e);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public final void mo215092k() {
        this.f159076g = mo211638d(R.id.filterCloseView);
        this.f159077h = (TextView) mo211638d(R.id.deleteFilter);
        this.f159079j = (RecyclerView) mo211638d(R.id.userRv);
        this.f159078i = (TextView) mo211638d(R.id.filterTitle);
        View view = this.f159076g;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC63124d(this));
        }
        TextView textView = this.f159077h;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC63125e(this));
        }
        m247208m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/subtitle/filter/FilterUserSelectDialog$initGroupShowRecycleView$1", "Lcom/ss/android/vc/meeting/module/subtitle/filter/UserSelectAdapter$UserSelectListener;", "onUserSelected", "", "user", "Lcom/ss/android/vc/entity/ByteviewUser;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a$c */
    public static final class C63123c implements UserSelectAdapter.UserSelectListener {

        /* renamed from: a */
        final /* synthetic */ FilterUserSelectDialog f159083a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63123c(FilterUserSelectDialog aVar) {
            this.f159083a = aVar;
        }

        @Override // com.ss.android.vc.meeting.module.subtitle.filter.UserSelectAdapter.UserSelectListener
        /* renamed from: a */
        public void mo218576a(ByteviewUser byteviewUser) {
            Intrinsics.checkParameterIsNotNull(byteviewUser, "user");
            this.f159083a.mo218570a(byteviewUser);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a$e */
    public static final class View$OnClickListenerC63125e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterUserSelectDialog f159085a;

        View$OnClickListenerC63125e(FilterUserSelectDialog aVar) {
            this.f159085a = aVar;
        }

        public final void onClick(View view) {
            this.f159085a.mo218570a((ByteviewUser) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/subtitle/filter/FilterUserSelectDialog$loadSubtitleUsers$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetParticipantListEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a$f */
    public static final class C63126f implements AbstractC63598b<C60983q> {

        /* renamed from: a */
        final /* synthetic */ FilterUserSelectDialog f159086a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63126f(FilterUserSelectDialog aVar) {
            this.f159086a = aVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f159086a.f159073d;
            C60700b.m235864f(str, "[pullSubtitleUsers]", "onError " + eVar);
        }

        /* renamed from: a */
        public void onSuccess(C60983q qVar) {
            if (!(qVar == null || CollectionUtils.isEmpty(qVar.f152715a))) {
                ArrayList arrayList = new ArrayList();
                for (ByteviewUser byteviewUser : qVar.f152715a) {
                    Intrinsics.checkExpressionValueIsNotNull(byteviewUser, "value");
                    if (!TextUtils.isEmpty(byteviewUser.getUserId())) {
                        arrayList.add(byteviewUser);
                    }
                }
                this.f159086a.mo218571a(arrayList);
            }
        }
    }

    /* renamed from: b */
    public final void mo218573b(String str) {
        this.f159074e.mo218584b(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.a.a$d */
    public static final class View$OnClickListenerC63124d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterUserSelectDialog f159084a;

        View$OnClickListenerC63124d(FilterUserSelectDialog aVar) {
            this.f159084a = aVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f159084a.bL_());
            this.f159084a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo218570a(ByteviewUser byteviewUser) {
        this.f159075f = byteviewUser;
        this.f159081l.mo218574a(byteviewUser);
        UICallbackExecutor.executeDelayed(new RunnableC63122b(this), 300);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_filter_user_select, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return inflate;
    }

    /* renamed from: a */
    public final void mo218571a(List<ByteviewUser> list) {
        Intrinsics.checkParameterIsNotNull(list, "groupData");
        this.f159074e.resetAll(list);
        ByteviewUser byteviewUser = this.f159075f;
        if (byteviewUser != null) {
            this.f159074e.mo218583a(byteviewUser.getUserId());
        }
    }

    /* renamed from: b */
    public final void mo218572b(ByteviewUser byteviewUser) {
        this.f159075f = byteviewUser;
        if (byteviewUser != null) {
            TextView textView = this.f159077h;
            if (textView != null) {
                textView.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
            }
            TextView textView2 = this.f159077h;
            if (textView2 != null) {
                textView2.setEnabled(true);
                return;
            }
            return;
        }
        TextView textView3 = this.f159077h;
        if (textView3 != null) {
            textView3.setTextColor(C60773o.m236126d(R.color.text_disable));
        }
        TextView textView4 = this.f159077h;
        if (textView4 != null) {
            textView4.setEnabled(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterUserSelectDialog(Activity activity, C61303k kVar, UserSelectDelegate aVar) {
        super(activity, kVar, true);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "mDelegate");
        this.f159080k = kVar;
        this.f159081l = aVar;
        mo215092k();
        m247207l();
    }
}
