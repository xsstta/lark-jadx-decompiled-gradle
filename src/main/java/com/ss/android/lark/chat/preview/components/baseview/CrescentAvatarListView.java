package com.ss.android.lark.chat.preview.components.baseview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38823a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public class CrescentAvatarListView extends LinearLayout {

    /* renamed from: c */
    public static final int f88140c = UIHelper.dp2px(24.0f);

    /* renamed from: a */
    public int f88141a = 24;

    /* renamed from: b */
    public int f88142b = 22;

    /* renamed from: d */
    public TextView f88143d;

    /* renamed from: e */
    public LKUIRoundedImageView f88144e;

    /* renamed from: f */
    public RecyclerView f88145f;

    /* renamed from: g */
    private int f88146g = 5;

    /* renamed from: h */
    private int f88147h = 5;

    /* renamed from: i */
    private int f88148i = 5;

    /* renamed from: a */
    public boolean mo126275a() {
        return true;
    }

    public TextView getParticipantsNumbView() {
        return this.f88143d;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.preview.components.baseview.CrescentAvatarListView$a */
    public class C34093a extends RecyclerView.Adapter<C34094a> {

        /* renamed from: b */
        private List<ChattersPreviewProperty.ChatterInfo> f88150b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f88150b.size();
        }

        /* renamed from: com.ss.android.lark.chat.preview.components.baseview.CrescentAvatarListView$a$a */
        public class C34094a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public CrescentPhotoImageView f88151a;

            public C34094a(CrescentPhotoImageView crescentPhotoImageView) {
                super(crescentPhotoImageView);
                this.f88151a = crescentPhotoImageView;
            }
        }

        public C34093a(List<ChattersPreviewProperty.ChatterInfo> list) {
            this.f88150b = list;
        }

        /* renamed from: a */
        public void onBindViewHolder(C34094a aVar, int i) {
            ChattersPreviewProperty.ChatterInfo chatterInfo = this.f88150b.get(i);
            CrescentAvatarListView crescentAvatarListView = CrescentAvatarListView.this;
            crescentAvatarListView.mo126274a(crescentAvatarListView.getContext(), aVar.f88151a, chatterInfo.getAvatarKey(), chatterInfo.getChatterId(), CrescentAvatarListView.f88140c, CrescentAvatarListView.f88140c);
        }

        /* renamed from: a */
        public C34094a onCreateViewHolder(ViewGroup viewGroup, int i) {
            CrescentPhotoImageView crescentPhotoImageView = (CrescentPhotoImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.preview_crescent_participant_photo, viewGroup, false);
            if (CrescentAvatarListView.this.mo126275a()) {
                C25649b.m91854a(crescentPhotoImageView, CrescentAvatarListView.this.f88142b, CrescentAvatarListView.this.f88141a);
            } else {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) crescentPhotoImageView.getLayoutParams();
                layoutParams.width = UIHelper.dp2px((float) CrescentAvatarListView.this.f88142b);
                layoutParams.height = UIHelper.dp2px((float) CrescentAvatarListView.this.f88141a);
            }
            return new C34094a(crescentPhotoImageView);
        }
    }

    public CrescentAvatarListView(Context context) {
        super(context);
        m132318a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m132318a(AttributeSet attributeSet) {
        setOrientation(0);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.crescent_avatar_list_layout, (ViewGroup) this, true);
        this.f88145f = (RecyclerView) inflate.findViewById(R.id.crescent_list_participant);
        this.f88144e = (LKUIRoundedImageView) inflate.findViewById(R.id.crescent_last_participant);
        this.f88143d = (TextView) inflate.findViewById(R.id.crescent_participant_number);
        if (attributeSet != null) {
            this.f88148i = 5;
            this.f88147h = 5;
            this.f88146g = 5;
            if (mo126275a()) {
                C25649b.m91854a(this.f88144e, 24, 24);
                return;
            }
            this.f88141a = UIHelper.dp2px(24.0f);
            this.f88142b = UIHelper.dp2px(22.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f88144e.getLayoutParams();
            layoutParams.width = this.f88141a;
            layoutParams.height = this.f88141a;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f88143d.getLayoutParams();
            layoutParams2.width = this.f88141a;
            layoutParams2.height = this.f88141a;
        }
    }

    /* renamed from: a */
    private void m132319a(List<ChattersPreviewProperty.ChatterInfo> list) {
        ChattersPreviewProperty.ChatterInfo chatterInfo;
        if (list != null) {
            if (list.size() >= 1 && (chatterInfo = list.get(list.size() - 1)) != null) {
                Context context = getContext();
                LKUIRoundedImageView lKUIRoundedImageView = this.f88144e;
                String avatarKey = chatterInfo.getAvatarKey();
                String chatterId = chatterInfo.getChatterId();
                int i = f88140c;
                mo126274a(context, lKUIRoundedImageView, avatarKey, chatterId, i, i);
            }
            this.f88145f.setVisibility(0);
            if (this.f88144e.getVisibility() == 0) {
                list = new ArrayList(list.subList(0, list.size() - 1));
            }
            this.f88145f.setAdapter(new C34093a(list));
        }
    }

    public void setData(ChattersPreviewProperty chattersPreviewProperty) {
        int i;
        List<ChattersPreviewProperty.ChatterInfo> chatterInfoList = chattersPreviewProperty.getChatterInfoList();
        if (chatterInfoList == null || chatterInfoList.size() <= 0) {
            Log.m165383e("CrescentAvatarListView", "participants null or size == 0 return");
            return;
        }
        int intValue = chattersPreviewProperty.getMaxShowCount().intValue();
        this.f88148i = intValue;
        this.f88147h = intValue;
        this.f88146g = intValue;
        int intValue2 = chattersPreviewProperty.getChatterCounts().intValue();
        Log.m165389i("CrescentAvatarListView", "setData total = " + chattersPreviewProperty.getChatterCounts() + " , max = " + chattersPreviewProperty.getMaxShowCount());
        int i2 = this.f88146g;
        if (intValue2 > i2) {
            if (intValue2 - i2 >= 100) {
                this.f88143d.setPadding(UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(9.0f));
                this.f88143d.setText("...");
            } else {
                this.f88143d.setPadding(UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED));
                TextView textView = this.f88143d;
                textView.setText("+" + (intValue2 - this.f88146g));
            }
            this.f88143d.setVisibility(0);
            this.f88144e.setVisibility(8);
            C25649b.m91854a(this.f88143d, 24, 24);
        } else {
            this.f88143d.setVisibility(8);
            this.f88144e.setVisibility(0);
            C25649b.m91854a(this.f88144e, 24, 24);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f88145f.setLayoutManager(linearLayoutManager);
        if (chatterInfoList.size() >= this.f88146g) {
            i = this.f88147h;
        } else {
            i = this.f88148i;
        }
        if (i < chatterInfoList.size()) {
            chatterInfoList = chatterInfoList.subList(0, i);
        }
        m132319a(chatterInfoList);
    }

    public CrescentAvatarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m132318a(attributeSet);
    }

    public CrescentAvatarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m132318a(attributeSet);
    }

    /* renamed from: a */
    public static GradientDrawable m132317a(Context context, int i, int i2, ImageView imageView) {
        C38823a aVar = new C38823a();
        aVar.setShape(1);
        aVar.setCornerRadius(BitmapDescriptorFactory.HUE_RED);
        aVar.setColor(UIUtils.getColor(context, R.color.lkui_N100));
        aVar.setSize(i, i2);
        return aVar;
    }

    /* renamed from: a */
    public void mo126274a(Context context, ImageView imageView, String str, String str2, int i, int i2) {
        if (DesktopUtil.m144301a(context)) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
        }
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
        ImageLoader.with(context).load(build).placeholder(m132317a(context, i, i2, imageView)).override(i, i2).into(imageView);
    }
}
