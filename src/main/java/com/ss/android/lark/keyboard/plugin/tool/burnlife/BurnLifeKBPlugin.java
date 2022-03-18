package com.ss.android.lark.keyboard.plugin.tool.burnlife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnTimeItem;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnTimeSettingAdapter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0005H\u0016J\u000e\u00102\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003J\u0014\u00103\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u0015H\u0016J\b\u00107\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/BurnLifeKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "mBurnLife", "", "isGroup", "", "mDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/IBurnLifeDependency;", "(IZLcom/ss/android/lark/keyboard/plugin/tool/burnlife/IBurnLifeDependency;)V", "mBurnTimeDialog", "Landroid/app/Dialog;", "mBurnTimeItems", "", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/BurnTimeItem;", "mBurnTimeRv", "Landroidx/recyclerview/widget/RecyclerView;", "mBurnTimeSettingAdapter", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/BurnTimeSettingAdapter;", "mBurnTimeSettingView", "Landroid/view/View;", "mContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mIcon", "Landroid/widget/ImageView;", "mIsDarkStyle", "createIcon", "getBurnTimeSettingDialog", "initBurnLifeSetting", "", "burnLife", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onVisibleChanged", "isVisible", "setBurnLife", "setBurnLifeItems", "burnTimeItems", "setKeyBoardContext", "context", "showBurnLifeDialog", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.burnlife.a */
public final class BurnLifeKBPlugin implements IKeyBoardPlugin {

    /* renamed from: a */
    public ImageView f103774a;

    /* renamed from: b */
    public View f103775b;

    /* renamed from: c */
    public BurnTimeSettingAdapter f103776c;

    /* renamed from: d */
    public Dialog f103777d;

    /* renamed from: e */
    public IKeyBoardPlugin.IKeyBoardContext f103778e;

    /* renamed from: f */
    public int f103779f;

    /* renamed from: g */
    public boolean f103780g;

    /* renamed from: h */
    public final IBurnLifeDependency f103781h;

    /* renamed from: i */
    private final boolean f103782i = true;

    /* renamed from: j */
    private RecyclerView f103783j;

    /* renamed from: k */
    private List<BurnTimeItem> f103784k;

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    /* renamed from: b */
    private final View m161628b() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103778e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_voice, R.drawable.ud_icon_burnlife_minute_outlined);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…burnlife_minute_outlined)");
        return a;
    }

    /* renamed from: a */
    public final void mo147410a() {
        if (this.f103777d == null) {
            this.f103777d = m161631c();
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103778e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        Activity B = bVar.mo147365B();
        Dialog dialog = this.f103777d;
        if (dialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeDialog");
        }
        C57810a.m224336a(B, dialog);
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103778e;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        bVar2.mo147380y();
    }

    /* renamed from: c */
    private final Dialog m161631c() {
        if (this.f103775b == null) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f103778e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            View inflate = LayoutInflater.from(bVar.mo147365B()).inflate(R.layout.kb_burn_time_setting_layout, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…ime_setting_layout, null)");
            this.f103775b = inflate;
            if (inflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingView");
            }
            View findViewById = inflate.findViewById(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mBurnTimeSettingView.fin…ewById(R.id.recyclerView)");
            this.f103783j = (RecyclerView) findViewById;
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103778e;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            this.f103776c = new BurnTimeSettingAdapter(bVar2.mo147365B());
            RecyclerView recyclerView = this.f103783j;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeRv");
            }
            IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f103778e;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(bVar3.mo147365B(), 1, false));
            RecyclerView recyclerView2 = this.f103783j;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeRv");
            }
            BurnTimeSettingAdapter burnTimeSettingAdapter = this.f103776c;
            if (burnTimeSettingAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
            }
            recyclerView2.setAdapter(burnTimeSettingAdapter);
            List<BurnTimeItem> list = this.f103784k;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeItems");
            }
            if (CollectionUtils.isNotEmpty(list)) {
                BurnTimeSettingAdapter burnTimeSettingAdapter2 = this.f103776c;
                if (burnTimeSettingAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
                }
                List<BurnTimeItem> list2 = this.f103784k;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeItems");
                }
                burnTimeSettingAdapter2.resetAll(list2);
            }
        }
        IKeyBoardPlugin.IKeyBoardContext bVar4 = this.f103778e;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        Activity B = bVar4.mo147365B();
        View view = this.f103775b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingView");
        }
        Dialog a = C57811b.m224341a(B, view);
        BurnTimeSettingAdapter burnTimeSettingAdapter3 = this.f103776c;
        if (burnTimeSettingAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
        }
        burnTimeSettingAdapter3.mo147407a(new C40816a(this, a));
        Intrinsics.checkExpressionValueIsNotNull(a, "dialog");
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext m161627a(BurnLifeKBPlugin aVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar = aVar.f103778e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m161629b(BurnLifeKBPlugin aVar) {
        ImageView imageView = aVar.f103774a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return imageView;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103778e = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.burnlife.a$b */
    static final class View$OnClickListenerC40817b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BurnLifeKBPlugin f103787a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f103788b;

        View$OnClickListenerC40817b(BurnLifeKBPlugin aVar, IKeyBoardPlugin.ITouchActionNotifier dVar) {
            this.f103787a = aVar;
            this.f103788b = dVar;
        }

        public final void onClick(View view) {
            HitPointHelper.f103322b.mo146883b(this.f103787a.f103780g);
            BurnLifeKBPlugin.m161627a(this.f103787a).mo147380y();
            BurnLifeKBPlugin.m161627a(this.f103787a).mo147376k();
            this.f103787a.mo147410a();
            this.f103788b.mo147314b(this.f103787a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "item", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/BurnTimeItem;", "kotlin.jvm.PlatformType", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.burnlife.a$a */
    public static final class C40816a implements BurnTimeSettingAdapter.AbstractC40815a {

        /* renamed from: a */
        final /* synthetic */ BurnLifeKBPlugin f103785a;

        /* renamed from: b */
        final /* synthetic */ Dialog f103786b;

        C40816a(BurnLifeKBPlugin aVar, Dialog dialog) {
            this.f103785a = aVar;
            this.f103786b = dialog;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnTimeSettingAdapter.AbstractC40815a
        /* renamed from: a */
        public final void mo147409a(BurnTimeItem burnTimeItem) {
            Intrinsics.checkExpressionValueIsNotNull(burnTimeItem, "item");
            if (burnTimeItem.mo147403f() == BurnTimeItem.Type.CANCEL) {
                this.f103786b.dismiss();
                return;
            }
            HitPointHelper.f103322b.mo146879a(this.f103785a.f103780g, this.f103785a.f103779f, burnTimeItem.mo147399b());
            this.f103785a.f103779f = burnTimeItem.mo147399b();
            BurnLifeKBPlugin.m161629b(this.f103785a).setImageResource(burnTimeItem.mo147400c());
            BurnLifeKBPlugin.m161629b(this.f103785a).setActivated(burnTimeItem.mo147402e());
            this.f103785a.f103781h.mo123963a(burnTimeItem.mo147399b(), this.f103785a.f103779f);
            this.f103786b.dismiss();
        }
    }

    /* renamed from: b */
    private final void m161630b(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Lark_Legacy_BurnLife1minAfterRead);
        boolean z5 = this.f103782i;
        if (i == 60) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new BurnTimeItem(string, 60, R.drawable.ud_icon_burnlife_minute_outlined, z5, z, BurnTimeItem.Type.BURN_TIME));
        String string2 = UIHelper.getString(R.string.Lark_Legacy_BurnLife1hAfterRead);
        boolean z6 = this.f103782i;
        if (i == 3600) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList.add(new BurnTimeItem(string2, 3600, R.drawable.ud_icon_burnlife_hour_outlined, z6, z2, BurnTimeItem.Type.BURN_TIME));
        String string3 = UIHelper.getString(R.string.Lark_Legacy_BurnLife1dAfterRead);
        boolean z7 = this.f103782i;
        if (i == 86400) {
            z3 = true;
        } else {
            z3 = false;
        }
        arrayList.add(new BurnTimeItem(string3, 86400, R.drawable.ud_icon_burnlife_day_outlined, z7, z3, BurnTimeItem.Type.BURN_TIME));
        String string4 = UIHelper.getString(R.string.Lark_Legacy_BurnLife1wAfterBurnString);
        boolean z8 = this.f103782i;
        if (i == 604800) {
            z4 = true;
        } else {
            z4 = false;
        }
        arrayList.add(new BurnTimeItem(string4, 604800, R.drawable.ud_icon_burnlife_week_outlined, z8, z4, BurnTimeItem.Type.BURN_TIME));
        mo147412a(arrayList);
        mo147411a(i);
    }

    /* renamed from: a */
    public final void mo147411a(int i) {
        this.f103779f = i;
        if (this.f103776c != null) {
            BurnTimeSettingAdapter burnTimeSettingAdapter = this.f103776c;
            if (burnTimeSettingAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
            }
            List items = burnTimeSettingAdapter.getItems();
            Intrinsics.checkExpressionValueIsNotNull(items, "burnTimeItems");
            int size = items.size();
            int i2 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                BurnTimeItem burnTimeItem = (BurnTimeItem) items.get(i3);
                Intrinsics.checkExpressionValueIsNotNull(burnTimeItem, "burnTimeItem");
                if (burnTimeItem.mo147399b() == i) {
                    this.f103779f = i;
                    burnTimeItem.mo147398a(true);
                    BurnTimeSettingAdapter burnTimeSettingAdapter2 = this.f103776c;
                    if (burnTimeSettingAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
                    }
                    burnTimeSettingAdapter2.notifyItemChanged(i3);
                    ImageView imageView = this.f103774a;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                    }
                    imageView.setImageResource(burnTimeItem.mo147400c());
                    ImageView imageView2 = this.f103774a;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                    }
                    imageView2.setActivated(burnTimeItem.mo147402e());
                } else if (burnTimeItem.mo147401d()) {
                    i2 = i3;
                }
            }
            if (i2 != -1) {
                Object obj = items.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj, "burnTimeItems[originalSelectedItem]");
                ((BurnTimeItem) obj).mo147398a(false);
                BurnTimeSettingAdapter burnTimeSettingAdapter3 = this.f103776c;
                if (burnTimeSettingAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
                }
                burnTimeSettingAdapter3.notifyItemChanged(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo147412a(List<BurnTimeItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "burnTimeItems");
        if (!CollectionUtils.isEmpty(list)) {
            this.f103784k = list;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeItems");
            }
            list.add(list.size(), new BurnTimeItem(UIHelper.getString(R.string.Lark_Legacy_CancelInSetting), -2, -1, false, this.f103782i, BurnTimeItem.Type.CANCEL));
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f103778e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            BurnTimeSettingAdapter burnTimeSettingAdapter = new BurnTimeSettingAdapter(bVar.mo147365B());
            this.f103776c = burnTimeSettingAdapter;
            if (burnTimeSettingAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeSettingAdapter");
            }
            List<BurnTimeItem> list2 = this.f103784k;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBurnTimeItems");
            }
            burnTimeSettingAdapter.resetAll(list2);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        ImageView imageView = this.f103774a;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        imageView.setEnabled(z);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View b = m161628b();
        if (b != null) {
            ImageView imageView = (ImageView) b;
            this.f103774a = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            }
            imageView.setOnClickListener(new View$OnClickListenerC40817b(this, dVar));
            m161630b(this.f103779f);
            ImageView imageView2 = this.f103774a;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            }
            return imageView2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IKeyBoardPlugin.C40806a.m161552a(this, i, intent);
    }

    public BurnLifeKBPlugin(int i, boolean z, IBurnLifeDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f103779f = i;
        this.f103780g = z;
        this.f103781h = bVar;
    }
}
