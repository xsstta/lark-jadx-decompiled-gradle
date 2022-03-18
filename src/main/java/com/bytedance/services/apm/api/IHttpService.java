package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import java.io.File;
import java.util.List;
import java.util.Map;

public interface IHttpService extends IService {
    C20697b doGet(String str, Map<String, String> map) throws Exception;

    C20697b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception;

    C20697b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception;
}
