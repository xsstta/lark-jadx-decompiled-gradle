package com.ss.android.openbusiness.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.openbusiness.OpbScene;

/* renamed from: com.ss.android.openbusiness.ui.b */
public class C59602b extends UDDialogController {

    /* renamed from: a */
    private final OpbScene f147924a;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View onCreateContent = super.onCreateContent();
        if (onCreateContent != null) {
            ImageView imageView = (ImageView) onCreateContent.findViewById(R.id.opb_guide_image_1);
            if (this.f147924a == OpbScene.MESSAGE_ACTION) {
                i = R.drawable.illustration_platform_empty_positive_message_action_1;
            } else {
                i = R.drawable.illustration_platform_empty_positive_message_action_2;
            }
            imageView.setBackgroundResource(i);
            if (this.f147924a == OpbScene.MESSAGE_ACTION) {
                i2 = R.string.Lark_OpenPlatform_ScOnboardingMsgDesc1;
            } else {
                i2 = R.string.Lark_OpenPlatform_InputScOnboardingMsg1;
            }
            if (this.f147924a == OpbScene.MESSAGE_ACTION) {
                i3 = R.string.Lark_OpenPlatform_ScOnboardingMsg2;
            } else {
                i3 = R.string.Lark_OpenPlatform_InputScOnboardingMsg2;
            }
            if (this.f147924a == OpbScene.MESSAGE_ACTION) {
                i4 = R.string.Lark_OpenPlatform_ScOnboardingMsgDesc3;
            } else {
                i4 = R.string.Lark_OpenPlatform_InputScOnboardingMsg3;
            }
            if (this.f147924a == OpbScene.MESSAGE_ACTION) {
                i5 = R.string.Lark_OpenPlatform_ScMblOnboardingMsgDesc4;
            } else {
                i5 = R.string.Lark_OpenPlatform_InputScOnboardingMsg4;
            }
            ((TextView) onCreateContent.findViewById(R.id.line1_title)).setText(i2);
            ((TextView) onCreateContent.findViewById(R.id.line1_des)).setText(i3);
            ((TextView) onCreateContent.findViewById(R.id.line2_title)).setText(i4);
            ((TextView) onCreateContent.findViewById(R.id.line2_des)).setText(i5);
        }
        return onCreateContent;
    }

    public C59602b(Context context, OpbScene opbScene) {
        super(context);
        this.f147924a = opbScene;
    }
}
