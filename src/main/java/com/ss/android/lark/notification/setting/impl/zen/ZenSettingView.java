package com.ss.android.lark.notification.setting.impl.zen;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.dto.C48444c;
import com.ss.android.lark.notification.setting.impl.zen.C48675a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ZenSettingView implements C48675a.AbstractC48678b {

    /* renamed from: a */
    public final SparseArray<ValueAnimator> f122374a = new SparseArray<>(5);

    /* renamed from: b */
    public final SparseBooleanArray f122375b = new SparseBooleanArray(5);

    /* renamed from: c */
    public final AbstractC48673b f122376c;

    /* renamed from: d */
    public C48675a.AbstractC48678b.AbstractC48679a f122377d;

    /* renamed from: e */
    private final WeakReference<Activity> f122378e;

    /* renamed from: f */
    private final Context f122379f;

    /* renamed from: g */
    private ZenSettingAdapter f122380g;
    @BindView(7980)
    TextView mLeftTimeTV;
    @BindView(7337)
    RecyclerView mSelectorRV;
    @BindView(7737)
    CommonTitleBar mTitleBar;
    @BindView(7782)
    View mTurnOffBT;
    @BindView(6905)
    Group mTurnOffGroup;
    @BindView(7781)
    ImageView mTurnOffLoadingView;

    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.ZenSettingView$a */
    public interface AbstractC48672a {
        /* renamed from: a */
        void mo169878a(C48674c cVar, int i);
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.ZenSettingView$b */
    public interface AbstractC48673b {
        /* renamed from: a */
        void mo169886a();

        /* renamed from: a */
        void mo169887a(C48675a.AbstractC48678b bVar);
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b
    /* renamed from: a */
    public void mo169866a() {
        AbstractC48673b bVar = this.f122376c;
        if (bVar != null) {
            bVar.mo169886a();
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b
    /* renamed from: c */
    public void mo169875c() {
        mo169874b(this.mTurnOffLoadingView, -100);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f122376c.mo169887a(this);
        m191820e();
    }

    public class ZenSettingAdapter extends LarkRecyclerViewBaseAdapter<ZenViewHolder, C48674c> {

        /* renamed from: a */
        public AbstractC48672a f122388a;

        public class ZenViewHolder_ViewBinding implements Unbinder {

            /* renamed from: a */
            private ZenViewHolder f122394a;

            @Override // butterknife.Unbinder
            public void unbind() {
                ZenViewHolder zenViewHolder = this.f122394a;
                if (zenViewHolder != null) {
                    this.f122394a = null;
                    zenViewHolder.leftTimeLabel = null;
                    zenViewHolder.divider = null;
                    zenViewHolder.loadingView = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }

            public ZenViewHolder_ViewBinding(ZenViewHolder zenViewHolder, View view) {
                this.f122394a = zenViewHolder;
                zenViewHolder.leftTimeLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.label, "field 'leftTimeLabel'", TextView.class);
                zenViewHolder.divider = Utils.findRequiredView(view, R.id.divider, "field 'divider'");
                zenViewHolder.loadingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.loading, "field 'loadingView'", ImageView.class);
            }
        }

        /* renamed from: a */
        public void mo169884a(AbstractC48672a aVar) {
            this.f122388a = aVar;
        }

        public ZenSettingAdapter() {
        }

        public class ZenViewHolder extends RecyclerView.ViewHolder {
            @BindView(6781)
            View divider;
            @BindView(7040)
            TextView leftTimeLabel;
            @BindView(7129)
            ImageView loadingView;

            public ZenViewHolder(View view) {
                super(view);
                ButterKnife.bind(this, view);
            }
        }

        /* renamed from: a */
        public ZenViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ZenViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_zen_setting, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(ZenViewHolder zenViewHolder, final int i) {
            final C48674c cVar = (C48674c) getItem(i);
            zenViewHolder.leftTimeLabel.setText(cVar.f122395a);
            if (i == getItemCount() - 1) {
                zenViewHolder.divider.setVisibility(8);
            } else {
                zenViewHolder.divider.setVisibility(0);
            }
            zenViewHolder.loadingView.setVisibility(8);
            if (cVar.f122397c) {
                ZenSettingView.this.mo169869a(zenViewHolder.loadingView, i);
            } else {
                ZenSettingView.this.mo169874b(zenViewHolder.loadingView, i);
            }
            zenViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.ZenSettingAdapter.View$OnClickListenerC486711 */

                public void onClick(View view) {
                    if (ZenSettingAdapter.this.f122388a != null) {
                        ZenSettingAdapter.this.f122388a.mo169878a(cVar, i);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b
    /* renamed from: b */
    public void mo169873b() {
        for (C48674c cVar : this.f122380g.getItems()) {
            cVar.f122397c = false;
        }
        this.f122380g.notifyDataSetChanged();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        for (int i = 0; i < this.f122374a.size(); i++) {
            this.f122374a.get(this.f122374a.keyAt(i)).end();
        }
    }

    /* renamed from: d */
    public void mo169876d() {
        for (int i = 0; i < this.f122380g.getItemCount(); i++) {
            ((C48674c) this.f122380g.getItem(i)).f122397c = false;
        }
        this.f122380g.notifyDataSetChanged();
        mo169869a(this.mTurnOffLoadingView, -100);
    }

    /* renamed from: e */
    private void m191820e() {
        this.mTitleBar.setTitle(R.string.Lark_Notification_Dnd);
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.View$OnClickListenerC486661 */

            public void onClick(View view) {
                ZenSettingView.this.f122376c.mo169886a();
            }
        });
        this.mTurnOffLoadingView.setVisibility(8);
        this.mSelectorRV.setLayoutManager(new LinearLayoutManager(this.f122379f, 1, false));
        if (this.f122380g == null) {
            List<C48674c> f = m191821f();
            ZenSettingAdapter zenSettingAdapter = new ZenSettingAdapter();
            this.f122380g = zenSettingAdapter;
            zenSettingAdapter.addAll(f);
        }
        this.mSelectorRV.setAdapter(this.f122380g);
        this.f122380g.mo169884a(new AbstractC48672a() {
            /* class com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.C486672 */

            @Override // com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.AbstractC48672a
            /* renamed from: a */
            public void mo169878a(C48674c cVar, int i) {
                ZenSettingView.this.mo169867a(i);
                if (ZenSettingView.this.f122377d != null) {
                    ZenSettingView.this.f122377d.mo169897a(cVar.f122396b, cVar.f122395a);
                }
            }
        });
        this.mTurnOffGroup.setVisibility(8);
        this.mTurnOffBT.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.View$OnClickListenerC486683 */

            public void onClick(View view) {
                ZenSettingView.this.mo169876d();
                if (ZenSettingView.this.f122377d != null) {
                    ZenSettingView.this.f122377d.mo169896a();
                }
            }
        });
    }

    /* renamed from: f */
    private List<C48674c> m191821f() {
        ArrayList arrayList = new ArrayList();
        C48674c cVar = new C48674c("30 " + UIHelper.getString(R.string.Lark_Notification_DndTimeMinutes), 1800000);
        C48674c cVar2 = new C48674c("1 " + UIHelper.getString(R.string.Lark_Notification_DndTimeHour), 3600000);
        C48674c cVar3 = new C48674c("2 " + UIHelper.getString(R.string.Lark_Notification_DndTimeHours), 7200000);
        C48674c cVar4 = new C48674c("4 " + UIHelper.getString(R.string.Lark_Notification_DndTimeHours), 14400000);
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        return arrayList;
    }

    /* renamed from: a */
    public void setViewDelegate(C48675a.AbstractC48678b.AbstractC48679a aVar) {
        this.f122377d = aVar;
    }

    /* renamed from: a */
    public void mo169867a(int i) {
        for (int i2 = 0; i2 < this.f122380g.getItemCount(); i2++) {
            if (i == i2) {
                ((C48674c) this.f122380g.getItem(i2)).f122397c = true;
            } else {
                ((C48674c) this.f122380g.getItem(i2)).f122397c = false;
            }
        }
        this.f122380g.notifyDataSetChanged();
        mo169874b(this.mTurnOffLoadingView, -100);
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b
    /* renamed from: a */
    public void mo169868a(DialogInterface.OnClickListener onClickListener) {
        Activity activity = this.f122378e.get();
        if (activity == null) {
            Log.m165383e("ZenSettingView", "activity instance is not existed");
        } else {
            new C25639g(activity).mo89237b(UIHelper.getString(R.string.Lark_Notification_DndFirstTimeTipsTitle)).mo89238b(true).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Notification_DndFirstTimeTips)).mo89253l(8388611).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Notification_DndFirstTimeTipsButton), onClickListener).mo89233b().show();
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b
    /* renamed from: a */
    public void mo169870a(C48444c cVar) {
        int i;
        String str;
        String str2;
        Group group = this.mTurnOffGroup;
        if (cVar.f121911b) {
            i = 0;
        } else {
            i = 8;
        }
        group.setVisibility(i);
        long j = cVar.f121912c + 60000;
        long j2 = (j % 86400000) / 3600000;
        long j3 = (j % 3600000) / 60000;
        int i2 = (j2 > 1 ? 1 : (j2 == 1 ? 0 : -1));
        if (i2 < 0) {
            str = "";
        } else if (i2 == 0) {
            str = j2 + " " + UIHelper.getString(R.string.Lark_Notification_DndTimeHour);
        } else {
            str = j2 + " " + UIHelper.getString(R.string.Lark_Notification_DndTimeHours);
        }
        int i3 = (j3 > 1 ? 1 : (j3 == 1 ? 0 : -1));
        if (i3 < 0) {
            str2 = "";
        } else if (i3 == 0) {
            str2 = j3 + " " + UIHelper.getString(R.string.Lark_Notification_DndTimeMinute);
        } else {
            str2 = j3 + " " + UIHelper.getString(R.string.Lark_Notification_DndTimeMinutes);
        }
        String str3 = str + " " + str2;
        if (!"".equals(str3.trim())) {
            StringBuilder sb = new StringBuilder(UIHelper.getString(R.string.Lark_Notification_DndNotificationPausedLeft));
            sb.append(" ");
            sb.append(str3);
            this.mLeftTimeTV.setText(sb);
        }
    }

    @Override // com.ss.android.lark.notification.setting.impl.zen.C48675a.AbstractC48678b
    /* renamed from: a */
    public void mo169872a(String str) {
        Activity activity = this.f122378e.get();
        if (activity == null) {
            Log.m165383e("ZenSettingView", "activity instance is not existed");
        } else {
            LKUIToast.show(activity, str);
        }
    }

    /* renamed from: a */
    public void mo169869a(final View view, final int i) {
        this.f122375b.put(i, true);
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.RunnableC486694 */

            public void run() {
                if (ZenSettingView.this.f122375b.get(i)) {
                    view.setVisibility(0);
                    ValueAnimator valueAnimator = ZenSettingView.this.f122374a.get(i);
                    if (valueAnimator == null) {
                        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(1000L);
                        duration.setRepeatCount(-1);
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.ss.android.lark.notification.setting.impl.zen.ZenSettingView.RunnableC486694.C486701 */

                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                view.setRotation(valueAnimator.getAnimatedFraction() * 360.0f);
                            }
                        });
                        ZenSettingView.this.f122374a.put(i, duration);
                        duration.start();
                        return;
                    }
                    valueAnimator.resume();
                }
            }
        }, 500);
    }

    public ZenSettingView(Activity activity, AbstractC48673b bVar) {
        this.f122379f = activity.getApplicationContext();
        this.f122378e = new WeakReference<>(activity);
        this.f122376c = bVar;
    }

    /* renamed from: b */
    public void mo169874b(View view, int i) {
        this.f122375b.put(i, false);
        view.setVisibility(8);
        ValueAnimator valueAnimator = this.f122374a.get(i);
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.ZenSettingView$c */
    public class C48674c {

        /* renamed from: a */
        public String f122395a;

        /* renamed from: b */
        public long f122396b;

        /* renamed from: c */
        public boolean f122397c;

        public C48674c(String str, long j) {
            this.f122395a = str;
            this.f122396b = j;
        }
    }
}
