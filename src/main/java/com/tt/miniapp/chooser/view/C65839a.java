package com.tt.miniapp.chooser.view;

import android.content.ContentUris;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.tt.miniapp.chooser.p3267a.C65830d;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67045l;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.p3255a.C65678c;
import java.io.File;

/* renamed from: com.tt.miniapp.chooser.view.a */
public class C65839a extends Fragment {

    /* renamed from: a */
    ImageView f165925a;

    /* renamed from: b */
    private ImageView f165926b;

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo230572a(final MediaEntity mediaEntity) {
        if (mediaEntity.f170271d == 3) {
            String a = C67045l.m261302a(getContext(), mediaEntity.f170273f);
            if (a == null || !new File(a).exists() || getActivity() == null) {
                C65830d.m258002a(mediaEntity.f170268a, this.f165926b);
            } else {
                HostDependManager.getInst().loadImage(getActivity(), new C65678c(new File(a)).mo229918a().mo229920a(C67043j.m261275b(getActivity()), C67043j.m261267a(getActivity())).mo229922a(this.f165926b));
            }
            this.f165925a.setVisibility(0);
            this.f165925a.setOnClickListener(new View.OnClickListener() {
                /* class com.tt.miniapp.chooser.view.C65839a.View$OnClickListenerC658401 */

                public void onClick(View view) {
                    try {
                        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, (long) mediaEntity.f170273f);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(withAppendedId, "video/*");
                        C65839a.this.startActivity(intent);
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("PreviewFragment", "preview video error, e = " + e);
                    }
                }
            });
        } else if (getActivity() != null) {
            HostDependManager.getInst().loadImage(getActivity(), new C65678c(new File(mediaEntity.f170268a)).mo229918a().mo229920a(C67043j.m261275b(getActivity()), C67043j.m261267a(getActivity())).mo229922a(this.f165926b));
        }
    }

    /* renamed from: a */
    public static C65839a m258008a(MediaEntity mediaEntity, String str) {
        C65839a aVar = new C65839a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("media", mediaEntity);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f165925a = (ImageView) view.findViewById(R.id.microapp_m_play_view);
        this.f165926b = (ImageView) view.findViewById(R.id.microapp_m_photoview);
        this.f165925a.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        this.f165926b.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        ColorStateList colorStateList = UDColorUtils.getColorStateList(getContext(), R.color.fill_img_mask);
        this.f165925a.setImageTintList(colorStateList);
        this.f165926b.setImageTintList(colorStateList);
        mo230572a((MediaEntity) getArguments().getParcelable("media"));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.microapp_m_preview_fragment_item, viewGroup, false);
    }
}
