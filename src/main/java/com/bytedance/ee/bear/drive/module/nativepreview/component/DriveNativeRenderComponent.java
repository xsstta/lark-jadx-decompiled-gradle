package com.bytedance.ee.bear.drive.module.nativepreview.component;

import android.content.Context;
import android.graphics.Outline;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity;
import com.bytedance.ee.bear.drive.module.nativepreview.AbstractC7108b;
import com.bytedance.ee.bear.drive.module.nativepreview.C7100a;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2;
import com.bytedance.ee.bear.widgets.universedesign.SpaceLoadingImage;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class DriveNativeRenderComponent extends AbstractNativeComponent {
    private String containerTag = "";
    private AbstractC7108b fileBlockWrapper = new C7100a();
    private String fileToken;
    private WeakReference<AppCompatActivity> fragmentRef = new WeakReference<>(null);
    public FrameLayout root;
    private SpaceThirdPartyOpenEntity thirdPartyOpenEntity;

    public String getComponentViewType() {
        return "drive_file_block";
    }

    private AppCompatActivity getActivity() {
        WeakReference<AppCompatActivity> weakReference = this.fragmentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private String getKey() {
        return this.containerTag + this.fileToken;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onRemove() {
        C13479a.m54764b("DriveNativeRenderComponent", "onRemove " + this.containerTag);
        if (!TextUtils.isEmpty(this.fileToken)) {
            this.fileBlockWrapper.mo27742a(getKey(), false);
        }
    }

    private void handleBlockShow(boolean z) {
        C13479a.m54764b("DriveNativeRenderComponent", "performAction handle " + this.containerTag + "," + z);
        if (z) {
            this.root.setVisibility(0);
        } else {
            this.root.setVisibility(4);
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onUpdateView(View view, JSONObject jSONObject) {
        C13479a.m54772d("DriveNativeRenderComponent", "onUpdateView " + toString());
    }

    public void handleLoadingUi(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                break;
            } else if ("loading".equals(viewGroup.getChildAt(i).getTag())) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (!z2) {
            FrameLayout frameLayout = new FrameLayout(getActivity());
            frameLayout.setTag("loadingRoot");
            frameLayout.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.drive_bg_file_block_loading_bg));
            SpaceLoadingImage spaceLoadingImage = new SpaceLoadingImage(viewGroup.getContext());
            frameLayout.setTag("loading");
            frameLayout.addView(spaceLoadingImage);
            viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public View onCreateView(Context context, JSONObject jSONObject) {
        this.root = new FrameLayout(context);
        final int a = C57582a.m223600a(6);
        this.root.setOutlineProvider(new ViewOutlineProvider() {
            /* class com.bytedance.ee.bear.drive.module.nativepreview.component.DriveNativeRenderComponent.C71091 */

            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, DriveNativeRenderComponent.this.root.getWidth(), DriveNativeRenderComponent.this.root.getHeight(), (float) a);
            }
        });
        this.root.setClipToOutline(true);
        C13479a.m54764b("DriveNativeRenderComponent", "onCreateView " + this.containerTag);
        SpaceThirdPartyOpenEntity data = getData(jSONObject, "samerender");
        if (data != null) {
            this.thirdPartyOpenEntity = data;
        }
        return this.root;
    }

    private SpaceThirdPartyOpenEntity getData(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.containsKey("file-id")) {
                return null;
            }
            String string = jSONObject.getString("file-id");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity = new SpaceThirdPartyOpenEntity(jSONObject.getString("app-id"), string, jSONObject.getString("file-name"));
            this.thirdPartyOpenEntity = spaceThirdPartyOpenEntity;
            spaceThirdPartyOpenEntity.setApiExtra(jSONObject.getString("auth-extra"));
            this.thirdPartyOpenEntity.setMountPoint(jSONObject.getString("mount-point"));
            this.thirdPartyOpenEntity.setMountNodeToken(jSONObject.getString("mount-node-token"));
            this.thirdPartyOpenEntity.setPreviewFrom(jSONObject.getString("preview-from"));
            this.thirdPartyOpenEntity.setFileExt(jSONObject.getString("file-type"));
            this.thirdPartyOpenEntity.setInVc("1".equals(jSONObject.getString("in-vc")));
            this.thirdPartyOpenEntity.setPreviewType(3);
            ArrayList<BaseMoreMenuAction> arrayList = new ArrayList<>();
            arrayList.add(new SaveToLocalMenuV2());
            this.thirdPartyOpenEntity.setMoreMenuActions(arrayList);
            this.fileToken = this.thirdPartyOpenEntity.getFileId();
            C13479a.m54764b("DriveNativeRenderComponent", "really create " + this.containerTag + "，" + C13598b.m55197d(this.thirdPartyOpenEntity.getMountNodeToken()) + "," + str + "," + C13598b.m55197d(this.thirdPartyOpenEntity.getFileId()));
            return this.thirdPartyOpenEntity;
        } catch (Throwable th) {
            C13479a.m54761a("onCreateView", th);
            return null;
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void performAction(String str, JSONObject jSONObject) {
        C13479a.m54764b("DriveNativeRenderComponent", "performAction " + this.containerTag + "," + str);
        if ("performRender".equals(str)) {
            handleBlockShow(true);
            if (this.thirdPartyOpenEntity != null) {
                C13479a.m54772d("DriveNativeRenderComponent", "performAction MOVE_IN " + this.containerTag + "," + this.thirdPartyOpenEntity.getFileExt());
            } else {
                this.thirdPartyOpenEntity = getData(jSONObject, "PERFORM_RENDER");
            }
            this.fileBlockWrapper.mo27741a(getActivity(), this.root, this.thirdPartyOpenEntity, true, getKey());
        } else if ("performMoveOut".equals(str)) {
            if (this.thirdPartyOpenEntity != null) {
                C13479a.m54772d("DriveNativeRenderComponent", "performAction MOVE_OUT " + this.containerTag + "," + this.thirdPartyOpenEntity.getFileExt());
            }
            handleBlockShow(false);
            this.fileBlockWrapper.mo27742a(getKey(), true);
        } else if ("onCreateView".equals(str)) {
            try {
                SpaceThirdPartyOpenEntity spaceThirdPartyOpenEntity = this.thirdPartyOpenEntity;
                if (spaceThirdPartyOpenEntity == null) {
                    this.thirdPartyOpenEntity = getData(jSONObject, "perforam_action");
                }
                if (spaceThirdPartyOpenEntity != null) {
                    C13479a.m54772d("DriveNativeRenderComponent", "performAction ON_CREATE " + this.containerTag + "," + spaceThirdPartyOpenEntity.getFileExt());
                }
            } catch (Throwable th) {
                C13479a.m54761a("onCreateView", th);
            }
        } else if ("performPreload".equals(str)) {
            handleBlockShow(true);
            handleLoadingUi(this.root, true);
            if (this.thirdPartyOpenEntity == null) {
                this.thirdPartyOpenEntity = getData(jSONObject, "PERFORM_PRELOAD");
            }
        }
    }

    public DriveNativeRenderComponent(C12717a aVar, String str, String str2) {
        super(aVar, str, str2);
        this.fragmentRef = new WeakReference<>((AppCompatActivity) aVar.mo48166a());
        this.containerTag = str;
        C13479a.m54764b("DriveNativeRenderComponent", "DriveNativeRenderComponent init " + toString() + "," + this.containerTag);
    }
}
