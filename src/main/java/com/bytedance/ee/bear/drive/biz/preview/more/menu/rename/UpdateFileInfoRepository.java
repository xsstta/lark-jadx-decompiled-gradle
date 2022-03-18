package com.bytedance.ee.bear.drive.biz.preview.more.menu.rename;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.Serializable;

public class UpdateFileInfoRepository {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result> f18232a;

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository$b */
    public interface AbstractC6688b {
        /* renamed from: a */
        void mo26366a();

        /* renamed from: a */
        void mo26367a(int i);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository$a */
    private static class C6686a implements NetService.AbstractC5074c<NetService.Result> {
        private C6686a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result parse(String str) throws NetService.ParseException {
            return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result>() {
                /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository.C6686a.C66871 */
            }, new Feature[0]);
        }
    }

    public static class Params implements Serializable {
        public String file_token;
        public String mount_node_token;
        public String mount_point;
        public String name;

        public String toString() {
            return "Params{file_token='" + C13598b.m55197d(this.file_token) + '\'' + ", name='" + this.name + '\'' + ", mount_node_token='" + this.mount_node_token + '\'' + ", mount_point='" + this.mount_point + '\'' + '}';
        }
    }

    public UpdateFileInfoRepository(NetService netService) {
        this.f18232a = netService.mo20117a(new C6686a());
    }

    /* renamed from: a */
    public Disposable mo26368a(String str, String str2, String str3, final AbstractC6688b bVar) {
        final Params params = new Params();
        params.file_token = str;
        params.name = str2;
        NetService.C5077f fVar = new NetService.C5077f("/api/box/file/update_info/");
        fVar.mo20153c(JSON.toJSONString(params));
        if (!TextUtils.isEmpty(str3)) {
            fVar.mo20145a("mount_point", str3);
        }
        fVar.mo20143a(1);
        return this.f18232a.mo20141a(fVar).mo238001b(new Consumer<NetService.Result>() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository.C66841 */

            /* renamed from: a */
            public void accept(NetService.Result result) throws Exception {
                int code = result.getCode();
                if (code != 0) {
                    bVar.mo26367a(code);
                } else {
                    bVar.mo26366a();
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.menu.rename.UpdateFileInfoRepository.C66852 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                int i;
                C13479a.m54758a("DRIVE_UpdateFileInfoRepository", String.format("UpdateFileInfoRepository.update() error, msg: %s, params: ", th, params.toString()));
                if (th instanceof NetService.ServerErrorException) {
                    i = ((NetService.ServerErrorException) th).getCode();
                } else {
                    i = -1;
                }
                bVar.mo26367a(i);
            }
        });
    }
}
