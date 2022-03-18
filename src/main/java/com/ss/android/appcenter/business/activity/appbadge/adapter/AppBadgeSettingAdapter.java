package com.ss.android.appcenter.business.activity.appbadge.adapter;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.badge.AppBadgeSettingInfo;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0014\u0010 \u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012R\"\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter;", "Lcom/ss/android/appcenter/common/adapter/groupadapter/SimpleGroupAdapter;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingInfo;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter$OnBadgeSettingChangedListener;", "getListener", "()Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter$OnBadgeSettingChangedListener;", "setListener", "(Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter$OnBadgeSettingChangedListener;)V", "addData", "", "list", "", "getChildLayout", "", "viewType", "getChildrenCount", "groupPosition", "getGroupCount", "getHeaderLayout", "hasHeader", "", "onBindChildViewHolder", "holder", "Lcom/ss/android/appcenter/common/adapter/groupadapter/BaseViewHolder;", "childPosition", "setNewData", "OnBadgeSettingChangedListener", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.activity.appbadge.a.a */
public final class AppBadgeSettingAdapter extends AbstractC28128d {

    /* renamed from: a */
    private OnBadgeSettingChangedListener f68914a;

    /* renamed from: b */
    private final ArrayList<AppBadgeSettingInfo> f68915b = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/appcenter/business/activity/appbadge/adapter/AppBadgeSettingAdapter$OnBadgeSettingChangedListener;", "", "onBadgeSettingChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "badgeInfo", "Lcom/ss/android/appcenter/business/net/badge/AppBadgeSettingInfo;", "checked", "", "position", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.a.a$a */
    public interface OnBadgeSettingChangedListener {
        /* renamed from: a */
        void mo98350a(CompoundButton compoundButton, AppBadgeSettingInfo appBadgeSettingInfo, boolean z, int i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public int mo98377b() {
        return 1;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c, com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d
    /* renamed from: b */
    public boolean mo98379b(int i) {
        return true;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c, com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28128d
    /* renamed from: c */
    public int mo98380c(int i) {
        return R.layout.workplace_item_badge_setting_header;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: d */
    public int mo98381d(int i) {
        return R.layout.workplace_item_badge_setting;
    }

    /* renamed from: a */
    public final OnBadgeSettingChangedListener mo98373a() {
        return this.f68914a;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98372a(int i) {
        return this.f68915b.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBadgeSettingAdapter(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
    }

    /* renamed from: a */
    public final void mo98374a(OnBadgeSettingChangedListener aVar) {
        this.f68914a = aVar;
    }

    /* renamed from: a */
    public final void mo98376a(List<AppBadgeSettingInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f68915b.clear();
        this.f68915b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo98378b(List<AppBadgeSettingInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (!list.isEmpty()) {
            int size = this.f68915b.size();
            this.f68915b.addAll(list);
            notifyItemRangeInserted(size, this.f68915b.size());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.activity.appbadge.a.a$b */
    static final class C27625b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AppBadgeSettingAdapter f68916a;

        /* renamed from: b */
        final /* synthetic */ AppBadgeSettingInfo f68917b;

        /* renamed from: c */
        final /* synthetic */ int f68918c;

        C27625b(AppBadgeSettingAdapter aVar, AppBadgeSettingInfo appBadgeSettingInfo, int i) {
            this.f68916a = aVar;
            this.f68917b = appBadgeSettingInfo;
            this.f68918c = i;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            OnBadgeSettingChangedListener a = this.f68916a.mo98373a();
            if (a == null) {
                return;
            }
            if (compoundButton != null) {
                a.mo98350a(compoundButton, this.f68917b, z, this.f68918c);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.CompoundButton");
        }
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public void mo98375a(C28118a aVar, int i, int i2) {
        boolean z;
        int i3;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        AppBadgeSettingInfo appBadgeSettingInfo = this.f68915b.get(i2);
        if (appBadgeSettingInfo != null) {
            Intrinsics.checkExpressionValueIsNotNull(appBadgeSettingInfo, "data[childPosition] ?: return");
            View a = aVar.mo100089a(R.id.iv_app_icon);
            Intrinsics.checkExpressionValueIsNotNull(a, "holder[R.id.iv_app_icon]");
            ImageView imageView = (ImageView) a;
            View a2 = aVar.mo100089a(R.id.app_badge_switch);
            Intrinsics.checkExpressionValueIsNotNull(a2, "holder[R.id.app_badge_switch]");
            UDSwitch uDSwitch = (UDSwitch) a2;
            C27688a.m101209a(imageView.getContext(), appBadgeSettingInfo.getAvatarKey(), imageView);
            uDSwitch.setCheckedIgnoreEvent(appBadgeSettingInfo.getNeedShow());
            aVar.mo100090a(R.id.tv_app_name, appBadgeSettingInfo.name());
            View a3 = aVar.mo100089a(R.id.view_divider_bottom);
            boolean z2 = true;
            int i4 = 0;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != mo98372a(i) - 1) {
                z2 = false;
            }
            Intrinsics.checkExpressionValueIsNotNull(a3, "dividerBottom");
            if ((z2 && z) || z2) {
                i4 = 8;
            }
            a3.setVisibility(i4);
            if (z && z2) {
                i3 = R.drawable.workplace_adapter_item_round_single_bg;
            } else if (z) {
                i3 = R.drawable.workplace_adapter_item_round_top_bg;
            } else if (z2) {
                i3 = R.drawable.workplace_adapter_item_round_bottom_bg;
            } else {
                i3 = R.drawable.workplace_adapter_item_round_mid_bg;
            }
            aVar.itemView.setBackgroundResource(i3);
            uDSwitch.setOnCheckedChangeListener(new C27625b(this, appBadgeSettingInfo, i2));
        }
    }
}
