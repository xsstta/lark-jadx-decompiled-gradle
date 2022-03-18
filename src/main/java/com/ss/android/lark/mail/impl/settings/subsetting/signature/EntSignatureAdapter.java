package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureAdapter;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class EntSignatureAdapter extends LarkRecyclerViewBaseAdapter<EntSignatureItemViewHolder, EntSignatureUsage> {

    /* renamed from: a */
    private Context f110540a;

    /* renamed from: b */
    private AbstractC43551a f110541b;

    /* renamed from: c */
    private boolean f110542c;

    /* renamed from: d */
    private boolean[] f110543d;

    /* renamed from: e */
    private ArrayList<MailEntSignature> f110544e;

    /* renamed from: f */
    private HashMap<String, MailEntSignature> f110545f;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureAdapter$a */
    public interface AbstractC43551a {
        void onSelectSignature(boolean z, boolean z2, String str, String str2, String str3);
    }

    /* renamed from: a */
    public ArrayList<MailEntSignature> mo155501a() {
        return this.f110544e;
    }

    public static class EntSignatureItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        String f110546a = "";

        /* renamed from: b */
        String f110547b = "0";

        /* renamed from: c */
        String f110548c = "0";
        @BindView(8761)
        ImageView mAddressIv;
        @BindView(8762)
        RelativeLayout mAddressRl;
        @BindView(8763)
        TextView mAddressTv;
        @BindView(8764)
        View mBottomDivider;
        @BindView(8765)
        ConstraintLayout mContentCl;
        @BindView(8767)
        Guideline mLeftGuideline;
        @BindView(8769)
        ImageView mNewArrowIv;
        @BindView(8770)
        TextView mNewNameTv;
        @BindView(8771)
        RelativeLayout mNewRl;
        @BindView(8773)
        ImageView mReplyArrowIv;
        @BindView(8774)
        TextView mReplyNameTv;
        @BindView(8775)
        RelativeLayout mReplyRl;
        @BindView(8777)
        View mTopDivider;

        /* renamed from: b */
        public void mo155509b() {
            this.mReplyArrowIv.setVisibility(8);
            this.mReplyRl.setClickable(false);
            this.mNewArrowIv.setVisibility(8);
            this.mNewRl.setClickable(false);
        }

        /* renamed from: a */
        public void mo155507a() {
            this.mAddressRl.setVisibility(8);
            int a = C13749l.m55738a(16);
            this.mContentCl.setVisibility(0);
            this.mNewRl.setPadding(a, 0, a, 0);
            this.mReplyRl.setPadding(a, 0, a, 0);
            AbsSettingItemViewModel.m172345a(this.mNewRl, AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE);
            AbsSettingItemViewModel.m172345a(this.mReplyRl, AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE);
            this.mLeftGuideline.setGuidelineBegin(a);
            this.mBottomDivider.setVisibility(4);
        }

        public EntSignatureItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        /* renamed from: a */
        public void mo155508a(boolean z) {
            int i;
            float f;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            ViewPropertyAnimator animate = this.mAddressIv.animate();
            if (z) {
                f = 90.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            animate.rotation(f).start();
            this.mContentCl.setVisibility(i);
        }

        /* renamed from: b */
        public void mo155510b(boolean z) {
            int i;
            float f;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            ImageView imageView = this.mAddressIv;
            if (z) {
                f = 90.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            imageView.setRotation(f);
            this.mTopDivider.setVisibility(0);
            this.mBottomDivider.setVisibility(0);
            this.mContentCl.setVisibility(i);
        }
    }

    public class EntSignatureItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private EntSignatureItemViewHolder f110549a;

        @Override // butterknife.Unbinder
        public void unbind() {
            EntSignatureItemViewHolder entSignatureItemViewHolder = this.f110549a;
            if (entSignatureItemViewHolder != null) {
                this.f110549a = null;
                entSignatureItemViewHolder.mContentCl = null;
                entSignatureItemViewHolder.mAddressRl = null;
                entSignatureItemViewHolder.mAddressTv = null;
                entSignatureItemViewHolder.mAddressIv = null;
                entSignatureItemViewHolder.mNewRl = null;
                entSignatureItemViewHolder.mNewArrowIv = null;
                entSignatureItemViewHolder.mNewNameTv = null;
                entSignatureItemViewHolder.mReplyRl = null;
                entSignatureItemViewHolder.mReplyArrowIv = null;
                entSignatureItemViewHolder.mReplyNameTv = null;
                entSignatureItemViewHolder.mLeftGuideline = null;
                entSignatureItemViewHolder.mTopDivider = null;
                entSignatureItemViewHolder.mBottomDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public EntSignatureItemViewHolder_ViewBinding(EntSignatureItemViewHolder entSignatureItemViewHolder, View view) {
            this.f110549a = entSignatureItemViewHolder;
            entSignatureItemViewHolder.mContentCl = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_content_layout, "field 'mContentCl'", ConstraintLayout.class);
            entSignatureItemViewHolder.mAddressRl = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_address_rl, "field 'mAddressRl'", RelativeLayout.class);
            entSignatureItemViewHolder.mAddressTv = (TextView) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_address_tv, "field 'mAddressTv'", TextView.class);
            entSignatureItemViewHolder.mAddressIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_address_icon, "field 'mAddressIv'", ImageView.class);
            entSignatureItemViewHolder.mNewRl = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_new_rl, "field 'mNewRl'", RelativeLayout.class);
            entSignatureItemViewHolder.mNewArrowIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_new_arrow, "field 'mNewArrowIv'", ImageView.class);
            entSignatureItemViewHolder.mNewNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_new_name, "field 'mNewNameTv'", TextView.class);
            entSignatureItemViewHolder.mReplyRl = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_reply_rl, "field 'mReplyRl'", RelativeLayout.class);
            entSignatureItemViewHolder.mReplyArrowIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_reply_arrow, "field 'mReplyArrowIv'", ImageView.class);
            entSignatureItemViewHolder.mReplyNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_reply_name, "field 'mReplyNameTv'", TextView.class);
            entSignatureItemViewHolder.mLeftGuideline = (Guideline) Utils.findRequiredViewAsType(view, R.id.ent_signature_item_left_guideline, "field 'mLeftGuideline'", Guideline.class);
            entSignatureItemViewHolder.mTopDivider = Utils.findRequiredView(view, R.id.ent_signature_item_top_divider, "field 'mTopDivider'");
            entSignatureItemViewHolder.mBottomDivider = Utils.findRequiredView(view, R.id.ent_signature_item_bottom_divider, "field 'mBottomDivider'");
        }
    }

    /* renamed from: a */
    public void mo155503a(AbstractC43551a aVar) {
        this.f110541b = aVar;
    }

    /* renamed from: a */
    public void mo155504a(ArrayList<MailEntSignature> arrayList) {
        this.f110544e = arrayList;
    }

    @Override // com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public void resetAll(Collection<? extends EntSignatureUsage> collection) {
        this.f110543d = new boolean[collection.size()];
        super.resetAll(collection);
    }

    /* renamed from: a */
    public String mo155500a(String str) {
        MailEntSignature mailEntSignature;
        if (!CollectionUtils.isNotEmpty(this.f110545f) || (mailEntSignature = this.f110545f.get(str)) == null || mailEntSignature.mo151386b() == null) {
            return C43819s.m173684a((int) R.string.Mail_BusinessSignature_NoUse);
        }
        return mailEntSignature.mo151386b();
    }

    /* renamed from: a */
    public void mo155505a(HashMap<String, MailEntSignature> hashMap) {
        this.f110545f = hashMap;
    }

    /* renamed from: a */
    public void mo155506a(boolean z) {
        this.f110542c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m172891a(EntSignatureItemViewHolder entSignatureItemViewHolder, View view) {
        AbstractC43551a aVar = this.f110541b;
        if (aVar != null) {
            aVar.onSelectSignature(this.f110542c, false, entSignatureItemViewHolder.f110546a, entSignatureItemViewHolder.f110547b, entSignatureItemViewHolder.f110548c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m172892b(EntSignatureItemViewHolder entSignatureItemViewHolder, View view) {
        AbstractC43551a aVar = this.f110541b;
        if (aVar != null) {
            aVar.onSelectSignature(this.f110542c, true, entSignatureItemViewHolder.f110546a, entSignatureItemViewHolder.f110548c, entSignatureItemViewHolder.f110547b);
        }
    }

    /* renamed from: a */
    public EntSignatureItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ArrayList<MailEntSignature> arrayList;
        Context context = viewGroup.getContext();
        this.f110540a = context;
        EntSignatureItemViewHolder entSignatureItemViewHolder = new EntSignatureItemViewHolder(LayoutInflater.from(context).inflate(R.layout.mail_setting_ent_signature_item, viewGroup, false));
        if (!this.f110542c || ((arrayList = this.f110544e) != null && arrayList.size() >= 2)) {
            entSignatureItemViewHolder.mNewRl.setOnClickListener(new View.OnClickListener(entSignatureItemViewHolder) {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureAdapter$Rhv1E5UpDIeXqk3a0C3QvTu6w2g */
                public final /* synthetic */ EntSignatureAdapter.EntSignatureItemViewHolder f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    EntSignatureAdapter.lambda$Rhv1E5UpDIeXqk3a0C3QvTu6w2g(EntSignatureAdapter.this, this.f$1, view);
                }
            });
            entSignatureItemViewHolder.mReplyRl.setOnClickListener(new View.OnClickListener(entSignatureItemViewHolder) {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureAdapter$cmDXX1Y5psonEgMwDqTpF4QqWdQ */
                public final /* synthetic */ EntSignatureAdapter.EntSignatureItemViewHolder f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    EntSignatureAdapter.lambda$cmDXX1Y5psonEgMwDqTpF4QqWdQ(EntSignatureAdapter.this, this.f$1, view);
                }
            });
        } else {
            entSignatureItemViewHolder.mo155509b();
        }
        return entSignatureItemViewHolder;
    }

    /* renamed from: a */
    public void onBindViewHolder(EntSignatureItemViewHolder entSignatureItemViewHolder, int i) {
        AbsSettingItemViewModel.ItemBackgroundType itemBackgroundType;
        EntSignatureUsage entSignatureUsage = (EntSignatureUsage) getItem(i);
        entSignatureItemViewHolder.mo155510b(this.f110543d[i]);
        entSignatureItemViewHolder.f110546a = entSignatureUsage.getAddress();
        entSignatureItemViewHolder.f110547b = entSignatureUsage.getNewMailSignatureId();
        entSignatureItemViewHolder.f110548c = entSignatureUsage.getReplyMailSignatureId();
        entSignatureItemViewHolder.mAddressTv.setText(entSignatureItemViewHolder.f110546a);
        entSignatureItemViewHolder.mNewNameTv.setText(mo155500a(entSignatureItemViewHolder.f110547b));
        entSignatureItemViewHolder.mReplyNameTv.setText(mo155500a(entSignatureItemViewHolder.f110548c));
        if (this.items.size() == 1) {
            entSignatureItemViewHolder.mo155507a();
            itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.CIRCLE;
        } else {
            if (i == 0) {
                itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE;
            } else if (i == this.items.size() - 1) {
                if (this.f110543d[i]) {
                    entSignatureItemViewHolder.mBottomDivider.setVisibility(4);
                } else {
                    entSignatureItemViewHolder.mTopDivider.setVisibility(4);
                }
                itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE;
            } else {
                itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.SQUARE;
            }
            entSignatureItemViewHolder.mAddressRl.setOnClickListener(new View.OnClickListener(i, entSignatureItemViewHolder) {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$EntSignatureAdapter$6hZS1OLZJ3gYOpANYYYctxvo2Hw */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ EntSignatureAdapter.EntSignatureItemViewHolder f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    EntSignatureAdapter.lambda$6hZS1OLZJ3gYOpANYYYctxvo2Hw(EntSignatureAdapter.this, this.f$1, this.f$2, view);
                }
            });
        }
        AbsSettingItemViewModel.m172345a(entSignatureItemViewHolder.itemView, itemBackgroundType);
        AbsSettingItemViewModel.m172345a(entSignatureItemViewHolder.mAddressRl, itemBackgroundType);
        if (i == this.items.size() - 1 && this.f110543d[i]) {
            AbsSettingItemViewModel.m172345a(entSignatureItemViewHolder.mAddressRl, AbsSettingItemViewModel.ItemBackgroundType.SQUARE);
            AbsSettingItemViewModel.m172345a(entSignatureItemViewHolder.mReplyRl, AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m172890a(int i, EntSignatureItemViewHolder entSignatureItemViewHolder, View view) {
        int i2;
        AbsSettingItemViewModel.ItemBackgroundType itemBackgroundType;
        boolean[] zArr = this.f110543d;
        zArr[i] = !zArr[i];
        entSignatureItemViewHolder.mo155508a(zArr[i]);
        if (i == this.items.size() - 1) {
            View view2 = entSignatureItemViewHolder.mTopDivider;
            if (this.f110543d[i]) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view2.setVisibility(i2);
            entSignatureItemViewHolder.mBottomDivider.setVisibility(4);
            RelativeLayout relativeLayout = entSignatureItemViewHolder.mAddressRl;
            if (this.f110543d[i]) {
                itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.SQUARE;
            } else {
                itemBackgroundType = AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE;
            }
            AbsSettingItemViewModel.m172345a(relativeLayout, itemBackgroundType);
            AbsSettingItemViewModel.m172345a(entSignatureItemViewHolder.mReplyRl, AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE);
        }
    }
}
