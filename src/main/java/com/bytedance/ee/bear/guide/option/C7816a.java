package com.bytedance.ee.bear.guide.option;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.guide.option.C7816a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.guide.option.a */
public class C7816a extends RecyclerView.Adapter<C7818b> {

    /* renamed from: a */
    private List<OptionEntity> f21118a = new ArrayList();

    /* renamed from: b */
    private AbstractC7817a f21119b;

    /* renamed from: c */
    private String f21120c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.guide.option.a$a */
    public interface AbstractC7817a {
        void onSelectItem(String str, boolean z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f21118a.size();
    }

    /* renamed from: a */
    public void mo30585a(AbstractC7817a aVar) {
        this.f21119b = aVar;
    }

    /* renamed from: a */
    public void mo30587a(String str) {
        this.f21120c = str;
    }

    /* renamed from: a */
    public void mo30588a(List<OptionEntity> list) {
        this.f21118a = list;
    }

    /* renamed from: a */
    private void m31336a(OptionEntity optionEntity) {
        if (!TextUtils.isEmpty(this.f21120c)) {
            if (TextUtils.equals(optionEntity.getKey(), this.f21120c)) {
                for (int i = 0; i < this.f21118a.size(); i++) {
                    OptionEntity optionEntity2 = this.f21118a.get(i);
                    if (!TextUtils.equals(optionEntity2.getKey(), this.f21120c) && optionEntity2.isChecked()) {
                        optionEntity2.setChecked(false);
                        notifyItemChanged(i);
                        AbstractC7817a aVar = this.f21119b;
                        if (aVar != null) {
                            aVar.onSelectItem(optionEntity2.getKey(), false);
                        }
                    }
                }
                return;
            }
            for (int size = this.f21118a.size() - 1; size >= 0; size--) {
                OptionEntity optionEntity3 = this.f21118a.get(size);
                if (TextUtils.equals(optionEntity3.getKey(), this.f21120c) && optionEntity3.isChecked()) {
                    optionEntity3.setChecked(false);
                    notifyItemChanged(size);
                    AbstractC7817a aVar2 = this.f21119b;
                    if (aVar2 != null) {
                        aVar2.onSelectItem(optionEntity3.getKey(), false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public C7818b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7818b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.option_rv_item, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.guide.option.a$b */
    public class C7818b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        UDCheckBox f21121a;

        /* renamed from: b */
        BearLottieView f21122b;

        /* renamed from: c */
        TextView f21123c;

        C7818b(View view) {
            super(view);
            this.f21121a = (UDCheckBox) view.findViewById(R.id.option_check_box);
            this.f21122b = (BearLottieView) view.findViewById(R.id.option_icon);
            this.f21123c = (TextView) view.findViewById(R.id.option_title);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C7818b bVar, int i) {
        OptionEntity optionEntity = this.f21118a.get(i);
        bVar.f21123c.setText(bVar.itemView.getResources().getString(optionEntity.getTitleRes()));
        bVar.f21121a.setChecked(optionEntity.isChecked());
        String lottieFileName = optionEntity.getLottieFileName();
        if (lottieFileName != null) {
            bVar.f21122b.setVisibility(0);
            bVar.f21122b.setAnimation(lottieFileName);
        } else {
            bVar.f21122b.setVisibility(8);
        }
        bVar.itemView.setOnClickListener(new View.OnClickListener(bVar, optionEntity) {
            /* class com.bytedance.ee.bear.guide.option.$$Lambda$a$jENQzydC4tZYlABwnttnzAo06l8 */
            public final /* synthetic */ C7816a.C7818b f$1;
            public final /* synthetic */ OptionEntity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C7816a.this.m31337a(this.f$1, this.f$2, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m31337a(C7818b bVar, OptionEntity optionEntity, View view) {
        boolean z = !bVar.f21121a.isChecked();
        optionEntity.setChecked(z);
        bVar.f21121a.setChecked(z);
        AbstractC7817a aVar = this.f21119b;
        if (aVar != null) {
            aVar.onSelectItem(optionEntity.getKey(), z);
        }
        if (bVar.f21122b.getVisibility() == 0) {
            if (z) {
                bVar.f21122b.playAnimation();
            } else {
                bVar.f21122b.cancelAnimation();
                bVar.f21122b.setProgress(BitmapDescriptorFactory.HUE_RED);
            }
        }
        m31336a(optionEntity);
    }
}
