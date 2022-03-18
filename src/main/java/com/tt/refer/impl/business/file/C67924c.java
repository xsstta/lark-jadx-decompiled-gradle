package com.tt.refer.impl.business.file;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.infra.file.Stats;
import com.tt.refer.common.base.AbstractC67743a;
import com.tt.refer.impl.business.file.AbstractC67918a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.tt.refer.impl.business.file.c */
public class C67924c extends AbstractC67743a<AbstractC67722a.AbstractC67723a> implements AbstractC67722a {

    /* renamed from: a */
    private AbstractC67918a f171082a;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: a */
    public boolean mo235080a(File file) {
        return this.f171082a.mo235623e(file);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235605a(File file, TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235605a(file, gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public byte[] mo235607a(TTFile gVar, Long l, Long l2, Long l3, TTFileContext hVar) {
        return this.f171082a.mo235607a(gVar, l, l2, l3, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235606a(InputStream inputStream, TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235606a(inputStream, gVar, hVar);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: b */
    public File mo235081b() {
        return this.f171082a.mo235637j();
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: d */
    public File mo235087d() {
        return this.f171082a.mo235634i();
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: e */
    public File mo235090e() {
        return this.f171082a.mo235625f();
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: f */
    public File mo235093f() {
        return this.f171082a.mo235639k();
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: g */
    public File mo235095g() {
        return this.f171082a.mo235640l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AbstractC67722a.AbstractC67723a mo235129h() {
        return new AbstractC67722a.AbstractC67723a() {
            /* class com.tt.refer.impl.business.file.C67924c.C679251 */

            @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a.AbstractC67723a
            /* renamed from: a */
            public String mo235096a() {
                return ((AbstractC67724a) C67924c.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50471l();
            }
        };
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: a */
    public List<AbstractC67918a.C67921a> mo235078a() {
        return this.f171082a.mo235628g();
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: c */
    public File mo235085c() {
        return this.f171082a.mo235631h();
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: a */
    public File mo235076a(String str) {
        return new File(this.f171082a.mo235615c(str));
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: b */
    public String mo235082b(String str) {
        return this.f171082a.mo235615c(str);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: c */
    public AbstractC67918a.C67921a mo235084c(String str) {
        return this.f171082a.mo235597a(str);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: d */
    public String mo235088d(String str) {
        return this.f171082a.mo235609b(str);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: f */
    public boolean mo235094f(String str) {
        return this.f171082a.mo235624e(str);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: e */
    public boolean mo235091e(File file) {
        return this.f171082a.mo235636i(file);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: e */
    public boolean mo235092e(String str) {
        return this.f171082a.mo235621d(str);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: b */
    public boolean mo235083b(File file) {
        return this.f171082a.mo235627f(file);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: d */
    public boolean mo235089d(File file) {
        return this.f171082a.mo235638j(file);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: a */
    public boolean mo235079a(long j) {
        return this.f171082a.mo235601a(j);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: c */
    public boolean mo235086c(File file) {
        return this.f171082a.mo235630g(file);
    }

    public C67924c(IAppContext iAppContext, AbstractC67918a aVar) {
        super(iAppContext);
        this.f171082a = aVar;
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: c */
    public Stats mo235614c(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235614c(gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: i */
    public File mo235635i(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235635i(gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: e */
    public List<String> mo235622e(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235622e(gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: g */
    public boolean mo235629g(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235629g(gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: d */
    public boolean mo235620d(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235620d(gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public byte[] mo235613b(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235613b(gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235603a(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235603a(gVar, hVar);
    }

    @Override // com.tt.refer.p3400a.p3407e.AbstractC67722a
    /* renamed from: a */
    public String mo235077a(String str, String str2, StringBuilder sb) {
        return this.f171082a.mo235598a(str, str2, sb);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public boolean mo235610b(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235610b(gVar, gVar2, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: d */
    public void mo235619d(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        this.f171082a.mo235619d(gVar, gVar2, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public void mo235599a(ByteBuffer byteBuffer, TTFile gVar, TTFileContext hVar) throws TTFileException {
        this.f171082a.mo235599a(byteBuffer, gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public boolean mo235611b(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235611b(gVar, z, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: c */
    public void mo235616c(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        this.f171082a.mo235616c(gVar, gVar2, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public void mo235600a(byte[] bArr, TTFile gVar, TTFileContext hVar) throws TTFileException {
        this.f171082a.mo235600a(bArr, gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: c */
    public boolean mo235617c(TTFile gVar, boolean z, TTFileContext hVar) {
        return this.f171082a.mo235617c(gVar, z, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public boolean mo235612b(File file, TTFile gVar, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235612b(file, gVar, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235602a(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235602a(gVar, gVar2, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235604a(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException {
        return this.f171082a.mo235604a(gVar, z, hVar);
    }
}
