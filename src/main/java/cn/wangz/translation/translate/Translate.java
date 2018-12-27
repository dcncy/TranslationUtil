package cn.wangz.translation.translate;

import cn.wangz.translation.bean.Message;

/**
 * Created by hadoop on 2018/12/27.
 */
public interface Translate {
    Message translate(String source, String sourceCode, String targetCode);
}
