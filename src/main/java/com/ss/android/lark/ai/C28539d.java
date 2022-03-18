package com.ss.android.lark.ai;

import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.smartcompose.C28585c;
import com.ss.android.lark.ai.statistics.correction.CorrectionHitPoint;
import com.ss.android.lark.ai.textcorrection.TextCorrectionController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.d */
public class C28539d implements IComposeController {

    /* renamed from: a */
    private final List<IComposeController> f71688a;

    @Override // com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101539a() {
        for (IComposeController iComposeController : this.f71688a) {
            iComposeController.mo101539a();
        }
    }

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a, com.ss.android.lark.ai.IComposeController
    /* renamed from: b */
    public void mo101542b() {
        for (IComposeController iComposeController : this.f71688a) {
            iComposeController.mo101542b();
        }
    }

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a, com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101540a(int i) {
        for (IComposeController iComposeController : this.f71688a) {
            iComposeController.mo101540a(i);
        }
    }

    @Override // com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101541a(AbstractC28531b bVar) {
        for (IComposeController iComposeController : this.f71688a) {
            iComposeController.mo101541a(bVar);
        }
    }

    public C28539d(String str, IComposeController.ConvoType convoType, IComposeController.EditorType editorType) {
        ArrayList arrayList = new ArrayList();
        this.f71688a = arrayList;
        C28585c cVar = new C28585c(str, convoType, editorType);
        TextCorrectionController hVar = new TextCorrectionController(new CorrectionHitPoint());
        arrayList.add(cVar);
        arrayList.add(hVar);
    }
}
