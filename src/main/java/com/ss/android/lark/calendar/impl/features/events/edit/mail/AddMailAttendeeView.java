package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeContract;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32660m;
import com.ss.android.lark.calendar.impl.utils.C32671v;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0003\b\u000f\u0012\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020*H\u0002J\u0018\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020%H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020\u000bH\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u001c0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u0018*\u0004\u0018\u00010 0 X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \u0018*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewApi;", "realView", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "adapterDelegate", "com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$adapterDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$adapterDelegate$1;", "attendeeCount", "", "getContext", "()Landroid/content/Context;", "doneEnableAction", "com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$doneEnableAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$doneEnableAction$1;", "doneUnableAction", "com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$doneUnableAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$doneUnableAction$1;", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter;", "mAddMailContainer", "Landroid/widget/RelativeLayout;", "kotlin.jvm.PlatformType", "mClearBtn", "Landroid/widget/ImageView;", "mEtSearchBar", "Landroid/widget/EditText;", "mMailNameTv", "Landroid/widget/TextView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "mTvInfo", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewData;", "viewRoot", "addMailAccount", "", "keyWord", "", "create", "destroy", "initMailList", "initSearchBar", "initTitleBar", "initView", "setDependency", "viewData", "viewAction", "triggleVisibility", "isShowAddMail", "", "updateAttendeeCount", "size", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e */
public final class AddMailAttendeeView implements AddMailAttendeeContract.IAddMailAttendeeViewApi {

    /* renamed from: h */
    public static final Companion f81231h = new Companion(null);

    /* renamed from: a */
    public AddMailAttendeeContract.IAddMailAttendeeViewAction f81232a;

    /* renamed from: b */
    public final CommonTitleBar f81233b;

    /* renamed from: c */
    public final TextView f81234c;

    /* renamed from: d */
    public final EditText f81235d;

    /* renamed from: e */
    public final ImageView f81236e;

    /* renamed from: f */
    public final C31872c f81237f = new C31872c(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500);

    /* renamed from: g */
    public final C31873d f81238g = new C31873d(C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.lkui_blue_6_50);

    /* renamed from: i */
    private AddMailAttendeeContract.IAddMailAttendeeViewData f81239i;

    /* renamed from: j */
    private int f81240j;

    /* renamed from: k */
    private final View f81241k;

    /* renamed from: l */
    private final RelativeLayout f81242l;

    /* renamed from: m */
    private final RecyclerView f81243m;

    /* renamed from: n */
    private final TextView f81244n;

    /* renamed from: o */
    private AddMailAttendeeAdapter f81245o;

    /* renamed from: p */
    private final C31871b f81246p = new C31871b(this);

    /* renamed from: q */
    private final Context f81247q;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$Companion;", "", "()V", "patternStr", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Context mo116171a() {
        return this.f81247q;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m121034b();
    }

    /* renamed from: b */
    private final void m121034b() {
        m121037e();
        m121036d();
        m121035c();
    }

    /* renamed from: c */
    private final void m121035c() {
        this.f81235d.setOnEditorActionListener(new C31874e(this));
        this.f81235d.addTextChangedListener(new C31875f(this));
        EditText editText = this.f81235d;
        Intrinsics.checkExpressionValueIsNotNull(editText, "mEtSearchBar");
        editText.setImeOptions(6);
        this.f81236e.setOnClickListener(new View$OnClickListenerC31876g(this));
        this.f81242l.setOnClickListener(new View$OnClickListenerC31877h(this));
    }

    /* renamed from: e */
    private final void m121037e() {
        this.f81233b.setTitle(C32634ae.m125182b(R.string.Calendar_GoogleCal_AddEmailContacts));
        this.f81233b.setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        this.f81233b.setLeftClickListener(new C31878i(this));
        this.f81233b.addAction(this.f81237f);
    }

    /* renamed from: d */
    private final void m121036d() {
        AddMailAttendeeContract.IAddMailAttendeeViewData dVar = this.f81239i;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f81245o = new AddMailAttendeeAdapter(dVar.mo116166a(), this.f81246p);
        RecyclerView recyclerView = this.f81243m;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecyclerView");
        recyclerView.setAdapter(this.f81245o);
        RecyclerView recyclerView2 = this.f81243m;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRecyclerView");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f81247q));
        AddMailAttendeeContract.IAddMailAttendeeViewData dVar2 = this.f81239i;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        mo116172a(dVar2.mo116166a().size());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$adapterDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeAdapter$AddMailAttendeeDelegate;", "deleteEmail", "", "deleteItem", "", "refreshAttendeeCount", "size", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$b */
    public static final class C31871b implements AddMailAttendeeAdapter.AddMailAttendeeDelegate {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81248a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31871b(AddMailAttendeeView eVar) {
            this.f81248a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeAdapter.AddMailAttendeeDelegate
        /* renamed from: a */
        public void mo116155a(int i) {
            this.f81248a.mo116172a(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeAdapter.AddMailAttendeeDelegate
        /* renamed from: a */
        public void mo116156a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "deleteItem");
            AddMailAttendeeView.m121033a(this.f81248a).mo116164a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$initSearchBar$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$f */
    public static final class C31875f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81251a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31875f(AddMailAttendeeView eVar) {
            this.f81251a = eVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            String str2;
            this.f81251a.f81233b.removeAllActions();
            String str3 = null;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            boolean a = C32660m.m125337a(str);
            if (a) {
                if (editable != null) {
                    str3 = editable.toString();
                }
                ArrayList b = C32660m.m125338b(str3);
                if (b == null) {
                    b = new ArrayList();
                }
                if (b.size() > 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("number", String.valueOf(b.size()));
                    if (editable == null || (str2 = editable.toString()) == null) {
                        str2 = "";
                    }
                    hashMap.put("emails", str2);
                    TextView textView = this.f81251a.f81234c;
                    Intrinsics.checkExpressionValueIsNotNull(textView, "mMailNameTv");
                    textView.setText(C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_EmailGuest_AddXEmailsMobile, hashMap));
                } else if (b.size() == 1) {
                    TextView textView2 = this.f81251a.f81234c;
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "mMailNameTv");
                    textView2.setText(b.get(0));
                }
            }
            this.f81251a.mo116175a(a);
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                ImageView imageView = this.f81251a.f81236e;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "mClearBtn");
                imageView.setVisibility(4);
                this.f81251a.f81233b.addAction(this.f81251a.f81237f);
                return;
            }
            ImageView imageView2 = this.f81251a.f81236e;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mClearBtn");
            imageView2.setVisibility(0);
            this.f81251a.f81233b.addAction(this.f81251a.f81238g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$i */
    public static final class C31878i extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81254a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31878i(AddMailAttendeeView eVar) {
            this.f81254a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C32671v.m125366b(this.f81254a.mo116171a(), view);
            Context a = this.f81254a.mo116171a();
            if (a != null) {
                ((Activity) a).finish();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AddMailAttendeeContract.IAddMailAttendeeViewAction m121033a(AddMailAttendeeView eVar) {
        AddMailAttendeeContract.IAddMailAttendeeViewAction bVar = eVar.f81232a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$doneEnableAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$c */
    public static final class C31872c extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81249a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            C32671v.m125366b(this.f81249a.mo116171a(), view);
            AddMailAttendeeView.m121033a(this.f81249a).mo116163a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31872c(AddMailAttendeeView eVar, String str, int i) {
            super(str, i);
            this.f81249a = eVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$g */
    public static final class View$OnClickListenerC31876g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81252a;

        View$OnClickListenerC31876g(AddMailAttendeeView eVar) {
            this.f81252a = eVar;
        }

        public final void onClick(View view) {
            EditText editText = this.f81252a.f81235d;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mEtSearchBar");
            editText.getText().clear();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$h */
    public static final class View$OnClickListenerC31877h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81253a;

        View$OnClickListenerC31877h(AddMailAttendeeView eVar) {
            this.f81253a = eVar;
        }

        public final void onClick(View view) {
            EditText editText = this.f81253a.f81235d;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mEtSearchBar");
            for (String str : C32660m.m125338b(editText.getText().toString())) {
                AddMailAttendeeView eVar = this.f81253a;
                Intrinsics.checkExpressionValueIsNotNull(str, "email");
                eVar.mo116174a(str);
            }
            GeneralHitPoint.m124275u();
            this.f81253a.mo116175a(false);
        }
    }

    /* renamed from: a */
    public final void mo116175a(boolean z) {
        if (z) {
            RelativeLayout relativeLayout = this.f81242l;
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mAddMailContainer");
            relativeLayout.setVisibility(0);
            RecyclerView recyclerView = this.f81243m;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecyclerView");
            recyclerView.setVisibility(8);
            TextView textView = this.f81244n;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mTvInfo");
            textView.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = this.f81242l;
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mAddMailContainer");
        relativeLayout2.setVisibility(8);
        RecyclerView recyclerView2 = this.f81243m;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRecyclerView");
        recyclerView2.setVisibility(0);
        TextView textView2 = this.f81244n;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mTvInfo");
        textView2.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo116172a(int i) {
        if (i <= 0) {
            TextView textView = this.f81244n;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mTvInfo");
            textView.setText("");
            return;
        }
        this.f81240j = i;
        TextView textView2 = this.f81244n;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mTvInfo");
        textView2.setText(C32634ae.m125182b(R.string.Calendar_GoogleCal_AddedContacts) + '(' + this.f81240j + ')');
        EditText editText = this.f81235d;
        Intrinsics.checkExpressionValueIsNotNull(editText, "mEtSearchBar");
        editText.getText().clear();
    }

    /* renamed from: a */
    public final void mo116174a(String str) {
        AddMailAttendeeContract.IAddMailAttendeeViewData dVar = this.f81239i;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        Iterator<AddMailAttendeeData> it = dVar.mo116166a().iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getAccountName(), str)) {
                EditText editText = this.f81235d;
                Intrinsics.checkExpressionValueIsNotNull(editText, "mEtSearchBar");
                editText.getText().clear();
                return;
            }
        }
        Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$").matcher(str);
        if (!C32660m.m125337a(str)) {
            LKUIToast.show(this.f81247q, C32634ae.m125182b(R.string.Calendar_GoogleCal_EmailInvalid));
            return;
        }
        AddMailAttendeeAdapter aVar = this.f81245o;
        if (aVar != null) {
            aVar.mo116153a(new AddMailAttendeeData(str, true));
        }
        AddMailAttendeeContract.IAddMailAttendeeViewAction bVar = this.f81232a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        bVar.mo116165b(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeView$doneUnableAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$d */
    public static final class C31873d extends AbstractC32629e {
        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
        }

        C31873d(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: a */
    public void mo109795a(AddMailAttendeeContract.IAddMailAttendeeViewData dVar, AddMailAttendeeContract.IAddMailAttendeeViewAction bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        Intrinsics.checkParameterIsNotNull(bVar, "viewAction");
        this.f81239i = dVar;
        this.f81232a = bVar;
    }

    public AddMailAttendeeView(View view, Context context) {
        Intrinsics.checkParameterIsNotNull(view, "realView");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81247q = context;
        this.f81241k = view;
        this.f81233b = (CommonTitleBar) view.findViewById(R.id.titleBar);
        this.f81242l = (RelativeLayout) view.findViewById(R.id.addMailContainer);
        this.f81234c = (TextView) view.findViewById(R.id.mailNameTv);
        this.f81243m = (RecyclerView) view.findViewById(R.id.recyclerView);
        this.f81244n = (TextView) view.findViewById(R.id.tvInfo);
        this.f81235d = (EditText) view.findViewById(R.id.etSearchBar);
        this.f81236e = (ImageView) view.findViewById(R.id.clearBtn);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.e$e */
    public static final class C31874e implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ AddMailAttendeeView f81250a;

        C31874e(AddMailAttendeeView eVar) {
            this.f81250a = eVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (!(i == 4 || i == 6 || (keyEvent != null && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0))) {
                return false;
            }
            EditText editText = this.f81250a.f81235d;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mEtSearchBar");
            for (String str : C32660m.m125338b(editText.getText().toString())) {
                AddMailAttendeeView eVar = this.f81250a;
                Intrinsics.checkExpressionValueIsNotNull(str, "email");
                eVar.mo116174a(str);
            }
            GeneralHitPoint.m124277v();
            return false;
        }
    }
}
