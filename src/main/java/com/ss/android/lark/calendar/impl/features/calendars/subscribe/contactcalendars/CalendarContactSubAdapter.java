package com.ss.android.lark.calendar.impl.features.calendars.subscribe.contactcalendars;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.google.firebase.messaging.Constants;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeContactData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.OwnerCalendarUnsubscribeDialog;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.SubscribeButton;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32503j;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$%B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "getCalendarSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "noMoreText", "", "getNoMoreText", "()Ljava/lang/String;", "setNoMoreText", "(Ljava/lang/String;)V", "appendList", "", "list", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CalendarChatterSubItem", "Companion", "NoMoreItemViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a */
public final class CalendarContactSubAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final float f76532b = 60.0f;

    /* renamed from: c */
    public static final Companion f76533c = new Companion(null);

    /* renamed from: a */
    public String f76534a;

    /* renamed from: d */
    private List<SubscribeContactData> f76535d = new ArrayList();

    /* renamed from: e */
    private final CalendarSubscribeView f76536e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter$CalendarChatterSubItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter;Landroid/view/View;)V", "view", "getView", "()Landroid/view/View;", "bindData", "", "content", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "checkMode", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/SubscribeButton$ButtonMode;", "modifyViewForDesktop", "context", "Landroid/content/Context;", "showAvatarInImageView", "imageView", "Landroid/widget/ImageView;", "imageWidth", "", "imageHeight", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a$a */
    public final class CalendarChatterSubItem extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CalendarContactSubAdapter f76537a;

        /* renamed from: b */
        private final View f76538b;

        /* renamed from: a */
        public final View mo110394a() {
            return this.f76538b;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter$CalendarChatterSubItem$showAvatarInImageView$1", "Lcom/ss/android/lark/calendar/impl/utils/IFakeAvatarCreator;", "createFakeAvatar", "Landroid/graphics/Bitmap;", "getAvatarFileName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a$a$c */
        public static final class C30598c implements IFakeAvatarCreator {

            /* renamed from: a */
            final /* synthetic */ Context f76544a;

            /* renamed from: b */
            final /* synthetic */ SubscribeContactData f76545b;

            @Override // com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator
            /* renamed from: b */
            public String mo110401b() {
                return Intrinsics.stringPlus(this.f76545b.mo110447k(), "_sub_calendar_image.jpg");
            }

            @Override // com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator
            /* renamed from: a */
            public Bitmap mo110400a() {
                String str;
                int i;
                int dp2px = UIUtils.dp2px(this.f76544a, 100.0f);
                String j = this.f76545b.mo110446j();
                if (j == null) {
                    str = null;
                } else if (j != null) {
                    str = j.substring(0, 1);
                    Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                if (str != null) {
                    i = str.length();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    if (Character.isLetter(str.charAt(0))) {
                        Locale locale = Locale.ENGLISH;
                        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
                        str = str.toUpperCase(locale);
                        Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toUpperCase(locale)");
                    }
                }
                return C30022a.f74882a.utilsDependency().mo108194a(dp2px, dp2px, str, -10970641);
            }

            C30598c(Context context, SubscribeContactData dVar) {
                this.f76544a = context;
                this.f76545b = dVar;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a$a$b */
        public static final class View$OnClickListenerC30597b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CalendarChatterSubItem f76542a;

            /* renamed from: b */
            final /* synthetic */ SubscribeContactData f76543b;

            View$OnClickListenerC30597b(CalendarChatterSubItem aVar, SubscribeContactData dVar) {
                this.f76542a = aVar;
                this.f76543b = dVar;
            }

            public final void onClick(View view) {
                C30022a.f74882a.oldModuleDependency().mo108285a(this.f76542a.mo110394a().getContext(), this.f76543b.mo110458m(), (String) null, (String) null);
                GeneralHitPoint.m124264o("calendar_subscription_modal");
            }
        }

        /* renamed from: b */
        public final SubscribeButton.ButtonMode mo110396b(SubscribeContactData dVar) {
            if (dVar.mo110444h()) {
                return SubscribeButton.ButtonMode.PRIVATE;
            }
            if (dVar.mo110434b()) {
                return SubscribeButton.ButtonMode.LOADING;
            }
            if (dVar.mo110432a()) {
                return SubscribeButton.ButtonMode.UNSUBSCRIBE;
            }
            return SubscribeButton.ButtonMode.SUBSCRIBE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a$a$a */
        public static final class View$OnClickListenerC30595a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CalendarChatterSubItem f76539a;

            /* renamed from: b */
            final /* synthetic */ SubscribeContactData f76540b;

            View$OnClickListenerC30595a(CalendarChatterSubItem aVar, SubscribeContactData dVar) {
                this.f76539a = aVar;
                this.f76540b = dVar;
            }

            public final void onClick(View view) {
                String str;
                int i = C30599b.f76549a[this.f76539a.mo110396b(this.f76540b).ordinal()];
                if (i == 1) {
                    str = "subscribe_contact_cal";
                } else if (i != 2) {
                    str = null;
                } else {
                    str = "unsubscribe_contact_cal";
                }
                C32503j.m124387a(str, this.f76540b.mo110445i());
                if (!this.f76540b.mo110436c() || !this.f76540b.mo110432a()) {
                    this.f76539a.f76537a.mo110390a().mo110507a(this.f76540b);
                    return;
                }
                OwnerCalendarUnsubscribeDialog.Companion aVar = OwnerCalendarUnsubscribeDialog.f76772a;
                Context context = this.f76539a.mo110394a().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                OwnerCalendarUnsubscribeDialog.Companion.m113936a(aVar, context, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.contactcalendars.CalendarContactSubAdapter.CalendarChatterSubItem.View$OnClickListenerC30595a.DialogInterface$OnClickListenerC305961 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC30595a f76541a;

                    {
                        this.f76541a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f76541a.f76539a.f76537a.mo110390a().mo110507a(this.f76541a.f76540b);
                    }
                }, null, 4, null);
            }
        }

        /* renamed from: a */
        public final void mo110395a(SubscribeContactData dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "content");
            Context context = this.f76538b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            m113708a(context, dVar);
            TextView textView = (TextView) this.f76538b.findViewById(R.id.tvTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tvTitle");
            textView.setText(dVar.mo110446j());
            TextView textView2 = (TextView) this.f76538b.findViewById(R.id.tvSubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.tvSubtitle");
            textView2.setText(dVar.mo110447k());
            if (TextUtils.isEmpty(dVar.mo110447k())) {
                TextView textView3 = (TextView) this.f76538b.findViewById(R.id.tvSubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "view.tvSubtitle");
                textView3.setVisibility(8);
            } else {
                TextView textView4 = (TextView) this.f76538b.findViewById(R.id.tvSubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tvSubtitle");
                textView4.setVisibility(0);
            }
            ((SubscribeButton) this.f76538b.findViewById(R.id.btSubscribe)).mo110607a(mo110396b(dVar));
            ((SubscribeButton) this.f76538b.findViewById(R.id.btSubscribe)).setOnClickListener(new View$OnClickListenerC30595a(this, dVar));
            if (CalendarShareDataHelper.f76316a.mo110025a(dVar.mo110443g(), Boolean.valueOf(dVar.mo110442f()), Calendar.Type.PRIMARY)) {
                TextView textView5 = (TextView) this.f76538b.findViewById(R.id.externalLabelTv);
                LarkNameTag.Companion fVar = LarkNameTag.f62897a;
                Context context2 = textView5.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                LarkNameTag e = fVar.mo90057f(context2).mo90029a(true).mo90027e();
                Intrinsics.checkExpressionValueIsNotNull(textView5, "this");
                e.mo90004a(textView5);
                textView5.setVisibility(0);
            } else {
                TextView textView6 = (TextView) this.f76538b.findViewById(R.id.externalLabelTv);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "view.externalLabelTv");
                textView6.setVisibility(8);
            }
            this.f76538b.setOnClickListener(new View$OnClickListenerC30597b(this, dVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CalendarChatterSubItem(CalendarContactSubAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f76537a = aVar;
            this.f76538b = view;
        }

        /* renamed from: a */
        private final void m113708a(Context context, SubscribeContactData dVar) {
            SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) this.f76538b.findViewById(R.id.ivAvatar);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "view.ivAvatar");
            m113707a(context, selectableRoundedImageView, 48, 48, dVar);
        }

        /* renamed from: a */
        private final void m113707a(Context context, ImageView imageView, int i, int i2, SubscribeContactData dVar) {
            CalendarLoadAvatarUtil.m125306a(context, imageView, i, i2, dVar.mo110457l(), dVar.mo110458m(), new C30598c(context, dVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter$Companion;", "", "()V", "DESKTOP_TITLE_ROOT_LEFT_MARGIN", "", "getDESKTOP_TITLE_ROOT_LEFT_MARGIN", "()F", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter$NoMoreItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarContactSubAdapter;Landroid/view/View;)V", "itemText", "Landroid/widget/TextView;", "getItemText", "()Landroid/widget/TextView;", "setItemText", "(Landroid/widget/TextView;)V", "getView", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a.a$c */
    public final class NoMoreItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CalendarContactSubAdapter f76546a;

        /* renamed from: b */
        private TextView f76547b;

        /* renamed from: c */
        private final View f76548c;

        /* renamed from: a */
        public final TextView mo110402a() {
            return this.f76547b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoMoreItemViewHolder(CalendarContactSubAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f76546a = aVar;
            this.f76548c = view;
            TextView textView = (TextView) view.findViewById(R.id.remindText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.remindText");
            this.f76547b = textView;
        }
    }

    /* renamed from: a */
    public final CalendarSubscribeView mo110390a() {
        return this.f76536e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76535d.size();
    }

    /* renamed from: a */
    public final void mo110391a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f76534a = str;
    }

    /* renamed from: a */
    public final void mo110392a(List<SubscribeContactData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f76535d = list;
    }

    /* renamed from: b */
    public final void mo110393b(List<SubscribeContactData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f76535d.addAll(list);
    }

    public CalendarContactSubAdapter(CalendarSubscribeView gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "calendarSubscribeView");
        this.f76536e = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f76535d.get(i).mo110438d()) {
            return R.layout.calendar_rv_item_subscribe_calendar_contact;
        }
        return R.layout.calendar_subscribe_no_more_item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (this.f76535d.get(i).mo110438d()) {
            ((CalendarChatterSubItem) viewHolder).mo110395a(this.f76535d.get(i));
            return;
        }
        TextView a = ((NoMoreItemViewHolder) viewHolder).mo110402a();
        String str = this.f76534a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noMoreText");
        }
        a.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == R.layout.calendar_rv_item_subscribe_calendar_contact) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_rv_item_subscribe_calendar_contact, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…e_calendar_contact, null)");
            return new CalendarChatterSubItem(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_subscribe_no_more_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…_more_item, parent,false)");
        return new NoMoreItemViewHolder(this, inflate2);
    }
}
